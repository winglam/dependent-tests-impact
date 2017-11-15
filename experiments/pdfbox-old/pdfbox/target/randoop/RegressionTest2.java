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
        org.apache.pdfbox.pdmodel.common.PDRange pDRange55 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray28);
        pDRange55.setMin((float) 10L);
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
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test002");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setWidth(0);
        java.lang.Object obj5 = pDExportFormatAttributeObject1.getTBorderStyle();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "None" + "'", obj5.equals("None"));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test003");
        java.lang.Class<?> cls0 = org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.PROTECTION_POLICY_CLASS;
        org.junit.Assert.assertNotNull(cls0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test004");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SCREEN;
        try {
            org.apache.pdfbox.pdmodel.common.function.PDFunction pDFunction1 = org.apache.pdfbox.pdmodel.common.function.PDFunction.create((org.apache.pdfbox.cos.COSBase) cOSName0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test005");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.XREF;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test006");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        float[] f_array13 = new float[] { 2, 4 };
        float[] f_array14 = pDDeviceGray8.toRGB(f_array13);
        org.apache.pdfbox.cos.COSBase cOSBase15 = pDDeviceGray8.getCOSObject();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(f_array13);
        org.junit.Assert.assertNotNull(f_array14);
        org.junit.Assert.assertNotNull(cOSBase15);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test007");
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
        org.apache.pdfbox.cos.COSStream cOSStream12 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction13 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream12);
        pDAppearanceDictionary9.setDownAppearance(pDAppearanceStream14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        pDAnnotationPopup16.setContents("GoTo");
        org.apache.pdfbox.cos.COSArray cOSArray19 = pDAnnotationPopup16.getBorder();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry20 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry((org.apache.pdfbox.cos.COSBase) cOSArray19);
        pDAppearanceDictionary9.setRolloverAppearance(pDAppearanceEntry20);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(pDAppearanceEntry11);
        org.junit.Assert.assertNull(pDAction13);
        org.junit.Assert.assertNotNull(cOSArray19);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test008");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        int i6 = pDGraphicsState5.getLineCap();
        org.apache.pdfbox.pdmodel.graphics.blend.BlendMode blendMode7 = null;
        pDGraphicsState5.setBlendMode(blendMode7);
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace9 = pDGraphicsState5.getNonStrokingColorSpace();
        boolean b10 = pDGraphicsState5.isNonStrokingOverprint();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(pDColorSpace9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test009");
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
        org.apache.pdfbox.pdmodel.common.PDRange pDRange17 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray15);
        try {
            cOSArray15.setName(9472, "Lbl");
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test010");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference8 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference(cOSDictionary3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = fDFNamedPageReference8.getCOSObject();
        cOSDictionary9.setEmbeddedInt("XML-1.00", "Before", 40);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary9);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test011");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties pDVisibleSigProperties0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigProperties();
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test012");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName5 = cOSDictionary3.getCOSName(cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSName5);
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test013");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        try {
            org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState3 = pDFTextStripper0.getGraphicsState();
            org.junit.Assert.fail("Expected exception of type java.util.EmptyStackException");
        } catch (java.util.EmptyStackException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test014");
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
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline pDDocumentOutline21 = null;
        pDDocumentCatalog20.setDocumentOutline(pDDocumentOutline21);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm23 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox24 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm23);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = pDCheckBox24.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo26 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary25);
        pDDocumentCatalog20.setMarkInfo(pDMarkInfo26);
        boolean b28 = pDMarkInfo26.usesUserProperties();
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(cOSDictionary25);
        org.junit.Assert.assertTrue(b28 == false);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test015");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess4 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess(cOSDictionary2);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp fDFAnnotationStamp5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test016");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup pDAnnotationMarkup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup();
        java.lang.String str1 = pDAnnotationMarkup0.getIntent();
        java.lang.String str2 = pDAnnotationMarkup0.getSubtype();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test017");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm2 = pDCheckBox1.getAcroForm();
        try {
            pDCheckBox1.setValue("H1");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDAcroForm2);
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test018");
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDTextState();
        boolean b1 = pDTextState0.getKnockoutFlag();
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState2 = pDTextState0.clone();
        pDTextState2.setRise((float) 7);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(pDTextState2);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test019");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton1 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm0);
        pDRadioButton1.setPushButton(false);
        pDRadioButton1.setNoExport(false);
        pDRadioButton1.setRequired(true);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test020");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING_90MS_RKSJ_H;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test021");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        java.lang.String str2 = pDFTextStripper0.getArticleStart();
        pDFTextStripper0.setSortByPosition(false);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test022");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        try {
            pDAppearanceContentStream5.newLineAtOffset(2.0f, (float) (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test023");
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
        org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification pDFileSpecification37 = pDActionLaunch33.getFile();
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
        org.junit.Assert.assertNull(pDFileSpecification37);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test024");
        org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab0 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab();
        java.awt.image.WritableRaster writableRaster1 = null;
        try {
            java.awt.image.BufferedImage bufferedImage2 = pDLab0.toRGBImage(writableRaster1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test025");
        org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern pDShadingPattern0 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern();
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState1 = null;
        pDShadingPattern0.setExtendedGraphicsState(pDExtendedGraphicsState1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDShadingPattern0.getCOSObject();
        pDShadingPattern0.setPaintType(6);
        org.junit.Assert.assertNotNull(cOSDictionary3);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test026");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        pDExportFormatAttributeObject1.setLineHeightAuto();
        java.lang.String str4 = pDExportFormatAttributeObject1.getTextAlign();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = pDExportFormatAttributeObject1.getBBox();
        pDExportFormatAttributeObject1.setTextDecorationThickness(100.0f);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours8 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours();
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours8);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Start" + "'", str4.equals("Start"));
        org.junit.Assert.assertNull(pDRectangle5);
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test027");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject();
        boolean b2 = pDTableAttributeObject0.isSpecified("RlTb");
        java.lang.String[] str_array4 = new java.lang.String[] { "Index" };
        pDTableAttributeObject0.setHeaders(str_array4);
        pDTableAttributeObject0.setSummary("Viewport");
        int i8 = pDTableAttributeObject0.getColSpan();
        int i9 = pDTableAttributeObject0.getRowSpan();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(i8 == 1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test028");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences8 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary3);
        pDViewerPreferences8.setDisplayDocTitle(false);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION rEADING_DIRECTION11 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.L2R;
        pDViewerPreferences8.setReadingDirection(rEADING_DIRECTION11);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue("'" + rEADING_DIRECTION11 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.L2R + "'", rEADING_DIRECTION11.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.L2R));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test029");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX dUPLEX0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipLongEdge;
        org.junit.Assert.assertTrue("'" + dUPLEX0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipLongEdge + "'", dUPLEX0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.DUPLEX.DuplexFlipLongEdge));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test030");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption6 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary2);
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor8 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix15 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray16 = matrix15.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix17 = matrix15.extractScaling();
        pDFMarkedContentExtractor8.setTextMatrix(matrix15);
        matrix15.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix22 = matrix15.clone();
        java.awt.Paint paint23 = pDShadingType7_7.toPaint(matrix15);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
        org.junit.Assert.assertNotNull(cOSArray16);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(matrix22);
        org.junit.Assert.assertNotNull(paint23);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test031");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionThread pDActionThread0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionThread();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test032");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationFreeText0.setCallout(f_array7);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText13 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array20 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray22 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i23 = pDDeviceGray22.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor24 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array20, cOSName21, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray22);
        fDFAnnotationFreeText13.setCallout(f_array20);
        java.lang.String str26 = fDFAnnotationFreeText13.getLineEndingStyle();
        float[] f_array27 = fDFAnnotationFreeText13.getCallout();
        fDFAnnotationFreeText0.setCallout(f_array27);
        fDFAnnotationFreeText0.setDefaultAppearance("[0.0,0.0,100.0,792.0]");
        fDFAnnotationFreeText0.setDefaultAppearance("BlockQuote");
        boolean b33 = fDFAnnotationFreeText0.isInvisible();
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(f_array20);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertNotNull(pDDeviceGray22);
        org.junit.Assert.assertTrue(i23 == 1);
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(f_array27);
        org.junit.Assert.assertTrue(b33 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test033");
        org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceCMYKColor setStrokingDeviceCMYKColor0 = new org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceCMYKColor();
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test034");
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
        org.apache.pdfbox.printing.Scaling scaling18 = null;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable19 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument17, scaling18);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm20 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox21 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm20);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDCheckBox21.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary22);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink24 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary23);
        org.apache.pdfbox.io.ScratchFile scratchFile25 = null;
        org.apache.pdfbox.cos.COSStream cOSStream26 = new org.apache.pdfbox.cos.COSStream(scratchFile25);
        cOSDictionary23.mergeInto((org.apache.pdfbox.cos.COSDictionary) cOSStream26);
        java.io.InputStream inputStream28 = cOSStream26.createRawInputStream();
        try {
            org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font29 = org.apache.pdfbox.pdmodel.font.PDType0Font.load(pDDocument17, inputStream28);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNotNull(inputStream28);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test035");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_FAMILY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test036");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources8 = pDPage6.getResources();
        int i9 = pDPageTree0.indexOf(pDPage6);
        int i10 = pDPageTree0.getCount();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup11 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar12 = null;
        pDAnnotationPopup11.setModifiedDate(calendar12);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle14 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup11.setRectangle(pDRectangle14);
        org.apache.pdfbox.pdmodel.PDPage pDPage16 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle14);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead[] pDThreadBead_array17 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead> arraylist_pDThreadBead18 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead>) arraylist_pDThreadBead18, pDThreadBead_array17);
        pDPage16.setThreadBeads((java.util.List<org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDThreadBead>) arraylist_pDThreadBead18);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm21 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox22 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm21);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = pDCheckBox22.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo24 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary23);
        cOSDictionary23.setInt("JavaScript", 10);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo28 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary23);
        org.apache.pdfbox.pdmodel.PDPage pDPage29 = new org.apache.pdfbox.pdmodel.PDPage(cOSDictionary23);
        try {
            pDPageTree0.insertAfter(pDPage16, pDPage29);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNull(pDResources8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertTrue(i10 == 0);
        org.junit.Assert.assertNotNull(pDRectangle14);
        org.junit.Assert.assertNotNull(pDThreadBead_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNotNull(cOSDictionary23);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test037");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary0);
        java.lang.String str2 = pDArtifactMarkedContent1.getTag();
        org.apache.pdfbox.text.TextPosition textPosition3 = null;
        pDArtifactMarkedContent1.addText(textPosition3);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Artifact" + "'", str2.equals("Artifact"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test038");
        org.apache.pdfbox.pdmodel.PDResources pDResources0 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN1 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        org.apache.pdfbox.pdmodel.graphics.color.PDPattern pDPattern2 = new org.apache.pdfbox.pdmodel.graphics.color.PDPattern(pDResources0, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN1);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor3 = pDPattern2.getInitialColor();
        org.junit.Assert.assertNotNull(pDColor3);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test039");
        int i0 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.SHADING_TYPE1;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test040");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission1 = new org.apache.pdfbox.pdmodel.encryption.AccessPermission((int) (byte) 100);
        boolean b2 = accessPermission1.canExtractContent();
        boolean b3 = accessPermission1.canPrintDegraded();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test041");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler pDCircleAppearanceHandler5 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine4);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm6 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox7 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm6);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDCheckBox7.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary8);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine10 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary9);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine11 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary9);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent12 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary9);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary(cOSDictionary9);
        java.lang.String str14 = pDExternalDataDictionary13.getType();
        java.lang.String str15 = pDExternalDataDictionary13.getType();
        pDAnnotationLine4.setExternalData(pDExternalDataDictionary13);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "Annot" + "'", str14.equals("Annot"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Annot" + "'", str15.equals("Annot"));
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test042");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VIEW_AREA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test043");
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode();
        java.lang.String str1 = pDJavascriptNameTreeNode0.getLowerLimit();
        java.lang.String str2 = pDJavascriptNameTreeNode0.getUpperLimit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test044");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MCR" + "'", str0.equals("MCR"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test045");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm3 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox4 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDCheckBox4.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary6);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding8 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary6);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline9 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary6);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_10 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary6);
        org.apache.pdfbox.util.Matrix matrix17 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray18 = matrix17.toCOSArray();
        pDShadingType3_10.setDomain(cOSArray18);
        org.apache.pdfbox.cos.COSDocument cOSDocument20 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey21 = null;
        org.apache.pdfbox.cos.COSObject cOSObject22 = cOSDocument20.getObjectFromPool(cOSObjectKey21);
        cOSArray18.add((org.apache.pdfbox.cos.COSBase) cOSDocument20);
        try {
            pDFTextStripper0.setLineDashPattern(cOSArray18, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSArray18);
        org.junit.Assert.assertNotNull(cOSObject22);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test046");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.FILTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Standard" + "'", str0.equals("Standard"));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test047");
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
        org.apache.pdfbox.pdmodel.graphics.color.PDICCBased pDICCBased28 = new org.apache.pdfbox.pdmodel.graphics.color.PDICCBased(pDDocument17);
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead29 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream30 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead29);
        boolean b31 = randomAccessInputStream30.markSupported();
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject32 = org.apache.pdfbox.pdmodel.graphics.image.JPEGFactory.createFromStream(pDDocument17, (java.io.InputStream) randomAccessInputStream30);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSDictionary20);
        org.junit.Assert.assertNotNull(cOSName22);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase26);
        org.junit.Assert.assertTrue(b31 == false);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test048");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        java.lang.String[] str_array5 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase6 = cOSDictionary2.getDictionaryObject(str_array5);
        java.util.Calendar calendar8 = cOSDictionary2.getDate("180");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp pDAnnotationRubberStamp9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream10 = pDAnnotationRubberStamp9.getNormalAppearanceStream();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(pDAppearanceStream10);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test049");
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
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test050");
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
        pDAppearanceContentStream5.setNonStrokingColor((int) (short) 100);
        org.apache.pdfbox.cos.COSDocument cOSDocument14 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey15 = null;
        org.apache.pdfbox.cos.COSObject cOSObject16 = cOSDocument14.getObjectFromPool(cOSObjectKey15);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject18 = cOSDocument14.getObjectByType(cOSName17);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm19 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox20 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm19);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDCheckBox20.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary21);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary22);
        long long25 = cOSDictionary22.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed26 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary22);
        java.lang.String str29 = cOSDictionary22.getEmbeddedString("sc", "After");
        cOSDocument14.setTrailer(cOSDictionary22);
        org.apache.pdfbox.cos.COSName cOSName32 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary22.setEmbeddedInt("Index", cOSName32, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.BASE_ENCODING;
        cOSDictionary22.setBoolean(cOSName35, false);
        cOSDictionary22.setNeedToBeUpdated(false);
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer40 = new org.apache.pdfbox.io.RandomAccessBuffer();
        boolean b41 = randomAccessBuffer40.isClosed();
        byte[] byte_array42 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        int i45 = randomAccessBuffer40.read(byte_array42, (int) '4', (int) ' ');
        java.lang.String str46 = org.apache.pdfbox.util.Hex.getString(byte_array42);
        org.apache.pdfbox.pdmodel.PDResources pDResources47 = null;
        org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage pDInlineImage48 = new org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage(cOSDictionary22, byte_array42, pDResources47);
        try {
            pDAppearanceContentStream5.drawImage(pDInlineImage48, (float) 2, (float) (byte) -1, 500.0f, (float) 10L);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(stack_pDColorSpace11);
        org.junit.Assert.assertNotNull(cOSObject16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNull(cOSObject18);
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertTrue(long25 == (-1L));
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(cOSName32);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNotNull(byte_array42);
        org.junit.Assert.assertTrue(i45 == 0);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "656E6473747265616D" + "'", str46.equals("656E6473747265616D"));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test051");
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting0 = new org.apache.pdfbox.pdmodel.graphics.PDFontSetting();
        org.apache.pdfbox.cos.COSBase cOSBase1 = pDFontSetting0.getCOSObject();
        org.junit.Assert.assertNotNull(cOSBase1);
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test052");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        java.lang.String str10 = cOSDictionary3.getEmbeddedString("sc", "After");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm pDActionResetForm11 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.XREF_STM;
        java.util.Calendar calendar13 = null;
        java.util.Calendar calendar14 = cOSDictionary3.getDate(cOSName12, calendar13);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNull(calendar14);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test053");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationFreeText0.setCallout(f_array7);
        java.lang.String str13 = fDFAnnotationFreeText0.getLineEndingStyle();
        java.lang.String str14 = fDFAnnotationFreeText0.getDefaultAppearance();
        fDFAnnotationFreeText0.setDefaultStyle("Artifact");
        java.lang.String str17 = fDFAnnotationFreeText0.getDefaultStyle();
        fDFAnnotationFreeText0.setDate("H5");
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Artifact" + "'", str17.equals("Artifact"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test054");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk();
        fDFAnnotationInk0.setContents("656E6473747265616D");
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test055");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.io.ScratchFile scratchFile5 = null;
        org.apache.pdfbox.cos.COSStream cOSStream6 = new org.apache.pdfbox.cos.COSStream(scratchFile5);
        cOSDictionary3.mergeInto((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        org.apache.pdfbox.cos.COSName cOSName9 = cOSDictionary3.getCOSName(cOSName8);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNull(cOSName9);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test056");
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDTextState();
        boolean b1 = pDTextState0.getKnockoutFlag();
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState2 = pDTextState0.clone();
        pDTextState0.setFontSize(0.0f);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(pDTextState2);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test057");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = fDFAnnotationCaret0.getFringe();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = fDFAnnotationCaret0.getFringe();
        org.junit.Assert.assertNull(pDRectangle1);
        org.junit.Assert.assertNull(pDRectangle2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test058");
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
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitRectangleDestination pDPageFitRectangleDestination57 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitRectangleDestination(cOSArray28);
        pDPageFitRectangleDestination57.setTop(10);
        pDPageFitRectangleDestination57.setBottom((int) (byte) 100);
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
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test059");
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
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline pDDocumentOutline21 = null;
        pDDocumentCatalog20.setDocumentOutline(pDDocumentOutline21);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument23 = null;
        org.apache.pdfbox.util.Matrix matrix30 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray31 = matrix30.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix32 = matrix30.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm33 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox34 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm33);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary35 = pDCheckBox34.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary36 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary35);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine37 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary36);
        long long39 = cOSDictionary36.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed40 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary36);
        boolean b41 = matrix30.equals((java.lang.Object) cOSDictionary36);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp42 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary36);
        org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog43 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument23, cOSDictionary36);
        org.apache.pdfbox.pdmodel.common.PDDestinationOrAction pDDestinationOrAction44 = pDDocumentCatalog43.getOpenAction();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary45 = pDDocumentCatalog43.getCOSObject();
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata46 = pDDocumentCatalog43.getMetadata();
        org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent[] pDOutputIntent_array47 = new org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent> arraylist_pDOutputIntent48 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>();
        boolean b49 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>) arraylist_pDOutputIntent48, pDOutputIntent_array47);
        pDDocumentCatalog43.setOutputIntents((java.util.List<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>) arraylist_pDOutputIntent48);
        pDDocumentCatalog20.setOutputIntents((java.util.List<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>) arraylist_pDOutputIntent48);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(cOSArray31);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(cOSDictionary35);
        org.junit.Assert.assertTrue(long39 == (-1L));
        org.junit.Assert.assertTrue(b41 == false);
        org.junit.Assert.assertNull(pDDestinationOrAction44);
        org.junit.Assert.assertNotNull(cOSDictionary45);
        org.junit.Assert.assertNull(pDMetadata46);
        org.junit.Assert.assertNotNull(pDOutputIntent_array47);
        org.junit.Assert.assertTrue(b49 == false);
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test060");
        org.apache.pdfbox.util.Vector vector2 = new org.apache.pdfbox.util.Vector((float) (short) 100, (float) (byte) 0);
        org.apache.pdfbox.util.Vector vector4 = vector2.scale((float) (byte) 10);
        org.junit.Assert.assertNotNull(vector4);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test061");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        int i6 = pDGraphicsState5.getLineCap();
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN7 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        java.lang.String str8 = pDDeviceN7.getName();
        pDGraphicsState5.setNonStrokingColorSpace((org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN7);
        java.awt.geom.Area area10 = null;
        try {
            pDGraphicsState5.intersectClippingPath(area10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "DeviceN" + "'", str8.equals("DeviceN"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test062");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LANG;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test063");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CH;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test064");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        pDPageFitWidthDestination0.setTop((int) (short) 100);
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDPageFitWidthDestination0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound4 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f5 = pDActionSound4.getVolume();
        cOSArray3.add((org.apache.pdfbox.pdmodel.common.COSObjectable) pDActionSound4);
        try {
            cOSArray3.setInt((int) ' ', 25966);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertTrue(f5 == 1.0f);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test065");
        org.apache.pdfbox.contentstream.operator.text.SetTextRenderingMode setTextRenderingMode0 = new org.apache.pdfbox.contentstream.operator.text.SetTextRenderingMode();
        java.lang.String str1 = setTextRenderingMode0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Tr" + "'", str1.equals("Tr"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test066");
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
        org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent[] pDOutputIntent_array24 = new org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent> arraylist_pDOutputIntent25 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>) arraylist_pDOutputIntent25, pDOutputIntent_array24);
        pDDocumentCatalog20.setOutputIntents((java.util.List<org.apache.pdfbox.pdmodel.graphics.color.PDOutputIntent>) arraylist_pDOutputIntent25);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureTreeRoot pDStructureTreeRoot28 = pDDocumentCatalog20.getStructureTreeRoot();
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertTrue(long16 == (-1L));
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNull(pDDestinationOrAction21);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNull(pDMetadata23);
        org.junit.Assert.assertNotNull(pDOutputIntent_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNull(pDStructureTreeRoot28);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test067");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream2 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream0);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit3 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        java.lang.String str4 = cOSStream0.getString();
        long long5 = cOSStream0.getLength();
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue(long5 == 0L);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test068");
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
            org.apache.pdfbox.pdmodel.graphics.color.PDIndexed pDIndexed87 = new org.apache.pdfbox.pdmodel.graphics.color.PDIndexed(cOSArray15);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
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
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test069");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources8 = pDPage6.getResources();
        int i9 = pDPageTree0.indexOf(pDPage6);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle10 = pDPage6.getArtBox();
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache11 = pDPage6.getResourceCache();
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNull(pDResources8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(pDRectangle10);
        org.junit.Assert.assertNull(resourceCache11);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test070");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test071");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        cOSDictionary2.clear();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget6 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test072");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSNumber.ONE;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary3);
        boolean b5 = cOSInteger0.equals((java.lang.Object) pDAnnotationTextMarkup4);
        pDAnnotationTextMarkup4.setRichContents("LowerRoman");
        org.junit.Assert.assertNotNull(cOSInteger0);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test073");
        org.apache.pdfbox.rendering.ImageType imageType0 = org.apache.pdfbox.rendering.ImageType.BINARY;
        org.junit.Assert.assertNotNull(imageType0);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test074");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A5;
        pDRectangle0.setLowerLeftX((float) 100);
        org.apache.pdfbox.pdmodel.PDPage pDPage3 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle0);
        org.junit.Assert.assertNotNull(pDRectangle0);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test075");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        pDExportFormatAttributeObject1.setLineHeightAuto();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours4 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours4);
        pDExportFormatAttributeObject1.setWidthAuto();
        boolean b7 = pDExportFormatAttributeObject1.isEmpty();
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma8 = pDExportFormatAttributeObject1.getColor();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(pDGamma8);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test076");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight8 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo9 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test077");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD_OBLIQUE;
        java.lang.String str1 = pDType1Font0.getType();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Font" + "'", str1.equals("Font"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test078");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AVG_WIDTH;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test079");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test080");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        float f6 = fDFAnnotationLine5.getLeaderOffset();
        fDFAnnotationLine5.setCaptionStyle("Justify");
        fDFAnnotationLine5.setLeaderOffset((float) 10L);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test081");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler pDCircleAppearanceHandler5 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine4);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary6 = pDAnnotationLine4.getBorderStyle();
        boolean b7 = pDAnnotationLine4.isHidden();
        pDAnnotationLine4.setCaption(false);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDBorderStyleDictionary6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test082");
        org.apache.pdfbox.pdmodel.font.encoding.SymbolEncoding symbolEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.SymbolEncoding();
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test083");
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary0 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary();
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test084");
        org.apache.pdfbox.contentstream.operator.text.MoveText moveText0 = new org.apache.pdfbox.contentstream.operator.text.MoveText();
        org.apache.pdfbox.contentstream.operator.Operator operator2 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("L");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        org.apache.pdfbox.cos.COSArray cOSArray4 = pDPageFitWidthDestination3.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm6 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox7 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm6);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDCheckBox7.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary8);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine10 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary9);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding11 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary9);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline12 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary9);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_13 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary9);
        org.apache.pdfbox.util.Matrix matrix20 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray21 = matrix20.toCOSArray();
        pDShadingType3_13.setDomain(cOSArray21);
        java.lang.String str24 = cOSArray21.getString(1);
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject25 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator26 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm27 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox28 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm27);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary29 = pDCheckBox28.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup30 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary29);
        java.lang.String[] str_array32 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase33 = cOSDictionary29.getDictionaryObject(str_array32);
        java.util.Calendar calendar35 = cOSDictionary29.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName37 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i38 = cOSDictionary29.getInt(cOSName36, cOSName37);
        org.apache.pdfbox.cos.COSName cOSName39 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm40 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox41 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm40);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary42 = pDCheckBox41.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary43 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary42);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie44 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary42);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo45 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary42);
        org.apache.pdfbox.cos.COSName cOSName46 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName47 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm48 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox49 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm48);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary50 = pDCheckBox49.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo51 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary50);
        cOSDictionary50.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName55 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName56 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm57 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox58 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm57);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary59 = pDCheckBox58.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary60 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary59);
        org.apache.pdfbox.cos.COSDocument cOSDocument61 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey62 = null;
        org.apache.pdfbox.cos.COSObject cOSObject63 = cOSDocument61.getObjectFromPool(cOSObjectKey62);
        org.apache.pdfbox.cos.COSName cOSName64 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject65 = cOSDocument61.getObjectByType(cOSName64);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm66 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox67 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm66);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary68 = pDCheckBox67.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary69 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary68);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine70 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary69);
        long long72 = cOSDictionary69.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed73 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary69);
        java.lang.String str76 = cOSDictionary69.getEmbeddedString("sc", "After");
        cOSDocument61.setTrailer(cOSDictionary69);
        org.apache.pdfbox.cos.COSName cOSName79 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary69.setEmbeddedInt("Index", cOSName79, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName82 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm83 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox84 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm83);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary85 = pDCheckBox84.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject86 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary85);
        org.apache.pdfbox.cos.COSName cOSName87 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array88 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary29, cOSName39, cOSDictionary42, cOSName46, cOSName47, cOSDictionary50, cOSName55, cOSName56, cOSDictionary60, cOSDictionary69, cOSName82, cOSDictionary85, cOSName87 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase89 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase89, cOSBase_array88);
        drawObject25.process(operator26, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase89);
        cOSArray21.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase89);
        cOSArray4.addAll(1, (java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase89);
        try {
            moveText0.process(operator2, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase89);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(operator2);
        org.junit.Assert.assertNotNull(cOSArray4);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSArray21);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(cOSDictionary29);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertNull(cOSBase33);
        org.junit.Assert.assertNull(calendar35);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(cOSName37);
        org.junit.Assert.assertTrue(i38 == (-1));
        org.junit.Assert.assertNotNull(cOSName39);
        org.junit.Assert.assertNotNull(cOSDictionary42);
        org.junit.Assert.assertNotNull(cOSName46);
        org.junit.Assert.assertNotNull(cOSName47);
        org.junit.Assert.assertNotNull(cOSDictionary50);
        org.junit.Assert.assertNotNull(cOSName55);
        org.junit.Assert.assertNotNull(cOSName56);
        org.junit.Assert.assertNotNull(cOSDictionary59);
        org.junit.Assert.assertNotNull(cOSObject63);
        org.junit.Assert.assertNotNull(cOSName64);
        org.junit.Assert.assertNull(cOSObject65);
        org.junit.Assert.assertNotNull(cOSDictionary68);
        org.junit.Assert.assertTrue(long72 == (-1L));
        org.junit.Assert.assertNull(str76);
        org.junit.Assert.assertNotNull(cOSName79);
        org.junit.Assert.assertNotNull(cOSName82);
        org.junit.Assert.assertNotNull(cOSDictionary85);
        org.junit.Assert.assertNotNull(cOSName87);
        org.junit.Assert.assertNotNull(cOSBase_array88);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test085");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp();
        java.lang.String str1 = pDSeedValueTimeStamp0.getURL();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test086");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ASCII_HEX_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test087");
        org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions pDDocumentCatalogAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary4);
        long long7 = cOSDictionary4.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed8 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary4);
        pDDocumentCatalogAdditionalActions0.setWC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionNamed8);
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions10 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound11 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound11.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions10.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound11);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound15 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f16 = pDActionSound15.getVolume();
        pDFormFieldAdditionalActions10.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound15);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction18 = pDFormFieldAdditionalActions10.getC();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction19 = pDFormFieldAdditionalActions10.getK();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm20 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox21 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm20);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDCheckBox21.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup23 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary22);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo24 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary22);
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification25 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification();
        pDActionRemoteGoTo24.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification25);
        pDFormFieldAdditionalActions10.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionRemoteGoTo24);
        pDActionRemoteGoTo24.setOpenInNewWindow(true);
        pDDocumentCatalogAdditionalActions0.setWS((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionRemoteGoTo24);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(long7 == (-1L));
        org.junit.Assert.assertTrue(f16 == 1.0f);
        org.junit.Assert.assertNotNull(pDAction18);
        org.junit.Assert.assertNull(pDAction19);
        org.junit.Assert.assertNotNull(cOSDictionary22);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test088");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation4 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary3);
        java.lang.String str5 = pDDocumentInformation4.getAuthor();
        pDDocumentInformation4.setSubject("TD");
        java.lang.String str8 = pDDocumentInformation4.getSubject();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "TD" + "'", str8.equals("TD"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test089");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R;
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition1 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(pDTransitionStyle0);
        float f2 = pDTransition1.getDuration();
        float f3 = pDTransition1.getFlyScale();
        java.lang.String str4 = pDTransition1.getStyle();
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R));
        org.junit.Assert.assertTrue(f2 == 1.0f);
        org.junit.Assert.assertTrue(f3 == 1.0f);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "R" + "'", str4.equals("R"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test090");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test091");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_DOTTED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Dotted" + "'", str0.equals("Dotted"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test092");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        pDFMarkedContentExtractor0.setTextMatrix(matrix7);
        org.apache.pdfbox.cos.COSName cOSName11 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm12 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox13 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm12);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDCheckBox13.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary15);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline17 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary15);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight18 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary15);
        org.apache.pdfbox.cos.COSName cOSName20 = org.apache.pdfbox.cos.COSName.HARD_LIGHT;
        cOSDictionary15.setItem("", (org.apache.pdfbox.cos.COSBase) cOSName20);
        pDFMarkedContentExtractor0.beginMarkedContentSequence(cOSName11, cOSDictionary15);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript pDActionJavaScript23 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript(cOSDictionary15);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare24 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSName20);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test093");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OCG;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test094");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream2 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream0);
        org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification pDFileSpecification3 = org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification.createFS((org.apache.pdfbox.cos.COSBase) cOSStream0);
        org.junit.Assert.assertNotNull(pDFileSpecification3);
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test095");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.N;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test096");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation4 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary3);
        java.lang.String str5 = pDDocumentInformation4.getAuthor();
        pDDocumentInformation4.setSubject("TD");
        java.lang.String str8 = pDDocumentInformation4.getProducer();
        pDDocumentInformation4.setAuthor("Art");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test097");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        java.util.Spliterator<org.apache.pdfbox.cos.COSBase> spliterator_cOSBase8 = cOSArray7.spliterator();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination9 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination(cOSArray7);
        int i10 = pDPageXYZDestination9.getTop();
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(spliterator_cOSBase8);
        org.junit.Assert.assertTrue(i10 == 0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test098");
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams0 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams();
        java.lang.String str1 = pDWindowsLaunchParams0.getFilename();
        pDWindowsLaunchParams0.setFilename("PushPin");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test099");
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
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm19 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox20 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm19);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDCheckBox20.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary21);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie23 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary21);
        pDDocumentCatalogAdditionalActions0.setWS((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionMovie23);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction25 = pDDocumentCatalogAdditionalActions0.getDP();
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(long7 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNull(cOSBase16);
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNull(pDAction25);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test100");
        org.apache.pdfbox.util.Vector vector2 = new org.apache.pdfbox.util.Vector(100.0f, (float) (-1L));
        float f3 = vector2.getY();
        float f4 = vector2.getX();
        org.junit.Assert.assertTrue(f3 == (-1.0f));
        org.junit.Assert.assertTrue(f4 == 100.0f);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test101");
        org.apache.pdfbox.filter.JPXFilter jPXFilter0 = new org.apache.pdfbox.filter.JPXFilter();
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test102");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test103");
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
        fDFAnnotationLine5.setPage((int) '4');
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "None" + "'", str9.equals("None"));
        org.junit.Assert.assertNull(color10);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test104");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        pDVisibleSigBuilder0.createInnerFormResource();
        byte[] byte_array2 = org.apache.pdfbox.pdfwriter.COSWriter.STREAM;
        pDVisibleSigBuilder0.createFormatterRectangle(byte_array2);
        org.apache.pdfbox.cos.COSDocument cOSDocument4 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey5 = null;
        org.apache.pdfbox.cos.COSObject cOSObject6 = cOSDocument4.getObjectFromPool(cOSObjectKey5);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject8 = cOSDocument4.getObjectByType(cOSName7);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm9 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox10 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm9);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDCheckBox10.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary11);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary12);
        long long15 = cOSDictionary12.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed16 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary12);
        java.lang.String str19 = cOSDictionary12.getEmbeddedString("sc", "After");
        cOSDocument4.setTrailer(cOSDictionary12);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument21 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument4);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm22 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox23 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm22);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary24 = pDCheckBox23.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary24);
        org.apache.pdfbox.cos.COSName cOSName26 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary25.removeItem(cOSName26);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font28 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_29 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary25, pDType0Font28);
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase30 = cOSDictionary25.entrySet();
        org.apache.pdfbox.pdmodel.common.PDPageLabels pDPageLabels31 = new org.apache.pdfbox.pdmodel.common.PDPageLabels(pDDocument21, cOSDictionary25);
        org.apache.pdfbox.pdmodel.graphics.color.PDICCBased pDICCBased32 = new org.apache.pdfbox.pdmodel.graphics.color.PDICCBased(pDDocument21);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache33 = pDDocument21.getResourceCache();
        java.awt.image.BufferedImage bufferedImage34 = null;
        try {
            pDVisibleSigBuilder0.createSignatureImage(pDDocument21, bufferedImage34);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(cOSObject6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(cOSObject8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertNotNull(cOSDictionary24);
        org.junit.Assert.assertNotNull(cOSName26);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase30);
        org.junit.Assert.assertNotNull(resourceCache33);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test105");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption6 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary2);
        java.lang.String str7 = pDEncryption6.getFilter();
        org.apache.pdfbox.cos.COSName cOSName8 = pDEncryption6.getStringFilterName();
        pDEncryption6.setRevision(5);
        try {
            org.apache.pdfbox.pdmodel.encryption.SecurityHandler securityHandler11 = pDEncryption6.getSecurityHandler();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertNotNull(cOSName8);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test106");
        org.apache.pdfbox.contentstream.operator.graphics.LineTo lineTo0 = new org.apache.pdfbox.contentstream.operator.graphics.LineTo();
        java.lang.String str1 = lineTo0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "l" + "'", str1.equals("l"));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test107");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm3 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox4 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDCheckBox4.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary6);
        pDFTextStripper0.showAnnotation((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine7);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary9 = pDAnnotationLine7.getBorderStyle();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNull(pDBorderStyleDictionary9);
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test108");
        org.apache.pdfbox.io.ScratchFile scratchFile0 = null;
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream(scratchFile0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream2 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream1);
        int i3 = pDObjectStream2.getFirstByteOffset();
        org.apache.pdfbox.pdfparser.PDFStreamParser pDFStreamParser4 = new org.apache.pdfbox.pdfparser.PDFStreamParser((org.apache.pdfbox.pdmodel.common.PDStream) pDObjectStream2);
        org.apache.pdfbox.pdfparser.PDFStreamParser pDFStreamParser5 = new org.apache.pdfbox.pdfparser.PDFStreamParser((org.apache.pdfbox.pdmodel.common.PDStream) pDObjectStream2);
        org.junit.Assert.assertTrue(i3 == 0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test109");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        pDVisibleSigBuilder0.createInnerFormResource();
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
        org.apache.pdfbox.pdmodel.PDDocument pDDocument19 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument2);
        pDVisibleSigBuilder0.createInnerFormStream(pDDocument19);
        org.junit.Assert.assertNotNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNull(cOSObject6);
        org.junit.Assert.assertNotNull(cOSDictionary9);
        org.junit.Assert.assertTrue(long13 == (-1L));
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test110");
        org.apache.pdfbox.pdmodel.encryption.PDEncryptionDictionary pDEncryptionDictionary0 = new org.apache.pdfbox.pdmodel.encryption.PDEncryptionDictionary();
        int i1 = pDEncryptionDictionary0.getPermissions();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDEncryptionDictionary0.getCOSDictionary();
        org.apache.pdfbox.pdmodel.encryption.PDCryptFilterDictionary pDCryptFilterDictionary3 = new org.apache.pdfbox.pdmodel.encryption.PDCryptFilterDictionary();
        pDEncryptionDictionary0.setStdCryptFilterDictionary(pDCryptFilterDictionary3);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.MARK_INFO;
        pDEncryptionDictionary0.setStreamFilterName(cOSName5);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName5);
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test111");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray4 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i5 = pDDeviceGray4.getNumberOfComponents();
        float[] f_array7 = pDDeviceGray4.getDefaultDecode((int) (short) 0);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        float[] f_array11 = pDDeviceGray8.getDefaultDecode((int) (short) 0);
        float[] f_array12 = pDDeviceGray4.toRGB(f_array11);
        pDAnnotationTextMarkup3.setQuadPoints(f_array11);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(pDDeviceGray4);
        org.junit.Assert.assertTrue(i5 == 1);
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(f_array11);
        org.junit.Assert.assertNotNull(f_array12);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test112");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) 10);
        boolean b2 = memoryUsageSetting1.useMainMemory();
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting4 = memoryUsageSetting1.getPartitionedCopy((int) (short) 100);
        java.io.File file5 = memoryUsageSetting4.getTempDir();
        org.apache.pdfbox.io.ScratchFile scratchFile6 = new org.apache.pdfbox.io.ScratchFile(memoryUsageSetting4);
        org.apache.pdfbox.cos.COSDocument cOSDocument7 = new org.apache.pdfbox.cos.COSDocument(scratchFile6);
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
        org.junit.Assert.assertTrue(b2 == true);
        org.junit.Assert.assertNotNull(memoryUsageSetting4);
        org.junit.Assert.assertNull(file5);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test113");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.NON_STRUCT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "NonStruct" + "'", str0.equals("NonStruct"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test114");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.cos.COSStream cOSStream5 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction6 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        pDAppearanceDictionary0.setDownAppearance(pDAppearanceStream7);
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNull(pDAction6);
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test115");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_ALIGN_JUSTIFY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Justify" + "'", str0.equals("Justify"));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test116");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STANDARD_ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test117");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PROPERTIES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test118");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.SUBJ;
        long long6 = cOSDictionary3.getLong(cOSName5);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit7 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary3);
        int i10 = cOSDictionary3.getInt("Outset", (int) '4');
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue(i10 == 52);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test119");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        java.lang.String str7 = fDFAnnotationPolyline6.getStartPointEndingStyle();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "None" + "'", str7.equals("None"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test120");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        java.lang.String[] str_array53 = new java.lang.String[] { "Caret", "0", "Circle", "L", "Final", "hi!", "M", "Middle", "Key", "S", "Middle", "Inset", "Square", "Form", "Standard", "UseOutlines", "O=PrintField", "Lbl", "n", "MediaBox", "Adobe.PubSec", "Link", "Popup", "Annot", "Slash", "FileAttachment", "D", "COSInt{1}", "Center", "Dashed", "ClosedArrow", "270", "BlockQuote", "MediaBox", "Auto", "Figure", "Square", "L", "CSS-1.00", "L", "ForComment", "Underline", "Pattern", "Outset", "RB", "J", "RlTb", "656E6473747265616D", "hi!", "O=Final", "Viewport" };
        java.util.ArrayList<java.lang.String> arraylist_str54 = new java.util.ArrayList<java.lang.String>();
        boolean b55 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str54, str_array53);
        org.apache.pdfbox.cos.COSArray cOSArray56 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertStringListToCOSNameCOSArray((java.util.List<java.lang.String>) arraylist_str54);
        try {
            pDShadingType6_1.setDecodeValues(cOSArray56);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array53);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(cOSArray56);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test121");
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
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp18 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary12);
        org.apache.pdfbox.pdmodel.PDResources pDResources20 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary12);
        org.apache.pdfbox.cos.COSName cOSName21 = org.apache.pdfbox.cos.COSName.URL;
        boolean b22 = pDResources20.hasColorSpace(cOSName21);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(cOSName21);
        org.junit.Assert.assertTrue(b22 == false);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test122");
        org.apache.pdfbox.util.Vector vector2 = new org.apache.pdfbox.util.Vector(100.0f, (float) (-1L));
        org.apache.pdfbox.util.Vector vector4 = vector2.scale(1.0f);
        org.junit.Assert.assertNotNull(vector4);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test123");
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation0 = new org.apache.pdfbox.pdmodel.PDDocumentInformation();
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test124");
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
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY23 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox;
        pDViewerPreferences21.setPrintArea(bOUNDARY23);
        pDViewerPreferences21.setCenterWindow(false);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + bOUNDARY23 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox + "'", bOUNDARY23.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test125");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String[] str_array3 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str4, str_array3);
        pDCheckBox1.setExportValues((java.util.List<java.lang.String>) arraylist_str4);
        pDCheckBox1.setReadOnly(true);
        boolean b9 = pDCheckBox1.isRequired();
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test126");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.cos.COSInputStream cOSInputStream2 = cOSStream0.createInputStream();
        try {
            long long4 = cOSInputStream2.skip((long) 52);
            org.junit.Assert.fail("Expected exception of type java.io.EOFException");
        } catch (java.io.EOFException e) {
        }
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNotNull(cOSInputStream2);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test127");
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
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret23 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup24 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar25 = null;
        pDAnnotationPopup24.setModifiedDate(calendar25);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle27 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup24.setRectangle(pDRectangle27);
        org.apache.pdfbox.pdmodel.PDPage pDPage29 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle27);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream30 = pDPage29.getContentStreams();
        org.apache.pdfbox.cos.COSStream cOSStream31 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream32 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream31);
        org.apache.pdfbox.pdmodel.common.PDStream[] pDStream_array33 = new org.apache.pdfbox.pdmodel.common.PDStream[] { pDStream32 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream> arraylist_pDStream34 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.common.PDStream>();
        boolean b35 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream34, pDStream_array33);
        pDPage29.setContents((java.util.List<org.apache.pdfbox.pdmodel.common.PDStream>) arraylist_pDStream34);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup37 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar38 = null;
        pDAnnotationPopup37.setModifiedDate(calendar38);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle40 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup37.setRectangle(pDRectangle40);
        org.apache.pdfbox.pdmodel.PDPage pDPage42 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle40);
        pDPage29.setMediaBox(pDRectangle40);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle44 = pDPage29.getCropBox();
        fDFAnnotationCaret23.setFringe(pDRectangle44);
        fDFAnnotationCaret0.setFringe(pDRectangle44);
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNotNull(pDStream_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertNotNull(pDRectangle17);
        org.junit.Assert.assertNotNull(pDRectangle21);
        org.junit.Assert.assertNotNull(pDRectangle27);
        org.junit.Assert.assertNotNull(iterator_pDStream30);
        org.junit.Assert.assertNotNull(pDStream_array33);
        org.junit.Assert.assertTrue(b35 == true);
        org.junit.Assert.assertNotNull(pDRectangle40);
        org.junit.Assert.assertNotNull(pDRectangle44);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test128");
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties0 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties();
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test129");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        boolean b1 = pDType1Font0.isVertical();
        org.apache.fontbox.FontBoxFont fontBoxFont2 = pDType1Font0.getFontBoxFont();
        org.apache.pdfbox.util.Matrix matrix3 = pDType1Font0.getFontMatrix();
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList5 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getZapfDingbats();
        java.lang.String str6 = pDType1Font0.toUnicode(97, glyphList5);
        float f8 = pDType1Font0.getHeight(3);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(fontBoxFont2);
        org.junit.Assert.assertNotNull(matrix3);
        org.junit.Assert.assertNotNull(glyphList5);
        org.junit.Assert.assertNull(str6);
        org.junit.Assert.assertTrue(f8 == 0.0f);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test130");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STRUCT_TREE_ROOT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test131");
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
        org.apache.pdfbox.cos.COSInputStream cOSInputStream13 = cOSStream10.createInputStream();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSInputStream13);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test132");
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
        org.apache.pdfbox.util.Matrix matrix18 = matrix9.clone();
        matrix18.translate(600.0f, (float) 40);
        org.apache.pdfbox.util.Matrix matrix28 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray29 = matrix28.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix30 = matrix28.extractScaling();
        org.apache.pdfbox.util.Matrix matrix31 = org.apache.pdfbox.util.Matrix.concatenate(matrix18, matrix28);
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertNotNull(cOSArray29);
        org.junit.Assert.assertNotNull(matrix30);
        org.junit.Assert.assertNotNull(matrix31);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test133");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Form");
        pDExportFormatAttributeObject1.setLineHeightAuto();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test134");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName5 = cOSDictionary3.getCOSName(cOSName4);
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.CID_FONT_TYPE2;
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination pDNamedDestination7 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination(cOSName6);
        java.lang.String str9 = cOSDictionary3.getNameAsString(cOSName6, "sc");
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties10 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "sc" + "'", str9.equals("sc"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test135");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        pDFTextStripper0.setAddMoreFormatting(false);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test136");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        fDFAnnotationPolyline5.setEndPointEndingStyle("Note");
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test137");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        pDAnnotationTextMarkup3.setTitlePopup("Caret");
        boolean b6 = pDAnnotationTextMarkup3.isPrinted();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test138");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMainMemoryOnly((long) 10);
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test139");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary5 = null;
        pDAnnotationLink4.setBorderStyle(pDBorderStyleDictionary5);
        pDAnnotationLink4.setModifiedDate("Artifact");
        boolean b9 = pDAnnotationLink4.isPrinted();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(b9 == false);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test140");
        org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding macOSRomanEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.MacOSRomanEncoding();
        org.apache.pdfbox.cos.COSBase cOSBase1 = macOSRomanEncoding0.getCOSObject();
        java.lang.String str3 = macOSRomanEncoding0.getName((-4));
        org.junit.Assert.assertNull(cOSBase1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".notdef" + "'", str3.equals(".notdef"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test141");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_WEIGHT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test142");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Link" + "'", str0.equals("Link"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test143");
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
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor18 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix25 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray26 = matrix25.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix27 = matrix25.extractScaling();
        pDFMarkedContentExtractor18.setTextMatrix(matrix25);
        matrix25.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix32 = matrix25.clone();
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.DS;
        boolean b34 = matrix32.equals((java.lang.Object) cOSName33);
        java.awt.Paint paint35 = pDShadingType6_1.toPaint(matrix32);
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(cOSArray26);
        org.junit.Assert.assertNotNull(matrix27);
        org.junit.Assert.assertNotNull(matrix32);
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(paint35);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test144");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        int i3 = pDExportFormatAttributeObject1.getColSpan();
        java.lang.String str4 = pDExportFormatAttributeObject1.getTextDecorationType();
        java.lang.String str5 = pDExportFormatAttributeObject1.toString();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue(i3 == 1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "None" + "'", str4.equals("None"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O=Final" + "'", str5.equals("O=Final"));
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test145");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream1 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead0);
        boolean b2 = randomAccessInputStream1.markSupported();
        try {
            org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer3 = new org.apache.pdfbox.io.RandomAccessBuffer((java.io.InputStream) randomAccessInputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test146");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit setLineMiterLimit1 = new org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit();
        pDFMarkedContentExtractor0.addOperator((org.apache.pdfbox.contentstream.operator.OperatorProcessor) setLineMiterLimit1);
        java.lang.String str3 = setLineMiterLimit1.getName();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "M" + "'", str3.equals("M"));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test147");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream2 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream3 = pDObjectStream2.getExtends();
        java.util.List<java.lang.String> list_str4 = null;
        try {
            pDObjectStream3.setFileFilters(list_str4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDObjectStream3);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test148");
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
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp18 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary12);
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties19 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary12);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test149");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.io.ScratchFile scratchFile5 = null;
        org.apache.pdfbox.cos.COSStream cOSStream6 = new org.apache.pdfbox.cos.COSStream(scratchFile5);
        cOSDictionary3.mergeInto((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        java.io.InputStream inputStream8 = cOSStream6.createRawInputStream();
        org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern pDShadingPattern9 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        java.lang.String str10 = pDShadingPattern9.getType();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(inputStream8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Pattern" + "'", str10.equals("Pattern"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test150");
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction1 = pDAnnotationAdditionalActions0.getE();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = pDAnnotationAdditionalActions0.getBl();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction3 = pDAnnotationAdditionalActions0.getFo();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction4 = pDAnnotationAdditionalActions0.getPV();
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNull(pDAction3);
        org.junit.Assert.assertNull(pDAction4);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test151");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VERISIGN_PPKVS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test152");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption6 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary2);
        int i8 = pDShadingType7_7.getShadingType();
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace9 = pDShadingType7_7.getColorSpace();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
        org.junit.Assert.assertTrue(i8 == 7);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test153");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        pDAppearanceContentStream5.setMiterLimit((float) '#');
        pDAppearanceContentStream5.closeAndStroke();
        pDAppearanceContentStream5.setStrokingColor(97, (int) (short) 0, 10);
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test154");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup.SUB_TYPE_UNDERLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Underline" + "'", str0.equals("Underline"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test155");
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
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm21 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox22 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm21);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = pDCheckBox22.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary24 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary23);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine25 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary24);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding26 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary24);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline27 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary24);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        cOSDictionary24.setEmbeddedString("Inline", cOSName29, "JavaScript");
        org.apache.pdfbox.cos.COSName cOSName32 = org.apache.pdfbox.cos.COSName.OBJ;
        int i33 = cOSDictionary19.getInt(cOSName29, cOSName32);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(cOSDictionary23);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSName32);
        org.junit.Assert.assertTrue(i33 == (-1));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test156");
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
        org.apache.fontbox.ttf.OpenTypeFont openTypeFont12 = cIDFontMapping11.getFont();
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(fontBoxFont9);
        org.junit.Assert.assertNull(openTypeFont12);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test157");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor5 = pDAnnotationLine4.getInteriorColor();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary6 = null;
        pDAnnotationLine4.setBorderStyle(pDBorderStyleDictionary6);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDColor5);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test158");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        boolean b4 = pDExportFormatAttributeObject1.isSpecified("PrintField");
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma5 = pDExportFormatAttributeObject1.getColor();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(pDGamma5);
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test159");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        byte[] byte_array2 = pDType1Font0.encode("Slash");
        org.apache.fontbox.FontBoxFont fontBoxFont3 = pDType1Font0.getFontBoxFont();
        org.apache.fontbox.type1.Type1Font type1Font4 = pDType1Font0.getType1Font();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertNotNull(fontBoxFont3);
        org.junit.Assert.assertNull(type1Font4);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test160");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        java.lang.String str1 = pDType1Font0.getName();
        java.lang.String str2 = pDType1Font0.getSubType();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Courier-BoldOblique" + "'", str1.equals("Courier-BoldOblique"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Type1" + "'", str2.equals("Type1"));
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test161");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test162");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test163");
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
        boolean b19 = cOSDocument0.isXRefStream();
        org.apache.pdfbox.cos.COSArray cOSArray20 = cOSDocument0.getDocumentID();
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(f18 == 1.4f);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertNull(cOSArray20);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test164");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = new org.apache.pdfbox.cos.COSObjectKey((long) 2, (int) (byte) 10);
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey5 = new org.apache.pdfbox.cos.COSObjectKey((long) 2, (int) (byte) 10);
        int i6 = cOSObjectKey2.compareTo(cOSObjectKey5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test165");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict0.setTrustedMode(true);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test166");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        pDAnnotationPopup0.setContents("GoTo");
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDAnnotationPopup0.getBorder();
        try {
            org.apache.pdfbox.cos.COSBase cOSBase5 = cOSArray3.getObject((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray3);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test167");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream1 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead0);
        boolean b2 = randomAccessInputStream1.markSupported();
        try {
            int i3 = randomAccessInputStream1.available();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test168");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_ALIGN_DISTRIBUTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Distribute" + "'", str0.equals("Distribute"));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test169");
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode();
        java.lang.String str1 = pDJavascriptNameTreeNode0.getLowerLimit();
        org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> pdnametreenode_pDActionJavaScript2 = pDJavascriptNameTreeNode0.getParent();
        java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> map_str_pDActionJavaScript3 = null;
        pDJavascriptNameTreeNode0.setNames(map_str_pDActionJavaScript3);
        java.lang.String str5 = pDJavascriptNameTreeNode0.getUpperLimit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(pdnametreenode_pDActionJavaScript2);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test170");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.S;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test171");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject pDListAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject();
        pDListAttributeObject0.setListNumbering("GoToR");
        java.lang.String str3 = pDListAttributeObject0.getListNumbering();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "GoToR" + "'", str3.equals("GoToR"));
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test172");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference8 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm9 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox10 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm9);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDCheckBox10.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup12 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary11);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo13 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary11);
        pDActionRemoteGoTo13.setOpenInNewWindow(false);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm16 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox17 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm16);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDCheckBox17.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup19 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary18);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo20 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary18);
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification21 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification();
        pDActionRemoteGoTo20.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification21);
        pDActionRemoteGoTo13.setFile((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification21);
        java.lang.String str24 = pDSimpleFileSpecification21.getFile();
        fDFNamedPageReference8.setFileSpecification((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification21);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "" + "'", str24.equals(""));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test173");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R;
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition1 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(pDTransitionStyle0);
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion pDTransitionMotion2 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.O;
        pDTransition1.setMotion(pDTransitionMotion2);
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.R));
        org.junit.Assert.assertTrue("'" + pDTransitionMotion2 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.O + "'", pDTransitionMotion2.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.O));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test174");
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
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile13 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(cOSStream10);
        pDEmbeddedFile13.setSubtype("F");
        java.util.Calendar calendar16 = pDEmbeddedFile13.getModDate();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(calendar16);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test175");
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
        org.apache.pdfbox.cos.COSDictionary cOSDictionary32 = pDShadingType3_7.getCOSObject();
        org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode pDStructureElementNameTreeNode33 = new org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode(cOSDictionary32);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSDictionary32);
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test176");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        boolean b5 = pDAnnotationLine4.isReadOnly();
        java.lang.String str6 = pDAnnotationLine4.getStartPointEndingStyle();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "None" + "'", str6.equals("None"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test177");
        org.apache.pdfbox.pdmodel.font.FontCache fontCache0 = new org.apache.pdfbox.pdmodel.font.FontCache();
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test178");
        org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams pDWindowsLaunchParams0 = new org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams();
        pDWindowsLaunchParams0.setDirectory("0");
        pDWindowsLaunchParams0.setDirectory("AsIs");
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test179");
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
        pDEncryption7.setVersion(8);
        org.apache.pdfbox.pdmodel.encryption.PDCryptFilterDictionary pDCryptFilterDictionary17 = pDEncryption7.getStdCryptFilterDictionary();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
        org.junit.Assert.assertNull(pDCryptFilterDictionary17);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test180");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        int i3 = pDFTextStripper0.getEndPage();
        java.lang.String str4 = pDFTextStripper0.getParagraphStart();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
        org.junit.Assert.assertTrue(i3 == 2147483647);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test181");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.SPACE;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test182");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler pDCircleAppearanceHandler5 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine4);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary6 = pDAnnotationLine4.getBorderStyle();
        boolean b7 = pDAnnotationLine4.isHidden();
        org.apache.pdfbox.pdmodel.PDPage pDPage8 = pDAnnotationLine4.getPage();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDBorderStyleDictionary6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(pDPage8);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test183");
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache0 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        org.apache.pdfbox.cos.COSDocument cOSDocument1 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = null;
        org.apache.pdfbox.cos.COSObject cOSObject3 = cOSDocument1.getObjectFromPool(cOSObjectKey2);
        long long4 = cOSObject3.getObjectNumber();
        org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern pDAbstractPattern5 = defaultResourceCache0.getPattern(cOSObject3);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache6 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        org.apache.pdfbox.cos.COSDocument cOSDocument7 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey8 = null;
        org.apache.pdfbox.cos.COSObject cOSObject9 = cOSDocument7.getObjectFromPool(cOSObjectKey8);
        long long10 = cOSObject9.getObjectNumber();
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font11 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD_OBLIQUE;
        boolean b13 = pDType1Font11.hasGlyph((int) ' ');
        defaultResourceCache6.put(cOSObject9, (org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font11);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup15 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar16 = null;
        pDAnnotationPopup15.setModifiedDate(calendar16);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle18 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup15.setRectangle(pDRectangle18);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState20 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle18);
        int i21 = pDGraphicsState20.getLineCap();
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN22 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        java.lang.String str23 = pDDeviceN22.getName();
        pDGraphicsState20.setNonStrokingColorSpace((org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN22);
        defaultResourceCache0.put(cOSObject9, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN22);
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache26 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        org.apache.pdfbox.cos.COSName cOSName27 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject28 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName27);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSBase cOSBase30 = cOSObject28.getDictionaryObject(cOSName29);
        org.apache.pdfbox.cos.COSBase cOSBase31 = cOSObject28.getObject();
        org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList pDPropertyList32 = null;
        defaultResourceCache26.put(cOSObject28, pDPropertyList32);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary34 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_35 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary34);
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor36 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix43 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray44 = matrix43.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix45 = matrix43.extractScaling();
        pDFMarkedContentExtractor36.setTextMatrix(matrix43);
        matrix43.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix50 = matrix43.clone();
        java.awt.Paint paint51 = pDShadingType6_35.toPaint(matrix43);
        int i52 = pDShadingType6_35.getShadingType();
        defaultResourceCache0.put(cOSObject28, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType6_35);
        org.junit.Assert.assertNotNull(cOSObject3);
        org.junit.Assert.assertTrue(long4 == 0L);
        org.junit.Assert.assertNull(pDAbstractPattern5);
        org.junit.Assert.assertNotNull(cOSObject9);
        org.junit.Assert.assertTrue(long10 == 0L);
        org.junit.Assert.assertNotNull(pDType1Font11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(pDRectangle18);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "DeviceN" + "'", str23.equals("DeviceN"));
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNull(cOSBase30);
        org.junit.Assert.assertNotNull(cOSBase31);
        org.junit.Assert.assertNotNull(cOSArray44);
        org.junit.Assert.assertNotNull(matrix45);
        org.junit.Assert.assertNotNull(matrix50);
        org.junit.Assert.assertNotNull(paint51);
        org.junit.Assert.assertTrue(i52 == 6);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test184");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        org.apache.pdfbox.pdmodel.font.encoding.Encoding encoding1 = pDType1Font0.getEncoding();
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font3 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        boolean b4 = pDType1Font3.isVertical();
        org.apache.fontbox.FontBoxFont fontBoxFont5 = pDType1Font3.getFontBoxFont();
        org.apache.pdfbox.util.Matrix matrix6 = pDType1Font3.getFontMatrix();
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList8 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getZapfDingbats();
        java.lang.String str9 = pDType1Font3.toUnicode(97, glyphList8);
        java.lang.String str10 = pDType1Font0.toUnicode((int) (short) -1, glyphList8);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertNotNull(encoding1);
        org.junit.Assert.assertNotNull(pDType1Font3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(fontBoxFont5);
        org.junit.Assert.assertNotNull(matrix6);
        org.junit.Assert.assertNotNull(glyphList8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test185");
        java.util.Map<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound> map_fillNonZeroRule_fDFAnnotationSound0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary3);
        org.apache.pdfbox.pdmodel.common.COSDictionaryMap<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound> cosdictionarymap_fillNonZeroRule_fDFAnnotationSound5 = new org.apache.pdfbox.pdmodel.common.COSDictionaryMap<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound>(map_fillNonZeroRule_fDFAnnotationSound0, cOSDictionary3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject();
        boolean b8 = pDTableAttributeObject6.isSpecified("RlTb");
        java.lang.String[] str_array10 = new java.lang.String[] { "Index" };
        pDTableAttributeObject6.setHeaders(str_array10);
        pDTableAttributeObject6.setSummary("Viewport");
        int i14 = pDTableAttributeObject6.getColSpan();
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound fDFAnnotationSound15 = cosdictionarymap_fillNonZeroRule_fDFAnnotationSound5.get((java.lang.Object) pDTableAttributeObject6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(i14 == 1);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test186");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.pdmodel.PDResources pDResources2 = new org.apache.pdfbox.pdmodel.PDResources();
        try {
            org.apache.pdfbox.pdmodel.graphics.PDXObject pDXObject3 = org.apache.pdfbox.pdmodel.graphics.PDXObject.createXObject((org.apache.pdfbox.cos.COSBase) cOSName0, pDResources2);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test187");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo pDActionRemoteGoTo4 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.CID_SET;
        org.apache.pdfbox.cos.COSStream cOSStream6 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction7 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream8 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream6);
        org.apache.pdfbox.util.Matrix matrix15 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray16 = matrix15.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix17 = matrix15.extractScaling();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm18 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox19 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm18);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary20 = pDCheckBox19.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary20);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine22 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary21);
        long long24 = cOSDictionary21.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed25 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary21);
        boolean b26 = matrix15.equals((java.lang.Object) cOSDictionary21);
        cOSStream6.setFilters((org.apache.pdfbox.cos.COSBase) cOSDictionary21);
        cOSDictionary2.setItem(cOSName5, (org.apache.pdfbox.cos.COSBase) cOSDictionary21);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary29 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary(cOSDictionary21);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNull(pDAction7);
        org.junit.Assert.assertNotNull(cOSArray16);
        org.junit.Assert.assertNotNull(matrix17);
        org.junit.Assert.assertNotNull(cOSDictionary20);
        org.junit.Assert.assertTrue(long24 == (-1L));
        org.junit.Assert.assertTrue(b26 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test188");
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
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo16 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary2);
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType2 pDFunctionType2_17 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType2((org.apache.pdfbox.cos.COSBase) cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(cOSName13);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test189");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition0 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition();
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test190");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        pDPageFitWidthDestination0.setTop((int) (short) 100);
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDPageFitWidthDestination0.getCOSObject();
        pDPageFitWidthDestination0.setTop(6);
        org.junit.Assert.assertNotNull(cOSArray3);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test191");
        char[] char_array1 = org.apache.pdfbox.util.Hex.getChars((short) (byte) 0);
        org.junit.Assert.assertNotNull(char_array1);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test192");
        org.apache.pdfbox.pdmodel.fdf.FDFTemplate fDFTemplate0 = new org.apache.pdfbox.pdmodel.fdf.FDFTemplate();
        java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFField> list_fDFField1 = fDFTemplate0.getFields();
        org.junit.Assert.assertNull(list_fDFField1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test193");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = new org.apache.pdfbox.cos.COSObjectKey((long) 2, (int) (byte) 10);
        long long3 = cOSObjectKey2.getNumber();
        org.junit.Assert.assertTrue(long3 == 2L);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test194");
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
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        java.lang.String str37 = cOSDictionary8.getEmbeddedString("LineDimension", cOSName36);
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem pDOutlineItem38 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDOutlineItem(cOSDictionary8);
        pDOutlineItem38.closeNode();
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
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test195");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        boolean b1 = randomAccessBuffer0.isClosed();
        byte[] byte_array2 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        int i5 = randomAccessBuffer0.read(byte_array2, (int) '4', (int) ' ');
        java.lang.String str6 = org.apache.pdfbox.util.Hex.getString(byte_array2);
        java.io.InputStream inputStream7 = null;
        int[] i_array10 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream11 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream7, i_array10);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream12 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(byte_array2, i_array10);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "656E6473747265616D" + "'", str6.equals("656E6473747265616D"));
        org.junit.Assert.assertNotNull(i_array10);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test196");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor1 = new org.apache.pdfbox.text.PDFMarkedContentExtractor("H1");
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test197");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setHeight(6);
        pDExportFormatAttributeObject1.setStartIndent(100005.0f);
        float[] f_array13 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray15 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i16 = pDDeviceGray15.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor17 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array13, cOSName14, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray15);
        org.apache.pdfbox.cos.COSName cOSName18 = org.apache.pdfbox.cos.COSName.FORM;
        org.apache.pdfbox.pdmodel.PDResources pDResources19 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN20 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        org.apache.pdfbox.pdmodel.graphics.color.PDPattern pDPattern21 = new org.apache.pdfbox.pdmodel.graphics.color.PDPattern(pDResources19, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN20);
        java.lang.String str22 = pDPattern21.getName();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor23 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array13, cOSName18, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDPattern21);
        pDExportFormatAttributeObject1.setColumnWidths(f_array13);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertNotNull(f_array13);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNotNull(pDDeviceGray15);
        org.junit.Assert.assertTrue(i16 == 1);
        org.junit.Assert.assertNotNull(cOSName18);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Pattern" + "'", str22.equals("Pattern"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test198");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING pRINT_SCALING0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING.None;
        org.junit.Assert.assertTrue("'" + pRINT_SCALING0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING.None + "'", pRINT_SCALING0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING.None));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test199");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject1 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.DS;
        org.apache.pdfbox.cos.COSBase cOSBase3 = cOSObject1.getDictionaryObject(cOSName2);
        cOSObject1.setNeedToBeUpdated(false);
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNull(cOSBase3);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test200");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.FRACTIONAL_DISPLAY_TRUNCATE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "T" + "'", str0.equals("T"));
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test201");
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
        org.apache.pdfbox.printing.Scaling scaling18 = null;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable19 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument17, scaling18);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm20 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox21 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm20);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = pDCheckBox21.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary22);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation24 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary23);
        java.lang.String str25 = pDDocumentInformation24.getProducer();
        java.lang.String str26 = pDDocumentInformation24.getAuthor();
        pDDocument17.setDocumentInformation(pDDocumentInformation24);
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSDictionary22);
        org.junit.Assert.assertNull(str25);
        org.junit.Assert.assertNull(str26);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test202");
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
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission20 = new org.apache.pdfbox.pdmodel.encryption.AccessPermission((int) (byte) 100);
        boolean b21 = accessPermission20.canExtractContent();
        accessPermission20.setCanFillInForm(true);
        boolean b24 = accessPermission20.canPrintDegraded();
        standardSecurityHandler13.setCurrentAccessPermission(accessPermission20);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm26 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox27 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm26);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDCheckBox27.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary29 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary28);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink30 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary29);
        org.apache.pdfbox.io.ScratchFile scratchFile31 = null;
        org.apache.pdfbox.cos.COSStream cOSStream32 = new org.apache.pdfbox.cos.COSStream(scratchFile31);
        cOSDictionary29.mergeInto((org.apache.pdfbox.cos.COSDictionary) cOSStream32);
        try {
            standardSecurityHandler13.decryptStream(cOSStream32, 1L, (long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
        org.junit.Assert.assertTrue(i17 == 40);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(cOSDictionary28);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test203");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray0 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        java.awt.image.WritableRaster writableRaster1 = null;
        try {
            java.awt.image.BufferedImage bufferedImage2 = pDDeviceGray0.toRGBImage(writableRaster1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDDeviceGray0);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test204");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LLE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test205");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        java.lang.String[] str_array5 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase6 = cOSDictionary2.getDictionaryObject(str_array5);
        java.util.Calendar calendar8 = cOSDictionary2.getDate("180");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp pDAnnotationRubberStamp9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_10 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test206");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName5 = cOSDictionary3.getCOSName(cOSName4);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.ROWS;
        cOSDictionary3.setEmbeddedInt("Underline", cOSName7, (int) (byte) 100);
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary10 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary3);
        java.util.List<org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification> list_pDFileSpecification11 = fDFDictionary10.getEmbeddedFDFs();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = fDFDictionary10.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(list_pDFileSpecification11);
        org.junit.Assert.assertNotNull(cOSDictionary12);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test207");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDObjectReference0.setReferencedObject((org.apache.pdfbox.pdmodel.graphics.PDXObject) pDAppearanceStream3);
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper5 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str6 = pDFTextStripper5.getWordSeparator();
        float f7 = pDFTextStripper5.getIndentThreshold();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm8 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox9 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm8);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary10 = pDCheckBox9.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine12 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary11);
        pDFTextStripper5.showAnnotation((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine12);
        pDObjectReference0.setReferencedObject((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine12);
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + " " + "'", str6.equals(" "));
        org.junit.Assert.assertTrue(f7 == 2.0f);
        org.junit.Assert.assertNotNull(cOSDictionary10);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test208");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String[] str_array3 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str4, str_array3);
        pDCheckBox1.setExportValues((java.util.List<java.lang.String>) arraylist_str4);
        int i7 = pDCheckBox1.getFieldFlags();
        boolean b8 = pDCheckBox1.isRadioButton();
        pDCheckBox1.setRequired(false);
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i7 == 0);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test209");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_2 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName1);
        pDSeparation0.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionType3_2);
        java.awt.image.WritableRaster writableRaster4 = null;
        try {
            java.awt.image.BufferedImage bufferedImage5 = pDSeparation0.toRGBImage(writableRaster4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName1);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test210");
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
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions35 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound36 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound36.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions35.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound36);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm40 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox41 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm40);
        java.lang.String[] str_array43 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str44 = new java.util.ArrayList<java.lang.String>();
        boolean b45 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str44, str_array43);
        pDCheckBox41.setExportValues((java.util.List<java.lang.String>) arraylist_str44);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.types = arraylist_str44;
        pDActionSound36.setNext((java.util.List<java.lang.String>) arraylist_str44);
        pDInlineImage34.setFilters((java.util.List<java.lang.String>) arraylist_str44);
        java.util.Comparator<java.lang.String> comparator_str50 = null;
        org.apache.pdfbox.util.QuickSort.sort((java.util.List<java.lang.String>) arraylist_str44, comparator_str50);
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
        org.junit.Assert.assertNotNull(str_array43);
        org.junit.Assert.assertTrue(b45 == true);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test211");
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache0 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        org.apache.pdfbox.cos.COSDocument cOSDocument1 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = null;
        org.apache.pdfbox.cos.COSObject cOSObject3 = cOSDocument1.getObjectFromPool(cOSObjectKey2);
        long long4 = cOSObject3.getObjectNumber();
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font5 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD_OBLIQUE;
        boolean b7 = pDType1Font5.hasGlyph((int) ' ');
        defaultResourceCache0.put(cOSObject3, (org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font5);
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.A;
        org.apache.pdfbox.cos.COSObject cOSObject10 = new org.apache.pdfbox.cos.COSObject((org.apache.pdfbox.cos.COSBase) cOSName9);
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase cOSBase12 = cOSObject10.getItem(cOSName11);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm13 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox14 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm13);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDCheckBox14.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary15);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine17 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary16);
        long long19 = cOSDictionary16.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed20 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary16);
        cOSObject10.setObject((org.apache.pdfbox.cos.COSBase) cOSDictionary16);
        org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList pDPropertyList22 = defaultResourceCache0.getProperties(cOSObject10);
        org.junit.Assert.assertNotNull(cOSObject3);
        org.junit.Assert.assertTrue(long4 == 0L);
        org.junit.Assert.assertNotNull(pDType1Font5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNull(cOSBase12);
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertTrue(long19 == (-1L));
        org.junit.Assert.assertNull(pDPropertyList22);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test212");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight8 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions9 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction10 = pDAnnotationAdditionalActions9.getD();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAction10);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test213");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject3 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty4 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary2, pDUserAttributeObject3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test214");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        boolean b2 = pDTextField1.doNotScroll();
        pDTextField1.setReadOnly(true);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test215");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.ZAPF_DINGBATS;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test216");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy3 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission2);
        java.lang.String str4 = standardProtectionPolicy3.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler5 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy3);
        java.lang.String str6 = standardProtectionPolicy3.getOwnerPassword();
        standardProtectionPolicy3.setUserPassword("Paperclip");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "270" + "'", str4.equals("270"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "270" + "'", str6.equals("270"));
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test217");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Square");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test218");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        int i3 = pDFTextStripper0.getEndPage();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream5 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction6 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        pDAppearanceDictionary4.setNormalAppearance(pDAppearanceStream7);
        org.apache.pdfbox.util.Matrix matrix9 = pDAppearanceStream7.getMatrix();
        try {
            pDFTextStripper0.showForm((org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject) pDAppearanceStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
        org.junit.Assert.assertTrue(i3 == 2147483647);
        org.junit.Assert.assertNull(pDAction6);
        org.junit.Assert.assertNotNull(matrix9);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test219");
        org.apache.pdfbox.pdfparser.XrefTrailerResolver xrefTrailerResolver0 = new org.apache.pdfbox.pdfparser.XrefTrailerResolver();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = xrefTrailerResolver0.getLastTrailer();
        int i2 = xrefTrailerResolver0.getTrailerCount();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = xrefTrailerResolver0.getTrailer();
        org.junit.Assert.assertNull(cOSDictionary1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNull(cOSDictionary3);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test220");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setWidth(0);
        java.lang.Object obj5 = pDExportFormatAttributeObject1.getPadding();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + 0.0f + "'", obj5.equals(0.0f));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test221");
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
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp18 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary12);
        org.apache.pdfbox.pdmodel.PDResources pDResources20 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary12);
        org.apache.pdfbox.cos.COSDocument cOSDocument21 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey22 = null;
        org.apache.pdfbox.cos.COSObject cOSObject23 = cOSDocument21.getObjectFromPool(cOSObjectKey22);
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject25 = cOSDocument21.getObjectByType(cOSName24);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm26 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox27 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm26);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDCheckBox27.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary29 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary28);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine30 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary29);
        long long32 = cOSDictionary29.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed33 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary29);
        java.lang.String str36 = cOSDictionary29.getEmbeddedString("sc", "After");
        cOSDocument21.setTrailer(cOSDictionary29);
        org.apache.pdfbox.cos.COSName cOSName39 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary29.setEmbeddedInt("Index", cOSName39, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName42 = org.apache.pdfbox.cos.COSName.BASE_ENCODING;
        cOSDictionary29.setBoolean(cOSName42, false);
        cOSDictionary29.setNeedToBeUpdated(false);
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer47 = new org.apache.pdfbox.io.RandomAccessBuffer();
        boolean b48 = randomAccessBuffer47.isClosed();
        byte[] byte_array49 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        int i52 = randomAccessBuffer47.read(byte_array49, (int) '4', (int) ' ');
        java.lang.String str53 = org.apache.pdfbox.util.Hex.getString(byte_array49);
        org.apache.pdfbox.pdmodel.PDResources pDResources54 = null;
        org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage pDInlineImage55 = new org.apache.pdfbox.pdmodel.graphics.image.PDInlineImage(cOSDictionary29, byte_array49, pDResources54);
        org.apache.pdfbox.cos.COSName cOSName57 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        java.lang.String str58 = cOSDictionary29.getEmbeddedString("LineDimension", cOSName57);
        boolean b59 = pDResources20.isImageXObject(cOSName57);
        org.apache.pdfbox.cos.COSName cOSName60 = org.apache.pdfbox.cos.COSName.SV;
        org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern pDShadingPattern61 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern();
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState62 = null;
        pDShadingPattern61.setExtendedGraphicsState(pDExtendedGraphicsState62);
        pDResources20.put(cOSName60, (org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern) pDShadingPattern61);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(cOSObject23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNull(cOSObject25);
        org.junit.Assert.assertNotNull(cOSDictionary28);
        org.junit.Assert.assertTrue(long32 == (-1L));
        org.junit.Assert.assertNull(str36);
        org.junit.Assert.assertNotNull(cOSName39);
        org.junit.Assert.assertNotNull(cOSName42);
        org.junit.Assert.assertTrue(b48 == false);
        org.junit.Assert.assertNotNull(byte_array49);
        org.junit.Assert.assertTrue(i52 == 0);
        org.junit.Assert.assertTrue("'" + str53 + "' != '" + "656E6473747265616D" + "'", str53.equals("656E6473747265616D"));
        org.junit.Assert.assertNotNull(cOSName57);
        org.junit.Assert.assertNull(str58);
        org.junit.Assert.assertTrue(b59 == false);
        org.junit.Assert.assertNotNull(cOSName60);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test222");
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) (-4));
        org.junit.Assert.assertNotNull(memoryUsageSetting1);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test223");
        org.apache.pdfbox.util.Matrix matrix2 = org.apache.pdfbox.util.Matrix.getTranslateInstance((float) ' ', (float) 100);
        float f3 = matrix2.getYPosition();
        org.junit.Assert.assertNotNull(matrix2);
        org.junit.Assert.assertTrue(f3 == 100.0f);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test224");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CID_FONT_TYPE2;
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination pDNamedDestination1 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination(cOSName0);
        java.lang.String str2 = pDNamedDestination1.getNamedDestination();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "CIDFontType2" + "'", str2.equals("CIDFontType2"));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test225");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Text" + "'", str0.equals("Text"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test226");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        pDAppearanceContentStream5.moveTo((float) 4, (float) (byte) 1);
        pDAppearanceContentStream5.clip();
        pDAppearanceContentStream5.beginText();
        pDAppearanceContentStream5.saveGraphicsState();
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test227");
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
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText fDFAnnotationText25 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText(cOSDictionary16);
        fDFAnnotationText25.setIcon("Tm");
        fDFAnnotationText25.setState("None");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSName20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Center" + "'", str22.equals("Center"));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test228");
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
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitRectangleDestination pDPageFitRectangleDestination57 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitRectangleDestination(cOSArray28);
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab58 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab(cOSArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
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
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test229");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent6 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.LENGTH2;
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.DESC;
        int i10 = cOSDictionary3.getInt(cOSName8, cOSName9);
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OBJ;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm12 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox13 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm12);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDCheckBox13.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary15);
        long long18 = cOSDictionary15.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption19 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary15);
        cOSDictionary3.setItem(cOSName11, (org.apache.pdfbox.pdmodel.common.COSObjectable) cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertTrue(i10 == (-1));
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertTrue(long18 == (-1L));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test230");
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient0 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        java.security.cert.X509Certificate x509Certificate1 = null;
        publicKeyRecipient0.setX509(x509Certificate1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test231");
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
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache20 = pDPage5.getResourceCache();
        int i21 = pDPage5.getRotation();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition22 = pDPage5.getTransition();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(iterator_pDStream6);
        org.junit.Assert.assertNotNull(pDStream_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(pDRectangle16);
        org.junit.Assert.assertNull(resourceCache20);
        org.junit.Assert.assertTrue(i21 == 0);
        org.junit.Assert.assertNull(pDTransition22);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test232");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LW;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test233");
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
        fDFField8.setClearFieldFlags((java.lang.Integer) (-4));
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test234");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        pDExportFormatAttributeObject1.setTextIndent((float) 100);
        float[] f_array10 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray12 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i13 = pDDeviceGray12.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor14 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array10, cOSName11, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray12);
        pDExportFormatAttributeObject1.setPaddings(f_array10);
        java.lang.Object obj16 = pDExportFormatAttributeObject1.getColumnGap();
        org.junit.Assert.assertNotNull(f_array10);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(pDDeviceGray12);
        org.junit.Assert.assertTrue(i13 == 1);
        org.junit.Assert.assertNull(obj16);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test235");
        org.apache.pdfbox.pdmodel.font.encoding.SymbolEncoding symbolEncoding0 = org.apache.pdfbox.pdmodel.font.encoding.SymbolEncoding.INSTANCE;
        java.util.Map<java.lang.String, java.lang.Integer> map_str_i1 = symbolEncoding0.getNameToCodeMap();
        org.junit.Assert.assertNotNull(symbolEncoding0);
        org.junit.Assert.assertNotNull(map_str_i1);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test236");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CALRGB;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test237");
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState baseState0 = org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.OFF;
        org.junit.Assert.assertTrue("'" + baseState0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.OFF + "'", baseState0.equals(org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties.BaseState.OFF));
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test238");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DCT_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test239");
        org.apache.pdfbox.contentstream.operator.graphics.StrokePath strokePath0 = new org.apache.pdfbox.contentstream.operator.graphics.StrokePath();
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test240");
        byte[] byte_array1 = org.apache.pdfbox.util.Hex.getBytes((byte) 0);
        org.junit.Assert.assertNotNull(byte_array1);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test241");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        cOSDictionary3.setEmbeddedString("Inline", cOSName8, "JavaScript");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp11 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary3);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree12 = new org.apache.pdfbox.pdmodel.PDPageTree(cOSDictionary3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary13 = pDPageTree12.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(cOSDictionary13);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test242");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        pDFTextStripper0.setLineSeparator("LineDimension");
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test243");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption6 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary2);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font7 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_8 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary2, pDType0Font7);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test244");
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
        pDAppearanceContentStream5.setNonStrokingColor((int) (short) 100);
        org.apache.pdfbox.pdmodel.PDResources pDResources14 = null;
        pDAppearanceContentStream5.setResources(pDResources14);
        try {
            pDAppearanceContentStream5.newLine();
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(stack_pDColorSpace11);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test245");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA;
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor1 = pDType1Font0.getFontDescriptor();
        pDFontDescriptor1.setSerif(true);
        boolean b4 = pDFontDescriptor1.isAllCap();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertNotNull(pDFontDescriptor1);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test246");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty1 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(pDUserAttributeObject0);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm2 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton3 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm2);
        boolean b4 = pDUserProperty1.equals((java.lang.Object) pDAcroForm2);
        try {
            pDUserProperty1.setName("Form");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test247");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
        pDPageXYZDestination0.setLeft(1);
        int i3 = pDPageXYZDestination0.findPageNumber();
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test248");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.util.Matrix matrix5 = pDAppearanceStream3.getMatrix();
        java.awt.geom.AffineTransform affineTransform6 = null;
        try {
            pDAppearanceStream3.setMatrix(affineTransform6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(matrix5);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test249");
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma0 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma();
        float f1 = pDGamma0.getG();
        org.junit.Assert.assertTrue(f1 == 0.0f);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test250");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        boolean b2 = pDTextField1.doNotSpellCheck();
        pDTextField1.setMaxLen((int) (byte) 1);
        pDTextField1.setDefaultAppearance("Groove");
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test251");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        int i6 = pDGraphicsState5.getLineCap();
        org.apache.pdfbox.pdmodel.graphics.blend.BlendMode blendMode7 = null;
        pDGraphicsState5.setBlendMode(blendMode7);
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace9 = pDGraphicsState5.getNonStrokingColorSpace();
        pDGraphicsState5.setLineJoin((int) 'a');
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(pDColorSpace9);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test252");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation12 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation(cOSArray11);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test253");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.WP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WP" + "'", str0.equals("WP"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test254");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test255");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources8 = pDPage6.getResources();
        int i9 = pDPageTree0.indexOf(pDPage6);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle10 = pDPage6.getArtBox();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle11 = pDPage6.getMediaBox();
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
        org.junit.Assert.assertNull(pDResources8);
        org.junit.Assert.assertTrue(i9 == (-1));
        org.junit.Assert.assertNotNull(pDRectangle10);
        org.junit.Assert.assertNotNull(pDRectangle11);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test256");
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
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp18 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary12);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDSeedValueTimeStamp18.getCOSObject();
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(cOSDictionary19);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test257");
        org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions pDDocumentCatalogAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDDocumentCatalogAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary4);
        long long7 = cOSDictionary4.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed8 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary4);
        pDDocumentCatalogAdditionalActions0.setWC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionNamed8);
        org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions pDAnnotationAdditionalActions10 = new org.apache.pdfbox.pdmodel.interactive.action.PDAnnotationAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction11 = pDAnnotationAdditionalActions10.getE();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction12 = pDAnnotationAdditionalActions10.getBl();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm13 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox14 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm13);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary15 = pDCheckBox14.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary16 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary15);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie17 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary15);
        pDAnnotationAdditionalActions10.setPV((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionMovie17);
        pDDocumentCatalogAdditionalActions0.setWP((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionMovie17);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(long7 == (-1L));
        org.junit.Assert.assertNull(pDAction11);
        org.junit.Assert.assertNull(pDAction12);
        org.junit.Assert.assertNotNull(cOSDictionary15);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test258");
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
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo16 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary2);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary17 = fDFPageInfo16.getCOSObject();
        org.apache.pdfbox.pdmodel.font.PDType1CFont pDType1CFont18 = new org.apache.pdfbox.pdmodel.font.PDType1CFont(cOSDictionary17);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(cOSDictionary17);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test259");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        int i6 = pDGraphicsState5.getLineCap();
        org.apache.pdfbox.pdmodel.graphics.blend.BlendMode blendMode7 = null;
        pDGraphicsState5.setBlendMode(blendMode7);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState9 = pDGraphicsState5.clone();
        boolean b10 = pDGraphicsState9.isStrokeAdjustment();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(pDGraphicsState9);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test260");
        org.apache.pdfbox.contentstream.operator.graphics.FillEvenOddAndStrokePath fillEvenOddAndStrokePath0 = new org.apache.pdfbox.contentstream.operator.graphics.FillEvenOddAndStrokePath();
        java.lang.String str1 = fillEvenOddAndStrokePath0.getName();
        java.lang.String str2 = fillEvenOddAndStrokePath0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "B*" + "'", str1.equals("B*"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "B*" + "'", str2.equals("B*"));
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test261");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CAP_HEIGHT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test262");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.ANNOT;
        org.apache.pdfbox.cos.COSBase cOSBase8 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary3, cOSName7);
        org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification pDComplexFileSpecification9 = new org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(cOSBase8);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test263");
        org.apache.pdfbox.pdmodel.common.function.type4.InstructionSequence instructionSequence0 = new org.apache.pdfbox.pdmodel.common.function.type4.InstructionSequence();
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test264");
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
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission20 = new org.apache.pdfbox.pdmodel.encryption.AccessPermission((int) (byte) 100);
        boolean b21 = accessPermission20.canExtractContent();
        accessPermission20.setCanFillInForm(true);
        boolean b24 = accessPermission20.canPrintDegraded();
        standardSecurityHandler13.setCurrentAccessPermission(accessPermission20);
        accessPermission20.setCanPrintDegraded(false);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
        org.junit.Assert.assertTrue(i17 == 40);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b24 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test265");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BORDER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test266");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fly;
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition1 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(pDTransitionStyle0);
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fly + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fly));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test267");
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
        java.util.Map<org.apache.pdfbox.cos.COSObjectKey, java.lang.Long> map_cOSObjectKey_long21 = cOSDocument17.getXrefTable();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(cOSObject19);
        org.junit.Assert.assertNotNull(map_cOSObjectKey_long21);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test268");
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
        fDFAnnotationLine5.setCaption(true);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "None" + "'", str9.equals("None"));
        org.junit.Assert.assertNull(color10);
        org.junit.Assert.assertTrue(f11 == 1.0f);
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test269");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_2 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName1);
        pDSeparation0.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionType3_2);
        java.lang.String str4 = pDSeparation0.getColorantName();
        java.lang.String str5 = pDSeparation0.getColorantName();
        org.junit.Assert.assertNotNull(cOSName1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test270");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict0.setPreRelease(false);
        java.lang.String str3 = pDPropBuildDataDict0.getVersion();
        pDPropBuildDataDict0.setTrustedMode(false);
        java.lang.String str6 = pDPropBuildDataDict0.getVersion();
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test271");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument5 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.loadXFDF((java.io.InputStream) cOSFilterInputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test272");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NUMS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test273");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = new org.apache.pdfbox.cos.COSObjectKey((long) 2, (int) (byte) 10);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar4 = null;
        pDAnnotationPopup3.setModifiedDate(calendar4);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup3.setRectangle(pDRectangle6);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState8 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle6);
        int i9 = pDGraphicsState8.getLineCap();
        org.apache.pdfbox.pdmodel.graphics.blend.BlendMode blendMode10 = null;
        pDGraphicsState8.setBlendMode(blendMode10);
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.BASE_STATE;
        pDGraphicsState8.setTransfer((org.apache.pdfbox.cos.COSBase) cOSName12);
        boolean b14 = cOSObjectKey2.equals((java.lang.Object) cOSName12);
        org.junit.Assert.assertNotNull(pDRectangle6);
        org.junit.Assert.assertTrue(i9 == 0);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test274");
        org.apache.pdfbox.util.Matrix matrix2 = org.apache.pdfbox.util.Matrix.getTranslatingInstance((float) 1, (float) 9472);
        matrix2.reset();
        org.junit.Assert.assertNotNull(matrix2);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test275");
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
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm19 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox20 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm19);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDCheckBox20.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary21);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie23 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary21);
        pDDocumentCatalogAdditionalActions0.setWS((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionMovie23);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = pDDocumentCatalogAdditionalActions0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm26 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox27 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm26);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary28 = pDCheckBox27.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject29 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary28);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget30 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary28);
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.FORM;
        cOSDictionary28.setString(cOSName31, "J");
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.UF;
        int i36 = cOSDictionary25.getInt(cOSName31, cOSName34, (int) (short) 100);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertTrue(long7 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertNull(cOSBase16);
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNotNull(cOSDictionary25);
        org.junit.Assert.assertNotNull(cOSDictionary28);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertTrue(i36 == 100);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test276");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName5 = cOSDictionary3.getCOSName(cOSName4);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.ROWS;
        cOSDictionary3.setEmbeddedInt("Underline", cOSName7, (int) (byte) 100);
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary10 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFJavaScript fDFJavaScript11 = fDFDictionary10.getJavaScript();
        org.apache.pdfbox.pdmodel.fdf.FDFJavaScript fDFJavaScript12 = fDFDictionary10.getJavaScript();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(fDFJavaScript11);
        org.junit.Assert.assertNull(fDFJavaScript12);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test277");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FIT_WINDOW;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test278");
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
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile13 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(cOSStream10);
        pDEmbeddedFile13.setCheckSum("Before");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test279");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        java.io.File file2 = null;
        try {
            fDFDocument1.save(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test280");
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
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm28 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox29 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm28);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary30 = pDCheckBox29.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary31 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary30);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation32 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary31);
        java.lang.String str33 = pDDocumentInformation32.getAuthor();
        java.lang.String str34 = pDDocumentInformation32.getTrapped();
        java.lang.String str35 = pDDocumentInformation32.getProducer();
        java.lang.String str37 = pDDocumentInformation32.getCustomMetadataValue("Popup");
        pDDocument17.setDocumentInformation(pDDocumentInformation32);
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSDictionary20);
        org.junit.Assert.assertNotNull(cOSName22);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase26);
        org.junit.Assert.assertNotNull(cOSDictionary30);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNull(str34);
        org.junit.Assert.assertNull(str35);
        org.junit.Assert.assertNull(str37);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test281");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText pDAnnotationText0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText();
        boolean b1 = pDAnnotationText0.getOpen();
        java.lang.String str2 = pDAnnotationText0.getState();
        boolean b3 = pDAnnotationText0.getOpen();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test282");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject3 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary5 = null;
        pDAnnotationWidget4.setBorderStyle(pDBorderStyleDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary7 = pDAnnotationWidget4.getBorderStyle();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDBorderStyleDictionary7);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test283");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        try {
            cOSStandardOutputStream1.writeCRLF();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test284");
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
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp fDFAnnotationStamp16 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.DV;
        cOSDictionary2.removeItem(cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(i11 == (-1));
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(cOSName17);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test285");
        int i0 = java.awt.Transparency.OPAQUE;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test286");
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDTextState();
        boolean b1 = pDTextState0.getKnockoutFlag();
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState2 = pDTextState0.clone();
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode3 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE;
        pDTextState2.setRenderingMode(renderingMode3);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(pDTextState2);
        org.junit.Assert.assertTrue("'" + renderingMode3 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE + "'", renderingMode3.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test287");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.HIDE_TOOLBAR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test288");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String[] str_array3 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str4, str_array3);
        pDCheckBox1.setExportValues((java.util.List<java.lang.String>) arraylist_str4);
        int i7 = pDCheckBox1.getFieldFlags();
        try {
            java.lang.String str8 = pDCheckBox1.getValueAsString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test289");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference1 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary0);
        try {
            pDMarkedContentReference1.setMCID((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test290");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp fDFAnnotationStamp0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp();
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test291");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        java.awt.Composite composite6 = pDGraphicsState5.getNonStrokingJavaComposite();
        pDGraphicsState5.setFlatness((double) (byte) 0);
        float f9 = pDGraphicsState5.getLineWidth();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(composite6);
        org.junit.Assert.assertTrue(f9 == 1.0f);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test292");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace6 = pDGraphicsState5.getStrokingColorSpace();
        double d7 = pDGraphicsState5.getNonStrokeAlphaConstants();
        pDGraphicsState5.setStrokeAdjustment(false);
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(pDColorSpace6);
        org.junit.Assert.assertTrue(d7 == 1.0d);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test293");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TILING_TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test294");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationFreeText0.setCallout(f_array7);
        java.lang.String str13 = fDFAnnotationFreeText0.getLineEndingStyle();
        java.lang.String str14 = fDFAnnotationFreeText0.getDefaultAppearance();
        fDFAnnotationFreeText0.setDefaultStyle("Artifact");
        java.lang.String str17 = fDFAnnotationFreeText0.getDefaultStyle();
        fDFAnnotationFreeText0.setNoZoom(false);
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNull(str14);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "Artifact" + "'", str17.equals("Artifact"));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test295");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        java.lang.String str8 = pDCIDFontType0_7.getBaseFont();
        org.apache.fontbox.cff.Type2CharString type2CharString10 = pDCIDFontType0_7.getType2CharString(6);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNull(type2CharString10);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test296");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LZW_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test297");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        boolean b1 = randomAccessBuffer0.isClosed();
        byte[] byte_array2 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        int i5 = randomAccessBuffer0.read(byte_array2, (int) '4', (int) ' ');
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer6 = randomAccessBuffer0.clone();
        boolean b7 = randomAccessBuffer6.isEOF();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(byte_array2);
        org.junit.Assert.assertTrue(i5 == 0);
        org.junit.Assert.assertNotNull(randomAccessBuffer6);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test298");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSStandardOutputStream.EOL;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test299");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours8 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours(cOSArray7);
        org.junit.Assert.assertNotNull(cOSArray7);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test300");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.io.ScratchFile scratchFile5 = null;
        org.apache.pdfbox.cos.COSStream cOSStream6 = new org.apache.pdfbox.cos.COSStream(scratchFile5);
        cOSDictionary3.mergeInto((org.apache.pdfbox.cos.COSDictionary) cOSStream6);
        java.io.InputStream inputStream8 = cOSStream6.createRawInputStream();
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList10 = new org.apache.pdfbox.pdmodel.font.encoding.GlyphList(inputStream8, 10);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(inputStream8);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test301");
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
        float f14 = pDActionSound1.getVolume();
        float f15 = pDActionSound1.getVolume();
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(f14 == 1.0f);
        org.junit.Assert.assertTrue(f15 == 1.0f);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test302");
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font0 = null;
        org.apache.pdfbox.cos.COSStream cOSStream1 = null;
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc2 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font0, cOSStream1);
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font3 = pDType3CharProc2.getFont();
        try {
            org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = pDType3CharProc2.getBBox();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pDType3Font3);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test303");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle("Auto");
        java.lang.String str2 = pDAnnotationSquareCircle1.getSubtype();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Auto" + "'", str2.equals("Auto"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test304");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName5 = cOSDictionary3.getCOSName(cOSName4);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.ROWS;
        cOSDictionary3.setEmbeddedInt("Underline", cOSName7, (int) (byte) 100);
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary10 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary3);
        java.util.List<org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification> list_pDFileSpecification11 = fDFDictionary10.getEmbeddedFDFs();
        org.apache.pdfbox.cos.COSStream cOSStream12 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction13 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream12);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream12);
        fDFDictionary10.setDifferences(cOSStream12);
        org.apache.pdfbox.pdmodel.fdf.FDFPage[] fDFPage_array16 = new org.apache.pdfbox.pdmodel.fdf.FDFPage[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFPage> arraylist_fDFPage17 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFPage>();
        boolean b18 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.fdf.FDFPage>) arraylist_fDFPage17, fDFPage_array16);
        fDFDictionary10.setPages((java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFPage>) arraylist_fDFPage17);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(list_pDFileSpecification11);
        org.junit.Assert.assertNull(pDAction13);
        org.junit.Assert.assertNotNull(fDFPage_array16);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test305");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup pDAnnotationMarkup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup();
        org.apache.pdfbox.cos.COSName cOSName1 = pDAnnotationMarkup0.getAppearanceState();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDExternalDataDictionary pDExternalDataDictionary2 = pDAnnotationMarkup0.getExternalData();
        pDAnnotationMarkup0.setAppearanceState("H");
        org.junit.Assert.assertNull(cOSName1);
        org.junit.Assert.assertNull(pDExternalDataDictionary2);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test306");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.JPX_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test307");
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
        org.apache.pdfbox.cos.COSDictionary cOSDictionary32 = pDShadingType3_7.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary33 = pDShadingType3_7.getCOSObject();
        int i34 = pDShadingType3_7.getShadingType();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSDictionary32);
        org.junit.Assert.assertNotNull(cOSDictionary33);
        org.junit.Assert.assertTrue(i34 == 3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test308");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        pDPageFitWidthDestination0.setTop((int) (short) 100);
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDPageFitWidthDestination0.getCOSObject();
        int i4 = pDPageFitWidthDestination0.getPageNumber();
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertTrue(i4 == (-1));
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test309");
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
        fDFField8.setPartialFieldName("JavaScript");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test310");
        java.util.Map<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound> map_fillNonZeroRule_fDFAnnotationSound0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary3);
        org.apache.pdfbox.pdmodel.common.COSDictionaryMap<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound> cosdictionarymap_fillNonZeroRule_fDFAnnotationSound5 = new org.apache.pdfbox.pdmodel.common.COSDictionaryMap<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound>(map_fillNonZeroRule_fDFAnnotationSound0, cOSDictionary3);
        java.util.Map<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound> map_fillNonZeroRule_fDFAnnotationSound6 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm7 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox8 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm7);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = pDCheckBox8.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup10 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary9);
        org.apache.pdfbox.pdmodel.common.COSDictionaryMap<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound> cosdictionarymap_fillNonZeroRule_fDFAnnotationSound11 = new org.apache.pdfbox.pdmodel.common.COSDictionaryMap<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound>(map_fillNonZeroRule_fDFAnnotationSound6, cOSDictionary9);
        try {
            cosdictionarymap_fillNonZeroRule_fDFAnnotationSound5.putAll((java.util.Map<org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule, org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound>) cosdictionarymap_fillNonZeroRule_fDFAnnotationSound11);
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary9);
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test311");
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
        org.apache.pdfbox.pdmodel.common.PDPageLabelRange pDPageLabelRange29 = new org.apache.pdfbox.pdmodel.common.PDPageLabelRange();
        java.lang.String str30 = pDPageLabelRange29.getPrefix();
        pDPageLabels27.setLabelItem((int) (short) 0, pDPageLabelRange29);
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNotNull(cOSDictionary20);
        org.junit.Assert.assertNotNull(cOSName22);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase26);
        org.junit.Assert.assertNull(str30);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test312");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDTextField pDTextField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDTextField(pDAcroForm0);
        boolean b2 = pDTextField1.doNotSpellCheck();
        pDTextField1.setMaxLen((int) (byte) 1);
        boolean b5 = pDTextField1.doNotScroll();
        pDTextField1.setRichTextValue(" ");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test313");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceCMYK pDDeviceCMYK0 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceCMYK.INSTANCE;
        int i1 = pDDeviceCMYK0.getNumberOfComponents();
        int i2 = pDDeviceCMYK0.getNumberOfComponents();
        org.junit.Assert.assertNotNull(pDDeviceCMYK0);
        org.junit.Assert.assertTrue(i1 == 4);
        org.junit.Assert.assertTrue(i2 == 4);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test314");
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
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp18 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild19 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary12);
        org.apache.pdfbox.pdmodel.PDResources pDResources20 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary12);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm21 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox22 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm21);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary23 = pDCheckBox22.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary24 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary23);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink25 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary24);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline26 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary24);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight27 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary24);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary28 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary(cOSDictionary24);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight29 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary24);
        org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern pDShadingPattern30 = new org.apache.pdfbox.pdmodel.graphics.pattern.PDShadingPattern(cOSDictionary24);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm31 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox32 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm31);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary33 = pDCheckBox32.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary34 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary33);
        org.apache.pdfbox.cos.COSBase cOSBase36 = cOSDictionary33.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption37 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary33);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7 pDShadingType7_38 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType7(cOSDictionary33);
        pDShadingPattern30.setShading((org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType7_38);
        org.apache.pdfbox.cos.COSName cOSName40 = pDResources20.add((org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern) pDShadingPattern30);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(cOSDictionary23);
        org.junit.Assert.assertNotNull(cOSDictionary33);
        org.junit.Assert.assertNull(cOSBase36);
        org.junit.Assert.assertNotNull(cOSName40);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test315");
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
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY23 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox;
        pDViewerPreferences21.setPrintArea(bOUNDARY23);
        java.lang.String str25 = pDViewerPreferences21.getPrintClip();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + bOUNDARY23 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox + "'", bOUNDARY23.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + "CropBox" + "'", str25.equals("CropBox"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test316");
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
        byte[] byte_array35 = pDInlineImage34.getData();
        byte[] byte_array36 = pDInlineImage34.getData();
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
        org.junit.Assert.assertNotNull(byte_array35);
        org.junit.Assert.assertNotNull(byte_array36);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test317");
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm1 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox2 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = pDCheckBox2.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary4);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary4);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight7 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.ANNOT;
        org.apache.pdfbox.cos.COSBase cOSBase9 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary4, cOSName8);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionHide pDActionHide10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionHide(cOSDictionary4);
        org.apache.pdfbox.cos.COSDocument cOSDocument11 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey12 = null;
        org.apache.pdfbox.cos.COSObject cOSObject13 = cOSDocument11.getObjectFromPool(cOSObjectKey12);
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject15 = cOSDocument11.getObjectByType(cOSName14);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm16 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox17 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm16);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDCheckBox17.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary18);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine20 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary19);
        long long22 = cOSDictionary19.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed23 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary19);
        java.lang.String str26 = cOSDictionary19.getEmbeddedString("sc", "After");
        cOSDocument11.setTrailer(cOSDictionary19);
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary19.setEmbeddedInt("Index", cOSName29, (int) 'a');
        pDActionHide10.setT((org.apache.pdfbox.cos.COSBase) cOSDictionary19);
        pDFormFieldAdditionalActions0.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionHide10);
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNull(cOSBase9);
        org.junit.Assert.assertNotNull(cOSObject13);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNull(cOSObject15);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertTrue(long22 == (-1L));
        org.junit.Assert.assertNull(str26);
        org.junit.Assert.assertNotNull(cOSName29);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test318");
        org.apache.pdfbox.pdmodel.common.PDRange pDRange0 = new org.apache.pdfbox.pdmodel.common.PDRange();
        float f1 = pDRange0.getMax();
        org.junit.Assert.assertTrue(f1 == 1.0f);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test319");
        org.apache.pdfbox.pdmodel.graphics.state.PDTextState pDTextState0 = new org.apache.pdfbox.pdmodel.graphics.state.PDTextState();
        pDTextState0.setRise((float) 8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test320");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle("Auto");
        pDAnnotationSquareCircle1.setSubtype("StructElem");
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test321");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        java.lang.String str8 = pDCIDFontType0_7.getBaseFont();
        try {
            byte[] byte_array10 = pDCIDFontType0_7.encode((int) ' ');
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test322");
        org.apache.pdfbox.text.PDFTextStripper pDFTextStripper0 = new org.apache.pdfbox.text.PDFTextStripper();
        java.lang.String str1 = pDFTextStripper0.getWordSeparator();
        float f2 = pDFTextStripper0.getIndentThreshold();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm3 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox4 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDCheckBox4.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary6);
        pDFTextStripper0.showAnnotation((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine7);
        java.lang.String str9 = pDFTextStripper0.getParagraphStart();
        java.lang.String str10 = pDFTextStripper0.getWordSeparator();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + " " + "'", str1.equals(" "));
        org.junit.Assert.assertTrue(f2 == 2.0f);
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "" + "'", str9.equals(""));
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + " " + "'", str10.equals(" "));
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test323");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LZW_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test324");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        float f5 = pDAnnotationLine4.getCaptionHorizontalOffset();
        try {
            float[] f_array6 = pDAnnotationLine4.getLine();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f5 == 0.0f);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test325");
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
        org.apache.pdfbox.printing.Scaling scaling18 = null;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable19 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument17, scaling18);
        org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup pDTransparencyGroup20 = new org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup(pDDocument17);
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test326");
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
        try {
            int i18 = pDShadingType6_1.getBitsPerCoordinate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test327");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.io.ScratchFile scratchFile1 = null;
        org.apache.pdfbox.pdfparser.PDFParser pDFParser2 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, scratchFile1);
        pDFParser2.setEOFLookupRange((int) (short) -1);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test328");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions6 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSubmitForm pDActionSubmitForm7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSubmitForm();
        pDFormFieldAdditionalActions6.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSubmitForm7);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test329");
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
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination pDPageFitDestination41 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitDestination(cOSArray28);
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
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test330");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        cOSDictionary3.setEmbeddedString("Inline", cOSName8, "JavaScript");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp pDSeedValueTimeStamp11 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueTimeStamp(cOSDictionary3);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree12 = new org.apache.pdfbox.pdmodel.PDPageTree(cOSDictionary3);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree13 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup14 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar15 = null;
        pDAnnotationPopup14.setModifiedDate(calendar15);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle17 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup14.setRectangle(pDRectangle17);
        org.apache.pdfbox.pdmodel.PDPage pDPage19 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle17);
        pDPageTree13.add(pDPage19);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree21 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup22 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar23 = null;
        pDAnnotationPopup22.setModifiedDate(calendar23);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle25 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup22.setRectangle(pDRectangle25);
        org.apache.pdfbox.pdmodel.PDPage pDPage27 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle25);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream28 = pDPage27.getContentStreams();
        org.apache.pdfbox.pdmodel.PDResources pDResources29 = pDPage27.getResources();
        int i30 = pDPageTree21.indexOf(pDPage27);
        int i31 = pDPageTree13.indexOf(pDPage27);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata32 = pDPage27.getMetadata();
        int i33 = pDPageTree12.indexOf(pDPage27);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDRectangle17);
        org.junit.Assert.assertNotNull(pDRectangle25);
        org.junit.Assert.assertNotNull(iterator_pDStream28);
        org.junit.Assert.assertNull(pDResources29);
        org.junit.Assert.assertTrue(i30 == (-1));
        org.junit.Assert.assertTrue(i31 == (-1));
        org.junit.Assert.assertNull(pDMetadata32);
        org.junit.Assert.assertTrue(i33 == (-1));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test331");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Box;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Box + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Box));
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test332");
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
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream19 = pDPage14.getContentStreams();
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(pDRectangle12);
        org.junit.Assert.assertNotNull(iterator_pDStream15);
        org.junit.Assert.assertNull(pDResources16);
        org.junit.Assert.assertTrue(i17 == (-1));
        org.junit.Assert.assertTrue(i18 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream19);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test333");
        org.apache.pdfbox.contentstream.operator.Operator operator1 = org.apache.pdfbox.contentstream.operator.Operator.getOperator("CSS-1.00");
        org.junit.Assert.assertNotNull(operator1);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test334");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference8 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference(cOSDictionary3);
        try {
            org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode9 = org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode.create(cOSDictionary3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test335");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.ArtBox;
        org.junit.Assert.assertTrue("'" + bOUNDARY0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.ArtBox + "'", bOUNDARY0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.ArtBox));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test336");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.INFO;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test337");
        java.awt.geom.AffineTransform affineTransform0 = null;
        try {
            org.apache.pdfbox.util.Matrix matrix1 = new org.apache.pdfbox.util.Matrix(affineTransform0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test338");
        org.apache.pdfbox.cos.COSInteger cOSInteger1 = org.apache.pdfbox.cos.COSInteger.get((long) '4');
        float f2 = cOSInteger1.floatValue();
        org.junit.Assert.assertNotNull(cOSInteger1);
        org.junit.Assert.assertTrue(f2 == 52.0f);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test339");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding5 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline6 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary3);
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        cOSDictionary3.setEmbeddedString("Inline", cOSName8, "JavaScript");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine11 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject12 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName8);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test340");
        java.nio.charset.Charset charset0 = org.apache.pdfbox.util.Charsets.US_ASCII;
        org.junit.Assert.assertNotNull(charset0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test341");
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
        java.lang.String str15 = pDActionLaunch14.getF();
        pDActionLaunch14.setP("Square");
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNull(cOSBase3);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue(long10 == (-1L));
        org.junit.Assert.assertNull(str15);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test342");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_UPPER_ROMAN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpperRoman" + "'", str0.equals("UpperRoman"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test343");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = null;
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy3 = new org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy("270", "PushPin", accessPermission2);
        java.lang.String str4 = standardProtectionPolicy3.getOwnerPassword();
        org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler5 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy3);
        java.lang.String str6 = standardProtectionPolicy3.getOwnerPassword();
        try {
            standardProtectionPolicy3.setEncryptionKeyLength((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "270" + "'", str4.equals("270"));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "270" + "'", str6.equals("270"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test344");
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting0 = new org.apache.pdfbox.pdmodel.graphics.PDFontSetting();
        float f1 = pDFontSetting0.getFontSize();
        pDFontSetting0.setFontSize((float) 2L);
        org.junit.Assert.assertTrue(f1 == 1.0f);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test345");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        byte[] byte_array2 = org.apache.pdfbox.pdfwriter.COSWriter.STREAM;
        try {
            cOSStandardOutputStream1.write(byte_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test346");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CID_FONT_TYPE2;
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination pDNamedDestination1 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination(cOSName0);
        pDNamedDestination1.setNamedDestination("OpenArrow");
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test347");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess0 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess();
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test348");
        org.apache.pdfbox.pdmodel.PDPage pDPage0 = new org.apache.pdfbox.pdmodel.PDPage();
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test349");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName5 = cOSDictionary3.getCOSName(cOSName4);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.ROWS;
        cOSDictionary3.setEmbeddedInt("Underline", cOSName7, (int) (byte) 100);
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary10 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFJavaScript fDFJavaScript11 = fDFDictionary10.getJavaScript();
        fDFDictionary10.setStatus("ClosedArrow");
        java.lang.String str14 = fDFDictionary10.getTarget();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNull(fDFJavaScript11);
        org.junit.Assert.assertNull(str14);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test350");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setBlockAlign("ImportData");
        pDExportFormatAttributeObject1.setWidthAuto();
        pDExportFormatAttributeObject1.setStartIndent((float) 2L);
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test351");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor5 = pDAnnotationLine4.getInteriorColor();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup6 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        pDAnnotationPopup6.setContents("GoTo");
        pDAnnotationLine4.setPopup(pDAnnotationPopup6);
        boolean b10 = pDAnnotationPopup6.isPrinted();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDColor5);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test352");
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
        boolean b12 = cIDFontMapping11.isFallback();
        boolean b13 = cIDFontMapping11.isFallback();
        org.junit.Assert.assertNotNull(cOSDictionary3);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(fontBoxFont9);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test353");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA;
        org.apache.pdfbox.pdmodel.font.PDFontDescriptor pDFontDescriptor1 = pDType1Font0.getFontDescriptor();
        pDFontDescriptor1.setSerif(true);
        pDFontDescriptor1.setCapHeight(1.4f);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertNotNull(pDFontDescriptor1);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test354");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = new org.apache.pdfbox.pdmodel.common.PDRectangle((float) 100, (float) 1L, (float) 2L, (float) 40);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test355");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        pDAppearanceContentStream5.moveTo((float) 4, (float) (byte) 1);
        pDAppearanceContentStream5.clip();
        try {
            pDAppearanceContentStream5.setLineCapStyle(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test356");
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
        org.apache.pdfbox.pdmodel.common.PDRange pDRange17 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray15);
        org.apache.pdfbox.pdmodel.common.PDRange pDRange18 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray15);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test357");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission1 = new org.apache.pdfbox.pdmodel.encryption.AccessPermission((int) (byte) 100);
        boolean b2 = accessPermission1.canExtractContent();
        boolean b3 = accessPermission1.canModifyAnnotations();
        accessPermission1.setCanPrintDegraded(false);
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test358");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TREF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test359");
        org.apache.pdfbox.io.ScratchFile scratchFile0 = null;
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream(scratchFile0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream2 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream1);
        java.lang.String str3 = cOSStream1.toTextString();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly fDFAnnotationSquiggly4 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test360");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = new org.apache.pdfbox.pdmodel.common.PDRectangle(2.0f, 100.0f, 1.4f, (float) 7);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test361");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.FORM;
        org.apache.pdfbox.pdmodel.PDResources pDResources12 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN13 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        org.apache.pdfbox.pdmodel.graphics.color.PDPattern pDPattern14 = new org.apache.pdfbox.pdmodel.graphics.color.PDPattern(pDResources12, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN13);
        java.lang.String str15 = pDPattern14.getName();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor16 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName11, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDPattern14);
        org.apache.pdfbox.cos.COSArray cOSArray17 = pDColor16.toCOSArray();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "Pattern" + "'", str15.equals("Pattern"));
        org.junit.Assert.assertNotNull(cOSArray17);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test362");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        java.lang.String str8 = pDCIDFontType0_7.getBaseFont();
        try {
            float f10 = pDCIDFontType0_7.getWidthFromFont((int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test363");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess4 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess(cOSDictionary2);
        org.apache.pdfbox.pdmodel.common.COSDictionaryMap<java.lang.String, java.lang.Object> cosdictionarymap_str_obj5 = org.apache.pdfbox.pdmodel.common.COSDictionaryMap.convertBasicTypesToMap(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cosdictionarymap_str_obj5);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test364");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        pDFMarkedContentExtractor0.setTextMatrix(matrix7);
        java.awt.geom.Point2D.Float float13 = matrix7.transformPoint(1.0f, (float) 7);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm14 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton15 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm14);
        boolean b16 = matrix7.equals((java.lang.Object) pDAcroForm14);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(float13);
        org.junit.Assert.assertTrue(b16 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test365");
        org.apache.pdfbox.cos.COSDocument cOSDocument1 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey2 = null;
        org.apache.pdfbox.cos.COSObject cOSObject3 = cOSDocument1.getObjectFromPool(cOSObjectKey2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject5 = cOSDocument1.getObjectByType(cOSName4);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm6 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox7 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm6);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDCheckBox7.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary9 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary8);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine10 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary9);
        long long12 = cOSDictionary9.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed13 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary9);
        java.lang.String str16 = cOSDictionary9.getEmbeddedString("sc", "After");
        cOSDocument1.setTrailer(cOSDictionary9);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument18 = new org.apache.pdfbox.pdmodel.PDDocument(cOSDocument1);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm19 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox20 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm19);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary21 = pDCheckBox20.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary22 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary21);
        org.apache.pdfbox.cos.COSName cOSName23 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary22.removeItem(cOSName23);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font25 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_26 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary22, pDType0Font25);
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase27 = cOSDictionary22.entrySet();
        org.apache.pdfbox.pdmodel.common.PDPageLabels pDPageLabels28 = new org.apache.pdfbox.pdmodel.common.PDPageLabels(pDDocument18, cOSDictionary22);
        org.apache.pdfbox.pdmodel.graphics.color.PDICCBased pDICCBased29 = new org.apache.pdfbox.pdmodel.graphics.color.PDICCBased(pDDocument18);
        java.util.List<org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature> list_pDSignature30 = pDDocument18.getSignatureDictionaries();
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject31 = org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.createFromFile("Paragraph", pDDocument18);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSObject3);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSObject5);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertTrue(long12 == (-1L));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertNotNull(cOSDictionary21);
        org.junit.Assert.assertNotNull(cOSName23);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase27);
        org.junit.Assert.assertNotNull(list_pDSignature30);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test366");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        pDAppearanceContentStream5.setLineCapStyle((int) (short) 0);
        org.junit.Assert.assertNull(pDAction2);
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test367");
        org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode pDEmbeddedFilesNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode();
        java.lang.String str1 = pDEmbeddedFilesNameTreeNode0.getUpperLimit();
        org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode pDEmbeddedFilesNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDEmbeddedFilesNameTreeNode();
        java.lang.String str3 = pDEmbeddedFilesNameTreeNode2.getUpperLimit();
        pDEmbeddedFilesNameTreeNode0.setParent((org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.common.filespecification.PDComplexFileSpecification>) pDEmbeddedFilesNameTreeNode2);
        java.lang.String str5 = pDEmbeddedFilesNameTreeNode0.getLowerLimit();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test368");
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
        org.apache.pdfbox.cos.COSName cOSName42 = org.apache.pdfbox.cos.COSName.OVERLAY;
        int i43 = cOSArray28.indexOfObject((org.apache.pdfbox.cos.COSBase) cOSName42);
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDICCBased pDICCBased44 = new org.apache.pdfbox.pdmodel.graphics.color.PDICCBased(cOSArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
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
        org.junit.Assert.assertNotNull(cOSName42);
        org.junit.Assert.assertTrue(i43 == (-1));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test369");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        java.awt.Composite composite6 = pDGraphicsState5.getNonStrokingJavaComposite();
        int i7 = pDGraphicsState5.getLineCap();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(composite6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test370");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        float f6 = fDFAnnotationLine5.getLeaderOffset();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline fDFAnnotationUnderline7 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline();
        float[] f_array14 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray16 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i17 = pDDeviceGray16.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor18 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array14, cOSName15, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray16);
        fDFAnnotationUnderline7.setCoords(f_array14);
        fDFAnnotationLine5.setLine(f_array14);
        fDFAnnotationLine5.setCaptionHorizontalOffset((float) '#');
        fDFAnnotationLine5.setCaptionHorizontalOffset((float) 0);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
        org.junit.Assert.assertNotNull(f_array14);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNotNull(pDDeviceGray16);
        org.junit.Assert.assertTrue(i17 == 1);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test371");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CALGRAY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test372");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            java.util.List<java.lang.Object> list_obj2 = pDStream1.getDecodeParms();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test373");
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
        org.apache.pdfbox.cos.COSDocument cOSDocument22 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey23 = null;
        org.apache.pdfbox.cos.COSObject cOSObject24 = cOSDocument22.getObjectFromPool(cOSObjectKey23);
        org.apache.pdfbox.cos.COSName cOSName25 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject26 = cOSDocument22.getObjectByType(cOSName25);
        org.apache.pdfbox.cos.COSName cOSName27 = org.apache.pdfbox.cos.COSName.COLUMNS;
        java.util.List<org.apache.pdfbox.cos.COSObject> list_cOSObject28 = cOSDocument22.getObjectsByType(cOSName27);
        java.io.OutputStream outputStream29 = cOSStream0.createOutputStream((org.apache.pdfbox.cos.COSBase) cOSDocument22);
        org.apache.pdfbox.pdfwriter.ContentStreamWriter contentStreamWriter30 = new org.apache.pdfbox.pdfwriter.ContentStreamWriter(outputStream29);
        org.junit.Assert.assertNull(pDAction1);
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertTrue(long18 == (-1L));
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(cOSObject24);
        org.junit.Assert.assertNotNull(cOSName25);
        org.junit.Assert.assertNull(cOSObject26);
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertNotNull(list_cOSObject28);
        org.junit.Assert.assertNotNull(outputStream29);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test374");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation4 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm pDActionResetForm5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm(cOSDictionary3);
        pDActionResetForm5.setFlags(9472);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test375");
        org.apache.pdfbox.pdmodel.PageMode pageMode0 = org.apache.pdfbox.pdmodel.PageMode.FULL_SCREEN;
        java.lang.String str1 = pageMode0.stringValue();
        org.junit.Assert.assertTrue("'" + pageMode0 + "' != '" + org.apache.pdfbox.pdmodel.PageMode.FULL_SCREEN + "'", pageMode0.equals(org.apache.pdfbox.pdmodel.PageMode.FULL_SCREEN));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FullScreen" + "'", str1.equals("FullScreen"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test376");
        org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer0 = new org.apache.pdfbox.io.RandomAccessBuffer();
        org.apache.pdfbox.io.ScratchFile scratchFile1 = null;
        org.apache.pdfbox.pdfparser.PDFParser pDFParser2 = new org.apache.pdfbox.pdfparser.PDFParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0, scratchFile1);
        randomAccessBuffer0.seek((long) 1);
        randomAccessBuffer0.close();
        org.apache.pdfbox.pdfparser.COSParser cOSParser6 = new org.apache.pdfbox.pdfparser.COSParser((org.apache.pdfbox.io.RandomAccessRead) randomAccessBuffer0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test377");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getDictionaryObject("PushPin");
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions6 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions(cOSDictionary2);
        float f8 = cOSDictionary2.getFloat("(100.0, 0.0)");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
        org.junit.Assert.assertTrue(f8 == (-1.0f));
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test378");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare();
        java.lang.String str1 = fDFAnnotationSquare0.getSubject();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test379");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PAGE_LABELS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test380");
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
        try {
            java.util.List<java.lang.String> list_str32 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSStringCOSArrayToList(cOSArray28);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(pDDeviceGray25);
        org.junit.Assert.assertTrue(i26 == 1);
        org.junit.Assert.assertNotNull(cOSArray28);
        org.junit.Assert.assertNotNull(cOSName29);
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test381");
        org.apache.pdfbox.cos.COSStream cOSStream0 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare((org.apache.pdfbox.cos.COSDictionary) cOSStream0);
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream2 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream0);
        org.apache.pdfbox.cos.COSName cOSName3 = null;
        org.apache.pdfbox.cos.COSName cOSName4 = cOSStream0.getCOSName(cOSName3);
        org.junit.Assert.assertNull(cOSName4);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test382");
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
        pDAppearanceContentStream5.addRect((float) 9472, (float) (short) 10, 100005.0f, (float) 7);
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(stack_pDColorSpace11);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test383");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FILESPEC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test384");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        float f1 = pDType1Font0.getAverageFontWidth();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(f1 == 600.0f);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test385");
        org.apache.pdfbox.cos.COSBoolean cOSBoolean1 = org.apache.pdfbox.cos.COSBoolean.getBoolean(false);
        java.lang.String str2 = cOSBoolean1.toString();
        org.junit.Assert.assertNotNull(cOSBoolean1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "false" + "'", str2.equals("false"));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test386");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String[] str_array3 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str4, str_array3);
        pDCheckBox1.setExportValues((java.util.List<java.lang.String>) arraylist_str4);
        java.util.List<org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget> list_pDAnnotationWidget7 = pDCheckBox1.getWidgets();
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions8 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound9 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound9.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions8.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound9);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound13 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f14 = pDActionSound13.getVolume();
        pDFormFieldAdditionalActions8.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound13);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction16 = pDFormFieldAdditionalActions8.getC();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction17 = pDFormFieldAdditionalActions8.getK();
        pDCheckBox1.setActions(pDFormFieldAdditionalActions8);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary19 = pDFormFieldAdditionalActions8.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary pDAppearanceCharacteristicsDictionary20 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceCharacteristicsDictionary(cOSDictionary19);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary21 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream22 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction23 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream22);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream24 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream22);
        pDAppearanceDictionary21.setNormalAppearance(pDAppearanceStream24);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream26 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream24);
        float[] f_array33 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray35 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i36 = pDDeviceGray35.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor37 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array33, cOSName34, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray35);
        java.lang.String str38 = pDColor37.toString();
        pDAppearanceContentStream26.setStrokingColor(pDColor37);
        pDAppearanceCharacteristicsDictionary20.setBorderColour(pDColor37);
        float[] f_array47 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName48 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray49 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i50 = pDDeviceGray49.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor51 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array47, cOSName48, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray49);
        java.lang.String str52 = pDColor51.toString();
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace53 = pDColor51.getColorSpace();
        pDAppearanceCharacteristicsDictionary20.setBackground(pDColor51);
        pDAppearanceCharacteristicsDictionary20.setRolloverCaption("2.1.0-SNAPSHOT");
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertNotNull(list_pDAnnotationWidget7);
        org.junit.Assert.assertTrue(f14 == 1.0f);
        org.junit.Assert.assertNotNull(pDAction16);
        org.junit.Assert.assertNull(pDAction17);
        org.junit.Assert.assertNotNull(cOSDictionary19);
        org.junit.Assert.assertNull(pDAction23);
        org.junit.Assert.assertNotNull(f_array33);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertNotNull(pDDeviceGray35);
        org.junit.Assert.assertTrue(i36 == 1);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "PDColor{components=[100.0, -1.0, 32.0, 10.0, 1.0, 10.0], patternName=COSName{Multiply}}" + "'", str38.equals("PDColor{components=[100.0, -1.0, 32.0, 10.0, 1.0, 10.0], patternName=COSName{Multiply}}"));
        org.junit.Assert.assertNotNull(f_array47);
        org.junit.Assert.assertNotNull(cOSName48);
        org.junit.Assert.assertNotNull(pDDeviceGray49);
        org.junit.Assert.assertTrue(i50 == 1);
        org.junit.Assert.assertTrue("'" + str52 + "' != '" + "PDColor{components=[100.0, -1.0, 32.0, 10.0, 1.0, 10.0], patternName=COSName{Multiply}}" + "'", str52.equals("PDColor{components=[100.0, -1.0, 32.0, 10.0, 1.0, 10.0], patternName=COSName{Multiply}}"));
        org.junit.Assert.assertNotNull(pDColorSpace53);
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test387");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        java.lang.Object obj3 = pDExportFormatAttributeObject1.getTPadding();
        pDExportFormatAttributeObject1.setWidth((int) (byte) 0);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj3 + "' != '" + 0.0f + "'", obj3.equals(0.0f));
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test388");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary pDAppearanceDictionary0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceDictionary();
        org.apache.pdfbox.cos.COSStream cOSStream1 = new org.apache.pdfbox.cos.COSStream();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction2 = org.apache.pdfbox.pdmodel.interactive.action.PDActionFactory.createAction((org.apache.pdfbox.cos.COSDictionary) cOSStream1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream1);
        pDAppearanceDictionary0.setNormalAppearance(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream5 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream3);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        pDAppearanceContentStream5.setResources(pDResources6);
        pDAppearanceContentStream5.moveTo((float) 4, (float) (byte) 1);
        float[] f_array15 = new float[] { 2, (-1.0f), 0, 1.4f };
        pDAppearanceContentStream5.setLineDashPattern(f_array15, (-1.0f));
        org.junit.Assert.assertNull(pDAction2);
        org.junit.Assert.assertNotNull(f_array15);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test389");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RL" + "'", str0.equals("RL"));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test390");
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
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting21 = new org.apache.pdfbox.pdmodel.graphics.PDFontSetting(cOSArray11);
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
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test391");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.TIMES_ROMAN;
        float f2 = pDType1Font0.getHeight((int) ' ');
        java.lang.String str3 = pDType1Font0.getType();
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Font" + "'", str3.equals("Font"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test392");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STR_F;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test393");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Caret" + "'", str0.equals("Caret"));
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test394");
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
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions13 = null;
        fDFField8.setAdditionalActions(pDAdditionalActions13);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test395");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle("Auto");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary2 = pDAnnotationSquareCircle1.getBorderStyle();
        org.junit.Assert.assertNull(pDBorderStyleDictionary2);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test396");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_MATRIX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test397");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        org.apache.pdfbox.cos.COSStream cOSStream2 = pDStream1.getCOSObject();
        org.junit.Assert.assertNull(cOSStream2);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test398");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MM_TYPE1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test399");
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
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination24 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        pDPageFitWidthDestination24.setTop((int) (short) 100);
        org.apache.pdfbox.cos.COSArray cOSArray27 = pDPageFitWidthDestination24.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound28 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f29 = pDActionSound28.getVolume();
        cOSArray27.add((org.apache.pdfbox.pdmodel.common.COSObjectable) pDActionSound28);
        pDActionSound28.setRepeat(false);
        fDFField8.setAction((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound28);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNotNull(cOSDictionary15);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSName20);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Center" + "'", str22.equals("Center"));
        org.junit.Assert.assertNotNull(cOSArray27);
        org.junit.Assert.assertTrue(f29 == 1.0f);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test400");
        org.apache.pdfbox.pdmodel.font.encoding.ZapfDingbatsEncoding zapfDingbatsEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.ZapfDingbatsEncoding();
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest2.test401");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDPageFitWidthDestination0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm3 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox4 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm3);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDCheckBox4.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary5);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary6);
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding8 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary6);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline fDFAnnotationPolyline9 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline(cOSDictionary6);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_10 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary6);
        org.apache.pdfbox.util.Matrix matrix17 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray18 = matrix17.toCOSArray();
        pDShadingType3_10.setDomain(cOSArray18);
        java.lang.String str21 = cOSArray18.getString(1);
        org.apache.pdfbox.contentstream.operator.DrawObject drawObject22 = new org.apache.pdfbox.contentstream.operator.DrawObject();
        org.apache.pdfbox.contentstream.operator.Operator operator23 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm24 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox25 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm24);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary26 = pDCheckBox25.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup27 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary26);
        java.lang.String[] str_array29 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase30 = cOSDictionary26.getDictionaryObject(str_array29);
        java.util.Calendar calendar32 = cOSDictionary26.getDate("180");
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.SHADING_TYPE;
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.TYPE1;
        int i35 = cOSDictionary26.getInt(cOSName33, cOSName34);
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm37 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox38 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm37);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary39 = pDCheckBox38.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary40 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary39);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie41 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary39);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo42 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary39);
        org.apache.pdfbox.cos.COSName cOSName43 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        org.apache.pdfbox.cos.COSName cOSName44 = org.apache.pdfbox.cos.COSName.OVERLAY;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm45 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox46 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm45);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary47 = pDCheckBox46.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo48 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo(cOSDictionary47);
        cOSDictionary47.setInt("JavaScript", 10);
        org.apache.pdfbox.cos.COSName cOSName52 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.apache.pdfbox.cos.COSName cOSName53 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm54 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox55 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm54);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary56 = pDCheckBox55.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary57 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary56);
        org.apache.pdfbox.cos.COSDocument cOSDocument58 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey59 = null;
        org.apache.pdfbox.cos.COSObject cOSObject60 = cOSDocument58.getObjectFromPool(cOSObjectKey59);
        org.apache.pdfbox.cos.COSName cOSName61 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject62 = cOSDocument58.getObjectByType(cOSName61);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm63 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox64 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm63);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary65 = pDCheckBox64.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary66 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary65);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine67 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary66);
        long long69 = cOSDictionary66.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed70 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary66);
        java.lang.String str73 = cOSDictionary66.getEmbeddedString("sc", "After");
        cOSDocument58.setTrailer(cOSDictionary66);
        org.apache.pdfbox.cos.COSName cOSName76 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_VERISIGN_PPKVS;
        cOSDictionary66.setEmbeddedInt("Index", cOSName76, (int) 'a');
        org.apache.pdfbox.cos.COSName cOSName79 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm80 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox81 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm80);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary82 = pDCheckBox81.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject83 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary82);
        org.apache.pdfbox.cos.COSName cOSName84 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array85 = new org.apache.pdfbox.cos.COSBase[] { cOSDictionary26, cOSName36, cOSDictionary39, cOSName43, cOSName44, cOSDictionary47, cOSName52, cOSName53, cOSDictionary57, cOSDictionary66, cOSName79, cOSDictionary82, cOSName84 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase86 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b87 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase86, cOSBase_array85);
        drawObject22.process(operator23, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase86);
        cOSArray18.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase86);
        cOSArray1.addAll(1, (java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase86);
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement91 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray1);
        org.apache.pdfbox.cos.COSArray cOSArray92 = fDFOptionElement91.getCOSArray();
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSArray18);
        org.junit.Assert.assertNull(str21);
        org.junit.Assert.assertNotNull(cOSDictionary26);
        org.junit.Assert.assertNotNull(str_array29);
        org.junit.Assert.assertNull(cOSBase30);
        org.junit.Assert.assertNull(calendar32);
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertTrue(i35 == (-1));
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(cOSDictionary39);
        org.junit.Assert.assertNotNull(cOSName43);
        org.junit.Assert.assertNotNull(cOSName44);
        org.junit.Assert.assertNotNull(cOSDictionary47);
        org.junit.Assert.assertNotNull(cOSName52);
        org.junit.Assert.assertNotNull(cOSName53);
        org.junit.Assert.assertNotNull(cOSDictionary56);
        org.junit.Assert.assertNotNull(cOSObject60);
        org.junit.Assert.assertNotNull(cOSName61);
        org.junit.Assert.assertNull(cOSObject62);
        org.junit.Assert.assertNotNull(cOSDictionary65);
        org.junit.Assert.assertTrue(long69 == (-1L));
        org.junit.Assert.assertNull(str73);
        org.junit.Assert.assertNotNull(cOSName76);
        org.junit.Assert.assertNotNull(cOSName79);
        org.junit.Assert.assertNotNull(cOSDictionary82);
        org.junit.Assert.assertNotNull(cOSName84);
        org.junit.Assert.assertNotNull(cOSBase_array85);
        org.junit.Assert.assertTrue(b87 == true);
        org.junit.Assert.assertNotNull(cOSArray92);
    }
}

