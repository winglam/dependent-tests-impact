
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    java.lang.Exception exception1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException2 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("hi!", exception1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    java.lang.Exception exception1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException2 = new org.apache.xml.security.keys.storage.StorageResolverException("hi!", exception1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue2 = new org.apache.xml.security.encryption.CipherValue(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.TYPE_ELEMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#Element"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#Element"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_HMACOUTPUTLENGTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "HMACOutputLength"+ "'", str0.equals("HMACOutputLength"));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter"+ "'", str0.equals("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    org.w3c.dom.Node node0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput(node0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    byte[] byte_array3 = new byte[] { (byte)-1, (byte)10, (byte)-1 };
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = org.apache.xml.security.utils.Base64.decode(byte_array3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams1 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    java.security.KeyStore keyStore0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.storage.implementations.KeyStoreResolver keyStoreResolver1 = new org.apache.xml.security.keys.storage.implementations.KeyStoreResolver(keyStore0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPath2FilterContainer.SUBTRACT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "subtract"+ "'", str0.equals("subtract"));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    org.apache.xml.security.utils.Version.fVersion = "subtract";

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.traversal.NodeIterator nodeIterator2 = org.apache.xml.security.utils.XPathFuncHereAPI.selectNodeIterator(node0, node1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.Manifest manifest2 = new org.apache.xml.security.signature.Manifest(element0, "hi!");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509ISSUERNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509IssuerName"+ "'", str0.equals("X509IssuerName"));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "X509IssuerName");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_C14N_WITH_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_P;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "P"+ "'", str0.equals("P"));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_CARRIEDKEYNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CarriedKeyName"+ "'", str0.equals("CarriedKeyName"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.IdResolver.registerElementById(element0, "http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    sun.security.x509.X500Name x500Name6 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter", "P", "hi!", "", "", "hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name6);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    org.apache.xml.security.algorithms.SignatureAlgorithm.register("hi!", "HMACOutputLength");

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    int i0 = org.apache.xml.security.algorithms.encryption.EncryptionMethodSpi.ALGOTYPE_KEY_TRANSPORT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.SPKIData sPKIData2 = new org.apache.xml.security.keys.content.SPKIData(element0, "subtract");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_MAC_HMAC_SHA1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#hmac-sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#hmac-sha1"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_REFERENCELIST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ReferenceList"+ "'", str0.equals("ReferenceList"));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    boolean b0 = org.apache.xml.security.Init.isInitialized();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    org.apache.xml.security.keys.provider.ProviderTest providerTest0 = new org.apache.xml.security.keys.provider.ProviderTest();

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.getSignatureSpecNSprefix();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ds"+ "'", str0.equals("ds"));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    int i0 = org.apache.xml.security.utils.ElementProxy.MODE_UNKNOWN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 3);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "ReferenceList", "http://www.w3.org/2001/04/xmlenc#Element");
      org.junit.Assert.fail("Expected exception of type java.lang.NumberFormatException");
    } catch (java.lang.NumberFormatException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.implementations.SignatureDSA._URI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#dsa-sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#dsa-sha1"));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_TRANSFORMS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Transforms"+ "'", str0.equals("Transforms"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.keys.content.keyvalues.DSAKeyValue dSAKeyValue1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(document0, dSAKeyValue1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo3 = new org.apache.xml.security.signature.SignedInfo(document0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    short s0 = org.w3c.dom.traversal.NodeFilter.FILTER_REJECT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s0 == (short)2);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPath2FilterContainer.UNION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "union"+ "'", str0.equals("union"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("http://www.w3.org/2001/04/xmlenc#Element");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative(attr0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    ant.HexDump.setBitDigits('a', ' ');

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.ALGO_ID_SIGNATURE_ECDSA_CERTICOM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1"+ "'", str0.equals("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    java.lang.String str1 = org.apache.xml.security.utils.I18n.translate("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    java.util.Set set0 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput(set0);
    // The following exception was thrown during execution in test generation
    try {
    java.io.InputStream inputStream2 = xMLSignatureInput1.getOctetStream();
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_MODULUS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Modulus"+ "'", str0.equals("Modulus"));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_KEYWRAP_AES256;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes256"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#kw-aes256"));

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants.ApacheKeyStore_NAMESPACE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://xml.apache.org/security/#KeyStore"+ "'", str0.equals("http://xml.apache.org/security/#KeyStore"));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Map map1 = org.apache.xml.security.c14n.implementations.Canonicalizer20010315.getinscopeNamespaces(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("FF 64 64 64 0A 00");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CarriedKeyName carriedKeyName2 = new org.apache.xml.security.encryption.CarriedKeyName(document0, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_PGENCOUNTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PgenCounter"+ "'", str0.equals("PgenCounter"));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperty signatureProperty2 = new org.apache.xml.security.signature.SignatureProperty(document0, "P");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.setAttr(element0, "http://www.w3.org/2000/09/xmldsig#dsa-sha1", "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = new byte[] { (byte)0, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL4 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(document0, byte_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    org.apache.xml.security.utils.JavaUtils.runGC();

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException0 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException();

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.JCEMapper.KEYTYPE_SYMMETRIC_KEY_WRAP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SymmetricKeyWrap"+ "'", str0.equals("SymmetricKeyWrap"));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    org.w3c.dom.Document document0 = null;
    java.security.cert.Certificate certificate2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.CertificateElement certificateElement3 = new org.apache.xml.security.keys.provider.CertificateElement(document0, "HMACOutputLength", certificate2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

    java.lang.String str0 = org.apache.xml.security.keys.content.RetrievalMethod.TYPE_MGMT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#MgmtData"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#MgmtData"));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("union");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformC14NExclusive.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", str0.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    java.lang.String str0 = org.apache.xml.security.keys.content.RetrievalMethod.TYPE_X509;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#X509Data"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#X509Data"));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, "CarriedKeyName");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SEED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Seed"+ "'", str0.equals("Seed"));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    org.apache.xml.security.c14n.Canonicalizer.register("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", "HMACOutputLength");

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_CDATA_SECTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_MAC_HMAC_NOT_RECOMMENDED_MD5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-md5"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-md5"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    org.apache.xpath.CachedXPathAPI cachedXPathAPI0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.CachedXPathFuncHereAPI cachedXPathFuncHereAPI1 = new org.apache.xml.security.utils.CachedXPathFuncHereAPI(cachedXPathAPI0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException1 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_DIGESTMETHOD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "DigestMethod"+ "'", str0.equals("DigestMethod"));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.c14n.helper.C14nHelper.checkForRelativeNamespace(element0);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    org.apache.xml.security.utils.ElementProxy elementProxy0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.addReturnToElement(elementProxy0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.Node node2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.traversal.NodeIterator nodeIterator3 = org.apache.xml.security.utils.XPathFuncHereAPI.selectNodeIterator(node0, node1, node2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    java.lang.String str1 = ant.HexDump.prettyPrintHex("http://www.w3.org/2001/04/xmlenc#Element");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n"+ "'", str1.equals("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n"));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI2 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(element0, "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    org.apache.xml.security.utils.HexDump.setByteSeparator(' ');

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = new byte[] { (byte)0, (byte)1 };
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData4 = new org.apache.xml.security.encryption.CipherData(document0, byte_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_MAC_HMAC_RIPEMD160;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160"));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("ReferenceList");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "ReferenceList"+ "'", str1.equals("ReferenceList"));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_ENTITY_REFERENCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 16);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties1 = new org.apache.xml.security.encryption.EncryptionProperties(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.TYPE_MEDIATYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.isi.edu/in-notes/iana/assignments/media-types/"+ "'", str0.equals("http://www.isi.edu/in-notes/iana/assignments/media-types/"));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "SymmetricKeyWrap");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(element0, "FF 64 64 64 0A 00");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformBase64Decode.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#base64"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#base64"));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_KEYINFO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "KeyInfo"+ "'", str0.equals("KeyInfo"));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    org.apache.xml.security.utils.HexDump.setWithByteSeparator(true);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(document0, "CarriedKeyName");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    java.lang.String str1 = org.apache.xml.security.utils.XMLUtils.getNodeTypeString((short)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_G;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "G"+ "'", str0.equals("G"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.setAttr(element0, "ReferenceList", "Modulus");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    int i0 = org.apache.xml.security.utils.ElementProxy.MODE_DECRYPT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(document0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    org.apache.xml.security.c14n.Canonicalizer.register("http://www.isi.edu/in-notes/iana/assignments/media-types/", "http://www.w3.org/2000/09/xmldsig#base64");

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array8 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str9 = ant.HexDump.byteArrayToHexString(byte_array8);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput10 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array8);
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element11 = org.apache.xml.security.utils.Base64.encodeToElement(document0, "http://www.w3.org/2000/09/xmldsig#X509Data", byte_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "FF 64 64 64 0A 00"+ "'", str9.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException0 = new org.apache.xml.security.c14n.InvalidCanonicalizerException();

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    org.w3c.dom.Document document0 = null;
    java.util.Set set1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, set1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.XMLUtils.createDSctx(document0, "http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.register("SymmetricKeyWrap");

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_ENCRYPTIONMETHOD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EncryptionMethod"+ "'", str0.equals("EncryptionMethod"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.ALGO_ID_DIGEST_SHA256;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#sha256"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#sha256"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("subtract", "Seed", "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createElementFromBigint(document0, "DigestMethod", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod1 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo2 = null;
    org.apache.xml.security.encryption.CipherData cipherData3 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData7 = new org.apache.xml.security.encryption.EncryptedData(document0, encryptionMethod1, keyInfo2, cipherData3, encryptionProperties4, "", "EncryptionMethod");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_BLOCKCIPHER_AES128;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes128-cbc"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#aes128-cbc"));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CarriedKeyName carriedKeyName2 = new org.apache.xml.security.encryption.CarriedKeyName(document0, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._ATT_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Id"+ "'", str0.equals("Id"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_MAC_HMAC_SHA384;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384"));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    org.w3c.dom.Node node0 = null;
    java.io.OutputStream outputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.outputDOM(node0, outputStream1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.apache.xml.security.algorithms.SignatureAlgorithm.providerInit();

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(element0, "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.apache.xml.security.utils.Version.fVersion = "http://www.w3.org/2000/09/xmldsig#dsa-sha1";

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_MANIFEST;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Manifest"+ "'", str0.equals("Manifest"));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_KEYNAME;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "KeyName"+ "'", str0.equals("KeyName"));

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, "");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_C14N_EXCL_WITH_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithComments"+ "'", str0.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments"));

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.ObjectContainer objectContainer2 = new org.apache.xml.security.signature.ObjectContainer(element0, "ReferenceList");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.Manifest manifest2 = new org.apache.xml.security.signature.Manifest(element0, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXPath2Filter04.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2002/04/xmldsig-filter2"+ "'", str0.equals("http://www.w3.org/2002/04/xmldsig-filter2"));

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "http://www.isi.edu/in-notes/iana/assignments/media-types/");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "", (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    sun.security.x509.X500Name x500Name6 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("Modulus", "FF 64 64 64 0A 00", "", "Modulus", "CarriedKeyName", "http://www.w3.org/2001/10/xml-exc-c14n#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name6);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(document0, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.ALGO_ID_DIGEST_SHA1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#sha1"));

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.XMLUtils.createElementInEncryptionSpace(document0, "http://www.w3.org/2001/04/xmlenc#sha256");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    org.apache.xml.security.utils.I18n.init("FF 64 64 64 0A 00", "Transforms");

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_J;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "J"+ "'", str0.equals("J"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    ant.HexDump.setDebug(true);

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI2 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(element0, "http://www.w3.org/2001/10/xml-exc-c14n#");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("Modulus", "Manifest");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.IdResolver.registerElementById(element0, "PgenCounter");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    java.lang.String str0 = org.apache.xml.security.signature.Reference.MANIFEST_URI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#Manifest"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#Manifest"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SPKISEXP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SPKISexp"+ "'", str0.equals("SPKISexp"));

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_ENCODING_BASE64;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#base64"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#base64"));

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignature xMLSignature3 = new org.apache.xml.security.signature.XMLSignature(document0, "Seed", "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.RSAKeyValue rSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.RSAKeyValue(element0, "DigestMethod");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    byte[] byte_array6 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str7 = ant.HexDump.byteArrayToHexString(byte_array6);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput8 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array6);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set set9 = xMLSignatureInput8.getNodeSet();
      org.junit.Assert.fail("Expected exception of type java.io.UTFDataFormatException");
    } catch (java.io.UTFDataFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FF 64 64 64 0A 00"+ "'", str7.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_RSA_SHA512;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512"));

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(element0, "http://www.w3.org/2001/10/xml-exc-c14n#");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_CIPHERVALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CipherValue"+ "'", str0.equals("CipherValue"));

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    java.lang.String str0 = org.apache.xml.security.utils.Version.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#dsa-sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#dsa-sha1"));

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_NOT_RECOMMENDED_RSA_MD5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-md5"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-md5"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_ATTRIBUTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

    java.io.InputStream inputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput(inputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(document0, "Id");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData1 = new org.apache.xml.security.encryption.CipherData(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignature xMLSignature3 = new org.apache.xml.security.signature.XMLSignature(document0, "http://www.w3.org/2001/10/xml-exc-c14n#", "http://www.w3.org/2000/09/xmldsig#Manifest");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array7);
    java.security.Key key9 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array10 = keyWrapImpl_AES128_BC0.engineDecrypt(byte_array7, key9);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FF 64 64 64 0A 00"+ "'", str8.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Attr attr4 = org.apache.xml.security.utils.XMLUtils.createAttr(document0, "http://www.w3.org/2001/04/xmldsig-more#hmac-md5", "Transforms", "DigestMethod");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    org.w3c.dom.Node node0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Document document1 = org.apache.xml.security.utils.XMLUtils.getOwnerDocument(node0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_ENTITY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 32);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(element0, "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_XPATH2FILTER04;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2002/04/xmldsig-filter2"+ "'", str0.equals("http://www.w3.org/2002/04/xmldsig-filter2"));

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue2 = new org.apache.xml.security.encryption.CipherValue(element0, "KeyName");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    org.w3c.dom.Node node0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.addReturnToNode(node0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_KEYVALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "KeyValue"+ "'", str0.equals("KeyValue"));

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformC14N.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    org.apache.xml.security.utils.HexDump.setByteSeparator('4');

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(document0, "KeyInfo");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.setAttr(element0, "http://www.w3.org/2000/09/xmldsig#X509Data", "http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXSLT.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/1999/REC-xslt-19991116"+ "'", str0.equals("http://www.w3.org/TR/1999/REC-xslt-19991116"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue2 = new org.apache.xml.security.encryption.CipherValue(element0, "KeyInfo");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    int i0 = org.apache.xml.security.utils.Base64.BASE64DEFAULTLENGTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 76);

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("Id");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_PROCESSING_INSTRUCTION;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 64);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.XPATH_C14N_OMIT_COMMENTS_SINGLE_NODE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "(.//. | .//@* | .//namespace::*)[not(self::comment())]"+ "'", str0.equals("(.//. | .//@* | .//namespace::*)[not(self::comment())]"));

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_RSA_SHA1;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#rsa-sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#rsa-sha1"));

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    org.w3c.dom.Node node0 = null;
    java.lang.String str1 = org.apache.xml.security.utils.XMLUtils.getXPath(node0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = x509CertificateResolver0.engineCanResolve(element1, "HMACOutputLength", storageResolver3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    org.apache.xml.security.Init.registerKeyInfoContentHandler("http://www.w3.org/2002/04/xmldsig-filter2", "SPKISexp", "subtract");

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_DSAKEYVALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "DSAKeyValue"+ "'", str0.equals("DSAKeyValue"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_URI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "URI"+ "'", str0.equals("URI"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXPointer.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/WD-xptr-20010108"+ "'", str0.equals("http://www.w3.org/TR/2001/WD-xptr-20010108"));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    org.w3c.dom.Attr attr0 = null;
    java.util.Vector vector2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver3 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", vector2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "http://www.w3.org/2002/04/xmldsig-filter2", (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_ENCRYPTEDDATA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EncryptedData"+ "'", str0.equals("EncryptedData"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    boolean b0 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.IncludeSlash;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == true);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "                 "+ "'", str1.equals("                 "));

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.init();

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ENCRYPTIONSPECIFICATION_URL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/"+ "'", str0.equals("http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.KeyInfo keyInfo1 = new org.apache.xml.security.keys.KeyInfo(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException1 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2000/09/xmldsig#Manifest");

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    java.lang.String str0 = org.apache.xml.security.utils.XMLUtils.randomNSprefix;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.xmlsecurity.org/NS#randomval"+ "'", str0.equals("http://www.xmlsecurity.org/NS#randomval"));

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    byte[] byte_array3 = xMLSignatureInput2.getBytes();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL4 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(document0, byte_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    java.security.Key key3 = null;
    java.security.SecureRandom secureRandom4 = null;
    // The following exception was thrown during execution in test generation
    try {
    pKCS15Cipher1.init((int)(short)100, key3, secureRandom4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithComments"+ "'", str0.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments"));

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    org.w3c.dom.Node node0 = null;
    java.io.OutputStream outputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.outputDOM(node0, outputStream1, false);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    java.lang.String str0 = org.apache.xml.security.keys.content.x509.XMLX509Certificate.JCA_CERT_ID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X.509"+ "'", str0.equals("X.509"));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException1 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "DSAKeyValue", "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(document0, element1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    java.lang.String str2 = org.apache.xml.security.algorithms.JCEMapper.getJCEKeyAlgorithmFromURI("FF 64 64 64 0A 00", "CipherValue");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(document0, "CarriedKeyName");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams2 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo3 = null;
    java.security.Key key4 = null;
    java.security.Key key5 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties6 = null;
    org.apache.xml.security.encryption.ReferenceList referenceList7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey12 = new org.apache.xml.security.encryption.EncryptedKey(document0, "subtract", encryptionMethodParams2, keyInfo3, key4, key5, encryptionProperties6, referenceList7, "EncryptionMethod", "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", "http://www.w3.org/2000/09/xmldsig#sha1", "Seed");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    org.apache.xml.security.utils.XPathFuncHereAPI xPathFuncHereAPI0 = new org.apache.xml.security.utils.XPathFuncHereAPI();

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    int i0 = org.apache.xml.security.utils.ElementProxy.MODE_CREATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants.ApacheKeyStore_PREFIX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "ks"+ "'", str0.equals("ks"));

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Type"+ "'", str0.equals("Type"));

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    char[] char_array4 = new char[] { '4', 'a', 'a', '4' };
    // The following exception was thrown during execution in test generation
    try {
    ant.HexDump.setBitDigits(char_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array4);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_BLOCKCIPHER_AES192;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes192-cbc"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#aes192-cbc"));

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_METHODS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Methods"+ "'", str0.equals("Methods"));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants._TAG_CERTIFICATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Certificate"+ "'", str0.equals("Certificate"));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", byte_array3);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array7 = keyTransportImpl_RSAPKCS15_BC0.engineDecrypt(byte_array3, key6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    org.apache.xml.security.utils.I18n.init("FF 64 64 64 0A 00", "Methods");

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.XML_LANG_SPACE_SpecNS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/XML/1998/namespace"+ "'", str0.equals("http://www.w3.org/XML/1998/namespace"));

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperties signatureProperties2 = new org.apache.xml.security.signature.SignatureProperties(element0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "http://www.w3.org/TR/1999/REC-xslt-19991116");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPathContainer xPathContainer1 = new org.apache.xml.security.transforms.params.XPathContainer(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignature xMLSignature2 = new org.apache.xml.security.signature.XMLSignature(element0, "http://www.xmlsecurity.org/NS#randomval");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.Entry entry2 = null;
    java.security.KeyStore.ProtectionParameter protectionParameter3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineSetEntry("CarriedKeyName", entry2, protectionParameter3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    org.apache.log4j.Category category0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.spitOutVersions(category0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "004004004004004004004004"+ "'", str1.equals("004004004004004004004004"));

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    java.io.BufferedReader bufferedReader0 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.Base64.decode(bufferedReader0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException0 = new org.apache.xml.security.exceptions.XMLSecurityException();

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPath2FilterContainer.INTERSECT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "intersect"+ "'", str0.equals("intersect"));

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_DOCUMENT_TYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 512);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    org.w3c.dom.Document document0 = null;
    java.security.cert.X509Certificate x509Certificate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(document0, x509Certificate1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    char[] char_array5 = new char[] { '#', '#', '#', '#', 'a' };
    // The following exception was thrown during execution in test generation
    try {
    ant.HexDump.setBitDigits(char_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array5);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_REFERENCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Reference"+ "'", str0.equals("Reference"));

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInEncryptionSpace(element0, "P");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

    org.w3c.dom.Document document0 = null;
    java.lang.String[] str_array7 = new java.lang.String[] { "ks", "http://www.w3.org/2001/04/xmlenc#kw-aes256", "KeyName", "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "Methods", "Certificate" };
    java.lang.String[] str_array14 = new java.lang.String[] { "ks", "http://www.w3.org/2001/04/xmlenc#kw-aes256", "KeyName", "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "Methods", "Certificate" };
    java.lang.String[] str_array21 = new java.lang.String[] { "ks", "http://www.w3.org/2001/04/xmlenc#kw-aes256", "KeyName", "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "Methods", "Certificate" };
    java.lang.String[] str_array28 = new java.lang.String[] { "ks", "http://www.w3.org/2001/04/xmlenc#kw-aes256", "KeyName", "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "Methods", "Certificate" };
    java.lang.String[] str_array35 = new java.lang.String[] { "ks", "http://www.w3.org/2001/04/xmlenc#kw-aes256", "KeyName", "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "Methods", "Certificate" };
    java.lang.String[][] str_array_array36 = new java.lang.String[][] { str_array7, str_array14, str_array21, str_array28, str_array35 };
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList37 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstances(document0, str_array_array36);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array36);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SIGNATUREMETHOD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SignatureMethod"+ "'", str0.equals("SignatureMethod"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXSLT.defaultXSLTSpecNSprefix;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "xslt"+ "'", str0.equals("xslt"));

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = new byte[] { (byte)0, (byte)0 };
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI5 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(document0, byte_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey2 = new org.apache.xml.security.encryption.EncryptedKey(element0, "Id");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties2 = new org.apache.xml.security.encryption.EncryptionProperties(element0, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    byte[] byte_array2 = new byte[] { (byte)100 };
    java.security.Key key3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key5 = keyTransportImpl_RSAPKCS15_BC0.engineUnwrap(byte_array2, key3, "yTZ4mVI+6vI=");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    byte[] byte_array9 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str10 = ant.HexDump.byteArrayToHexString(byte_array9);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array11 = keyWrapImpl_TRIPLEDES_BC0.engineWrap(key1, key2, byte_array9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FF 64 64 64 0A 00"+ "'", str10.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperties signatureProperties2 = new org.apache.xml.security.signature.SignatureProperties(element0, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.normalize("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    org.apache.xml.security.utils.Version.fVersion = "G";

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.cert.Certificate certificate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = apacheKeyStore0.engineGetCertificateAlias(certificate1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("http://www.xmlsecurity.org/NS#randomval", "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array3);
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(byte_array3);
    java.security.Key key7 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = keyWrapImpl_AES128_BC0.engineEncrypt(byte_array3, key7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "11001001400110110401111000410011001401010010400111110411101010411110010"+ "'", str6.equals("11001001400110110401111000410011001401010010400111110411101010411110010"));

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants._TAG_KEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Key"+ "'", str0.equals("Key"));

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509CRL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509CRL"+ "'", str0.equals("X509CRL"));

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_KEYTRANSPORT_RSAOAEP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.CipherReference cipherReference1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData2 = new org.apache.xml.security.encryption.CipherData(document0, cipherReference1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    org.apache.xml.security.transforms.Transform.init();

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    byte[] byte_array4 = new byte[] { (byte)10 };
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = keyWrapImpl_TRIPLEDES_BC0.engineWrap(key1, key2, byte_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

    org.apache.xml.security.utils.Constants.configurationFile = "subtract";

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", byte_array1);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = org.apache.xml.security.utils.Base64.decode(byte_array1);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str2.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

    java.lang.String str1 = ant.HexDump.prettyPrintHex("ks");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 6B 73                                              ks\n"+ "'", str1.equals("0000: 6B 73                                              ks\n"));

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("                 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    int i0 = org.apache.xml.security.utils.ElementProxy.MODE_ENCRYPT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData2 = new org.apache.xml.security.encryption.EncryptedData(element0, "KeyName");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    java.lang.String str0 = org.apache.xml.security.keys.content.x509.XMLX509SKI.SKI_OID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "2.5.29.14"+ "'", str0.equals("2.5.29.14"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_RECIPIENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Recipient"+ "'", str0.equals("Recipient"));

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformC14NWithComments.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.InclusiveNamespaces._TAG_EC_INCLUSIVENAMESPACES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "InclusiveNamespaces"+ "'", str0.equals("InclusiveNamespaces"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    org.w3c.dom.Document document0 = null;
    java.security.Key key1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.DSAKeyValue dSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.DSAKeyValue(document0, key1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "Manifest", "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    org.w3c.dom.Document document0 = null;
    java.security.cert.X509Certificate x509Certificate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI2 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(document0, x509Certificate1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((short)(byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa aaaa a a"+ "'", str1.equals("aaaaaaaa aaaa a a"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ENCODING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "UTF8"+ "'", str0.equals("UTF8"));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    org.apache.xml.security.utils.Base64.setBase64WrapLength(32);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue2 = new org.apache.xml.security.encryption.CipherValue(element0, "UTF8");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    org.apache.xml.security.keys.keyresolver.KeyResolver.registerAtStart("FF 64 64 64 0A 00");

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_C14N_EXCL_OMIT_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", str0.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_ENCRYPTIONPROPERTY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EncryptionProperty"+ "'", str0.equals("EncryptionProperty"));

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.ALGO_ID_DIGEST_RIPEMD160;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#ripemd160"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#ripemd160"));

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(document0, "URI");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    java.lang.String str3 = org.apache.xml.security.utils.Base64.encode(byte_array1);
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = keyWrapImpl_AES256_BC0.engineDecrypt(byte_array1, key4);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str2.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yTZ4mVI+6vI="+ "'", str3.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_XPATH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "XPath"+ "'", str0.equals("XPath"));

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_RSA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#rsa-sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#rsa-sha1"));

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_ENCODING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Encoding"+ "'", str0.equals("Encoding"));

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.setAttr(element0, "http://www.w3.org/2001/10/xml-exc-c14n#", "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceUnion(document0, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.transforms.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.RetrievalMethod retrievalMethod4 = new org.apache.xml.security.keys.content.RetrievalMethod(document0, "XPath", transforms2, "xslt");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    byte[] byte_array7 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array7);
    java.security.Key key9 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array10 = blockEncryptionImpl_AES192_BC0.engineEncrypt(byte_array7, key9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00 01 FF 64 64 00"+ "'", str8.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    java.lang.String str0 = org.apache.xml.security.utils.Base64.LINE_SEPARATOR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "\n"+ "'", str0.equals("\n"));

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    org.w3c.dom.Document document0 = null;
    java.lang.String[] str_array1 = new java.lang.String[] {  };
    java.lang.String[] str_array2 = new java.lang.String[] {  };
    java.lang.String[][] str_array_array3 = new java.lang.String[][] { str_array1, str_array2 };
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList4 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstances(document0, str_array_array3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array_array3);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = canonicalizer20010315OmitComments0.engineCanonicalizeSubTree(node1, "(.//. | .//@* | .//namespace::*)[not(self::comment())]");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_DOCUMENT_FRAGMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1024);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    int i0 = org.apache.xml.security.keys.keyresolver.KeyResolver.length();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 8);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createElementFromBigint(document0, "                 ", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CarriedKeyName carriedKeyName2 = new org.apache.xml.security.encryption.CarriedKeyName(document0, "X509CRL");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("(.//. | .//@* | .//namespace::*)[not(self::comment())]");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform2 = org.apache.xml.security.transforms.Transform.getInstance(document0, "                 ");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    int i0 = org.apache.xml.security.utils.ElementProxy.MODE_VERIFY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString((long)1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "004004004004004004044004"+ "'", str1.equals("004004004004004004044004"));

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._ATT_ALGORITHM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Algorithm"+ "'", str0.equals("Algorithm"));

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = x509CertificateResolver0.engineCanResolve(element1, "P", storageResolver3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("CipherValue", "Id");
      org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    org.w3c.dom.Element element3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams4 = keyTransportImpl_RSAPKCS15_BC0.engineInit(element3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.Base64.decode("SignatureMethod");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL2 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(element0, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.DataReference dataReference2 = new org.apache.xml.security.encryption.DataReference(element0, "Key");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    java.lang.String str0 = org.apache.xml.security.keys.content.RetrievalMethod.TYPE_RAWX509;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#rawX509Certificate"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#rawX509Certificate"));

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants._ATT_DATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Date"+ "'", str0.equals("Date"));

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "intersect", "Certificate");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    org.w3c.dom.Element element0 = null;
    org.w3c.dom.Attr attr1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.IdResolver.registerElementById(element0, attr1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    org.w3c.dom.Document document1 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams7 = keyWrapImpl_AES128_BC0.engineInit(document1, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6);
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

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstance(element0, "\u0000\u0000\u0000 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo1 = new org.apache.xml.security.signature.SignedInfo(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    org.apache.xml.security.utils.Base64.setBase64WrapLength((-1));

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#enveloped-signature"));

  }

  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.keys.content.keyvalues.RSAKeyValue rSAKeyValue1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(document0, rSAKeyValue1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants._TAG_CERTIFICATE_CHAIN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CertificateChain"+ "'", str0.equals("CertificateChain"));

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.Entry entry2 = null;
    java.security.KeyStore.ProtectionParameter protectionParameter3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineSetEntry("", entry2, protectionParameter3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array1);
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.toBinaryString(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str2.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "11001001400110110401111000410011001401010010400111110411101010411110010"+ "'", str5.equals("11001001400110110401111000410011001401010010400111110411101010411110010"));

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array4 = new byte[] { (byte)10, (byte)100 };
    java.security.Key key5 = null;
    byte[] byte_array12 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array14 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array4, key5, byte_array12);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "00 01 FF 64 64 00"+ "'", str13.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("EncryptionMethod");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    org.w3c.dom.Element element0 = null;
    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.encryption.EncryptedData.replace(element0, byte_array1);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    java.lang.String str0 = org.apache.xml.security.utils.I18n.NOT_INITIALIZED_MSG;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library."+ "'", str0.equals("You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library."));

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    org.w3c.dom.Document document2 = null;
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    java.lang.String str6 = org.apache.xml.security.utils.Base64.encode(byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams8 = keyWrapImpl_AES128_BC0.engineInit(document2, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "yTZ4mVI+6vI="+ "'", str6.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("Methods");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Methods"+ "'", str1.equals("Methods"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    org.apache.xml.security.algorithms.JCEMapper jCEMapper0 = new org.apache.xml.security.algorithms.JCEMapper();

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_BLOCKCIPHER_TRIPLEDES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#tripledes-cbc"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#tripledes-cbc"));

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException0 = new org.apache.xml.security.signature.InvalidDigestValueException();

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.CertificateElement certificateElement2 = new org.apache.xml.security.keys.provider.CertificateElement(element0, "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams2 = blockEncryptionImpl_AES192_BC0.engineInit(element1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException1 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("2.5.29.14");

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.DSAKeyValue dSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.DSAKeyValue(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = x509CertificateResolver0.engineCanResolve(element1, "", storageResolver3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_C14N_OMIT_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    java.lang.String str1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.KeyInfo keyInfo2 = new org.apache.xml.security.keys.KeyInfo(element0, "http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    java.io.InputStream inputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(inputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException1 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512");

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.ReferenceList referenceList1 = new org.apache.xml.security.encryption.ReferenceList(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.KeyInfo keyInfo2 = new org.apache.xml.security.keys.KeyInfo(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = org.apache.xml.security.utils.resolver.ResourceResolver.resolveStatic(attr0, "SignatureMethod");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_PGPKEYID;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PGPKeyID"+ "'", str0.equals("PGPKeyID"));

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference3 = new org.apache.xml.security.encryption.CipherReference(document0, "0000: 6B 73                                              ks\n", transforms2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException1 = new org.apache.xml.security.exceptions.XMLSecurityException("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n");

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    java.lang.Object[] obj_array11 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException12 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array11);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException13 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array11);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException14 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException13);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException15 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array5, (java.lang.Exception)invalidCanonicalizerException13);
    org.apache.xml.security.signature.Reference reference16 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException17 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array5, reference16);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException18 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("                 ", (java.lang.Exception)missingResourceFailureException17);
    org.apache.xml.security.signature.Reference reference19 = null;
    missingResourceFailureException17.setReference(reference19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException0 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException();

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SIGNATURE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Signature"+ "'", str0.equals("Signature"));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_KEYTRANSPORT_RSA15;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SIGNEDINFO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SignedInfo"+ "'", str0.equals("SignedInfo"));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceSubtract(document0, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList1 = org.apache.xml.security.utils.XMLUtils.getDirectChildrenElements(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_KEYREFERENCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "KeyReference"+ "'", str0.equals("KeyReference"));

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_EXCL_OMIT_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", str0.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.addReturnToElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    java.lang.String str1 = ant.HexDump.stringToHexString("http://www.w3.org/2000/09/xmldsig#X509Data");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "68 74 74 70 3A 2F 2F 77 77 77 2E 77 33 2E 6F 72 67 2F 32 30 30 30 2F 30 39 2F 78 6D 6C 64 73 69 67 23 58 35 30 39 44 61 74 61 "+ "'", str1.equals("68 74 74 70 3A 2F 2F 77 77 77 2E 77 33 2E 6F 72 67 2F 32 30 30 30 2F 30 39 2F 78 6D 6C 64 73 69 67 23 58 35 30 39 44 61 74 61 "));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInSignatureSpace(element0, "Methods");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.signature.XMLSignatureException");
    } catch (org.apache.xml.security.signature.XMLSignatureException e) {
      // Expected exception.
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    org.w3c.dom.Node node0 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b3 = xMLSignatureInput2.isInitialized();
    java.lang.String str4 = xMLSignatureInput2.getSourceURI();
    org.apache.xpath.CachedXPathAPI cachedXPathAPI5 = xMLSignatureInput2.getCachedXPathAPI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = new org.apache.xml.security.signature.XMLSignatureInput(node0, cachedXPathAPI5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedXPathAPI5);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm2 = new org.apache.xml.security.algorithms.SignatureAlgorithm(element0, "CertificateChain");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute(attr0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("Methods");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "Methods"+ "'", str1.equals("Methods"));

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    boolean b0 = org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl.ENCRYPT_IV_IN_ECB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b0 == false);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_DSA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#dsa-sha1"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#dsa-sha1"));

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00000000"+ "'", str1.equals("00000000"));

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array4 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array4);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key8 = keyWrapImpl_TRIPLEDES_BC0.engineUnwrap(byte_array4, key6, "http://www.w3.org/2000/09/xmldsig#Manifest");
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "00400400420"+ "'", str5.equals("00400400420"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperties signatureProperties2 = new org.apache.xml.security.signature.SignatureProperties(element0, "EncryptedData");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceSubtract(document0, "X509CRL");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("UTF8", "SignatureMethod");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException1 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    java.lang.String str2 = referenceNotInitializedException1.getMsgID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "FF 64 64 64 0A 00"+ "'", str2.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo4 = new org.apache.xml.security.signature.SignedInfo(document0, "HMACOutputLength", "http://www.w3.org/2001/04/xmlenc#rsa-1_5", 0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_PGPKEYPACKET;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PGPKeyPacket"+ "'", str0.equals("PGPKeyPacket"));

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceIntersect(document0, "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.indentSignature(element0, "http://www.w3.org/2000/09/xmldsig#rawX509Certificate", (int)(short)2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo4 = new org.apache.xml.security.signature.SignedInfo(document0, "Date", "CarriedKeyName", 76);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_MAC_HMAC_SHA256;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256"));

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    java.lang.String str1 = org.apache.xml.security.utils.I18n.getExceptionMessage("Key");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    java.lang.String str0 = org.apache.xml.security.utils.Version.fVersion;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "G"+ "'", str0.equals("G"));

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    // The following exception was thrown during execution in test generation
    try {
    int i2 = pKCS15Cipher1.getInputBlockSize();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.XMLUtils.createElementInSignatureSpace(document0, "http://www.w3.org/2001/04/xmldsig-more#rsa-md5");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Element element2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform3 = org.apache.xml.security.transforms.Transform.getInstance(document0, "http://www.w3.org/2001/04/xmlenc#sha256", element2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData2 = new org.apache.xml.security.encryption.EncryptedData(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments3 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList4 = null;
    byte[] byte_array5 = canonicalizer20010315WithComments3.engineCanonicalizeXPathNodeSet(nodeList4);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array6 = keyWrapImpl_AES128_BC0.engineWrap(key1, key2, byte_array5);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate4 = x509IssuerSerialResolver0.engineResolveX509Certificate(element1, "http://www.w3.org/2000/09/xmldsig#X509Data", storageResolver3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa aaaaaaaa aaaaaaaa aa  a aa"+ "'", str1.equals("aaaaaaaa aaaaaaaa aaaaaaaa aa  a aa"));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

    sun.security.x509.X500Name x500Name6 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("aaaaaaaa aaaa a a", "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n", "SPKISexp", "InclusiveNamespaces", "Encoding", "PGPKeyPacket");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name6);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.w3c.dom.Document document0 = null;
    java.security.cert.X509Certificate x509Certificate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial2 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, x509Certificate1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_KEYWRAP_AES128;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    org.apache.xml.security.utils.resolver.ResourceResolver.registerAtStart("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException0 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException();

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = canonicalizer20010315ExclWithComments0.utilizedOrIncluded(element1, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

    java.lang.String str1 = ant.HexDump.toHexString(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00 00 00 03 "+ "'", str1.equals("00 00 00 03 "));

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509SKI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509SKI"+ "'", str0.equals("X509SKI"));

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.DataReference dataReference2 = new org.apache.xml.security.encryption.DataReference(element0, "Transforms");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("SymmetricKeyWrap");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "SymmetricKeyWrap"+ "'", str1.equals("SymmetricKeyWrap"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array2 = canonicalizer20010315ExclWithComments0.engineCanonicalizeSubTree(node1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignature xMLSignature2 = new org.apache.xml.security.signature.XMLSignature(element0, "Id");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    java.lang.String str0 = org.apache.xml.security.keys.provider.ApacheKeyStoreConstants._ATT_JCATYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "JCAType"+ "'", str0.equals("JCAType"));

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver0.engineSetProperty("Manifest", "http://www.w3.org/2000/09/xmldsig#rawX509Certificate");

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

    org.apache.xml.security.utils.Constants.configurationFile = "Id";

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineStore(loadStoreParameter3);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = keyTransportImpl_RSAPKCS15_BC0.engineWrap(key1, key2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(element0, "(.//. | .//@* | .//namespace::*)[not(self::comment())]");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptionProperty encryptionProperty1 = new org.apache.xml.security.encryption.EncryptionProperty(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.Init.readUserConfiguration();
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    org.apache.xml.security.utils.HexDump.setByteSeparator('#');

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_Y;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Y"+ "'", str0.equals("Y"));

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.xml.security.utils.XMLUtils.getFullTextChildrenFromElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("DigestMethod");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInSignatureSpace(element0, "CertificateChain");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.signature.XMLSignatureException");
    } catch (org.apache.xml.security.signature.XMLSignatureException e) {
      // Expected exception.
    }

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.MoreAlgorithmsSpecNS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#"));

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.NodeList nodeList2 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node1);
    java.util.Set set3 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces4 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, set3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.Transforms transforms2 = new org.apache.xml.security.encryption.Transforms(element0, "http://www.isi.edu/in-notes/iana/assignments/media-types/");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xpath.objects.XObject xObject2 = org.apache.xml.security.utils.XPathFuncHereAPI.eval(node0, node1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(element0, "00 01 FF 64 64 00");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger1 = null;
    java.math.BigInteger bigInteger2 = null;
    java.math.BigInteger bigInteger3 = null;
    java.math.BigInteger bigInteger4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.DSAKeyValue dSAKeyValue5 = new org.apache.xml.security.keys.content.keyvalues.DSAKeyValue(document0, bigInteger1, bigInteger2, bigInteger3, bigInteger4);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.CipherValue cipherValue1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData2 = new org.apache.xml.security.encryption.CipherData(document0, cipherValue1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "0000: 00 00 00 20                                        ... \n";

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.w3c.dom.Element element0 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver2 = new org.apache.xml.security.keys.storage.StorageResolver();
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey3 = org.apache.xml.security.keys.keyresolver.KeyResolver.resolveStatic(element0, "\n", storageResolver2);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(document0, "xslt");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

    org.w3c.dom.Document document0 = null;
    java.security.cert.X509Certificate x509Certificate1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509Certificate xMLX509Certificate2 = new org.apache.xml.security.keys.content.x509.XMLX509Certificate(document0, x509Certificate1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "J", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509ISSUERSERIAL;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509IssuerSerial"+ "'", str0.equals("X509IssuerSerial"));

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.MgmtData mgmtData2 = new org.apache.xml.security.keys.content.MgmtData(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform2 = new org.apache.xml.security.transforms.Transform(element0, "xslt");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    java.io.InputStream inputStream0 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

    org.w3c.dom.Element element0 = null;
    byte[] byte_array2 = org.apache.xml.security.utils.HexDump.toByteArray((short)100);
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.encryption.EncryptedData.replace(element0, byte_array2);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.exceptionMessagesResourceBundleBase;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "org/apache/xml/security/resource/xmlsecurity"+ "'", str0.equals("org/apache/xml/security/resource/xmlsecurity"));

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    byte[] byte_array8 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str9 = ant.HexDump.byteArrayToHexString(byte_array8);
    java.security.Key key10 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array11 = keyWrapImpl_AES128_BC0.engineEncrypt(byte_array8, key10);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00 01 FF 64 64 00"+ "'", str9.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = org.apache.xml.security.utils.resolver.ResourceResolver.resolveStatic(attr0, "ds");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_TRANSFORMS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Transforms"+ "'", str0.equals("Transforms"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams2 = keyTransportImpl_RSAOAEP_BC0.engineInit(element1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = canonicalizer20010315ExclWithComments0.engineCanonicalizeSubTree(node1, "G");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    org.w3c.dom.Node node0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.xml.security.utils.XMLUtils.getNodeTypeString(node0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference3 = new org.apache.xml.security.encryption.CipherReference(document0, "", transforms2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "", "http://www.w3.org/2001/04/xmlenc#kw-aes256");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.Manifest manifest1 = new org.apache.xml.security.signature.Manifest(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException2 = new org.apache.xml.security.signature.InvalidSignatureValueException();
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException3 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/2000/09/xmldsig#MgmtData", (java.lang.Exception)invalidSignatureValueException2);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException4 = new org.apache.xml.security.signature.ReferenceNotInitializedException("X509CRL", (java.lang.Exception)invalidSignatureValueException2);

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.io.Reader reader1 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.load(reader1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    int i1 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    java.security.Key key2 = null;
    java.security.Key key3 = null;
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str11 = ant.HexDump.byteArrayToHexString(byte_array10);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput12 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array10);
    java.lang.String str13 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array10);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array14 = keyWrapImpl_AES256_BC0.engineWrap(key2, key3, byte_array10);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "FF 64 64 64 0A 00"+ "'", str11.equals("FF 64 64 64 0A 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000: FF 64 64 64 0A 00                                  .ddd..\n"+ "'", str13.equals("0000: FF 64 64 64 0A 00                                  .ddd..\n"));

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_X509CERTIFICATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X509Certificate"+ "'", str0.equals("X509Certificate"));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Node node2 = org.apache.xml.security.utils.XPathFuncHereAPI.selectSingleNode(node0, node1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL2 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(element0, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.Init.readUserConfiguration("Transforms");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = canonicalizer20010315WithComments0.engineCanonicalizeSubTree(node1, "004004004004004004044004");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    org.w3c.dom.Element element2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams3 = keyWrapImpl_TRIPLEDES_BC0.engineInit(element2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Node node2 = null;
    org.w3c.dom.NodeList nodeList3 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node2);
    java.util.Set set4 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform5 = org.apache.xml.security.transforms.Transform.getInstance(document0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", nodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set4);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    // The following exception was thrown during execution in test generation
    try {
    boolean b4 = x509CertificateResolver0.engineCanResolve(element1, "00 01 FF 64 64 00", storageResolver3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignedInfo signedInfo4 = new org.apache.xml.security.signature.SignedInfo(document0, "http://www.w3.org/XML/1998/namespace", "SignedInfo", (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    java.util.Set set1 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("Modulus");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetBlockSize();
    byte[] byte_array3 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("Transforms");
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = keyTransportImpl_RSAPKCS15_BC0.engineDecrypt(byte_array3, key4);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.KeyStoreElement keyStoreElement1 = new org.apache.xml.security.keys.provider.KeyStoreElement(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.c14n.Canonicalizer canonicalizer1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("00 01 FF 64 64 00");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey4 = x509IssuerSerialResolver0.engineResolvePublicKey(element1, "Certificate", storageResolver3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_CANONICALIZATIONMETHOD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CanonicalizationMethod"+ "'", str0.equals("CanonicalizationMethod"));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.apache.xml.security.exceptions.Base64DecodingException base64DecodingException0 = new org.apache.xml.security.exceptions.Base64DecodingException();

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    java.util.HashMap hashMap0 = org.apache.xml.security.Init._contentHandlerHash;
    org.apache.xml.security.Init._contentHandlerHash = hashMap0;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hashMap0);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.RSAKeyValue rSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.RSAKeyValue(element0, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(document0, "");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    org.w3c.dom.Text text0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.math.BigInteger bigInteger1 = org.apache.xml.security.utils.Base64.decodeBigIntegerFromText(text0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createElementFromBigint(document0, "(.//. | .//@* | .//namespace::*)[not(self::comment())]", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.Manifest manifest2 = new org.apache.xml.security.signature.Manifest(element0, "KeyInfo");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set set2 = canonicalizer20010315ExclWithComments0.visiblyUtilized(element1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_COMMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 128);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetBlockSize();
    java.lang.String str2 = keyTransportImpl_RSAPKCS15_BC0.getImplementedAlgorithmURI();
    byte[] byte_array9 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str10 = ant.HexDump.byteArrayToHexString(byte_array9);
    java.security.Key key11 = null;
    byte[] byte_array12 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str13 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array12);
    java.lang.String str14 = org.apache.xml.security.utils.Base64.encode(byte_array12);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array15 = keyTransportImpl_RSAPKCS15_BC0.engineEncrypt(byte_array9, key11, byte_array12);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00 01 FF 64 64 00"+ "'", str10.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str13.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "yTZ4mVI+6vI="+ "'", str14.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_ENCRYPTIONPROPERTIES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EncryptionProperties"+ "'", str0.equals("EncryptionProperties"));

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.DataReference dataReference2 = new org.apache.xml.security.encryption.DataReference(document0, "yTZ4mVI+6vI=");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.lang.String str1 = canonicalizer20010315OmitComments0.engineGetURI();
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array7 = oAEPParams6.getOAEPParamBytes();
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = canonicalizer20010315OmitComments0.engineCanonicalize(byte_array7);
      org.junit.Assert.fail("Expected exception of type java.io.UTFDataFormatException");
    } catch (java.io.UTFDataFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
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
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    org.w3c.dom.Element element1 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b3 = canonicalizer20010315ExclWithComments0.utilizedOrIncluded(element1, "http://www.w3.org/2000/09/xmldsig#base64");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.NodeList nodeList2 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node1);
    java.util.Set set3 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList2);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput(set3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces5 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, set3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set3);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    org.apache.xml.security.transforms.Transform.register("union", "http://www.w3.org/2000/09/xmldsig#sha1");

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceSubtract(document0, "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_RSAKEYVALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RSAKeyValue"+ "'", str0.equals("RSAKeyValue"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    int i0 = org.apache.xml.security.utils.ElementProxy.MODE_PROCESS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    org.apache.xml.security.utils.Constants.configurationFile = "EncryptedData";

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.Node node2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList3 = org.apache.xml.security.utils.XPathFuncHereAPI.selectNodeList(node0, node1, node2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey7 = x509IssuerSerialResolver3.engineResolveSecretKey(element4, "subtract", storageResolver6);
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate8 = x509IssuerSerialResolver0.engineResolveX509Certificate(element1, "aaaaaaaa aaaa a a", storageResolver6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey7);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("00 01 FF 64 64 00", "http://www.w3.org/2000/09/xmldsig#enveloped-signature");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

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
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException17 = new org.apache.xml.security.signature.ReferenceNotInitializedException("0000: 00 00 00 20                                        ... \n", (java.lang.Exception)algorithmAlreadyRegisteredException9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    int i1 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    java.security.Key key2 = null;
    java.security.Key key3 = null;
    byte[] byte_array5 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array6 = keyWrapImpl_AES256_BC0.engineWrap(key2, key3, byte_array5);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    java.lang.String str1 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key8 = blockEncryptionImpl_TRIPLEDES_BC0.engineUnwrap(byte_array3, key6, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
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

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException1 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("J");

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    java.lang.Object[] obj_array1 = null;
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException2 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00 00 00 03 ", obj_array1);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPath2FilterContainer04._TAG_XPATH2;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "XPath"+ "'", str0.equals("XPath"));

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.Base64.decode(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPath2FilterContainer.XPathFilter2NS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2002/06/xmldsig-filter2"+ "'", str0.equals("http://www.w3.org/2002/06/xmldsig-filter2"));

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._ATT_NONCE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Nonce"+ "'", str0.equals("Nonce"));

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem resolverLocalFilesystem0 = new org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem();
    org.w3c.dom.Attr attr1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = resolverLocalFilesystem0.engineResolve(attr1, "http://www.w3.org/2001/04/xmlenc#kw-aes256");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.apache.xml.security.transforms.implementations.TransformC14N transformC14N0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean b1 = transformC14N0.returnsOctetStream();
    boolean b2 = transformC14N0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.io.Writer writer1 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.store(writer1, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "KeyInfo", 2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_XSLT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/1999/REC-xslt-19991116"+ "'", str0.equals("http://www.w3.org/TR/1999/REC-xslt-19991116"));

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments3 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList4 = null;
    byte[] byte_array5 = canonicalizer20010315WithComments3.engineCanonicalizeXPathNodeSet(nodeList4);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array7 = keyTransportImpl_RSAPKCS15_BC0.engineDecrypt(byte_array5, key6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array4);
    org.apache.xml.security.keys.KeyInfo keyInfo8 = null;
    java.security.Key key9 = null;
    java.security.Key key10 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties11 = null;
    org.apache.xml.security.encryption.ReferenceList referenceList12 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey17 = new org.apache.xml.security.encryption.EncryptedKey(document0, "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams7, keyInfo8, key9, key10, encryptionProperties11, referenceList12, "X509IssuerSerial", "http://www.w3.org/2001/04/xmlenc#Element", "Transforms", "subtract");
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
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException1 = new org.apache.xml.security.c14n.CanonicalizationException("Key");

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_XPOINTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/WD-xptr-20010108"+ "'", str0.equals("http://www.w3.org/TR/2001/WD-xptr-20010108"));

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_RSA_SHA256;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256"));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException1 = new org.apache.xml.security.exceptions.XMLSecurityException("X.509");

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    ant.HexDump.setDebug(false);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetIvLength();
    byte[] byte_array4 = org.apache.xml.security.utils.PRNG.createBytes((int)(short)0);
    java.security.Key key5 = null;
    byte[] byte_array8 = new byte[] { (byte)0, (byte)0 };
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput9 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array8);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array10 = blockEncryptionImpl_AES192_BC0.engineEncrypt(byte_array4, key5, byte_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.io.InputStream inputStream3 = null;
    char[] char_array8 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore0.engineLoad(inputStream3, char_array8);
    // The following exception was thrown during execution in test generation
    try {
    ant.HexDump.setBitDigits(char_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.Exception");
    } catch (java.lang.Exception e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array8);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_ENCRYPTEDKEY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "EncryptedKey"+ "'", str0.equals("EncryptedKey"));

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transforms transforms2 = new org.apache.xml.security.transforms.Transforms(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

    sun.security.x509.X500Name x500Name4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("Date", "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "http://www.w3.org/2002/06/xmldsig-filter2", "11001001400110110401111000410011001401010010400111110411101010411110010");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name4);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("http://www.w3.org/2000/09/xmldsig#enveloped-signature");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    java.io.OutputStream outputStream3 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.save(outputStream3, "00 00 00 03 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

    java.lang.String str2 = org.apache.xml.security.Init.getKeyInfoContentHandler("00000000", "SignedInfo");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    java.lang.String str1 = ant.HexDump.prettyPrintHex("aa  aa a aaaaaaaa aaa    a   aa  aa aaa a aa aa aaaaa aaaaaaa  aaaaaa   aaa a a    aa   a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n"+ "'", str1.equals("0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n"));

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_AUTHENTICATION_XMLSIGNATURE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/"+ "'", str0.equals("http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
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
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    org.apache.xml.security.utils.I18n.init("http://www.w3.org/2001/04/xmlenc#kw-aes128", "No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createElementFromBigint(document0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_C14N_WITHCOMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str0.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

}
