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
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.RT_REPLY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "R" + "'", str0.equals("R"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CCITTFAX_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CHAR_SET;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment.ATTACHMENT_NAME_PUSH_PIN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PushPin" + "'", str0.equals("PushPin"));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.T_FOOT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TFoot" + "'", str0.equals("TFoot"));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.ANNOT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Annot" + "'", str0.equals("Annot"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Polygon" + "'", str0.equals("Polygon"));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.pdfbox.pdmodel.font.FontFormat fontFormat0 = org.apache.pdfbox.pdmodel.font.FontFormat.TTF;
        org.junit.Assert.assertTrue("'" + fontFormat0 + "' != '" + org.apache.pdfbox.pdmodel.font.FontFormat.TTF + "'", fontFormat0.equals(org.apache.pdfbox.pdmodel.font.FontFormat.TTF));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.PSD;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.PSD + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.PSD));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        java.util.Calendar calendar0 = null;
        try {
            java.lang.String str1 = org.apache.pdfbox.util.DateConverter.toISO8601(calendar0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.cos.COSDocument cOSDocument1 = null;
        try {
            org.apache.pdfbox.pdfparser.PDFObjectStreamParser pDFObjectStreamParser2 = new org.apache.pdfbox.pdfparser.PDFObjectStreamParser(cOSStream0, cOSDocument1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.io.InputStream inputStream0 = null;
        java.io.InputStream inputStream1 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner3 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner(inputStream0, inputStream1, (int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection pDTransitionDirection0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.TOP_LEFT_TO_BOTTOM_RIGHT;
        org.junit.Assert.assertTrue("'" + pDTransitionDirection0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.TOP_LEFT_TO_BOTTOM_RIGHT + "'", pDTransitionDirection0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.TOP_LEFT_TO_BOTTOM_RIGHT));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.pdfbox.cos.COSString cOSString0 = null;
        java.io.OutputStream outputStream1 = null;
        try {
            org.apache.pdfbox.pdfwriter.COSWriter.writeString(cOSString0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.SPAN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Span" + "'", str0.equals("Span"));
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.common.PDPageLabelRange.STYLE_DECIMAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "D" + "'", str0.equals("D"));
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_DECORATION_TYPE_UNDERLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Underline" + "'", str0.equals("Underline"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AUTHOR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.io.Closeable closeable0 = null;
        org.apache.pdfbox.io.IOUtils.closeQuietly(closeable0);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_CIRCLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Circle" + "'", str0.equals("Circle"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        org.apache.pdfbox.contentstream.operator.state.SetLineWidth setLineWidth0 = new org.apache.pdfbox.contentstream.operator.state.SetLineWidth();
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare(cOSDictionary0);
        try {
            java.lang.String str2 = fDFAnnotationSquare1.getDate();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.INDEXED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ImportData" + "'", str0.equals("ImportData"));
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BLOCK_ALIGN_MIDDLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Middle" + "'", str0.equals("Middle"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        int i0 = java.awt.Transparency.BITMASK;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CMYK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.InputStream inputStream1 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font3 = org.apache.pdfbox.pdmodel.font.PDType0Font.load(pDDocument0, inputStream1, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection pDTransitionDirection0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.LEFT_TO_RIGHT;
        org.junit.Assert.assertTrue("'" + pDTransitionDirection0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.LEFT_TO_RIGHT + "'", pDTransitionDirection0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.LEFT_TO_RIGHT));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.FORM;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Form" + "'", str0.equals("Form"));
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.pdfbox.contentstream.operator.text.MoveText moveText0 = new org.apache.pdfbox.contentstream.operator.text.MoveText();
        org.apache.pdfbox.contentstream.operator.Operator operator1 = null;
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.FF;
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.FF;
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.ANTI_ALIAS;
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.TYPE1;
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.HARD_LIGHT;
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.INDEXED;
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.CHAR_SET;
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.MARK_INFO;
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.NONE;
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.INDEXED;
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.NONE;
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.HARD_LIGHT;
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.FF;
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.HARD_LIGHT;
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.PANOSE;
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.AUTHOR;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array18 = new org.apache.pdfbox.cos.COSBase[] { cOSName2, cOSName3, cOSName4, cOSName5, cOSName6, cOSName7, cOSName8, cOSName9, cOSName10, cOSName11, cOSName12, cOSName13, cOSName14, cOSName15, cOSName16, cOSName17 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase19 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase19, cOSBase_array18);
        try {
            moveText0.process(operator1, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase19);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(cOSBase_array18);
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.IDENTITY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.LBL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Lbl" + "'", str0.equals("Lbl"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.io.InputStream inputStream0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting1 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream0, memoryUsageSetting1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.pdfbox.pdmodel.common.PDStream pDStream0 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup pDTransparencyGroup1 = new org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroup(pDStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.TH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TH" + "'", str0.equals("TH"));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary.STYLE_SOLID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "S" + "'", str0.equals("S"));
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.pdfbox.pdmodel.PageLayout pageLayout0 = org.apache.pdfbox.pdmodel.PageLayout.SINGLE_PAGE;
        java.lang.String str1 = pageLayout0.stringValue();
        org.junit.Assert.assertTrue("'" + pageLayout0 + "' != '" + org.apache.pdfbox.pdmodel.PageLayout.SINGLE_PAGE + "'", pageLayout0.equals(org.apache.pdfbox.pdmodel.PageLayout.SINGLE_PAGE));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SinglePage" + "'", str1.equals("SinglePage"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText.NAME_NOTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Note" + "'", str0.equals("Note"));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.IMAGE_MASK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.TILING_CONSTANT_SPACING;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.apache.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequence beginMarkedContentSequence0 = new org.apache.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequence();
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText.NAME_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Paragraph" + "'", str0.equals("Paragraph"));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequenceWithProperties beginMarkedContentSequenceWithProperties0 = new org.apache.pdfbox.contentstream.operator.markedcontent.BeginMarkedContentSequenceWithProperties();
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField pDSignatureField1 = new org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField(pDAcroForm0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject2 = new org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject(cOSStream0, resourceCache1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.WRITING_MODE_RLTB;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RlTb" + "'", str0.equals("RlTb"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk();
        fDFAnnotationInk0.setName("Polygon");
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.SUB_FILTER;
        try {
            org.apache.pdfbox.pdmodel.common.PDStream pDStream3 = new org.apache.pdfbox.pdmodel.common.PDStream(pDDocument0, inputStream1, cOSName2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName2);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle pDAnnotationSquareCircle1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle(cOSDictionary0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ASCII85_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        try {
            org.apache.pdfbox.pdmodel.PageMode pageMode1 = org.apache.pdfbox.pdmodel.PageMode.fromString("D");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_DESC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.THREADS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_270_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "270" + "'", str0.equals("270"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OUTPUT_CONDITION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.R;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare(cOSDictionary0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = null;
        try {
            fDFAnnotationSquare1.setFringe(pDRectangle2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection pDTransitionDirection0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.RIGHT_TO_LEFT;
        org.junit.Assert.assertTrue("'" + pDTransitionDirection0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.RIGHT_TO_LEFT + "'", pDTransitionDirection0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.RIGHT_TO_LEFT));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "GoTo" + "'", str0.equals("GoTo"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.common.PDDictionaryWrapper pDDictionaryWrapper1 = new org.apache.pdfbox.pdmodel.common.PDDictionaryWrapper(cOSDictionary0);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.APP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess pDDeviceNProcess1 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNProcess(cOSDictionary0);
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_FINAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Final" + "'", str0.equals("Final"));
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList0 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getAdobeGlyphList();
        java.io.InputStream inputStream1 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList2 = new org.apache.pdfbox.pdmodel.font.encoding.GlyphList(glyphList0, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(glyphList0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TYPE3;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OPT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PANOSE;
        org.apache.pdfbox.pdmodel.PDResources pDResources1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace2 = org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace.create((org.apache.pdfbox.cos.COSBase) cOSName0, pDResources1);
            org.junit.Assert.fail("Expected exception of type org.apache.pdfbox.pdmodel.MissingResourceException");
        } catch (org.apache.pdfbox.pdmodel.MissingResourceException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DARKEN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.JPEG;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.JPEG + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.JPEG));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog2 = fDFDocument1.getCatalog();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.io.InputStream inputStream0 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream0, "Lbl");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Dissolve;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Dissolve + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Dissolve));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        try {
            org.apache.pdfbox.pdfparser.FDFParser fDFParser1 = new org.apache.pdfbox.pdfparser.FDFParser("D");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_POSITION_BEFORE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Before" + "'", str0.equals("Before"));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VERTICES_PER_ROW;
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor1 = null;
        try {
            java.lang.Object obj2 = cOSName0.accept(iCOSVisitor1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound0.setVolume((float) (byte) 1);
        org.apache.pdfbox.cos.COSStream cOSStream3 = null;
        pDActionSound0.setSound(cOSStream3);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo0 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo();
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DESCENT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_OUTSET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Outset" + "'", str0.equals("Outset"));
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PARAMS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.pdfbox.cos.COSString cOSString0 = null;
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination pDNamedDestination1 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination(cOSString0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject pDDefaultAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject();
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.loadXFDF("hi!");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDWindowsLaunchParams.OPERATION_OPEN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "open" + "'", str0.equals("open"));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject1 = new org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject(cOSStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion pDTransitionMotion0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.I;
        org.junit.Assert.assertTrue("'" + pDTransitionMotion0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.I + "'", pDTransitionMotion0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionMotion.I));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.L_BODY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LBody" + "'", str0.equals("LBody"));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.pdfbox.cos.COSArray cOSArray0 = null;
        try {
            org.apache.pdfbox.util.Matrix matrix1 = new org.apache.pdfbox.util.Matrix(cOSArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.LI;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LI" + "'", str0.equals("LI"));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.JS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        java.io.File file0 = null;
        try {
            org.apache.pdfbox.io.RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream1 = new org.apache.pdfbox.io.RandomAccessBufferedFileInputStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.INDEX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CMAP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VIEW_CLIP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.KIDS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIGEST_METHOD;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent renderingIntent0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.PERCEPTUAL;
        org.junit.Assert.assertTrue("'" + renderingIntent0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.PERCEPTUAL + "'", renderingIntent0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.PERCEPTUAL));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "JavaScript" + "'", str0.equals("JavaScript"));
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule fillNonZeroRule0 = new org.apache.pdfbox.contentstream.operator.graphics.FillNonZeroRule();
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.pdfbox.cos.COSArray cOSArray0 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray1 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor2 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(cOSArray0, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDDeviceGray1);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.io.InputStream inputStream0 = null;
        java.io.OutputStream outputStream1 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream2 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream1);
        try {
            long long3 = org.apache.pdfbox.io.IOUtils.copy(inputStream0, outputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING_ETEN_B5_H;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension pDTransitionDimension0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.V;
        org.junit.Assert.assertTrue("'" + pDTransitionDimension0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.V + "'", pDTransitionDimension0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.V));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.pdfbox.contentstream.operator.state.SetLineCapStyle setLineCapStyle0 = new org.apache.pdfbox.contentstream.operator.state.SetLineCapStyle();
        java.lang.String str1 = setLineCapStyle0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "J" + "'", str1.equals("J"));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.RT_GROUP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Group" + "'", str0.equals("Group"));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.EMBEDDED_FDFS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.NEITHER;
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.NEITHER + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.NEITHER));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        pDExportFormatAttributeObject1.setBlockAlign("ImportData");
        pDExportFormatAttributeObject1.setLineHeightAuto();
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.pdfbox.contentstream.operator.state.SetRenderingIntent setRenderingIntent0 = new org.apache.pdfbox.contentstream.operator.state.SetRenderingIntent();
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_NONE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "None" + "'", str0.equals("None"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild pDPropBuild1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuild(cOSDictionary0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String str2 = pDCheckBox1.getOnValue();
        try {
            java.util.Set<java.lang.String> set_str3 = pDCheckBox1.getOnValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BLOCK_ALIGN_AFTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "After" + "'", str0.equals("After"));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.ICO;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.ICO + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.ICO));
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.TIMES_ROMAN;
        float f2 = pDType1Font0.getHeight((int) ' ');
        float f4 = pDType1Font0.getWidth((int) (byte) -1);
        boolean b6 = pDType1Font0.hasGlyph(2);
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue(f4 == 250.0f);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LAST_MODIFIED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline fDFAnnotationUnderline0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline();
        java.lang.String str1 = fDFAnnotationUnderline0.getDate();
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AESV3;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.GTS_PDFA1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary0);
        try {
            java.lang.String str2 = pDArtifactMarkedContent1.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.INDEX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Index" + "'", str0.equals("Index"));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CID_FONT_TYPE0;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        int i0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue.FLAG_REASON;
        org.junit.Assert.assertTrue(i0 == 8);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        try {
            fDFDocument1.close();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.pdfbox.pdfwriter.COSWriter cOSWriter0 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport signingSupport1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport(cOSWriter0);
        signingSupport1.close();
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Link" + "'", str0.equals("Link"));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionThread.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Thread" + "'", str0.equals("Thread"));
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.W;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SOFT_LIGHT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary0);
        java.lang.String str2 = pDShadingType1_1.getType();
        try {
            boolean b3 = pDShadingType1_1.getAntiAlias();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Shading" + "'", str2.equals("Shading"));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        try {
            org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.D;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        java.util.List<java.lang.String> list_str2 = null;
        try {
            pDStream1.setDecodeParms(list_str2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit1 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = fDFIconFit1.getCOSObject();
        try {
            fDFIconFit1.setScaleToFitAnnotation(true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cOSDictionary2);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.Q;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        try {
            cOSStandardOutputStream1.flush();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFileAttachment.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FileAttachment" + "'", str0.equals("FileAttachment"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        try {
            pDCheckBox1.setValue("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        try {
            pDShadingType6_1.setBitsPerCoordinate((int) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        org.apache.pdfbox.io.ScratchFile scratchFile1 = null;
        try {
            org.apache.pdfbox.pdfparser.PDFParser pDFParser2 = new org.apache.pdfbox.pdfparser.PDFParser(randomAccessRead0, scratchFile1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.InputStream inputStream1 = null;
        int[] i_array4 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream5 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream1, i_array4);
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm6 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox7 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm6);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDCheckBox7.getCOSObject();
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray12 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i13 = pDDeviceGray12.getNumberOfComponents();
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject14 = new org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject(pDDocument0, inputStream1, (org.apache.pdfbox.cos.COSBase) cOSDictionary8, (int) 'a', (int) (short) 10, (int) (short) 100, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(pDDeviceGray12);
        org.junit.Assert.assertTrue(i13 == 1);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CID_TO_GID_MAP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.B;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.SUBFILTER_ADBE_PKCS7_SHA1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources3 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources4 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources5 = null;
        org.apache.pdfbox.cos.COSArray cOSArray6 = null;
        try {
            pDVisibleSigBuilder0.injectProcSetArray(pDFormXObject1, pDPage2, pDResources3, pDResources4, pDResources5, cOSArray6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AESV2;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        try {
            org.apache.pdfbox.io.RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream1 = new org.apache.pdfbox.io.RandomAccessBufferedFileInputStream("None");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TARGET;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        pDVisibleSigBuilder0.createInnerFormResource();
        org.apache.pdfbox.pdmodel.PDResources pDResources2 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources3 = null;
        org.apache.pdfbox.cos.COSStream cOSStream4 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream5 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream4);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        java.awt.geom.AffineTransform affineTransform7 = null;
        org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject8 = null;
        try {
            pDVisibleSigBuilder0.createImageForm(pDResources2, pDResources3, pDStream5, pDRectangle6, affineTransform7, pDImageXObject8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle6);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ACRO_FORM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array2 = null;
        try {
            pDRectlinearMeasureDictionary1.setLineSloaps(pDNumberFormatDictionary_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.C0;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.WT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "WT" + "'", str0.equals("WT"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fade;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fade + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Fade));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink fDFAnnotationLink0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink();
        fDFAnnotationLink0.setLocked(true);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        org.junit.Assert.assertNotNull(pDRectangle0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.T_BODY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TBody" + "'", str0.equals("TBody"));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        try {
            org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream1 = org.apache.pdfbox.pdmodel.common.PDObjectStream.createStream(pDDocument0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        java.io.File file0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.load(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDICCBased pDICCBased14 = new org.apache.pdfbox.pdmodel.graphics.color.PDICCBased(cOSArray11);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING_ETEN_B5_V;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.pdfbox.contentstream.operator.state.Save save0 = new org.apache.pdfbox.contentstream.operator.state.Save();
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DOC_CHECKSUM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk();
        fDFAnnotationInk0.setPage((int) (byte) 1);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            long long6 = cOSFilterInputStream4.skip((long) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.fontbox.encoding.Encoding encoding0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.Type1Encoding type1Encoding1 = org.apache.pdfbox.pdmodel.font.encoding.Type1Encoding.fromFontBox(encoding0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.InputStream inputStream1 = null;
        int[] i_array4 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream5 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream1, i_array4);
        try {
            org.apache.pdfbox.pdmodel.common.PDStream pDStream6 = new org.apache.pdfbox.pdmodel.common.PDStream(pDDocument0, (java.io.InputStream) cOSFilterInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectFromPool(cOSObjectKey1);
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSObject cOSObject4 = cOSDocument0.getObjectByType(cOSName3);
        java.util.Map<org.apache.pdfbox.cos.COSObjectKey, java.lang.Long> map_cOSObjectKey_long5 = null;
        try {
            cOSDocument0.addXRefTable(map_cOSObjectKey_long5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_180_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "180" + "'", str0.equals("180"));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        org.apache.pdfbox.pdmodel.interactive.form.PDSignatureField pDSignatureField1 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources2 = null;
        try {
            pDVisibleSigBuilder0.createWidgetDictionary(pDSignatureField1, pDResources2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting6 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument7 = org.apache.pdfbox.pdmodel.PDDocument.load((java.io.InputStream) cOSFilterInputStream4, "Group", memoryUsageSetting6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.SUB_TYPE_CARET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Caret" + "'", str0.equals("Caret"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            pDStream1.setDecodedStreamLength(8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly fDFAnnotationSquiggly0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly();
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_FOR_COMMENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ForComment" + "'", str0.equals("ForComment"));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ART_BOX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary pDNumberFormatDictionary2 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array3 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] { pDNumberFormatDictionary2 };
        try {
            pDRectlinearMeasureDictionary1.setAreas(pDNumberFormatDictionary_array3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDNumberFormatDictionary_array3);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ALPHA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject pDDefaultAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject(cOSDictionary0);
        try {
            java.lang.String str2 = pDDefaultAttributeObject1.toString();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RUN_LENGTH_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionRemoteGoTo.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "GoToR" + "'", str0.equals("GoToR"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.RESOURCES;
        cOSArray11.add((org.apache.pdfbox.pdmodel.common.COSObjectable) cOSName12);
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor14 = null;
        try {
            java.lang.Object obj15 = cOSArray11.accept(iCOSVisitor14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.PDF_DOC_ENCODING;
        try {
            cOSArray7.set(100, (org.apache.pdfbox.cos.COSBase) cOSName9);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(cOSName9);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.DEFAULT_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Standard" + "'", str0.equals("Standard"));
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BPC;
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry pDAppearanceEntry1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceEntry((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FDF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stamp" + "'", str0.equals("Stamp"));
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy publicKeyProtectionPolicy0 = null;
        try {
            org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler publicKeySecurityHandler1 = new org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler(publicKeyProtectionPolicy0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        int i0 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.SHADING_TYPE7;
        org.junit.Assert.assertTrue(i0 == 7);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_OEB_1_00;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "OEB-1.00" + "'", str0.equals("OEB-1.00"));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp fDFAnnotationStamp1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStamp(cOSDictionary0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject pDListAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject();
        pDListAttributeObject0.setListNumbering("open");
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.WIDTH;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        try {
            int i1 = org.apache.pdfbox.pdmodel.common.function.type4.InstructionSequenceBuilder.parseInt("After");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata2 = pDStream1.getMetadata();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        byte[] byte_array5 = org.apache.pdfbox.cos.COSBoolean.TRUE_BYTES;
        try {
            int i6 = cOSFilterInputStream4.read(byte_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(byte_array5);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceCMYK pDDeviceCMYK0 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceCMYK.INSTANCE;
        java.awt.image.WritableRaster writableRaster1 = null;
        try {
            java.awt.image.BufferedImage bufferedImage2 = pDDeviceCMYK0.toRGBImage(writableRaster1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDDeviceCMYK0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.common.PDPageLabelRange.STYLE_LETTERS_UPPER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "A" + "'", str0.equals("A"));
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.io.RandomAccess randomAccess1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject3 = org.apache.pdfbox.pdmodel.graphics.image.CCITTFactory.createFromRandomAccess(pDDocument0, randomAccess1, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CONTENTS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.pdfbox.contentstream.operator.color.SetNonStrokingColor setNonStrokingColor0 = new org.apache.pdfbox.contentstream.operator.color.SetNonStrokingColor();
        java.lang.String str1 = setNonStrokingColor0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "sc" + "'", str1.equals("sc"));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CA_NS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FileAttachment" + "'", str0.equals("FileAttachment"));
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink.HIGHLIGHT_MODE_PUSH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "P" + "'", str0.equals("P"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StrikeOut" + "'", str0.equals("StrikeOut"));
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject3 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary2);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject pDAttributeObject4 = org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject.create(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(pDAttributeObject4);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.PAINT_UNCOLORED;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.EARLY_CHANGE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationSquareCircle.SUB_TYPE_SQUARE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Square" + "'", str0.equals("Square"));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ORDERING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        pDCheckBox1.setPushButton(true);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        try {
            float[] f_array3 = pDShadingType6_1.evalFunction((float) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H1;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H1" + "'", str0.equals("H1"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.pdfbox.multipdf.Overlay.Position position0 = org.apache.pdfbox.multipdf.Overlay.Position.FOREGROUND;
        org.junit.Assert.assertTrue("'" + position0 + "' != '" + org.apache.pdfbox.multipdf.Overlay.Position.FOREGROUND + "'", position0.equals(org.apache.pdfbox.multipdf.Overlay.Position.FOREGROUND));
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        byte[] byte_array6 = new byte[] { (byte) 10 };
        try {
            int i9 = cOSFilterInputStream4.read(byte_array6, 0, (int) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        java.util.Calendar calendar1 = org.apache.pdfbox.util.DateConverter.toCalendar("Polygon");
        org.junit.Assert.assertNull(calendar1);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions0 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound1 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound1.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions0.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f6 = pDActionSound5.getVolume();
        pDFormFieldAdditionalActions0.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound5);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction8 = pDFormFieldAdditionalActions0.getC();
        pDAction8.setType("180");
        org.junit.Assert.assertTrue(f6 == 1.0f);
        org.junit.Assert.assertNotNull(pDAction8);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.Figure;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Figure" + "'", str0.equals("Figure"));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        java.io.Writer writer2 = null;
        try {
            fDFDocument1.writeXML(writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SET_FF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit1 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = fDFIconFit1.getCOSObject();
        try {
            boolean b3 = fDFIconFit1.shouldScaleToFitAnnotation();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cOSDictionary2);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.File file1 = null;
        org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding macExpertEncoding2 = new org.apache.pdfbox.pdmodel.font.encoding.MacExpertEncoding();
        try {
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont3 = org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.load(pDDocument0, file1, (org.apache.pdfbox.pdmodel.font.encoding.Encoding) macExpertEncoding2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.awt.image.BufferedImage bufferedImage1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject2 = org.apache.pdfbox.pdmodel.graphics.image.LosslessFactory.createFromImage(pDDocument0, bufferedImage1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.io.RandomAccess randomAccess1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject3 = org.apache.pdfbox.pdmodel.graphics.image.CCITTFactory.createFromRandomAccess(pDDocument0, randomAccess1, (int) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        try {
            pDCheckBox1.unCheck();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.blend.BlendMode blendMode6 = null;
        pDGraphicsState5.setBlendMode(blendMode6);
        org.junit.Assert.assertNotNull(pDRectangle3);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = org.apache.pdfbox.pdmodel.PDDocument.load(byte_array0, "Paragraph");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSBase cOSBase5 = cOSDictionary2.getItem("Outset");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(cOSBase5);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.pdfbox.text.PDFMarkedContentExtractor pDFMarkedContentExtractor0 = new org.apache.pdfbox.text.PDFMarkedContentExtractor();
        org.apache.pdfbox.util.Matrix matrix7 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray8 = matrix7.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix9 = matrix7.extractScaling();
        pDFMarkedContentExtractor0.setTextMatrix(matrix7);
        matrix7.scale((float) (byte) 0, 10.0f);
        org.apache.pdfbox.util.Matrix matrix14 = matrix7.clone();
        matrix7.translate(0.0f, (float) 8);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix14);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject2 = new org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject(pDStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            org.apache.pdfbox.io.RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream5 = new org.apache.pdfbox.io.RandomAccessBufferedFileInputStream((java.io.InputStream) cOSFilterInputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_ALIGN_CENTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Center" + "'", str0.equals("Center"));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare fDFAnnotationSquare1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare(cOSDictionary0);
        try {
            fDFAnnotationSquare1.setNoView(false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut();
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.pdfbox.pdmodel.PageMode pageMode0 = org.apache.pdfbox.pdmodel.PageMode.USE_OPTIONAL_CONTENT;
        org.junit.Assert.assertTrue("'" + pageMode0 + "' != '" + org.apache.pdfbox.pdmodel.PageMode.USE_OPTIONAL_CONTENT + "'", pageMode0.equals(org.apache.pdfbox.pdmodel.PageMode.USE_OPTIONAL_CONTENT));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode appendMode8 = null;
        try {
            org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream11 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDPage6, appendMode8, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.pdfbox.pdmodel.font.FontMapper fontMapper0 = null;
        org.apache.pdfbox.pdmodel.font.FontMappers.set(fontMapper0);
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.TD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TD" + "'", str0.equals("TD"));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_CSS_1_00;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CSS-1.00" + "'", str0.equals("CSS-1.00"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret fDFAnnotationCaret1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCaret(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DESCENDANT_FONTS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.L;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "L" + "'", str0.equals("L"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject3 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.FORM;
        cOSDictionary2.setString(cOSName5, "J");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed8 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName5);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LEADING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Push;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Push + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Push));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.VERSION1_40_BIT_ALGORITHM;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Circle" + "'", str0.equals("Circle"));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_EXPERIMENTAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Experimental" + "'", str0.equals("Experimental"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FLATE_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.BuiltInEncoding builtInEncoding1 = new org.apache.pdfbox.pdmodel.font.encoding.BuiltInEncoding(map_i_str0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionSound.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Sound" + "'", str0.equals("Sound"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.SUBFILTER_ADBE_PKCS7_DETACHED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        byte[] byte_array5 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        try {
            int i6 = cOSFilterInputStream4.read(byte_array5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(byte_array5);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.encryption.PublicKeySecurityHandler.FILTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Adobe.PubSec" + "'", str0.equals("Adobe.PubSec"));
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_DOUBLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Double" + "'", str0.equals("Double"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        try {
            float f9 = pDCIDFontType0_7.getWidthFromFont((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BLOCK_ALIGN_JUSTIFY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Justify" + "'", str0.equals("Justify"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            pDStream1.addCompression();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction5 = pDAnnotationLink4.getAction();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionURI pDActionURI6 = null;
        pDAnnotationLink4.setPreviousURI(pDActionURI6);
        try {
            pDAnnotationLink4.constructAppearances();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAction5);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.OWNER_PRINT_FIELD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PrintField" + "'", str0.equals("PrintField"));
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PAINT_TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.pdfbox.contentstream.operator.text.MoveText moveText0 = new org.apache.pdfbox.contentstream.operator.text.MoveText();
        java.lang.String str1 = moveText0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Td" + "'", str1.equals("Td"));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        java.lang.String str2 = pDExportFormatAttributeObject1.toString();
        int i3 = pDExportFormatAttributeObject1.getColSpan();
        pDExportFormatAttributeObject1.setWritingMode("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "O=Final" + "'", str2.equals("O=Final"));
        org.junit.Assert.assertTrue(i3 == 1);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFField fDFField1 = new org.apache.pdfbox.pdmodel.fdf.FDFField(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NAME;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LAST_CHAR;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TYPE0;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL;
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText.NAME_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Key" + "'", str0.equals("Key"));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDViewportDictionary.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Viewport" + "'", str0.equals("Viewport"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.UNCHANGED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DOC_TIME_STAMP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.SUB_TYPE_POLYGON;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Polygon" + "'", str0.equals("Polygon"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StructElem" + "'", str0.equals("StructElem"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject pDAttributeObject3 = org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDAttributeObject.create(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(pDAttributeObject3);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ROTATE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_POSITION_AFTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "After" + "'", str0.equals("After"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission1 = new org.apache.pdfbox.pdmodel.encryption.AccessPermission((int) (byte) 100);
        boolean b2 = accessPermission1.canModify();
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY_MEDIA_BOX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MediaBox" + "'", str0.equals("MediaBox"));
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray0 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i1 = pDDeviceGray0.getNumberOfComponents();
        java.awt.image.WritableRaster writableRaster2 = null;
        try {
            java.awt.image.BufferedImage bufferedImage3 = pDDeviceGray0.toRGBImage(writableRaster2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDDeviceGray0);
        org.junit.Assert.assertTrue(i1 == 1);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        org.apache.pdfbox.contentstream.operator.graphics.FillEvenOddRule fillEvenOddRule0 = new org.apache.pdfbox.contentstream.operator.graphics.FillEvenOddRule();
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        org.apache.pdfbox.util.Matrix matrix8 = matrix6.extractScaling();
        matrix8.translate((float) 10L, (float) 10L);
        java.awt.geom.AffineTransform affineTransform12 = null;
        try {
            matrix8.setFromAffineTransform(affineTransform12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode appendMode0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode.PREPEND;
        boolean b1 = appendMode0.isPrepend();
        boolean b2 = appendMode0.isOverwrite();
        org.junit.Assert.assertTrue("'" + appendMode0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode.PREPEND + "'", appendMode0.equals(org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode.PREPEND));
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment.ATTACHMENT_NAME_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tag" + "'", str0.equals("Tag"));
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BITS_PER_FLAG;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RENAME;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        pDAnnotationPopup0.setContents("GoTo");
        org.apache.pdfbox.pdmodel.PDPage pDPage3 = pDAnnotationPopup0.getPage();
        boolean b4 = pDAnnotationPopup0.isNoRotate();
        org.junit.Assert.assertNull(pDPage3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.DOCUMENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Document" + "'", str0.equals("Document"));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE_USE_NONE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UseNone" + "'", str0.equals("UseNone"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_GROOVE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Groove" + "'", str0.equals("Groove"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        try {
            org.apache.pdfbox.multipdf.PageExtractor pageExtractor1 = new org.apache.pdfbox.multipdf.PageExtractor(pDDocument0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting7 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) 10);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument8 = org.apache.pdfbox.pdmodel.PDDocument.load((java.io.InputStream) cOSFilterInputStream4, "JavaScript", memoryUsageSetting7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
        org.junit.Assert.assertNotNull(memoryUsageSetting7);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.F_FILTER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array2 = pDRectlinearMeasureDictionary1.getAreas();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar2 = null;
        pDAnnotationPopup1.setModifiedDate(calendar2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup1.setRectangle(pDRectangle4);
        org.apache.pdfbox.pdmodel.PDPage pDPage6 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream7 = pDPage6.getContentStreams();
        try {
            org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream11 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDPage6, true, false, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNotNull(iterator_pDStream7);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.LOCATION;
        cOSDictionary3.removeItem(cOSName4);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = null;
        org.apache.pdfbox.pdmodel.font.PDCIDFontType0 pDCIDFontType0_7 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType0(cOSDictionary3, pDType0Font6);
        org.apache.fontbox.FontBoxFont fontBoxFont8 = pDCIDFontType0_7.getFontBoxFont();
        try {
            float f10 = pDCIDFontType0_7.getHeight(10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(fontBoxFont8);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.JBIG2_GLOBALS;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectByType(cOSName1);
        cOSDocument0.close();
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm4 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox5 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm4);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDCheckBox5.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary6);
        cOSDictionary6.clear();
        try {
            cOSDocument0.setEncryptionDictionary(cOSDictionary6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName1);
        org.junit.Assert.assertNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSDictionary6);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties pDOptionalContentProperties1 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentProperties(cOSDictionary0);
        try {
            boolean b3 = pDOptionalContentProperties1.isGroupEnabled("A");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.JBIG2_GLOBALS;
        org.apache.pdfbox.cos.COSObject cOSObject2 = cOSDocument0.getObjectByType(cOSName1);
        long long3 = cOSDocument0.getStartXref();
        org.junit.Assert.assertNotNull(cOSName1);
        org.junit.Assert.assertNull(cOSObject2);
        org.junit.Assert.assertTrue(long3 == 0L);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE;
        boolean b1 = renderingMode0.isFill();
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE));
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DL;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PRODUCER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation4 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary3);
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase5 = cOSDictionary3.entrySet();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase5);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
            org.apache.pdfbox.cos.COSArray cOSArray18 = pDShadingType6_1.getBackground();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_ZERO_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "0" + "'", str0.equals("0"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TRANSPARENCY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle3);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream6 = pDPage5.getContentStreams();
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache7 = pDPage5.getResourceCache();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(iterator_pDStream6);
        org.junit.Assert.assertNull(resourceCache7);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SHADING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        fDFAnnotationInk0.setRectangle(pDRectangle1);
        fDFAnnotationInk0.setIntent("");
        java.lang.String str5 = fDFAnnotationInk0.getSubject();
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TU;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.DEFAULT_VERSION;
        org.junit.Assert.assertTrue(i0 == 0);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.InputStream inputStream1 = null;
        int[] i_array4 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream5 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream1, i_array4);
        try {
            org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font6 = org.apache.pdfbox.pdmodel.font.PDType0Font.load(pDDocument0, (java.io.InputStream) cOSFilterInputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.IM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            java.io.OutputStream outputStream2 = pDStream1.createOutputStream();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary0);
        try {
            boolean b2 = pDArtifactMarkedContent1.isTopAttached();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        boolean b0 = org.apache.pdfbox.cos.COSString.FORCE_PARSING;
        org.junit.Assert.assertTrue(b0 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.io.OutputStream outputStream0 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream1 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0);
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream0, (long) 2);
        byte[] byte_array4 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        java.lang.String str5 = org.apache.pdfbox.util.Hex.getString(byte_array4);
        try {
            cOSStandardOutputStream3.write(byte_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "656E6473747265616D" + "'", str5.equals("656E6473747265616D"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        java.io.File file0 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, "RlTb");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText fDFAnnotationText1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationText(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        java.lang.String[] str_array3 = new java.lang.String[] { "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str4, str_array3);
        pDCheckBox1.setExportValues((java.util.List<java.lang.String>) arraylist_str4);
        org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions pDFormFieldAdditionalActions7 = new org.apache.pdfbox.pdmodel.interactive.action.PDFormFieldAdditionalActions();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound8 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        pDActionSound8.setVolume((float) (byte) 1);
        pDFormFieldAdditionalActions7.setC((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound8);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound12 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f13 = pDActionSound12.getVolume();
        pDFormFieldAdditionalActions7.setF((org.apache.pdfbox.pdmodel.interactive.action.PDAction) pDActionSound12);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction15 = pDFormFieldAdditionalActions7.getC();
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction16 = pDFormFieldAdditionalActions7.getK();
        pDCheckBox1.setActions(pDFormFieldAdditionalActions7);
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(f13 == 1.0f);
        org.junit.Assert.assertNotNull(pDAction15);
        org.junit.Assert.assertNull(pDAction16);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie pDActionMovie4 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionMovie(cOSDictionary2);
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo5 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.lang.String str0 = org.apache.pdfbox.pdfparser.COSParser.SYSPROP_EOFLOOKUPRANGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org.apache.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange" + "'", str0.equals("org.apache.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange"));
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_ALIGN_START;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Start" + "'", str0.equals("Start"));
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
        pDPageXYZDestination0.setZoom((float) 0L);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE_USE_OUTLINES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UseOutlines" + "'", str0.equals("UseOutlines"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font0 = null;
        org.apache.pdfbox.cos.COSStream cOSStream1 = null;
        org.apache.pdfbox.pdmodel.font.PDType3CharProc pDType3CharProc2 = new org.apache.pdfbox.pdmodel.font.PDType3CharProc(pDType3Font0, cOSStream1);
        try {
            float f3 = pDType3CharProc2.getWidth();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.io.RandomAccess randomAccess1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject3 = org.apache.pdfbox.pdmodel.graphics.image.CCITTFactory.createFromRandomAccess(pDDocument0, randomAccess1, 7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PARENT_TREE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.NEF;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.NEF + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.NEF));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation4 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary3);
        java.lang.String str5 = pDDocumentInformation4.getProducer();
        java.lang.String str6 = pDDocumentInformation4.getSubject();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_CIRCLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Circle" + "'", str0.equals("Circle"));
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty1 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(pDUserAttributeObject0);
        try {
            pDUserProperty1.setName("SinglePage");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_CLIP;
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_CLIP + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_CLIP));
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BACKGROUND;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getBaselineShift();
        java.lang.String str3 = pDExportFormatAttributeObject1.getBlockAlign();
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Before" + "'", str3.equals("Before"));
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        org.apache.pdfbox.util.QuickSort.sort((java.util.List<java.lang.String>) arraylist_str9);
        org.junit.Assert.assertNotNull(str_array8);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RECT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.XREF;
        org.apache.pdfbox.cos.COSName cOSName5 = cOSDictionary3.getCOSName(cOSName4);
        org.apache.pdfbox.pdmodel.PDResources pDResources6 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace7 = org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace.create((org.apache.pdfbox.cos.COSBase) cOSName5, pDResources6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(cOSName5);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
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
        try {
            org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification pDFileSpecification12 = org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification.createFS((org.apache.pdfbox.cos.COSBase) cOSName9);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(i11 == (-1));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.UNKNOWN;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.UNKNOWN + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.UNKNOWN));
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline fDFAnnotationUnderline0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline();
        boolean b1 = fDFAnnotationUnderline0.isReadOnly();
        java.lang.String str2 = fDFAnnotationUnderline0.getRichContents();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        java.lang.String[] str_array13 = new java.lang.String[] { "TFoot", "", "Span", "SinglePage", "Shading", "ImportData", "Shading", "SinglePage", "RlTb", "R", "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str14, str_array13);
        java.util.Spliterator<java.lang.String> spliterator_str16 = arraylist_str14.spliterator();
        java.util.stream.Stream<java.lang.String> stream_str17 = arraylist_str14.parallelStream();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.types = arraylist_str14;
        try {
            pDStream1.setFileDecodeParams((java.util.List<java.lang.String>) arraylist_str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(spliterator_str16);
        org.junit.Assert.assertNotNull(stream_str17);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit1 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = fDFIconFit1.getCOSObject();
        try {
            fDFIconFit1.setScaleType("Index");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cOSDictionary2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.pdfbox.contentstream.operator.text.ShowTextLine showTextLine0 = new org.apache.pdfbox.contentstream.operator.text.ShowTextLine();
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        try {
            int i2 = pDStream1.getLength();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.TILING_CONSTANT_SPACING_FASTER_TILING;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE nON_FULL_SCREEN_PAGE_MODE0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseNone;
        org.junit.Assert.assertTrue("'" + nON_FULL_SCREEN_PAGE_MODE0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseNone + "'", nON_FULL_SCREEN_PAGE_MODE0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseNone));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MATRIX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject();
        boolean b2 = pDTableAttributeObject0.isSpecified("RlTb");
        java.lang.String[] str_array4 = new java.lang.String[] { "Index" };
        pDTableAttributeObject0.setHeaders(str_array4);
        int i6 = pDTableAttributeObject0.getColSpan();
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertNotNull(str_array4);
        org.junit.Assert.assertTrue(i6 == 1);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.pdfbox.contentstream.operator.graphics.EndPath endPath0 = new org.apache.pdfbox.contentstream.operator.graphics.EndPath();
        java.lang.String str1 = endPath0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "n" + "'", str1.equals("n"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceRGBColor setNonStrokingDeviceRGBColor0 = new org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceRGBColor();
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ALTERNATE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.form.PDFieldTree pDFieldTree1 = new org.apache.pdfbox.pdmodel.interactive.form.PDFieldTree(pDAcroForm0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab19 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab(cOSArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEFAULT_CMYK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.pdfbox.pdmodel.MissingResourceException missingResourceException1 = new org.apache.pdfbox.pdmodel.MissingResourceException("");
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ML;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary0);
        java.lang.String str2 = pDArtifactMarkedContent1.getAlternateDescription();
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.TIMES_ROMAN;
        float f2 = pDType1Font0.getHeight((int) ' ');
        float f4 = pDType1Font0.getWidth((int) (byte) -1);
        try {
            pDType1Font0.addToSubset((int) (byte) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue(f2 == 0.0f);
        org.junit.Assert.assertTrue(f4 == 250.0f);
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.pdfbox.contentstream.operator.graphics.CurveToReplicateFinalPoint curveToReplicateFinalPoint0 = new org.apache.pdfbox.contentstream.operator.graphics.CurveToReplicateFinalPoint();
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        java.io.OutputStream outputStream2 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream2);
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream5 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream2, (long) 2);
        try {
            fDFDocument1.save((java.io.OutputStream) cOSStandardOutputStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = org.apache.pdfbox.pdmodel.fdf.FDFDocument.loadXFDF("PushPin");
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PATTERN_TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OCPROPERTIES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEFAULT_RGB;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array2 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] {};
        try {
            pDRectlinearMeasureDictionary1.setAngles(pDNumberFormatDictionary_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDNumberFormatDictionary_array2);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_SLASH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Slash" + "'", str0.equals("Slash"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PROC_SET;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream1 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead0);
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead3 = null;
        org.apache.pdfbox.io.RandomAccessInputStream randomAccessInputStream4 = new org.apache.pdfbox.io.RandomAccessInputStream(randomAccessRead3);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument6 = org.apache.pdfbox.pdmodel.PDDocument.load((java.io.InputStream) randomAccessInputStream1, "LBody", (java.io.InputStream) randomAccessInputStream4, "180");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.BLOCK_QUOTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BlockQuote" + "'", str0.equals("BlockQuote"));
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder pDVisibleSigBuilder0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSigBuilder();
        pDVisibleSigBuilder0.createInnerFormResource();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = null;
        try {
            pDVisibleSigBuilder0.createHolderFormStream(pDDocument2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Sound" + "'", str0.equals("Sound"));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary0);
        try {
            float[] f_array3 = pDShadingType1_1.evalFunction((float) '#');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
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
        java.lang.String str29 = fDFAnnotationFreeText0.getRotation();
        float[] f_array30 = fDFAnnotationFreeText0.getCallout();
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
        org.junit.Assert.assertNull(str29);
        org.junit.Assert.assertNotNull(f_array30);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PARENT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType xRefType0 = org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType.STREAM;
        org.junit.Assert.assertTrue("'" + xRefType0 + "' != '" + org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType.STREAM + "'", xRefType0.equals(org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType.STREAM));
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        org.apache.pdfbox.cos.COSName cOSName12 = pDColor10.getPatternName();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertNotNull(cOSName12);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H3;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H3" + "'", str0.equals("H3"));
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.COMPONENTS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.pdfbox.util.Matrix matrix6 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray7 = matrix6.toCOSArray();
        java.lang.String str9 = cOSArray7.getString((int) (byte) 1);
        try {
            org.apache.pdfbox.cos.COSBase cOSBase11 = cOSArray7.get(100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.pdfbox.pdmodel.PDResources pDResources0 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN1 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        org.apache.pdfbox.pdmodel.graphics.color.PDPattern pDPattern2 = new org.apache.pdfbox.pdmodel.graphics.color.PDPattern(pDResources0, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN1);
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceNAttributes pDDeviceNAttributes3 = pDDeviceN1.getAttributes();
        org.junit.Assert.assertNull(pDDeviceNAttributes3);
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MAC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Line" + "'", str0.equals("Line"));
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
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
        pDSeedValueTimeStamp18.setURL("");
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(matrix8);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolyline.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Polyline" + "'", str0.equals("Polyline"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
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
        boolean b29 = fDFAnnotationFreeText0.isLocked();
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
        org.junit.Assert.assertTrue(b29 == false);
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NORMAL;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.pdfbox.contentstream.operator.text.BeginText beginText0 = new org.apache.pdfbox.contentstream.operator.text.BeginText();
        java.lang.String str1 = beginText0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BT" + "'", str1.equals("BT"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        int i1 = signatureOptions0.getPage();
        int i2 = signatureOptions0.getPage();
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary[] pDNumberFormatDictionary_array2 = pDRectlinearMeasureDictionary1.getLineSloaps();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_POSITION_INLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Inline" + "'", str0.equals("Inline"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        int i2 = pDShadingType6_1.getShadingType();
        org.junit.Assert.assertTrue(i2 == 6);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed pDActionNamed7 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionNamed(cOSDictionary3);
        java.lang.String str10 = cOSDictionary3.getEmbeddedString("sc", "After");
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm12 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox13 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm12);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary14 = pDCheckBox13.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject pDTableAttributeObject15 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject(cOSDictionary14);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget pDAnnotationWidget16 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationWidget(cOSDictionary14);
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.FORM;
        cOSDictionary14.setString(cOSName17, "J");
        cOSDictionary3.setItem(cOSName11, (org.apache.pdfbox.cos.COSBase) cOSName17);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(cOSDictionary14);
        org.junit.Assert.assertNotNull(cOSName17);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        java.io.File file2 = null;
        try {
            fDFDocument1.save(file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Stamp" + "'", str0.equals("Stamp"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary0);
        int i2 = pDArtifactMarkedContent1.getMCID();
        try {
            boolean b3 = pDArtifactMarkedContent1.isTopAttached();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i2 == (-1));
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FIRST;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.pdfbox.pdmodel.graphics.PDFontSetting pDFontSetting0 = new org.apache.pdfbox.pdmodel.graphics.PDFontSetting();
        org.apache.pdfbox.pdmodel.font.PDFont pDFont1 = pDFontSetting0.getFont();
        org.junit.Assert.assertNull(pDFont1);
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        long long6 = cOSDictionary3.getLong("Note");
        org.apache.pdfbox.pdmodel.encryption.PDEncryption pDEncryption7 = new org.apache.pdfbox.pdmodel.encryption.PDEncryption(cOSDictionary3);
        pDEncryption7.setFilter("Document");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FreeText" + "'", str0.equals("FreeText"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.PCX;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.PCX + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.PCX));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        float f2 = pDExportFormatAttributeObject1.getStartIndent();
        pDExportFormatAttributeObject1.setAllColumnWidths((int) (byte) -1);
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        pDAnnotationPopup0.setReadOnly(false);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor3 = pDAnnotationPopup0.getColor();
        java.lang.String str4 = pDAnnotationPopup0.getSubtype();
        org.junit.Assert.assertNull(pDColor3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Popup" + "'", str4.equals("Popup"));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.InputStream inputStream1 = null;
        int[] i_array4 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream5 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream1, i_array4);
        try {
            org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font6 = new org.apache.pdfbox.pdmodel.font.PDType1Font(pDDocument0, inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array4);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray0 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i1 = pDDeviceGray0.getNumberOfComponents();
        org.apache.pdfbox.cos.COSBase cOSBase2 = pDDeviceGray0.getCOSObject();
        org.junit.Assert.assertNotNull(pDDeviceGray0);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertNotNull(cOSBase2);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
        try {
            java.util.List<java.lang.String> list_str19 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertCOSNameCOSArrayToList(cOSArray15);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNull(str18);
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LEGAL_ATTESTATION;
        java.lang.String str1 = cOSName0.toString();
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "COSName{LegalAttestation}" + "'", str1.equals("COSName{LegalAttestation}"));
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary pDRectlinearMeasureDictionary1 = new org.apache.pdfbox.pdmodel.interactive.measurement.PDRectlinearMeasureDictionary(cOSDictionary0);
        try {
            float[] f_array2 = pDRectlinearMeasureDictionary1.getCoordSystemOrigin();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.SUBFILTER_ADBE_X509_RSA_SHA1;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.VERSION4_SECURITY_HANDLER;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE;
        int i1 = renderingMode0.intValue();
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.STROKE));
        org.junit.Assert.assertTrue(i1 == 1);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AFTER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        java.io.InputStream inputStream0 = null;
        int[] i_array3 = new int[] { 10, (short) 100 };
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream cOSFilterInputStream4 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.COSFilterInputStream(inputStream0, i_array3);
        try {
            int i5 = cOSFilterInputStream4.read();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(i_array3);
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode();
        org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> pdnametreenode_pDActionJavaScript1 = pDJavascriptNameTreeNode0.getParent();
        java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> map_str_pDActionJavaScript2 = null;
        try {
            pdnametreenode_pDActionJavaScript1.setNames(map_str_pDActionJavaScript2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(pdnametreenode_pDActionJavaScript1);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.TIMES_BOLD_ITALIC;
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.FRACTIONAL_DISPLAY_FRACTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "F" + "'", str0.equals("F"));
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MAX_LEN;
        org.apache.pdfbox.contentstream.operator.text.MoveTextSetLeading moveTextSetLeading1 = new org.apache.pdfbox.contentstream.operator.text.MoveTextSetLeading();
        boolean b2 = cOSName0.equals((java.lang.Object) moveTextSetLeading1);
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Square");
        pDExportFormatAttributeObject1.setAllBorderStyles("RlTb");
        float[] f_array4 = null;
        try {
            pDExportFormatAttributeObject1.setBorderThicknesses(f_array4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary0);
        int i2 = pDShadingType1_1.getShadingType();
        org.junit.Assert.assertTrue(i2 == 1);
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Popup" + "'", str0.equals("Popup"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_LOWER_ALPHA;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LowerAlpha" + "'", str0.equals("LowerAlpha"));
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink.HIGHLIGHT_MODE_INVERT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "I" + "'", str0.equals("I"));
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
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
        cOSArray28.setString((int) (byte) 1, "StructElem");
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
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.INLINE_ALIGN_START;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Start" + "'", str0.equals("Start"));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6 pDShadingType6_1 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType6(cOSDictionary0);
        try {
            pDShadingType6_1.setBitsPerComponent((int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.COORDS;
        long long5 = cOSDictionary2.getLong(cOSName4);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertTrue(long5 == (-1L));
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        java.lang.String[] str_array13 = new java.lang.String[] { "TFoot", "", "Span", "SinglePage", "Shading", "ImportData", "Shading", "SinglePage", "RlTb", "R", "Underline" };
        java.util.ArrayList<java.lang.String> arraylist_str14 = new java.util.ArrayList<java.lang.String>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) arraylist_str14, str_array13);
        java.util.Spliterator<java.lang.String> spliterator_str16 = arraylist_str14.spliterator();
        try {
            pDStream1.setDecodeParms((java.util.List<java.lang.String>) arraylist_str14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(spliterator_str16);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.common.COSDictionaryMap<java.lang.String, java.lang.Object> cosdictionarymap_str_obj1 = org.apache.pdfbox.pdmodel.common.COSDictionaryMap.convertBasicTypesToMap(cOSDictionary0);
        org.junit.Assert.assertNull(cosdictionarymap_str_obj1);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        float[] f_array22 = null;
        try {
            pDExportFormatAttributeObject16.setColumnGaps(f_array22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(matrix9);
        org.junit.Assert.assertNotNull(matrix14);
        org.junit.Assert.assertTrue(f17 == 0.0f);
        org.junit.Assert.assertTrue(b21 == false);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        float[] f_array0 = null;
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.ROWS;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN2 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor3 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array0, cOSName1, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceN2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName1);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.pdfbox.cos.COSArray cOSArray0 = new org.apache.pdfbox.cos.COSArray();
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_DASHED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Dashed" + "'", str0.equals("Dashed"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo();
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.prepress.PDBoxStyle.GUIDELINE_STYLE_DASHED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "D" + "'", str0.equals("D"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction5 = pDAnnotationLink4.getAction();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject7 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        pDExportFormatAttributeObject7.setTextIndent((float) 100);
        float[] f_array16 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName17 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray18 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i19 = pDDeviceGray18.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor20 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array16, cOSName17, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray18);
        pDExportFormatAttributeObject7.setPaddings(f_array16);
        pDAnnotationLink4.setQuadPoints(f_array16);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAction5);
        org.junit.Assert.assertNotNull(f_array16);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNotNull(pDDeviceGray18);
        org.junit.Assert.assertTrue(i19 == 1);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = new org.apache.pdfbox.pdmodel.common.PDRectangle((float) 7, (float) 1L, (float) (-1), (float) 100L);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup pDAnnotationPopup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationPopup();
        java.util.Calendar calendar1 = null;
        pDAnnotationPopup0.setModifiedDate(calendar1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle3 = org.apache.pdfbox.pdmodel.common.PDRectangle.LETTER;
        pDAnnotationPopup0.setRectangle(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState pDGraphicsState5 = new org.apache.pdfbox.pdmodel.graphics.state.PDGraphicsState(pDRectangle3);
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace6 = pDGraphicsState5.getStrokingColorSpace();
        boolean b7 = pDGraphicsState5.isAlphaSource();
        java.awt.Composite composite8 = pDGraphicsState5.getStrokingJavaComposite();
        org.junit.Assert.assertNotNull(pDRectangle3);
        org.junit.Assert.assertNotNull(pDColorSpace6);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(composite8);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.pdfbox.cos.COSBoolean cOSBoolean1 = org.apache.pdfbox.cos.COSBoolean.getBoolean(true);
        java.lang.String str2 = cOSBoolean1.toString();
        org.junit.Assert.assertNotNull(cOSBoolean1);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "true" + "'", str2.equals("true"));
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquare.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Square" + "'", str0.equals("Square"));
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.VERSION3_UNPUBLISHED_ALGORITHM;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.PAINT_COLORED;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEVICECMYK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode appendMode0 = org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.PREPEND;
        org.junit.Assert.assertTrue("'" + appendMode0 + "' != '" + org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.PREPEND + "'", appendMode0.equals(org.apache.pdfbox.pdmodel.PDPageContentStream.AppendMode.PREPEND));
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIGEST_SHA256;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCRYPT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        byte[] byte_array21 = new byte[] { (byte) -1, (byte) 0, (byte) 0, (byte) 10, (byte) 100, (byte) 10 };
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font22 = org.apache.pdfbox.pdmodel.font.PDType1Font.COURIER_BOLD_OBLIQUE;
        byte[] byte_array24 = pDType1Font22.encode("Slash");
        byte[] byte_array25 = org.apache.pdfbox.pdfwriter.COSWriter.ENDSTREAM;
        java.lang.String str26 = org.apache.pdfbox.util.Hex.getString(byte_array25);
        byte[] byte_array32 = new byte[] { (byte) 100, (byte) 10, (byte) -1, (byte) 1 };
        try {
            boolean b36 = standardSecurityHandler13.isOwnerPassword(byte_array21, byte_array24, byte_array25, (int) (byte) 0, byte_array32, (int) (byte) 1, (int) (byte) 1, false);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(long6 == (-1L));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "270" + "'", str12.equals("270"));
        org.junit.Assert.assertNotNull(byte_array21);
        org.junit.Assert.assertNotNull(pDType1Font22);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array25);
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "656E6473747265616D" + "'", str26.equals("656E6473747265616D"));
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Glitter;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Glitter + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Glitter));
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.pdfbox.pdmodel.font.FontMapper fontMapper0 = org.apache.pdfbox.pdmodel.font.FontMappers.instance();
        org.junit.Assert.assertNotNull(fontMapper0);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        java.io.OutputStream outputStream2 = null;
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream2);
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream5 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream(outputStream2, (long) 2);
        try {
            fDFDocument1.save(outputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY_TRIM_BOX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TrimBox" + "'", str0.equals("TrimBox"));
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray0 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i1 = pDDeviceGray0.getNumberOfComponents();
        float[] f_array3 = pDDeviceGray0.getDefaultDecode((int) (short) 0);
        int i4 = pDDeviceGray0.getNumberOfComponents();
        org.junit.Assert.assertNotNull(pDDeviceGray0);
        org.junit.Assert.assertTrue(i1 == 1);
        org.junit.Assert.assertNotNull(f_array3);
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CO;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        int i0 = java.awt.print.Pageable.UNKNOWN_NUMBER_OF_PAGES;
        org.junit.Assert.assertTrue(i0 == (-1));
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSInteger.THREE;
        org.junit.Assert.assertNotNull(cOSInteger0);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
        org.apache.pdfbox.pdmodel.common.function.PDFunction pDFunction17 = pDShadingType3_7.getFunction();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(cOSArray15);
        org.junit.Assert.assertNull(pDFunction17);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine5 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(cOSDictionary3);
        float f6 = fDFAnnotationLine5.getLeaderOffset();
        fDFAnnotationLine5.setCaptionStyle("Experimental");
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertTrue(f6 == (-1.0f));
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_SQUARE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Square" + "'", str0.equals("Square"));
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler pDCircleAppearanceHandler5 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDCircleAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine4);
        try {
            pDCircleAppearanceHandler5.generateAppearanceStreams();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        float[] f_array6 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray8 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i9 = pDDeviceGray8.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor10 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray8);
        org.apache.pdfbox.cos.COSArray cOSArray11 = pDColor10.toCOSArray();
        boolean b12 = pDColor10.isPattern();
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(pDDeviceGray8);
        org.junit.Assert.assertTrue(i9 == 1);
        org.junit.Assert.assertNotNull(cOSArray11);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly fDFAnnotationSquiggly1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSquiggly(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
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
        float f19 = matrix9.getYPosition();
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(paint17);
        org.junit.Assert.assertNotNull(matrix18);
        org.junit.Assert.assertTrue(f19 == 0.0f);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(cOSStream0);
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.IDENTITY_V;
        try {
            java.io.OutputStream outputStream3 = pDStream1.createOutputStream(cOSName2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName2);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_HIDDEN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Hidden" + "'", str0.equals("Hidden"));
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        try {
            java.lang.String str3 = pDCheckBox1.getValue();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary2);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H5;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H5" + "'", str0.equals("H5"));
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BTN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.fontbox.ttf.TrueTypeFont trueTypeFont1 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font3 = org.apache.pdfbox.pdmodel.font.PDType0Font.load(pDDocument0, trueTypeFont1, true);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.pdfbox.contentstream.operator.graphics.MoveTo moveTo0 = new org.apache.pdfbox.contentstream.operator.graphics.MoveTo();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup3 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup(cOSDictionary2);
        java.lang.String[] str_array5 = new java.lang.String[] { "270" };
        org.apache.pdfbox.cos.COSBase cOSBase6 = cOSDictionary2.getDictionaryObject(str_array5);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference pDMarkedContentReference7 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkedContentReference(cOSDictionary2);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDMarkedContentReference7.getCOSObject();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(str_array5);
        org.junit.Assert.assertNull(cOSBase6);
        org.junit.Assert.assertNotNull(cOSDictionary8);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox pDCheckBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDCheckBox(pDAcroForm0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = pDCheckBox1.getCOSObject();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary3 = new org.apache.pdfbox.cos.COSDictionary(cOSDictionary2);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink pDAnnotationLink4 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink(cOSDictionary3);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary5 = null;
        pDAnnotationLink4.setBorderStyle(pDBorderStyleDictionary5);
        org.apache.pdfbox.pdmodel.interactive.action.PDAction pDAction7 = pDAnnotationLink4.getAction();
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNull(pDAction7);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BOUNDS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        float[] f_array1 = null;
        try {
            float[] f_array2 = pDSeparation0.toRGB(f_array1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocumentCatalog pDDocumentCatalog1 = new org.apache.pdfbox.pdmodel.PDDocumentCatalog(pDDocument0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict pDPropBuildDataDict0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDPropBuildDataDict();
        pDPropBuildDataDict0.setRevision(100L);
        pDPropBuildDataDict0.setVersion("PrintField");
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit setLineMiterLimit0 = new org.apache.pdfbox.contentstream.operator.state.SetLineMiterLimit();
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
            setLineMiterLimit0.process(operator2, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67);
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
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
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("Final");
        pDExportFormatAttributeObject1.setTextIndent((float) 100);
        pDExportFormatAttributeObject1.setGlyphOrientationVertical("JavaScript");
        pDExportFormatAttributeObject1.setHeightAuto();
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.pdfbox.contentstream.operator.graphics.CloseAndStrokePath closeAndStrokePath0 = new org.apache.pdfbox.contentstream.operator.graphics.CloseAndStrokePath();
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
            closeAndStrokePath0.process(operator2, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase67);
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
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CATALOG;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.pdfbox.contentstream.operator.state.SetLineJoinStyle setLineJoinStyle0 = new org.apache.pdfbox.contentstream.operator.state.SetLineJoinStyle();
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A3;
        org.junit.Assert.assertNotNull(pDRectangle0);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
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
        matrix9.scale((-1.0f), (float) 8);
        org.junit.Assert.assertNotNull(cOSArray10);
        org.junit.Assert.assertNotNull(matrix11);
        org.junit.Assert.assertNotNull(matrix16);
        org.junit.Assert.assertNotNull(paint17);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.pdfbox.pdfparser.XrefTrailerResolver xrefTrailerResolver0 = new org.apache.pdfbox.pdfparser.XrefTrailerResolver();
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey1 = null;
        try {
            xrefTrailerResolver0.setXRef(cOSObjectKey1, (long) (short) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        float f17 = cOSDocument0.getVersion();
        org.junit.Assert.assertNotNull(cOSObject2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNull(cOSObject4);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue(f17 == 1.4f);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
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
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.PRINT_SCALING pRINT_SCALING22 = null;
        try {
            pDViewerPreferences21.setPrintScaling(pRINT_SCALING22);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
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
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline fDFAnnotationUnderline0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline();
        float[] f_array7 = new float[] { 100.0f, (byte) -1, ' ', (byte) 10, 1, (byte) 10 };
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray pDDeviceGray9 = org.apache.pdfbox.pdmodel.graphics.color.PDDeviceGray.INSTANCE;
        int i10 = pDDeviceGray9.getNumberOfComponents();
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor11 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array7, cOSName8, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDDeviceGray9);
        fDFAnnotationUnderline0.setCoords(f_array7);
        float[] f_array13 = fDFAnnotationUnderline0.getCoords();
        org.junit.Assert.assertNotNull(f_array7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(pDDeviceGray9);
        org.junit.Assert.assertTrue(i10 == 1);
        org.junit.Assert.assertNotNull(f_array13);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }
}

