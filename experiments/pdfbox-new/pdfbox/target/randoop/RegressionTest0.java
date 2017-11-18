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
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.TD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TD" + "'", str0.equals("TD"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING_ETEN_B5_H;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        java.io.InputStream inputStream1 = null;
        org.apache.pdfbox.pdmodel.font.encoding.Encoding encoding2 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont3 = org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.load(pDDocument0, inputStream1, encoding2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType xRefType0 = org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType.TABLE;
        org.junit.Assert.assertTrue("'" + xRefType0 + "' != '" + org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType.TABLE + "'", xRefType0.equals(org.apache.pdfbox.pdfparser.XrefTrailerResolver.XRefType.TABLE));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        java.io.InputStream inputStream0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList2 = new org.apache.pdfbox.pdmodel.font.encoding.GlyphList(inputStream0, (-1));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.BIB_ENTRY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BibEntry" + "'", str0.equals("BibEntry"));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage1 = null;
        try {
            org.apache.pdfbox.pdmodel.PDPageContentStream pDPageContentStream5 = new org.apache.pdfbox.pdmodel.PDPageContentStream(pDDocument0, pDPage1, false, true, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "StructElem" + "'", str0.equals("StructElem"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary.STYLE_INSET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "I" + "'", str0.equals("I"));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.pdfbox.cos.COSArray cOSArray0 = null;
        java.util.List<java.lang.Integer> list_i1 = org.apache.pdfbox.pdmodel.common.COSArrayList.convertIntegerCOSArrayToList(cOSArray0);
        org.junit.Assert.assertNull(list_i1);
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.DOCUMENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Document" + "'", str0.equals("Document"));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.cos.COSDocument cOSDocument1 = null;
        org.apache.pdfbox.pdfparser.XrefTrailerResolver xrefTrailerResolver2 = null;
        try {
            org.apache.pdfbox.pdfparser.PDFXrefStreamParser pDFXrefStreamParser3 = new org.apache.pdfbox.pdfparser.PDFXrefStreamParser(cOSStream0, cOSDocument1, xrefTrailerResolver2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION_L2R;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "L2R" + "'", str0.equals("L2R"));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList0 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getAdobeGlyphList();
        try {
            java.lang.String str2 = glyphList0.codePointToName((int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(glyphList0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FB;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BASE_ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_EXPIRED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Expired" + "'", str0.equals("Expired"));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_DECIMAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Decimal" + "'", str0.equals("Decimal"));
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        try {
            org.apache.pdfbox.pdfparser.PDFParser pDFParser1 = new org.apache.pdfbox.pdfparser.PDFParser(randomAccessRead0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        java.io.InputStream inputStream0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting2 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument3 = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream0, "Decimal", memoryUsageSetting2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.BMP;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.BMP + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.BMP));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.io.File file0 = null;
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject2 = org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.createFromFileByExtension(file0, pDDocument1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NON_EFONT_NO_WARN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setStartIndent((float) 100);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PARENT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2 pDShadingType2_0 = null;
        java.awt.image.ColorModel colorModel1 = null;
        java.awt.geom.AffineTransform affineTransform2 = null;
        org.apache.pdfbox.util.Matrix matrix3 = null;
        java.awt.Rectangle rectangle4 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.shading.AxialShadingContext axialShadingContext5 = new org.apache.pdfbox.pdmodel.graphics.shading.AxialShadingContext(pDShadingType2_0, colorModel1, affineTransform2, matrix3, rectangle4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination pDNamedDestination1 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDNamedDestination("Expired");
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight();
        java.lang.String str1 = fDFAnnotationHighlight0.getTitle();
        fDFAnnotationHighlight0.setNoView(false);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.B;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.BLOCK_QUOTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BlockQuote" + "'", str0.equals("BlockQuote"));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.pdfbox.pdmodel.common.PDDictionaryWrapper pDDictionaryWrapper0 = new org.apache.pdfbox.pdmodel.common.PDDictionaryWrapper();
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup.SUB_TYPE_HIGHLIGHT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Highlight" + "'", str0.equals("Highlight"));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STATUS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFIconFit.SCALE_OPTION_ALWAYS;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "A" + "'", str0.equals("A"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.RIFF;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.RIFF + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.RIFF));
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_CLIP;
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_CLIP + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.FILL_CLIP));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LLO;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setListNumbering("Start");
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage3 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage5 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle4);
        try {
            pDPageTree0.insertAfter(pDPage3, pDPage5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        java.nio.charset.Charset charset0 = org.apache.pdfbox.util.Charsets.WINDOWS_1252;
        org.junit.Assert.assertNotNull(charset0);
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION rEADING_DIRECTION0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.R2L;
        org.junit.Assert.assertTrue("'" + rEADING_DIRECTION0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.R2L + "'", rEADING_DIRECTION0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.R2L));
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.fdf.FDFJavaScript fDFJavaScript2 = null;
        try {
            fDFDictionary1.setJavaScript(fDFJavaScript2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.pdfbox.cos.COSArray cOSArray0 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDLab pDLab1 = new org.apache.pdfbox.pdmodel.graphics.color.PDLab(cOSArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingMode renderingMode0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.NEITHER_CLIP;
        org.junit.Assert.assertTrue("'" + renderingMode0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.NEITHER_CLIP + "'", renderingMode0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingMode.NEITHER_CLIP));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.WHITE_POINT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_XML_1_00;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "XML-1.00" + "'", str0.equals("XML-1.00"));
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NUMS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LZW_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation1 = null;
        try {
            pDDocument0.setDocumentInformation(pDDocumentInformation1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        try {
            org.apache.pdfbox.cos.COSStream cOSStream2 = fDFDictionary1.getDifferences();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SV;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TRUE_TYPE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm pDActionResetForm1 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm(cOSDictionary0);
        try {
            java.lang.String str2 = pDActionResetForm1.getType();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIGEST_METHOD;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        byte[] byte_array2 = new byte[] { (byte) 1, (byte) 10 };
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite3 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream4 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite3);
        try {
            org.apache.pdfbox.util.Hex.writeHexBytes(byte_array2, (java.io.OutputStream) randomAccessOutputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite1 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream2 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite1);
        try {
            pDDocument0.saveIncremental((java.io.OutputStream) randomAccessOutputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.JPEG;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.JPEG + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.JPEG));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LIGHTEN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent renderingIntent0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.ABSOLUTE_COLORIMETRIC;
        java.lang.String str1 = renderingIntent0.stringValue();
        org.junit.Assert.assertTrue("'" + renderingIntent0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.ABSOLUTE_COLORIMETRIC + "'", renderingIntent0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.ABSOLUTE_COLORIMETRIC));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "AbsoluteColorimetric" + "'", str1.equals("AbsoluteColorimetric"));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        java.io.InputStream inputStream0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList2 = new org.apache.pdfbox.pdmodel.font.encoding.GlyphList(inputStream0, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_DECORATION_TYPE_OVERLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Overline" + "'", str0.equals("Overline"));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference1 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference(cOSDictionary0);
        try {
            java.lang.String str2 = fDFNamedPageReference1.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_FILE2;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VIEWER_PREFERENCES;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk fDFAnnotationInk1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationInk(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FLATE_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.BleedBox;
        org.junit.Assert.assertTrue("'" + bOUNDARY0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.BleedBox + "'", bOUNDARY0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.BleedBox));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.pdfbox.cos.COSStream cOSStream0 = null;
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream1 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream0);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.GAMMA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.lang.String str1 = pDAnnotationLine0.getModifiedDate();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary2 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary2);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP();
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        java.io.InputStream inputStream0 = null;
        byte[] byte_array7 = new byte[] { (byte) 100, (byte) 100, (byte) 10, (byte) 10, (byte) 0, (byte) -1 };
        try {
            long long8 = org.apache.pdfbox.io.IOUtils.populateBuffer(inputStream0, byte_array7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        float[] f_array6 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace8 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor9 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, pDColorSpace8);
        org.apache.pdfbox.cos.COSName cOSName10 = pDColor9.getPatternName();
        pDAnnotationLine0.setColor(pDColor9);
        pDAnnotationLine0.setCaption(false);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.pdfbox.contentstream.operator.text.SetWordSpacing setWordSpacing0 = new org.apache.pdfbox.contentstream.operator.text.SetWordSpacing();
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.pdfbox.rendering.ImageType imageType0 = org.apache.pdfbox.rendering.ImageType.GRAY;
        org.junit.Assert.assertNotNull(imageType0);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceRGBColor setStrokingDeviceRGBColor0 = new org.apache.pdfbox.contentstream.operator.color.SetStrokingDeviceRGBColor();
        org.apache.pdfbox.contentstream.operator.Operator operator1 = null;
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.SIZE;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName8 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.FB;
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.WHITE_POINT;
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.TRUE_TYPE;
        org.apache.pdfbox.cos.COSName cOSName12 = org.apache.pdfbox.cos.COSName.OP_NS;
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OFF;
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.FLATE_DECODE;
        org.apache.pdfbox.cos.COSName cOSName15 = org.apache.pdfbox.cos.COSName.STATUS;
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.LLO;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree17 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary18 = pDPageTree17.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject19 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty20 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary18, pDUserAttributeObject19);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent21 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary18);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit22 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary18);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_23 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary18);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree24 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary25 = pDPageTree24.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject26 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty27 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary25, pDUserAttributeObject26);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent28 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary25);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit29 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary25);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_30 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary25);
        org.apache.pdfbox.cos.COSName cOSName31 = org.apache.pdfbox.cos.COSName.COUNT;
        org.apache.pdfbox.cos.COSName cOSName32 = org.apache.pdfbox.cos.COSName.VIEWER_PREFERENCES;
        org.apache.pdfbox.cos.COSName cOSName33 = org.apache.pdfbox.cos.COSName.ORDER;
        org.apache.pdfbox.cos.COSName cOSName34 = org.apache.pdfbox.cos.COSName.LIGHTEN;
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.OS;
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.ENCODING_ETEN_B5_H;
        org.apache.pdfbox.cos.COSName cOSName37 = org.apache.pdfbox.cos.COSName.VIEWER_PREFERENCES;
        org.apache.pdfbox.cos.COSBase[] cOSBase_array38 = new org.apache.pdfbox.cos.COSBase[] { cOSName2, cOSDictionary7, cOSName8, cOSName9, cOSName10, cOSName11, cOSName12, cOSName13, cOSName14, cOSName15, cOSName16, cOSDictionary18, cOSDictionary25, cOSName31, cOSName32, cOSName33, cOSName34, cOSName35, cOSName36, cOSName37 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSBase> arraylist_cOSBase39 = new java.util.ArrayList<org.apache.pdfbox.cos.COSBase>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase39, cOSBase_array38);
        try {
            setStrokingDeviceRGBColor0.process(operator1, (java.util.List<org.apache.pdfbox.cos.COSBase>) arraylist_cOSBase39);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSName8);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertNotNull(cOSDictionary18);
        org.junit.Assert.assertNotNull(cOSDictionary25);
        org.junit.Assert.assertNotNull(cOSName31);
        org.junit.Assert.assertNotNull(cOSName32);
        org.junit.Assert.assertNotNull(cOSName33);
        org.junit.Assert.assertNotNull(cOSName34);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(cOSName37);
        org.junit.Assert.assertNotNull(cOSBase_array38);
        org.junit.Assert.assertTrue(b40 == true);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable1 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0);
        java.awt.print.Printable printable2 = null;
        java.awt.print.PageFormat pageFormat3 = null;
        try {
            pDFPageable1.append(printable2, pageFormat3, (int) (byte) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.FRACTIONAL_DISPLAY_ROUND;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "R" + "'", str0.equals("R"));
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLink.HIGHLIGHT_MODE_OUTLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "O" + "'", str0.equals("O"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        java.lang.String str5 = cOSDictionary1.getString("TD");
        cOSDictionary1.setString("", "I");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CALGRAY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable1 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0);
        org.apache.pdfbox.printing.PDFPageable[] pDFPageable_array2 = new org.apache.pdfbox.printing.PDFPageable[] { pDFPageable1 };
        java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable> arraylist_pDFPageable3 = new java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable3, pDFPageable_array2);
        try {
            org.apache.pdfbox.cos.COSArray cOSArray5 = org.apache.pdfbox.pdmodel.common.COSArrayList.converterToCOSArray((java.util.List<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable3);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(pDFPageable_array2);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ENCODING_90MS_RKSJ_H;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        try {
            org.apache.pdfbox.pdmodel.font.PDType3Font pDType3Font6 = new org.apache.pdfbox.pdmodel.font.PDType3Font(cOSDictionary1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList0 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getZapfDingbats();
        org.junit.Assert.assertNotNull(glyphList0);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.OWNER_LIST;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "List" + "'", str0.equals("List"));
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_UPPER_ALPHA;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UpperAlpha" + "'", str0.equals("UpperAlpha"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.SUBFILTER_ADBE_PKCS7_DETACHED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        int i0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue.FLAG_FILTER;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline pDDocumentOutline0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline();
        pDDocumentOutline0.closeNode();
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.pdfbox.pdmodel.font.FontFormat fontFormat0 = org.apache.pdfbox.pdmodel.font.FontFormat.PFB;
        org.junit.Assert.assertTrue("'" + fontFormat0 + "' != '" + org.apache.pdfbox.pdmodel.font.FontFormat.PFB + "'", fontFormat0.equals(org.apache.pdfbox.pdmodel.font.FontFormat.PFB));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionSubmitForm.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SubmitForm" + "'", str0.equals("SubmitForm"));
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.XREF_USED;
        java.io.InputStream inputStream2 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting6 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) (byte) -1, (long) (byte) 100);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument7 = org.apache.pdfbox.pdmodel.PDDocument.load(byte_array0, "ExData", inputStream2, "hi!", memoryUsageSetting6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(byte_array0);
        org.junit.Assert.assertNotNull(memoryUsageSetting6);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup.SUB_TYPE_SQUIGGLY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Squiggly" + "'", str0.equals("Squiggly"));
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.NAME;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        int i0 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.SHADING_TYPE1;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable1 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0);
        java.awt.print.Printable printable2 = null;
        java.awt.print.PageFormat pageFormat3 = null;
        try {
            pDFPageable1.append(printable2, pageFormat3, (int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CICI_SIGNIT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = new org.apache.pdfbox.pdmodel.PDDocument();
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject2 = org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.createFromFile("SubmitForm", pDDocument1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        java.io.File file0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting4 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) (byte) -1, (long) (byte) 100);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument5 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, "Squiggly", memoryUsageSetting4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(memoryUsageSetting4);
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.LE_BUTT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Butt" + "'", str0.equals("Butt"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BYTERANGE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        pDAnnotationLine0.setModifiedDate("");
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference1 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference(cOSDictionary0);
        org.apache.pdfbox.cos.COSString cOSString2 = null;
        org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification pDSimpleFileSpecification3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDSimpleFileSpecification(cOSString2);
        try {
            fDFNamedPageReference1.setFileSpecification((org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification) pDSimpleFileSpecification3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.HIDE_WINDOWUI;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.pdmodel.PDPage pDPage1 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.pdmodel.PDPage pDPage3 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle2);
        pDPage1.setBleedBox(pDRectangle2);
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(pDRectangle2);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink fDFAnnotationLink1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink(cOSDictionary0);
        try {
            java.lang.String str2 = fDFAnnotationLink1.getName();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_DESC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.pdfbox.pdmodel.font.FontMapper fontMapper0 = org.apache.pdfbox.pdmodel.font.FontMappers.instance();
        org.junit.Assert.assertNotNull(fontMapper0);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "JavaScript" + "'", str0.equals("JavaScript"));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        java.io.InputStream inputStream0 = null;
        try {
            org.apache.pdfbox.io.RandomAccessBuffer randomAccessBuffer1 = new org.apache.pdfbox.io.RandomAccessBuffer(inputStream0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.pdfbox.contentstream.operator.text.SetTextRenderingMode setTextRenderingMode0 = new org.apache.pdfbox.contentstream.operator.text.SetTextRenderingMode();
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.cos.ICOSVisitor iCOSVisitor2 = null;
        try {
            java.lang.Object obj3 = cOSDictionary1.accept(iCOSVisitor2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.fdf.FDFPage[] fDFPage_array2 = new org.apache.pdfbox.pdmodel.fdf.FDFPage[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFPage> arraylist_fDFPage3 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFPage>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.fdf.FDFPage>) arraylist_fDFPage3, fDFPage_array2);
        try {
            fDFDictionary1.setPages((java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFPage>) arraylist_fDFPage3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(fDFPage_array2);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PATTERN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.TH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TH" + "'", str0.equals("TH"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        java.lang.String str4 = pDExportFormatAttributeObject1.getTextAlign();
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma5 = null;
        pDExportFormatAttributeObject1.setAllBorderColors(pDGamma5);
        java.lang.String str7 = pDExportFormatAttributeObject1.getScope();
        pDExportFormatAttributeObject1.setRubyPosition("Document");
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Start" + "'", str4.equals("Start"));
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.SECT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Sect" + "'", str0.equals("Sect"));
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DEFAULT_CMYK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PRINT_AREA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        pDExportFormatAttributeObject1.setEndIndent((float) '4');
        org.junit.Assert.assertNotNull(cOSDictionary4);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STR_F;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        java.lang.String str0 = org.apache.pdfbox.pdfparser.COSParser.SYSPROP_EOFLOOKUPRANGE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org.apache.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange" + "'", str0.equals("org.apache.pdfbox.pdfparser.nonSequentialPDFParser.eofLookupRange"));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.XFA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        float f2 = pDRectangle0.getLowerLeftY();
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertTrue(f2 == 0.0f);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.pdfbox.cos.COSArray cOSArray0 = new org.apache.pdfbox.cos.COSArray();
        try {
            org.apache.pdfbox.cos.COSBase cOSBase2 = cOSArray0.get((int) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler pDLinkAppearanceHandler1 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine0);
        try {
            pDLinkAppearanceHandler1.generateAppearanceStreams();
            org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
        } catch (java.lang.ClassCastException e) {
        }
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature4 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions5 = null;
        try {
            pDDocument0.addSignature(pDSignature4, signatureOptions5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        java.io.File file0 = null;
        try {
            org.apache.pdfbox.io.RandomAccessBufferedFileInputStream randomAccessBufferedFileInputStream1 = new org.apache.pdfbox.io.RandomAccessBufferedFileInputStream(file0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup pDAnnotationMarkup0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup();
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        try {
            float f1 = org.apache.pdfbox.pdmodel.common.function.type4.InstructionSequenceBuilder.parseReal("Highlight");
            org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
        } catch (java.lang.NumberFormatException e) {
        }
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.U;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MATRIX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> pdnametreenode_pDActionJavaScript3 = pDJavascriptNameTreeNode2.getParent();
        try {
            java.util.Map<java.lang.String, org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript> map_str_pDActionJavaScript4 = pdnametreenode_pDActionJavaScript3.getNames();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(pdnametreenode_pDActionJavaScript3);
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_WEIGHT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.VERSION2_VARIABLE_LENGTH_ALGORITHM;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_MINUS_90_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "-90" + "'", str0.equals("-90"));
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        int i0 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue.FLAG_ADD_REV_INFO;
        org.junit.Assert.assertTrue(i0 == 32);
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.RT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RT" + "'", str0.equals("RT"));
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        java.util.Calendar calendar1 = pDAnnotationLine0.getCreationDate();
        java.lang.String str2 = pDAnnotationLine0.getIntent();
        org.junit.Assert.assertNull(calendar1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MARK_INFO;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.JAVA_SCRIPT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MULTIPLY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long11 = cOSDictionary4.getLong(cOSName10);
        cOSDictionary4.setNeedToBeUpdated(false);
        java.util.Set<org.apache.pdfbox.cos.COSName> set_cOSName14 = cOSDictionary4.keySet();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(long11 == (-1L));
        org.junit.Assert.assertNotNull(set_cOSName14);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.WIDTH_AUTO;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Auto" + "'", str0.equals("Auto"));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFPageInfo fDFPageInfo1 = new org.apache.pdfbox.pdmodel.fdf.FDFPageInfo(cOSDictionary0);
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.pdmodel.PDPage pDPage1 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle0);
        try {
            org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = pDPage1.getTrimBox();
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE nON_FULL_SCREEN_PAGE_MODE0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseOutlines;
        org.junit.Assert.assertTrue("'" + nON_FULL_SCREEN_PAGE_MODE0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseOutlines + "'", nON_FULL_SCREEN_PAGE_MODE0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE.UseOutlines));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.UE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDMeasureDictionary.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Measure" + "'", str0.equals("Measure"));
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
        java.lang.String str0 = org.apache.pdfbox.pdfparser.BaseParser.DEF;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "def" + "'", str0.equals("def"));
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.WIN_ANSI_ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VIEW_CLIP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_SOLID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Solid" + "'", str0.equals("Solid"));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        java.lang.String[] str_array3 = new java.lang.String[] { "BlockQuote" };
        pDExportFormatAttributeObject1.setHeaders(str_array3);
        float f5 = pDExportFormatAttributeObject1.getTextIndent();
        float[] f_array6 = null;
        try {
            pDExportFormatAttributeObject1.setColumnWidths(f_array6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(str_array3);
        org.junit.Assert.assertTrue(f5 == 0.0f);
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LZW_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OBJ;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        cOSDictionary6.setString("Document", "StructElem");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.FILTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Standard" + "'", str0.equals("Standard"));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline fDFAnnotationUnderline0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline();
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.Y_STEP;
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray2 = pDRectangle1.getCOSArray();
        try {
            org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding3 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSName0, cOSArray2);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
        org.junit.Assert.assertNotNull(pDRectangle1);
        org.junit.Assert.assertNotNull(cOSArray2);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        fDFAnnotationFreeText0.setDefaultAppearance("I");
        java.lang.String str4 = fDFAnnotationFreeText0.getLineEndingStyle();
        boolean b5 = fDFAnnotationFreeText0.isNoRotate();
        boolean b6 = fDFAnnotationFreeText0.isNoRotate();
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OPM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        try {
            org.apache.pdfbox.util.Vector vector2 = pDType1Font0.getPositionVector(1);
            org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
        } catch (java.lang.UnsupportedOperationException e) {
        }
        org.junit.Assert.assertNotNull(pDType1Font0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        fDFAnnotationFreeText0.setPrinted(true);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TO_UNICODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary2 = fDFDictionary1.getCOSObject();
        try {
            java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFAnnotation> list_fDFAnnotation3 = fDFDictionary1.getAnnotations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(cOSDictionary2);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ROTATE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.pdfbox.contentstream.operator.graphics.MoveTo moveTo0 = new org.apache.pdfbox.contentstream.operator.graphics.MoveTo();
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection pDTransitionDirection0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.LEFT_TO_RIGHT;
        org.junit.Assert.assertTrue("'" + pDTransitionDirection0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.LEFT_TO_RIGHT + "'", pDTransitionDirection0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.LEFT_TO_RIGHT));
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.pdfbox.util.filetypedetector.FileType fileType0 = org.apache.pdfbox.util.filetypedetector.FileType.UNKNOWN;
        org.junit.Assert.assertTrue("'" + fileType0 + "' != '" + org.apache.pdfbox.util.filetypedetector.FileType.UNKNOWN + "'", fileType0.equals(org.apache.pdfbox.util.filetypedetector.FileType.UNKNOWN));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.common.PDPageLabelRange.STYLE_LETTERS_LOWER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "a" + "'", str0.equals("a"));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b1 = fDFAnnotationFreeText0.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText0.setRectangle(pDRectangle2);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = fDFAnnotationFreeText0.getRectangle();
        boolean b7 = pDRectangle4.contains((float) 10L, 10.0f);
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        java.io.InputStream inputStream0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList2 = new org.apache.pdfbox.pdmodel.font.encoding.GlyphList(inputStream0, 32);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MIX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_CIRCLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Circle" + "'", str0.equals("Circle"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.IF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        java.lang.Class<?> cls0 = org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler.PROTECTION_POLICY_CLASS;
        org.junit.Assert.assertNotNull(cls0);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.pdfbox.cos.COSArray cOSArray0 = new org.apache.pdfbox.cos.COSArray();
        try {
            org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = new org.apache.pdfbox.pdmodel.common.PDRectangle(cOSArray0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.XREF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_FAMILY;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY_CROP_BOX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CropBox" + "'", str0.equals("CropBox"));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceRGBColor setNonStrokingDeviceRGBColor0 = new org.apache.pdfbox.contentstream.operator.color.SetNonStrokingDeviceRGBColor();
        java.lang.String str1 = setNonStrokingDeviceRGBColor0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "rg" + "'", str1.equals("rg"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TRAPPED;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        java.io.Writer writer2 = null;
        try {
            fDFDictionary1.writeXML(writer2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        java.lang.String str4 = pDUserProperty3.toString();
        pDUserProperty3.setHidden(false);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.BEFORE;
        boolean b8 = pDUserProperty3.equals((java.lang.Object) cOSName7);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Name=null, Value=null, FormattedValue=null, Hidden=false" + "'", str4.equals("Name=null, Value=null, FormattedValue=null, Hidden=false"));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText2 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b3 = fDFAnnotationFreeText2.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText2.setRectangle(pDRectangle4);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink fDFAnnotationLink7 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink(cOSDictionary6);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight8 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight();
        java.lang.String str9 = fDFAnnotationHighlight8.getTitle();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText10 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText11 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        boolean b12 = fDFAnnotationFreeText11.isNoView();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle13 = org.apache.pdfbox.pdmodel.common.PDRectangle.A0;
        fDFAnnotationFreeText11.setRectangle(pDRectangle13);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText15 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle fDFAnnotationCircle16 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle();
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotation[] fDFAnnotation_array17 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotation[] { fDFAnnotationFreeText2, fDFAnnotationLink7, fDFAnnotationHighlight8, fDFAnnotationFreeText10, fDFAnnotationFreeText11, fDFAnnotationFreeText15, fDFAnnotationCircle16 };
        java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFAnnotation> arraylist_fDFAnnotation18 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFAnnotation>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.fdf.FDFAnnotation>) arraylist_fDFAnnotation18, fDFAnnotation_array17);
        try {
            fDFDictionary1.setAnnotations((java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFAnnotation>) arraylist_fDFAnnotation18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == false);
        org.junit.Assert.assertNotNull(pDRectangle4);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(fDFAnnotation_array17);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDICCBased pDICCBased2 = new org.apache.pdfbox.pdmodel.graphics.color.PDICCBased(cOSArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        java.util.Set<java.util.Map.Entry<org.apache.pdfbox.cos.COSName, org.apache.pdfbox.cos.COSBase>> set_entry_cOSName_cOSBase2 = cOSDictionary1.entrySet();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3 pDShadingType3_3 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType3(cOSDictionary1);
        int i4 = pDShadingType3_3.getShadingType();
        java.awt.image.ColorModel colorModel5 = null;
        java.awt.geom.AffineTransform affineTransform6 = null;
        org.apache.pdfbox.util.Matrix matrix7 = null;
        java.awt.Rectangle rectangle8 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.shading.RadialShadingContext radialShadingContext9 = new org.apache.pdfbox.pdmodel.graphics.shading.RadialShadingContext(pDShadingType3_3, colorModel5, affineTransform6, matrix7, rectangle8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(set_entry_cOSName_cOSBase2);
        org.junit.Assert.assertTrue(i4 == 3);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        fDFIconFit5.setScaleOption("A");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        try {
            org.apache.pdfbox.pdmodel.common.COSDictionaryMap<java.lang.String, java.lang.Object> cosdictionarymap_str_obj11 = org.apache.pdfbox.pdmodel.common.COSDictionaryMap.convertBasicTypesToMap(cOSDictionary4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MAC_EXPERT_ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
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
        java.awt.geom.AffineTransform affineTransform21 = null;
        try {
            pDShadingType1_19.setMatrix(affineTransform21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName12);
        org.junit.Assert.assertNotNull(cOSDictionary14);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        java.awt.Color color2 = fDFAnnotationFreeText0.getColor();
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNull(color2);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TR2;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        java.io.File file6 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject8 = org.apache.pdfbox.pdmodel.graphics.image.CCITTFactory.createFromFile(pDDocument0, file6, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.fontbox.afm.FontMetrics fontMetrics0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.Type1Encoding type1Encoding1 = new org.apache.pdfbox.pdmodel.font.encoding.Type1Encoding(fontMetrics0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.pdfbox.contentstream.operator.graphics.LegacyFillNonZeroRule legacyFillNonZeroRule0 = new org.apache.pdfbox.contentstream.operator.graphics.LegacyFillNonZeroRule();
        java.lang.String str1 = legacyFillNonZeroRule0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "F" + "'", str1.equals("F"));
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination pDPageXYZDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageXYZDestination();
        int i1 = pDPageXYZDestination0.findPageNumber();
        org.junit.Assert.assertTrue(i1 == (-1));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FLATE_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.EXTENDS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        java.lang.String str0 = org.apache.pdfbox.pdfparser.COSParser.TMP_FILE_PREFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "tmpPDF" + "'", str0.equals("tmpPDF"));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDRectangle2.getCOSArray();
        cOSArray3.clear();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray3.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName6);
        try {
            fDFDictionary1.setID(cOSArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
        org.junit.Assert.assertNotNull(cOSName6);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature.FILTER_ADOBE_PPKLITE;
        try {
            pDUserProperty3.setValue((org.apache.pdfbox.cos.COSBase) cOSName4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject pDDefaultAttributeObject0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDDefaultAttributeObject();
        org.apache.pdfbox.cos.COSBase cOSBase2 = pDDefaultAttributeObject0.getAttributeValue("");
        org.junit.Assert.assertNull(cOSBase2);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationCircle.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Circle" + "'", str0.equals("Circle"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PRINT_SCALING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        java.awt.image.BufferedImage bufferedImage4 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject7 = org.apache.pdfbox.pdmodel.graphics.image.JPEGFactory.createFromImage(pDDocument0, bufferedImage4, (float) (byte) -1, (int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.pdfbox.filter.DecodeResult decodeResult0 = org.apache.pdfbox.filter.DecodeResult.DEFAULT;
        org.junit.Assert.assertNotNull(decodeResult0);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        int i0 = org.apache.pdfbox.pdmodel.graphics.shading.PDShading.SHADING_TYPE5;
        org.junit.Assert.assertTrue(i0 == 5);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ACTUAL_TEXT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT_FILE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.Figure;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Figure" + "'", str0.equals("Figure"));
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Split;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Split + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Split));
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.T_HEAD;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "THead" + "'", str0.equals("THead"));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENT;
        org.apache.pdfbox.cos.COSBase cOSBase11 = cOSDictionary4.getItem(cOSName10);
        org.apache.pdfbox.cos.COSBase cOSBase13 = cOSDictionary4.getItem("Auto");
        org.apache.pdfbox.cos.COSName cOSName14 = null;
        try {
            cOSDictionary4.setBoolean(cOSName14, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNull(cOSBase11);
        org.junit.Assert.assertNull(cOSBase13);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FUNCTIONS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        float f3 = pDAnnotationLine0.getLeaderLineOffsetLength();
        org.junit.Assert.assertTrue(f3 == (-1.0f));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSNumber.ONE;
        java.lang.String str1 = cOSInteger0.toString();
        long long2 = cOSInteger0.longValue();
        org.junit.Assert.assertNotNull(cOSInteger0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "COSInt{1}" + "'", str1.equals("COSInt{1}"));
        org.junit.Assert.assertTrue(long2 == 1L);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SEPARATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        pDDocument0.save("CropBox");
        java.io.InputStream inputStream8 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner10 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner(pDDocument0, inputStream8, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDTableAttributeObject.SCOPE_BOTH;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Both" + "'", str0.equals("Both"));
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderEffectDictionary.STYLE_CLOUDY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "C" + "'", str0.equals("C"));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        org.apache.pdfbox.pdmodel.common.PDTypedDictionaryWrapper pDTypedDictionaryWrapper1 = new org.apache.pdfbox.pdmodel.common.PDTypedDictionaryWrapper("");
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.DEFAULT_NAME;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Standard" + "'", str0.equals("Standard"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument0 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument();
        java.io.File file1 = null;
        try {
            fDFDocument0.save(file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.pdfbox.contentstream.operator.state.SetLineCapStyle setLineCapStyle0 = new org.apache.pdfbox.contentstream.operator.state.SetLineCapStyle();
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
        org.apache.pdfbox.util.Matrix matrix0 = new org.apache.pdfbox.util.Matrix();
        try {
            float f3 = matrix0.getValue((int) 'a', 0);
            org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
        } catch (java.lang.ArrayIndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FILESPEC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.pdfbox.contentstream.operator.graphics.CloseAndStrokePath closeAndStrokePath0 = new org.apache.pdfbox.contentstream.operator.graphics.CloseAndStrokePath();
        java.lang.String str1 = closeAndStrokePath0.getName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "s" + "'", str1.equals("s"));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FONT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_NONE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "None" + "'", str0.equals("None"));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature2 = null;
        try {
            pDDocument0.addSignature(pDSignature2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        java.io.File file0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting3 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed(10L);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, "TH", memoryUsageSetting3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(memoryUsageSetting3);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        int i4 = pDExportFormatAttributeObject1.getRowSpan();
        org.junit.Assert.assertTrue(i4 == 1);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        java.util.Calendar calendar8 = pDDocumentInformation7.getCreationDate();
        pDDocumentInformation7.setAuthor("Sect");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(calendar8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.R;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.pdfbox.pdfwriter.COSWriter cOSWriter0 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport signingSupport1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SigningSupport(cOSWriter0);
        byte[] byte_array2 = org.apache.pdfbox.pdfwriter.COSWriter.ARRAY_CLOSE;
        try {
            signingSupport1.setSignature(byte_array2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array2);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY bOUNDARY0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox;
        org.junit.Assert.assertTrue("'" + bOUNDARY0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox + "'", bOUNDARY0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY.MediaBox));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ASCII_HEX_DECODE_ABBREVIATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage7 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle6);
        try {
            pDDocument0.removePage(pDPage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        java.io.File file0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting3 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed(10L);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, "Overline", memoryUsageSetting3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(memoryUsageSetting3);
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_ALIGN_START;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Start" + "'", str0.equals("Start"));
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.COUNT;
        try {
            org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification pDFileSpecification1 = org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification.createFS((org.apache.pdfbox.cos.COSBase) cOSName0);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle4 = new org.apache.pdfbox.pdmodel.common.PDRectangle((float) (byte) -1, (float) 10L, (float) (byte) 10, (-1.0f));
        pDRectangle4.setUpperRightY((float) (short) 0);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CROP_BOX;
        java.lang.String str5 = cOSDictionary1.getEmbeddedString("Overline", cOSName4);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch pDActionLaunch6 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionLaunch(cOSDictionary1);
        pDActionLaunch6.setF("RT");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.PRE_RELEASE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.TOC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TOC" + "'", str0.equals("TOC"));
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long11 = cOSDictionary4.getLong(cOSName10);
        org.apache.pdfbox.pdmodel.font.PDType0Font pDType0Font12 = null;
        org.apache.fontbox.ttf.TrueTypeFont trueTypeFont13 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDCIDFontType2 pDCIDFontType2_14 = new org.apache.pdfbox.pdmodel.font.PDCIDFontType2(cOSDictionary4, pDType0Font12, trueTypeFont13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(long11 == (-1L));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.GLYPH_ORIENTATION_VERTICAL_180_DEGREES;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "180" + "'", str0.equals("180"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        java.io.InputStream inputStream3 = null;
        try {
            org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner5 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner(pDDocument0, inputStream3, 0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSDocument2);
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDActionURI.SUB_TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "URI" + "'", str0.equals("URI"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        try {
            org.apache.pdfbox.pdmodel.PageMode pageMode1 = org.apache.pdfbox.pdmodel.PageMode.fromString("ExData");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DESCENDANT_FONTS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.action.PDAction.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Action" + "'", str0.equals("Action"));
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.WIDGET;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
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
        java.io.Writer writer12 = null;
        try {
            fDFDictionary10.writeXML(writer12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.COMPONENTS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent renderingIntent0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.PERCEPTUAL;
        org.junit.Assert.assertTrue("'" + renderingIntent0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.PERCEPTUAL + "'", renderingIntent0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.PERCEPTUAL));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.EXTEND;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText fDFAnnotationFreeText0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFreeText();
        float[] f_array1 = fDFAnnotationFreeText0.getCallout();
        fDFAnnotationFreeText0.setDefaultAppearance("I");
        java.lang.String str4 = fDFAnnotationFreeText0.getLineEndingStyle();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle5 = fDFAnnotationFreeText0.getRectangle();
        org.junit.Assert.assertNull(f_array1);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(pDRectangle5);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Blinds;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Blinds + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Blinds));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SOUND;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile3 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument2);
        pDDocument2.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata6 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument2);
        org.apache.pdfbox.cos.COSStream cOSStream7 = pDMetadata6.getCOSObject();
        java.io.OutputStream outputStream8 = cOSStream7.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream9 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream7);
        try {
            fDFDictionary1.setDifferences(cOSStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream7);
        org.junit.Assert.assertNotNull(outputStream8);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.pdfbox.pdmodel.common.PDTypedDictionaryWrapper pDTypedDictionaryWrapper1 = new org.apache.pdfbox.pdmodel.common.PDTypedDictionaryWrapper("XML-1.00");
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation13 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation(cOSArray1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNotNull(pDRectangle6);
        org.junit.Assert.assertNotNull(cOSArray7);
        org.junit.Assert.assertNotNull(cOSName10);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSInteger.THREE;
        java.lang.String str1 = cOSInteger0.toString();
        org.junit.Assert.assertNotNull(cOSInteger0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "COSInt{3}" + "'", str1.equals("COSInt{3}"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
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
        org.apache.pdfbox.pdmodel.fdf.FDFField[] fDFField_array12 = new org.apache.pdfbox.pdmodel.fdf.FDFField[] {};
        java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFField> arraylist_fDFField13 = new java.util.ArrayList<org.apache.pdfbox.pdmodel.fdf.FDFField>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.pdmodel.fdf.FDFField>) arraylist_fDFField13, fDFField_array12);
        try {
            fDFDictionary10.setFields((java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFField>) arraylist_fDFField13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(fDFField_array12);
        org.junit.Assert.assertTrue(b14 == false);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
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
        java.util.List<java.lang.String> list_str11 = pDEmbeddedFile1.getFileFilters();
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNotNull(pDFPageable_array6);
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNull(list_str11);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        cOSDictionary1.setString("Highlight", "Start");
        try {
            org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup pDOptionalContentGroup5 = new org.apache.pdfbox.pdmodel.graphics.optionalcontent.PDOptionalContentGroup(cOSDictionary1);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_CSS_2_00;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CSS-2.00" + "'", str0.equals("CSS-2.00"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.NOTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Note" + "'", str0.equals("Note"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace22 = pDShadingType1_6.getColorSpace();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(cOSArray14);
        org.junit.Assert.assertNotNull(cOSName17);
        org.junit.Assert.assertNull(cOSArray21);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination3 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray1);
        cOSArray1.setNeedToBeUpdated(false);
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.LINE_HEIGHT_AUTO;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Auto" + "'", str0.equals("Auto"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BBOX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.pdfbox.pdmodel.common.function.type4.Parser.SyntaxHandler syntaxHandler1 = null;
        try {
            org.apache.pdfbox.pdmodel.common.function.type4.Parser.parse((java.lang.CharSequence) "COSInt{3}", syntaxHandler1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        java.io.InputStream inputStream4 = null;
        try {
            org.apache.pdfbox.pdmodel.font.PDTrueTypeFont pDTrueTypeFont5 = org.apache.pdfbox.pdmodel.font.PDTrueTypeFont.loadTTF(pDDocument0, inputStream4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.H;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "H" + "'", str0.equals("H"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.VERSION1_40_BIT_ALGORITHM;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.BOUNDARY_MEDIA_BOX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MediaBox" + "'", str0.equals("MediaBox"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDListAttributeObject.LIST_NUMBERING_LOWER_ALPHA;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LowerAlpha" + "'", str0.equals("LowerAlpha"));
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DESCENT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.W2;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_ALIGN_END;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "End" + "'", str0.equals("End"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension pDTransitionDimension0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.V;
        org.junit.Assert.assertTrue("'" + pDTransitionDimension0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.V + "'", pDTransitionDimension0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDimension.V));
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable1 = new org.apache.pdfbox.printing.PDFPageable(pDDocument0);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument3 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling4 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable8 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument3, scaling4, true, 1.0f, false);
        java.awt.print.PageFormat pageFormat9 = null;
        try {
            pDFPageable1.setPage((int) (short) 10, (java.awt.print.Printable) pDFPrintable8, pageFormat9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + scaling4 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling4.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LOCATION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        try {
            org.apache.pdfbox.cos.COSString cOSString1 = org.apache.pdfbox.cos.COSString.parseHex("tmpPDF");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup.SUB_TYPE_UNDERLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Underline" + "'", str0.equals("Underline"));
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument0 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument();
        fDFDocument0.saveXFDF("Highlight");
        fDFDocument0.saveXFDF("A");
        java.io.File file5 = null;
        try {
            fDFDocument0.saveXFDF(file5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationMarkup.SUB_TYPE_CARET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Caret" + "'", str0.equals("Caret"));
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.RUBY_POSITION_INLINE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Inline" + "'", str0.equals("Inline"));
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        boolean b5 = pDArtifactMarkedContent4.isLeftAttached();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.printing.Scaling scaling1 = org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT;
        org.apache.pdfbox.printing.PDFPrintable pDFPrintable5 = new org.apache.pdfbox.printing.PDFPrintable(pDDocument0, scaling1, true, 1.0f, false);
        java.io.File file6 = null;
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject8 = org.apache.pdfbox.pdmodel.graphics.image.CCITTFactory.createFromFile(pDDocument0, file6, 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + scaling1 + "' != '" + org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT + "'", scaling1.equals(org.apache.pdfbox.printing.Scaling.SHRINK_TO_FIT));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_FINAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Final" + "'", str0.equals("Final"));
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable0 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument1 = null;
        org.apache.pdfbox.printing.PDFPageable pDFPageable2 = new org.apache.pdfbox.printing.PDFPageable(pDDocument1);
        org.apache.pdfbox.printing.PDFPageable[] pDFPageable_array3 = new org.apache.pdfbox.printing.PDFPageable[] { pDFPageable2 };
        java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable> arraylist_pDFPageable4 = new java.util.ArrayList<org.apache.pdfbox.printing.PDFPageable>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable4, pDFPageable_array3);
        boolean b6 = cosarraylist_pDFPageable0.containsAll((java.util.Collection<org.apache.pdfbox.printing.PDFPageable>) arraylist_pDFPageable4);
        try {
            org.apache.pdfbox.printing.PDFPageable pDFPageable8 = cosarraylist_pDFPageable0.get((int) 'a');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDFPageable_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection pDTransitionDirection0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.NONE;
        org.junit.Assert.assertNotNull(pDTransitionDirection0);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.OUTPUT_INTENTS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
        org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding macRomanEncoding0 = new org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding();
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine.IT_LINE_ARROW;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "LineArrow" + "'", str0.equals("LineArrow"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment pDAnnotationFileAttachment7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment(cOSDictionary1);
        pDAnnotationFileAttachment7.setSubject("UpperAlpha");
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream7 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream5);
        try {
            org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject pDImageXObject8 = org.apache.pdfbox.pdmodel.graphics.image.PDImageXObject.createThumbnail(cOSStream5);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        boolean b1 = fDFAnnotationLine0.getCaption();
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MAC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.CHECKED_STATE_ON;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "on" + "'", str0.equals("on"));
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setExpandedForm("BibEntry");
        org.apache.pdfbox.cos.COSInteger cOSInteger5 = org.apache.pdfbox.cos.COSNumber.ONE;
        pDStructureElement2.removeKid(cOSInteger5);
        org.junit.Assert.assertNotNull(cOSInteger5);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationPolygon.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Polygon" + "'", str0.equals("Polygon"));
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        java.io.InputStream inputStream1 = null;
        try {
            byte[] byte_array2 = pDSignature0.getContents(inputStream1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        signatureOptions0.setPreferredSignatureSize((int) (byte) -1);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission0 = org.apache.pdfbox.pdmodel.encryption.AccessPermission.getOwnerAccessPermission();
        accessPermission0.setCanExtractContent(true);
        int i3 = accessPermission0.getPermissionBytes();
        accessPermission0.setCanExtractForAccessibility(false);
        org.junit.Assert.assertNotNull(accessPermission0);
        org.junit.Assert.assertTrue(i3 == (-4));
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton1 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm0);
        try {
            pDRadioButton1.setDefaultValue("JavaScript");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.BLEED_BOX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.CAPTION;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Caption" + "'", str0.equals("Caption"));
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.AA;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setAllTBorderStyles("F");
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DW;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        float f3 = pDAnnotationLine0.getCaptionVerticalOffset();
        org.junit.Assert.assertTrue(f3 == 0.0f);
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ANTI_ALIAS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject.OWNER_HTML_4_01;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HTML-4.01" + "'", str0.equals("HTML-4.01"));
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable> cosarraylist_pDFPageable0 = new org.apache.pdfbox.pdmodel.common.COSArrayList<org.apache.pdfbox.printing.PDFPageable>();
        try {
            org.apache.pdfbox.printing.PDFPageable pDFPageable2 = cosarraylist_pDFPageable0.get((int) '4');
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
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
            java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFAnnotation> list_fDFAnnotation12 = fDFDictionary10.getAnnotations();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
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
        org.apache.pdfbox.cos.COSName cOSName18 = org.apache.pdfbox.cos.COSName.YES;
        try {
            pDPageContentStream17.beginMarkedContent(cOSName18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(cOSName18);
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.RP;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RP" + "'", str0.equals("RP"));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        java.io.File file0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting2 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed(10L);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument3 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, memoryUsageSetting2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(memoryUsageSetting2);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
        java.io.File file0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting3 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) (byte) -1, (long) (byte) 100);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument4 = org.apache.pdfbox.pdmodel.PDDocument.load(file0, memoryUsageSetting3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(memoryUsageSetting3);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.common.PDTypedDictionaryWrapper pDTypedDictionaryWrapper3 = new org.apache.pdfbox.pdmodel.common.PDTypedDictionaryWrapper(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
            java.util.List<org.apache.pdfbox.pdmodel.fdf.FDFPage> list_fDFPage12 = fDFDictionary10.getPages();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
        org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus pDTristimulus0 = new org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus();
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
            pDPageContentStream17.clipEvenOdd();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.pdfbox.text.TextPositionComparator textPositionComparator0 = new org.apache.pdfbox.text.TextPositionComparator();
        org.apache.pdfbox.text.TextPosition textPosition1 = null;
        org.apache.pdfbox.text.TextPosition textPosition2 = null;
        try {
            int i3 = textPositionComparator0.compare(textPosition1, textPosition2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary pDBorderStyleDictionary1 = null;
        pDAnnotationLine0.setBorderStyle(pDBorderStyleDictionary1);
        float[] f_array6 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace8 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor9 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array6, cOSName7, pDColorSpace8);
        org.apache.pdfbox.cos.COSName cOSName10 = pDColor9.getPatternName();
        pDAnnotationLine0.setColor(pDColor9);
        java.lang.String str12 = pDAnnotationLine0.getSubtype();
        pDAnnotationLine0.setInvisible(true);
        org.junit.Assert.assertNotNull(f_array6);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Line" + "'", str12.equals("Line"));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.pdfbox.multipdf.Overlay overlay0 = new org.apache.pdfbox.multipdf.Overlay();
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str1 = null;
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument2 = overlay0.overlay(map_i_str1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.PDStream pDStream1 = new org.apache.pdfbox.pdmodel.common.PDStream(pDDocument0);
        java.io.InputStream inputStream2 = null;
        try {
            org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata3 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0, inputStream2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
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
            pDPageContentStream17.fill();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData pDActionImportData5 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionImportData(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFCatalog fDFCatalog6 = new org.apache.pdfbox.pdmodel.fdf.FDFCatalog(cOSDictionary1);
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str8 = cOSName7.toString();
        java.util.Calendar calendar9 = null;
        cOSDictionary1.setDate(cOSName7, calendar9);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound11 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound(cOSDictionary1);
        pDActionSound11.setRepeat(true);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "COSName{PageMode}" + "'", str8.equals("COSName{PageMode}"));
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DESC;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long11 = cOSDictionary4.getLong(cOSName10);
        try {
            org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace12 = org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace.create((org.apache.pdfbox.cos.COSBase) cOSDictionary4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertTrue(long11 == (-1L));
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
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
        java.awt.geom.AffineTransform affineTransform18 = null;
        try {
            pDPageContentStream17.setTextMatrix(affineTransform18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2 pDShadingType2_7 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType2((org.apache.pdfbox.cos.COSDictionary) cOSStream5);
        org.apache.pdfbox.pdmodel.PDDocument pDDocument8 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile9 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument8);
        org.apache.pdfbox.cos.COSDocument cOSDocument10 = pDDocument8.getDocument();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree11 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary12 = pDPageTree11.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode13 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary12);
        cOSDictionary12.setString("BlockQuote", "hi!");
        org.apache.pdfbox.cos.COSObjectKey cOSObjectKey17 = cOSDocument10.getKey((org.apache.pdfbox.cos.COSBase) cOSDictionary12);
        try {
            org.apache.pdfbox.pdfparser.PDFObjectStreamParser pDFObjectStreamParser18 = new org.apache.pdfbox.pdfparser.PDFObjectStreamParser(cOSStream5, cOSDocument10);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNotNull(cOSDocument10);
        org.junit.Assert.assertNotNull(cOSDictionary12);
        org.junit.Assert.assertNull(cOSObjectKey17);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.ANNOT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Annot" + "'", str0.equals("Annot"));
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
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
        org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB pDCalRGB18 = new org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle19 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray20 = pDRectangle19.getCOSArray();
        cOSArray20.clear();
        org.apache.pdfbox.cos.COSName cOSName23 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray20.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName23);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma25 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray20);
        pDCalRGB18.setGamma(pDGamma25);
        try {
            pDPageContentStream17.setStrokingColorSpace((org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDCalRGB18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(pDRectangle19);
        org.junit.Assert.assertNotNull(cOSArray20);
        org.junit.Assert.assertNotNull(cOSName23);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.TYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "NumberFormat" + "'", str0.equals("NumberFormat"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.pdfbox.io.RandomAccessRead randomAccessRead0 = null;
        java.io.InputStream inputStream2 = null;
        try {
            org.apache.pdfbox.pdfparser.PDFParser pDFParser4 = new org.apache.pdfbox.pdfparser.PDFParser(randomAccessRead0, "Caret", inputStream2, "A");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.awt.geom.GeneralPath generalPath2 = pDType1Font0.getPath((int) ' ');
        float f4 = pDType1Font0.getStringWidth("LowerAlpha");
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertNotNull(generalPath2);
        org.junit.Assert.assertTrue(f4 == 5723.0f);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes pDTransparencyGroupAttributes0 = new org.apache.pdfbox.pdmodel.graphics.form.PDTransparencyGroupAttributes();
        boolean b1 = pDTransparencyGroupAttributes0.isKnockout();
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace2 = pDTransparencyGroupAttributes0.getColorSpace();
        org.junit.Assert.assertTrue(b1 == false);
        org.junit.Assert.assertNull(pDColorSpace2);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB pDCalRGB0 = new org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray2 = pDRectangle1.getCOSArray();
        cOSArray2.clear();
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray2.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName5);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma7 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray2);
        pDCalRGB0.setGamma(pDGamma7);
        org.apache.pdfbox.pdmodel.graphics.color.PDTristimulus pDTristimulus9 = pDCalRGB0.getWhitepoint();
        org.junit.Assert.assertNotNull(pDRectangle1);
        org.junit.Assert.assertNotNull(cOSArray2);
        org.junit.Assert.assertNotNull(cOSName5);
        org.junit.Assert.assertNotNull(pDTristimulus9);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
        java.io.InputStream inputStream0 = null;
        org.apache.pdfbox.io.MemoryUsageSetting memoryUsageSetting4 = org.apache.pdfbox.io.MemoryUsageSetting.setupMixed((long) (byte) -1, (long) (byte) 100);
        try {
            org.apache.pdfbox.pdmodel.PDDocument pDDocument5 = org.apache.pdfbox.pdmodel.PDDocument.load(inputStream0, "Document", memoryUsageSetting4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(memoryUsageSetting4);
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection pDTransitionDirection0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.BOTTOM_TO_TOP;
        org.junit.Assert.assertTrue("'" + pDTransitionDirection0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.BOTTOM_TO_TOP + "'", pDTransitionDirection0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionDirection.BOTTOM_TO_TOP));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline pDDocumentOutline0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.outline.PDDocumentOutline();
        boolean b1 = pDDocumentOutline0.isNodeOpen();
        org.junit.Assert.assertTrue(b1 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        byte[] byte_array0 = org.apache.pdfbox.pdfwriter.COSWriter.EOF;
        org.junit.Assert.assertNotNull(byte_array0);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions2 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary1);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject4.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary7 = pDExportFormatAttributeObject4.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName9 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary7.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName9, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache12 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources13 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary7, resourceCache12);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject14 = null;
        org.apache.pdfbox.cos.COSName cOSName15 = pDResources13.add(pDFormXObject14);
        java.lang.String str16 = cOSDictionary1.getNameAsString(cOSName15);
        cOSDictionary1.setEmbeddedInt("L2R", "Underline", (int) ' ');
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSName9);
        org.junit.Assert.assertNotNull(cOSName15);
        org.junit.Assert.assertNull(str16);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION rEADING_DIRECTION0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.L2R;
        org.junit.Assert.assertTrue("'" + rEADING_DIRECTION0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.L2R + "'", rEADING_DIRECTION0.equals(org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.READING_DIRECTION.L2R));
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDComboBox pDComboBox1 = new org.apache.pdfbox.pdmodel.interactive.form.PDComboBox(pDAcroForm0);
        pDComboBox1.setEdit(true);
        pDComboBox1.setQ((int) (byte) 10);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_INSET;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Inset" + "'", str0.equals("Inset"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DOC_CHECKSUM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.pdfbox.printing.Orientation orientation0 = org.apache.pdfbox.printing.Orientation.AUTO;
        org.junit.Assert.assertTrue("'" + orientation0 + "' != '" + org.apache.pdfbox.printing.Orientation.AUTO + "'", orientation0.equals(org.apache.pdfbox.printing.Orientation.AUTO));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm pDActionResetForm1 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm(cOSDictionary0);
        try {
            int i2 = pDActionResetForm1.getFlags();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.measurement.PDNumberFormatDictionary.LABEL_PREFIX_TO_VALUE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "P" + "'", str0.equals("P"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
            pDPageContentStream17.setLeading((double) (short) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.QUOTE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Quote" + "'", str0.equals("Quote"));
    }

    @Test
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
        org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy publicKeyProtectionPolicy0 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyProtectionPolicy();
        org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient publicKeyRecipient1 = new org.apache.pdfbox.pdmodel.encryption.PublicKeyRecipient();
        org.apache.pdfbox.pdmodel.encryption.AccessPermission accessPermission2 = publicKeyRecipient1.getPermission();
        publicKeyProtectionPolicy0.addRecipient(publicKeyRecipient1);
        java.security.cert.X509Certificate x509Certificate4 = null;
        publicKeyProtectionPolicy0.setDecryptionCertificate(x509Certificate4);
        org.junit.Assert.assertNull(accessPermission2);
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.TI;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine fDFAnnotationLine0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLine();
        fDFAnnotationLine0.setStartPointEndingStyle("Polygon");
        float f3 = fDFAnnotationLine0.getCaptionHorizontalOffset();
        fDFAnnotationLine0.setLeaderLength((float) 0L);
        org.junit.Assert.assertTrue(f3 == 0.0f);
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Underline" + "'", str0.equals("Underline"));
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline fDFAnnotationUnderline1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationUnderline(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences7 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary6);
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE nON_FULL_SCREEN_PAGE_MODE8 = null;
        try {
            pDViewerPreferences7.setNonFullScreenPageMode(nON_FULL_SCREEN_PAGE_MODE8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.COLORSPACE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment pDAnnotationFileAttachment0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment();
        java.lang.String str1 = pDAnnotationFileAttachment0.getSubtype();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FileAttachment" + "'", str1.equals("FileAttachment"));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STANDARD_ENCODING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern.TYPE_TILING_PATTERN;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        pDExportFormatAttributeObject1.setTextIndent((float) 0L);
        java.lang.String str6 = pDExportFormatAttributeObject1.getInlineAlign();
        pDExportFormatAttributeObject1.setAllTBorderStyles("TH");
        pDExportFormatAttributeObject1.setListNumbering("");
        pDExportFormatAttributeObject1.setEndIndent((float) (short) 100);
        float[] f_array14 = new float[] { (byte) 0 };
        pDExportFormatAttributeObject1.setColumnGaps(f_array14);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "Start" + "'", str6.equals("Start"));
        org.junit.Assert.assertNotNull(f_array14);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font19 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str20 = pDType1Font19.toString();
        try {
            pDPageContentStream17.setFont((org.apache.pdfbox.pdmodel.font.PDFont) pDType1Font19, (float) 1L);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertNotNull(pDType1Font19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str20.equals("PDType1Font Helvetica-Bold"));
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        java.lang.Object obj4 = pDExportFormatAttributeObject1.getBorderThickness();
        java.lang.Object obj5 = pDExportFormatAttributeObject1.getHeight();
        org.junit.Assert.assertNull(obj4);
        org.junit.Assert.assertTrue("'" + obj5 + "' != '" + "Auto" + "'", obj5.equals("Auto"));
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP9 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OCGS;
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.METADATA;
        int i12 = cOSDictionary4.getInt(cOSName10, cOSName11);
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound fDFAnnotationSound13 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationSound(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertTrue(i12 == (-1));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        java.util.Map<java.lang.Integer, java.lang.String> map_i_str0 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.BuiltInEncoding builtInEncoding1 = new org.apache.pdfbox.pdmodel.font.encoding.BuiltInEncoding(map_i_str0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.w3c.dom.Element element0 = null;
        try {
            org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink fDFAnnotationLink1 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationLink(element0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.COLORANTS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
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
            pDPageContentStream17.setStrokingColor((float) 52L, (float) 10, (float) (short) 10, (float) (-4));
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        try {
            pDRectangle0.setUpperRightY((float) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut fDFAnnotationStrikeOut0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationStrikeOut();
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LIMITS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationFileAttachment.ATTACHMENT_NAME_TAG;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Tag" + "'", str0.equals("Tag"));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFDictionary fDFDictionary1 = new org.apache.pdfbox.pdmodel.fdf.FDFDictionary(cOSDictionary0);
        try {
            java.lang.String str2 = fDFDictionary1.getEncoding();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.pdfbox.pdmodel.interactive.form.PDAcroForm pDAcroForm0 = null;
        org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton pDRadioButton1 = new org.apache.pdfbox.pdmodel.interactive.form.PDRadioButton(pDAcroForm0);
        try {
            java.util.List<java.lang.String> list_str2 = pDRadioButton1.getExportValues();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DM;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
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
            pDAppearanceContentStream36.setStrokingColor((int) (short) 1, (int) (byte) 10, (int) (short) -1);
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
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDBorderStyleDictionary.STYLE_DASHED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "D" + "'", str0.equals("D"));
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        java.lang.String str4 = pDExportFormatAttributeObject1.getTextAlign();
        java.lang.String str5 = pDExportFormatAttributeObject1.getScope();
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Start" + "'", str4.equals("Start"));
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.TOCI;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "TOCI" + "'", str0.equals("TOCI"));
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SIG_FLAGS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDDocumentInformation pDDocumentInformation7 = new org.apache.pdfbox.pdmodel.PDDocumentInformation(cOSDictionary1);
        java.util.Calendar calendar8 = pDDocumentInformation7.getCreationDate();
        java.util.Calendar calendar9 = pDDocumentInformation7.getModificationDate();
        java.util.Calendar calendar10 = null;
        pDDocumentInformation7.setModificationDate(calendar10);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(calendar8);
        org.junit.Assert.assertNull(calendar9);
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode pDStructureElementNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode();
        java.lang.String str1 = pDStructureElementNameTreeNode0.getUpperLimit();
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement>> list_pdnametreenode_pDStructureElement2 = pDStructureElementNameTreeNode0.getKids();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(list_pdnametreenode_pDStructureElement2);
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma6 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray1);
        try {
            pDGamma6.setR(10.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
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
            pDPageContentStream17.endMarkedContent();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding macRomanEncoding10 = org.apache.pdfbox.pdmodel.font.encoding.MacRomanEncoding.INSTANCE;
        org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding dictionaryEncoding11 = new org.apache.pdfbox.pdmodel.font.encoding.DictionaryEncoding(cOSDictionary4, false, (org.apache.pdfbox.pdmodel.font.encoding.Encoding) macRomanEncoding10);
        java.lang.String str12 = macRomanEncoding10.getEncodingName();
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(macRomanEncoding10);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "MacRomanEncoding" + "'", str12.equals("MacRomanEncoding"));
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.INDEX;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
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
            pDPageContentStream17.showText("MediaBox");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Box;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Box + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Box));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
        org.apache.pdfbox.cos.COSInteger cOSInteger1 = org.apache.pdfbox.cos.COSInteger.get(1L);
        org.junit.Assert.assertNotNull(cOSInteger1);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.fdf.FDFAnnotationFileAttachment.SUBTYPE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "FileAttachment" + "'", str0.equals("FileAttachment"));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences.NON_FULL_SCREEN_PAGE_MODE_USE_OPTIONAL_CONTENT;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UseOC" + "'", str0.equals("UseOC"));
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
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
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature20 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureInterface signatureInterface21 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions signatureOptions22 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.SignatureOptions();
        try {
            pDDocument0.addSignature(pDSignature20, signatureInterface21, signatureOptions22);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle pDTransitionStyle0 = org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Push;
        org.junit.Assert.assertTrue("'" + pDTransitionStyle0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Push + "'", pDTransitionStyle0.equals(org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransitionStyle.Push));
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight fDFAnnotationHighlight0 = new org.apache.pdfbox.pdmodel.fdf.FDFAnnotationHighlight();
        java.lang.String str1 = fDFAnnotationHighlight0.getTitle();
        java.lang.String str2 = fDFAnnotationHighlight0.getContents();
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.LEADING;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
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
            pDAppearanceContentStream36.setStrokingColor((float) (byte) 1, (float) (short) -1, (float) (short) 100, (float) 32);
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
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.MK;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.pdmodel.PDPage pDPage4 = new org.apache.pdfbox.pdmodel.PDPage();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = pDPageTree5.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject7 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty8 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary6, pDUserAttributeObject7);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent9 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary6);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit10 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary6);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = fDFIconFit10.getCOSObject();
        boolean b12 = pDPage4.equals((java.lang.Object) fDFIconFit10);
        int i13 = pDPageTree0.indexOf(pDPage4);
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine pDAnnotationLine0 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationLine();
        org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler pDLinkAppearanceHandler1 = new org.apache.pdfbox.pdmodel.interactive.annotation.handlers.PDLinkAppearanceHandler((org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotation) pDAnnotationLine0);
        pDLinkAppearanceHandler1.generateRolloverAppearance();
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.pdfbox.cos.COSArray cOSArray0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFOptionElement fDFOptionElement1 = new org.apache.pdfbox.pdmodel.fdf.FDFOptionElement(cOSArray0);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ASCII_HEX_DECODE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue pDSeedValue0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValue();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.TI;
        org.apache.pdfbox.cos.COSName cOSName2 = org.apache.pdfbox.cos.COSName.TRUE_TYPE;
        org.apache.pdfbox.cos.COSName cOSName3 = org.apache.pdfbox.cos.COSName.COLORANTS;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject5 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject5.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary8 = pDExportFormatAttributeObject5.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName10 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary8.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName10, (int) (short) 0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP pDSeedValueMDP13 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSeedValueMDP(cOSDictionary8);
        org.apache.pdfbox.cos.COSName cOSName14 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        long long15 = cOSDictionary8.getLong(cOSName14);
        org.apache.pdfbox.cos.COSName cOSName16 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str17 = cOSName16.toString();
        org.apache.pdfbox.cos.COSBase cOSBase18 = org.apache.pdfbox.pdmodel.PDPageTree.getInheritableAttribute(cOSDictionary8, cOSName16);
        org.apache.pdfbox.cos.COSName cOSName19 = org.apache.pdfbox.cos.COSName.DESCENDANT_FONTS;
        float[] f_array23 = new float[] { (short) 1, '#', 100L };
        org.apache.pdfbox.cos.COSName cOSName24 = org.apache.pdfbox.cos.COSName.PAGE_LAYOUT;
        org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace pDColorSpace25 = null;
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor26 = new org.apache.pdfbox.pdmodel.graphics.color.PDColor(f_array23, cOSName24, pDColorSpace25);
        org.apache.pdfbox.cos.COSName cOSName27 = pDColor26.getPatternName();
        org.apache.pdfbox.cos.COSName cOSName28 = org.apache.pdfbox.cos.COSName.SV;
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.ORDER;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject31 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject31.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary34 = pDExportFormatAttributeObject31.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName36 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary34.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName36, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache39 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources40 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary34, resourceCache39);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName41 = pDResources40.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName42 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree43 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary44 = pDPageTree43.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject45 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty46 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary44, pDUserAttributeObject45);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent47 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary44);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit48 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary44);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_49 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary44);
        pDResources40.put(cOSName42, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_49);
        org.apache.pdfbox.cos.COSName cOSName51 = org.apache.pdfbox.cos.COSName.ENCODE;
        org.apache.pdfbox.cos.COSName cOSName52 = org.apache.pdfbox.cos.COSName.CL;
        org.apache.pdfbox.cos.COSName cOSName53 = org.apache.pdfbox.cos.COSName.STD_CF;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity pDFunctionTypeIdentity54 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionTypeIdentity((org.apache.pdfbox.cos.COSBase) cOSName53);
        org.apache.pdfbox.cos.COSName cOSName55 = org.apache.pdfbox.cos.COSName.LIMITS;
        org.apache.pdfbox.cos.COSName cOSName56 = org.apache.pdfbox.cos.COSName.FB;
        org.apache.pdfbox.cos.COSName cOSName57 = org.apache.pdfbox.cos.COSName.PRINT_AREA;
        org.apache.pdfbox.cos.COSName cOSName58 = org.apache.pdfbox.cos.COSName.DM;
        org.apache.pdfbox.cos.COSName cOSName59 = org.apache.pdfbox.cos.COSName.APP;
        org.apache.pdfbox.cos.COSName cOSName60 = org.apache.pdfbox.cos.COSName.MIX;
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject62 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject62.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary65 = pDExportFormatAttributeObject62.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName67 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary65.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName67, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache70 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources71 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary65, resourceCache70);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject72 = null;
        org.apache.pdfbox.cos.COSName cOSName73 = pDResources71.add(pDFormXObject72);
        org.apache.pdfbox.cos.COSName cOSName74 = org.apache.pdfbox.cos.COSName.PAGE_MODE;
        java.lang.String str75 = cOSName74.toString();
        org.apache.pdfbox.cos.COSName cOSName76 = org.apache.pdfbox.cos.COSName.RV;
        org.apache.pdfbox.cos.COSName cOSName77 = org.apache.pdfbox.cos.COSName.DEFAULT_GRAY;
        org.apache.pdfbox.cos.COSName cOSName78 = org.apache.pdfbox.cos.COSName.COLORSPACE;
        org.apache.pdfbox.cos.COSName cOSName79 = org.apache.pdfbox.cos.COSName.XFA;
        org.apache.pdfbox.cos.COSName[] cOSName_array80 = new org.apache.pdfbox.cos.COSName[] { cOSName1, cOSName2, cOSName3, cOSName16, cOSName19, cOSName27, cOSName28, cOSName29, cOSName42, cOSName51, cOSName52, cOSName53, cOSName55, cOSName56, cOSName57, cOSName58, cOSName59, cOSName60, cOSName73, cOSName74, cOSName76, cOSName77, cOSName78, cOSName79 };
        java.util.ArrayList<org.apache.pdfbox.cos.COSName> arraylist_cOSName81 = new java.util.ArrayList<org.apache.pdfbox.cos.COSName>();
        boolean b82 = java.util.Collections.addAll((java.util.Collection<org.apache.pdfbox.cos.COSName>) arraylist_cOSName81, cOSName_array80);
        try {
            pDSeedValue0.setDigestMethod((java.util.List<org.apache.pdfbox.cos.COSName>) arraylist_cOSName81);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(cOSName1);
        org.junit.Assert.assertNotNull(cOSName2);
        org.junit.Assert.assertNotNull(cOSName3);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(cOSName10);
        org.junit.Assert.assertNotNull(cOSName14);
        org.junit.Assert.assertTrue(long15 == (-1L));
        org.junit.Assert.assertNotNull(cOSName16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "COSName{PageMode}" + "'", str17.equals("COSName{PageMode}"));
        org.junit.Assert.assertNull(cOSBase18);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNotNull(f_array23);
        org.junit.Assert.assertNotNull(cOSName24);
        org.junit.Assert.assertNotNull(cOSName27);
        org.junit.Assert.assertNotNull(cOSName28);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(cOSDictionary34);
        org.junit.Assert.assertNotNull(cOSName36);
        org.junit.Assert.assertNotNull(iterable_cOSName41);
        org.junit.Assert.assertNotNull(cOSName42);
        org.junit.Assert.assertNotNull(cOSDictionary44);
        org.junit.Assert.assertNotNull(cOSName51);
        org.junit.Assert.assertNotNull(cOSName52);
        org.junit.Assert.assertNotNull(cOSName53);
        org.junit.Assert.assertNotNull(cOSName55);
        org.junit.Assert.assertNotNull(cOSName56);
        org.junit.Assert.assertNotNull(cOSName57);
        org.junit.Assert.assertNotNull(cOSName58);
        org.junit.Assert.assertNotNull(cOSName59);
        org.junit.Assert.assertNotNull(cOSName60);
        org.junit.Assert.assertNotNull(cOSDictionary65);
        org.junit.Assert.assertNotNull(cOSName67);
        org.junit.Assert.assertNotNull(cOSName73);
        org.junit.Assert.assertNotNull(cOSName74);
        org.junit.Assert.assertTrue("'" + str75 + "' != '" + "COSName{PageMode}" + "'", str75.equals("COSName{PageMode}"));
        org.junit.Assert.assertNotNull(cOSName76);
        org.junit.Assert.assertNotNull(cOSName77);
        org.junit.Assert.assertNotNull(cOSName78);
        org.junit.Assert.assertNotNull(cOSName79);
        org.junit.Assert.assertNotNull(cOSName_array80);
        org.junit.Assert.assertTrue(b82 == true);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode appendMode0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode.PREPEND;
        org.junit.Assert.assertTrue("'" + appendMode0 + "' != '" + org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode.PREPEND + "'", appendMode0.equals(org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream.AppendMode.PREPEND));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
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
        org.apache.pdfbox.cos.COSName cOSName58 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation59 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources47.put(cOSName58, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation59);
        org.apache.pdfbox.pdmodel.graphics.color.PDColor pDColor61 = pDSeparation59.getInitialColor();
        try {
            pDAppearanceContentStream36.setStrokingColor(pDColor61);
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
        org.junit.Assert.assertNotNull(cOSName58);
        org.junit.Assert.assertNotNull(pDColor61);
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
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
            pDPageContentStream17.addBezier312((-1.0f), (float) 10L, (float) 'a', (float) 1, 12000.0f, 1.0f);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.EMBEDDED_FDFS;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
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
            pDPageContentStream17.moveTextPositionByAmount((float) (short) 10, (float) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.BORDER_STYLE_DASHED;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Dashed" + "'", str0.equals("Dashed"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.COLOR_BURN;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference fDFNamedPageReference1 = new org.apache.pdfbox.pdmodel.fdf.FDFNamedPageReference(cOSDictionary0);
        try {
            org.apache.pdfbox.pdmodel.common.filespecification.PDFileSpecification pDFileSpecification2 = fDFNamedPageReference1.getFileSpecification();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.SUB_FILTER;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite0 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream1 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite0);
        randomAccessOutputStream1.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream3 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream1);
        cOSStandardOutputStream3.flush();
        cOSStandardOutputStream3.flush();
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDPageTree4.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition6 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary5);
        org.apache.pdfbox.cos.COSBase cOSBase7 = pDTransition6.getDirection();
        pDPage2.setTransition(pDTransition6, (float) 1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle10 = pDPage2.getCropBox();
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache11 = pDPage2.getResourceCache();
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSBase7);
        org.junit.Assert.assertNotNull(pDRectangle10);
        org.junit.Assert.assertNull(resourceCache11);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.pdfbox.pdmodel.encryption.StandardProtectionPolicy standardProtectionPolicy0 = null;
        try {
            org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler standardSecurityHandler1 = new org.apache.pdfbox.pdmodel.encryption.StandardSecurityHandler(standardProtectionPolicy0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.pdfbox.cos.COSDictionary cOSDictionary0 = null;
        org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm pDActionResetForm1 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionResetForm(cOSDictionary0);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle2 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDRectangle2.getCOSArray();
        cOSArray3.clear();
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination pDPageFitHeightDestination5 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitHeightDestination(cOSArray3);
        try {
            pDActionResetForm1.setFields(cOSArray3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle2);
        org.junit.Assert.assertNotNull(cOSArray3);
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        java.lang.String str5 = pDArtifactMarkedContent4.getAlternateDescription();
        org.apache.pdfbox.pdmodel.PDDocument pDDocument6 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile7 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument6);
        pDDocument6.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata10 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument6);
        org.apache.pdfbox.cos.COSStream cOSStream11 = pDMetadata10.getCOSObject();
        java.io.OutputStream outputStream12 = cOSStream11.createFilteredStream();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream pDAppearanceStream13 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceStream(cOSStream11);
        org.apache.pdfbox.pdmodel.common.PDStream pDStream14 = pDAppearanceStream13.getContentStream();
        pDArtifactMarkedContent4.addXObject((org.apache.pdfbox.pdmodel.graphics.PDXObject) pDAppearanceStream13);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cOSStream11);
        org.junit.Assert.assertNotNull(outputStream12);
        org.junit.Assert.assertNotNull(pDStream14);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray8 = pDRectangle7.getCOSArray();
        org.apache.pdfbox.pdmodel.common.PDRange pDRange9 = new org.apache.pdfbox.pdmodel.common.PDRange(cOSArray8);
        fDFIconFit5.setFractionalSpaceToAllocate(pDRange9);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(cOSArray8);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
            pDPageContentStream17.appendRawCommands((float) (byte) 0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        boolean b1 = pDPageFitWidthDestination0.fitBoundingBox();
        pDPageFitWidthDestination0.setTop(32);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode2 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary1);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree3 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree3.getCOSObject();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode5 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode(cOSDictionary4);
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript6 = pDJavascriptNameTreeNode5.getKids();
        pDJavascriptNameTreeNode2.setParent((org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>) pDJavascriptNameTreeNode5);
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript8 = pDJavascriptNameTreeNode5.getKids();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(list_pdnametreenode_pDActionJavaScript6);
        org.junit.Assert.assertNotNull(list_pdnametreenode_pDActionJavaScript8);
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        float[] f_array7 = new float[] { (byte) 10, (byte) 1 };
        pDExportFormatAttributeObject1.setColumnGaps(f_array7);
        pDExportFormatAttributeObject1.setAllPaddings(2);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(f_array7);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
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
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState18 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState18.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        boolean b21 = pDExtendedGraphicsState18.getAlphaSourceFlag();
        pDExtendedGraphicsState18.setNonStrokingAlphaConstant((java.lang.Float) 10.0f);
        org.apache.pdfbox.pdmodel.graphics.PDLineDashPattern pDLineDashPattern24 = pDExtendedGraphicsState18.getLineDashPattern();
        try {
            pDPageContentStream17.setGraphicsStateParameters(pDExtendedGraphicsState18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNull(pDLineDashPattern24);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList0 = org.apache.pdfbox.pdmodel.font.encoding.GlyphList.getAdobeGlyphList();
        java.lang.String str2 = glyphList0.sequenceToName("UpperAlpha");
        java.io.InputStream inputStream3 = null;
        try {
            org.apache.pdfbox.pdmodel.font.encoding.GlyphList glyphList4 = new org.apache.pdfbox.pdmodel.font.encoding.GlyphList(glyphList0, inputStream3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(glyphList0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".notdef" + "'", str2.equals(".notdef"));
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DIFFERENCE;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationText.NAME_KEY;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Key" + "'", str0.equals("Key"));
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        float f6 = pDExportFormatAttributeObject1.getSpaceBefore();
        float f7 = pDExportFormatAttributeObject1.getBaselineShift();
        float f8 = pDExportFormatAttributeObject1.getBaselineShift();
        org.junit.Assert.assertTrue(f5 == (-1.0f));
        org.junit.Assert.assertTrue(f6 == 0.0f);
        org.junit.Assert.assertTrue(f7 == 0.0f);
        org.junit.Assert.assertTrue(f8 == 0.0f);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle0 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray1 = pDRectangle0.getCOSArray();
        cOSArray1.clear();
        org.apache.pdfbox.cos.COSName cOSName4 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray1.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName4);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma6 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray1);
        try {
            float f7 = pDGamma6.getG();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle0);
        org.junit.Assert.assertNotNull(cOSArray1);
        org.junit.Assert.assertNotNull(cOSName4);
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateBuilder pDFTemplateBuilder0 = null;
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateCreator pDFTemplateCreator1 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDFTemplateCreator(pDFTemplateBuilder0);
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.visible.PDVisibleSignDesigner pDVisibleSignDesigner2 = null;
        try {
            java.io.InputStream inputStream3 = pDFTemplateCreator1.buildPDF(pDVisibleSignDesigner2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
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
        pDWindowsLaunchParams17.setOperation("MediaBox");
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSName4);
        org.junit.Assert.assertNull(str5);
        org.junit.Assert.assertNotNull(cOSDictionary8);
        org.junit.Assert.assertNotNull(pDWindowsLaunchParams17);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
        org.apache.pdfbox.pdmodel.DefaultResourceCache defaultResourceCache0 = new org.apache.pdfbox.pdmodel.DefaultResourceCache();
        org.apache.pdfbox.cos.COSObject cOSObject1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.markedcontent.PDPropertyList pDPropertyList2 = null;
        defaultResourceCache0.put(cOSObject1, pDPropertyList2);
        org.apache.pdfbox.cos.COSObject cOSObject4 = null;
        org.apache.pdfbox.pdmodel.graphics.pattern.PDAbstractPattern pDAbstractPattern5 = defaultResourceCache0.getPattern(cOSObject4);
        org.junit.Assert.assertNull(pDAbstractPattern5);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDLayoutAttributeObject.TEXT_ALIGN_CENTER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Center" + "'", str0.equals("Center"));
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
        pDAnnotationLine0.setCaption(false);
        pDAnnotationLine0.setAnnotationFlags(100);
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
    }

    @Test
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
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
        pDAnnotationLine0.setConstantOpacity((float) 'a');
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i5 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary7);
        org.junit.Assert.assertNotNull(cOSBase9);
        org.junit.Assert.assertNotNull(f_array13);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.pdfbox.cos.COSInteger cOSInteger0 = org.apache.pdfbox.cos.COSInteger.ZERO;
        org.junit.Assert.assertNotNull(cOSInteger0);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.StandardStructureTypes.SPAN;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Span" + "'", str0.equals("Span"));
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.pdfbox.pdmodel.font.PDType1Font pDType1Font0 = org.apache.pdfbox.pdmodel.font.PDType1Font.HELVETICA_BOLD;
        java.lang.String str1 = pDType1Font0.toString();
        byte[] byte_array3 = pDType1Font0.encode("H");
        org.junit.Assert.assertNotNull(pDType1Font0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "PDType1Font Helvetica-Bold" + "'", str1.equals("PDType1Font Helvetica-Bold"));
        org.junit.Assert.assertNotNull(byte_array3);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
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
        pDUserAttributeObject0.userPropertyChanged(pDUserProperty12);
        java.lang.Object obj14 = null;
        boolean b15 = pDUserProperty12.equals(obj14);
        org.junit.Assert.assertNotNull(cOSDictionary2);
        org.junit.Assert.assertNotNull(pDUserProperty_array5);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertNotNull(cOSDictionary10);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB pDCalRGB0 = new org.apache.pdfbox.pdmodel.graphics.color.PDCalRGB();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = org.apache.pdfbox.pdmodel.common.PDRectangle.A2;
        org.apache.pdfbox.cos.COSArray cOSArray2 = pDRectangle1.getCOSArray();
        cOSArray2.clear();
        org.apache.pdfbox.cos.COSName cOSName5 = org.apache.pdfbox.cos.COSName.CONTACT_INFO;
        cOSArray2.growToSize((int) (byte) -1, (org.apache.pdfbox.cos.COSBase) cOSName5);
        org.apache.pdfbox.pdmodel.graphics.color.PDGamma pDGamma7 = new org.apache.pdfbox.pdmodel.graphics.color.PDGamma(cOSArray2);
        pDCalRGB0.setGamma(pDGamma7);
        try {
            pDGamma7.setR((float) 1);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(pDRectangle1);
        org.junit.Assert.assertNotNull(cOSArray2);
        org.junit.Assert.assertNotNull(cOSName5);
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        java.lang.String str4 = pDUserProperty3.toString();
        pDUserProperty3.setHidden(false);
        java.lang.String str7 = pDUserProperty3.getName();
        boolean b8 = pDUserProperty3.isHidden();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Name=null, Value=null, FormattedValue=null, Hidden=false" + "'", str4.equals("Name=null, Value=null, FormattedValue=null, Hidden=false"));
        org.junit.Assert.assertNull(str7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
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
            pDPageContentStream17.endMarkedContentSequence();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        int i6 = cOSDictionary4.getInt("Expired");
        org.apache.pdfbox.cos.COSName cOSName7 = org.apache.pdfbox.cos.COSName.A;
        cOSDictionary4.setInt(cOSName7, 100);
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo10 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo(cOSDictionary4);
        org.apache.pdfbox.cos.COSName cOSName11 = org.apache.pdfbox.cos.COSName.COLORS;
        cOSDictionary4.setLong(cOSName11, (long) (byte) 0);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i6 == (-1));
        org.junit.Assert.assertNotNull(cOSName7);
        org.junit.Assert.assertNotNull(cOSName11);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent renderingIntent0 = org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.SATURATION;
        org.junit.Assert.assertTrue("'" + renderingIntent0 + "' != '" + org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.SATURATION + "'", renderingIntent0.equals(org.apache.pdfbox.pdmodel.graphics.state.RenderingIntent.SATURATION));
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
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
            org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN21 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN(cOSArray8);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
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
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode();
        org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode pDJavascriptNameTreeNode1 = new org.apache.pdfbox.pdmodel.PDJavascriptNameTreeNode();
        pDJavascriptNameTreeNode0.setParent((org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>) pDJavascriptNameTreeNode1);
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.interactive.action.PDActionJavaScript>> list_pdnametreenode_pDActionJavaScript3 = pDJavascriptNameTreeNode0.getKids();
        org.junit.Assert.assertNull(list_pdnametreenode_pDActionJavaScript3);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
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
            pDPageContentStream17.drawLine((float) 100L, (float) 32, (float) (-4), (float) 10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(cOSStream9);
        org.junit.Assert.assertNotNull(outputStream10);
        org.junit.Assert.assertNotNull(pDStream12);
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup pDAnnotationTextMarkup1 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationTextMarkup("FileAttachment");
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        int i0 = org.apache.pdfbox.pdmodel.encryption.PDEncryption.VERSION4_SECURITY_HANDLER;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        org.apache.pdfbox.cos.COSArray cOSArray21 = new org.apache.pdfbox.cos.COSArray();
        pDShadingType1_6.setBackground(cOSArray21);
        org.apache.pdfbox.cos.COSArray cOSArray23 = null;
        cOSArray21.addAll(cOSArray23);
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(pDRectangle7);
        org.junit.Assert.assertNotNull(cOSArray8);
        org.junit.Assert.assertNotNull(cOSName11);
        org.junit.Assert.assertNotNull(pDRectangle13);
        org.junit.Assert.assertNotNull(cOSArray14);
        org.junit.Assert.assertNotNull(cOSName17);
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.IT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo pDActionGoTo0 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionGoTo();
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        pDStructureElement2.setStructureType("Squiggly");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode8 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement9 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode8);
        pDStructureElement9.setRevisionNumber(100);
        boolean b12 = pDStructureElement2.removeKid(pDStructureElement9);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.VERSION;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        pDDocument0.setVersion((float) (byte) 0);
        org.apache.pdfbox.pdmodel.common.PDMetadata pDMetadata4 = new org.apache.pdfbox.pdmodel.common.PDMetadata(pDDocument0);
        org.apache.pdfbox.cos.COSStream cOSStream5 = pDMetadata4.getCOSObject();
        java.io.OutputStream outputStream6 = cOSStream5.createFilteredStream();
        org.apache.pdfbox.pdmodel.common.PDObjectStream pDObjectStream7 = new org.apache.pdfbox.pdmodel.common.PDObjectStream(cOSStream5);
        java.util.List<org.apache.pdfbox.cos.COSName> list_cOSName8 = pDObjectStream7.getFilters();
        org.junit.Assert.assertNotNull(cOSStream5);
        org.junit.Assert.assertNotNull(outputStream6);
        org.junit.Assert.assertNull(list_cOSName8);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.DI;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference pDObjectReference3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDObjectReference();
        pDStructureElement2.appendKid(pDObjectReference3);
        org.apache.pdfbox.pdmodel.common.COSObjectable cOSObjectable5 = pDObjectReference3.getReferencedObject();
        org.junit.Assert.assertNull(cOSObjectable5);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_6 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary1);
        pDShadingType1_6.setShadingType(0);
        int i9 = pDShadingType1_6.getShadingType();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertTrue(i9 == 1);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.STRUCT_PARENT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo pDMarkInfo0 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDMarkInfo();
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.HEIGHT;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureNode pDStructureNode1 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement pDStructureElement2 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement("O=TD, Padding=10.0, LineHeight=Normal", pDStructureNode1);
        pDStructureElement2.setRevisionNumber(100);
        pDStructureElement2.setStructureType("Squiggly");
        org.apache.pdfbox.cos.COSInteger cOSInteger7 = org.apache.pdfbox.cos.COSNumber.ONE;
        int i8 = cOSInteger7.intValue();
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
        org.apache.pdfbox.io.RandomAccessWrite randomAccessWrite40 = null;
        org.apache.pdfbox.io.RandomAccessOutputStream randomAccessOutputStream41 = new org.apache.pdfbox.io.RandomAccessOutputStream(randomAccessWrite40);
        randomAccessOutputStream41.flush();
        org.apache.pdfbox.pdfwriter.COSStandardOutputStream cOSStandardOutputStream43 = new org.apache.pdfbox.pdfwriter.COSStandardOutputStream((java.io.OutputStream) randomAccessOutputStream41);
        long long44 = cOSStandardOutputStream43.getPos();
        org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream pDAppearanceContentStream45 = new org.apache.pdfbox.pdmodel.interactive.annotation.PDAppearanceContentStream(pDAppearanceStream16, (java.io.OutputStream) cOSStandardOutputStream43);
        pDStructureElement2.insertBefore(cOSInteger7, (java.lang.Object) pDAppearanceStream16);
        org.junit.Assert.assertNotNull(cOSInteger7);
        org.junit.Assert.assertTrue(i8 == 1);
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
        org.junit.Assert.assertTrue(long44 == 0L);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.REASON;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
        org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature pDSignature0 = new org.apache.pdfbox.pdmodel.interactive.digitalsignature.PDSignature();
        pDSignature0.setContactInfo("CSS-2.00");
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.FF;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.pdfbox.pdmodel.PDDocument pDDocument0 = new org.apache.pdfbox.pdmodel.PDDocument();
        org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile pDEmbeddedFile1 = new org.apache.pdfbox.pdmodel.common.filespecification.PDEmbeddedFile(pDDocument0);
        org.apache.pdfbox.cos.COSDocument cOSDocument2 = pDDocument0.getDocument();
        long long3 = cOSDocument2.getStartXref();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDPageTree4.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions pDAdditionalActions6 = new org.apache.pdfbox.pdmodel.interactive.action.PDAdditionalActions(cOSDictionary5);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject8 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject8.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary11 = pDExportFormatAttributeObject8.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName13 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary11.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName13, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache16 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources17 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary11, resourceCache16);
        org.apache.pdfbox.pdmodel.graphics.form.PDFormXObject pDFormXObject18 = null;
        org.apache.pdfbox.cos.COSName cOSName19 = pDResources17.add(pDFormXObject18);
        java.lang.String str20 = cOSDictionary5.getNameAsString(cOSName19);
        cOSDocument2.setEncryptionDictionary(cOSDictionary5);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject24 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject24.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary27 = pDExportFormatAttributeObject24.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName29 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary27.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName29, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache32 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources33 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary27, resourceCache32);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName34 = pDResources33.getPropertiesNames();
        org.apache.pdfbox.cos.COSName cOSName35 = org.apache.pdfbox.cos.COSName.EMPTY;
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree36 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary37 = pDPageTree36.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject38 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty39 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary37, pDUserAttributeObject38);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent40 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary37);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit41 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary37);
        org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1 pDShadingType1_42 = new org.apache.pdfbox.pdmodel.graphics.shading.PDShadingType1(cOSDictionary37);
        pDResources33.put(cOSName35, (org.apache.pdfbox.pdmodel.graphics.shading.PDShading) pDShadingType1_42);
        org.apache.pdfbox.cos.COSName cOSName44 = org.apache.pdfbox.cos.COSName.URL;
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation45 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        pDResources33.put(cOSName44, (org.apache.pdfbox.pdmodel.graphics.color.PDColorSpace) pDSeparation45);
        java.lang.String str48 = cOSDictionary5.getEmbeddedString("XML-1.00", cOSName44, "rg");
        org.junit.Assert.assertNotNull(cOSDocument2);
        org.junit.Assert.assertTrue(long3 == 0L);
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSDictionary11);
        org.junit.Assert.assertNotNull(cOSName13);
        org.junit.Assert.assertNotNull(cOSName19);
        org.junit.Assert.assertNull(str20);
        org.junit.Assert.assertNotNull(cOSDictionary27);
        org.junit.Assert.assertNotNull(cOSName29);
        org.junit.Assert.assertNotNull(iterable_cOSName34);
        org.junit.Assert.assertNotNull(cOSName35);
        org.junit.Assert.assertNotNull(cOSDictionary37);
        org.junit.Assert.assertNotNull(cOSName44);
        org.junit.Assert.assertTrue("'" + str48 + "' != '" + "rg" + "'", str48.equals("rg"));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours2 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours2);
        java.lang.Object obj4 = pDExportFormatAttributeObject1.getTBorderStyle();
        java.lang.String str5 = pDExportFormatAttributeObject1.toString();
        org.junit.Assert.assertTrue("'" + obj4 + "' != '" + "None" + "'", obj4.equals("None"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "O=TD" + "'", str5.equals("O=TD"));
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
        org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode pDStructureElementNameTreeNode0 = new org.apache.pdfbox.pdmodel.PDStructureElementNameTreeNode();
        boolean b1 = pDStructureElementNameTreeNode0.isRootNode();
        java.util.List<org.apache.pdfbox.pdmodel.common.PDNameTreeNode<org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDStructureElement>> list_pdnametreenode_pDStructureElement2 = pDStructureElementNameTreeNode0.getKids();
        java.lang.String str3 = pDStructureElementNameTreeNode0.getUpperLimit();
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNull(list_pdnametreenode_pDStructureElement2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree4 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary5 = pDPageTree4.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition pDTransition6 = new org.apache.pdfbox.pdmodel.interactive.pagenavigation.PDTransition(cOSDictionary5);
        org.apache.pdfbox.cos.COSBase cOSBase7 = pDTransition6.getDirection();
        pDPage2.setTransition(pDTransition6, (float) 1);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle10 = pDPage2.getCropBox();
        boolean b11 = pDPage2.hasContents();
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary5);
        org.junit.Assert.assertNotNull(cOSBase7);
        org.junit.Assert.assertNotNull(pDRectangle10);
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        pDExportFormatAttributeObject1.setLineHeightNormal();
        float f5 = pDExportFormatAttributeObject1.getTextDecorationThickness();
        float f6 = pDExportFormatAttributeObject1.getSpaceBefore();
        java.lang.Object obj7 = pDExportFormatAttributeObject1.getHeight();
        java.lang.Object obj8 = pDExportFormatAttributeObject1.getBorderStyle();
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDFourColours pDFourColours9 = null;
        pDExportFormatAttributeObject1.setBorderColors(pDFourColours9);
        pDExportFormatAttributeObject1.setAllTPaddings(7);
        org.junit.Assert.assertTrue(f5 == (-1.0f));
        org.junit.Assert.assertTrue(f6 == 0.0f);
        org.junit.Assert.assertTrue("'" + obj7 + "' != '" + "Auto" + "'", obj7.equals("Auto"));
        org.junit.Assert.assertTrue("'" + obj8 + "' != '" + "None" + "'", obj8.equals("None"));
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject pDExportFormatAttributeObject1 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDExportFormatAttributeObject("TD");
        pDExportFormatAttributeObject1.setAllPaddings((int) (short) 10);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDExportFormatAttributeObject1.getCOSObject();
        org.apache.pdfbox.cos.COSName cOSName6 = org.apache.pdfbox.cos.COSName.OBJ_STM;
        cOSDictionary4.setEmbeddedInt("O=TD, Padding=10.0, LineHeight=Normal", cOSName6, (int) (short) 0);
        org.apache.pdfbox.pdmodel.ResourceCache resourceCache9 = null;
        org.apache.pdfbox.pdmodel.PDResources pDResources10 = new org.apache.pdfbox.pdmodel.PDResources(cOSDictionary4, resourceCache9);
        java.lang.Iterable<org.apache.pdfbox.cos.COSName> iterable_cOSName11 = pDResources10.getPropertiesNames();
        org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState pDExtendedGraphicsState12 = new org.apache.pdfbox.pdmodel.graphics.state.PDExtendedGraphicsState();
        pDExtendedGraphicsState12.setStrokingAlphaConstant((java.lang.Float) 1.0f);
        org.apache.pdfbox.cos.COSName cOSName15 = pDResources10.add(pDExtendedGraphicsState12);
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertNotNull(cOSName6);
        org.junit.Assert.assertNotNull(iterable_cOSName11);
        org.junit.Assert.assertNotNull(cOSName15);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.cos.COSDictionary cOSDictionary1 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserAttributeObject pDUserAttributeObject2 = null;
        org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty pDUserProperty3 = new org.apache.pdfbox.pdmodel.documentinterchange.logicalstructure.PDUserProperty(cOSDictionary1, pDUserAttributeObject2);
        org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent pDArtifactMarkedContent4 = new org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDArtifactMarkedContent(cOSDictionary1);
        org.apache.pdfbox.pdmodel.fdf.FDFIconFit fDFIconFit5 = new org.apache.pdfbox.pdmodel.fdf.FDFIconFit(cOSDictionary1);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary6 = fDFIconFit5.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences pDViewerPreferences7 = new org.apache.pdfbox.pdmodel.interactive.viewerpreferences.PDViewerPreferences(cOSDictionary6);
        java.lang.String str8 = pDViewerPreferences7.getReadingDirection();
        org.junit.Assert.assertNotNull(cOSDictionary1);
        org.junit.Assert.assertNotNull(cOSDictionary6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "L2R" + "'", str8.equals("L2R"));
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.CP;
        org.junit.Assert.assertNotNull(cOSName0);
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        char[] char_array1 = org.apache.pdfbox.util.Hex.getChars((short) (byte) 0);
        org.junit.Assert.assertNotNull(char_array1);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree0 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle1 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage2 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle1);
        int i3 = pDPageTree0.indexOf(pDPage2);
        org.apache.pdfbox.cos.COSDictionary cOSDictionary4 = pDPageTree0.getCOSObject();
        org.apache.pdfbox.pdmodel.PDPageTree pDPageTree5 = new org.apache.pdfbox.pdmodel.PDPageTree();
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle6 = null;
        org.apache.pdfbox.pdmodel.PDPage pDPage7 = new org.apache.pdfbox.pdmodel.PDPage(pDRectangle6);
        int i8 = pDPageTree5.indexOf(pDPage7);
        java.util.Iterator<org.apache.pdfbox.pdmodel.common.PDStream> iterator_pDStream9 = pDPage7.getContentStreams();
        try {
            pDPageTree0.remove(pDPage7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(i3 == (-1));
        org.junit.Assert.assertNotNull(cOSDictionary4);
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertNotNull(iterator_pDStream9);
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.interactive.annotation.PDAnnotationRubberStamp.NAME_CONFIDENTIAL;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Confidential" + "'", str0.equals("Confidential"));
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        int i0 = org.apache.pdfbox.pdmodel.graphics.pattern.PDTilingPattern.PAINT_COLORED;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        java.lang.String str0 = org.apache.pdfbox.pdmodel.documentinterchange.taggedpdf.PDPrintFieldAttributeObject.ROLE_CB;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "cb" + "'", str0.equals("cb"));
    }
}
