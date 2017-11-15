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
        org.apache.pdfbox.cos.COSDocument cOSDocument0 = new org.apache.pdfbox.cos.COSDocument();
        org.apache.pdfbox.pdmodel.fdf.FDFDocument fDFDocument1 = new org.apache.pdfbox.pdmodel.fdf.FDFDocument(cOSDocument0);
        fDFDocument1.save("OEB-1.00");
    }

    @Test
    public void test2() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test2");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_1 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName0);
        org.apache.pdfbox.util.Matrix matrix8 = new org.apache.pdfbox.util.Matrix((float) (byte) 1, 100.0f, (float) (byte) 100, (float) 0, (float) (byte) -1, 0.0f);
        org.apache.pdfbox.cos.COSArray cOSArray9 = matrix8.toCOSArray();
        java.lang.String str11 = cOSArray9.getString((int) (byte) 1);
        pDFunctionType3_1.setRangeValues(cOSArray9);
    }

    @Test
    public void test3() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test3");
        org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN pDDeviceN0 = new org.apache.pdfbox.pdmodel.graphics.color.PDDeviceN();
        java.lang.String str1 = pDDeviceN0.getName();
        org.apache.pdfbox.pdmodel.common.function.PDFunction pDFunction2 = pDDeviceN0.getTintTransform();
    }

    @Test
    public void test4() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test4");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_2 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName1);
        pDSeparation0.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionType3_2);
        org.apache.pdfbox.cos.COSArray cOSArray4 = pDFunctionType3_2.getEncode();
    }

    @Test
    public void test5() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test5");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_2 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName1);
        pDSeparation0.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionType3_2);
        int i4 = pDFunctionType3_2.getNumberOfInputParameters();
    }

    @Test
    public void test6() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test6");
        org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination pDPageFitWidthDestination0 = new org.apache.pdfbox.pdmodel.interactive.documentnavigation.destination.PDPageFitWidthDestination();
        pDPageFitWidthDestination0.setTop((int) (short) 100);
        org.apache.pdfbox.cos.COSArray cOSArray3 = pDPageFitWidthDestination0.getCOSObject();
        org.apache.pdfbox.pdmodel.interactive.action.PDActionSound pDActionSound4 = new org.apache.pdfbox.pdmodel.interactive.action.PDActionSound();
        float f5 = pDActionSound4.getVolume();
        cOSArray3.add((org.apache.pdfbox.pdmodel.common.COSObjectable) pDActionSound4);
        org.apache.pdfbox.pdmodel.common.PDRectangle pDRectangle7 = new org.apache.pdfbox.pdmodel.common.PDRectangle(cOSArray3);
    }

    @Test
    public void test7() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test7");
        org.apache.pdfbox.cos.COSName cOSName0 = org.apache.pdfbox.cos.COSName.RV;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType0 pDFunctionType0_1 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType0((org.apache.pdfbox.cos.COSBase) cOSName0);
        int i2 = pDFunctionType0_1.getBitsPerSample();
    }

    @Test
    public void test8() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test8");
        org.apache.pdfbox.pdmodel.graphics.color.PDSeparation pDSeparation0 = new org.apache.pdfbox.pdmodel.graphics.color.PDSeparation();
        org.apache.pdfbox.cos.COSName cOSName1 = org.apache.pdfbox.cos.COSName.ARTIFACT;
        org.apache.pdfbox.pdmodel.common.function.PDFunctionType3 pDFunctionType3_2 = new org.apache.pdfbox.pdmodel.common.function.PDFunctionType3((org.apache.pdfbox.cos.COSBase) cOSName1);
        pDSeparation0.setTintTransform((org.apache.pdfbox.pdmodel.common.function.PDFunction) pDFunctionType3_2);
        java.lang.String str4 = pDSeparation0.toString();
    }
}

