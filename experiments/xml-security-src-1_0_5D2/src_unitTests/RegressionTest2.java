
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test001"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.io.PrintStream printStream2 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.list(printStream2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test002"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException10 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array9);
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException14 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array13);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException15 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array13);
    algorithmAlreadyRegisteredException10.addSuppressed((java.lang.Throwable)invalidCanonicalizerException15);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException17 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array5, (java.lang.Exception)algorithmAlreadyRegisteredException10);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException18 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("CipherValue", (java.lang.Exception)xMLSecurityException17);
    org.apache.xml.security.signature.Reference reference19 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException20 = new org.apache.xml.security.signature.MissingResourceFailureException("00#00#00#00#00#00#00#61#", (java.lang.Exception)invalidKeyResolverException18, reference19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test003"); }

    java.security.Key key0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = org.apache.xml.security.algorithms.JCEMapper.getURIfromKey(key0, "00 01 FF 64 64 00");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test004"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toString((byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "\u0000"+ "'", str1.equals("\u0000"));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test005"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.ProtectionParameter protectionParameter4 = null;
    java.security.KeyStore.Entry entry5 = apacheKeyStore0.engineGetEntry("ds", protectionParameter4);
    java.security.cert.Certificate certificate7 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineSetCertificateEntry("d", certificate7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry5);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test006"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    java.security.Key key2 = null;
    java.security.Key key3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = keyTransportImpl_RSAOAEP_BC0.engineWrap(key2, key3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test007"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("http://www.w3.org/2001/04/xmldsig-more#sha384", "http://www.w3.org/2001/04/xmlenc#sha256");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#sha384"+ "'", str2.equals("http://www.w3.org/2001/04/xmldsig-more#sha384"));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test008"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1";

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test009"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams3 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    java.lang.String str4 = streamParams3.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod5 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(document0, "http://www.w3.org/2000/09/xmldsig#enveloped-signature", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)streamParams3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test010"); }

    byte[] byte_array1 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.toHexString(byte_array1);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    xMLSignatureInput3.setSourceURI("Y");
    boolean b6 = xMLSignatureInput3.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput3.getOctetStream();
    boolean b8 = xMLSignatureInput3.isInitialized();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str2.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test011"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b3 = xMLSignatureInput2.isInitialized();
    xMLSignatureInput2.setSourceURI("                 ");
    java.lang.String str6 = xMLSignatureInput2.getMIMEType();
    byte[] byte_array7 = xMLSignatureInput2.getBytes();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue8 = new org.apache.xml.security.encryption.CipherValue(document0, byte_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test012"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_DOCUMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 256);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test013"); }

    org.apache.xml.security.utils.HelperNodeList helperNodeList0 = new org.apache.xml.security.utils.HelperNodeList();
    org.w3c.dom.Node node1 = null;
    helperNodeList0.appendChild(node1);
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Document document3 = helperNodeList0.getOwnerDocument();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test014"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.lang.String str4 = org.apache.xml.security.utils.Base64.encode(byte_array2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams5 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array2);
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array2, 0, (int)(short)2);
    java.security.Key key9 = null;
    byte[] byte_array11 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array12 = blockEncryptionImpl_AES192_BC0.engineEncrypt(byte_array2, key9, byte_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yTZ4mVI+6vI="+ "'", str4.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "C9:36"+ "'", str8.equals("C9:36"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test015"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(document0, "P");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test016"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.NodeList nodeList2 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node1);
    java.util.Set set3 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList2);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(set3);
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
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test017"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray((long)1024);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test018"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignature xMLSignature2 = new org.apache.xml.security.signature.XMLSignature(element0, "FF#FF#");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test019"); }

    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException4 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array3);
    java.lang.Exception exception5 = null;
    org.w3c.dom.Attr attr6 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException8 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array3, exception5, attr6, "KeyName");
    org.apache.xml.security.signature.Reference reference9 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException10 = new org.apache.xml.security.signature.MissingResourceFailureException("XPathAlternative", obj_array3, reference9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test020"); }

    org.apache.xml.security.transforms.Transform.register("11001001400110110401111000410011001401010010400111110411101010411110010", "0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n");

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test021"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(element0, "KeyValue");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test022"); }

    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP0 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b1 = transformXPathFilterCHGP0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test023"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_PGPDATA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "PGPData"+ "'", str0.equals("PGPData"));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test024"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CarriedKeyName carriedKeyName2 = new org.apache.xml.security.encryption.CarriedKeyName(document0, "hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test025"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    java.security.Key key2 = null;
    java.security.Key key3 = null;
    byte[] byte_array10 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str11 = ant.HexDump.byteArrayToHexString(byte_array10);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array12 = blockEncryptionImpl_AES192_BC0.engineWrap(key2, key3, byte_array10);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "00 01 FF 64 64 00"+ "'", str11.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test026"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean b1 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    org.w3c.dom.Element element2 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set set3 = canonicalizer20010315ExclWithComments0.visiblyUtilized(element2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test027"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.utils.HelperNodeList helperNodeList3 = new org.apache.xml.security.utils.HelperNodeList(false);
    org.w3c.dom.Node node4 = null;
    helperNodeList3.appendChild(node4);
    int i6 = helperNodeList3.getLength();
    java.util.Set set7 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet((org.w3c.dom.NodeList)helperNodeList3);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform8 = new org.apache.xml.security.transforms.Transform(document0, "No message with ID \"CanonicalizationMethod\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (org.w3c.dom.NodeList)helperNodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test028"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b3 = xMLSignatureInput2.isInitialized();
    boolean b4 = xMLSignatureInput2.isOctetStream();
    java.io.InputStream inputStream5 = xMLSignatureInput2.getOctetStream();
    byte[] byte_array6 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream5);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData7 = new org.apache.xml.security.encryption.CipherData(document0, byte_array6);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }



  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test030"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    int i4 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    java.security.Key key5 = null;
    java.security.Key key6 = null;
    byte[] byte_array8 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str9 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array8);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array10 = keyWrapImpl_AES128_BC0.engineWrap(key5, key6, byte_array8);
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
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE"+ "'", str9.equals("32#00#1E#CC#14#20#01#03#15#CE"));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test031"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    int i3 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 4);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test032"); }

    org.apache.xml.security.keys.KeyInfo keyInfo0 = null;
    java.io.PrintStream printStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.KeyUtils.prinoutKeyInfo(keyInfo0, printStream1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test033"); }

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
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException17 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("http://www.w3.org/2001/04/xmlenc#aes192-cbc", obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test034"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.XPATH_C14N_WITH_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "(//. | //@* | //namespace::*)"+ "'", str0.equals("(//. | //@* | //namespace::*)"));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test035"); }

    org.apache.xml.security.utils.resolver.ResourceResolverSpi resourceResolverSpi0 = null;
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver(resourceResolverSpi0);
    org.w3c.dom.Attr attr2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = resourceResolver1.resolve(attr2, "http://www.w3.org/2001/04/xmlenc#kw-aes192");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test036"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXPath.implementedTransformURI;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/1999/REC-xpath-19991116"+ "'", str0.equals("http://www.w3.org/TR/1999/REC-xpath-19991116"));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test037"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference2 = new org.apache.xml.security.encryption.CipherReference(element0, "http://www.w3.org/2001/04/xmlenc#aes256-cbc");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test038"); }

    java.lang.String str1 = ant.HexDump.prettyPrintHex("HMACOutputLength");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 48 4D 41 43 4F 75 74 70   75 74 4C 65 6E 67 74 68  HMACOutputLength\n"+ "'", str1.equals("0000: 48 4D 41 43 4F 75 74 70   75 74 4C 65 6E 67 74 68  HMACOutputLength\n"));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test039"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInEncryptionSpace(element0, "DOCUMENT_TYPE");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test040"); }

    org.w3c.dom.Element element0 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver2 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver2.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element6 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver8 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey9 = retrievalMethodResolver2.engineResolvePublicKey(element6, "HMACOutputLength", storageResolver8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.keyresolver.KeyResolver keyResolver10 = org.apache.xml.security.keys.keyresolver.KeyResolver.getInstance(element0, "Methods", storageResolver8);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey9);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test041"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference3 = new org.apache.xml.security.encryption.CipherReference(document0, "aaaaaaaa aaaaaaaa aaaaaaaa aa  a aa", transforms2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test042"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.getEncryptionSpecNSprefix();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/TR/1999/REC-xslt-19991116"+ "'", str0.equals("http://www.w3.org/TR/1999/REC-xslt-19991116"));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test043"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.Init.readUserConfiguration("No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test044"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.X509Data x509Data2 = new org.apache.xml.security.keys.content.X509Data(element0, "http://www.w3.org/2001/10/xml-exc-c14n#");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test045"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "org/apache/xml/security/resource", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test046"); }

    org.w3c.dom.Node node0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.outputDOM(node0, "CanonicalizationMethod");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test047"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "X509CRL", "aaaaaaaa aaaa a a");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test048"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = keyWrapImpl_TRIPLEDES_BC0.engineWrap(key1, key2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test049"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    org.apache.xml.utils.PrefixResolver prefixResolver2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xpath.objects.XObject xObject3 = org.apache.xml.security.utils.XPathFuncHereAPI.eval(node0, node1, prefixResolver2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test050"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    byte[] byte_array16 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str17 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array16);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array16);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams19 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array16);
    java.lang.String str20 = ant.HexDump.toBinaryString(byte_array16);
    java.lang.String str21 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array16);
    java.lang.String str22 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array16);
    java.security.cert.Certificate[] certificate_array23 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("Encoding", byte_array16, certificate_array23);
    java.security.KeyStore.LoadStoreParameter loadStoreParameter25 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineStore(loadStoreParameter25);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str17.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str20.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str21.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str22.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array23);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test051"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(element0, "Transforms");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test052"); }

    java.lang.String str1 = ant.HexDump.toBinaryString(16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa aaaaaaaa aaaaaaaa aaa aaaa"+ "'", str1.equals("aaaaaaaa aaaaaaaa aaaaaaaa aaa aaaa"));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test053"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((byte)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa"+ "'", str1.equals("aaaaaaaa"));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test054"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.KeyInfo keyInfo2 = new org.apache.xml.security.keys.KeyInfo(element0, "(.//. | .//@* | .//namespace::*)[not(self::comment())]");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test055"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException9 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array6);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException13 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException12);
    org.apache.xml.security.transforms.TransformationException transformationException14 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array6, (java.lang.Exception)xMLSecurityException13);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException15 = new org.apache.xml.security.signature.InvalidDigestValueException("Xalan Java 2.5.1", obj_array6);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException16 = new org.apache.xml.security.exceptions.XMLSecurityException("X509CRL", obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test056"); }

    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException2 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("004004004004004004044004");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException3 = new org.apache.xml.security.exceptions.XMLSecurityException("Type", (java.lang.Exception)invalidCipherTextException2);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test057"); }

    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException1 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("FF#FF#");

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test058"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstance(element0, "Id");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test059"); }

    java.lang.Object[] obj_array2 = new java.lang.Object[] { "Nonce" };
    org.apache.xml.security.transforms.TransformationException transformationException3 = new org.apache.xml.security.transforms.TransformationException("http://www.w3.org/2001/04/xmlenc#kw-aes128", obj_array2);
    boolean b5 = org.apache.xml.security.utils.JavaUtils.instanceOf((java.lang.Object)transformationException3, "Recipient");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test060"); }

    org.apache.xml.security.keys.keyresolver.KeyResolver.register("URI");

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test061"); }

    org.apache.xml.security.utils.PRNG pRNG0 = org.apache.xml.security.utils.PRNG.getInstance();
    int i1 = pRNG0.nextInt();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1355390783);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test062"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException9 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array6);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException10 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array6);
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException14 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array13);
    java.lang.Object[] obj_array17 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException18 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array17);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException19 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array17);
    algorithmAlreadyRegisteredException14.addSuppressed((java.lang.Throwable)invalidCanonicalizerException19);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException21 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("ds", (java.lang.Exception)algorithmAlreadyRegisteredException14);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException22 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("X.509", obj_array6, (java.lang.Exception)algorithmAlreadyRegisteredException14);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException23 = new org.apache.xml.security.signature.ReferenceNotInitializedException("DigestMethod", (java.lang.Exception)algorithmAlreadyRegisteredException14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test063"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(element0, "No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test064"); }

    org.apache.xml.security.algorithms.SignatureAlgorithm.register("EncryptedData", "Exponent");

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test065"); }

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
    org.apache.xml.security.keys.storage.StorageResolver storageResolver21 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.util.Iterator iterator22 = storageResolver21.getIterator();
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey23 = x509CertificateResolver0.engineResolvePublicKey(element19, "http://www.w3.org/2001/04/xmlenc#kw-aes256", storageResolver21);
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
    org.junit.Assert.assertNotNull(iterator22);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test066"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData2 = new org.apache.xml.security.encryption.EncryptedData(element0, "KeyValue");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test067"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array8 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str9 = ant.HexDump.byteArrayToHexString(byte_array8);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams10 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("", byte_array8);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData11 = new org.apache.xml.security.encryption.CipherData(document0, byte_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "00 01 FF 64 64 00"+ "'", str9.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test068"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform2 = org.apache.xml.security.transforms.Transform.getInstance(document0, "Key");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test069"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    java.lang.Object obj7 = apacheXMLProvider4.get((java.lang.Object)10.0d);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test070"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException15 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException14);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException16 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array6, (java.lang.Exception)invalidCanonicalizerException14);
    java.lang.String str17 = org.apache.xml.security.utils.I18n.translate("CarriedKeyName", obj_array6);
    java.lang.String str18 = org.apache.xml.security.utils.I18n.translate("Transforms", obj_array6);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException19 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/2001/04/xmldsig-more#rsa-md5", obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str17.equals("No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str18.equals("No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test071"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsAbsolute("http://www.w3.org/2001/04/xmlenc#aes256-cbc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test072"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_DIGESTVALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "DigestValue"+ "'", str0.equals("DigestValue"));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test073"); }

    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP0 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b1 = transformXPathFilterCHGP0.wantsOctetStream();
    boolean b2 = transformXPathFilterCHGP0.returnsNodeSet();
    boolean b3 = transformXPathFilterCHGP0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test074"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    int i1 = blockEncryptionImpl_AES192_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 16);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test075"); }

    java.lang.Exception exception0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException1 = new org.apache.xml.security.exceptions.XMLSecurityException(exception0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test076"); }

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
    java.lang.Object[] obj_array24 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException25 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array24);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException26 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array24);
    java.lang.Object[] obj_array28 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException29 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array28);
    java.lang.Object[] obj_array32 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException33 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array32);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException34 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array32);
    algorithmAlreadyRegisteredException29.addSuppressed((java.lang.Throwable)invalidCanonicalizerException34);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException36 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array24, (java.lang.Exception)algorithmAlreadyRegisteredException29);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException37 = new org.apache.xml.security.c14n.CanonicalizationException("Seed", (java.lang.Exception)xMLSecurityException36);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException38 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", obj_array6, (java.lang.Exception)canonicalizationException37);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException39 = new org.apache.xml.security.c14n.CanonicalizationException("3240041E4CC4144204014034154CE4", (java.lang.Exception)xMLSecurityException38);
    java.lang.Object[] obj_array41 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException42 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array41);
    java.lang.Object[] obj_array45 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException46 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array45);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException47 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array45);
    algorithmAlreadyRegisteredException42.addSuppressed((java.lang.Throwable)invalidCanonicalizerException47);
    canonicalizationException39.addSuppressed((java.lang.Throwable)algorithmAlreadyRegisteredException42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test077"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test078"); }

    org.apache.xml.security.utils.X509CertificateValidator x509CertificateValidator0 = new org.apache.xml.security.utils.X509CertificateValidator();

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test079"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.DataReference dataReference2 = new org.apache.xml.security.encryption.DataReference(element0, "EncryptionMethod");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test080"); }

    java.lang.String str1 = ant.HexDump.toHexString((short)3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00 03 "+ "'", str1.equals("00 03 "));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test081"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference2 = new org.apache.xml.security.encryption.CipherReference(element0, "004004004004004004044004");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test082"); }

    int i0 = org.apache.xml.security.utils.ElementProxy.MODE_SIGN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test083"); }

    java.lang.String str1 = ant.HexDump.toHexString((short)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00 64 "+ "'", str1.equals("00 64 "));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test084"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException10 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array7);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException11 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array7);
    java.lang.Object[] obj_array16 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException17 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array16);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException18 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array16);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException19 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array16);
    org.apache.xml.security.signature.Reference reference20 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException21 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array16, reference20);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException22 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array7, (java.lang.Exception)missingResourceFailureException21);
    java.lang.Object[] obj_array28 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException29 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array28);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException30 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array28);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException31 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array28);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException32 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array28);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException33 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array28);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException34 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array7, (java.lang.Exception)storageResolverException33);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException35 = new org.apache.xml.security.signature.InvalidSignatureValueException("subtract", (java.lang.Exception)invalidDigestValueException34);
    java.lang.Exception exception36 = invalidDigestValueException34.getOriginalException();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(exception36);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test085"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.DataReference dataReference2 = new org.apache.xml.security.encryption.DataReference(document0, "http://www.w3.org/TR/1999/REC-xpath-19991116");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test086"); }

    java.lang.String str1 = ant.HexDump.toHexString((byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FF "+ "'", str1.equals("FF "));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test087"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm3 = new org.apache.xml.security.algorithms.SignatureAlgorithm(document0, "DataReference", 5);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test088"); }

    java.util.Set set1 = org.apache.xml.security.transforms.params.InclusiveNamespaces.prefixStr2Set("a  aa aa");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set1);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test089"); }

    java.lang.String str1 = ant.HexDump.stringToHexString("PGPKeyPacket");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "50 47 50 4B 65 79 50 61 63 6B 65 74 "+ "'", str1.equals("50 47 50 4B 65 79 50 61 63 6B 65 74 "));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test090"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    java.security.Key key2 = null;
    java.security.Key key3 = null;
    byte[] byte_array5 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.toHexString(byte_array5);
    java.lang.String str7 = ant.HexDump.toBinaryString(byte_array5);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = keyWrapImpl_TRIPLEDES_BC0.engineWrap(key2, key3, byte_array5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str6.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "aa  aa a aaaaaaaa aaa    a   aa  aa aaa a aa aa aaaaa aaaaaaa  aaaaaa   aaa a a    aa   a"+ "'", str7.equals("aa  aa a aaaaaaaa aaa    a   aa  aa aaa a aa aa aaaaa aaaaaaa  aaaaaa   aaa a a    aa   a"));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test091"); }

    java.lang.String str1 = ant.HexDump.toHexString((short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00 64 "+ "'", str1.equals("00 64 "));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test092"); }

    java.lang.String str1 = ant.HexDump.toHexString((long)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00 00 00 00 00 00 00 64 "+ "'", str1.equals("00 00 00 00 00 00 00 64 "));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test093"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.Init.readUserConfiguration(inputStream7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test094"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException7 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array4);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException8 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException();
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException9 = new org.apache.xml.security.keys.storage.StorageResolverException("FF 64 64 64 0A 00", obj_array4, (java.lang.Exception)invalidCipherTextException8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test095"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array4);
    java.security.Key key7 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = blockEncryptionImpl_TRIPLEDES_BC0.engineDecrypt(byte_array4, key7);
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
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test096"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    byte[] byte_array16 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str17 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array16);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array16);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams19 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array16);
    java.lang.String str20 = ant.HexDump.toBinaryString(byte_array16);
    java.lang.String str21 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array16);
    java.lang.String str22 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array16);
    java.security.cert.Certificate[] certificate_array23 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("Encoding", byte_array16, certificate_array23);
    boolean b26 = apacheKeyStore0.engineIsKeyEntry("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str17.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str20.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str21.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str22.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test097"); }

    org.w3c.dom.Element element0 = null;
    byte[] byte_array1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.encryption.EncryptedData.replace(element0, byte_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test098"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((long)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test099"); }

    java.security.cert.X509Certificate x509Certificate0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.X509CertificateValidator.validate(x509Certificate0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test100"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperty signatureProperty2 = new org.apache.xml.security.signature.SignatureProperty(document0, "PgenCounter");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test101"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.ALGO_ID_DIGEST_SHA512;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#sha512"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#sha512"));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test102"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String str1 = keyWrapImpl_AES192_BC0.getRequiredProviderName();
    int i2 = keyWrapImpl_AES192_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test103"); }

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
    org.apache.xml.security.encryption.EncryptedKey encryptedKey16 = new org.apache.xml.security.encryption.EncryptedKey(document0, "EncryptionProperties", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6, keyInfo7, key8, key9, encryptionProperties10, referenceList11, "J", "\n", "Encoding", "http://www.w3.org/2000/09/xmldsig#");
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
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test104"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    org.w3c.dom.Document document1 = null;
    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams3 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    java.lang.String str4 = streamParams3.getAlgorithmURI();
    java.lang.String str5 = streamParams3.getAlgorithmURI();
    java.lang.String str6 = streamParams3.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams7 = keyWrapImpl_TRIPLEDES_BC0.engineInit(document1, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)streamParams3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test105"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array10);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException13 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException12);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException14 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array4, (java.lang.Exception)invalidCanonicalizerException12);
    java.lang.Object[] obj_array23 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException24 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array23);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException25 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array23);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException32 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException31);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException33 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array23, (java.lang.Exception)invalidCanonicalizerException31);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException35 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException36 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2000/09/xmldsig#X509Data", obj_array23, (java.lang.Exception)referenceNotInitializedException35);
    java.lang.Object[] obj_array41 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException42 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array41);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException43 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array41);
    java.lang.Object[] obj_array45 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException46 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array45);
    java.lang.Object[] obj_array49 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException50 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array49);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException51 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array49);
    algorithmAlreadyRegisteredException46.addSuppressed((java.lang.Throwable)invalidCanonicalizerException51);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException53 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array41, (java.lang.Exception)algorithmAlreadyRegisteredException46);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException54 = new org.apache.xml.security.c14n.CanonicalizationException("Seed", (java.lang.Exception)xMLSecurityException53);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException55 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", obj_array23, (java.lang.Exception)canonicalizationException54);
    java.lang.String str56 = org.apache.xml.security.utils.I18n.getExceptionMessage("HMACOutputLength", obj_array23);
    java.lang.Object[] obj_array63 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException64 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array63);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException65 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array63);
    java.lang.Object[] obj_array69 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException70 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array69);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException71 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array69);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException72 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException71);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException73 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array63, (java.lang.Exception)invalidCanonicalizerException71);
    java.lang.String str74 = org.apache.xml.security.utils.I18n.translate("CarriedKeyName", obj_array63);
    java.lang.String str75 = org.apache.xml.security.utils.I18n.translate("Transforms", obj_array63);
    java.lang.Object[] obj_array78 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException79 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array78);
    java.lang.Exception exception80 = null;
    org.w3c.dom.Attr attr81 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException83 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array78, exception80, attr81, "KeyName");
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException84 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", obj_array63, (java.lang.Exception)resourceResolverException83);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException85 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("(.//. | .//@* | .//namespace::*)[not(self::comment())]", obj_array23, (java.lang.Exception)resourceResolverException83);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException86 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/TR/1999/REC-xslt-19991116", obj_array23);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException87 = new org.apache.xml.security.transforms.InvalidTransformException("X509Data", obj_array4, (java.lang.Exception)keyResolverException86);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str56 + "' != '" + "No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str56.equals("No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array69);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str74 + "' != '" + "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str74.equals("No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str75 + "' != '" + "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str75.equals("No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array78);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test106"); }

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
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver18 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element19 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver21 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element22 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver24 = null;
    java.security.PublicKey publicKey25 = retrievalMethodResolver21.engineResolvePublicKey(element22, "subtract", storageResolver24);
    org.w3c.dom.Element element26 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver28 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element29 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver31 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey32 = x509IssuerSerialResolver28.engineResolveSecretKey(element29, "subtract", storageResolver31);
    java.security.cert.X509Certificate x509Certificate33 = retrievalMethodResolver21.engineResolveX509Certificate(element26, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver31);
    javax.crypto.SecretKey secretKey34 = rSAKeyValueResolver18.engineResolveSecretKey(element19, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver31);
    org.w3c.dom.Element element35 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver37 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element38 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver40 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element41 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver43 = null;
    java.security.PublicKey publicKey44 = retrievalMethodResolver40.engineResolvePublicKey(element41, "subtract", storageResolver43);
    org.w3c.dom.Element element45 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver47 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element48 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver50 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey51 = x509IssuerSerialResolver47.engineResolveSecretKey(element48, "subtract", storageResolver50);
    java.security.cert.X509Certificate x509Certificate52 = retrievalMethodResolver40.engineResolveX509Certificate(element45, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver50);
    java.security.cert.X509Certificate x509Certificate53 = null;
    storageResolver50.add(x509Certificate53);
    javax.crypto.SecretKey secretKey55 = x509CertificateResolver37.engineResolveSecretKey(element38, "00 01 FF 64 64 00", storageResolver50);
    javax.crypto.SecretKey secretKey56 = rSAKeyValueResolver18.engineResolveSecretKey(element35, "http://www.w3.org/2001/04/xmlenc#Element", storageResolver50);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey57 = x509IssuerSerialResolver0.engineResolvePublicKey(element16, "KeyValue", storageResolver50);
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
    org.junit.Assert.assertNull(publicKey25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey55);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey56);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test107"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    int i3 = keyTransportImpl_RSAPKCS15_BC0.engineGetBlockSize();
    byte[] byte_array6 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array6);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array6);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams9 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array6);
    java.lang.String str10 = ant.HexDump.toBinaryString(byte_array6);
    java.lang.String str11 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array6);
    java.security.Key key12 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore13 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream14 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore15 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter16 = null;
    apacheKeyStore15.engineLoad(loadStoreParameter16);
    java.io.InputStream inputStream18 = null;
    char[] char_array23 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore15.engineLoad(inputStream18, char_array23);
    apacheKeyStore13.engineLoad(inputStream14, char_array23);
    byte[] byte_array26 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(char_array23);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array27 = keyTransportImpl_RSAPKCS15_BC0.engineEncrypt(byte_array6, key12, byte_array26);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str7.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str10.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str11.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array26);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test108"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array4 = org.apache.xml.security.utils.PRNG.createBytes(64);
    java.security.Key key5 = null;
    byte[] byte_array12 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput14 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array12);
    java.lang.String str15 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array12);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array16 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array4, key5, byte_array12);
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
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "FF 64 64 64 0A 00"+ "'", str13.equals("FF 64 64 64 0A 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "0000: FF 64 64 64 0A 00                                  .ddd..\n"+ "'", str15.equals("0000: FF 64 64 64 0A 00                                  .ddd..\n"));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test109"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceIntersect(document0, "intersect");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test110"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger1 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.RSAKeyValue rSAKeyValue3 = new org.apache.xml.security.keys.content.keyvalues.RSAKeyValue(document0, bigInteger1, bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test111"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverFragment resolverFragment0 = new org.apache.xml.security.utils.resolver.implementations.ResolverFragment();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverFragment0);
    org.w3c.dom.Attr attr2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = resolverFragment0.engineResolve(attr2, "SignatureMethod");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test112"); }

    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException1 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("(//. | //@* | //namespace::*)");

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test113"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform2 = org.apache.xml.security.transforms.Transform.getInstance(document0, "CipherReference");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test114"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    byte[] byte_array4 = org.apache.xml.security.utils.HexDump.toByteArray(8);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = blockEncryptionImpl_AES192_BC0.engineWrap(key1, key2, byte_array4);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test115"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP1 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b2 = transformXPathFilterCHGP1.wantsOctetStream();
    boolean b3 = transformXPathFilterCHGP1.returnsNodeSet();
    boolean b4 = apacheXMLProvider0.containsKey((java.lang.Object)b3);
    boolean b6 = apacheXMLProvider0.containsValue((java.lang.Object)"X509IssuerSerial");
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput8 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b9 = xMLSignatureInput8.isInitialized();
    boolean b10 = xMLSignatureInput8.isOctetStream();
    java.io.InputStream inputStream11 = xMLSignatureInput8.getOctetStream();
    byte[] byte_array12 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream11);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput13 = new org.apache.xml.security.signature.XMLSignatureInput(inputStream11);
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.loadFromXML(inputStream11);
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
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test116"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    xMLSignatureInput1.setSourceURI("                 ");
    java.lang.String str5 = xMLSignatureInput1.getMIMEType();
    byte[] byte_array6 = xMLSignatureInput1.getBytes();
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.toString(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter"+ "'", str7.equals("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter"));

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test117"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509Certificate xMLX509Certificate2 = new org.apache.xml.security.keys.content.x509.XMLX509Certificate(element0, "No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test118"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperties signatureProperties2 = new org.apache.xml.security.signature.SignatureProperties(element0, "http://www.w3.org/2001/10/xml-exc-c14n#");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test119"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusive transformC14NExclusive0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean b1 = transformC14NExclusive0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test120"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "BlockEncryption";

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test121"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList1 = null;
    byte[] byte_array2 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(nodeList1);
    java.lang.String str3 = canonicalizer20010315WithComments0.engineGetURI();
    org.w3c.dom.Node node4 = null;
    org.w3c.dom.NodeList nodeList5 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node4);
    java.util.Set set6 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList5);
    java.util.Set set7 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList5);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(set7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test122"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(element0, "XPathAlternative");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test123"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.circumventBug2650(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test124"); }

    org.w3c.dom.Attr attr0 = null;
    java.util.Vector vector2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver3 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "SignatureMethod", vector2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test125"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.transforms.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.RetrievalMethod retrievalMethod4 = new org.apache.xml.security.keys.content.RetrievalMethod(document0, "(//. | //@* | //namespace::*)", transforms2, "2.5.29.14");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test126"); }

    int i2 = org.apache.xml.security.encryption.EncryptedData.min(0, (int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test127"); }

    int i0 = org.w3c.dom.traversal.NodeFilter.SHOW_ELEMENT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test128"); }

    org.apache.xml.security.c14n.helper.AlwaysAcceptNodeFilter alwaysAcceptNodeFilter0 = new org.apache.xml.security.c14n.helper.AlwaysAcceptNodeFilter();
    org.w3c.dom.Node node1 = null;
    short s2 = alwaysAcceptNodeFilter0.acceptNode(node1);
    org.w3c.dom.Node node3 = null;
    short s4 = alwaysAcceptNodeFilter0.acceptNode(node3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s2 == (short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s4 == (short)1);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test129"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(document0, "Xerces-J 2.0.0");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test130"); }

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
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException36 = new org.apache.xml.security.signature.InvalidSignatureValueException("subtract", (java.lang.Exception)invalidDigestValueException35);
    java.lang.String str37 = org.apache.xml.security.utils.I18n.getExceptionMessage("X509IssuerName", (java.lang.Exception)invalidSignatureValueException36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str37 + "' != '" + "No message with ID \"X509IssuerName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidSignatureValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str37.equals("No message with ID \"X509IssuerName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidSignatureValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test131"); }

    java.lang.String str0 = org.apache.xml.security.signature.XMLSignature.ALGO_ID_SIGNATURE_RSA_RIPEMD160;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160"));

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test132"); }

    org.apache.xml.security.transforms.implementations.TransformC14N transformC14N0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean b1 = transformC14N0.returnsOctetStream();
    boolean b2 = transformC14N0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test133"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_XPATHFILTERCHGP;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter"+ "'", str0.equals("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test134"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(element0, "http://www.w3.org/2001/04/xmldsig-more#sha384");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test135"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException10 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array7);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException11 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("DigestMethod", obj_array7);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException13 = new org.apache.xml.security.signature.XMLSignatureException("JCAType", obj_array7);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException15 = new org.apache.xml.security.signature.InvalidSignatureValueException();
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException16 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/2000/09/xmldsig#MgmtData", (java.lang.Exception)invalidSignatureValueException15);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException17 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("http://www.w3.org/2000/09/xmldsig#hmac-sha1", obj_array7, (java.lang.Exception)invalidSignatureValueException15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test136"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm2 = new org.apache.xml.security.algorithms.SignatureAlgorithm(document0, "");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test137"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaa "+ "'", str1.equals("aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaa "));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test138"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_RETRIEVALMETHOD;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "RetrievalMethod"+ "'", str0.equals("RetrievalMethod"));

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test139"); }

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
    org.apache.xml.security.signature.Reference reference18 = null;
    missingResourceFailureException17.setReference(reference18);
    org.apache.xml.security.signature.Reference reference20 = missingResourceFailureException17.getReference();
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException21 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("xslt", (java.lang.Exception)missingResourceFailureException17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reference20);

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test140"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.Base64.encode(byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array3);
    byte[] byte_array7 = oAEPParams6.getOAEPParamBytes();
    java.lang.String str8 = oAEPParams6.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod9 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(document0, "KeyTransport", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6);
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
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test141"); }

    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    java.lang.String str3 = org.apache.xml.security.utils.Base64.encode(byte_array1);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams4 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array1);
    org.w3c.dom.Document document5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.DocumentFragment documentFragment6 = oAEPParams4.createChildNodes(document5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test142"); }

    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP0 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b1 = transformXPathFilterCHGP0.wantsOctetStream();
    boolean b2 = transformXPathFilterCHGP0.returnsNodeSet();
    boolean b3 = transformXPathFilterCHGP0.wantsOctetStream();
    boolean b4 = transformXPathFilterCHGP0.wantsNodeSet();
    boolean b5 = transformXPathFilterCHGP0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test143"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    java.lang.String str3 = xMLSignatureInput1.getSourceURI();
    java.lang.String str4 = xMLSignatureInput1.getMIMEType();
    byte[] byte_array5 = xMLSignatureInput1.getBytes();
    java.lang.String str6 = xMLSignatureInput1.getMIMEType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test144"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaa ", "http://www.w3.org/2000/09/xmldsig#DSAKeyValue");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test145"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.toHexString(byte_array2);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array2);
    byte[] byte_array11 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str12 = ant.HexDump.byteArrayToHexString(byte_array11);
    boolean b13 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array2, byte_array11);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue14 = new org.apache.xml.security.encryption.CipherValue(document0, byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str3.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00 01 FF 64 64 00"+ "'", str12.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test146"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_ENVELOPED_SIGNATURE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/09/xmldsig#enveloped-signature"+ "'", str0.equals("http://www.w3.org/2000/09/xmldsig#enveloped-signature"));

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test147"); }

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
    byte[] byte_array17 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array18 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array17, certificate_array18);
    java.security.KeyStore.Entry entry21 = null;
    java.security.KeyStore.ProtectionParameter protectionParameter22 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineSetEntry("http://www.w3.org/2001/04/xmldsig-more#rsa-md5", entry21, protectionParameter22);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array18);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test148"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter04 transformXPath2Filter040 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter04();
    boolean b1 = transformXPath2Filter040.wantsOctetStream();
    boolean b2 = transformXPath2Filter040.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test149"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test150"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.MessageDigestAlgorithm messageDigestAlgorithm2 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.getInstance(document0, "URI");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test151"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException9 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array6);
    org.apache.xml.security.signature.Reference reference10 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException11 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array6, reference10);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("BlockEncryption", obj_array6);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException14 = new org.apache.xml.security.signature.InvalidSignatureValueException("Algorithm");
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException15 = new org.apache.xml.security.c14n.CanonicalizationException("No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array6, (java.lang.Exception)invalidSignatureValueException14);
    java.lang.String str16 = canonicalizationException15.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.signature.InvalidSignatureValueException: No message with ID \"Algorithm\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str16.equals("org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.signature.InvalidSignatureValueException: No message with ID \"Algorithm\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test152"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array4 = new byte[] { (byte)100, (byte)1, (byte)0 };
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509Certificate xMLX509Certificate5 = new org.apache.xml.security.keys.content.x509.XMLX509Certificate(document0, byte_array4);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test153"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Node node2 = null;
    org.w3c.dom.NodeList nodeList3 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform4 = org.apache.xml.security.transforms.Transform.getInstance(document0, "http://www.isi.edu/in-notes/iana/assignments/media-types/", nodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList3);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test154"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "Alias", "Algorithm");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test155"); }

    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath0 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    boolean b1 = transformXPath0.wantsNodeSet();
    boolean b2 = transformXPath0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test156"); }

    org.w3c.dom.Attr attr0 = null;
    org.apache.xml.security.c14n.helper.C14nHelper.assertNotRelativeNS(attr0);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test157"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test158"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.CertificateElement certificateElement2 = new org.apache.xml.security.keys.provider.CertificateElement(element0, "XPathAlternative");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test159"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "", "http://www.w3.org/2000/09/xmldsig#PGPData");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test160"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    java.lang.String str3 = org.apache.xml.security.utils.Base64.encode(byte_array1);
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(byte_array1);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL5 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(document0, byte_array1);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str2.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yTZ4mVI+6vI="+ "'", str3.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"+ "'", str4.equals("aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test161"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.Node node1 = null;
    org.w3c.dom.Node node2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Node node3 = org.apache.xml.security.utils.XPathFuncHereAPI.selectSingleNode(node0, node1, node2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test162"); }

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
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException22 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("Recipient", (java.lang.Exception)invalidTransformException21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test163"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Element element2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform3 = org.apache.xml.security.transforms.Transform.getInstance(document0, "32#2E#35#2E#32#39#2E#31#34#", element2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test164"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.RSAKeyValue rSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.RSAKeyValue(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test165"); }

    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("64 01 0A FF 01 ");

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test166"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver3.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element7 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver9 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey10 = retrievalMethodResolver3.engineResolvePublicKey(element7, "HMACOutputLength", storageResolver9);
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver13 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver16 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey17 = x509IssuerSerialResolver13.engineResolveSecretKey(element14, "subtract", storageResolver16);
    org.w3c.dom.Element element18 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver20 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver20.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element24 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver26 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey27 = retrievalMethodResolver20.engineResolvePublicKey(element24, "HMACOutputLength", storageResolver26);
    javax.crypto.SecretKey secretKey28 = x509IssuerSerialResolver13.engineResolveSecretKey(element18, "", storageResolver26);
    java.security.PublicKey publicKey29 = retrievalMethodResolver3.engineResolvePublicKey(element11, "http://www.w3.org/TR/2001/WD-xptr-20010108", storageResolver26);
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate30 = x509IssuerSerialResolver0.engineResolveX509Certificate(element1, "org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.signature.InvalidSignatureValueException: No message with ID \"Algorithm\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", storageResolver26);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey29);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test167"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.ReferenceList referenceList2 = new org.apache.xml.security.encryption.ReferenceList(element0, "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test168"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = org.apache.xml.security.utils.resolver.ResourceResolver.resolveStatic(attr0, "68 74 74 70 3A 2F 2F 77 77 77 2E 77 33 2E 6F 72 67 2F 32 30 30 30 2F 30 39 2F 78 6D 6C 64 73 69 67 23 58 35 30 39 44 61 74 61 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test169"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI2 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(element0, "00 64 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test170"); }

    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP0 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b1 = transformXPathFilterCHGP0.wantsOctetStream();
    boolean b2 = transformXPathFilterCHGP0.returnsNodeSet();
    boolean b3 = transformXPathFilterCHGP0.wantsOctetStream();
    boolean b4 = transformXPathFilterCHGP0.wantsOctetStream();
    boolean b5 = transformXPathFilterCHGP0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test171"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey7 = x509IssuerSerialResolver3.engineResolveSecretKey(element4, "subtract", storageResolver6);
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver10.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver16 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey17 = retrievalMethodResolver10.engineResolvePublicKey(element14, "HMACOutputLength", storageResolver16);
    javax.crypto.SecretKey secretKey18 = x509IssuerSerialResolver3.engineResolveSecretKey(element8, "", storageResolver16);
    javax.crypto.SecretKey secretKey19 = x509IssuerSerialResolver0.engineResolveSecretKey(element1, "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", storageResolver16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey19);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test172"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.ProtectionParameter protectionParameter4 = null;
    java.security.KeyStore.Entry entry5 = apacheKeyStore0.engineGetEntry("ds", protectionParameter4);
    byte[] byte_array8 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str9 = org.apache.xml.security.utils.HexDump.toHexString(byte_array8);
    java.security.cert.Certificate[] certificate_array10 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("", byte_array8, certificate_array10);
    java.security.KeyStore.LoadStoreParameter loadStoreParameter12 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineStore(loadStoreParameter12);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str9.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array10);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test173"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants.ALGO_ID_KEYWRAP_TRIPLEDES;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-tripledes"+ "'", str0.equals("http://www.w3.org/2001/04/xmlenc#kw-tripledes"));

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test174"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.prettyPrintHex("FF#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 46 46 23                                           FF#\n"+ "'", str1.equals("0000: 46 46 23                                           FF#\n"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test175"); }

    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException1 = new org.apache.xml.security.c14n.CanonicalizationException("PGPData");

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test176"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceSubtract(document0, "KeyValue");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test177"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList1 = null;
    byte[] byte_array2 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(nodeList1);
    java.lang.String str3 = canonicalizer20010315WithComments0.engineGetURI();
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
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test178"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SubjectName xMLX509SubjectName2 = new org.apache.xml.security.keys.content.x509.XMLX509SubjectName(document0, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test179"); }

    byte[] byte_array1 = org.apache.xml.security.utils.PRNG.createBytes((int)(byte)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test180"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP1 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    resolverDirectHTTP1.engineSetProperty("", "Modulus");
    java.lang.String[] str_array5 = resolverDirectHTTP1.engineGetPropertyKeys();
    java.lang.String[] str_array6 = resolverDirectHTTP1.engineGetPropertyKeys();
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("http://www.w3.org/2000/09/xmldsig#base64", (java.lang.Object[])str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test181"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str4 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str5 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str4.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str5.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test182"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference2 = new org.apache.xml.security.encryption.CipherReference(document0, "aa  aa a aaaaaaaa aaa    a   aa  aa aaa a aa aa aaaaa aaaaaaa  aaaaaa   aaa a a    aa   a");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test183"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"+ "'", str1.equals("aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test184"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceIntersect(document0, "0000: 00 00 00 20                                        ... \n");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test185"); }

    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("\uFFFD", "http://www.w3.org/2002/06/xmldsig-filter2", "http://www.w3.org/2002/04/xmldsig-filter2");

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test186"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath6 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj7 = apacheXMLProvider4.remove((java.lang.Object)transformXPath6);
    boolean b8 = transformXPath6.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test187"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString((short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa#aaaaaaaa"+ "'", str1.equals("aaaaaaaa#aaaaaaaa"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test188"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Enumeration<java.lang.Object> enumeration_obj1 = apacheXMLProvider0.elements();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj1);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test189"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    java.lang.String str1 = blockEncryptionImpl_TRIPLEDES_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    byte[] byte_array4 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array4);
    java.lang.String str6 = org.apache.xml.security.utils.Base64.encode(byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams7 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array4);
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array4, 0, (int)(short)2);
    java.security.Key key11 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array12 = blockEncryptionImpl_TRIPLEDES_BC0.engineEncrypt(byte_array4, key11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#tripledes-cbc"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#tripledes-cbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str5.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "yTZ4mVI+6vI="+ "'", str6.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "C9:36"+ "'", str10.equals("C9:36"));

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test190"); }

    java.lang.String str1 = ant.HexDump.toHexString((byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "64 "+ "'", str1.equals("64 "));

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test191"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_RAWX509CERTIFICATE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "rawX509Certificate"+ "'", str0.equals("rawX509Certificate"));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test192"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((long)512);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test193"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    java.lang.String[] str_array2 = resolverDirectHTTP0.engineGetPropertyKeys();
    java.lang.String[] str_array3 = resolverDirectHTTP0.engineGetPropertyKeys();
    org.w3c.dom.Attr attr4 = null;
    boolean b6 = resolverDirectHTTP0.engineCanResolve(attr4, "RSAKeyValue");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test194"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = resourceResolver1.understandsProperty("");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider8 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.lang.String str10 = apacheXMLProvider8.getProperty("http://www.w3.org/XML/1998/namespace");
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider8);
    java.lang.String str12 = apacheXMLProvider8.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "ApacheXML"+ "'", str12.equals("ApacheXML"));

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test195"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException8 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array5);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException9 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("00 00 00 00 00 00 00 64 ", obj_array5);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException10 = new org.apache.xml.security.signature.InvalidSignatureValueException("64 01 0A FF 01 ", obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test196"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    java.util.Collection<java.lang.Object> collection_obj9 = apacheXMLProvider0.values();
    java.lang.Object obj11 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj12 = apacheXMLProvider0.put((java.lang.Object)"ks", obj11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj9);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test197"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "00#00#00#00#00#00#00#01#", "http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test198"); }

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
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException34 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("(.//. | .//@* | .//namespace::*)", (java.lang.Exception)xMLSecurityException31);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException35 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("SymmetricKeyWrap", (java.lang.Exception)algorithmAlreadyRegisteredException34);
    
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
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test199"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer resolverXPointer0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    org.w3c.dom.Attr attr1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = resolverXPointer0.engineResolve(attr1, "X509Data");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test200"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(document0, "Transforms");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test201"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusive transformC14NExclusive0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean b1 = transformC14NExclusive0.returnsNodeSet();
    boolean b2 = transformC14NExclusive0.returnsNodeSet();
    boolean b3 = transformC14NExclusive0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test202"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.ProtectionParameter protectionParameter4 = null;
    java.security.KeyStore.Entry entry5 = apacheKeyStore0.engineGetEntry("ds", protectionParameter4);
    java.security.cert.Certificate[] certificate_array7 = apacheKeyStore0.engineGetCertificateChain("KeyName");
    java.security.cert.Certificate certificate8 = null;
    java.lang.String str9 = apacheKeyStore0.engineGetCertificateAlias(certificate8);
    java.security.KeyStore.Entry entry11 = null;
    java.security.KeyStore.ProtectionParameter protectionParameter12 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineSetEntry("http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/", entry11, protectionParameter12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test203"); }

    java.lang.String str1 = org.apache.xml.security.utils.I18n.translate("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test204"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod2 = new org.apache.xml.security.algorithms.encryption.EncryptionMethod(document0, "00 64 ");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test205"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("SymmetricKeyWrap", "Exponent");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "SymmetricKeyWrap"+ "'", str2.equals("SymmetricKeyWrap"));

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test206"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    java.util.Collection<java.lang.Object> collection_obj9 = apacheXMLProvider0.values();
    java.util.Set<java.lang.Object> set_obj10 = apacheXMLProvider0.keySet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj10);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test207"); }

    org.w3c.dom.Document document0 = null;
    java.security.cert.Certificate certificate2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.CertificateElement certificateElement3 = new org.apache.xml.security.keys.provider.CertificateElement(document0, "subtract", certificate2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test208"); }

    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException1 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("X.509");

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test209"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.io.InputStream inputStream3 = null;
    char[] char_array8 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore0.engineLoad(inputStream3, char_array8);
    boolean b11 = apacheKeyStore0.engineContainsAlias("SignatureProperty");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test210"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.DSAKeyValue dSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.DSAKeyValue(element0, "Xalan Java 2.5.1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test211"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.stringToHexString("http://www.w3.org/2001/04/xmlenc#Content");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "68#74#74#70#3A#2F#2F#77#77#77#2E#77#33#2E#6F#72#67#2F#32#30#30#31#2F#30#34#2F#78#6D#6C#65#6E#63#23#43#6F#6E#74#65#6E#74#"+ "'", str1.equals("68#74#74#70#3A#2F#2F#77#77#77#2E#77#33#2E#6F#72#67#2F#32#30#30#31#2F#30#34#2F#78#6D#6C#65#6E#63#23#43#6F#6E#74#65#6E#74#"));

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test212"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    int i4 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    org.w3c.dom.Element element5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams6 = keyWrapImpl_AES128_BC0.engineInit(element5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
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

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test213"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(document0, "http://www.w3.org/2002/06/xmldsig-filter2");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test214"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "X509SubjectName");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test215"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "http://www.w3.org/2000/09/xmldsig#Manifest");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test216"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInSignatureSpace(element0, "JCAType");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.signature.XMLSignatureException");
    } catch (org.apache.xml.security.signature.XMLSignatureException e) {
      // Expected exception.
    }

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test217"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference2 = new org.apache.xml.security.encryption.CipherReference(document0, "Signature");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test218"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    int i3 = keyTransportImpl_RSAOAEP_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test219"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC blockEncryptionImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC();
    java.lang.String str1 = blockEncryptionImpl_AES256_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = blockEncryptionImpl_AES256_BC0.getRequiredProviderName();
    java.lang.String str3 = blockEncryptionImpl_AES256_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes256-cbc"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#aes256-cbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes256-cbc"+ "'", str3.equals("http://www.w3.org/2001/04/xmlenc#aes256-cbc"));

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test220"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._ATT_ENCODING;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "Encoding"+ "'", str0.equals("Encoding"));

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test221"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.toHexString(byte_array3);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    byte[] byte_array12 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    boolean b14 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array3, byte_array12);
    byte[] byte_array17 = pKCS15Cipher1.processBlock(byte_array3, (int)' ', (int)(byte)1);
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore18 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream19 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore20 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter21 = null;
    apacheKeyStore20.engineLoad(loadStoreParameter21);
    java.io.InputStream inputStream23 = null;
    char[] char_array28 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore20.engineLoad(inputStream23, char_array28);
    apacheKeyStore18.engineLoad(inputStream19, char_array28);
    java.util.Date date32 = apacheKeyStore18.engineGetCreationDate("Xalan Java 2.5.1");
    byte[] byte_array35 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array36 = new java.security.cert.Certificate[] {  };
    apacheKeyStore18.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array35, certificate_array36);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array40 = pKCS15Cipher1.encodeBlock(byte_array35, 2, 16);
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
    org.junit.Assert.assertNotNull(char_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array36);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test222"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.toHexString(byte_array2);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array2);
    byte[] byte_array11 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str12 = ant.HexDump.byteArrayToHexString(byte_array11);
    boolean b13 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array2, byte_array11);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI14 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(document0, byte_array11);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str3.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "00 01 FF 64 64 00"+ "'", str12.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test223"); }

    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException1 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("CipherValue");

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test224"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    java.lang.String str2 = blockEncryptionImpl_TRIPLEDES_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#tripledes-cbc"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#tripledes-cbc"));

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test225"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusive transformC14NExclusive0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean b1 = transformC14NExclusive0.returnsNodeSet();
    boolean b2 = transformC14NExclusive0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test226"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    java.lang.String str1 = keyWrapImpl_AES192_BC0.getRequiredProviderName();
    int i2 = keyWrapImpl_AES192_BC0.getImplementedAlgorithmType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 4);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test227"); }

    ant.HexDump hexDump0 = new ant.HexDump();

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test228"); }

    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException2 = new org.apache.xml.security.signature.InvalidDigestValueException("URI");
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException3 = new org.apache.xml.security.signature.InvalidSignatureValueException("X509IssuerName", (java.lang.Exception)invalidDigestValueException2);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test229"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusive transformC14NExclusive0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean b1 = transformC14NExclusive0.wantsNodeSet();
    boolean b2 = transformC14NExclusive0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test230"); }

    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException1 = new org.apache.xml.security.keys.storage.StorageResolverException("Modulus");
    java.lang.Throwable[] throwable_array2 = storageResolverException1.getSuppressed();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array2);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test231"); }

    org.apache.xml.security.transforms.implementations.TransformXPointer transformXPointer0 = new org.apache.xml.security.transforms.implementations.TransformXPointer();
    boolean b1 = transformXPointer0.returnsOctetStream();
    boolean b2 = transformXPointer0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test232"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.utils.HelperNodeList helperNodeList3 = new org.apache.xml.security.utils.HelperNodeList(false);
    org.w3c.dom.Node node4 = null;
    helperNodeList3.appendChild(node4);
    int i6 = helperNodeList3.getLength();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform7 = new org.apache.xml.security.transforms.Transform(document0, "X509IssuerSerial", (org.w3c.dom.NodeList)helperNodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 1);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test233"); }

    org.w3c.dom.Element element0 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore1 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream2 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore3 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter4 = null;
    apacheKeyStore3.engineLoad(loadStoreParameter4);
    java.io.InputStream inputStream6 = null;
    char[] char_array11 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore3.engineLoad(inputStream6, char_array11);
    apacheKeyStore1.engineLoad(inputStream2, char_array11);
    byte[] byte_array14 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(char_array11);
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element15 = org.apache.xml.security.encryption.EncryptedData.replace(element0, byte_array14);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test234"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("\uFFFD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test235"); }

    org.apache.xml.security.utils.HexDump.setBitDigits(' ', 'a');

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test236"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array4 = org.apache.xml.security.utils.PRNG.createBytes(64);
    java.security.Key key5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key7 = keyWrapImpl_TRIPLEDES_BC0.engineUnwrap(byte_array4, key5, "00#00#00#00#00#00#00#61#");
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
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test237"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.NodeList nodeList3 = org.apache.xml.security.utils.XMLUtils.convertSetToNodelist((java.util.Set)set_entry_obj_obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test238"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((short)0);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    boolean b3 = xMLSignatureInput2.isNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test239"); }

    org.apache.xml.security.transforms.implementations.TransformC14NWithComments transformC14NWithComments0 = new org.apache.xml.security.transforms.implementations.TransformC14NWithComments();
    boolean b1 = transformC14NWithComments0.returnsNodeSet();
    boolean b2 = transformC14NWithComments0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test240"); }

    java.lang.String str1 = ant.HexDump.toBinaryString(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa"+ "'", str1.equals("aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa aaaaaaaa"));

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test241"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] { true, 0 };
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException5 = new org.apache.xml.security.signature.XMLSignatureException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array4);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException7 = new org.apache.xml.security.signature.InvalidDigestValueException("DigestMethod");
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException8 = new org.apache.xml.security.signature.ReferenceNotInitializedException("No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array4, (java.lang.Exception)invalidDigestValueException7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test242"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.KeyStoreElement keyStoreElement2 = new org.apache.xml.security.keys.provider.KeyStoreElement(element0, "0000: 00 00 00 20                                        ... \n");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test243"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.OutputStream outputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream3 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore4 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter5 = null;
    apacheKeyStore4.engineLoad(loadStoreParameter5);
    java.io.InputStream inputStream7 = null;
    char[] char_array12 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore4.engineLoad(inputStream7, char_array12);
    apacheKeyStore2.engineLoad(inputStream3, char_array12);
    byte[] byte_array15 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(char_array12);
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineStore(outputStream1, char_array12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test244"); }

    java.lang.String str1 = ant.HexDump.toHexString((int)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00 00 00 34 "+ "'", str1.equals("00 00 00 34 "));

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test245"); }

    org.apache.xml.security.c14n.helper.AttrCompare attrCompare0 = new org.apache.xml.security.c14n.helper.AttrCompare();
    java.lang.Object obj2 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i3 = attrCompare0.compare((java.lang.Object)0.0f, obj2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test246"); }

    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException10 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array9);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException11 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array9);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException12 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array9);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException13 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array9);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException14 = new org.apache.xml.security.signature.ReferenceNotInitializedException("", (java.lang.Exception)invalidDigestValueException13);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException15 = new org.apache.xml.security.c14n.CanonicalizationException("XPath", (java.lang.Exception)referenceNotInitializedException14);
    java.lang.Throwable[] throwable_array16 = referenceNotInitializedException14.getSuppressed();
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException17 = new org.apache.xml.security.keys.storage.StorageResolverException();
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException18 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("PGPKeyID", (java.lang.Object[])throwable_array16, (java.lang.Exception)storageResolverException17);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException19 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", (java.lang.Object[])throwable_array16);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException20 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("RSAKeyValue", (java.lang.Object[])throwable_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(throwable_array16);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test247"); }

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
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException19 = new org.apache.xml.security.exceptions.XMLSecurityException("KeyReference", obj_array6);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException20 = new org.apache.xml.security.c14n.CanonicalizationException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test248"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException15 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException14);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException16 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array6, (java.lang.Exception)invalidCanonicalizerException14);
    java.lang.String str17 = org.apache.xml.security.utils.I18n.translate("CarriedKeyName", obj_array6);
    java.lang.String str18 = org.apache.xml.security.utils.I18n.translate("Transforms", obj_array6);
    java.lang.Object[] obj_array21 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException22 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array21);
    java.lang.Exception exception23 = null;
    org.w3c.dom.Attr attr24 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException26 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array21, exception23, attr24, "KeyName");
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException27 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", obj_array6, (java.lang.Exception)resourceResolverException26);
    resourceResolverException26.setBaseURI("http://www.w3.org/XML/1998/namespace");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str17.equals("No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str18.equals("No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test249"); }

    java.lang.String str1 = ant.HexDump.toBinaryString(1355390783);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a a aaaa   aa aa   aa      aa      "+ "'", str1.equals("a a aaaa   aa aa   aa      aa      "));

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test250"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    java.lang.String str3 = keyWrapImpl_TRIPLEDES_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-tripledes"+ "'", str3.equals("http://www.w3.org/2001/04/xmlenc#kw-tripledes"));

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test251"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    java.lang.String str3 = keyTransportImpl_RSAPKCS15_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", str3.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test252"); }

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
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver21 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element22 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver24 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey25 = x509IssuerSerialResolver21.engineResolveSecretKey(element22, "subtract", storageResolver24);
    org.w3c.dom.Element element26 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver28 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver28.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element32 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver34 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey35 = retrievalMethodResolver28.engineResolvePublicKey(element32, "HMACOutputLength", storageResolver34);
    javax.crypto.SecretKey secretKey36 = x509IssuerSerialResolver21.engineResolveSecretKey(element26, "", storageResolver34);
    // The following exception was thrown during execution in test generation
    try {
    boolean b37 = x509CertificateResolver0.engineCanResolve(element19, "DSAKeyValue", storageResolver34);
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
    org.junit.Assert.assertNull(secretKey25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey36);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test253"); }

    java.lang.String str0 = org.apache.xml.security.utils.I18n.defaultCountryCode;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "subtract"+ "'", str0.equals("subtract"));

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test254"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.normalize("KeyTransport");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "KeyTransport"+ "'", str1.equals("KeyTransport"));

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test255"); }

    sun.security.x509.X500Name x500Name4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("rawX509Certificate", "CarriedKeyName", "SignatureMethod", "http://www.w3.org/2001/04/xmlenc#kw-aes192");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name4);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test256"); }

    org.apache.xml.security.keys.keyresolver.KeyResolver.register("http://www.w3.org/2001/04/xmlenc#Content");

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test257"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetIvLength();
    boolean b3 = blockEncryptionImpl_AES192_BC0.getRequiredProviderAvailable();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test258"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.security.Provider.Service> set_service2 = apacheXMLProvider0.getServices();
    java.lang.String str3 = apacheXMLProvider0.getInfo();
    java.io.OutputStream outputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.storeToXML(outputStream4, "(//. | //@* | //namespace::*)");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Apache XML Security Provider"+ "'", str3.equals("Apache XML Security Provider"));

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test259"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider1.stringPropertyNames();
    java.lang.String str3 = apacheXMLProvider1.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b6 = xMLSignatureInput5.isInitialized();
    boolean b7 = xMLSignatureInput5.isOctetStream();
    java.io.InputStream inputStream8 = xMLSignatureInput5.getOctetStream();
    apacheXMLProvider1.load(inputStream8);
    apacheXMLProvider0.load(inputStream8);
    byte[] byte_array11 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream8);
    java.lang.String str12 = ant.HexDump.byteArrayToBinaryString(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Apache XML Security Provider"+ "'", str3.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + ""+ "'", str12.equals(""));

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test260"); }

    java.lang.String str0 = org.apache.xml.security.transforms.Transforms.TRANSFORM_XPATH2FILTER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2002/06/xmldsig-filter2"+ "'", str0.equals("http://www.w3.org/2002/06/xmldsig-filter2"));

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test261"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream3 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore4 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter5 = null;
    apacheKeyStore4.engineLoad(loadStoreParameter5);
    java.io.InputStream inputStream7 = null;
    char[] char_array12 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore4.engineLoad(inputStream7, char_array12);
    apacheKeyStore2.engineLoad(inputStream3, char_array12);
    java.util.Date date16 = apacheKeyStore2.engineGetCreationDate("Xalan Java 2.5.1");
    byte[] byte_array19 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array20 = new java.security.cert.Certificate[] {  };
    apacheKeyStore2.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array19, certificate_array20);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException23 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("union");
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException24 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("Type", (java.lang.Object[])certificate_array20, (java.lang.Exception)contentHandlerAlreadyRegisteredException23);
    org.apache.xml.security.transforms.TransformationException transformationException25 = new org.apache.xml.security.transforms.TransformationException("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a", (java.lang.Object[])certificate_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array20);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test262"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey2 = new org.apache.xml.security.encryption.EncryptedKey(element0, "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test263"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    byte[] byte_array8 = pKCS15Cipher1.processBlock(byte_array3, 128, 100);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput10 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b11 = xMLSignatureInput10.isInitialized();
    java.lang.String str12 = xMLSignatureInput10.getSourceURI();
    java.lang.String str13 = xMLSignatureInput10.getMIMEType();
    byte[] byte_array14 = xMLSignatureInput10.getBytes();
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array17 = pKCS15Cipher1.decodeBlock(byte_array14, (int)' ', (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u0000\u0000\u0000 "+ "'", str4.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str5.equals("0000: 00 00 00 20                                        ... \n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test264"); }

    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass providerIdClass1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("Signature");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(providerIdClass1);

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test265"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.CertificateElement certificateElement2 = new org.apache.xml.security.keys.provider.CertificateElement(element0, "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test266"); }

    byte[] byte_array1 = ant.HexDump.hexStringToByteArray("http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
    java.lang.String str2 = ant.HexDump.toBinaryString(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "aa  aa a aaaaaaaa aaa aaa  aaaa   a   aa  aa aaa a aa   aa   a"+ "'", str2.equals("aa  aa a aaaaaaaa aaa aaa  aaaa   a   aa  aa aaa a aa   aa   a"));

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test267"); }

    org.apache.xml.security.transforms.Transform.register("http://www.w3.org/2001/04/xmlenc#aes128-cbc", "InclusiveNamespaces");

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test268"); }

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
    byte[] byte_array17 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array18 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array17, certificate_array18);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput21 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b22 = xMLSignatureInput21.isInitialized();
    boolean b23 = xMLSignatureInput21.isOctetStream();
    java.io.InputStream inputStream24 = xMLSignatureInput21.getOctetStream();
    byte[] byte_array25 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream24);
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore26 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream27 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore28 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter29 = null;
    apacheKeyStore28.engineLoad(loadStoreParameter29);
    java.io.InputStream inputStream31 = null;
    char[] char_array36 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore28.engineLoad(inputStream31, char_array36);
    apacheKeyStore26.engineLoad(inputStream27, char_array36);
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineLoad(inputStream24, char_array36);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array36);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test269"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream3 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore4 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter5 = null;
    apacheKeyStore4.engineLoad(loadStoreParameter5);
    java.io.InputStream inputStream7 = null;
    char[] char_array12 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore4.engineLoad(inputStream7, char_array12);
    apacheKeyStore2.engineLoad(inputStream3, char_array12);
    byte[] byte_array18 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str19 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array18);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array18);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams21 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array18);
    java.lang.String str22 = ant.HexDump.toBinaryString(byte_array18);
    java.lang.String str23 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array18);
    java.lang.String str24 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array18);
    java.security.cert.Certificate[] certificate_array25 = new java.security.cert.Certificate[] {  };
    apacheKeyStore2.engineSetKeyEntry("Encoding", byte_array18, certificate_array25);
    java.security.Key key27 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key29 = keyTransportImpl_RSAOAEP_BC0.engineUnwrap(byte_array18, key27, "00 00 00 00 00 00 00 64 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str19.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str22.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str23.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str24.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array25);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test270"); }

    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException2 = new org.apache.xml.security.signature.InvalidDigestValueException("G");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException3 = new org.apache.xml.security.exceptions.XMLSecurityException("CipherValue", (java.lang.Exception)invalidDigestValueException2);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test271"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(element0, "DataReference");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test272"); }

    byte[] byte_array2 = new byte[] { (byte)0, (byte)0 };
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array2);
    xMLSignatureInput3.setSourceURI("Encoding");
    byte[] byte_array6 = xMLSignatureInput3.getBytes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test273"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial2 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(element0, "DigestValue");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test274"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC blockEncryptionImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC();
    java.lang.String str1 = blockEncryptionImpl_AES256_BC0.getImplementedAlgorithmURI();
    int i2 = blockEncryptionImpl_AES256_BC0.engineGetIvLength();
    java.lang.String str3 = blockEncryptionImpl_AES256_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes256-cbc"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#aes256-cbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test275"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "Nonce", "http://www.w3.org/2001/04/xmlenc#aes192-cbc");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test276"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperty signatureProperty2 = new org.apache.xml.security.signature.SignatureProperty(document0, "http://www.w3.org/2001/10/xml-exc-c14n#");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test277"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.setAttr(element0, "http://www.w3.org/2000/09/xmldsig#base64", "http://www.w3.org/2001/04/xmldsig-more#sha384");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test278"); }

    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException1 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("X509SKI");

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test279"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm3 = new org.apache.xml.security.algorithms.SignatureAlgorithm(document0, "PgenCounter", 2048);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test280"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.InclusiveNamespaces.ExclusiveCanonicalizationNamespace;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", str0.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test281"); }

    org.apache.xml.security.utils.Base64.setBase64WrapLength(1355390783);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test282"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter transformXPath2Filter0 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter();
    boolean b1 = transformXPath2Filter0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test283"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    java.lang.String[] str_array1 = resolverDirectHTTP0.engineGetPropertyKeys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array1);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test284"); }

    java.lang.String str0 = org.apache.xml.security.transforms.implementations.TransformXSLT.XSLTSpecNS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/1999/XSL/Transform"+ "'", str0.equals("http://www.w3.org/1999/XSL/Transform"));

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test285"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("00#00#00#00#00#00#00#61#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00#00#00#00#00#00#00#61#"+ "'", str1.equals("00#00#00#00#00#00#00#61#"));

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test286"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha256");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test287"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    byte[] byte_array8 = pKCS15Cipher1.processBlock(byte_array3, 128, 100);
    java.security.Key key10 = null;
    org.apache.xml.security.utils.PRNG pRNG11 = org.apache.xml.security.utils.PRNG.getInstance();
    java.security.SecureRandom secureRandom12 = pRNG11.getSecureRandom();
    org.apache.xml.security.utils.PRNG.init(secureRandom12);
    org.apache.xml.security.utils.PRNG.init(secureRandom12);
    // The following exception was thrown during execution in test generation
    try {
    pKCS15Cipher1.init((int)(short)100, key10, secureRandom12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u0000\u0000\u0000 "+ "'", str4.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str5.equals("0000: 00 00 00 20                                        ... \n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(secureRandom12);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test288"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
    byte[] byte_array3 = xMLSignatureInput2.getBytes();
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384", byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test289"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPathFilterCHGPContainer xPathFilterCHGPContainer5 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.getInstance(document0, true, "CipherReference", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", "No message with ID &quot;KeyName&quot; found in resource bundle &quot;org/apache/xml/security/resource/xmlsecurity&quot;");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test290"); }

    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
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
    javax.crypto.SecretKey secretKey16 = rSAKeyValueResolver0.engineResolveSecretKey(element1, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver13);
    org.w3c.dom.Element element17 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver19 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element20 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver22 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element23 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver25 = null;
    java.security.PublicKey publicKey26 = retrievalMethodResolver22.engineResolvePublicKey(element23, "subtract", storageResolver25);
    org.w3c.dom.Element element27 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver29 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element30 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver32 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey33 = x509IssuerSerialResolver29.engineResolveSecretKey(element30, "subtract", storageResolver32);
    java.security.cert.X509Certificate x509Certificate34 = retrievalMethodResolver22.engineResolveX509Certificate(element27, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver32);
    javax.crypto.SecretKey secretKey35 = rSAKeyValueResolver19.engineResolveSecretKey(element20, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver32);
    javax.crypto.SecretKey secretKey36 = rSAKeyValueResolver0.engineResolveSecretKey(element17, "Transform", storageResolver32);
    org.w3c.dom.Element element37 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver39 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element40 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver42 = null;
    java.security.PublicKey publicKey43 = retrievalMethodResolver39.engineResolvePublicKey(element40, "subtract", storageResolver42);
    org.w3c.dom.Element element44 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver46 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element47 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver49 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey50 = x509IssuerSerialResolver46.engineResolveSecretKey(element47, "subtract", storageResolver49);
    java.security.cert.X509Certificate x509Certificate51 = retrievalMethodResolver39.engineResolveX509Certificate(element44, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver49);
    boolean b52 = storageResolver49.hasNext();
    javax.crypto.SecretKey secretKey53 = rSAKeyValueResolver0.engineResolveSecretKey(element37, "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", storageResolver49);
    org.w3c.dom.Element element54 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver56 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element57 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver59 = null;
    java.security.PublicKey publicKey60 = retrievalMethodResolver56.engineResolvePublicKey(element57, "subtract", storageResolver59);
    org.w3c.dom.Element element61 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver63 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element64 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver66 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey67 = x509IssuerSerialResolver63.engineResolveSecretKey(element64, "subtract", storageResolver66);
    java.security.cert.X509Certificate x509Certificate68 = retrievalMethodResolver56.engineResolveX509Certificate(element61, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver66);
    boolean b69 = storageResolver66.hasNext();
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey70 = rSAKeyValueResolver0.engineResolvePublicKey(element54, "FF ", storageResolver66);
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
    org.junit.Assert.assertNull(secretKey16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b52 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate68);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b69 == false);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test291"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = ant.HexDump.toByteArray((int)' ');
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL3 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(document0, byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }



  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test293"); }

    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException1 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("CanonicalizationMethod");

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test294"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createElementFromBigint(document0, "No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test295"); }

    org.apache.xml.security.utils.I18n.init("0000: 46 46 23                                           FF#\n", "FF 64 64 64 0A 00");

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test296"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider1.stringPropertyNames();
    java.lang.String str3 = apacheXMLProvider1.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b6 = xMLSignatureInput5.isInitialized();
    boolean b7 = xMLSignatureInput5.isOctetStream();
    java.io.InputStream inputStream8 = xMLSignatureInput5.getOctetStream();
    apacheXMLProvider1.load(inputStream8);
    apacheXMLProvider0.load(inputStream8);
    java.io.PrintWriter printWriter11 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.list(printWriter11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Apache XML Security Provider"+ "'", str3.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream8);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test297"); }

    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException15 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array12);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException16 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array12);
    java.lang.Object[] obj_array21 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException22 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array21);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException23 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array21);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException24 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array21);
    org.apache.xml.security.signature.Reference reference25 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException26 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array21, reference25);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException27 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array12, (java.lang.Exception)missingResourceFailureException26);
    java.lang.Object[] obj_array31 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException32 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array31);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException33 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array31);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException34 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException33);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException35 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("ks", obj_array12, (java.lang.Exception)keyResolverException34);
    java.lang.Object[] obj_array36 = new java.lang.Object[] { "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n", "ds", invalidCipherTextException35 };
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException37 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("http://www.w3.org/TR/2001/WD-xptr-20010108", obj_array36);
    java.lang.Object[] obj_array43 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException44 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array43);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException45 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array43);
    java.lang.Object[] obj_array49 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException50 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array49);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException51 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array49);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException52 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException51);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException53 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array43, (java.lang.Exception)invalidCanonicalizerException51);
    org.apache.xml.security.signature.Reference reference54 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException55 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array43, reference54);
    org.apache.xml.security.signature.Reference reference56 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException57 = new org.apache.xml.security.signature.MissingResourceFailureException("http://www.w3.org/2000/09/xmldsig#base64", (java.lang.Exception)missingResourceFailureException55, reference56);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException58 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n", obj_array36, (java.lang.Exception)missingResourceFailureException57);
    java.lang.Object[] obj_array65 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException66 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array65);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException67 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array65);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException68 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array65);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException69 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array65);
    java.lang.Object[] obj_array74 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException75 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array74);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException76 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array74);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException77 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array74);
    org.apache.xml.security.signature.Reference reference78 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException79 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array74, reference78);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException80 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array65, (java.lang.Exception)missingResourceFailureException79);
    java.lang.Object[] obj_array86 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException87 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array86);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException88 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array86);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException89 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array86);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException90 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array86);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException91 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array86);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException92 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array65, (java.lang.Exception)storageResolverException91);
    org.w3c.dom.Attr attr93 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException95 = new org.apache.xml.security.utils.resolver.ResourceResolverException("http://www.w3.org/2001/04/xmlenc#aes128-cbc", obj_array36, (java.lang.Exception)storageResolverException91, attr93, "00000000");
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException96 = new org.apache.xml.security.signature.XMLSignatureException("00#00#00#00#00#00#00#01#", obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array74);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array86);

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test298"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.toHexString(byte_array3);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    byte[] byte_array12 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    boolean b14 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array3, byte_array12);
    byte[] byte_array17 = pKCS15Cipher1.processBlock(byte_array3, (int)' ', (int)(byte)1);
    byte[] byte_array19 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str22 = ant.HexDump.byteArrayToHexString(byte_array19, 32, 0);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array25 = pKCS15Cipher1.encodeBlock(byte_array19, 1024, (int)(short)3);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + ""+ "'", str22.equals(""));

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test299"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.c14n.helper.C14nHelper.checkTraversability(document0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test300"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList1 = null;
    byte[] byte_array2 = canonicalizer20010315WithComments0.engineCanonicalizeXPathNodeSet(nodeList1);
    java.lang.String str3 = canonicalizer20010315WithComments0.engineGetURI();
    java.lang.String str4 = canonicalizer20010315WithComments0.engineGetURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str3.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"+ "'", str4.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments"));

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test301"); }

    byte[] byte_array6 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str7 = ant.HexDump.byteArrayToHexString(byte_array6);
    java.lang.String str8 = ant.HexDump.prettyPrintHex(byte_array6);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str11 = ant.HexDump.byteArrayToHexString(byte_array6, (int)(short)-1, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "00 01 FF 64 64 00"+ "'", str7.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000: 00 01 FF 64 64 00                                  ...dd.\n"+ "'", str8.equals("0000: 00 01 FF 64 64 00                                  ...dd.\n"));

  }



  @Test
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test303"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey4 = x509IssuerSerialResolver0.engineResolveSecretKey(element1, "subtract", storageResolver3);
    org.w3c.dom.Element element5 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver7 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = null;
    java.security.PublicKey publicKey14 = retrievalMethodResolver10.engineResolvePublicKey(element11, "subtract", storageResolver13);
    org.w3c.dom.Element element15 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver17 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element18 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver20 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey21 = x509IssuerSerialResolver17.engineResolveSecretKey(element18, "subtract", storageResolver20);
    java.security.cert.X509Certificate x509Certificate22 = retrievalMethodResolver10.engineResolveX509Certificate(element15, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver20);
    javax.crypto.SecretKey secretKey23 = rSAKeyValueResolver7.engineResolveSecretKey(element8, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver20);
    javax.crypto.SecretKey secretKey24 = x509IssuerSerialResolver0.engineResolveSecretKey(element5, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", storageResolver20);
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver dSAKeyValueResolver27 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    org.w3c.dom.Element element28 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver30 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element31 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver33 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey34 = x509IssuerSerialResolver30.engineResolveSecretKey(element31, "subtract", storageResolver33);
    java.util.Iterator iterator35 = storageResolver33.getIterator();
    boolean b36 = storageResolver33.hasNext();
    java.security.cert.X509Certificate x509Certificate37 = dSAKeyValueResolver27.engineResolveX509Certificate(element28, "http://www.w3.org/2001/04/xmlenc#Content", storageResolver33);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey38 = x509IssuerSerialResolver0.engineResolvePublicKey(element25, "004004004004004004004004", storageResolver33);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b36 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate37);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test304"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPathFilterCHGPContainer xPathFilterCHGPContainer5 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.getInstance(document0, true, "d", "CipherValue", "00 00 00 00 00 00 00 64 ");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test305"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP1 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b2 = transformXPathFilterCHGP1.wantsOctetStream();
    boolean b3 = transformXPathFilterCHGP1.returnsNodeSet();
    boolean b4 = apacheXMLProvider0.containsKey((java.lang.Object)b3);
    boolean b6 = apacheXMLProvider0.containsValue((java.lang.Object)"X509IssuerSerial");
    java.lang.String str7 = apacheXMLProvider0.getName();
    java.io.OutputStream outputStream8 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.storeToXML(outputStream8, "00 00 00 00 00 00 00 64 ", "http://www.w3.org/2001/04/xmlenc#aes256-cbc");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "ApacheXML"+ "'", str7.equals("ApacheXML"));

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test306"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter04 transformXPath2Filter040 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter04();
    boolean b1 = transformXPath2Filter040.wantsOctetStream();
    boolean b2 = transformXPath2Filter040.returnsOctetStream();
    boolean b3 = transformXPath2Filter040.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test307"); }

    byte[] byte_array7 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array7);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams9 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("", byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = org.apache.xml.security.utils.HexDump.toHexString(byte_array7, 76, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.NegativeArraySizeException");
    } catch (java.lang.NegativeArraySizeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "00 01 FF 64 64 00"+ "'", str8.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test308"); }

    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver dSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey7 = x509IssuerSerialResolver3.engineResolveSecretKey(element4, "subtract", storageResolver6);
    java.util.Iterator iterator8 = storageResolver6.getIterator();
    boolean b9 = storageResolver6.hasNext();
    java.security.cert.X509Certificate x509Certificate10 = dSAKeyValueResolver0.engineResolveX509Certificate(element1, "http://www.w3.org/2001/04/xmlenc#Content", storageResolver6);
    java.security.cert.X509Certificate x509Certificate11 = storageResolver6.next();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate11);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test309"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("http://www.w3.org/2000/09/xmldsig#X509Data");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test310"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException14 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array13);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException15 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array13);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException16 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array13);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException17 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array13);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException18 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("DigestMethod", obj_array13);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException19 = new org.apache.xml.security.signature.XMLSignatureException("JCAType", obj_array13);
    java.lang.Object[] obj_array26 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException27 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array26);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException28 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array26);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException29 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array26);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException30 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array26);
    java.lang.Object[] obj_array35 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException36 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array35);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException37 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array35);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException38 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array35);
    org.apache.xml.security.signature.Reference reference39 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException40 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array35, reference39);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException41 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array26, (java.lang.Exception)missingResourceFailureException40);
    java.lang.Object[] obj_array47 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException48 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array47);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException49 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array47);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException50 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array47);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException51 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array47);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException52 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array47);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException53 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array26, (java.lang.Exception)storageResolverException52);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException54 = new org.apache.xml.security.signature.ReferenceNotInitializedException("yTZ4mVI+6vI=", obj_array13, (java.lang.Exception)invalidDigestValueException53);
    org.apache.xml.security.transforms.TransformationException transformationException55 = new org.apache.xml.security.transforms.TransformationException("http://xml.apache.org/security/#KeyStore", obj_array4, (java.lang.Exception)invalidDigestValueException53);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException56 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array4);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException57 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array47);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test311"); }

    org.apache.xml.security.algorithms.encryption.EncryptionMethod.providerInit();

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test312"); }

    java.lang.String str0 = org.apache.xml.security.utils.EncryptionConstants._TAG_CIPHERDATA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "CipherData"+ "'", str0.equals("CipherData"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test313"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.SignatureProperty signatureProperty2 = new org.apache.xml.security.signature.SignatureProperty(document0, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test314"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    java.util.Collection<java.lang.Object> collection_obj3 = apacheXMLProvider0.values();
    java.util.Enumeration<?> enumeration_wildcard4 = apacheXMLProvider0.propertyNames();
    java.lang.Object obj7 = apacheXMLProvider0.setProperty("", "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_wildcard4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test315"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP2 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    resolverDirectHTTP2.engineSetProperty("", "Modulus");
    java.lang.String[] str_array6 = resolverDirectHTTP2.engineGetPropertyKeys();
    java.lang.Object[] obj_array11 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException12 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array11);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException13 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array11);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException14 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array11);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException15 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", (java.lang.Exception)xMLSecurityException14);
    org.w3c.dom.Attr attr16 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException18 = new org.apache.xml.security.utils.resolver.ResourceResolverException("http://www.w3.org/2000/09/xmldsig#enveloped-signature", (java.lang.Object[])str_array6, (java.lang.Exception)contentHandlerAlreadyRegisteredException15, attr16, "Algorithm");
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException19 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("http://www.w3.org/2000/09/xmldsig#dsa-sha1", (java.lang.Exception)resourceResolverException18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test316"); }

    java.lang.String str0 = org.apache.xml.security.c14n.Canonicalizer.ALGO_ID_C14N_EXCL_WITH_COMMENTS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithComments"+ "'", str0.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments"));

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test317"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("No message with ID \"CanonicalizationMethod\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "subtract");
      org.junit.Assert.fail("Expected exception of type java.io.UnsupportedEncodingException");
    } catch (java.io.UnsupportedEncodingException e) {
      // Expected exception.
    }

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test318"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.IdResolver.registerElementById(element0, "Algorithm");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test319"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceSubtract(document0, "0000: 00 00 00 20                                        ... \n");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test320"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    java.util.Enumeration<java.lang.Object> enumeration_obj3 = apacheXMLProvider0.elements();
    java.lang.String str4 = apacheXMLProvider0.getInfo();
    java.util.Enumeration<java.lang.Object> enumeration_obj5 = apacheXMLProvider0.elements();
    java.io.OutputStream outputStream6 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.save(outputStream6, "http://www.w3.org/TR/1999/REC-xpath-19991116");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Apache XML Security Provider"+ "'", str2.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Apache XML Security Provider"+ "'", str4.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj5);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test321"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.SignatureAlgorithm signatureAlgorithm2 = new org.apache.xml.security.algorithms.SignatureAlgorithm(element0, "Xalan Java 2.5.1");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test322"); }

    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException10 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array8);
    java.lang.Object[] obj_array14 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException15 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array14);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException16 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array14);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException17 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException16);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException18 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array8, (java.lang.Exception)invalidCanonicalizerException16);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException20 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException21 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2000/09/xmldsig#X509Data", obj_array8, (java.lang.Exception)referenceNotInitializedException20);
    java.lang.Object[] obj_array26 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException27 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array26);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException28 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array26);
    java.lang.Object[] obj_array30 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException31 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array30);
    java.lang.Object[] obj_array34 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException35 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array34);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException36 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array34);
    algorithmAlreadyRegisteredException31.addSuppressed((java.lang.Throwable)invalidCanonicalizerException36);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException38 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array26, (java.lang.Exception)algorithmAlreadyRegisteredException31);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException39 = new org.apache.xml.security.c14n.CanonicalizationException("Seed", (java.lang.Exception)xMLSecurityException38);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException40 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1", obj_array8, (java.lang.Exception)canonicalizationException39);
    java.lang.String str41 = org.apache.xml.security.utils.I18n.getExceptionMessage("HMACOutputLength", obj_array8);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException42 = new org.apache.xml.security.keys.storage.StorageResolverException("http://www.w3.org/2001/04/xmldsig-more#hmac-sha256", obj_array8);
    org.apache.xml.security.exceptions.Base64DecodingException base64DecodingException43 = new org.apache.xml.security.exceptions.Base64DecodingException("http://www.w3.org/2001/04/xmlenc#", obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str41.equals("No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test323"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    java.lang.String str1 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderName();
    java.lang.String str2 = keyTransportImpl_RSAPKCS15_BC0.getImplementedAlgorithmURI();
    byte[] byte_array4 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.toHexString(byte_array4);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array4);
    byte[] byte_array13 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str14 = ant.HexDump.byteArrayToHexString(byte_array13);
    boolean b15 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array4, byte_array13);
    java.security.Key key16 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key18 = keyTransportImpl_RSAPKCS15_BC0.engineUnwrap(byte_array4, key16, "\u0000");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));
    
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
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test324"); }

    org.apache.xml.security.utils.PRNG pRNG0 = org.apache.xml.security.utils.PRNG.getInstance();
    int i2 = pRNG0.nextInt(10);
    int i4 = pRNG0.nextInt(3);
    java.security.SecureRandom secureRandom5 = pRNG0.getSecureRandom();
    int i7 = pRNG0.nextInt(256);
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider8 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider9 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str10 = apacheXMLProvider9.stringPropertyNames();
    java.lang.String str11 = apacheXMLProvider9.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput13 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b14 = xMLSignatureInput13.isInitialized();
    boolean b15 = xMLSignatureInput13.isOctetStream();
    java.io.InputStream inputStream16 = xMLSignatureInput13.getOctetStream();
    apacheXMLProvider9.load(inputStream16);
    apacheXMLProvider8.load(inputStream16);
    byte[] byte_array19 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream16);
    pRNG0.nextBytes(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(secureRandom5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Apache XML Security Provider"+ "'", str11.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test325"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.security.Key key5 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array6 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array3, key5);
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

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test326"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptionProperty encryptionProperty2 = new org.apache.xml.security.encryption.EncryptionProperty(element0, "Type");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test327"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array5 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array5);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array5);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams8 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array5);
    java.lang.String str9 = ant.HexDump.toBinaryString(byte_array5);
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array5);
    java.security.Key key11 = null;
    byte[] byte_array13 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("Transforms");
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array14 = blockEncryptionImpl_TRIPLEDES_BC0.engineEncrypt(byte_array5, key11, byte_array13);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str6.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str9.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str10.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test328"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.util.Enumeration enumeration3 = apacheKeyStore0.engineAliases();
    java.security.KeyStore.ProtectionParameter protectionParameter5 = null;
    java.security.KeyStore.Entry entry6 = apacheKeyStore0.engineGetEntry("http://www.w3.org/2001/10/xml-exc-c14n#WithComments", protectionParameter5);
    java.io.OutputStream outputStream7 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore8 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream9 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore10 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter11 = null;
    apacheKeyStore10.engineLoad(loadStoreParameter11);
    java.io.InputStream inputStream13 = null;
    char[] char_array18 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore10.engineLoad(inputStream13, char_array18);
    apacheKeyStore8.engineLoad(inputStream9, char_array18);
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineStore(outputStream7, char_array18);
      org.junit.Assert.fail("Expected exception of type org.w3c.dom.DOMException");
    } catch (org.w3c.dom.DOMException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array18);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test329"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException8 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array5);
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException14 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array13);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException15 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array13);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException16 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array13);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException19 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException20 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException19);
    org.apache.xml.security.transforms.TransformationException transformationException21 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array13, (java.lang.Exception)xMLSecurityException20);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException22 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#rawX509Certificate", obj_array5, (java.lang.Exception)transformationException21);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException23 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmlenc#kw-tripledes", obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test330"); }

    java.security.KeyStore keyStore0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.storage.StorageResolver storageResolver1 = new org.apache.xml.security.keys.storage.StorageResolver(keyStore0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test331"); }

    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver dSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey7 = x509IssuerSerialResolver3.engineResolveSecretKey(element4, "subtract", storageResolver6);
    java.util.Iterator iterator8 = storageResolver6.getIterator();
    boolean b9 = storageResolver6.hasNext();
    java.security.cert.X509Certificate x509Certificate10 = dSAKeyValueResolver0.engineResolveX509Certificate(element1, "http://www.w3.org/2001/04/xmlenc#Content", storageResolver6);
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver13 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver16 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element17 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver19 = null;
    java.security.PublicKey publicKey20 = retrievalMethodResolver16.engineResolvePublicKey(element17, "subtract", storageResolver19);
    org.w3c.dom.Element element21 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver23 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element24 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver26 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey27 = x509IssuerSerialResolver23.engineResolveSecretKey(element24, "subtract", storageResolver26);
    java.security.cert.X509Certificate x509Certificate28 = retrievalMethodResolver16.engineResolveX509Certificate(element21, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver26);
    javax.crypto.SecretKey secretKey29 = rSAKeyValueResolver13.engineResolveSecretKey(element14, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver26);
    org.w3c.dom.Element element30 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver32 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element33 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver35 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element36 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver38 = null;
    java.security.PublicKey publicKey39 = retrievalMethodResolver35.engineResolvePublicKey(element36, "subtract", storageResolver38);
    org.w3c.dom.Element element40 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver42 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element43 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver45 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey46 = x509IssuerSerialResolver42.engineResolveSecretKey(element43, "subtract", storageResolver45);
    java.security.cert.X509Certificate x509Certificate47 = retrievalMethodResolver35.engineResolveX509Certificate(element40, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver45);
    javax.crypto.SecretKey secretKey48 = rSAKeyValueResolver32.engineResolveSecretKey(element33, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver45);
    javax.crypto.SecretKey secretKey49 = rSAKeyValueResolver13.engineResolveSecretKey(element30, "Transform", storageResolver45);
    java.security.PublicKey publicKey50 = dSAKeyValueResolver0.engineResolvePublicKey(element11, "http://www.w3.org/2001/04/xmldsig-more#", storageResolver45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey50);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test332"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array10);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException13 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException12);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException14 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array4, (java.lang.Exception)invalidCanonicalizerException12);
    org.apache.xml.security.signature.Reference reference15 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException16 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array4, reference15);
    org.apache.xml.security.signature.Reference reference17 = null;
    missingResourceFailureException16.setReference(reference17);
    org.apache.xml.security.signature.Reference reference19 = missingResourceFailureException16.getReference();
    org.apache.xml.security.signature.Reference reference20 = null;
    missingResourceFailureException16.setReference(reference20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reference19);

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test333"); }

    org.apache.xml.security.transforms.implementations.TransformXPointer transformXPointer0 = new org.apache.xml.security.transforms.implementations.TransformXPointer();
    boolean b1 = transformXPointer0.returnsNodeSet();
    boolean b2 = transformXPointer0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test334"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInSignatureSpace(element0, "d");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.signature.XMLSignatureException");
    } catch (org.apache.xml.security.signature.XMLSignatureException e) {
      // Expected exception.
    }

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test335"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test336"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusive transformC14NExclusive0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean b1 = transformC14NExclusive0.returnsNodeSet();
    boolean b2 = transformC14NExclusive0.wantsOctetStream();
    boolean b3 = transformC14NExclusive0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test337"); }

    org.w3c.dom.Element element0 = null;
    byte[] byte_array2 = ant.HexDump.toByteArray(1);
    byte[] byte_array3 = org.apache.xml.security.utils.Base64.decode(byte_array2);
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element4 = org.apache.xml.security.encryption.EncryptedData.replace(element0, byte_array3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test338"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath6 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj7 = apacheXMLProvider4.remove((java.lang.Object)transformXPath6);
    boolean b8 = transformXPath6.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test339"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    int i3 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmType();
    java.security.Key key4 = null;
    java.security.Key key5 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore6 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream7 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore8 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter9 = null;
    apacheKeyStore8.engineLoad(loadStoreParameter9);
    java.io.InputStream inputStream11 = null;
    char[] char_array16 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore8.engineLoad(inputStream11, char_array16);
    apacheKeyStore6.engineLoad(inputStream7, char_array16);
    java.util.Date date20 = apacheKeyStore6.engineGetCreationDate("Xalan Java 2.5.1");
    byte[] byte_array23 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array24 = new java.security.cert.Certificate[] {  };
    apacheKeyStore6.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array23, certificate_array24);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array26 = keyTransportImpl_RSAOAEP_BC0.engineWrap(key4, key5, byte_array23);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array24);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test340"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.lang.String str4 = org.apache.xml.security.utils.Base64.encode(byte_array2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams5 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array2);
    byte[] byte_array7 = ant.HexDump.toByteArray(1);
    boolean b8 = org.apache.xml.security.utils.JavaUtils.binaryCompare(byte_array2, byte_array7);
    java.lang.String str9 = org.apache.xml.security.utils.HexDump.toBinaryString(byte_array2);
    java.security.Key key10 = null;
    byte[] byte_array12 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str13 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array12);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array12);
    java.lang.String str15 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(byte_array12);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array16 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array2, key10, byte_array12);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "+ "'", str9.equals("aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str13.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "+ "'", str15.equals("aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "));

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test341"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    int i2 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str3.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test342"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.NamespaceSpecNS;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2000/xmlns/"+ "'", str0.equals("http://www.w3.org/2000/xmlns/"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test343"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.SPKIData sPKIData2 = new org.apache.xml.security.keys.content.SPKIData(element0, "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test344"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.XMLUtils.createElementInSignatureSpace(document0, "http://www.w3.org/2000/09/xmldsig#rsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test345"); }

    byte[] byte_array1 = org.apache.xml.security.utils.Base64.decode("http://www.w3.org/2000/09/xmldsig#rawX509Certificate");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test346"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test347"); }

    org.apache.xml.security.keys.keyresolver.KeyResolver.init();

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test348"); }

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
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException19 = new org.apache.xml.security.c14n.CanonicalizationException("Seed", (java.lang.Exception)xMLSecurityException18);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException20 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("00 01 FF 64 64 00", (java.lang.Exception)canonicalizationException19);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException21 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#X509Data", (java.lang.Exception)invalidCanonicalizerException20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test349"); }

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
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException19 = new org.apache.xml.security.exceptions.XMLSecurityException("KeyReference", obj_array6);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException20 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("32#00#1E#CC#14#20#01#03#15#CE#", obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test350"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    boolean b14 = apacheKeyStore0.engineIsKeyEntry("http://www.w3.org/2000/09/xmldsig#dsa-sha1");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test351"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    byte[] byte_array3 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array3);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array3);
    java.security.Key key7 = null;
    byte[] byte_array14 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str15 = ant.HexDump.byteArrayToHexString(byte_array14);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array16 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array3, key7, byte_array14);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str4.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "FF 64 64 64 0A 00"+ "'", str15.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test352"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider1.stringPropertyNames();
    java.lang.String str3 = apacheXMLProvider1.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b6 = xMLSignatureInput5.isInitialized();
    boolean b7 = xMLSignatureInput5.isOctetStream();
    java.io.InputStream inputStream8 = xMLSignatureInput5.getOctetStream();
    apacheXMLProvider1.load(inputStream8);
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous10 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(inputStream8);
    apacheXMLProvider0.load(inputStream8);
    java.io.Writer writer12 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.store(writer12, "No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "Apache XML Security Provider"+ "'", str3.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream8);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test353"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    byte[] byte_array8 = pKCS15Cipher1.processBlock(byte_array3, 128, 100);
    // The following exception was thrown during execution in test generation
    try {
    int i9 = pKCS15Cipher1.getInputBlockSize();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u0000\u0000\u0000 "+ "'", str4.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str5.equals("0000: 00 00 00 20                                        ... \n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array8);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test354"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusive transformC14NExclusive0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusive();
    boolean b1 = transformC14NExclusive0.returnsNodeSet();
    boolean b2 = transformC14NExclusive0.returnsNodeSet();
    boolean b3 = transformC14NExclusive0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test355"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean b1 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    boolean b2 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    java.lang.String str3 = canonicalizer20010315ExclWithComments0.engineGetURI();
    org.w3c.dom.Element element4 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.util.Set set5 = canonicalizer20010315ExclWithComments0.visiblyUtilized(element4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithComments"+ "'", str3.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments"));

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test356"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod1 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo2 = null;
    org.apache.xml.security.encryption.CipherData cipherData3 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData7 = new org.apache.xml.security.encryption.EncryptedData(document0, encryptionMethod1, keyInfo2, cipherData3, encryptionProperties4, "(//. | //@* | //namespace::*)[not(self::comment())]", "Nonce");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test357"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    int i3 = keyTransportImpl_RSAOAEP_BC0.engineGetBlockSize();
    org.w3c.dom.Document document4 = null;
    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams6 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    java.lang.String str7 = streamParams6.getAlgorithmURI();
    java.lang.String str8 = streamParams6.getAlgorithmURI();
    java.lang.String str9 = streamParams6.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams10 = keyTransportImpl_RSAOAEP_BC0.engineInit(document4, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)streamParams6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test358"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createDSctx(document0, "http://www.w3.org/2002/04/xmldsig-filter2", "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test359"); }

    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException4 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array3);
    java.lang.Exception exception5 = null;
    org.w3c.dom.Attr attr6 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException8 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array3, exception5, attr6, "KeyName");
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException9 = new org.apache.xml.security.transforms.InvalidTransformException("Q", (java.lang.Exception)resourceResolverException8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test360"); }

    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsRegisteredAtSecurity("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test361"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("Apache XML Security Provider");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test362"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    int i3 = blockEncryptionImpl_AES192_BC0.engineGetIvLength();
    java.lang.String str4 = blockEncryptionImpl_AES192_BC0.getImplementedAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "http://www.w3.org/2001/04/xmlenc#aes192-cbc"+ "'", str4.equals("http://www.w3.org/2001/04/xmlenc#aes192-cbc"));

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test363"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(element0, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test364"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("xmlsecurityOrgPrefv62RV8QygCi4lzCcUXRdSj7LraFR");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "xmlsecurityOrgPrefv62RV8QygCi4lzCcUXRdSj7LraFR"+ "'", str1.equals("xmlsecurityOrgPrefv62RV8QygCi4lzCcUXRdSj7LraFR"));

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test365"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(document0, "00400400420");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test366"); }

    byte[] byte_array1 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str2 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array1);
    java.lang.String str3 = org.apache.xml.security.utils.Base64.encode(byte_array1);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams4 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array1);
    byte[] byte_array5 = oAEPParams4.getOAEPParamBytes();
    java.lang.String str6 = ant.HexDump.toString(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str2.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "yTZ4mVI+6vI="+ "'", str3.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "\uFFFD6x\uFFFDR>\uFFFD"+ "'", str6.equals("\uFFFD6x\uFFFDR>\uFFFD"));

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test367"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("PgenCounter");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "PgenCounter"+ "'", str1.equals("PgenCounter"));

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test368"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    java.util.Enumeration<java.lang.Object> enumeration_obj3 = apacheXMLProvider0.elements();
    java.io.OutputStream outputStream4 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.store(outputStream4, "Nonce");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Apache XML Security Provider"+ "'", str2.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj3);

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test369"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    java.util.Collection<java.lang.Object> collection_obj9 = apacheXMLProvider0.values();
    byte[] byte_array11 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str12 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array11);
    java.lang.String str13 = org.apache.xml.security.utils.Base64.encode(byte_array11);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams14 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array11);
    boolean b15 = apacheXMLProvider0.containsValue((java.lang.Object)byte_array11);
    java.util.Enumeration<java.lang.Object> enumeration_obj16 = apacheXMLProvider0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str12.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "yTZ4mVI+6vI="+ "'", str13.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj16);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test370"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    org.w3c.dom.Document document3 = null;
    byte[] byte_array5 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array5);
    java.lang.String str7 = org.apache.xml.security.utils.Base64.encode(byte_array5);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams8 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array5);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams9 = keyTransportImpl_RSAOAEP_BC0.engineInit(document3, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams8);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str6.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "yTZ4mVI+6vI="+ "'", str7.equals("yTZ4mVI+6vI="));

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test371"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509Certificate xMLX509Certificate2 = new org.apache.xml.security.keys.content.x509.XMLX509Certificate(element0, "X509SKI");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test372"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray((short)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test373"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("                 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test374"); }

    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver dSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver6 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey7 = x509IssuerSerialResolver3.engineResolveSecretKey(element4, "subtract", storageResolver6);
    java.util.Iterator iterator8 = storageResolver6.getIterator();
    boolean b9 = storageResolver6.hasNext();
    java.security.cert.X509Certificate x509Certificate10 = dSAKeyValueResolver0.engineResolveX509Certificate(element1, "http://www.w3.org/2001/04/xmlenc#Content", storageResolver6);
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver13 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver16 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element17 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver19 = null;
    java.security.PublicKey publicKey20 = retrievalMethodResolver16.engineResolvePublicKey(element17, "subtract", storageResolver19);
    org.w3c.dom.Element element21 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver23 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element24 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver26 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey27 = x509IssuerSerialResolver23.engineResolveSecretKey(element24, "subtract", storageResolver26);
    java.security.cert.X509Certificate x509Certificate28 = retrievalMethodResolver16.engineResolveX509Certificate(element21, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver26);
    javax.crypto.SecretKey secretKey29 = rSAKeyValueResolver13.engineResolveSecretKey(element14, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver26);
    org.w3c.dom.Element element30 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver32 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element33 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver35 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element36 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver38 = null;
    java.security.PublicKey publicKey39 = retrievalMethodResolver35.engineResolvePublicKey(element36, "subtract", storageResolver38);
    org.w3c.dom.Element element40 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver42 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element43 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver45 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey46 = x509IssuerSerialResolver42.engineResolveSecretKey(element43, "subtract", storageResolver45);
    java.security.cert.X509Certificate x509Certificate47 = retrievalMethodResolver35.engineResolveX509Certificate(element40, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver45);
    javax.crypto.SecretKey secretKey48 = rSAKeyValueResolver32.engineResolveSecretKey(element33, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver45);
    javax.crypto.SecretKey secretKey49 = rSAKeyValueResolver13.engineResolveSecretKey(element30, "Transform", storageResolver45);
    java.security.PublicKey publicKey50 = dSAKeyValueResolver0.engineResolvePublicKey(element11, "http://www.w3.org/2000/09/xmldsig#enveloped-signature", storageResolver45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey50);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test375"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP1 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b2 = transformXPathFilterCHGP1.wantsOctetStream();
    boolean b3 = transformXPathFilterCHGP1.returnsNodeSet();
    boolean b4 = apacheXMLProvider0.containsKey((java.lang.Object)b3);
    java.lang.String str5 = apacheXMLProvider0.getName();
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    java.lang.Object[] obj_array18 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException19 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array18);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException20 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array18);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException21 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException20);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException22 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array12, (java.lang.Exception)invalidCanonicalizerException20);
    java.lang.String str23 = org.apache.xml.security.utils.I18n.translate("CarriedKeyName", obj_array12);
    java.lang.String str24 = org.apache.xml.security.utils.I18n.translate("Transforms", obj_array12);
    java.lang.Object[] obj_array27 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException28 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array27);
    java.lang.Exception exception29 = null;
    org.w3c.dom.Attr attr30 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException32 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array27, exception29, attr30, "KeyName");
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException33 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha256", obj_array12, (java.lang.Exception)resourceResolverException32);
    org.w3c.dom.Attr attr34 = null;
    resourceResolverException32.setURI(attr34);
    resourceResolverException32.setBaseURI("http://www.w3.org/2001/04/xmlenc#Element");
    java.lang.Object[] obj_array45 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException46 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array45);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException47 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array45);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException48 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array45);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException49 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array45);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException50 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("DigestMethod", obj_array45);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException51 = new org.apache.xml.security.signature.XMLSignatureException("JCAType", obj_array45);
    java.lang.Object[] obj_array58 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException59 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array58);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException60 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array58);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException61 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array58);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException62 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array58);
    java.lang.Object[] obj_array67 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException68 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array67);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException69 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array67);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException70 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array67);
    org.apache.xml.security.signature.Reference reference71 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException72 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array67, reference71);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException73 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array58, (java.lang.Exception)missingResourceFailureException72);
    java.lang.Object[] obj_array79 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException80 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array79);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException81 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array79);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException82 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array79);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException83 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array79);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException84 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array79);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException85 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array58, (java.lang.Exception)storageResolverException84);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException86 = new org.apache.xml.security.signature.ReferenceNotInitializedException("yTZ4mVI+6vI=", obj_array45, (java.lang.Exception)invalidDigestValueException85);
    java.lang.Object obj87 = apacheXMLProvider0.put((java.lang.Object)resourceResolverException32, (java.lang.Object)referenceNotInitializedException86);
    // The following exception was thrown during execution in test generation
    try {
    java.util.Enumeration<?> enumeration_wildcard88 = apacheXMLProvider0.propertyNames();
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
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
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str23.equals("No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str24.equals("No message with ID \"Transforms\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array58);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array79);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj87);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test376"); }

    sun.security.x509.X500Name x500Name4 = org.apache.xml.security.keys.content.x509.XMLX509SubjectName.createX500Name("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", "Y", "http://www.w3.org/2001/04/xmlenc#kw-tripledes", "Date");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(x500Name4);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test377"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    byte[] byte_array2 = xMLSignatureInput1.getBytes();
    java.lang.String str3 = xMLSignatureInput1.getMIMEType();
    org.apache.xpath.CachedXPathAPI cachedXPathAPI4 = xMLSignatureInput1.getCachedXPathAPI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedXPathAPI4);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test378"); }

    byte[] byte_array1 = ant.HexDump.toByteArray(128);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test379"); }

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
    x509CertificateResolver0.engineSetProperty("Encoding", "org/apache/xml/security/resource/xmlsecurity");
    java.lang.String[] str_array22 = x509CertificateResolver0.engineGetPropertyKeys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array22);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test380"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.c14n.Canonicalizer canonicalizer1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("http://www.w3.org/XML/1998/namespace");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test381"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((short)0);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    boolean b3 = xMLSignatureInput2.isInitialized();
    java.lang.String str4 = xMLSignatureInput2.getSourceURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test382"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem resolverLocalFilesystem0 = new org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem();
    org.w3c.dom.Attr attr1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = resolverLocalFilesystem0.engineResolve(attr1, "X509Data");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test383"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    byte[] byte_array3 = xMLSignatureInput1.getBytes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test384"); }

    org.apache.xml.security.transforms.implementations.TransformXPointer transformXPointer0 = new org.apache.xml.security.transforms.implementations.TransformXPointer();
    boolean b1 = transformXPointer0.returnsNodeSet();
    boolean b2 = transformXPointer0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test385"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    java.io.InputStream inputStream3 = xMLSignatureInput1.getOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream3);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test386"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    java.lang.Object[] obj_array13 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException14 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array13);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException15 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array13);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException16 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException15);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException17 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array7, (java.lang.Exception)invalidCanonicalizerException15);
    org.apache.xml.security.signature.Reference reference18 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException19 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array7, reference18);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException20 = new org.apache.xml.security.exceptions.XMLSecurityException("KeyReference", obj_array7);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException21 = new org.apache.xml.security.keys.storage.StorageResolverException("DataReference", obj_array7);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException22 = new org.apache.xml.security.signature.InvalidDigestValueException("Modulus", obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array13);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test387"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    byte[] byte_array10 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str11 = ant.HexDump.byteArrayToHexString(byte_array10);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput12 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array10);
    java.lang.String str13 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array10);
    java.lang.String str16 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array10, (int)'4', (int)(byte)-1);
    java.security.Key key17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key19 = keyWrapImpl_AES128_BC0.engineUnwrap(byte_array10, key17, "00 00 00 00 00 00 08 00 ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "FF 64 64 64 0A 00"+ "'", str11.equals("FF 64 64 64 0A 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "0000: FF 64 64 64 0A 00                                  .ddd..\n"+ "'", str13.equals("0000: FF 64 64 64 0A 00                                  .ddd..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + ""+ "'", str16.equals(""));

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test388"); }

    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException1 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("(.//. | .//@* | .//namespace::*)");

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test389"); }

    org.apache.xml.security.utils.Constants.configurationFile = "http://www.w3.org/2001/04/xmldsig-more#hmac-sha384";

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test390"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    org.w3c.dom.Document document1 = null;
    byte[] byte_array9 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str10 = ant.HexDump.byteArrayToHexString(byte_array9);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams11 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("", byte_array9);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams12 = keyWrapImpl_TRIPLEDES_BC0.engineInit(document1, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams11);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00 01 FF 64 64 00"+ "'", str10.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test391"); }

    int i3 = org.apache.xml.security.encryption.EncryptedData.min((int)(byte)10, 40, 6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 6);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test392"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    java.lang.String str3 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    java.security.Key key4 = null;
    java.security.Key key5 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array6 = blockEncryptionImpl_AES192_BC0.engineWrap(key4, key5);
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

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test393"); }

    org.apache.xml.security.signature.Reference reference1 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException2 = new org.apache.xml.security.signature.MissingResourceFailureException("Key", reference1);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test394"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(document0, "G");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test395"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    java.security.Key key3 = null;
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = blockEncryptionImpl_AES192_BC0.engineWrap(key3, key4);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test396"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.XMLUtils.getBytesFromElement(element0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test397"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider1.stringPropertyNames();
    java.util.Set<java.lang.String> set_str3 = apacheXMLProvider1.stringPropertyNames();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces4 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, (java.util.Set)set_str3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test398"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    java.security.Provider.Service service5 = apacheXMLProvider0.getService("SignatureMethod", "EncryptionProperty");
    java.util.Set<java.security.Provider.Service> set_service6 = apacheXMLProvider0.getServices();
    java.lang.String str7 = apacheXMLProvider0.getInfo();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(service5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "Apache XML Security Provider"+ "'", str7.equals("Apache XML Security Provider"));

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test399"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "http://www.w3.org/2000/09/xmldsig#hmac-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test400"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.AESWrapper aESWrapper1 = new org.apache.xml.security.algorithms.encryption.helper.AESWrapper(cipher0);
    byte[] byte_array3 = org.apache.xml.security.utils.PRNG.createBytes(64);
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = aESWrapper1.unwrap(byte_array3, key4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test401"); }

    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException1 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("DSAKeyValue");

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test402"); }

    java.lang.String str0 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.ALGO_ID_DIGEST_NOT_RECOMMENDED_MD5;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "http://www.w3.org/2001/04/xmldsig-more#md5"+ "'", str0.equals("http://www.w3.org/2001/04/xmldsig-more#md5"));

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test403"); }

    byte[] byte_array5 = new byte[] { (byte)100, (byte)1, (byte)10, (byte)-1, (byte)1 };
    java.lang.String str6 = ant.HexDump.toHexString(byte_array5);
    java.lang.String str8 = org.apache.xml.security.utils.Base64.encode(byte_array5, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "64 01 0A FF 01 "+ "'", str6.equals("64 01 0A FF 01 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "ZAEK/wE="+ "'", str8.equals("ZAEK/wE="));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test404"); }

    org.apache.xml.security.utils.PRNG pRNG0 = org.apache.xml.security.utils.PRNG.getInstance();
    java.security.SecureRandom secureRandom1 = pRNG0.getSecureRandom();
    boolean b2 = pRNG0.nextBoolean();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(secureRandom1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test405"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.setAttr(element0, "68#74#74#70#3A#2F#2F#77#77#77#2E#77#33#2E#6F#72#67#2F#32#30#30#31#2F#30#34#2F#78#6D#6C#65#6E#63#23#43#6F#6E#74#65#6E#74#", "SPKISexp");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test406"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.JavaUtils.getBytesFromFile("50 47 50 4B 65 79 50 61 63 6B 65 74 ");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test407"); }

    org.w3c.dom.Node node0 = null;
    java.io.OutputStream outputStream1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.outputDOM(node0, outputStream1, true);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test408"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException10 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array7);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException11 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array7);
    java.lang.Object[] obj_array16 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException17 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array16);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException18 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array16);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException19 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array16);
    org.apache.xml.security.signature.Reference reference20 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException21 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array16, reference20);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException22 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array7, (java.lang.Exception)missingResourceFailureException21);
    java.lang.Object[] obj_array28 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException29 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array28);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException30 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array28);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException31 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array28);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException32 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array28);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException33 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array28);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException34 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array7, (java.lang.Exception)storageResolverException33);
    org.apache.xml.security.signature.Reference reference35 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException36 = new org.apache.xml.security.signature.MissingResourceFailureException("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", obj_array7, reference35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test409"); }

    org.apache.xml.security.transforms.implementations.TransformXPointer transformXPointer0 = new org.apache.xml.security.transforms.implementations.TransformXPointer();
    boolean b1 = transformXPointer0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test410"); }

    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass providerIdClass1 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("http://www.w3.org/2001/04/xmlenc#aes192-cbc");
    java.lang.String str2 = providerIdClass1.getAlgorithmID();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(providerIdClass1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "AES/CBC/ISO10126PADDING"+ "'", str2.equals("AES/CBC/ISO10126PADDING"));

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test411"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverFragment resolverFragment0 = new org.apache.xml.security.utils.resolver.implementations.ResolverFragment();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverFragment0);
    java.util.Map map2 = null;
    // The following exception was thrown during execution in test generation
    try {
    resolverFragment0.engineAddProperies(map2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test412"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments transformC14NExclusiveWithComments0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments();
    boolean b1 = transformC14NExclusiveWithComments0.returnsNodeSet();
    boolean b2 = transformC14NExclusiveWithComments0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test413"); }

    org.apache.xml.security.utils.ElementProxy.setDefaultPrefix("http://www.w3.org/2001/10/xml-exc-c14n#", "http://www.w3.org/2000/xmlns/");

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test414"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test415"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverXPointer resolverXPointer0 = new org.apache.xml.security.utils.resolver.implementations.ResolverXPointer();
    org.w3c.dom.Attr attr1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput3 = resolverXPointer0.engineResolve(attr1, "G");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test416"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((short)0);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array1);
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.toHexString(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "00#00#"+ "'", str3.equals("00#00#"));

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test417"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceSubtract(document0, "FF ");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test418"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_MGMTDATA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MgmtData"+ "'", str0.equals("MgmtData"));

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test419"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("", "http://www.w3.org/2001/04/xmlenc#aes192-cbc");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test420"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    java.security.Provider.Service service5 = apacheXMLProvider0.getService("SignatureMethod", "EncryptionProperty");
    java.util.Collection<java.lang.Object> collection_obj6 = apacheXMLProvider0.values();
    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP7 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver8 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP7);
    boolean b10 = resourceResolver8.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider11 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver8.addProperties((java.util.Map)apacheXMLProvider11);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath13 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj14 = apacheXMLProvider11.remove((java.lang.Object)transformXPath13);
    boolean b15 = apacheXMLProvider0.containsKey((java.lang.Object)apacheXMLProvider11);
    java.lang.Object obj17 = apacheXMLProvider11.get((java.lang.Object)"C9 36 78 99 52 3E EA F2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(service5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj17);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test421"); }

    byte[] byte_array1 = ant.HexDump.hexStringToByteArray("No message with ID \"Key\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test422"); }

    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException1 = new org.apache.xml.security.c14n.CanonicalizationException("No message with ID \"URI\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test423"); }

    org.apache.xml.security.transforms.Transform.register("yTZ4mVI+6vI=", "http://www.w3.org/2001/04/xmldsig-more#sha384");

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test424"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = resourceResolver1.understandsProperty("");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider8 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str9 = apacheXMLProvider8.stringPropertyNames();
    java.lang.String str10 = apacheXMLProvider8.getInfo();
    java.util.Enumeration<java.lang.Object> enumeration_obj11 = apacheXMLProvider8.elements();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider8);
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider13 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str14 = apacheXMLProvider13.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj15 = apacheXMLProvider13.entrySet();
    java.security.Provider.Service service18 = apacheXMLProvider13.getService("SignatureMethod", "EncryptionProperty");
    java.util.Collection<java.lang.Object> collection_obj19 = apacheXMLProvider13.values();
    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP20 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver21 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP20);
    boolean b23 = resourceResolver21.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider24 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver21.addProperties((java.util.Map)apacheXMLProvider24);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath26 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj27 = apacheXMLProvider24.remove((java.lang.Object)transformXPath26);
    boolean b28 = apacheXMLProvider13.containsKey((java.lang.Object)apacheXMLProvider24);
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "Apache XML Security Provider"+ "'", str10.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(service18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b28 == false);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test425"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    int i3 = blockEncryptionImpl_AES192_BC0.engineGetIvLength();
    org.w3c.dom.Element element4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams5 = blockEncryptionImpl_AES192_BC0.engineInit(element4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 16);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test426"); }

    java.lang.String str1 = ant.HexDump.toHexString((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "01 "+ "'", str1.equals("01 "));

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test427"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("0000: 4D 61 6E 69 66 65 73 74                            Manifest\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 4D 61 6E 69 66 65 73 74                            Manifest\n"+ "'", str1.equals("0000: 4D 61 6E 69 66 65 73 74                            Manifest\n"));

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test428"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous9 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(inputStream7);
    org.w3c.dom.Attr attr10 = null;
    boolean b12 = resolverAnonymous9.engineCanResolve(attr10, "XPath");
    org.w3c.dom.Attr attr13 = null;
    boolean b15 = resolverAnonymous9.engineCanResolve(attr13, "SignedInfo");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test429"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.ProtectionParameter protectionParameter4 = null;
    java.security.KeyStore.Entry entry5 = apacheKeyStore0.engineGetEntry("ds", protectionParameter4);
    byte[] byte_array8 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str9 = org.apache.xml.security.utils.HexDump.toHexString(byte_array8);
    java.security.cert.Certificate[] certificate_array10 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("", byte_array8, certificate_array10);
    byte[] byte_array15 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str16 = ant.HexDump.toString(byte_array15);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams17 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("http://www.w3.org/2000/09/xmldsig#rawX509Certificate", byte_array15);
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore18 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream19 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore20 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter21 = null;
    apacheKeyStore20.engineLoad(loadStoreParameter21);
    java.io.InputStream inputStream23 = null;
    char[] char_array28 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore20.engineLoad(inputStream23, char_array28);
    apacheKeyStore18.engineLoad(inputStream19, char_array28);
    byte[] byte_array34 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str35 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array34);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array34);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams37 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array34);
    java.lang.String str38 = ant.HexDump.toBinaryString(byte_array34);
    java.lang.String str39 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array34);
    java.lang.String str40 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array34);
    java.security.cert.Certificate[] certificate_array41 = new java.security.cert.Certificate[] {  };
    apacheKeyStore18.engineSetKeyEntry("Encoding", byte_array34, certificate_array41);
    apacheKeyStore0.engineSetKeyEntry("", byte_array15, certificate_array41);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str46 = ant.HexDump.toHexString(byte_array15, 2048, 92);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str9.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "\u0000\u0000\u0000 "+ "'", str16.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str35.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str38.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str39.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str40.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array41);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test430"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.keyresolver.KeyResolver keyResolver1 = org.apache.xml.security.keys.keyresolver.KeyResolver.item((int)(short)1);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test431"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean b1 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    boolean b2 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    java.lang.String str3 = canonicalizer20010315ExclWithComments0.engineGetURI();
    org.w3c.dom.Element element4 = null;
    // The following exception was thrown during execution in test generation
    try {
    boolean b6 = canonicalizer20010315ExclWithComments0.utilizedOrIncluded(element4, "http://www.w3.org/2000/09/xmldsig#dsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#WithComments"+ "'", str3.equals("http://www.w3.org/2001/10/xml-exc-c14n#WithComments"));

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test432"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createDSctx(document0, "(.//. | .//@* | .//namespace::*)[not(self::comment())]", "http://www.w3.org/1999/XSL/Transform");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test433"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyTypeFromURI("EncryptionProperty");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test434"); }

    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException1 = new org.apache.xml.security.signature.ReferenceNotInitializedException("68 74 74 70 3A 2F 2F 77 77 77 2E 77 33 2E 6F 72 67 2F 32 30 30 30 2F 30 39 2F 78 6D 6C 64 73 69 67 23 58 35 30 39 44 61 74 61 ");

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test435"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str4 = org.apache.xml.security.utils.HexDump.toHexString(byte_array3);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array3);
    byte[] byte_array12 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str13 = ant.HexDump.byteArrayToHexString(byte_array12);
    boolean b14 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array3, byte_array12);
    byte[] byte_array17 = pKCS15Cipher1.processBlock(byte_array3, (int)' ', (int)(byte)1);
    byte[] byte_array19 = org.apache.xml.security.keys.provider.KeyElement.salt;
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("004004004004004004004004", byte_array19);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array23 = pKCS15Cipher1.encodeBlock(byte_array19, (int)(byte)-1, 6);
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
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test436"); }

    byte[] byte_array4 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.toHexString(byte_array4);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array4);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException8 = new org.apache.xml.security.signature.InvalidDigestValueException("URI");
    byte[] byte_array10 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str11 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array10);
    java.lang.String str12 = org.apache.xml.security.utils.Base64.encode(byte_array10);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams13 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array10);
    byte[] byte_array14 = oAEPParams13.getOAEPParamBytes();
    java.lang.String str15 = ant.HexDump.byteArrayToHexString(byte_array14);
    java.lang.Object[] obj_array21 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException22 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array21);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException23 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array21);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException24 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array21);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException25 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array21);
    java.lang.Object[] obj_array28 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException29 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array28);
    java.lang.Object[] obj_array32 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException33 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array32);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException34 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array32);
    algorithmAlreadyRegisteredException29.addSuppressed((java.lang.Throwable)invalidCanonicalizerException34);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException36 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("ds", (java.lang.Exception)algorithmAlreadyRegisteredException29);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException37 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("X.509", obj_array21, (java.lang.Exception)algorithmAlreadyRegisteredException29);
    java.lang.Object[] obj_array38 = new java.lang.Object[] { xMLSignatureInput6, "URI", str15, keyResolverException37 };
    org.apache.xml.security.transforms.TransformationException transformationException39 = new org.apache.xml.security.transforms.TransformationException("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", obj_array38);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException40 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("", obj_array38);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException41 = new org.apache.xml.security.transforms.InvalidTransformException("Certificate", obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str5.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str11.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "yTZ4mVI+6vI="+ "'", str12.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "C9 36 78 99 52 3E EA F2"+ "'", str15.equals("C9 36 78 99 52 3E EA F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test437"); }

    byte[] byte_array0 = null;
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    boolean b9 = org.apache.xml.security.utils.JavaUtils.binaryCompare(byte_array0, byte_array7);
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
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test438"); }

    javax.crypto.Cipher cipher0 = null;
    org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher pKCS15Cipher1 = new org.apache.xml.security.algorithms.encryption.helper.PKCS15Cipher(cipher0);
    byte[] byte_array3 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str4 = ant.HexDump.toString(byte_array3);
    java.lang.String str5 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array3);
    byte[] byte_array8 = pKCS15Cipher1.processBlock(byte_array3, 128, 100);
    java.security.Key key10 = null;
    org.apache.xml.security.utils.PRNG pRNG11 = org.apache.xml.security.utils.PRNG.getInstance();
    java.security.SecureRandom secureRandom12 = pRNG11.getSecureRandom();
    // The following exception was thrown during execution in test generation
    try {
    pKCS15Cipher1.init((-1), key10, secureRandom12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "\u0000\u0000\u0000 "+ "'", str4.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: 00 00 00 20                                        ... \n"+ "'", str5.equals("0000: 00 00 00 20                                        ... \n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(secureRandom12);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test439"); }

    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver0.engineSetProperty("X509IssuerName", "P");
    java.lang.String str5 = retrievalMethodResolver0.engineGetProperty("http://www.w3.org/2000/09/xmldsig#MgmtData");
    org.w3c.dom.Element element6 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver8 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element9 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver11 = null;
    java.security.PublicKey publicKey12 = retrievalMethodResolver8.engineResolvePublicKey(element9, "subtract", storageResolver11);
    org.w3c.dom.Element element13 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver15 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element16 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver18 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey19 = x509IssuerSerialResolver15.engineResolveSecretKey(element16, "subtract", storageResolver18);
    java.security.cert.X509Certificate x509Certificate20 = retrievalMethodResolver8.engineResolveX509Certificate(element13, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver18);
    javax.crypto.SecretKey secretKey21 = retrievalMethodResolver0.engineResolveSecretKey(element6, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments", storageResolver18);
    java.security.cert.X509Certificate x509Certificate22 = null;
    org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver singleCertificateResolver23 = new org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver(x509Certificate22);
    storageResolver18.add((org.apache.xml.security.keys.storage.StorageResolverSpi)singleCertificateResolver23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey21);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test440"); }

    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException10 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array8);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException11 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array8);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException12 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException13 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("DigestMethod", obj_array8);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException14 = new org.apache.xml.security.signature.XMLSignatureException("JCAType", obj_array8);
    java.lang.String str15 = xMLSignatureException14.toString();
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException16 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("http://www.w3.org/2001/04/xmlenc#aes192-cbc", (java.lang.Exception)xMLSignatureException14);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException17 = new org.apache.xml.security.signature.InvalidDigestValueException("3240041E4CC4144204014034154CE4", (java.lang.Exception)xMLSignatureException14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "org.apache.xml.security.signature.XMLSignatureException: No message with ID \"JCAType\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str15.equals("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"JCAType\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test441"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((int)(short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test442"); }

    byte[] byte_array0 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str1 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array0);
    java.lang.String str2 = org.apache.xml.security.utils.Base64.encode(byte_array0);
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.byteArrayToBinaryString(byte_array0);
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array0, (int)(short)1, (int)(byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str1.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "yTZ4mVI+6vI="+ "'", str2.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "+ "'", str3.equals("aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "36"+ "'", str6.equals("36"));

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test443"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "KeyValue", "yTZ4mVI+6vI=");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test444"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = resourceResolver1.understandsProperty("");
    java.lang.String[] str_array8 = resourceResolver1.getPropertyKeys();
    resourceResolver1.setProperty("No message with ID \"URI\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.transforms.TransformationException and message No message with ID \"http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", "");
    resourceResolver1.setProperty("Date", "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test445"); }

    java.lang.Object[] obj_array2 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException3 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array2);
    java.lang.Exception exception4 = null;
    org.w3c.dom.Attr attr5 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException7 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array2, exception4, attr5, "KeyName");
    org.w3c.dom.Attr attr8 = null;
    resourceResolverException7.setURI(attr8);
    org.w3c.dom.Attr attr10 = resourceResolverException7.getURI();
    resourceResolverException7.setBaseURI("\uFFFD6x\uFFFDR>\uFFFD");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(attr10);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test446"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    byte[] byte_array16 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str17 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array16);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array16);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams19 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array16);
    java.lang.String str20 = ant.HexDump.toBinaryString(byte_array16);
    java.lang.String str21 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array16);
    java.lang.String str22 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array16);
    java.security.cert.Certificate[] certificate_array23 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("Encoding", byte_array16, certificate_array23);
    java.security.KeyStore.ProtectionParameter protectionParameter26 = null;
    java.security.KeyStore.Entry entry27 = apacheKeyStore0.engineGetEntry("00 00 00 34 ", protectionParameter26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str17.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str20.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str21.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str22.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry27);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test447"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem resolverLocalFilesystem0 = new org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem();
    resolverLocalFilesystem0.engineSetProperty("CarriedKeyName", "hi!");
    org.w3c.dom.Attr attr4 = null;
    boolean b6 = resolverLocalFilesystem0.engineCanResolve(attr4, "http://www.w3.org/2000/09/xmldsig#");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider7 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str8 = apacheXMLProvider7.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj9 = apacheXMLProvider7.entrySet();
    java.lang.String str11 = apacheXMLProvider7.getProperty("2.5.29.14");
    resolverLocalFilesystem0.engineAddProperies((java.util.Map)apacheXMLProvider7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test448"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    int i3 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == (-1));

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test449"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    java.util.Collection<java.lang.Object> collection_obj9 = apacheXMLProvider0.values();
    byte[] byte_array11 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str12 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array11);
    java.lang.String str13 = org.apache.xml.security.utils.Base64.encode(byte_array11);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams14 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array11);
    boolean b15 = apacheXMLProvider0.containsValue((java.lang.Object)byte_array11);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput16 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str12.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "yTZ4mVI+6vI="+ "'", str13.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test450"); }

    org.w3c.dom.Node node0 = null;
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider1.stringPropertyNames();
    java.lang.String str3 = apacheXMLProvider1.toString();
    java.util.Set<java.lang.Object> set_obj4 = apacheXMLProvider1.keySet();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider5 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str6 = apacheXMLProvider5.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj7 = apacheXMLProvider5.entrySet();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput9 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b10 = xMLSignatureInput9.isInitialized();
    java.lang.String str11 = xMLSignatureInput9.getSourceURI();
    org.apache.xpath.CachedXPathAPI cachedXPathAPI12 = xMLSignatureInput9.getCachedXPathAPI();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput13 = new org.apache.xml.security.signature.XMLSignatureInput((java.util.Set)set_entry_obj_obj7, cachedXPathAPI12);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput14 = new org.apache.xml.security.signature.XMLSignatureInput((java.util.Set)set_obj4, cachedXPathAPI12);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput15 = new org.apache.xml.security.signature.XMLSignatureInput(node0, cachedXPathAPI12);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "ApacheXML version 1.0"+ "'", str3.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedXPathAPI12);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test451"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    double d3 = apacheXMLProvider0.getVersion();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d3 == 1.0d);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test452"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    int i1 = keyTransportImpl_RSAOAEP_BC0.engineGetIvLength();
    byte[] byte_array2 = null;
    java.security.Key key3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = keyTransportImpl_RSAOAEP_BC0.engineEncrypt(byte_array2, key3);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test453"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "SignatureValue", "");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test454"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("XPathAlternative");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test455"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.JavaUtils.getBytesFromFile("http://www.w3.org/2001/04/xmlenc#aes192-cbc");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test456"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.ProtectionParameter protectionParameter4 = null;
    java.security.KeyStore.Entry entry5 = apacheKeyStore0.engineGetEntry("ds", protectionParameter4);
    byte[] byte_array8 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str9 = org.apache.xml.security.utils.HexDump.toHexString(byte_array8);
    java.security.cert.Certificate[] certificate_array10 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("", byte_array8, certificate_array10);
    java.security.cert.Certificate[] certificate_array13 = apacheKeyStore0.engineGetCertificateChain("hi!");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str9.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array13);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test457"); }

    org.apache.xml.security.transforms.implementations.TransformC14N transformC14N0 = new org.apache.xml.security.transforms.implementations.TransformC14N();
    boolean b1 = transformC14N0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test458"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverFragment resolverFragment0 = new org.apache.xml.security.utils.resolver.implementations.ResolverFragment();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverFragment0);
    java.lang.String str3 = resourceResolver1.getProperty("Methods");
    resourceResolver1.setProperty("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter", "No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test459"); }

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
    java.lang.Object[] obj_array30 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException31 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array30);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException32 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array30);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException33 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array30);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException34 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array30);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException35 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("DigestMethod", obj_array30);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException36 = new org.apache.xml.security.signature.XMLSignatureException("JCAType", obj_array30);
    java.lang.Object[] obj_array43 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException44 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array43);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException45 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array43);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException46 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array43);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException47 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array43);
    java.lang.Object[] obj_array52 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException53 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array52);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException54 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array52);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException55 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array52);
    org.apache.xml.security.signature.Reference reference56 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException57 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array52, reference56);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException58 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array43, (java.lang.Exception)missingResourceFailureException57);
    java.lang.Object[] obj_array64 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException65 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array64);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException66 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array64);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException67 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array64);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException68 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array64);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException69 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array64);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException70 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array43, (java.lang.Exception)storageResolverException69);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException71 = new org.apache.xml.security.signature.ReferenceNotInitializedException("yTZ4mVI+6vI=", obj_array30, (java.lang.Exception)invalidDigestValueException70);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException72 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("Encoding", obj_array8, (java.lang.Exception)referenceNotInitializedException71);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException73 = new org.apache.xml.security.signature.InvalidDigestValueException("\n", (java.lang.Exception)invalidCipherTextException72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test460"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore1 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream2 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore3 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter4 = null;
    apacheKeyStore3.engineLoad(loadStoreParameter4);
    java.io.InputStream inputStream6 = null;
    char[] char_array11 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore3.engineLoad(inputStream6, char_array11);
    apacheKeyStore1.engineLoad(inputStream2, char_array11);
    java.util.Date date15 = apacheKeyStore1.engineGetCreationDate("Xalan Java 2.5.1");
    byte[] byte_array18 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array19 = new java.security.cert.Certificate[] {  };
    apacheKeyStore1.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array18, certificate_array19);
    byte[] byte_array22 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str23 = org.apache.xml.security.utils.HexDump.toHexString(byte_array22);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput24 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array22);
    byte[] byte_array31 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str32 = ant.HexDump.byteArrayToHexString(byte_array31);
    boolean b33 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array22, byte_array31);
    boolean b34 = org.apache.xml.security.algorithms.MessageDigestAlgorithm.isEqual(byte_array18, byte_array31);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherValue cipherValue35 = new org.apache.xml.security.encryption.CipherValue(document0, byte_array31);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str23.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "00 01 FF 64 64 00"+ "'", str32.equals("00 01 FF 64 64 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b33 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b34 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test461"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.KeyStoreElement keyStoreElement2 = new org.apache.xml.security.keys.provider.KeyStoreElement(element0, "org/apache/xml/security/resource");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test462"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.ProtectionParameter protectionParameter4 = null;
    java.security.KeyStore.Entry entry5 = apacheKeyStore0.engineGetEntry("ds", protectionParameter4);
    java.security.cert.Certificate[] certificate_array7 = apacheKeyStore0.engineGetCertificateChain("KeyName");
    java.security.KeyStore.ProtectionParameter protectionParameter9 = null;
    java.security.KeyStore.Entry entry10 = apacheKeyStore0.engineGetEntry("FF#", protectionParameter9);
    apacheKeyStore0.engineDeleteEntry("");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry10);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test463"); }

    org.w3c.dom.Document document0 = null;
    org.w3c.dom.Node node2 = null;
    org.w3c.dom.NodeList nodeList3 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node2);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform4 = org.apache.xml.security.transforms.Transform.getInstance(document0, "(.//. | .//@* | .//namespace::*)[not(self::comment())]", nodeList3);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList3);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test464"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream3 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore4 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter5 = null;
    apacheKeyStore4.engineLoad(loadStoreParameter5);
    java.io.InputStream inputStream7 = null;
    char[] char_array12 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore4.engineLoad(inputStream7, char_array12);
    apacheKeyStore2.engineLoad(inputStream3, char_array12);
    java.util.Date date16 = apacheKeyStore2.engineGetCreationDate("Xalan Java 2.5.1");
    byte[] byte_array19 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array20 = new java.security.cert.Certificate[] {  };
    apacheKeyStore2.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array19, certificate_array20);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException23 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("union");
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException24 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("Type", (java.lang.Object[])certificate_array20, (java.lang.Exception)contentHandlerAlreadyRegisteredException23);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException25 = new org.apache.xml.security.c14n.CanonicalizationException("(.//. | .//@* | .//namespace::*)", (java.lang.Exception)contentHandlerAlreadyRegisteredException24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array20);

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test465"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem resolverLocalFilesystem0 = new org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem();
    resolverLocalFilesystem0.engineSetProperty("CarriedKeyName", "hi!");
    org.w3c.dom.Attr attr4 = null;
    boolean b6 = resolverLocalFilesystem0.engineCanResolve(attr4, "http://www.w3.org/2000/09/xmldsig#");
    resolverLocalFilesystem0.engineSetProperty("http://www.w3.org/2001/10/xml-exc-c14n#", "http://www.w3.org/2001/04/xmldsig-more#hmac-sha256");
    org.w3c.dom.Attr attr10 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput12 = resolverLocalFilesystem0.engineResolve(attr10, "P");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test466"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.makeFilesystemToURI("X509IssuerSerial");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test467"); }

    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
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
    javax.crypto.SecretKey secretKey16 = rSAKeyValueResolver0.engineResolveSecretKey(element1, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver13);
    java.security.KeyStore keyStore17 = null;
    // The following exception was thrown during execution in test generation
    try {
    storageResolver13.add(keyStore17);
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
    org.junit.Assert.assertNull(secretKey16);

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test468"); }

    java.lang.Object[] obj_array4 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException5 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array4);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException6 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array4);
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array10);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException13 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException12);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException14 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array4, (java.lang.Exception)invalidCanonicalizerException12);
    org.apache.xml.security.signature.Reference reference15 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException16 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array4, reference15);
    org.apache.xml.security.signature.Reference reference17 = missingResourceFailureException16.getReference();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reference17);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test469"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceUnion(document0, "Modulus");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test470"); }

    javax.crypto.Cipher cipher0 = null;
    java.security.MessageDigest messageDigest1 = null;
    org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper tripleDESWrapper2 = new org.apache.xml.security.algorithms.encryption.helper.TripleDESWrapper(cipher0, messageDigest1);
    byte[] byte_array9 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str10 = ant.HexDump.byteArrayToHexString(byte_array9);
    java.security.Key key11 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array12 = tripleDESWrapper2.unwrap(byte_array9, key11);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "00 01 FF 64 64 00"+ "'", str10.equals("00 01 FF 64 64 00"));

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test471"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transforms transforms2 = new org.apache.xml.security.transforms.Transforms(element0, "No message with ID \"http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test472"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
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
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test473"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter transformXPath2Filter0 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter();
    boolean b1 = transformXPath2Filter0.returnsOctetStream();
    boolean b2 = transformXPath2Filter0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test474"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.Manifest manifest2 = new org.apache.xml.security.signature.Manifest(element0, "No message with ID &quot;KeyName&quot; found in resource bundle &quot;org/apache/xml/security/resource/xmlsecurity&quot;");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test475"); }

    org.apache.xml.security.utils.Constants.setSignatureSpecNSprefix("CanonicalizationMethod");

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test476"); }

    java.math.BigInteger bigInteger0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str1 = org.apache.xml.security.utils.Base64.encode(bigInteger0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test477"); }

    org.apache.xml.security.c14n.helper.C14nNodeFilter c14nNodeFilter1 = new org.apache.xml.security.c14n.helper.C14nNodeFilter(false);
    org.w3c.dom.Node node2 = null;
    short s3 = c14nNodeFilter1.acceptNode(node2);
    org.w3c.dom.Node node4 = null;
    short s5 = c14nNodeFilter1.acceptNode(node4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s3 == (short)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(s5 == (short)2);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test478"); }

    java.lang.String str1 = org.apache.xml.security.utils.XMLUtils.getNodeTypeString((short)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + ""+ "'", str1.equals(""));

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test479"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter04 transformXPath2Filter040 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter04();
    boolean b1 = transformXPath2Filter040.returnsOctetStream();
    boolean b2 = transformXPath2Filter040.returnsOctetStream();
    boolean b3 = transformXPath2Filter040.returnsOctetStream();
    boolean b4 = transformXPath2Filter040.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test480"); }

    org.apache.xml.security.utils.PRNG pRNG0 = org.apache.xml.security.utils.PRNG.getInstance();
    byte[] byte_array7 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array7);
    pRNG0.nextBytes(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FF 64 64 64 0A 00"+ "'", str8.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test481"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    int i1 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    java.lang.String str3 = keyWrapImpl_AES256_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test482"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore1 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream2 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore3 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter4 = null;
    apacheKeyStore3.engineLoad(loadStoreParameter4);
    java.io.InputStream inputStream6 = null;
    char[] char_array11 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore3.engineLoad(inputStream6, char_array11);
    apacheKeyStore1.engineLoad(inputStream2, char_array11);
    java.util.Date date15 = apacheKeyStore1.engineGetCreationDate("Xalan Java 2.5.1");
    byte[] byte_array18 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    java.security.cert.Certificate[] certificate_array19 = new java.security.cert.Certificate[] {  };
    apacheKeyStore1.engineSetKeyEntry("32#00#1E#CC#14#20#01#03#15#CE#", byte_array18, certificate_array19);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509CRL xMLX509CRL21 = new org.apache.xml.security.keys.content.x509.XMLX509CRL(document0, byte_array18);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(date15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array19);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test483"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData2 = new org.apache.xml.security.encryption.CipherData(element0, "http://www.w3.org/2002/06/xmldsig-filter2");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test484"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("53 69 67 6E 61 74 75 72 65 50 72 6F 70 65 72 74 69 65 73 ", "KeyInfo");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "53 69 67 6E 61 74 75 72 65 50 72 6F 70 65 72 74 69 65 73 "+ "'", str2.equals("53 69 67 6E 61 74 75 72 65 50 72 6F 70 65 72 74 69 65 73 "));

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test485"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptionProperty encryptionProperty2 = new org.apache.xml.security.encryption.EncryptionProperty(element0, "2.5.29.14");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test486"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException10 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array7);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException11 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("DigestMethod", obj_array7);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException13 = new org.apache.xml.security.signature.XMLSignatureException("JCAType", obj_array7);
    java.lang.String str14 = xMLSignatureException13.toString();
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException15 = new org.apache.xml.security.signature.XMLSignatureException("yTZ4mVI+6vI=", (java.lang.Exception)xMLSignatureException13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "org.apache.xml.security.signature.XMLSignatureException: No message with ID \"JCAType\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str14.equals("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"JCAType\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test487"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._ATT_MIMETYPE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "MimeType"+ "'", str0.equals("MimeType"));

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test488"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP2 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    resolverDirectHTTP2.engineSetProperty("", "Modulus");
    java.lang.String[] str_array6 = resolverDirectHTTP2.engineGetPropertyKeys();
    org.w3c.dom.Attr attr7 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException9 = new org.apache.xml.security.utils.resolver.ResourceResolverException("RSAKeyValue", (java.lang.Object[])str_array6, attr7, "http://www.w3.org/2001/04/xmlenc#sha256");
    org.w3c.dom.Attr attr10 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException12 = new org.apache.xml.security.utils.resolver.ResourceResolverException("http://www.w3.org/2001/04/xmlenc#kw-aes128", (java.lang.Exception)resourceResolverException9, attr10, "http://www.w3.org/2001/04/xmlenc#rsa-1_5");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test489"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "\uFFFD", (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test490"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverFragment resolverFragment0 = new org.apache.xml.security.utils.resolver.implementations.ResolverFragment();
    org.w3c.dom.Attr attr1 = null;
    boolean b3 = resolverFragment0.engineCanResolve(attr1, "KeyName");
    org.w3c.dom.Attr attr4 = null;
    boolean b6 = resolverFragment0.engineCanResolve(attr4, "C9:36");
    org.w3c.dom.Attr attr7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput9 = resolverFragment0.engineResolve(attr7, "CertificateChain");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test491"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP1 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP1);
    boolean b4 = resourceResolver2.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider5 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver2.addProperties((java.util.Map)apacheXMLProvider5);
    boolean b8 = resourceResolver2.understandsProperty("");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider9 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str10 = apacheXMLProvider9.stringPropertyNames();
    java.lang.String str11 = apacheXMLProvider9.getInfo();
    java.util.Enumeration<java.lang.Object> enumeration_obj12 = apacheXMLProvider9.elements();
    resourceResolver2.addProperties((java.util.Map)apacheXMLProvider9);
    java.lang.String[] str_array14 = resourceResolver2.getPropertyKeys();
    java.lang.Object[] obj_array20 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException21 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array20);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array20);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException23 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array20);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException24 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array20);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException25 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("X509IssuerName", (java.lang.Exception)keyResolverException24);
    boolean b27 = org.apache.xml.security.utils.JavaUtils.implementsInterface((java.lang.Object)keyResolverException24, "J");
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException28 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("X509SerialNumber", (java.lang.Object[])str_array14, (java.lang.Exception)keyResolverException24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Apache XML Security Provider"+ "'", str11.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test492"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = resourceResolver1.understandsProperty("");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider8 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.lang.String str10 = apacheXMLProvider8.getProperty("http://www.w3.org/XML/1998/namespace");
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider8);
    java.lang.Object obj12 = apacheXMLProvider8.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test493"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    byte[] byte_array3 = ant.HexDump.toByteArray(1);
    byte[] byte_array4 = org.apache.xml.security.utils.Base64.decode(byte_array3);
    java.security.Key key5 = null;
    byte[] byte_array7 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array7);
    java.lang.String str9 = org.apache.xml.security.utils.Base64.encode(byte_array7);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams10 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array7);
    byte[] byte_array12 = ant.HexDump.toByteArray(1);
    boolean b13 = org.apache.xml.security.utils.JavaUtils.binaryCompare(byte_array7, byte_array12);
    java.lang.String str14 = org.apache.xml.security.utils.HexDump.toBinaryString(byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array15 = keyWrapImpl_AES128_BC0.engineEncrypt(byte_array3, key5, byte_array7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#kw-aes128"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#kw-aes128"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str8.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "yTZ4mVI+6vI="+ "'", str9.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str14 + "' != '" + "aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "+ "'", str14.equals("aa  a  a#  aa aa # aaaa   #a  aa  a# a a  a #  aaaaa #aaa a a #aaaa  a "));

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test494"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey4 = x509IssuerSerialResolver0.engineResolveSecretKey(element1, "subtract", storageResolver3);
    org.w3c.dom.Element element5 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver rSAKeyValueResolver7 = new org.apache.xml.security.keys.keyresolver.implementations.RSAKeyValueResolver();
    org.w3c.dom.Element element8 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver10 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element11 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver13 = null;
    java.security.PublicKey publicKey14 = retrievalMethodResolver10.engineResolvePublicKey(element11, "subtract", storageResolver13);
    org.w3c.dom.Element element15 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver17 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element18 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver20 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey21 = x509IssuerSerialResolver17.engineResolveSecretKey(element18, "subtract", storageResolver20);
    java.security.cert.X509Certificate x509Certificate22 = retrievalMethodResolver10.engineResolveX509Certificate(element15, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver20);
    javax.crypto.SecretKey secretKey23 = rSAKeyValueResolver7.engineResolveSecretKey(element8, "http://www.w3.org/2000/09/xmldsig#sha1", storageResolver20);
    javax.crypto.SecretKey secretKey24 = x509IssuerSerialResolver0.engineResolveSecretKey(element5, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", storageResolver20);
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver27 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element28 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver30 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey31 = x509IssuerSerialResolver27.engineResolveSecretKey(element28, "subtract", storageResolver30);
    java.util.Iterator iterator32 = storageResolver30.getIterator();
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate33 = x509IssuerSerialResolver0.engineResolveX509Certificate(element25, "http://www.w3.org/TR/1999/REC-xpath-19991116", storageResolver30);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.keys.keyresolver.KeyResolverException");
    } catch (org.apache.xml.security.keys.keyresolver.KeyResolverException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator32);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test495"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    resourceResolver1.setProperty("http://www.w3.org/2001/10/xml-exc-c14n#", "http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider7 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str8 = apacheXMLProvider7.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj9 = apacheXMLProvider7.entrySet();
    java.security.Provider.Service service12 = apacheXMLProvider7.getService("SignatureMethod", "EncryptionProperty");
    java.util.Collection<java.lang.Object> collection_obj13 = apacheXMLProvider7.values();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(service12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(collection_obj13);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test496"); }

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
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException19 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("ks", obj_array6);
    java.lang.Object[] obj_array25 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException26 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array25);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException27 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array25);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException28 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array25);
    java.lang.Object[] obj_array33 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException34 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array33);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException35 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array33);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException36 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array33);
    java.lang.Object[] obj_array40 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException41 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array40);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException42 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array40);
    java.lang.Object[] obj_array46 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException47 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array46);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException48 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array46);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException49 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException48);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException50 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array40, (java.lang.Exception)invalidCanonicalizerException48);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException51 = new org.apache.xml.security.signature.InvalidDigestValueException("PgenCounter", obj_array33, (java.lang.Exception)xMLSecurityException50);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException52 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2000/09/xmldsig#rsa-sha1", obj_array25, (java.lang.Exception)xMLSecurityException50);
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException53 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("(.//. | .//@* | .//namespace::*)", (java.lang.Exception)xMLSecurityException50);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException54 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("http://www.w3.org/2000/09/xmldsig#Object", obj_array6, (java.lang.Exception)algorithmAlreadyRegisteredException53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test497"); }

    int i1 = org.apache.xml.security.algorithms.JCEMapper.getKeyLengthFromURI("00400400420");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test498"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    int i1 = keyTransportImpl_RSAOAEP_BC0.engineGetIvLength();
    byte[] byte_array3 = ant.HexDump.toByteArray(1);
    byte[] byte_array4 = org.apache.xml.security.utils.Base64.decode(byte_array3);
    java.lang.String str5 = ant.HexDump.prettyPrintHex(byte_array4);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key8 = keyTransportImpl_RSAOAEP_BC0.engineUnwrap(byte_array4, key6, "http://www.certicom.com/2000/11/xmlecdsig#ecdsa-sha1");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "0000: FB EF BF                                           ...\n"+ "'", str5.equals("0000: FB EF BF                                           ...\n"));

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test499"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((long)64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test500"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyValue keyValue2 = new org.apache.xml.security.keys.content.KeyValue(element0, "0000: 6B 73                                              ks\n");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

}
