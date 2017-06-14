
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test001"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceUnion(document0, "FF 64 64 64 0A 00");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test002"); }

    int i0 = org.apache.xml.security.algorithms.encryption.EncryptionMethodSpi.ALGOTYPE_STREAM_ENCRYPTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test003"); }

    org.apache.xml.security.Init.registerKeyInfoContentHandler("http://www.w3.org/2001/04/xmlenc#aes192-cbc", "http://www.w3.org/2000/09/xmldsig#dsa-sha1", "SignatureMethod");

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test004"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXSLT.XSLTSTYLESHEET;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "stylesheet"+ "'", str0.equals("stylesheet"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test005"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceUnion(document0, "http://www.w3.org/2000/09/xmldsig#sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test006"); }

    java.lang.String str0 = org.apache.xml.security.keys.content.RetrievalMethod.TYPE_DSA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#DSAKeyValue"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#DSAKeyValue"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test007"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "CipherValue", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test008"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test009"); }

    org.apache.xml.security.utils.I18n.defaultCountryCode = "ks";

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test010"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    byte[] byte_array2 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str3 = ant.HexDump.toString(byte_array2);
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.lang.String str5 = ant.HexDump.toHexString(byte_array2);
    java.security.Key key6 = null;
    byte[] byte_array8 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str9 = ant.HexDump.toString(byte_array8);
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array8);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array11 = blockEncryptionImpl_AES192_BC0.engineEncrypt(byte_array2, key6, byte_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\u0000\u0000\u0000 "+ "'", str3.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str4.equals("0000: 00 00 00 20                                        ... \n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00 00 00 20 "+ "'", str5.equals("00 00 00 20 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "\u0000\u0000\u0000 "+ "'", str9.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str10.equals("0000: 00 00 00 20                                        ... \n"));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test011"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str6 = ant.HexDump.toHexString(byte_array3);
    java.security.Key key7 = null;
    byte[] byte_array14 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str15 = ant.HexDump.byteArrayToHexString(byte_array14);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array16 = blockEncryptionImpl_AES192_BC0.engineEncrypt(byte_array3, key7, byte_array14);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u0000\u0000\u0000 "+ "'", str4.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str5.equals("0000: 00 00 00 20                                        ... \n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "00 00 00 20 "+ "'", str6.equals("00 00 00 20 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "00 01 FF 64 64 00"+ "'", str15.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test012"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_WITH_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test013"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "Seed", "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test014"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_BASE64_DECODE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#base64"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#base64"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test015"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.Base64.encodeToElement(document0, "Manifest", byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test016"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI9 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(document0, byte_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FF 64 64 64 0A 00"+ "'", str8.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test017"); }

    java.lang.String str0 = org.apache.xml.security.utils.XMLUtils.getRandomNamespacePrefix();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xmlsecurityOrgPrefv62RV8QygCi4lzCcUXRdSj7LraFR"+ "'", str0.equals("xmlsecurityOrgPrefv62RV8QygCi4lzCcUXRdSj7LraFR"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test018"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperty signatureProperty2 = new org.apache.xml.security.signature.SignatureProperty(element0, "Reference");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test019"); }

    org.apache.xml.security.Init.init();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test020"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createDSctx(document0, "X509SKI", "http://www.xmlsecurity.org/NS#randomval");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test021"); }

    int i2 = org.apache.xml.security.encryption.EncryptedData.min((int)'a', (int)(short)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test022"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = org.apache.xml.security.utils.resolver.ResourceResolver.resolveStatic(attr0, "Id");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test023"); }

    java.lang.String str1 = org.apache.xml.security.utils.I18n.translate("KeyName");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test024"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm3 = new org.apache.xml.security.algorithms.SignatureAlgorithm(document0, "SignedInfo", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test025"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.SIGNATURESPECIFICATION_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/"+ "'", str0.equals("http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test026"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo3 = new org.apache.xml.security.signature.SignedInfo(document0, "X509SKI", "JCAType");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test027"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInSignatureSpace(element0, "Nonce");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.signature.XMLSignatureException");
    } catch (org.apache.xml.security.signature.XMLSignatureException e) {
      // Expected exception.
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test028"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm2 = new org.apache.xml.security.algorithms.SignatureAlgorithm(element0, "http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test029"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    org.w3c.dom.Element element2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams3 = keyWrapImpl_AES128_BC0.engineInit(element2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test030"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.X509Data x509Data1 = new org.apache.xml.security.keys.content.X509Data(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test031"); }

    org.apache.xml.security.keys.KeyInfo.init();

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test032"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.EncryptionSpecNS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#"));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test033"); }

    java.util.Set set1 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("XPath");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test034"); }

    java.lang.String str2 = org.apache.xml.security.algorithms.JCEMapper.getJCEKeyAlgorithmFromURI("BC", "3240041E4CC4144204014034154CE4");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test035"); }

    org.apache.xml.security.utils.IgnoreAllErrorHandler ignoreAllErrorHandler0 = new org.apache.xml.security.utils.IgnoreAllErrorHandler();
    org.xml.sax.SAXParseException sAXParseException1 = null;
    ignoreAllErrorHandler0.error(sAXParseException1);
    org.xml.sax.SAXParseException sAXParseException3 = null;
    ignoreAllErrorHandler0.error(sAXParseException3);
    org.xml.sax.SAXParseException sAXParseException5 = null;
    ignoreAllErrorHandler0.warning(sAXParseException5);
    org.xml.sax.SAXParseException sAXParseException7 = null;
    ignoreAllErrorHandler0.error(sAXParseException7);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test036"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("Date", "00 00 00 03 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test037"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.security.Provider.Service> set_service2 = apacheXMLProvider0.getServices();
    java.io.OutputStream outputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.storeToXML(outputStream3, "http://www.w3.org/TR/2001/WD-xptr-20010108");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service2);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test038"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str3.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test039"); }

    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test040"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInSignatureSpace(element0, "Recipient");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test041"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPathFilterCHGPContainer xPathFilterCHGPContainer5 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.getInstance(document0, true, "", "EncryptionMethod", "00400400420");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test042"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform2 = new org.apache.xml.security.transforms.Transform(element0, "aa  aa a aaaaaaaa aaa    a   aa  aa aaa a aa aa aaaaa aaaaaaa  aaaaaa   aaa a a    aa   a");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test043"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createElementFromBigint(document0, "\n", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test044"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509DATA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509Data"+ "'", str0.equals("X509Data"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test045"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(element0, "\n");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test046"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("KeyInfo");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "KeyInfo"+ "'", str1.equals("KeyInfo"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test047"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509SERIALNUMBER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509SerialNumber"+ "'", str0.equals("X509SerialNumber"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test048"); }

    java.lang.String str0 = org.apache.xml.security.signature.Reference.OBJECT_URI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#Object"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#Object"));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test049"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("PGPKeyPacket");

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test050"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.security.Provider.Service> set_service2 = apacheXMLProvider0.getServices();
    java.io.InputStream inputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.loadFromXML(inputStream3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service2);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test051"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Vector vector2 = org.apache.xml.security.utils.XMLUtils.getAncestorElements(node0, node1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test052"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.lang.String str1 = canonicalizer20010315OmitComments0.engineGetURI();
    boolean b2 = canonicalizer20010315OmitComments0.engineGetIncludeComments();
    java.util.Set set4 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("http://www.w3.org/2001/04/xmlenc#kw-aes128");
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = canonicalizer20010315OmitComments0.engineCanonicalizeXPathNodeSet(set4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test053"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.PGPData pGPData2 = new org.apache.xml.security.keys.content.PGPData(element0, "http://www.w3.org/2001/04/xmlenc#kw-aes128");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test054"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._ATT_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Type"+ "'", str0.equals("Type"));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test055"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString((long)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00#00#00#00#00#00#00#01#"+ "'", str1.equals("00#00#00#00#00#00#00#01#"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test056"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.KeyInfo keyInfo2 = new org.apache.xml.security.keys.KeyInfo(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test057"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SIGNATUREPROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SignatureProperties"+ "'", str0.equals("SignatureProperties"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test058"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException8 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array5);
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException15 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array14);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException16 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array14);
    algorithmAlreadyRegisteredException11.addSuppressed((java.lang.Throwable)invalidCanonicalizerException16);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException18 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("KeyName", obj_array5, (java.lang.Exception)invalidCanonicalizerException16);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException19 = new org.apache.xml.security.signature.ReferenceNotInitializedException("InclusiveNamespaces", (java.lang.Exception)invalidCanonicalizerException16);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException20 = new org.apache.xml.security.exceptions.XMLSecurityException((java.lang.Exception)referenceNotInitializedException19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test059"); }

    byte[] byte_array0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = ant.HexDump.byteArrayToHexString(byte_array0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test060"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("http://www.w3.org/2001/04/xmlenc#Element");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test061"); }

    java.lang.String str0 = org.apache.xml.security.utils.I18n.defaultLanguageCode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test062"); }

    byte[] byte_array6 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str7 = ant.HexDump.byteArrayToHexString(byte_array6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.toHexString(byte_array6, 64, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00 01 FF 64 64 00"+ "'", str7.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test063"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1"+ "'", str1.equals("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1"));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test064"); }

    org.w3c.dom.Element element0 = null;
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.lang.String str4 = org.apache.xml.security.utils.Base64.encode(byte_array2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams5 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array2);
    byte[] byte_array6 = oAEPParams5.getOAEPParamBytes();
    java.lang.String str7 = ant.HexDump.byteArrayToHexString(byte_array6);
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element8 = org.apache.xml.security.encryption.EncryptedData.replace(element0, byte_array6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yTZ4mVI+6vI="+ "'", str4.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "C9 36 78 99 52 3E EA F2"+ "'", str7.equals("C9 36 78 99 52 3E EA F2"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test065"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)1, (byte)10, (byte)10, (byte)-1, (byte)100 };
    java.security.Key key9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key11 = keyTransportImpl_RSAPKCS15_BC0.engineUnwrap(byte_array8, key9, "Id");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test066"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants._TAG_ALIAS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Alias"+ "'", str0.equals("Alias"));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test067"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.security.Key key5 = null;
    byte[] byte_array7 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array7);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array10 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array3, key5, byte_array7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u0000\u0000\u0000 "+ "'", str4.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str8.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test068"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("UTF8");

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test069"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    byte[] byte_array3 = ant.HexDump.toByteArray(1);
    java.security.cert.Certificate certificate4 = null;
    java.security.cert.Certificate[] certificate_array5 = new java.security.cert.Certificate[] { certificate4 };
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineSetKeyEntry("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.", byte_array3, certificate_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array5);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test070"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    java.util.Collection<java.lang.Object> collection_obj3 = apacheXMLProvider0.values();
    java.io.OutputStream outputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.store(outputStream4, "http://www.w3.org/2001/10/xml-exc-c14n#");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj3);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test071"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(element0, "\u0000\u0000\u0000 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test072"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.XMLUtils.createElementInEncryptionSpace(document0, "URI");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test073"); }

    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath0 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    boolean b1 = transformXPath0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test074"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(element0, "00 00 00 20 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test075"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toString((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d"+ "'", str1.equals("d"));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test076"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    java.lang.String[] str_array2 = resolverDirectHTTP0.engineGetPropertyKeys();
    org.w3c.dom.Attr attr3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = resolverDirectHTTP0.engineResolve(attr3, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test077"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_Q;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Q"+ "'", str0.equals("Q"));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test078"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array7 = oAEPParams6.getOAEPParamBytes();
    org.apache.xml.security.keys.KeyInfo keyInfo8 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties9 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData11 = new org.apache.xml.security.encryption.EncryptedData(document0, "http://www.w3.org/2001/04/xmlenc#sha256", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6, keyInfo8, encryptionProperties9, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test079"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_ALL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == (-1));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test080"); }

    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = null;
    java.security.PublicKey publicKey4 = retrievalMethodResolver0.engineResolvePublicKey(element1, "subtract", storageResolver3);
    org.w3c.dom.Element element5 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver7 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver10 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey11 = x509IssuerSerialResolver7.engineResolveSecretKey(element8, "subtract", storageResolver10);
    java.security.cert.X509Certificate x509Certificate12 = retrievalMethodResolver0.engineResolveX509Certificate(element5, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver10);
    java.security.KeyStore keyStore13 = null;
    // The following exception was thrown during execution in test generation
    try {
    storageResolver10.add(keyStore13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate12);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test081"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    org.w3c.dom.Document document1 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array7 = oAEPParams6.getOAEPParamBytes();
    java.lang.String str8 = oAEPParams6.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams9 = keyWrapImpl_AES256_BC0.engineInit(document1, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str8.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test082"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList2 = org.apache.xml.security.utils.XPathFuncHereAPI.selectNodeList(node0, node1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test083"); }

    org.w3c.dom.Element element0 = null;
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.NodeList nodeList2 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node1);
    java.util.Set set3 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList2);
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element4 = org.apache.xml.security.encryption.EncryptedData.replace(element0, nodeList2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test084"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "01100100"+ "'", str1.equals("01100100"));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test085"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array3);
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore7 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter8 = null;
    apacheKeyStore7.engineLoad(loadStoreParameter8);
    java.security.cert.Certificate[] certificate_array11 = apacheKeyStore7.engineGetCertificateChain("Date");
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.KeyElement keyElement12 = new org.apache.xml.security.keys.provider.KeyElement(document0, "01100100", byte_array3, certificate_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str6.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array11);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test086"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPath2FilterContainer._TAG_XPATH2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "XPath"+ "'", str0.equals("XPath"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test087"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    org.w3c.dom.Document document2 = null;
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    java.lang.String str6 = org.apache.xml.security.utils.Base64.encode(byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams8 = blockEncryptionImpl_TRIPLEDES_BC0.engineInit(document2, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "yTZ4mVI+6vI="+ "'", str6.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test088"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInSignatureSpace(element0, "                 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test089"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    java.io.PrintWriter printWriter3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.list(printWriter3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test090"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test091"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, "Algorithm");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test092"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.math.BigInteger bigInteger1 = org.apache.xml.security.utils.Base64.decodeBigIntegerFromElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test093"); }

    org.w3c.dom.Document document0 = null;
    java.security.PublicKey publicKey1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(document0, publicKey1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test094"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("http://www.w3.org/2001/04/xmlenc#sha256");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test095"); }

    java.lang.String str0 = org.apache.xml.security.utils.XMLUtils.getXercesVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Xerces-J 2.0.0"+ "'", str0.equals("Xerces-J 2.0.0"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test096"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    org.apache.xml.security.keys.KeyInfo keyInfo7 = null;
    java.security.Key key8 = null;
    java.security.Key key9 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties10 = null;
    org.apache.xml.security.encryption.ReferenceList referenceList11 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey16 = new org.apache.xml.security.encryption.EncryptedKey(document0, "11001001400110110401111000410011001401010010400111110411101010411110010", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6, keyInfo7, key8, key9, encryptionProperties10, referenceList11, "KeyReference", "", "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n", "32#00#1E#CC#14#20#01#03#15#CE");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test097"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceIntersect(document0, "http://www.xmlsecurity.org/NS#randomval");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test098"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(element0, "C9 36 78 99 52 3E EA F2");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test099"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI3 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(document0, byte_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str2.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test100"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.IdResolver.registerElementById(element0, "(.//. | .//@* | .//namespace::*)[not(self::comment())]");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test101"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo4 = new org.apache.xml.security.signature.SignedInfo(document0, "", "Id", (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test102"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer resolverXPointer0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    org.w3c.dom.Attr attr1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = resolverXPointer0.engineResolve(attr1, "KeyValue");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test103"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean b1 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    java.util.Set set2 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = canonicalizer20010315ExclWithComments0.engineCanonicalizeXPathNodeSet(set2, "00 00 00 20 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test104"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    java.io.Reader reader3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.load(reader3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test105"); }

    byte[] byte_array0 = org.apache.xml.security.keys.provider.KeyElement.salt;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array0, (-1), 76);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array0);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test106"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.XPATH_C14N_WITH_COMMENTS_SINGLE_NODE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "(.//. | .//@* | .//namespace::*)"+ "'", str0.equals("(.//. | .//@* | .//namespace::*)"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test107"); }

    javax.crypto.Cipher cipher0 = null;
    java.security.MessageDigest messageDigest1 = null;
    org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper tripleDESWrapper2 = new org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper(cipher0, messageDigest1);
    byte[] byte_array3 = null;
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = tripleDESWrapper2.unwrap(byte_array3, key4);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException");
    } catch (org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test108"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptionProperty encryptionProperty2 = new org.apache.xml.security.encryption.EncryptionProperty(element0, "CanonicalizationMethod");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test109"); }

    java.lang.String str2 = org.apache.xml.security.Init.getKeyInfoContentHandler("", "68 74 74 70 3A 2F 2F 77 77 77 2E 77 33 2E 6F 72 67 2F 32 30 30 30 2F 30 39 2F 78 6D 6C 64 73 69 67 23 58 35 30 39 44 61 74 61 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test110"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue2 = new org.apache.xml.security.encryption.CipherValue(element0, "Modulus");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test111"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo2 = new org.apache.xml.security.signature.SignedInfo(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test112"); }

    org.apache.xml.security.Init init0 = new org.apache.xml.security.Init();

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test113"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array7);
    java.security.Key key9 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key11 = keyWrapImpl_TRIPLEDES_BC0.engineUnwrap(byte_array7, key9, "aaaaaaaa aaaaaaaa aaaaaaaa aa  a aa");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FF 64 64 64 0A 00"+ "'", str8.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test114"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod1 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo2 = null;
    org.apache.xml.security.encryption.CipherData cipherData3 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData7 = new org.apache.xml.security.encryption.EncryptedData(document0, encryptionMethod1, keyInfo2, cipherData3, encryptionProperties4, "KeyInfo", "G");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test115"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(element0, "SignatureProperties");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test116"); }

    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test117"); }

    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver0.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey7 = retrievalMethodResolver0.engineResolvePublicKey(element4, "HMACOutputLength", storageResolver6);
    boolean b9 = retrievalMethodResolver0.understandsProperty("Modulus");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test118"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverFragment resolverFragment0 = new org.apache.xml.security.utils.resolver.implementations.ResolverFragment();
    org.w3c.dom.Attr attr1 = null;
    boolean b3 = resolverFragment0.engineCanResolve(attr1, "CertificateChain");
    org.w3c.dom.Attr attr4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = resolverFragment0.engineResolve(attr4, "KeyName");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test119"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.TYPE_CONTENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#Content"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#Content"));

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test120"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509SUBJECTNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509SubjectName"+ "'", str0.equals("X509SubjectName"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test121"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._ATT_TARGET;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Target"+ "'", str0.equals("Target"));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test122"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.JCEMapper.KEYTYPE_BLOCK_ENCRYPTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "BlockEncryption"+ "'", str0.equals("BlockEncryption"));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test123"); }

    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException1 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("xslt");

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test124"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver6 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element7 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver9 = null;
    java.security.PublicKey publicKey10 = retrievalMethodResolver6.engineResolvePublicKey(element7, "subtract", storageResolver9);
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver13 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver16 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey17 = x509IssuerSerialResolver13.engineResolveSecretKey(element14, "subtract", storageResolver16);
    java.security.cert.X509Certificate x509Certificate18 = retrievalMethodResolver6.engineResolveX509Certificate(element11, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver16);
    java.security.cert.X509Certificate x509Certificate19 = null;
    storageResolver16.add(x509Certificate19);
    javax.crypto.SecretKey secretKey21 = x509CertificateResolver3.engineResolveSecretKey(element4, "00 01 FF 64 64 00", storageResolver16);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey22 = x509CertificateResolver0.engineResolvePublicKey(element1, "http://www.w3.org/2000/09/xmldsig#Manifest", storageResolver16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey21);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test125"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException10 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array7);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException11 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array7);
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException15 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array14);
    java.lang.Object[] obj_array18 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException19 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array18);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException20 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array18);
    algorithmAlreadyRegisteredException15.addSuppressed((java.lang.Throwable)invalidCanonicalizerException20);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("ds", (java.lang.Exception)algorithmAlreadyRegisteredException15);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException23 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("X.509", obj_array7, (java.lang.Exception)algorithmAlreadyRegisteredException15);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException32 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array29);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException35 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException36 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException35);
    org.apache.xml.security.transforms.TransformationException transformationException37 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array29, (java.lang.Exception)xMLSecurityException36);
    java.lang.Object[] obj_array42 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException43 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array42);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException44 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array42);
    java.lang.Object[] obj_array48 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException49 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array48);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException50 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array48);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException51 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException50);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException52 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array42, (java.lang.Exception)invalidCanonicalizerException50);
    org.apache.xml.security.signature.Reference reference53 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException54 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array42, reference53);
    org.apache.xml.security.signature.Reference reference55 = null;
    missingResourceFailureException54.setReference(reference55);
    org.apache.xml.security.signature.Reference reference57 = missingResourceFailureException54.getReference();
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException58 = new org.apache.xml.security.signature.InvalidDigestValueException("Algorithm", obj_array29, (java.lang.Exception)missingResourceFailureException54);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException59 = new org.apache.xml.security.signature.InvalidSignatureValueException("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n", obj_array7, (java.lang.Exception)missingResourceFailureException54);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException60 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("aaaaaaaa aaaaaaaa aaaaaaaa aa  a aa", obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reference57);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test126"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transforms transforms1 = new org.apache.xml.security.transforms.Transforms(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test127"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_DATAREFERENCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "DataReference"+ "'", str0.equals("DataReference"));

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test128"); }

    java.security.Key key0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = org.apache.xml.security.algorithms.JCEMapper.getURIfromKey(key0, "0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test129"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("Signature");

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test130"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException7 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array4);
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException15 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array12);
    java.lang.Object[] obj_array19 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException20 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array19);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException21 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array19);
    java.lang.Object[] obj_array25 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException26 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array25);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException27 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array25);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException28 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException27);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException29 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array19, (java.lang.Exception)invalidCanonicalizerException27);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException30 = new org.apache.xml.security.signature.InvalidDigestValueException("PgenCounter", obj_array12, (java.lang.Exception)xMLSecurityException29);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException31 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2000/09/xmldsig#rsa-sha1", obj_array4, (java.lang.Exception)xMLSecurityException29);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException32 = new org.apache.xml.security.exceptions.XMLSecurityException((java.lang.Exception)referenceNotInitializedException31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test131"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    org.w3c.dom.Document document1 = null;
    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams3 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams4 = blockEncryptionImpl_AES192_BC0.engineInit(document1, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)streamParams3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test132"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.normalize("Encoding");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Encoding"+ "'", str1.equals("Encoding"));

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test133"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString((short)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FF#FF#"+ "'", str1.equals("FF#FF#"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test134"); }

    java.security.cert.X509Certificate x509Certificate0 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.keys.content.x509.XMLX509SKI.getSKIBytesFromCert(x509Certificate0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test135"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.c14n.Canonicalizer.register("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", "http://www.w3.org/2001/04/xmlenc#");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException");
    } catch (org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test136"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_XPATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/1999/REC-xpath-19991116"+ "'", str0.equals("http://www.w3.org/TR/1999/REC-xpath-19991116"));

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test137"); }

    java.lang.String str1 = ant.HexDump.toHexString((short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00 01 "+ "'", str1.equals("00 01 "));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test138"); }

    java.lang.Object[] obj_array1 = null;
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException10 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array7);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException11 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array7);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("", (java.lang.Exception)invalidDigestValueException11);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException13 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("EncryptionProperty", obj_array1, (java.lang.Exception)invalidDigestValueException11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test139"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.exceptionMessagesResourceBundleDir;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org/apache/xml/security/resource"+ "'", str0.equals("org/apache/xml/security/resource"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test140"); }

    int i0 = org.apache.xml.security.algorithms.encryption.EncryptionMethodSpi.ALGOTYPE_SYMMETRIC_KEY_WRAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test141"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test142"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    org.w3c.dom.Attr attr2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = resourceResolver1.resolve(attr2, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test143"); }

    org.w3c.dom.Node node0 = null;
    java.io.OutputStream outputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.outputDOMc14nWithComments(node0, outputStream1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test144"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509Certificate xMLX509Certificate2 = new org.apache.xml.security.keys.content.x509.XMLX509Certificate(element0, "UTF8");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test145"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_TEXT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 4);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test146"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.util.Enumeration enumeration3 = apacheKeyStore0.engineAliases();
    java.security.KeyStore.ProtectionParameter protectionParameter5 = null;
    java.security.KeyStore.Entry entry6 = apacheKeyStore0.engineGetEntry("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", protectionParameter5);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput8 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b9 = xMLSignatureInput8.isInitialized();
    boolean b10 = xMLSignatureInput8.isOctetStream();
    java.io.InputStream inputStream11 = xMLSignatureInput8.getOctetStream();
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore12 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter13 = null;
    apacheKeyStore12.engineLoad(loadStoreParameter13);
    java.io.InputStream inputStream15 = null;
    char[] char_array20 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore12.engineLoad(inputStream15, char_array20);
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineLoad(inputStream11, char_array20);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array20);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test147"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str4 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    byte[] byte_array7 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array7);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array7);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams10 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array7);
    java.lang.String str11 = ant.HexDump.toBinaryString(byte_array7);
    java.security.Key key12 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array13 = keyWrapImpl_AES128_BC0.engineDecrypt(byte_array7, key12);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str4.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str8.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str11.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test148"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array4);
    org.apache.xml.security.keys.KeyInfo keyInfo8 = null;
    org.apache.xml.security.encryption.CipherData cipherData9 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData13 = new org.apache.xml.security.encryption.EncryptedData(document0, "X509IssuerSerial", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams7, keyInfo8, cipherData9, encryptionProperties10, "0000: 00 00 00 20                                        ... \n", "");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test149"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL2 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(element0, "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test150"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_TARGET;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Target"+ "'", str0.equals("Target"));

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test151"); }

    org.apache.xml.security.c14n.Canonicalizer.init();

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test152"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String str1 = keyWrapImpl_AES192_BC0.getRequiredProviderName();
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", byte_array3);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array7 = keyWrapImpl_AES192_BC0.engineDecrypt(byte_array3, key6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test153"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    org.w3c.dom.Document document1 = null;
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams8 = keyWrapImpl_AES192_BC0.engineInit(document1, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test154"); }

    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException1 = new org.apache.xml.security.c14n.CanonicalizationException("http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/");

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test155"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_EXPONENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Exponent"+ "'", str0.equals("Exponent"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test156"); }

    javax.crypto.Cipher cipher0 = null;
    java.security.MessageDigest messageDigest1 = null;
    org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper tripleDESWrapper2 = new org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper(cipher0, messageDigest1);
    byte[] byte_array3 = null;
    java.security.Key key4 = null;
    byte[] byte_array7 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array7);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array7);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams10 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array7);
    java.lang.String str11 = ant.HexDump.toBinaryString(byte_array7);
    java.lang.String str12 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array13 = tripleDESWrapper2.wrap(byte_array3, key4, byte_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str8.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str11.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str12.equals("C9#36#78#99#52#3E#EA#F2"));

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test157"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str3 = ant.HexDump.toString(byte_array2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509Certificate xMLX509Certificate4 = new org.apache.xml.security.keys.content.x509.XMLX509Certificate(document0, byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\u0000\u0000\u0000 "+ "'", str3.equals("\u0000\u0000\u0000 "));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test158"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.loadFromXML(inputStream7);
      org.junit.Assert.fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test159"); }

    org.apache.xml.security.algorithms.implementations.SignatureDSA signatureDSA0 = new org.apache.xml.security.algorithms.implementations.SignatureDSA();

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test160"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("EncryptionProperties");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "EncryptionProperties"+ "'", str1.equals("EncryptionProperties"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test161"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeAttr("No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID &quot;KeyName&quot; found in resource bundle &quot;org/apache/xml/security/resource/xmlsecurity&quot;"+ "'", str1.equals("No message with ID &quot;KeyName&quot; found in resource bundle &quot;org/apache/xml/security/resource/xmlsecurity&quot;"));

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test162"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test163"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.stringToHexString("2.5.29.14");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "32#2E#35#2E#32#39#2E#31#34#"+ "'", str1.equals("32#2E#35#2E#32#39#2E#31#34#"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test164"); }

    java.lang.String str0 = org.apache.xml.security.utils.XMLUtils.getXalanVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Xalan Java 2.5.1"+ "'", str0.equals("Xalan Java 2.5.1"));

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test165"); }

    sun.security.x509.X500Name x500Name4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("ds", "Y", "Methods", "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name4);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test166"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.ObjectContainer objectContainer1 = new org.apache.xml.security.signature.ObjectContainer(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test167"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.security.Provider.Service> set_service2 = apacheXMLProvider0.getServices();
    java.lang.String str3 = apacheXMLProvider0.getInfo();
    java.lang.Object obj5 = apacheXMLProvider0.remove((java.lang.Object)"01100100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Apache XML Security Provider"+ "'", str3.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj5);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test168"); }

    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException1 = new org.apache.xml.security.keys.storage.StorageResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test169"); }

    java.lang.String str1 = ant.HexDump.stringToHexString("SignatureProperties");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "53 69 67 6E 61 74 75 72 65 50 72 6F 70 65 72 74 69 65 73 "+ "'", str1.equals("53 69 67 6E 61 74 75 72 65 50 72 6F 70 65 72 74 69 65 73 "));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test170"); }

    int i0 = org.apache.xml.security.algorithms.encryption.EncryptionMethodSpi.ALGOTYPE_KEY_AGREEMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 5);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test171"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException15 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array14);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException16 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array14);
    algorithmAlreadyRegisteredException11.addSuppressed((java.lang.Throwable)invalidCanonicalizerException16);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException18 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array6, (java.lang.Exception)algorithmAlreadyRegisteredException11);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException19 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n", (java.lang.Exception)algorithmAlreadyRegisteredException11);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException20 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.xmlsecurity.org/NS#randomval", (java.lang.Exception)invalidCanonicalizerException19);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException21 = new org.apache.xml.security.signature.InvalidDigestValueException("CertificateChain", (java.lang.Exception)invalidCanonicalizerException19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test172"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(document0, "http://www.w3.org/2001/10/xml-exc-c14n#");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test173"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.io.OutputStream outputStream3 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore4 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream5 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore6 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter7 = null;
    apacheKeyStore6.engineLoad(loadStoreParameter7);
    java.io.InputStream inputStream9 = null;
    char[] char_array14 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore6.engineLoad(inputStream9, char_array14);
    apacheKeyStore4.engineLoad(inputStream5, char_array14);
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineStore(outputStream3, char_array14);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array14);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test174"); }

    org.apache.xml.security.c14n.Canonicalizer.register("68 74 74 70 3A 2F 2F 77 77 77 2E 77 33 2E 6F 72 67 2F 32 30 30 30 2F 30 39 2F 78 6D 6C 64 73 69 67 23 58 35 30 39 44 61 74 61 ", "00000000");

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test175"); }

    org.apache.xml.security.transforms.TransformationException transformationException1 = new org.apache.xml.security.transforms.TransformationException("KeyValue");

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test176"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "PGPKeyPacket", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test177"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform2 = new org.apache.xml.security.transforms.Transform(element0, "BC");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test178"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey4 = x509IssuerSerialResolver0.engineResolveSecretKey(element1, "subtract", storageResolver3);
    org.w3c.dom.Element element5 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver7 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver7.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey14 = retrievalMethodResolver7.engineResolvePublicKey(element11, "HMACOutputLength", storageResolver13);
    javax.crypto.SecretKey secretKey15 = x509IssuerSerialResolver0.engineResolveSecretKey(element5, "", storageResolver13);
    org.w3c.dom.Element element16 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver18 = new org.apache.xml.security.keys.storage.StorageResolver();
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate19 = x509IssuerSerialResolver0.engineResolveX509Certificate(element16, "X509IssuerName", storageResolver18);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey15);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test179"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData2 = new org.apache.xml.security.encryption.EncryptedData(element0, "0000: 00 00 00 20                                        ... \n");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test180"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeText("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1"+ "'", str1.equals("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1"));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test181"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test182"); }

    java.lang.String str1 = org.apache.xml.security.utils.XMLUtils.getNodeTypeString((short)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "DOCUMENT_TYPE"+ "'", str1.equals("DOCUMENT_TYPE"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test183"); }

    org.apache.xml.security.c14n.helper.NSAttrCompare nSAttrCompare0 = new org.apache.xml.security.c14n.helper.NSAttrCompare();
    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException15 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException14);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException16 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array6, (java.lang.Exception)invalidCanonicalizerException14);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException18 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException19 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2000/09/xmldsig#X509Data", obj_array6, (java.lang.Exception)referenceNotInitializedException18);
    // The following exception was thrown during execution in test generation
    try {
    int i20 = nSAttrCompare0.compare((java.lang.Object)"00 00 00 03 ", (java.lang.Object)"http://www.w3.org/2000/09/xmldsig#X509Data");
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test184"); }

    byte[] byte_array3 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.toHexString(byte_array3);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException7 = new org.apache.xml.security.signature.InvalidDigestValueException("URI");
    byte[] byte_array9 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array9);
    java.lang.String str11 = org.apache.xml.security.utils.Base64.encode(byte_array9);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams12 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array9);
    byte[] byte_array13 = oAEPParams12.getOAEPParamBytes();
    java.lang.String str14 = ant.HexDump.byteArrayToHexString(byte_array13);
    java.lang.Object[] obj_array20 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException21 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array20);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array20);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException23 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array20);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException24 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array20);
    java.lang.Object[] obj_array27 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException28 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array27);
    java.lang.Object[] obj_array31 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException32 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array31);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException33 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array31);
    algorithmAlreadyRegisteredException28.addSuppressed((java.lang.Throwable)invalidCanonicalizerException33);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException35 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("ds", (java.lang.Exception)algorithmAlreadyRegisteredException28);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException36 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("X.509", obj_array20, (java.lang.Exception)algorithmAlreadyRegisteredException28);
    java.lang.Object[] obj_array37 = new java.lang.Object[] { xMLSignatureInput5, "URI", str14, keyResolverException36 };
    org.apache.xml.security.transforms.TransformationException transformationException38 = new org.apache.xml.security.transforms.TransformationException("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", obj_array37);
    java.lang.String str39 = org.apache.xml.security.utils.I18n.getExceptionMessage("URI", (java.lang.Exception)transformationException38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str4.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str10.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "yTZ4mVI+6vI="+ "'", str11.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "C9 36 78 99 52 3E EA F2"+ "'", str14.equals("C9 36 78 99 52 3E EA F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "No message with ID \"URI\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str39.equals("No message with ID \"URI\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test185"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String str1 = keyWrapImpl_AES192_BC0.getRequiredProviderName();
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array4);
    java.lang.String str8 = ant.HexDump.toBinaryString(byte_array4);
    java.security.Key key9 = null;
    byte[] byte_array11 = ant.HexDump.toByteArray(1);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array12 = keyWrapImpl_AES192_BC0.engineEncrypt(byte_array4, key9, byte_array11);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str8.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test186"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", byte_array3);
    java.security.Key key6 = null;
    byte[] byte_array7 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = keyTransportImpl_RSAOAEP_BC0.engineEncrypt(byte_array3, key6, byte_array7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test187"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_NOTATION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2048);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test188"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_BLOCKCIPHER_AES256;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes256-cbc"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#aes256-cbc"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test189"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey4 = x509IssuerSerialResolver0.engineResolveSecretKey(element1, "subtract", storageResolver3);
    org.w3c.dom.Element element5 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver7 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver10 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey11 = x509IssuerSerialResolver7.engineResolveSecretKey(element8, "subtract", storageResolver10);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey12 = x509IssuerSerialResolver0.engineResolvePublicKey(element5, "http://www.w3.org/2001/10/xml-exc-c14n#", storageResolver10);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey11);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test190"); }

    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP0 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b1 = transformXPathFilterCHGP0.wantsOctetStream();
    boolean b2 = transformXPathFilterCHGP0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test191"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInEncryptionSpace(element0, "Target");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test192"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, "X509Certificate");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test193"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    int i1 = keyWrapImpl_AES192_BC0.engineGetIvLength();
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.security.Key key4 = null;
    byte[] byte_array6 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array6);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", byte_array6);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array9 = keyWrapImpl_AES192_BC0.engineEncrypt(byte_array2, key4, byte_array6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str7.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test194"); }

    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("http://www.w3.org/2001/04/xmldsig-more#rsa-md5");

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test195"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList1 = null;
    byte[] byte_array2 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(nodeList1);
    boolean b3 = canonicalizer20010315WithComments0.engineGetIncludeComments();
    java.lang.String str4 = canonicalizer20010315WithComments0.engineGetURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str4.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test196"); }

    org.apache.xml.security.utils.Base64.setBase64WrapLength((int)(byte)0);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test197"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo3 = new org.apache.xml.security.signature.SignedInfo(document0, "http://www.w3.org/2000/09/xmldsig#sha1", "http://www.w3.org/2000/09/xmldsig#Manifest");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test198"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    java.lang.String str1 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    org.w3c.dom.Element element2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams3 = blockEncryptionImpl_TRIPLEDES_BC0.engineInit(element2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test199"); }

    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("00400400420");

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test200"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(element0, "00 00 00 03 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test201"); }

    sun.security.x509.X500Name x500Name6 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("", "http://www.w3.org/2001/04/xmlenc#kw-aes128", "http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/", "http://www.w3.org/2001/04/xmldsig-more#hmac-md5", "FF#FF#", "EncryptedKey");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name6);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test202"); }

    org.w3c.dom.Document document0 = null;
    java.security.Key key1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.RSAKeyValue rSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.RSAKeyValue(document0, key1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test203"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    algorithmAlreadyRegisteredException9.addSuppressed((java.lang.Throwable)invalidCanonicalizerException14);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException16 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array4, (java.lang.Exception)algorithmAlreadyRegisteredException9);
    java.lang.Object[] obj_array24 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException25 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array24);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException26 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array24);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException27 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array24);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException28 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array24);
    java.lang.Object[] obj_array33 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException34 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array33);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException35 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array33);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException36 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array33);
    org.apache.xml.security.signature.Reference reference37 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException38 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array33, reference37);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException39 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array24, (java.lang.Exception)missingResourceFailureException38);
    java.lang.Object[] obj_array45 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException46 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array45);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException47 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array45);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException48 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array45);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException49 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array45);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException50 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array45);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException51 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array24, (java.lang.Exception)storageResolverException50);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException52 = new org.apache.xml.security.signature.InvalidSignatureValueException("subtract", (java.lang.Exception)invalidDigestValueException51);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException53 = new org.apache.xml.security.signature.ReferenceNotInitializedException("(.//. | .//@* | .//namespace::*)[not(self::comment())]", obj_array4, (java.lang.Exception)invalidDigestValueException51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test204"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.Base64.decode("ds");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test205"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(document0, "X509Certificate");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test206"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CarriedKeyName carriedKeyName2 = new org.apache.xml.security.encryption.CarriedKeyName(document0, "http://www.w3.org/2001/04/xmlenc#Content");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test207"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments1 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList2 = null;
    byte[] byte_array3 = canonicalizer20010315WithComments1.engineCanonicalizeXPathNodeSet(nodeList2);
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = blockEncryptionImpl_AES192_BC0.engineEncrypt(byte_array3, key4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test208"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = ant.HexDump.toByteArray((short)0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI3 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(document0, byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test209"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array7 = oAEPParams6.getOAEPParamBytes();
    org.apache.xml.security.keys.KeyInfo keyInfo8 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties9 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData11 = new org.apache.xml.security.encryption.EncryptedData(document0, "(.//. | .//@* | .//namespace::*)", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6, keyInfo8, encryptionProperties9, "RSAKeyValue");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test210"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("FF 64 64 64 0A 00");

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test211"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.toHexString(byte_array3);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    byte[] byte_array12 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    boolean b14 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array3, byte_array12);
    byte[] byte_array17 = pKCS15Cipher1.processBlock(byte_array3, (int)' ', (int)(byte)1);
    byte[] byte_array19 = ant.HexDump.toByteArray(1);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array22 = pKCS15Cipher1.decodeBlock(byte_array19, (int)(short)100, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str4.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00 01 FF 64 64 00"+ "'", str13.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test212"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey4 = x509IssuerSerialResolver0.engineResolveSecretKey(element1, "subtract", storageResolver3);
    org.w3c.dom.Element element5 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver7 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver7.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey14 = retrievalMethodResolver7.engineResolvePublicKey(element11, "HMACOutputLength", storageResolver13);
    javax.crypto.SecretKey secretKey15 = x509IssuerSerialResolver0.engineResolveSecretKey(element5, "", storageResolver13);
    org.w3c.dom.Element element16 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver18 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element19 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver21 = null;
    java.security.PublicKey publicKey22 = retrievalMethodResolver18.engineResolvePublicKey(element19, "subtract", storageResolver21);
    org.w3c.dom.Element element23 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver25 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element26 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver28 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey29 = x509IssuerSerialResolver25.engineResolveSecretKey(element26, "subtract", storageResolver28);
    java.security.cert.X509Certificate x509Certificate30 = retrievalMethodResolver18.engineResolveX509Certificate(element23, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver28);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey31 = x509IssuerSerialResolver0.engineResolvePublicKey(element16, "http://www.w3.org/2002/06/xmldsig-filter2", storageResolver28);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate30);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test213"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("No message with ID \"URI\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "Reference");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "No message with ID \"URI\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str2.equals("No message with ID \"URI\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test214"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_CIPHERREFERENCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CipherReference"+ "'", str0.equals("CipherReference"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test215"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod1 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo2 = null;
    org.apache.xml.security.encryption.CipherData cipherData3 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData7 = new org.apache.xml.security.encryption.EncryptedData(document0, encryptionMethod1, keyInfo2, cipherData3, encryptionProperties4, "http://www.w3.org/2002/06/xmldsig-filter2", "Id");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test216"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    int i2 = keyTransportImpl_RSAPKCS15_BC0.getImplementedAlgorithmType();
    int i3 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test217"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    org.w3c.dom.Document document2 = null;
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    java.lang.String str6 = org.apache.xml.security.utils.Base64.encode(byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array4);
    byte[] byte_array8 = oAEPParams7.getOAEPParamBytes();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams9 = blockEncryptionImpl_TRIPLEDES_BC0.engineInit(document2, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "yTZ4mVI+6vI="+ "'", str6.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test218"); }

    org.apache.xml.security.utils.HexDump.setBitDigits('a', 'a');

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test219"); }

    java.lang.String str1 = ant.HexDump.toString((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "d"+ "'", str1.equals("d"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test220"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_KEYAGREEMENT_SH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#dh"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#dh"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test221"); }

    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException1 = new org.apache.xml.security.signature.XMLSignatureException("FF#FF#");

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test222"); }

    java.lang.String str1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test223"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(document0, "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test224"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.ALGO_ID_DIGEST_SHA1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#sha1"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test225"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException10 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array7);
    java.lang.Object[] obj_array15 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException16 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array15);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException17 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array15);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException18 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array15);
    java.lang.Object[] obj_array22 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException23 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array22);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException24 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array22);
    java.lang.Object[] obj_array28 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException29 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array28);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException30 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array28);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException31 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException30);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException32 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array22, (java.lang.Exception)invalidCanonicalizerException30);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException33 = new org.apache.xml.security.signature.InvalidDigestValueException("PgenCounter", obj_array15, (java.lang.Exception)xMLSecurityException32);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException34 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2000/09/xmldsig#rsa-sha1", obj_array7, (java.lang.Exception)xMLSecurityException32);
    org.apache.xml.security.transforms.TransformationException transformationException35 = new org.apache.xml.security.transforms.TransformationException("Modulus", obj_array7);
    java.lang.Object[] obj_array41 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException42 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array41);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException43 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array41);
    java.lang.Object[] obj_array47 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException48 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array47);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException49 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array47);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException50 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException49);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException51 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array41, (java.lang.Exception)invalidCanonicalizerException49);
    org.apache.xml.security.signature.Reference reference52 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException53 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array41, reference52);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException54 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("                 ", (java.lang.Exception)missingResourceFailureException53);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException55 = new org.apache.xml.security.signature.ReferenceNotInitializedException("C9 36 78 99 52 3E EA F2", obj_array7, (java.lang.Exception)contentHandlerAlreadyRegisteredException54);
    java.lang.Object[] obj_array63 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException64 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array63);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException65 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array63);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException66 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array63);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException67 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array63);
    java.lang.Object[] obj_array72 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException73 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array72);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException74 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array72);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException75 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array72);
    org.apache.xml.security.signature.Reference reference76 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException77 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array72, reference76);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException78 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array63, (java.lang.Exception)missingResourceFailureException77);
    java.lang.Object[] obj_array84 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException85 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array84);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException86 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array84);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException87 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array84);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException88 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array84);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException89 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array84);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException90 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array63, (java.lang.Exception)storageResolverException89);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException91 = new org.apache.xml.security.signature.InvalidSignatureValueException();
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException92 = new org.apache.xml.security.signature.InvalidDigestValueException("", obj_array63, (java.lang.Exception)invalidSignatureValueException91);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException93 = new org.apache.xml.security.exceptions.XMLSecurityException("01100100", obj_array7, (java.lang.Exception)invalidSignatureValueException91);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array84);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test226"); }

    org.w3c.dom.Document document0 = null;
    java.lang.String[] str_array4 = new java.lang.String[] { "aaaaaaaa aaaa a a", "intersect", "http://www.w3.org/2001/04/xmlenc#ripemd160" };
    java.lang.String[] str_array8 = new java.lang.String[] { "aaaaaaaa aaaa a a", "intersect", "http://www.w3.org/2001/04/xmlenc#ripemd160" };
    java.lang.String[][] str_array_array9 = new java.lang.String[][] { str_array4, str_array8 };
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList10 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstances(document0, str_array_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array9);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test227"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException7 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array4);
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException10 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array9);
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException14 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array13);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException15 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array13);
    algorithmAlreadyRegisteredException10.addSuppressed((java.lang.Throwable)invalidCanonicalizerException15);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException17 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/TR/2001/WD-xptr-20010108", obj_array4, (java.lang.Exception)algorithmAlreadyRegisteredException10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test228"); }

    byte[] byte_array0 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str1 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array0);
    java.lang.String str2 = org.apache.xml.security.utils.Base64.encode(byte_array0);
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.toString(byte_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str1.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "yTZ4mVI+6vI="+ "'", str2.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\uFFFD6x\uFFFDR>\uFFFD"+ "'", str3.equals("\uFFFD6x\uFFFDR>\uFFFD"));

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test229"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    int i3 = blockEncryptionImpl_AES192_BC0.getImplementedAlgorithmType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 1);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test230"); }

    java.security.cert.X509Certificate x509Certificate0 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver1 = new org.apache.xml.security.keys.storage.StorageResolver(x509Certificate0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test231"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    java.security.Key key3 = null;
    java.security.SecureRandom secureRandom4 = null;
    // The following exception was thrown during execution in test generation
    try {
    pKCS15Cipher1.init(128, key3, secureRandom4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test232"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList1 = null;
    byte[] byte_array2 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(nodeList1);
    java.lang.String str3 = canonicalizer20010315WithComments0.engineGetURI();
    org.w3c.dom.Node node4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array6 = canonicalizer20010315WithComments0.engineCanonicalizeSubTree(node4, "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test233"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("Target");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Target"+ "'", str1.equals("Target"));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test234"); }

    org.apache.xml.security.utils.Base64.setBase64WrapLength(2048);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test235"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.ReferenceList referenceList2 = new org.apache.xml.security.encryption.ReferenceList(element0, "KeyValue");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test236"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean b1 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    org.w3c.dom.Node node2 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = canonicalizer20010315ExclWithComments0.engineCanonicalizeSubTree(node2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test237"); }

    org.apache.xml.security.keys.provider.ApacheKeyStoreConstants apacheKeyStoreConstants0 = new org.apache.xml.security.keys.provider.ApacheKeyStoreConstants();

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test238"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.X509Data x509Data2 = new org.apache.xml.security.keys.content.X509Data(element0, "ApacheXML version 1.0");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test239"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInSignatureSpace(element0, "C9#36#78#99#52#3E#EA#F2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test240"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.cert.Certificate[] certificate_array4 = apacheKeyStore0.engineGetCertificateChain("Date");
    boolean b6 = apacheKeyStore0.engineIsCertificateEntry("KeyInfo");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test241"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_ALGORITHM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Algorithm"+ "'", str0.equals("Algorithm"));

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test242"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array4 = ant.HexDump.toByteArray(1);
    java.security.Key key5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key7 = keyWrapImpl_TRIPLEDES_BC0.engineUnwrap(byte_array4, key5, "DigestMethod");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test243"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("\n");

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test244"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.AESWrapper aESWrapper1 = new org.apache.xml.security.algorithms.encryption.helper.AESWrapper(cipher0);
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = aESWrapper1.unwrap(byte_array2, key4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test245"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    java.io.OutputStream outputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.store(outputStream3, "P");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Apache XML Security Provider"+ "'", str2.equals("Apache XML Security Provider"));

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test246"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    int i4 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    int i5 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-1));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test247"); }

    org.apache.xml.security.keys.storage.StorageResolver storageResolver0 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.util.Iterator iterator1 = storageResolver0.getIterator();
    java.security.KeyStore keyStore2 = null;
    // The following exception was thrown during execution in test generation
    try {
    storageResolver0.add(keyStore2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator1);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test248"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    boolean b3 = xMLSignatureInput1.isOctetStream();
    boolean b4 = xMLSignatureInput1.isOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test249"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((short)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa#aaaaaaaa"+ "'", str1.equals("aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test250"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.utils.HelperNodeList helperNodeList3 = new org.apache.xml.security.utils.HelperNodeList(false);
    org.w3c.dom.Node node4 = null;
    helperNodeList3.appendChild(node4);
    int i6 = helperNodeList3.getLength();
    int i7 = helperNodeList3.getLength();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform8 = new org.apache.xml.security.transforms.Transform(document0, "EncryptionProperties", (org.w3c.dom.NodeList)helperNodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test251"); }

    int i0 = org.apache.xml.security.algorithms.encryption.EncryptionMethodSpi.ALGOTYPE_BLOCK_ENCRYPTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test252"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInSignatureSpace(element0, "00 00 00 03 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test253"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = canonicalizer20010315ExclOmitComments0.utilizedOrIncluded(element1, "KeyReference");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test254"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC blockEncryptionImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC();
    java.lang.String str1 = blockEncryptionImpl_AES256_BC0.getImplementedAlgorithmURI();
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str9 = ant.HexDump.byteArrayToHexString(byte_array8);
    java.security.Key key10 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array11 = blockEncryptionImpl_AES256_BC0.engineDecrypt(byte_array8, key10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes256-cbc"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#aes256-cbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FF 64 64 64 0A 00"+ "'", str9.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test255"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo3 = new org.apache.xml.security.signature.SignedInfo(document0, "00 01 ", "EncryptedKey");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test256"); }

    int i0 = org.apache.xml.security.utils.Base64.getBase64WrapLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2048);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test257"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider1.stringPropertyNames();
    java.util.Set<java.security.Provider.Service> set_service3 = apacheXMLProvider1.getServices();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces4 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, (java.util.Set)set_service3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service3);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test258"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("http://xml.apache.org/security/#KeyStore");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test259"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Element element2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform3 = org.apache.xml.security.transforms.Transform.getInstance(document0, "\uFFFD6x\uFFFDR>\uFFFD", element2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test260"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem resolverLocalFilesystem0 = new org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem();
    resolverLocalFilesystem0.engineSetProperty("CarriedKeyName", "hi!");
    org.w3c.dom.Attr attr4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = resolverLocalFilesystem0.engineResolve(attr4, "G");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test261"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test262"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean b1 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    org.w3c.dom.Node node2 = null;
    org.w3c.dom.NodeList nodeList3 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node2);
    java.util.Set set4 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList3);
    java.util.Set set5 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList3);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array7 = canonicalizer20010315ExclWithComments0.engineCanonicalizeXPathNodeSet(set5, "EncryptionProperty");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test263"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    byte[] byte_array4 = ant.HexDump.toByteArray((int)' ');
    java.security.Key key5 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array6 = keyTransportImpl_RSAPKCS15_BC0.engineEncrypt(byte_array4, key5);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test264"); }

    sun.security.x509.X500Name x500Name4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("32#2E#35#2E#32#39#2E#31#34#", "http://www.w3.org/2002/04/xmldsig-filter2", "X509IssuerSerial", "CertificateChain");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name4);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test265"); }

    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams5 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array2);
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.toBinaryString(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"+ "'", str6.equals("aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test266"); }

    org.w3c.dom.Node node0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Vector vector1 = org.apache.xml.security.utils.XMLUtils.getAncestorElements(node0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test267"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.KeyStoreElement keyStoreElement2 = new org.apache.xml.security.keys.provider.KeyStoreElement(element0, "004004004004004004004004");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test268"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test269"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 68 69 21                                           hi!\n"+ "'", str1.equals("0000: 68 69 21                                           hi!\n"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test270"); }

    byte[] byte_array1 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.toHexString(byte_array1);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    byte[] byte_array10 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str11 = ant.HexDump.byteArrayToHexString(byte_array10);
    boolean b12 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array1, byte_array10);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str15 = org.apache.xml.security.utils.HexDump.toHexString(byte_array10, (int)'#', 100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str2.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00 01 FF 64 64 00"+ "'", str11.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test271"); }

    org.apache.xml.security.utils.I18n.init("                 ", "EncryptionProperties");

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test272"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXPath2Filter.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2002/06/xmldsig-filter2"+ "'", str0.equals("http://www.w3.org/2002/06/xmldsig-filter2"));

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test273"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Id"+ "'", str0.equals("Id"));

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test274"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException9 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array6);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException10 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array6);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException11 = new org.apache.xml.security.signature.ReferenceNotInitializedException("", (java.lang.Exception)invalidDigestValueException10);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException12 = new org.apache.xml.security.signature.XMLSignatureException("", (java.lang.Exception)referenceNotInitializedException11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test275"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String str1 = keyWrapImpl_AES192_BC0.getRequiredProviderName();
    java.lang.String str2 = keyWrapImpl_AES192_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test276"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("yTZ4mVI+6vI=", "Methods");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "yTZ4mVI+6vI="+ "'", str2.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test277"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    int i1 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array4);
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(byte_array4);
    java.security.Key key8 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array9 = keyWrapImpl_AES256_BC0.engineEncrypt(byte_array4, key8);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"+ "'", str7.equals("aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test278"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver6 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element7 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver9 = null;
    java.security.PublicKey publicKey10 = retrievalMethodResolver6.engineResolvePublicKey(element7, "subtract", storageResolver9);
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver13 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver16 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey17 = x509IssuerSerialResolver13.engineResolveSecretKey(element14, "subtract", storageResolver16);
    java.security.cert.X509Certificate x509Certificate18 = retrievalMethodResolver6.engineResolveX509Certificate(element11, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver16);
    javax.crypto.SecretKey secretKey19 = rSAKeyValueResolver3.engineResolveSecretKey(element4, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver16);
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = x509CertificateResolver0.engineCanResolve(element1, "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", storageResolver16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey19);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test279"); }

    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("");

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test280"); }

    byte[] byte_array1 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.toHexString(byte_array1);
    java.lang.String str5 = ant.HexDump.byteArrayToHexString(byte_array1, (int)'a', 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str2.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test281"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("http://www.w3.org/2000/09/xmldsig#enveloped-signature", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature"+ "'", str2.equals("http://www.w3.org/2000/09/xmldsig#enveloped-signature"));

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test282"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer._TAG_XPATHCHGP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "XPathAlternative"+ "'", str0.equals("XPathAlternative"));

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test283"); }

    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath0 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    boolean b1 = transformXPath0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test284"); }

    org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature transformEnvelopedSignature0 = new org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature();
    boolean b1 = transformEnvelopedSignature0.returnsNodeSet();
    boolean b2 = transformEnvelopedSignature0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test285"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.DataReference dataReference2 = new org.apache.xml.security.encryption.DataReference(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test286"); }

    int i2 = org.apache.xml.security.encryption.EncryptedData.min(8, (int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test287"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException10 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array7);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException11 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array7);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("", (java.lang.Exception)invalidDigestValueException11);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException13 = new org.apache.xml.security.c14n.CanonicalizationException("XPath", (java.lang.Exception)referenceNotInitializedException12);
    java.lang.Throwable[] throwable_array14 = referenceNotInitializedException12.getSuppressed();
    org.apache.xml.security.exceptions.Base64DecodingException base64DecodingException15 = new org.apache.xml.security.exceptions.Base64DecodingException("http://www.w3.org/2001/04/xmlenc#Content", (java.lang.Exception)referenceNotInitializedException12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array14);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test288"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.toHexString(byte_array3);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    byte[] byte_array12 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    boolean b14 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array3, byte_array12);
    byte[] byte_array17 = pKCS15Cipher1.processBlock(byte_array3, (int)' ', (int)(byte)1);
    byte[] byte_array19 = ant.HexDump.toByteArray((short)0);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput20 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array19);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array23 = pKCS15Cipher1.decodeBlock(byte_array19, (int)(byte)1, 76);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str4.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00 01 FF 64 64 00"+ "'", str13.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test289"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    byte[] byte_array4 = ant.HexDump.toByteArray(1);
    byte[] byte_array5 = org.apache.xml.security.utils.Base64.decode(byte_array4);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array7 = keyTransportImpl_RSAOAEP_BC0.engineEncrypt(byte_array5, key6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test290"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = null;
    java.security.PublicKey publicKey7 = retrievalMethodResolver3.engineResolvePublicKey(element4, "subtract", storageResolver6);
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey14 = x509IssuerSerialResolver10.engineResolveSecretKey(element11, "subtract", storageResolver13);
    java.security.cert.X509Certificate x509Certificate15 = retrievalMethodResolver3.engineResolveX509Certificate(element8, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver13);
    java.security.cert.X509Certificate x509Certificate16 = null;
    storageResolver13.add(x509Certificate16);
    javax.crypto.SecretKey secretKey18 = x509CertificateResolver0.engineResolveSecretKey(element1, "00 01 FF 64 64 00", storageResolver13);
    org.w3c.dom.Element element19 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver21 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element22 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver24 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver27 = null;
    java.security.PublicKey publicKey28 = retrievalMethodResolver24.engineResolvePublicKey(element25, "subtract", storageResolver27);
    org.w3c.dom.Element element29 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver31 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element32 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver34 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey35 = x509IssuerSerialResolver31.engineResolveSecretKey(element32, "subtract", storageResolver34);
    java.security.cert.X509Certificate x509Certificate36 = retrievalMethodResolver24.engineResolveX509Certificate(element29, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver34);
    java.security.cert.X509Certificate x509Certificate37 = null;
    storageResolver34.add(x509Certificate37);
    javax.crypto.SecretKey secretKey39 = x509CertificateResolver21.engineResolveSecretKey(element22, "00 01 FF 64 64 00", storageResolver34);
    javax.crypto.SecretKey secretKey40 = x509CertificateResolver0.engineResolveSecretKey(element19, "2.5.29.14", storageResolver34);
    java.security.KeyStore keyStore41 = null;
    // The following exception was thrown during execution in test generation
    try {
    storageResolver34.add(keyStore41);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey40);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test291"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = null;
    java.security.PublicKey publicKey7 = retrievalMethodResolver3.engineResolvePublicKey(element4, "subtract", storageResolver6);
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey14 = x509IssuerSerialResolver10.engineResolveSecretKey(element11, "subtract", storageResolver13);
    java.security.cert.X509Certificate x509Certificate15 = retrievalMethodResolver3.engineResolveX509Certificate(element8, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver13);
    java.security.cert.X509Certificate x509Certificate16 = null;
    storageResolver13.add(x509Certificate16);
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate18 = x509IssuerSerialResolver0.engineResolveX509Certificate(element1, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver13);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate15);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test292"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("Manifest");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 4D 61 6E 69 66 65 73 74                            Manifest\n"+ "'", str1.equals("0000: 4D 61 6E 69 66 65 73 74                            Manifest\n"));

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test293"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceSubtract(document0, "32#00#1E#CC#14#20#01#03#15#CE#");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test294"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.PGPData pGPData2 = new org.apache.xml.security.keys.content.PGPData(element0, "CertificateChain");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test295"); }

    org.apache.xml.security.utils.IgnoreAllErrorHandler ignoreAllErrorHandler0 = new org.apache.xml.security.utils.IgnoreAllErrorHandler();
    org.xml.sax.SAXParseException sAXParseException1 = null;
    ignoreAllErrorHandler0.error(sAXParseException1);
    org.xml.sax.SAXParseException sAXParseException3 = null;
    ignoreAllErrorHandler0.error(sAXParseException3);
    org.xml.sax.SAXParseException sAXParseException5 = null;
    ignoreAllErrorHandler0.warning(sAXParseException5);
    org.xml.sax.SAXParseException sAXParseException7 = null;
    ignoreAllErrorHandler0.warning(sAXParseException7);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test296"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.configurationFile;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EncryptedData"+ "'", str0.equals("EncryptedData"));

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test297"); }

    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException1 = new org.apache.xml.security.transforms.InvalidTransformException("FF 64 64 64 0A 00");

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test298"); }

    boolean b0 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.ExcludeSlash;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test299"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver3.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element7 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver9 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey10 = retrievalMethodResolver3.engineResolvePublicKey(element7, "HMACOutputLength", storageResolver9);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey11 = x509IssuerSerialResolver0.engineResolvePublicKey(element1, "http://www.w3.org/2001/04/xmlenc#Element", storageResolver9);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey10);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test300"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException8 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array5);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException9 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array5);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException10 = new org.apache.xml.security.signature.XMLSignatureException("http://www.w3.org/TR/1999/REC-xpath-19991116", obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test301"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"";

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test302"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa#aaaaaaaa"+ "'", str1.equals("aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test303"); }

    org.apache.xml.security.transforms.implementations.TransformC14NWithComments transformC14NWithComments0 = new org.apache.xml.security.transforms.implementations.TransformC14NWithComments();
    boolean b1 = transformC14NWithComments0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test304"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.Manifest manifest2 = new org.apache.xml.security.signature.Manifest(element0, "00 00 00 03 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test305"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("(.//. | .//@* | .//namespace::*)[not(self::comment())]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "(.//. | .//@* | .//namespace::*)[not(self::comment())]"+ "'", str1.equals("(.//. | .//@* | .//namespace::*)[not(self::comment())]"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test306"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod1 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo2 = null;
    org.apache.xml.security.encryption.CipherData cipherData3 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties4 = null;
    org.apache.xml.security.encryption.ReferenceList referenceList5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey10 = new org.apache.xml.security.encryption.EncryptedKey(document0, encryptionMethod1, keyInfo2, cipherData3, encryptionProperties4, referenceList5, "http://www.w3.org/XML/1998/namespace", "", "11001001400110110401111000410011001401010010400111110411101010411110010", "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test307"); }

    java.lang.String str2 = org.apache.xml.security.Init.getKeyInfoContentHandler("Key", "0000: 4D 61 6E 69 66 65 73 74                            Manifest\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test308"); }

    java.lang.Object[] obj_array1 = null;
    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException10 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array8);
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException15 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array14);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException16 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array14);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException17 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException16);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException18 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array8, (java.lang.Exception)invalidCanonicalizerException16);
    org.apache.xml.security.signature.Reference reference19 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException20 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array8, reference19);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException21 = new org.apache.xml.security.exceptions.XMLSecurityException("KeyReference", obj_array8);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException22 = new org.apache.xml.security.keys.storage.StorageResolverException("DataReference", obj_array8);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException23 = new org.apache.xml.security.signature.InvalidDigestValueException("(.//. | .//@* | .//namespace::*)", obj_array1, (java.lang.Exception)storageResolverException22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test309"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array8 = ant.HexDump.toByteArray(1);
    boolean b9 = org.apache.xml.security.utils.JavaUtils.binaryCompare(byte_array3, byte_array8);
    java.security.Key key10 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key12 = blockEncryptionImpl_AES192_BC0.engineUnwrap(byte_array3, key10, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test310"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a  aa aa"+ "'", str1.equals("a  aa aa"));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test311"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array2);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key8 = keyWrapImpl_AES256_BC0.engineUnwrap(byte_array2, key6, "P");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test312"); }

    org.apache.xml.security.utils.HelperNodeList helperNodeList1 = new org.apache.xml.security.utils.HelperNodeList(true);

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test313"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transforms transforms2 = new org.apache.xml.security.transforms.Transforms(element0, "Encoding");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test314"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "        "+ "'", str1.equals("        "));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test315"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_C14N_OMITCOMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test316"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm3 = new org.apache.xml.security.algorithms.SignatureAlgorithm(document0, "00 01 FF 64 64 00", (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test317"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.XPATH_C14N_OMIT_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "(//. | //@* | //namespace::*)[not(self::comment())]"+ "'", str0.equals("(//. | //@* | //namespace::*)[not(self::comment())]"));

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test318"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.Node node2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xpath.objects.XObject xObject3 = org.apache.xml.security.utils.XPathFuncHereAPI.eval(node0, node1, node2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test319"); }

    java.security.SecureRandom secureRandom0 = null;
    org.apache.xml.security.utils.PRNG.init(secureRandom0);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test320"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    int i1 = keyTransportImpl_RSAOAEP_BC0.engineGetIvLength();
    int i2 = keyTransportImpl_RSAOAEP_BC0.engineGetBlockSize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test321"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str4 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "BC"+ "'", str4.equals("BC"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test322"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((long)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"+ "'", str1.equals("aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test323"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceSubtract(document0, "Xalan Java 2.5.1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test324"); }

    org.w3c.dom.Element element0 = null;
    java.math.BigInteger bigInteger1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.Base64.fillElementWithBigInteger(element0, bigInteger1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test325"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException7 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array4);
    java.lang.Object[] obj_array15 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException16 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array15);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException17 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array15);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException18 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array15);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException19 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array15);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException20 = new org.apache.xml.security.signature.ReferenceNotInitializedException("", (java.lang.Exception)invalidDigestValueException19);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException21 = new org.apache.xml.security.c14n.CanonicalizationException("XPath", (java.lang.Exception)referenceNotInitializedException20);
    java.lang.Throwable[] throwable_array22 = referenceNotInitializedException20.getSuppressed();
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException23 = new org.apache.xml.security.keys.storage.StorageResolverException();
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException24 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("PGPKeyID", (java.lang.Object[])throwable_array22, (java.lang.Exception)storageResolverException23);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException25 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("X509CRL", obj_array4, (java.lang.Exception)algorithmAlreadyRegisteredException24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array22);

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test326"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.X509Data x509Data2 = new org.apache.xml.security.keys.content.X509Data(element0, "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test327"); }

    int i2 = org.apache.xml.security.encryption.EncryptedData.min((int)(short)1, (int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test328"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array3 = null;
    java.security.Key key4 = null;
    byte[] byte_array6 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array6);
    java.lang.String str8 = org.apache.xml.security.utils.Base64.encode(byte_array6);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams9 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array6);
    byte[] byte_array11 = ant.HexDump.toByteArray(1);
    boolean b12 = org.apache.xml.security.utils.JavaUtils.binaryCompare(byte_array6, byte_array11);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array13 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array3, key4, byte_array6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str7.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "yTZ4mVI+6vI="+ "'", str8.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test329"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.SignatureSpecNS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test330"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_TRANSFORM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Transform"+ "'", str0.equals("Transform"));

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test331"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException15 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException14);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException16 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array6, (java.lang.Exception)invalidCanonicalizerException14);
    org.apache.xml.security.signature.Reference reference17 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException18 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array6, reference17);
    org.apache.xml.security.signature.Reference reference19 = null;
    missingResourceFailureException18.setReference(reference19);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException21 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2001/04/xmldsig-more#rsa-md5", (java.lang.Exception)missingResourceFailureException18);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException22 = new org.apache.xml.security.exceptions.XMLSecurityException("004004004004004004004004", (java.lang.Exception)invalidTransformException21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test332"); }

    java.lang.Object[] obj_array3 = new java.lang.Object[] { true, 0 };
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException4 = new org.apache.xml.security.signature.XMLSignatureException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array3);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException6 = new org.apache.xml.security.signature.ReferenceNotInitializedException("\n");
    xMLSignatureException4.addSuppressed((java.lang.Throwable)referenceNotInitializedException6);
    java.lang.Exception exception8 = xMLSignatureException4.getOriginalException();
    java.lang.Object[] obj_array15 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException16 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array15);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException17 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array15);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException18 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array15);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException19 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array15);
    java.lang.Object[] obj_array24 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException25 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array24);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException26 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array24);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException27 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array24);
    org.apache.xml.security.signature.Reference reference28 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException29 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array24, reference28);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException30 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array15, (java.lang.Exception)missingResourceFailureException29);
    java.lang.Object[] obj_array34 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException35 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array34);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException36 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array34);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException37 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException36);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException38 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("ks", obj_array15, (java.lang.Exception)keyResolverException37);
    xMLSignatureException4.addSuppressed((java.lang.Throwable)invalidCipherTextException38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(exception8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test333"); }

    short s0 = org.w3c.dom.traversal.NodeFilter.FILTER_ACCEPT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)1);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test334"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("Nonce");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test335"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String str1 = keyWrapImpl_AES192_BC0.getRequiredProviderName();
    java.lang.String str2 = keyWrapImpl_AES192_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes192"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#kw-aes192"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test336"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("http://www.w3.org/2001/04/xmlenc#aes256-cbc");

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test337"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.MgmtData mgmtData2 = new org.apache.xml.security.keys.content.MgmtData(element0, "CarriedKeyName");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test338"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.DataReference dataReference2 = new org.apache.xml.security.encryption.DataReference(document0, "http://www.w3.org/2001/04/xmlenc#");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test339"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptionProperty encryptionProperty2 = new org.apache.xml.security.encryption.EncryptionProperty(element0, "xmlsecurityOrgPrefv62RV8QygCi4lzCcUXRdSj7LraFR");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test340"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInSignatureSpace(element0, "G");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.signature.XMLSignatureException");
    } catch (org.apache.xml.security.signature.XMLSignatureException e) {
      // Expected exception.
    }

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test341"); }

    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException1 = new org.apache.xml.security.signature.InvalidDigestValueException("URI");
    java.lang.String str2 = invalidDigestValueException1.getMsgID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "URI"+ "'", str2.equals("URI"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test342"); }

    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException1 = new org.apache.xml.security.keys.storage.StorageResolverException("Modulus");
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException10 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array9);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException11 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array9);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException12 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array9);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException13 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array9);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("DigestMethod", obj_array9);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException15 = new org.apache.xml.security.signature.XMLSignatureException("JCAType", obj_array9);
    java.lang.Object[] obj_array22 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException23 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array22);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException24 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array22);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException25 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array22);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException26 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array22);
    java.lang.Object[] obj_array31 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException32 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array31);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException33 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array31);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException34 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array31);
    org.apache.xml.security.signature.Reference reference35 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException36 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array31, reference35);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException37 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array22, (java.lang.Exception)missingResourceFailureException36);
    java.lang.Object[] obj_array43 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException44 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array43);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException45 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array43);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException46 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array43);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException47 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array43);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException48 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array43);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException49 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array22, (java.lang.Exception)storageResolverException48);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException50 = new org.apache.xml.security.signature.ReferenceNotInitializedException("yTZ4mVI+6vI=", obj_array9, (java.lang.Exception)invalidDigestValueException49);
    storageResolverException1.addSuppressed((java.lang.Throwable)referenceNotInitializedException50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test343"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_RSA_SHA384;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384"));

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test344"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.Base64.decode("http://www.w3.org/2001/04/xmlenc#kw-aes128");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test345"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList1 = null;
    byte[] byte_array2 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(nodeList1);
    org.w3c.dom.Node node3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = canonicalizer20010315WithComments0.engineCanonicalizeSubTree(node3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test346"); }

    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver dSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.util.Iterator iterator4 = storageResolver3.getIterator();
    java.security.cert.X509Certificate x509Certificate5 = storageResolver3.next();
    javax.crypto.SecretKey secretKey6 = dSAKeyValueResolver0.engineResolveSecretKey(element1, "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", storageResolver3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey6);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test347"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.JCEMapper.KEYTYPE_KEY_TRANSPORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "KeyTransport"+ "'", str0.equals("KeyTransport"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test348"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC blockEncryptionImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC();
    int i1 = blockEncryptionImpl_AES256_BC0.getImplementedAlgorithmType();
    java.lang.String str2 = blockEncryptionImpl_AES256_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test349"); }

    org.apache.xml.security.utils.ElementProxy.setDefaultPrefix("X509Data", "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test350"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.XMLUtils.createDSctx(document0, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test351"); }

    org.apache.xml.security.transforms.Transform.register("", "0000: 4D 61 6E 69 66 65 73 74                            Manifest\n");

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test352"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException9 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array6);
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException15 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array14);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException16 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array14);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException17 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array14);
    java.lang.Object[] obj_array21 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException22 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array21);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException23 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array21);
    java.lang.Object[] obj_array27 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException28 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array27);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException29 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array27);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException30 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException29);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException31 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array21, (java.lang.Exception)invalidCanonicalizerException29);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException32 = new org.apache.xml.security.signature.InvalidDigestValueException("PgenCounter", obj_array14, (java.lang.Exception)xMLSecurityException31);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException33 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2000/09/xmldsig#rsa-sha1", obj_array6, (java.lang.Exception)xMLSecurityException31);
    org.apache.xml.security.transforms.TransformationException transformationException34 = new org.apache.xml.security.transforms.TransformationException("Modulus", obj_array6);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException35 = new org.apache.xml.security.keys.storage.StorageResolverException("X509SubjectName", (java.lang.Exception)transformationException34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test353"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString((long)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00#00#00#00#00#00#00#61#"+ "'", str1.equals("00#00#00#00#00#00#00#61#"));

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test354"); }

    org.w3c.dom.Element element0 = null;
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.encryption.EncryptedData.replace(element0, element1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test355"); }

    org.apache.xml.security.utils.I18n.defaultCountryCode = "http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter";

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test356"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str3 = ant.HexDump.toString(byte_array2);
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.lang.String str5 = ant.HexDump.toHexString(byte_array2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue6 = new org.apache.xml.security.encryption.CipherValue(document0, byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\u0000\u0000\u0000 "+ "'", str3.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str4.equals("0000: 00 00 00 20                                        ... \n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00 00 00 20 "+ "'", str5.equals("00 00 00 20 "));

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test357"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    byte[] byte_array4 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.toHexString(byte_array4);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array4);
    byte[] byte_array13 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str14 = ant.HexDump.byteArrayToHexString(byte_array13);
    boolean b15 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array4, byte_array13);
    java.security.Key key16 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array17 = blockEncryptionImpl_AES192_BC0.engineDecrypt(byte_array13, key16);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str5.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "00 01 FF 64 64 00"+ "'", str14.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test358"); }

    java.lang.String str2 = org.apache.xml.security.algorithms.JCEMapper.getJCEIVAlgorithmFromURI("http://www.w3.org/2001/04/xmlenc#kw-aes192", "http://www.w3.org/2000/09/xmldsig#sha1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test359"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate4 = x509IssuerSerialResolver0.engineResolveX509Certificate(element1, "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", storageResolver3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test360"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "00400400420", "CarriedKeyName");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test361"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstance(element0, "http://www.isi.edu/in-notes/iana/assignments/media-types/");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test362"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(document0, "http://www.w3.org/2001/04/xmlenc#aes192-cbc");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test363"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.ALGO_ID_DIGEST_SHA384;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#sha384"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#sha384"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test364"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString((byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FF#"+ "'", str1.equals("FF#"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test365"); }

    int i2 = org.apache.xml.security.encryption.EncryptedData.min(2048, 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test366"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceUnion(document0, "X.509");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test367"); }

    int i3 = org.apache.xml.security.encryption.EncryptedData.min(128, 10, (int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 10);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test368"); }

    org.apache.xml.security.utils.EncryptionConstants.setEncryptionSpecNSprefix("http://www.w3.org/TR/1999/REC-xslt-19991116");

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test369"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP1 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    resolverDirectHTTP1.engineSetProperty("", "Modulus");
    java.lang.String[] str_array5 = resolverDirectHTTP1.engineGetPropertyKeys();
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array10);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException13 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array10);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException14 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", (java.lang.Exception)xMLSecurityException13);
    org.w3c.dom.Attr attr15 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException17 = new org.apache.xml.security.utils.resolver.ResourceResolverException("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (java.lang.Object[])str_array5, (java.lang.Exception)contentHandlerAlreadyRegisteredException14, attr15, "Algorithm");
    java.lang.Exception exception18 = contentHandlerAlreadyRegisteredException14.getOriginalException();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(exception18);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test370"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    org.apache.xml.security.keys.KeyInfo keyInfo7 = null;
    java.security.Key key8 = null;
    java.security.Key key9 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties10 = null;
    org.apache.xml.security.encryption.ReferenceList referenceList11 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey16 = new org.apache.xml.security.encryption.EncryptedKey(document0, "", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6, keyInfo7, key8, key9, encryptionProperties10, referenceList11, "Recipient", "FF#", "org/apache/xml/security/resource", "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test371"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("DigestMethod");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "DigestMethod"+ "'", str1.equals("DigestMethod"));

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test372"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo2 = new org.apache.xml.security.signature.SignedInfo(element0, "004004004004004004004004");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test373"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SIGNATUREVALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SignatureValue"+ "'", str0.equals("SignatureValue"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test374"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData2 = new org.apache.xml.security.encryption.CipherData(element0, "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test375"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo2 = new org.apache.xml.security.signature.SignedInfo(element0, "EncryptedData");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test376"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.MgmtData mgmtData2 = new org.apache.xml.security.keys.content.MgmtData(document0, "http://www.w3.org/XML/1998/namespace");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test377"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.rfc2253toXMLdsig("01100100");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "01100100"+ "'", str1.equals("01100100"));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test378"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array4 = ant.HexDump.toByteArray((short)0);
    java.security.Key key5 = null;
    byte[] byte_array7 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.toHexString(byte_array7);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput9 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array7);
    byte[] byte_array16 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str17 = ant.HexDump.byteArrayToHexString(byte_array16);
    boolean b18 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array7, byte_array16);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array19 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array4, key5, byte_array7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str8.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "00 01 FF 64 64 00"+ "'", str17.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test379"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference3 = new org.apache.xml.security.encryption.CipherReference(document0, "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa", transforms2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test380"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    int i1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test381"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.lang.String str1 = canonicalizer20010315OmitComments0.engineGetURI();
    boolean b2 = canonicalizer20010315OmitComments0.engineGetIncludeComments();
    org.w3c.dom.Node node3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = canonicalizer20010315OmitComments0.engineCanonicalizeSubTree(node3, "d");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test382"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array7 = oAEPParams6.getOAEPParamBytes();
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore8 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream9 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore10 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter11 = null;
    apacheKeyStore10.engineLoad(loadStoreParameter11);
    java.io.InputStream inputStream13 = null;
    char[] char_array18 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore10.engineLoad(inputStream13, char_array18);
    apacheKeyStore8.engineLoad(inputStream9, char_array18);
    byte[] byte_array24 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str25 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array24);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array24);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams27 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array24);
    java.lang.String str28 = ant.HexDump.toBinaryString(byte_array24);
    java.lang.String str29 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array24);
    java.lang.String str30 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array24);
    java.security.cert.Certificate[] certificate_array31 = new java.security.cert.Certificate[] {  };
    apacheKeyStore8.engineSetKeyEntry("Encoding", byte_array24, certificate_array31);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.KeyElement keyElement33 = new org.apache.xml.security.keys.provider.KeyElement(document0, "RSAKeyValue", byte_array7, certificate_array31);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str25.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str28.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str29.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str30 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str30.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array31);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test383"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperty signatureProperty2 = new org.apache.xml.security.signature.SignatureProperty(element0, "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test384"); }

    short s0 = org.w3c.dom.traversal.NodeFilter.FILTER_SKIP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)3);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test385"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.XPathFilter2NS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2002/04/xmldsig-filter2"+ "'", str0.equals("http://www.w3.org/2002/04/xmldsig-filter2"));

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test386"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.encryption.params.OAEPParams.DEFAULT_DIGEST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#sha1"));

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test387"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_MAC_HMAC_SHA512;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha512"));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test388"); }

    java.lang.Exception exception1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException2 = new org.apache.xml.security.signature.XMLSignatureException("X.509", exception1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test389"); }

    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException10 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array8);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException11 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array8);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException12 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array8);
    java.lang.Object[] obj_array17 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException18 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array17);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException19 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array17);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException20 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array17);
    org.apache.xml.security.signature.Reference reference21 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException22 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array17, reference21);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException23 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array8, (java.lang.Exception)missingResourceFailureException22);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException32 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array29);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException33 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array29);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException34 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array29);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException35 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array8, (java.lang.Exception)storageResolverException34);
    java.lang.Object[] obj_array38 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException39 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array38);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException40 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array38);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException41 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00400400420", obj_array8, (java.lang.Exception)invalidCanonicalizerException40);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException42 = new org.apache.xml.security.keys.storage.StorageResolverException("CipherValue", obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test390"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CarriedKeyName carriedKeyName2 = new org.apache.xml.security.encryption.CarriedKeyName(element0, "G");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test391"); }

    java.lang.String str1 = ant.HexDump.toString((byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\uFFFD"+ "'", str1.equals("\uFFFD"));

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test392"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("http://www.w3.org/2001/04/xmlenc#kw-aes256");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes256"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes256"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test393"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod1 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo2 = null;
    org.apache.xml.security.encryption.CipherData cipherData3 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData7 = new org.apache.xml.security.encryption.EncryptedData(document0, encryptionMethod1, keyInfo2, cipherData3, encryptionProperties4, "", "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test394"); }

    org.w3c.dom.Document document0 = null;
    java.lang.String[] str_array6 = new java.lang.String[] { "No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", "0000: 4D 61 6E 69 66 65 73 74                            Manifest\n", "ApacheXML" };
    java.lang.String[] str_array12 = new java.lang.String[] { "No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", "0000: 4D 61 6E 69 66 65 73 74                            Manifest\n", "ApacheXML" };
    java.lang.String[][] str_array_array13 = new java.lang.String[][] { str_array6, str_array12 };
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList14 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstances(document0, str_array_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array13);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test395"); }

    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException1 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1");

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test396"); }

    ant.HexDump.setWithByteSeparator(true);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test397"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    byte[] byte_array2 = org.apache.xml.security.utils.HexDump.toByteArray((short)100);
    java.security.Key key3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = keyWrapImpl_AES192_BC0.engineDecrypt(byte_array2, key3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test398"); }

    org.apache.xml.security.utils.I18n.defaultCountryCode = "subtract";

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test399"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceSubtract(document0, "");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test400"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_KEYWRAP_AES192;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes192"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#kw-aes192"));

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test401"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm2 = new org.apache.xml.security.algorithms.SignatureAlgorithm(element0, "org/apache/xml/security/resource/xmlsecurity");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test402"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    boolean b1 = canonicalizer20010315WithComments0.engineGetIncludeComments();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test403"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.PGPData pGPData2 = new org.apache.xml.security.keys.content.PGPData(element0, "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test404"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    java.lang.String str3 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i4 = blockEncryptionImpl_AES192_BC0.getImplementedAlgorithmType();
    java.security.Key key5 = null;
    java.security.Key key6 = null;
    byte[] byte_array8 = ant.HexDump.toByteArray((short)0);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array9 = blockEncryptionImpl_AES192_BC0.engineWrap(key5, key6, byte_array8);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test405"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray((long)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array2 = org.apache.xml.security.utils.Base64.decode(byte_array1);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test406"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem resolverLocalFilesystem0 = new org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem();
    resolverLocalFilesystem0.engineSetProperty("CarriedKeyName", "hi!");
    org.w3c.dom.Attr attr4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = resolverLocalFilesystem0.engineResolve(attr4, "SignatureValue");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test407"); }

    org.apache.xml.security.keys.keyresolver.KeyResolver.register("subtract");

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test408"); }

    java.lang.String str1 = org.apache.xml.security.utils.I18n.translate("CanonicalizationMethod");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID \"CanonicalizationMethod\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("No message with ID \"CanonicalizationMethod\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test409"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "Nonce");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test410"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer resolverXPointer0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    boolean b2 = resolverXPointer0.understandsProperty("FF 64 64 64 0A 00");
    org.w3c.dom.Attr attr3 = null;
    boolean b5 = resolverXPointer0.engineCanResolve(attr3, "DSAKeyValue");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test411"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI2 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(element0, "Type");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test412"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test413"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CarriedKeyName carriedKeyName2 = new org.apache.xml.security.encryption.CarriedKeyName(element0, "HMACOutputLength");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test414"); }

    org.apache.xpath.XPathContext xPathContext0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.CachedXPathFuncHereAPI cachedXPathFuncHereAPI1 = new org.apache.xml.security.utils.CachedXPathFuncHereAPI(xPathContext0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test415"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_KEYSIZE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "KeySize"+ "'", str0.equals("KeySize"));

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test416"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SIGNATUREPROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SignatureProperty"+ "'", str0.equals("SignatureProperty"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test417"); }

    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException0 = new org.apache.xml.security.keys.keyresolver.KeyResolverException();

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test418"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.math.BigInteger bigInteger1 = org.apache.xml.security.utils.XMLUtils.getBigintFromElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test419"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath6 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj7 = apacheXMLProvider4.remove((java.lang.Object)transformXPath6);
    java.io.OutputStream outputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider4.save(outputStream8, "CarriedKeyName");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test420"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    byte[] byte_array2 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.security.Key key3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = keyWrapImpl_TRIPLEDES_BC0.engineDecrypt(byte_array2, key3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test421"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.lang.String str1 = canonicalizer20010315OmitComments0.engineGetURI();
    boolean b2 = canonicalizer20010315OmitComments0.engineGetIncludeComments();
    org.w3c.dom.Node node3 = null;
    org.w3c.dom.NodeList nodeList4 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node3);
    java.util.Set set5 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList4);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array7 = canonicalizer20010315OmitComments0.engineCanonicalizeXPathNodeSet(set5, "SignatureMethod");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test422"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList2 = org.apache.xml.security.utils.XMLUtils.convertSetToNodelist((java.util.Set)set_str1);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test423"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(element0, "X509SKI");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test424"); }

    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver0.engineSetProperty("X509IssuerName", "P");
    boolean b5 = retrievalMethodResolver0.understandsProperty("0000: 68 69 21                                           hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test425"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.ObjectContainer objectContainer2 = new org.apache.xml.security.signature.ObjectContainer(element0, "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test426"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData2 = new org.apache.xml.security.encryption.CipherData(element0, "32#00#1E#CC#14#20#01#03#15#CE");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test427"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPathFilterCHGPContainer xPathFilterCHGPContainer5 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.getInstance(document0, false, "DigestMethod", "DOCUMENT_TYPE", "Transform");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test428"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(element0, "subtract");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test429"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("aaaaaaaa#aaaaaaaa");

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test430"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    org.w3c.dom.Element element3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams4 = blockEncryptionImpl_AES192_BC0.engineInit(element3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test431"); }

    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException10 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array9);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException11 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array9);
    java.lang.Object[] obj_array15 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException16 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array15);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException17 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array15);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException18 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException17);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException19 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array9, (java.lang.Exception)invalidCanonicalizerException17);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException21 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2000/09/xmldsig#X509Data", obj_array9, (java.lang.Exception)referenceNotInitializedException21);
    java.lang.Object[] obj_array27 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException28 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array27);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException29 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array27);
    java.lang.Object[] obj_array31 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException32 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array31);
    java.lang.Object[] obj_array35 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException36 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array35);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException37 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array35);
    algorithmAlreadyRegisteredException32.addSuppressed((java.lang.Throwable)invalidCanonicalizerException37);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException39 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array27, (java.lang.Exception)algorithmAlreadyRegisteredException32);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException40 = new org.apache.xml.security.c14n.CanonicalizationException("Seed", (java.lang.Exception)xMLSecurityException39);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException41 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", obj_array9, (java.lang.Exception)canonicalizationException40);
    java.lang.String str42 = org.apache.xml.security.utils.I18n.getExceptionMessage("HMACOutputLength", obj_array9);
    java.lang.Object[] obj_array49 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException50 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array49);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException51 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array49);
    java.lang.Object[] obj_array55 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException56 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array55);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException57 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array55);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException58 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException57);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException59 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array49, (java.lang.Exception)invalidCanonicalizerException57);
    java.lang.String str60 = org.apache.xml.security.utils.I18n.translate("CarriedKeyName", obj_array49);
    java.lang.String str61 = org.apache.xml.security.utils.I18n.translate("Transforms", obj_array49);
    java.lang.Object[] obj_array64 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException65 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array64);
    java.lang.Exception exception66 = null;
    org.w3c.dom.Attr attr67 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException69 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array64, exception66, attr67, "KeyName");
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException70 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", obj_array49, (java.lang.Exception)resourceResolverException69);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException71 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("(.//. | .//@* | .//namespace::*)[not(self::comment())]", obj_array9, (java.lang.Exception)resourceResolverException69);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException72 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/TR/1999/REC-xslt-19991116", obj_array9);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException73 = new org.apache.xml.security.transforms.InvalidTransformException("Y", obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str42.equals("No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str60 + "' != '" + "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str60.equals("No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str61 + "' != '" + "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str61.equals("No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test432"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.toHexString(byte_array3);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    byte[] byte_array12 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    boolean b14 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array3, byte_array12);
    byte[] byte_array17 = pKCS15Cipher1.processBlock(byte_array3, (int)' ', (int)(byte)1);
    java.security.Key key19 = null;
    java.security.SecureRandom secureRandom20 = null;
    // The following exception was thrown during execution in test generation
    try {
    pKCS15Cipher1.init((int)(byte)-1, key19, secureRandom20);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str4.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00 01 FF 64 64 00"+ "'", str13.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array17);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test433"); }

    org.apache.xml.security.utils.I18n.initLocale("CarriedKeyName", "http://www.w3.org/2000/09/xmldsig#X509Data");

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test434"); }

    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("\uFFFD6x\uFFFDR>\uFFFD", "http://www.w3.org/2000/09/xmldsig#Manifest", "http://www.w3.org/2001/04/xmldsig-more#hmac-sha512");

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test435"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP1 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP1);
    java.lang.String[] str_array3 = resourceResolver2.getPropertyKeys();
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException4 = new org.apache.xml.security.c14n.CanonicalizationException();
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException5 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (java.lang.Object[])str_array3, (java.lang.Exception)canonicalizationException4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test436"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInSignatureSpace(element0, "http://www.w3.org/2001/04/xmlenc#sha256");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test437"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm3 = new org.apache.xml.security.algorithms.SignatureAlgorithm(document0, "FF#FF#", (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test438"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.utils.HelperNodeList helperNodeList3 = new org.apache.xml.security.utils.HelperNodeList(false);
    org.w3c.dom.Node node4 = null;
    helperNodeList3.appendChild(node4);
    int i6 = helperNodeList3.getLength();
    org.w3c.dom.Node node7 = null;
    helperNodeList3.appendChild(node7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform9 = org.apache.xml.security.transforms.Transform.getInstance(document0, "01100100", (org.w3c.dom.NodeList)helperNodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test439"); }

    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException2 = new org.apache.xml.security.signature.XMLSignatureException("EncryptionProperty");
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException3 = new org.apache.xml.security.signature.InvalidDigestValueException("http://www.w3.org/2000/09/xmldsig#", (java.lang.Exception)xMLSignatureException2);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test440"); }

    byte[] byte_array1 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.toHexString(byte_array1);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    xMLSignatureInput3.setSourceURI("Y");
    boolean b6 = xMLSignatureInput3.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput3.getOctetStream();
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set set8 = xMLSignatureInput3.getNodeSet();
      org.junit.Assert.fail("Expected exception of type org.xml.sax.SAXParseException");
    } catch (org.xml.sax.SAXParseException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str2.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test441"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    java.io.Writer writer6 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider4.store(writer6, "Methods");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test442"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.XMLUtils.createElementInSignatureSpace(document0, "http://www.w3.org/XML/1998/namespace");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test443"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverFragment resolverFragment0 = new org.apache.xml.security.utils.resolver.implementations.ResolverFragment();
    org.w3c.dom.Attr attr1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = resolverFragment0.engineResolve(attr1, "xmlsecurityOrgPrefv62RV8QygCi4lzCcUXRdSj7LraFR");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test444"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test445"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP1 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    resolverDirectHTTP1.engineSetProperty("", "Modulus");
    java.lang.String[] str_array5 = resolverDirectHTTP1.engineGetPropertyKeys();
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array10);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException13 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array10);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException14 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", (java.lang.Exception)xMLSecurityException13);
    org.w3c.dom.Attr attr15 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException17 = new org.apache.xml.security.utils.resolver.ResourceResolverException("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (java.lang.Object[])str_array5, (java.lang.Exception)contentHandlerAlreadyRegisteredException14, attr15, "Algorithm");
    resourceResolverException17.setBaseURI("intersect");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test446"); }

    javax.crypto.Cipher cipher0 = null;
    java.security.MessageDigest messageDigest1 = null;
    org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper tripleDESWrapper2 = new org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper(cipher0, messageDigest1);
    byte[] byte_array5 = new byte[] { (byte)0, (byte)0 };
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array5);
    java.security.Key key7 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = tripleDESWrapper2.unwrap(byte_array5, key7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test447"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference3 = new org.apache.xml.security.encryption.CipherReference(document0, "3240041E4CC4144204014034154CE4", transforms2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test448"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException9 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array6);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException13 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException12);
    org.apache.xml.security.transforms.TransformationException transformationException14 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array6, (java.lang.Exception)xMLSecurityException13);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException15 = new org.apache.xml.security.signature.InvalidDigestValueException("Xalan Java 2.5.1", obj_array6);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException16 = new org.apache.xml.security.signature.InvalidDigestValueException("X509Certificate", obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test449"); }

    org.apache.xml.security.transforms.TransformationException transformationException0 = new org.apache.xml.security.transforms.TransformationException();

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test450"); }

    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException0 = new org.apache.xml.security.signature.XMLSignatureException();

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test451"); }

    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException1 = new org.apache.xml.security.c14n.CanonicalizationException();
    org.w3c.dom.Attr attr2 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException4 = new org.apache.xml.security.utils.resolver.ResourceResolverException("FF 64 64 64 0A 00", (java.lang.Exception)canonicalizationException1, attr2, "\uFFFD");

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test452"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList1 = null;
    byte[] byte_array2 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(nodeList1);
    boolean b3 = canonicalizer20010315WithComments0.engineGetIncludeComments();
    org.w3c.dom.Node node4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = canonicalizer20010315WithComments0.engineCanonicalizeSubTree(node4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test453"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.keyresolver.KeyResolver keyResolver1 = org.apache.xml.security.keys.keyresolver.KeyResolver.item((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test454"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("0000: 68 69 21                                           hi!\n", "\uFFFD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000: 68 69 21                                           hi!\n"+ "'", str2.equals("0000: 68 69 21                                           hi!\n"));

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test455"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test456"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = org.apache.xml.security.utils.HexDump.toByteArray(0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI3 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(document0, byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test457"); }

    java.lang.String str0 = org.apache.xml.security.keys.content.RetrievalMethod.TYPE_PGP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#PGPData"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#PGPData"));

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test458"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.ObjectContainer objectContainer2 = new org.apache.xml.security.signature.ObjectContainer(element0, "0000: 6B 73                                              ks\n");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test459"); }

    org.apache.xml.security.transforms.implementations.TransformXSLT transformXSLT0 = new org.apache.xml.security.transforms.implementations.TransformXSLT();
    boolean b1 = transformXSLT0.returnsNodeSet();
    boolean b2 = transformXSLT0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test460"); }

    org.w3c.dom.Document document0 = null;
    java.security.cert.Certificate certificate2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.CertificateElement certificateElement3 = new org.apache.xml.security.keys.provider.CertificateElement(document0, "DOCUMENT_TYPE", certificate2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test461"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array3 = org.apache.xml.security.utils.PRNG.createBytes((int)(short)0);
    java.security.Key key4 = null;
    byte[] byte_array6 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array6);
    java.lang.String str8 = org.apache.xml.security.utils.Base64.encode(byte_array6);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams9 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array6);
    byte[] byte_array11 = ant.HexDump.toByteArray(1);
    boolean b12 = org.apache.xml.security.utils.JavaUtils.binaryCompare(byte_array6, byte_array11);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array13 = blockEncryptionImpl_TRIPLEDES_BC0.engineEncrypt(byte_array3, key4, byte_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str7.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "yTZ4mVI+6vI="+ "'", str8.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test462"); }

    org.apache.xml.security.transforms.implementations.TransformC14N transformC14N0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean b1 = transformC14N0.returnsOctetStream();
    boolean b2 = transformC14N0.wantsNodeSet();
    boolean b3 = transformC14N0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test463"); }

    org.apache.xml.security.utils.RFC2253Parser rFC2253Parser0 = new org.apache.xml.security.utils.RFC2253Parser();

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test464"); }

    java.lang.String str1 = ant.HexDump.toString((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\n"+ "'", str1.equals("\n"));

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test465"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_OBJECT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Object"+ "'", str0.equals("Object"));

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test466"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("PGPKeyID");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test467"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceIntersect(document0, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test468"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("PGPKeyID");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test469"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP1 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b2 = transformXPathFilterCHGP1.wantsOctetStream();
    boolean b3 = transformXPathFilterCHGP1.returnsNodeSet();
    boolean b4 = apacheXMLProvider0.containsKey((java.lang.Object)b3);
    java.lang.String str5 = apacheXMLProvider0.getName();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider6 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str7 = apacheXMLProvider6.stringPropertyNames();
    java.lang.String str8 = apacheXMLProvider6.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput10 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b11 = xMLSignatureInput10.isInitialized();
    boolean b12 = xMLSignatureInput10.isOctetStream();
    java.io.InputStream inputStream13 = xMLSignatureInput10.getOctetStream();
    apacheXMLProvider6.load(inputStream13);
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.loadFromXML(inputStream13);
      org.junit.Assert.fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "ApacheXML"+ "'", str5.equals("ApacheXML"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "Apache XML Security Provider"+ "'", str8.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream13);

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test470"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    int i1 = blockEncryptionImpl_AES192_BC0.getImplementedAlgorithmType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test471"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    double d3 = apacheXMLProvider0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Apache XML Security Provider"+ "'", str2.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test472"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    java.io.OutputStream outputStream9 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.save(outputStream9, "Xerces-J 2.0.0");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Apache XML Security Provider"+ "'", str2.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test473"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._ATT_URI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "URI"+ "'", str0.equals("URI"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test474"); }

    org.w3c.dom.Document document0 = null;
    java.lang.String[][] str_array_array1 = new java.lang.String[][] {  };
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstances(document0, str_array_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array1);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test475"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.utils.HelperNodeList helperNodeList3 = new org.apache.xml.security.utils.HelperNodeList(false);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform4 = org.apache.xml.security.transforms.Transform.getInstance(document0, "01100100", (org.w3c.dom.NodeList)helperNodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test476"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.KeyInfo keyInfo2 = new org.apache.xml.security.keys.KeyInfo(element0, "UTF8");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test477"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.lang.String str1 = canonicalizer20010315OmitComments0.engineGetURI();
    boolean b2 = canonicalizer20010315OmitComments0.engineGetIncludeComments();
    org.w3c.dom.Node node3 = null;
    org.w3c.dom.NodeList nodeList4 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node3);
    java.util.Set set5 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList4);
    java.util.Set set6 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList4);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array7 = canonicalizer20010315OmitComments0.engineCanonicalizeXPathNodeSet(nodeList4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test478"); }

    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException10 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array8);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException11 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array8);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException12 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array8);
    java.lang.Object[] obj_array17 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException18 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array17);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException19 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array17);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException20 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array17);
    org.apache.xml.security.signature.Reference reference21 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException22 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array17, reference21);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException23 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array8, (java.lang.Exception)missingResourceFailureException22);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException32 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array29);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException33 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array29);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException34 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array29);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException35 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array8, (java.lang.Exception)storageResolverException34);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException36 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2001/04/xmlenc#aes192-cbc", (java.lang.Exception)storageResolverException34);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException37 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("J", (java.lang.Exception)invalidTransformException36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test479"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    int i4 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    byte[] byte_array5 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array5);
    java.lang.String str7 = org.apache.xml.security.utils.Base64.encode(byte_array5);
    java.lang.String str8 = org.apache.xml.security.utils.Base64.encode(byte_array5);
    java.security.Key key9 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array10 = keyWrapImpl_AES128_BC0.engineEncrypt(byte_array5, key9);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str6.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "yTZ4mVI+6vI="+ "'", str7.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "yTZ4mVI+6vI="+ "'", str8.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test480"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.register("PgenCounter");

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test481"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.io.OutputStream outputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.save(outputStream1, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test482"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array7 = oAEPParams6.getOAEPParamBytes();
    java.lang.String str8 = oAEPParams6.getAlgorithmURI();
    org.apache.xml.security.keys.KeyInfo keyInfo9 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData12 = new org.apache.xml.security.encryption.EncryptedData(document0, "", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6, keyInfo9, encryptionProperties10, "ApacheXML");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "yTZ4mVI+6vI="+ "'", str5.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str8.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test483"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = null;
    java.security.PublicKey publicKey7 = retrievalMethodResolver3.engineResolvePublicKey(element4, "subtract", storageResolver6);
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey14 = x509IssuerSerialResolver10.engineResolveSecretKey(element11, "subtract", storageResolver13);
    java.security.cert.X509Certificate x509Certificate15 = retrievalMethodResolver3.engineResolveX509Certificate(element8, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver13);
    java.security.cert.X509Certificate x509Certificate16 = null;
    storageResolver13.add(x509Certificate16);
    javax.crypto.SecretKey secretKey18 = x509CertificateResolver0.engineResolveSecretKey(element1, "00 01 FF 64 64 00", storageResolver13);
    org.w3c.dom.Element element19 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver21 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element22 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver24 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver27 = null;
    java.security.PublicKey publicKey28 = retrievalMethodResolver24.engineResolvePublicKey(element25, "subtract", storageResolver27);
    org.w3c.dom.Element element29 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver31 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element32 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver34 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey35 = x509IssuerSerialResolver31.engineResolveSecretKey(element32, "subtract", storageResolver34);
    java.security.cert.X509Certificate x509Certificate36 = retrievalMethodResolver24.engineResolveX509Certificate(element29, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver34);
    java.security.cert.X509Certificate x509Certificate37 = null;
    storageResolver34.add(x509Certificate37);
    javax.crypto.SecretKey secretKey39 = x509CertificateResolver21.engineResolveSecretKey(element22, "00 01 FF 64 64 00", storageResolver34);
    javax.crypto.SecretKey secretKey40 = x509CertificateResolver0.engineResolveSecretKey(element19, "2.5.29.14", storageResolver34);
    org.w3c.dom.Element element41 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver43 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element44 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver46 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey47 = x509IssuerSerialResolver43.engineResolveSecretKey(element44, "subtract", storageResolver46);
    org.w3c.dom.Element element48 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver50 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver50.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element54 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver56 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey57 = retrievalMethodResolver50.engineResolvePublicKey(element54, "HMACOutputLength", storageResolver56);
    javax.crypto.SecretKey secretKey58 = x509IssuerSerialResolver43.engineResolveSecretKey(element48, "", storageResolver56);
    javax.crypto.SecretKey secretKey59 = x509CertificateResolver0.engineResolveSecretKey(element41, "X.509", storageResolver56);
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate60 = storageResolver56.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey59);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test484"); }

    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    rSAKeyValueResolver0.engineSetProperty("X509SerialNumber", "EncryptionProperties");

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test485"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    org.w3c.dom.Document document3 = null;
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams4 = null;
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams5 = keyTransportImpl_RSAPKCS15_BC0.engineInit(document3, encryptionMethodParams4);
    byte[] byte_array7 = ant.HexDump.toByteArray(1);
    byte[] byte_array8 = org.apache.xml.security.utils.Base64.decode(byte_array7);
    java.security.Key key9 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array10 = keyTransportImpl_RSAPKCS15_BC0.engineDecrypt(byte_array7, key9);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(encryptionMethodParams5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test486"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter04 transformXPath2Filter040 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter04();
    boolean b1 = transformXPath2Filter040.returnsOctetStream();
    boolean b2 = transformXPath2Filter040.returnsOctetStream();
    boolean b3 = transformXPath2Filter040.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test487"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    java.util.Enumeration enumeration13 = apacheKeyStore0.engineAliases();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter14 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration13);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test488"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = null;
    java.security.PublicKey publicKey7 = retrievalMethodResolver3.engineResolvePublicKey(element4, "subtract", storageResolver6);
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey14 = x509IssuerSerialResolver10.engineResolveSecretKey(element11, "subtract", storageResolver13);
    java.security.cert.X509Certificate x509Certificate15 = retrievalMethodResolver3.engineResolveX509Certificate(element8, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver13);
    java.security.cert.X509Certificate x509Certificate16 = null;
    storageResolver13.add(x509Certificate16);
    javax.crypto.SecretKey secretKey18 = x509CertificateResolver0.engineResolveSecretKey(element1, "00 01 FF 64 64 00", storageResolver13);
    org.w3c.dom.Element element19 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver21 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element22 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver24 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver27 = null;
    java.security.PublicKey publicKey28 = retrievalMethodResolver24.engineResolvePublicKey(element25, "subtract", storageResolver27);
    org.w3c.dom.Element element29 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver31 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element32 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver34 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey35 = x509IssuerSerialResolver31.engineResolveSecretKey(element32, "subtract", storageResolver34);
    java.security.cert.X509Certificate x509Certificate36 = retrievalMethodResolver24.engineResolveX509Certificate(element29, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver34);
    java.security.cert.X509Certificate x509Certificate37 = null;
    storageResolver34.add(x509Certificate37);
    javax.crypto.SecretKey secretKey39 = x509CertificateResolver21.engineResolveSecretKey(element22, "00 01 FF 64 64 00", storageResolver34);
    javax.crypto.SecretKey secretKey40 = x509CertificateResolver0.engineResolveSecretKey(element19, "2.5.29.14", storageResolver34);
    org.w3c.dom.Element element41 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver43 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element44 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver46 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey47 = x509IssuerSerialResolver43.engineResolveSecretKey(element44, "subtract", storageResolver46);
    org.w3c.dom.Element element48 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver50 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver50.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element54 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver56 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey57 = retrievalMethodResolver50.engineResolvePublicKey(element54, "HMACOutputLength", storageResolver56);
    javax.crypto.SecretKey secretKey58 = x509IssuerSerialResolver43.engineResolveSecretKey(element48, "", storageResolver56);
    javax.crypto.SecretKey secretKey59 = x509CertificateResolver0.engineResolveSecretKey(element41, "X.509", storageResolver56);
    org.w3c.dom.Element element60 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver62 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element63 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver65 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey66 = x509IssuerSerialResolver62.engineResolveSecretKey(element63, "subtract", storageResolver65);
    org.w3c.dom.Element element67 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver69 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver69.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element73 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver75 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey76 = retrievalMethodResolver69.engineResolvePublicKey(element73, "HMACOutputLength", storageResolver75);
    javax.crypto.SecretKey secretKey77 = x509IssuerSerialResolver62.engineResolveSecretKey(element67, "", storageResolver75);
    java.security.cert.X509Certificate x509Certificate78 = null;
    storageResolver75.add(x509Certificate78);
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate80 = x509CertificateResolver0.engineResolveX509Certificate(element60, "Type", storageResolver75);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey59);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey76);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey77);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test489"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.MgmtData mgmtData2 = new org.apache.xml.security.keys.content.MgmtData(element0, "http://www.w3.org/2001/04/xmlenc#aes128-cbc");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test490"); }

    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException1 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("Target");

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test491"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((short)0);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    java.lang.String str4 = org.apache.xml.security.utils.Base64.encode(byte_array1, 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "AAA="+ "'", str4.equals("AAA="));

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test492"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    java.util.Date date14 = apacheKeyStore0.engineGetCreationDate("Xalan Java 2.5.1");
    boolean b16 = apacheKeyStore0.engineIsKeyEntry("http://www.w3.org/2002/04/xmldsig-filter2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test493"); }

    byte[] byte_array1 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.toHexString(byte_array1);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    xMLSignatureInput3.setSourceURI("Y");
    boolean b6 = xMLSignatureInput3.isNodeSet();
    boolean b7 = xMLSignatureInput3.isOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str2.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test494"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    apacheXMLProvider0.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Apache XML Security Provider"+ "'", str2.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test495"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.indentSignature(element0, "", 10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test496"); }

    org.apache.xml.security.utils.HexDump.setDebug(true);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test497"); }

    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams1 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    org.w3c.dom.Document document2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.DocumentFragment documentFragment3 = streamParams1.createChildNodes(document2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test498"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transforms transforms2 = new org.apache.xml.security.transforms.Transforms(element0, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test499"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException9 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array6);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException13 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException12);
    org.apache.xml.security.transforms.TransformationException transformationException14 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array6, (java.lang.Exception)xMLSecurityException13);
    java.lang.Object[] obj_array19 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException20 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array19);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException21 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array19);
    java.lang.Object[] obj_array25 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException26 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array25);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException27 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array25);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException28 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException27);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException29 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array19, (java.lang.Exception)invalidCanonicalizerException27);
    org.apache.xml.security.signature.Reference reference30 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException31 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array19, reference30);
    org.apache.xml.security.signature.Reference reference32 = null;
    missingResourceFailureException31.setReference(reference32);
    org.apache.xml.security.signature.Reference reference34 = missingResourceFailureException31.getReference();
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException35 = new org.apache.xml.security.signature.InvalidDigestValueException("Algorithm", obj_array6, (java.lang.Exception)missingResourceFailureException31);
    java.lang.String str36 = org.apache.xml.security.utils.I18n.translate("http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/", obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reference34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "No message with ID \"http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str36.equals("No message with ID \"http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest1.test500"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver x509SKIResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = null;
    java.security.PublicKey publicKey7 = retrievalMethodResolver3.engineResolvePublicKey(element4, "subtract", storageResolver6);
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey14 = x509IssuerSerialResolver10.engineResolveSecretKey(element11, "subtract", storageResolver13);
    java.security.cert.X509Certificate x509Certificate15 = retrievalMethodResolver3.engineResolveX509Certificate(element8, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver13);
    java.security.cert.X509Certificate x509Certificate16 = null;
    storageResolver13.add(x509Certificate16);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey18 = x509SKIResolver0.engineResolvePublicKey(element1, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments", storageResolver13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate15);

  }

}
