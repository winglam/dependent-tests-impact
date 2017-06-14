
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest3 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test001"); }

    byte[] byte_array6 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str7 = ant.HexDump.byteArrayToHexString(byte_array6);
    java.lang.String str8 = ant.HexDump.byteArrayToHexString(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FF 64 64 64 0A 00"+ "'", str7.equals("FF 64 64 64 0A 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "FF 64 64 64 0A 00"+ "'", str8.equals("FF 64 64 64 0A 00"));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test002"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference2 = new org.apache.xml.security.encryption.CipherReference(document0, "\uFFFD6x\uFFFDR>\uFFFD");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test003"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "2.5.29.14";

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test004"); }

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
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException35 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("", obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test005"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test006"); }

    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException1 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("00#00#");

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test007"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i3 = keyWrapImpl_TRIPLEDES_BC0.getImplementedAlgorithmType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 4);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test008"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter04 transformXPath2Filter040 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter04();
    boolean b1 = transformXPath2Filter040.returnsOctetStream();
    boolean b2 = transformXPath2Filter040.wantsOctetStream();
    boolean b3 = transformXPath2Filter040.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test009"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceIntersect(document0, "Signature");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test010"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    java.lang.String[] str_array2 = resolverDirectHTTP0.engineGetPropertyKeys();
    boolean b4 = resolverDirectHTTP0.understandsProperty("C9#36#78#99#52#3E#EA#F2");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test011"); }

    org.apache.xml.security.keys.KeyInfo.registerKeyInfoContentHandler("Xalan Java 2.5.1", "http://www.w3.org/TR/2001/CR-xmldsig-core-20010419/", "32#2E#35#2E#32#39#2E#31#34#");

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test012"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    java.security.Key key3 = null;
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = keyWrapImpl_TRIPLEDES_BC0.engineWrap(key3, key4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test013"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.EncryptionMethod encryptionMethod1 = null;
    org.apache.xml.security.keys.KeyInfo keyInfo2 = null;
    org.apache.xml.security.encryption.CipherData cipherData3 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties4 = null;
    org.apache.xml.security.encryption.ReferenceList referenceList5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey10 = new org.apache.xml.security.encryption.EncryptedKey(document0, encryptionMethod1, keyInfo2, cipherData3, encryptionProperties4, referenceList5, "00 01 ", "http://www.w3.org/2001/04/xmlenc#kw-aes256", "SignatureProperties", "00400400420");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test014"); }

    java.lang.String str0 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer._ATT_INCLUDESLASH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "IncludeSlashPolicy"+ "'", str0.equals("IncludeSlashPolicy"));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test015"); }

    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException1 = new org.apache.xml.security.signature.XMLSignatureException("00000000");

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test016"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transforms transforms2 = new org.apache.xml.security.transforms.Transforms(element0, "BC");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test017"); }

    org.apache.xml.security.transforms.implementations.TransformXSLT transformXSLT0 = new org.apache.xml.security.transforms.implementations.TransformXSLT();
    boolean b1 = transformXSLT0.returnsNodeSet();
    boolean b2 = transformXSLT0.wantsNodeSet();
    boolean b3 = transformXSLT0.returnsNodeSet();
    boolean b4 = transformXSLT0.wantsNodeSet();
    boolean b5 = transformXSLT0.returnsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test018"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.Base64.decode("X509CRL");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.Base64DecodingException");
    } catch (org.apache.xml.security.exceptions.Base64DecodingException e) {
      // Expected exception.
    }

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test019"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    boolean b3 = xMLSignatureInput1.isOctetStream();
    java.io.InputStream inputStream4 = xMLSignatureInput1.getOctetStream();
    java.lang.String str5 = xMLSignatureInput1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "XMLSignatureInput/OctetStream/64 octets/null"+ "'", str5.equals("XMLSignatureInput/OctetStream/64 octets/null"));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test020"); }

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
    apacheXMLProvider0.clear();
    
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
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test021"); }

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
    org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver x509SKIResolver19 = new org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver();
    org.w3c.dom.Element element20 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver22 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver22.engineSetProperty("X509IssuerName", "P");
    boolean b27 = retrievalMethodResolver22.understandsProperty("(.//. | .//@* | .//namespace::*)[not(self::comment())]");
    java.lang.String[] str_array28 = retrievalMethodResolver22.engineGetPropertyKeys();
    org.w3c.dom.Element element29 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver31 = null;
    boolean b32 = retrievalMethodResolver22.engineCanResolve(element29, "00#00#00#00#00#00#00#01#", storageResolver31);
    org.w3c.dom.Element element33 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver35 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey36 = retrievalMethodResolver22.engineResolvePublicKey(element33, "0000: 6B 73                                              ks\n", storageResolver35);
    javax.crypto.SecretKey secretKey37 = x509SKIResolver19.engineResolveSecretKey(element20, "http://xml.apache.org/security/#KeyStore", storageResolver35);
    java.security.cert.X509Certificate x509Certificate38 = rSAKeyValueResolver0.engineResolveX509Certificate(element17, "ZAEK/wE=", storageResolver35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b32 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate38);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test022"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.ObjectContainer objectContainer2 = new org.apache.xml.security.signature.ObjectContainer(element0, "InclusiveNamespaces");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test023"); }

    java.lang.Object[] obj_array1 = null;
    java.lang.Object[] obj_array9 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException10 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array9);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException11 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array9);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException12 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array9);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException13 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array9);
    java.lang.Object[] obj_array18 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException19 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array18);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException20 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array18);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException21 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array18);
    org.apache.xml.security.signature.Reference reference22 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException23 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array18, reference22);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException24 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array9, (java.lang.Exception)missingResourceFailureException23);
    java.lang.Object[] obj_array30 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException31 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array30);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException32 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array30);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException33 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array30);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException34 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array30);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException35 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array30);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException36 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array9, (java.lang.Exception)storageResolverException35);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException37 = new org.apache.xml.security.signature.InvalidSignatureValueException("subtract", (java.lang.Exception)invalidDigestValueException36);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException38 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/2000/09/xmldsig#X509Data", obj_array1, (java.lang.Exception)invalidDigestValueException36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test024"); }

    org.w3c.dom.Node node0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.outputDOM(node0, "0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test025"); }

    org.apache.xml.security.signature.Reference reference1 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException2 = new org.apache.xml.security.signature.MissingResourceFailureException("http://www.w3.org/2001/04/xmlenc#kw-aes256", reference1);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test026"); }

    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException2 = new org.apache.xml.security.signature.InvalidSignatureValueException();
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException3 = new org.apache.xml.security.signature.InvalidSignatureValueException("http://www.w3.org/2000/09/xmldsig#MgmtData", (java.lang.Exception)invalidSignatureValueException2);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException4 = new org.apache.xml.security.signature.InvalidSignatureValueException("DataReference", (java.lang.Exception)invalidSignatureValueException3);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test027"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = apacheXMLProvider4.contains((java.lang.Object)"Nonce");
    java.lang.String str9 = apacheXMLProvider4.getProperty("(.//. | .//@* | .//namespace::*)");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test028"); }

    org.apache.xml.security.algorithms.SignatureAlgorithm.register("64 01 0A FF 01 ", "KeyInfo");

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test029"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput4 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b5 = xMLSignatureInput4.isInitialized();
    boolean b6 = xMLSignatureInput4.isOctetStream();
    java.io.InputStream inputStream7 = xMLSignatureInput4.getOctetStream();
    apacheXMLProvider0.load(inputStream7);
    apacheXMLProvider0.clear();
    boolean b11 = apacheXMLProvider0.containsKey((java.lang.Object)"FF 64 64 64 0A 00");
    
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
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test030"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    org.w3c.dom.Node node1 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array2 = canonicalizer20010315OmitComments0.engineCanonicalizeSubTree(node1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test031"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants._TAG_SPKIDATA;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + "SPKIData"+ "'", str0.equals("SPKIData"));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test032"); }

    java.lang.String str1 = org.apache.xml.security.utils.ElementProxy.getDefaultPrefix("http://www.w3.org/2001/04/xmlenc#kw-tripledes");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str1);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test033"); }

    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException1 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"JCAType\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test034"); }

    org.apache.xml.security.transforms.implementations.TransformXSLT transformXSLT0 = new org.apache.xml.security.transforms.implementations.TransformXSLT();
    boolean b1 = transformXSLT0.returnsNodeSet();
    boolean b2 = transformXSLT0.wantsNodeSet();
    boolean b3 = transformXSLT0.returnsNodeSet();
    boolean b4 = transformXSLT0.wantsNodeSet();
    boolean b5 = transformXSLT0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test035"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments canonicalizer20010315ExclOmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclOmitComments();
    java.lang.String str1 = canonicalizer20010315ExclOmitComments0.engineGetURI();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider2 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str3 = apacheXMLProvider2.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj4 = apacheXMLProvider2.entrySet();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput6 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b7 = xMLSignatureInput6.isInitialized();
    java.lang.String str8 = xMLSignatureInput6.getSourceURI();
    org.apache.xpath.CachedXPathAPI cachedXPathAPI9 = xMLSignatureInput6.getCachedXPathAPI();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput10 = new org.apache.xml.security.signature.XMLSignatureInput((java.util.Set)set_entry_obj_obj4, cachedXPathAPI9);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array11 = canonicalizer20010315ExclOmitComments0.engineCanonicalizeXPathNodeSet((java.util.Set)set_entry_obj_obj4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/10/xml-exc-c14n#"+ "'", str1.equals("http://www.w3.org/2001/10/xml-exc-c14n#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedXPathAPI9);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test036"); }

    java.lang.String str2 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.expandSystemId("", "EncryptedData");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + ""+ "'", str2.equals(""));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test037"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver dSAKeyValueResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver6 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element7 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver9 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element10 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver12 = null;
    java.security.PublicKey publicKey13 = retrievalMethodResolver9.engineResolvePublicKey(element10, "subtract", storageResolver12);
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver16 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element17 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver19 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey20 = x509IssuerSerialResolver16.engineResolveSecretKey(element17, "subtract", storageResolver19);
    java.security.cert.X509Certificate x509Certificate21 = retrievalMethodResolver9.engineResolveX509Certificate(element14, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver19);
    java.security.cert.X509Certificate x509Certificate22 = null;
    storageResolver19.add(x509Certificate22);
    javax.crypto.SecretKey secretKey24 = x509CertificateResolver6.engineResolveSecretKey(element7, "00 01 FF 64 64 00", storageResolver19);
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver27 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element28 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver30 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element31 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver33 = null;
    java.security.PublicKey publicKey34 = retrievalMethodResolver30.engineResolvePublicKey(element31, "subtract", storageResolver33);
    org.w3c.dom.Element element35 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver37 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element38 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver40 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey41 = x509IssuerSerialResolver37.engineResolveSecretKey(element38, "subtract", storageResolver40);
    java.security.cert.X509Certificate x509Certificate42 = retrievalMethodResolver30.engineResolveX509Certificate(element35, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver40);
    java.security.cert.X509Certificate x509Certificate43 = null;
    storageResolver40.add(x509Certificate43);
    javax.crypto.SecretKey secretKey45 = x509CertificateResolver27.engineResolveSecretKey(element28, "00 01 FF 64 64 00", storageResolver40);
    javax.crypto.SecretKey secretKey46 = x509CertificateResolver6.engineResolveSecretKey(element25, "2.5.29.14", storageResolver40);
    org.w3c.dom.Element element47 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver49 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element50 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver52 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey53 = x509IssuerSerialResolver49.engineResolveSecretKey(element50, "subtract", storageResolver52);
    org.w3c.dom.Element element54 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver56 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver56.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element60 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver62 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey63 = retrievalMethodResolver56.engineResolvePublicKey(element60, "HMACOutputLength", storageResolver62);
    javax.crypto.SecretKey secretKey64 = x509IssuerSerialResolver49.engineResolveSecretKey(element54, "", storageResolver62);
    javax.crypto.SecretKey secretKey65 = x509CertificateResolver6.engineResolveSecretKey(element47, "X.509", storageResolver62);
    java.util.Iterator iterator66 = storageResolver62.getIterator();
    javax.crypto.SecretKey secretKey67 = dSAKeyValueResolver3.engineResolveSecretKey(element4, "http://www.w3.org/2000/09/xmldsig#base64", storageResolver62);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey68 = x509CertificateResolver0.engineResolvePublicKey(element1, "BlockEncryption", storageResolver62);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey63);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey65);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator66);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey67);

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test038"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.utils.HelperNodeList helperNodeList2 = new org.apache.xml.security.utils.HelperNodeList();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform3 = org.apache.xml.security.transforms.Transform.getInstance(document0, "", (org.w3c.dom.NodeList)helperNodeList2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test039"); }

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
    java.security.cert.Certificate[] certificate_array45 = apacheKeyStore0.engineGetCertificateChain("http://www.w3.org/2002/06/xmldsig-filter2");
    
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array45);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test040"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = resourceResolver1.understandsProperty("");
    java.lang.String[] str_array8 = resourceResolver1.getPropertyKeys();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider9 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str10 = apacheXMLProvider9.stringPropertyNames();
    java.lang.String str11 = apacheXMLProvider9.getInfo();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider9);
    java.util.Set<java.security.Provider.Service> set_service13 = apacheXMLProvider9.getServices();
    java.lang.Object[] obj_array20 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException21 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array20);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array20);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException23 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array20);
    java.lang.Object[] obj_array25 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException26 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array25);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    algorithmAlreadyRegisteredException26.addSuppressed((java.lang.Throwable)invalidCanonicalizerException31);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException33 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("KeyName", obj_array20, (java.lang.Exception)invalidCanonicalizerException31);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException34 = new org.apache.xml.security.signature.InvalidDigestValueException("subtract", obj_array20);
    java.lang.String str35 = org.apache.xml.security.utils.I18n.getExceptionMessage("", (java.lang.Exception)invalidDigestValueException34);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException37 = new org.apache.xml.security.keys.storage.StorageResolverException("Modulus");
    java.lang.Object obj38 = apacheXMLProvider9.put((java.lang.Object)invalidDigestValueException34, (java.lang.Object)storageResolverException37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Apache XML Security Provider"+ "'", str11.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str35 + "' != '" + "No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str35.equals("No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj38);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test041"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    java.lang.String str1 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    java.lang.String str2 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test042"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedKey encryptedKey2 = new org.apache.xml.security.encryption.EncryptedKey(element0, "xslt");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test043"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider0.stringPropertyNames();
    java.util.Enumeration<java.lang.Object> enumeration_obj3 = apacheXMLProvider0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj3);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test044"); }

    java.lang.String str1 = org.apache.xml.security.utils.RFC2253Parser.xmldsigtoRFC2253("a a aaaa   aa aa   aa      aa      ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "a a aaaa   aa aa   aa      aa"+ "'", str1.equals("a a aaaa   aa aa   aa      aa"));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test045"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceUnion(document0, "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test046"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference3 = new org.apache.xml.security.encryption.CipherReference(document0, "CipherValue", transforms2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test047"); }

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
    java.lang.Object[] obj_array22 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException23 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array22);
    java.lang.Exception exception24 = null;
    org.w3c.dom.Attr attr25 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException27 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array22, exception24, attr25, "KeyName");
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException28 = new org.apache.xml.security.signature.InvalidSignatureValueException("CertificateChain", obj_array6, (java.lang.Exception)resourceResolverException27);
    java.lang.Object[] obj_array33 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException34 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array33);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException35 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array33);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException36 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array33);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException37 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", (java.lang.Exception)xMLSecurityException36);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException38 = new org.apache.xml.security.signature.InvalidSignatureValueException("00 00 00 20 ", obj_array6, (java.lang.Exception)xMLSecurityException36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array33);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test048"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((byte)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaa "+ "'", str1.equals("aaaaaaa "));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test049"); }

    org.apache.xml.security.Init.FuncHereLoader funcHereLoader0 = new org.apache.xml.security.Init.FuncHereLoader();
    java.lang.String str1 = funcHereLoader0.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache.xml.security.transforms.implementations.FuncHere"+ "'", str1.equals("org.apache.xml.security.transforms.implementations.FuncHere"));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test050"); }

    byte[] byte_array6 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str7 = ant.HexDump.byteArrayToHexString(byte_array6);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput8 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array6);
    java.lang.String str9 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array6);
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "FF 64 64 64 0A 00"+ "'", str7.equals("FF 64 64 64 0A 00"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "0000: FF 64 64 64 0A 00                                  .ddd..\n"+ "'", str9.equals("0000: FF 64 64 64 0A 00                                  .ddd..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FF#64#64#64#0A#00"+ "'", str10.equals("FF#64#64#64#0A#00"));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test051"); }

    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath0 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    boolean b1 = transformXPath0.wantsNodeSet();
    boolean b2 = transformXPath0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test052"); }

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
    java.lang.Object[] obj_array30 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException31 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array30);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException32 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array30);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException33 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array30);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException34 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array30);
    java.lang.Object[] obj_array39 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException40 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array39);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException41 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array39);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException42 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array39);
    org.apache.xml.security.signature.Reference reference43 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException44 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array39, reference43);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException45 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array30, (java.lang.Exception)missingResourceFailureException44);
    java.lang.Object[] obj_array51 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException52 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array51);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException53 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array51);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException54 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array51);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException55 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array51);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException56 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array51);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException57 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array30, (java.lang.Exception)storageResolverException56);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException58 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2001/04/xmlenc#aes192-cbc", (java.lang.Exception)storageResolverException56);
    org.w3c.dom.Attr attr59 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException61 = new org.apache.xml.security.utils.resolver.ResourceResolverException("00 01 FF 64 64 00", obj_array7, (java.lang.Exception)storageResolverException56, attr59, "P");
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException62 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("(.//. | .//@* | .//namespace::*)", (java.lang.Exception)storageResolverException56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test053"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    int i4 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    org.w3c.dom.Document document5 = null;
    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams7 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    java.lang.String str8 = streamParams7.getAlgorithmURI();
    java.lang.String str9 = streamParams7.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams10 = keyWrapImpl_AES128_BC0.engineInit(document5, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)streamParams7);
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
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str9);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test054"); }

    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException10 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array8);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException11 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array8);
    java.lang.Object[] obj_array16 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException17 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array16);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException18 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array16);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException19 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array16);
    java.lang.Object[] obj_array23 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException24 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array23);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException25 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array23);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException32 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException31);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException33 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array23, (java.lang.Exception)invalidCanonicalizerException31);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException34 = new org.apache.xml.security.signature.InvalidDigestValueException("PgenCounter", obj_array16, (java.lang.Exception)xMLSecurityException33);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException35 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2000/09/xmldsig#rsa-sha1", obj_array8, (java.lang.Exception)xMLSecurityException33);
    org.apache.xml.security.transforms.TransformationException transformationException36 = new org.apache.xml.security.transforms.TransformationException("Modulus", obj_array8);
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
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException55 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("                 ", (java.lang.Exception)missingResourceFailureException54);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException56 = new org.apache.xml.security.signature.ReferenceNotInitializedException("C9 36 78 99 52 3E EA F2", obj_array8, (java.lang.Exception)contentHandlerAlreadyRegisteredException55);
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
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException85 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2001/04/xmldsig-more#hmac-md5", obj_array8, (java.lang.Exception)invalidCipherTextException84);
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException86 = new org.apache.xml.security.signature.XMLSignatureException("0000: 00 00 00 20                                        ... \n", (java.lang.Exception)invalidTransformException85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
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
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test055"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstanceIntersect(document0, "C9#36#78#99#52#3E#EA#F2");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test056"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeComment("0000: 68 69 21                                           hi!\n");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0000: 68 69 21                                           hi!\n"+ "'", str1.equals("0000: 68 69 21                                           hi!\n"));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test057"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transforms transforms2 = new org.apache.xml.security.transforms.Transforms(element0, "intersect");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test058"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray(8);
    java.lang.String str2 = ant.HexDump.byteArrayToHexString(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "00 00 00 08"+ "'", str2.equals("00 00 00 08"));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test059"); }

    org.apache.xml.security.utils.I18n.initLocale("68 74 74 70 3A 2F 2F 77 77 77 2E 77 33 2E 6F 72 67 2F 32 30 30 30 2F 30 39 2F 78 6D 6C 64 73 69 67 23 58 35 30 39 44 61 74 61 ", "DigestValue");

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test060"); }

    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams5 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array2);
    java.lang.String str6 = ant.HexDump.toBinaryString(byte_array2);
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array2);
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array2);
    java.lang.String str9 = ant.HexDump.byteArrayToBinaryString(byte_array2);
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str6.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str7.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str8.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"+ "'", str9.equals("  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str10.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test061"); }

    byte[] byte_array2 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str3 = ant.HexDump.toString(byte_array2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams4 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("http://www.w3.org/2000/09/xmldsig#rawX509Certificate", byte_array2);
    java.lang.String str5 = oAEPParams4.getAlgorithmURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\u0000\u0000\u0000 "+ "'", str3.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str5.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test062"); }

    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException1 = new org.apache.xml.security.keys.storage.StorageResolverException("00 00 00 34 ");

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test063"); }

    org.apache.xml.security.transforms.implementations.TransformXSLT transformXSLT0 = new org.apache.xml.security.transforms.implementations.TransformXSLT();
    boolean b1 = transformXSLT0.returnsNodeSet();
    boolean b2 = transformXSLT0.wantsNodeSet();
    boolean b3 = transformXSLT0.returnsNodeSet();
    boolean b4 = transformXSLT0.returnsOctetStream();
    boolean b5 = transformXSLT0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test064"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    int i2 = keyTransportImpl_RSAOAEP_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == (-1));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test065"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
    byte[] byte_array2 = xMLSignatureInput1.getBytes();
    java.lang.String str3 = xMLSignatureInput1.toString();
    java.lang.String str4 = xMLSignatureInput1.getSourceURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "XMLSignatureInput/OctetStream/43 octets/null"+ "'", str3.equals("XMLSignatureInput/OctetStream/43 octets/null"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test066"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    java.lang.String str4 = apacheXMLProvider0.getProperty("2.5.29.14");
    double d5 = apacheXMLProvider0.getVersion();
    java.io.Reader reader6 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.load(reader6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d5 == 1.0d);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test067"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.Transform transform2 = new org.apache.xml.security.transforms.Transform(element0, "SPKIData");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test068"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    java.security.cert.Certificate[] certificate_array14 = apacheKeyStore0.engineGetCertificateChain("50 47 50 4B 65 79 50 61 63 6B 65 74 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array14);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test069"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.hexStringToByteArray("http://www.w3.org/2001/04/xmlenc#tripledes-cbc");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test070"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.KeyStoreElement keyStoreElement2 = new org.apache.xml.security.keys.provider.KeyStoreElement(element0, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test071"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore1 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter2 = null;
    apacheKeyStore1.engineLoad(loadStoreParameter2);
    java.security.cert.Certificate[] certificate_array5 = apacheKeyStore1.engineGetCertificateChain("Date");
    java.lang.Object[] obj_array12 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException13 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array12);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException14 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array12);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException15 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array12);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException18 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException19 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException18);
    org.apache.xml.security.transforms.TransformationException transformationException20 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array12, (java.lang.Exception)xMLSecurityException19);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException21 = new org.apache.xml.security.signature.InvalidDigestValueException("Xalan Java 2.5.1", obj_array12);
    org.w3c.dom.Attr attr22 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException24 = new org.apache.xml.security.utils.resolver.ResourceResolverException("Q", (java.lang.Exception)invalidDigestValueException21, attr22, "PgenCounter");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException25 = new org.apache.xml.security.exceptions.XMLSecurityException("Date", (java.lang.Object[])certificate_array5, (java.lang.Exception)invalidDigestValueException21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test072"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver x509SKIResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver3.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element7 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver9 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey10 = retrievalMethodResolver3.engineResolvePublicKey(element7, "HMACOutputLength", storageResolver9);
    javax.crypto.SecretKey secretKey11 = x509SKIResolver0.engineResolveSecretKey(element1, "11001001400110110401111000410011001401010010400111110411101010411110010", storageResolver9);
    org.w3c.dom.Element element12 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver14 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element15 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver17 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element18 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver20 = null;
    java.security.PublicKey publicKey21 = retrievalMethodResolver17.engineResolvePublicKey(element18, "subtract", storageResolver20);
    org.w3c.dom.Element element22 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver24 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver27 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey28 = x509IssuerSerialResolver24.engineResolveSecretKey(element25, "subtract", storageResolver27);
    java.security.cert.X509Certificate x509Certificate29 = retrievalMethodResolver17.engineResolveX509Certificate(element22, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver27);
    java.security.cert.X509Certificate x509Certificate30 = null;
    storageResolver27.add(x509Certificate30);
    javax.crypto.SecretKey secretKey32 = x509CertificateResolver14.engineResolveSecretKey(element15, "00 01 FF 64 64 00", storageResolver27);
    org.w3c.dom.Element element33 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver35 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element36 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver38 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element39 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver41 = null;
    java.security.PublicKey publicKey42 = retrievalMethodResolver38.engineResolvePublicKey(element39, "subtract", storageResolver41);
    org.w3c.dom.Element element43 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver45 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element46 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver48 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey49 = x509IssuerSerialResolver45.engineResolveSecretKey(element46, "subtract", storageResolver48);
    java.security.cert.X509Certificate x509Certificate50 = retrievalMethodResolver38.engineResolveX509Certificate(element43, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver48);
    java.security.cert.X509Certificate x509Certificate51 = null;
    storageResolver48.add(x509Certificate51);
    javax.crypto.SecretKey secretKey53 = x509CertificateResolver35.engineResolveSecretKey(element36, "00 01 FF 64 64 00", storageResolver48);
    javax.crypto.SecretKey secretKey54 = x509CertificateResolver14.engineResolveSecretKey(element33, "2.5.29.14", storageResolver48);
    org.w3c.dom.Element element55 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver57 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element58 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver60 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey61 = x509IssuerSerialResolver57.engineResolveSecretKey(element58, "subtract", storageResolver60);
    org.w3c.dom.Element element62 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver64 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver64.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element68 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver70 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey71 = retrievalMethodResolver64.engineResolvePublicKey(element68, "HMACOutputLength", storageResolver70);
    javax.crypto.SecretKey secretKey72 = x509IssuerSerialResolver57.engineResolveSecretKey(element62, "", storageResolver70);
    javax.crypto.SecretKey secretKey73 = x509CertificateResolver14.engineResolveSecretKey(element55, "X.509", storageResolver70);
    java.util.Iterator iterator74 = storageResolver70.getIterator();
    java.security.cert.X509Certificate x509Certificate75 = null;
    storageResolver70.add(x509Certificate75);
    // The following exception was thrown during execution in test generation
    try {
    boolean b77 = x509SKIResolver0.engineCanResolve(element12, "Q", storageResolver70);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey53);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey61);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey71);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey72);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator74);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test073"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException9 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array6);
    org.apache.xml.security.signature.Reference reference10 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException11 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array6, reference10);
    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP14 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    resolverDirectHTTP14.engineSetProperty("", "Modulus");
    java.lang.String[] str_array18 = resolverDirectHTTP14.engineGetPropertyKeys();
    org.w3c.dom.Attr attr19 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException21 = new org.apache.xml.security.utils.resolver.ResourceResolverException("RSAKeyValue", (java.lang.Object[])str_array18, attr19, "http://www.w3.org/2001/04/xmlenc#sha256");
    org.apache.xml.security.exceptions.Base64DecodingException base64DecodingException22 = new org.apache.xml.security.exceptions.Base64DecodingException("http://www.w3.org/2001/04/xmlenc#dh", (java.lang.Object[])str_array18);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException23 = new org.apache.xml.security.keys.storage.StorageResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha384", obj_array6, (java.lang.Exception)base64DecodingException22);
    java.lang.Object[] obj_array28 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException29 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array28);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException30 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array28);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException31 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array28);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException32 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array28);
    org.apache.xml.security.exceptions.Base64DecodingException base64DecodingException33 = new org.apache.xml.security.exceptions.Base64DecodingException("http://www.w3.org/2000/09/xmldsig#Manifest", obj_array6, (java.lang.Exception)keyResolverException32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array28);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test074"); }

    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException3 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("DigestMethod");
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException4 = new org.apache.xml.security.signature.XMLSignatureException("SPKISexp", (java.lang.Exception)algorithmAlreadyRegisteredException3);
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException5 = new org.apache.xml.security.signature.InvalidSignatureValueException("00400400420", (java.lang.Exception)xMLSignatureException4);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test075"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createElementFromBigint(document0, "", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test076"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.lang.String str4 = org.apache.xml.security.utils.Base64.encode(byte_array2);
    java.security.Key key5 = null;
    byte[] byte_array7 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.toHexString(byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array9 = keyWrapImpl_TRIPLEDES_BC0.engineEncrypt(byte_array2, key5, byte_array7);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str3.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "yTZ4mVI+6vI="+ "'", str4.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str8.equals("32#00#1E#CC#14#20#01#03#15#CE#"));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test077"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath6 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj7 = apacheXMLProvider4.remove((java.lang.Object)transformXPath6);
    java.util.Set<java.lang.String> set_str8 = apacheXMLProvider4.stringPropertyNames();
    boolean b9 = apacheXMLProvider4.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test078"); }

    org.apache.xml.security.exceptions.Base64DecodingException base64DecodingException1 = new org.apache.xml.security.exceptions.Base64DecodingException("http://www.w3.org/2001/10/xml-exc-c14n#");

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test079"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    java.security.KeyStore.ProtectionParameter protectionParameter4 = null;
    java.security.KeyStore.Entry entry5 = apacheKeyStore0.engineGetEntry("ds", protectionParameter4);
    byte[] byte_array8 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str9 = org.apache.xml.security.utils.HexDump.toHexString(byte_array8);
    java.security.cert.Certificate[] certificate_array10 = new java.security.cert.Certificate[] {  };
    apacheKeyStore0.engineSetKeyEntry("", byte_array8, certificate_array10);
    char[] char_array13 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key14 = apacheKeyStore0.engineGetKey("\n", char_array13);
      org.junit.Assert.fail("Expected exception of type java.security.UnrecoverableKeyException");
    } catch (java.security.UnrecoverableKeyException e) {
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
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test080"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509SKI xMLX509SKI2 = new org.apache.xml.security.keys.content.x509.XMLX509SKI(element0, "PGPData");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test081"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.lang.String str1 = canonicalizer20010315OmitComments0.engineGetURI();
    java.lang.String str2 = canonicalizer20010315OmitComments0.engineGetURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str2.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test082"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial2 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(element0, "Target");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test083"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString((long)'4');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00#00#00#00#00#00#00#34#"+ "'", str1.equals("00#00#00#00#00#00#00#34#"));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test084"); }

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
    java.util.Set<java.lang.Object> set_obj12 = apacheXMLProvider0.keySet();
    
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
    org.junit.Assert.assertNotNull(set_obj12);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test085"); }

    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams1 = new org.apache.xml.security.algorithms.encryption.params.StreamParams(8);
    int i2 = streamParams1.getKeySize();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 8);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test086"); }

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
    boolean b18 = x509SKIResolver0.engineCanResolve(element1, "KeyInfo", storageResolver13);
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

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test087"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.KeyReference keyReference2 = new org.apache.xml.security.encryption.KeyReference(element0, "No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test088"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    byte[] byte_array2 = xMLSignatureInput1.getBytes();
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 6E 75 65 2E 65  http://www.nue.e\n0010: 74 2D 69 6E 66 2E 75 6E   69 2D 73 69 65 67 65 6E  t-inf.uni-siegen\n0020: 2E 64 65 2F 7E 67 65 75   65 72 2D 70 6F 6C 6C 6D  .de/.geuer-pollm\n0030: 61 6E 6E 2F 23 78 70 61   74 68 46 69 6C 74 65 72  ann/#xpathFilter\n"+ "'", str3.equals("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 6E 75 65 2E 65  http://www.nue.e\n0010: 74 2D 69 6E 66 2E 75 6E   69 2D 73 69 65 67 65 6E  t-inf.uni-siegen\n0020: 2E 64 65 2F 7E 67 65 75   65 72 2D 70 6F 6C 6C 6D  .de/.geuer-pollm\n0030: 61 6E 6E 2F 23 78 70 61   74 68 46 69 6C 74 65 72  ann/#xpathFilter\n"));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test089"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.w3.org/2000/09/xmldsig#hmac-sha1");
    byte[] byte_array2 = xMLSignatureInput1.getBytes();
    boolean b3 = xMLSignatureInput1.isInitialized();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test090"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.c14n.Canonicalizer canonicalizer1 = org.apache.xml.security.c14n.Canonicalizer.getInstance("http://www.w3.org/2001/04/xmlenc#Element");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.InvalidCanonicalizerException");
    } catch (org.apache.xml.security.c14n.InvalidCanonicalizerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test091"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem resolverLocalFilesystem1 = new org.apache.xml.security.utils.resolver.implementations.ResolverLocalFilesystem();
    java.lang.String[] str_array2 = resolverLocalFilesystem1.engineGetPropertyKeys();
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException3 = new org.apache.xml.security.c14n.CanonicalizationException("CipherReference", (java.lang.Object[])str_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array2);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test092"); }

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
    java.security.cert.X509Certificate x509Certificate41 = null;
    storageResolver34.add(x509Certificate41);
    
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
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test093"); }

    org.apache.xml.security.transforms.implementations.TransformC14NWithComments transformC14NWithComments0 = new org.apache.xml.security.transforms.implementations.TransformC14NWithComments();
    boolean b1 = transformC14NWithComments0.wantsOctetStream();
    boolean b2 = transformC14NWithComments0.wantsNodeSet();
    boolean b3 = transformC14NWithComments0.returnsOctetStream();
    boolean b4 = transformC14NWithComments0.returnsOctetStream();
    boolean b5 = transformC14NWithComments0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test094"); }

    java.lang.String str0 = org.apache.xml.security.utils.Constants.configurationFileNew;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str0 + "' != '" + ".xmlsecurityconfig"+ "'", str0.equals(".xmlsecurityconfig"));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test095"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    int i13 = apacheKeyStore0.engineSize();
    java.security.cert.Certificate certificate14 = null;
    java.lang.String str15 = apacheKeyStore0.engineGetCertificateAlias(certificate14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str15);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test096"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver3 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey4 = x509IssuerSerialResolver0.engineResolveSecretKey(element1, "subtract", storageResolver3);
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate5 = storageResolver3.next();
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey4);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test097"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toHexString((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "00#00#"+ "'", str1.equals("00#00#"));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test098"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceUnion(document0, "");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test099"); }

    org.w3c.dom.Node node0 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput2 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b3 = xMLSignatureInput2.isInitialized();
    java.lang.String str4 = xMLSignatureInput2.getSourceURI();
    org.apache.xpath.CachedXPathAPI cachedXPathAPI5 = xMLSignatureInput2.getCachedXPathAPI();
    java.lang.String str6 = xMLSignatureInput2.getMIMEType();
    org.apache.xpath.CachedXPathAPI cachedXPathAPI7 = xMLSignatureInput2.getCachedXPathAPI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput8 = new org.apache.xml.security.signature.XMLSignatureInput(node0, cachedXPathAPI7);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedXPathAPI7);

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test100"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath6 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj7 = apacheXMLProvider4.remove((java.lang.Object)transformXPath6);
    java.util.Set<java.lang.String> set_str8 = apacheXMLProvider4.stringPropertyNames();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider9 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider10 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str11 = apacheXMLProvider10.stringPropertyNames();
    java.lang.String str12 = apacheXMLProvider10.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput14 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b15 = xMLSignatureInput14.isInitialized();
    boolean b16 = xMLSignatureInput14.isOctetStream();
    java.io.InputStream inputStream17 = xMLSignatureInput14.getOctetStream();
    apacheXMLProvider10.load(inputStream17);
    apacheXMLProvider9.load(inputStream17);
    byte[] byte_array20 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream17);
    apacheXMLProvider4.load(inputStream17);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.Init.readUserConfiguration(inputStream17);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "Apache XML Security Provider"+ "'", str12.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array20);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test101"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceSubtract(document0, "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test102"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    int i3 = blockEncryptionImpl_AES192_BC0.engineGetIvLength();
    int i4 = blockEncryptionImpl_AES192_BC0.getImplementedAlgorithmType();
    java.lang.String str5 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "BC"+ "'", str5.equals("BC"));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test103"); }

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
    byte[] byte_array27 = org.apache.xml.security.utils.HexDump.toByteArray(8);
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore29 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter30 = null;
    apacheKeyStore29.engineLoad(loadStoreParameter30);
    java.security.KeyStore.ProtectionParameter protectionParameter33 = null;
    java.security.KeyStore.Entry entry34 = apacheKeyStore29.engineGetEntry("ds", protectionParameter33);
    byte[] byte_array37 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str38 = org.apache.xml.security.utils.HexDump.toHexString(byte_array37);
    java.security.cert.Certificate[] certificate_array39 = new java.security.cert.Certificate[] {  };
    apacheKeyStore29.engineSetKeyEntry("", byte_array37, certificate_array39);
    java.lang.Object[] obj_array45 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException46 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array45);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException47 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array45);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException48 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array45);
    java.lang.Object[] obj_array50 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException51 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array50);
    java.lang.Object[] obj_array54 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException55 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array54);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException56 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array54);
    algorithmAlreadyRegisteredException51.addSuppressed((java.lang.Throwable)invalidCanonicalizerException56);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException58 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("KeyName", obj_array45, (java.lang.Exception)invalidCanonicalizerException56);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException59 = new org.apache.xml.security.signature.ReferenceNotInitializedException("00 01 ", (java.lang.Object[])certificate_array39, (java.lang.Exception)invalidCanonicalizerException56);
    apacheKeyStore0.engineSetKeyEntry("0000: FF 64 64 64 0A 00                                  .ddd..\n", byte_array27, certificate_array39);
    boolean b62 = apacheKeyStore0.engineIsCertificateEntry("P");
    java.security.KeyStore.ProtectionParameter protectionParameter64 = null;
    java.security.KeyStore.Entry entry65 = apacheKeyStore0.engineGetEntry("", protectionParameter64);
    
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
    org.junit.Assert.assertNotNull(byte_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str38 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str38.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b62 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry65);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test104"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160";

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test105"); }

    byte[] byte_array1 = org.apache.xml.security.utils.PRNG.createBytes(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test106"); }

    org.apache.xml.security.transforms.implementations.TransformXPointer transformXPointer0 = new org.apache.xml.security.transforms.implementations.TransformXPointer();
    boolean b1 = transformXPointer0.returnsNodeSet();
    boolean b2 = transformXPointer0.wantsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test107"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver x509SKIResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element4 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver6 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element7 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver9 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey10 = x509IssuerSerialResolver6.engineResolveSecretKey(element7, "subtract", storageResolver9);
    javax.crypto.SecretKey secretKey11 = x509CertificateResolver3.engineResolveSecretKey(element4, "Certificate", storageResolver9);
    // The following exception was thrown during execution in test generation
    try {
    java.security.cert.X509Certificate x509Certificate12 = x509SKIResolver0.engineResolveX509Certificate(element1, "org/apache/xml/security/resource/xmlsecurity", storageResolver9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey11);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test108"); }

    boolean b2 = org.apache.xml.security.algorithms.encryption.EncryptionMethod.register("org/apache/xml/security/resource", "00#00#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test109"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments canonicalizer20010315ExclWithComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315ExclWithComments();
    boolean b1 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    boolean b2 = canonicalizer20010315ExclWithComments0.engineGetIncludeComments();
    java.lang.String str3 = canonicalizer20010315ExclWithComments0.engineGetURI();
    org.w3c.dom.Node node4 = null;
    org.w3c.dom.NodeList nodeList5 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node4);
    java.util.Set set6 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList5);
    java.util.Set set7 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList5);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = canonicalizer20010315ExclWithComments0.engineCanonicalizeXPathNodeSet(nodeList5);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set7);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test110"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("FF#");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "FF#"+ "'", str1.equals("FF#"));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test111"); }

    org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver x509SKIResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.X509SKIResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver3.engineSetProperty("X509IssuerName", "P");
    boolean b8 = retrievalMethodResolver3.understandsProperty("(.//. | .//@* | .//namespace::*)[not(self::comment())]");
    java.lang.String[] str_array9 = retrievalMethodResolver3.engineGetPropertyKeys();
    org.w3c.dom.Element element10 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver12 = null;
    boolean b13 = retrievalMethodResolver3.engineCanResolve(element10, "00#00#00#00#00#00#00#01#", storageResolver12);
    org.w3c.dom.Element element14 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver16 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey17 = retrievalMethodResolver3.engineResolvePublicKey(element14, "0000: 6B 73                                              ks\n", storageResolver16);
    javax.crypto.SecretKey secretKey18 = x509SKIResolver0.engineResolveSecretKey(element1, "http://xml.apache.org/security/#KeyStore", storageResolver16);
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
    org.w3c.dom.Element element40 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver x509CertificateResolver42 = new org.apache.xml.security.keys.keyresolver.implementations.X509CertificateResolver();
    org.w3c.dom.Element element43 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver45 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element46 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver48 = null;
    java.security.PublicKey publicKey49 = retrievalMethodResolver45.engineResolvePublicKey(element46, "subtract", storageResolver48);
    org.w3c.dom.Element element50 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver52 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element53 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver55 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey56 = x509IssuerSerialResolver52.engineResolveSecretKey(element53, "subtract", storageResolver55);
    java.security.cert.X509Certificate x509Certificate57 = retrievalMethodResolver45.engineResolveX509Certificate(element50, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver55);
    java.security.cert.X509Certificate x509Certificate58 = null;
    storageResolver55.add(x509Certificate58);
    javax.crypto.SecretKey secretKey60 = x509CertificateResolver42.engineResolveSecretKey(element43, "00 01 FF 64 64 00", storageResolver55);
    javax.crypto.SecretKey secretKey61 = x509CertificateResolver21.engineResolveSecretKey(element40, "2.5.29.14", storageResolver55);
    // The following exception was thrown during execution in test generation
    try {
    java.security.PublicKey publicKey62 = x509SKIResolver0.engineResolvePublicKey(element19, "AES/CBC/ISO10126PADDING", storageResolver55);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey17);
    
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
    org.junit.Assert.assertNull(publicKey49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate57);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey60);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey61);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test112"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams3 = new org.apache.xml.security.algorithms.encryption.params.StreamParams(76);
    org.apache.xml.security.keys.KeyInfo keyInfo4 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData7 = new org.apache.xml.security.encryption.EncryptedData(document0, "", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)streamParams3, keyInfo4, encryptionProperties5, "http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test113"); }

    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException1 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2001/04/xmldsig-more#rsa-ripemd160");

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test114"); }

    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException4 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array3);
    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    algorithmAlreadyRegisteredException4.addSuppressed((java.lang.Throwable)invalidCanonicalizerException9);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException11 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa", (java.lang.Exception)algorithmAlreadyRegisteredException4);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", (java.lang.Exception)keyResolverException11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test115"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    java.security.Key key2 = null;
    java.security.Key key3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = keyWrapImpl_TRIPLEDES_BC0.engineWrap(key2, key3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test116"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.lang.String str2 = apacheXMLProvider0.getProperty("http://www.w3.org/XML/1998/namespace");
    java.util.Enumeration<java.lang.Object> enumeration_obj3 = apacheXMLProvider0.keys();
    java.io.PrintWriter printWriter4 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.list(printWriter4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj3);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test117"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstance(element0, "CipherData");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test118"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceIntersect(document0, "PGPKeyPacket");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test119"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstanceUnion(document0, "aaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test120"); }

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
    java.io.OutputStream outputStream11 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.storeToXML(outputStream11, "Algorithm");
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
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test121"); }

    org.apache.xml.security.utils.IgnoreAllErrorHandler ignoreAllErrorHandler0 = new org.apache.xml.security.utils.IgnoreAllErrorHandler();
    org.xml.sax.SAXParseException sAXParseException1 = null;
    ignoreAllErrorHandler0.error(sAXParseException1);
    org.xml.sax.SAXParseException sAXParseException3 = null;
    ignoreAllErrorHandler0.error(sAXParseException3);
    org.xml.sax.SAXParseException sAXParseException5 = null;
    ignoreAllErrorHandler0.warning(sAXParseException5);
    org.xml.sax.SAXParseException sAXParseException7 = null;
    ignoreAllErrorHandler0.fatalError(sAXParseException7);
    org.xml.sax.SAXParseException sAXParseException9 = null;
    ignoreAllErrorHandler0.fatalError(sAXParseException9);

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test122"); }

    java.lang.String str1 = org.apache.xml.security.utils.resolver.ResourceResolverSpi.fixURI("org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.signature.InvalidSignatureValueException: No message with ID \"Algorithm\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.signature.InvalidSignatureValueException: No message with ID \"Algorithm\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str1.equals("org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.signature.InvalidSignatureValueException: No message with ID \"Algorithm\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test123"); }

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
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException41 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("SymmetricKeyWrap", (java.lang.Exception)algorithmAlreadyRegisteredException40);
    
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
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test124"); }

    org.apache.xml.security.c14n.helper.NonNSAttrCompare nonNSAttrCompare0 = new org.apache.xml.security.c14n.helper.NonNSAttrCompare();
    java.lang.Object[] obj_array8 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException9 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array8);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException10 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array8);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException11 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array8);
    java.lang.Object[] obj_array16 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException17 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array16);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException18 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array16);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException19 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array16);
    java.lang.Object[] obj_array23 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException24 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array23);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException25 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array23);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException32 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException31);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException33 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array23, (java.lang.Exception)invalidCanonicalizerException31);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException34 = new org.apache.xml.security.signature.InvalidDigestValueException("PgenCounter", obj_array16, (java.lang.Exception)xMLSecurityException33);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException35 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2000/09/xmldsig#rsa-sha1", obj_array8, (java.lang.Exception)xMLSecurityException33);
    org.apache.xml.security.transforms.TransformationException transformationException36 = new org.apache.xml.security.transforms.TransformationException("Modulus", obj_array8);
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
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException55 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("                 ", (java.lang.Exception)missingResourceFailureException54);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException56 = new org.apache.xml.security.signature.ReferenceNotInitializedException("C9 36 78 99 52 3E EA F2", obj_array8, (java.lang.Exception)contentHandlerAlreadyRegisteredException55);
    org.apache.xml.security.signature.Reference reference57 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException58 = new org.apache.xml.security.signature.MissingResourceFailureException("X509SKI", (java.lang.Exception)referenceNotInitializedException56, reference57);
    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams60 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    java.lang.String str61 = streamParams60.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    int i62 = nonNSAttrCompare0.compare((java.lang.Object)referenceNotInitializedException56, (java.lang.Object)streamParams60);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str61);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test125"); }

    org.apache.xml.security.transforms.implementations.TransformXSLT transformXSLT0 = new org.apache.xml.security.transforms.implementations.TransformXSLT();
    boolean b1 = transformXSLT0.returnsNodeSet();
    boolean b2 = transformXSLT0.wantsNodeSet();
    boolean b3 = transformXSLT0.returnsNodeSet();
    boolean b4 = transformXSLT0.returnsOctetStream();
    boolean b5 = transformXSLT0.returnsOctetStream();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test126"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.signature.XMLSignature xMLSignature3 = new org.apache.xml.security.signature.XMLSignature(document0, "aaaaaaa ", "  aa aa  aa  a  a a    aaa  aa  aa  a a aa a aa     a    a a a     aa a");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test127"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer04 xPath2FilterContainer042 = org.apache.xml.security.transforms.params.XPath2FilterContainer04.newInstance(element0, "http://www.w3.org/2001/04/xmldsig-more#hmac-md5");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test128"); }

    java.lang.Object[] obj_array6 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException7 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array6);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException8 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array6);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException9 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array6);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException12 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException13 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException12);
    org.apache.xml.security.transforms.TransformationException transformationException14 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array6, (java.lang.Exception)xMLSecurityException13);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException15 = new org.apache.xml.security.signature.InvalidDigestValueException("Xalan Java 2.5.1", obj_array6);
    org.w3c.dom.Attr attr16 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException18 = new org.apache.xml.security.utils.resolver.ResourceResolverException("Q", (java.lang.Exception)invalidDigestValueException15, attr16, "PgenCounter");
    java.lang.String str19 = resourceResolverException18.getBaseURI();
    resourceResolverException18.setBaseURI("http://www.w3.org/2001/04/xmlenc#kw-aes128");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "PgenCounter"+ "'", str19.equals("PgenCounter"));

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test129"); }

    org.w3c.dom.Document document0 = null;
    java.math.BigInteger bigInteger2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial3 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(document0, "(.//. | .//@* | .//namespace::*)[not(self::comment())]", bigInteger2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test130"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    int i2 = keyTransportImpl_RSAPKCS15_BC0.getImplementedAlgorithmType();
    java.security.Key key3 = null;
    java.security.Key key4 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array5 = keyTransportImpl_RSAPKCS15_BC0.engineWrap(key3, key4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 3);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test131"); }

    ant.HexDump.setByteSeparator('4');

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test132"); }

    org.w3c.dom.Document document0 = null;
    org.apache.xml.security.encryption.Transforms transforms2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherReference cipherReference3 = new org.apache.xml.security.encryption.CipherReference(document0, "36", transforms2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test133"); }

    int i2 = org.apache.xml.security.encryption.EncryptedData.min((int)(short)0, 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test134"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.XMLUtils.guaranteeThatElementInEncryptionSpace(element0, "SPKIData");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test135"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, "DSAKeyValue");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test136"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore1 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter2 = null;
    apacheKeyStore1.engineLoad(loadStoreParameter2);
    java.security.KeyStore.ProtectionParameter protectionParameter5 = null;
    java.security.KeyStore.Entry entry6 = apacheKeyStore1.engineGetEntry("ds", protectionParameter5);
    byte[] byte_array9 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.toHexString(byte_array9);
    java.security.cert.Certificate[] certificate_array11 = new java.security.cert.Certificate[] {  };
    apacheKeyStore1.engineSetKeyEntry("", byte_array9, certificate_array11);
    byte[] byte_array16 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str17 = ant.HexDump.toString(byte_array16);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams18 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("http://www.w3.org/2000/09/xmldsig#rawX509Certificate", byte_array16);
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore19 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream20 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore21 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter22 = null;
    apacheKeyStore21.engineLoad(loadStoreParameter22);
    java.io.InputStream inputStream24 = null;
    char[] char_array29 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore21.engineLoad(inputStream24, char_array29);
    apacheKeyStore19.engineLoad(inputStream20, char_array29);
    byte[] byte_array35 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str36 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array35);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array35);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams38 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array35);
    java.lang.String str39 = ant.HexDump.toBinaryString(byte_array35);
    java.lang.String str40 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array35);
    java.lang.String str41 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array35);
    java.security.cert.Certificate[] certificate_array42 = new java.security.cert.Certificate[] {  };
    apacheKeyStore19.engineSetKeyEntry("Encoding", byte_array35, certificate_array42);
    apacheKeyStore1.engineSetKeyEntry("", byte_array16, certificate_array42);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException45 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("EncryptionMethod", (java.lang.Object[])certificate_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str10.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str17 + "' != '" + "\u0000\u0000\u0000 "+ "'", str17.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str36 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str36.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str39 + "' != '" + "  aa aa 4aa  a  a4a    aaa4 aa  aa 4a a aa a4aa     a4   a a a4    aa a"+ "'", str39.equals("  aa aa 4aa  a  a4a    aaa4 aa  aa 4a a aa a4aa     a4   a a a4    aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str40 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str40.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str41 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str41.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array42);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test137"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetBlockSize();
    java.lang.String str3 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i4 = blockEncryptionImpl_AES192_BC0.getImplementedAlgorithmType();
    org.w3c.dom.Document document5 = null;
    byte[] byte_array7 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array7);
    java.lang.String str9 = org.apache.xml.security.utils.Base64.encode(byte_array7);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams10 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array7);
    byte[] byte_array11 = oAEPParams10.getOAEPParamBytes();
    java.lang.String str12 = oAEPParams10.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams13 = blockEncryptionImpl_AES192_BC0.engineInit(document5, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams10);
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
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str8.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "yTZ4mVI+6vI="+ "'", str9.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str12.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test138"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPath2FilterContainer xPath2FilterContainer2 = org.apache.xml.security.transforms.params.XPath2FilterContainer.newInstance(element0, "org.apache.xml.security.signature.XMLSignatureException: No message with ID \"JCAType\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test139"); }

    org.apache.xml.security.transforms.TransformationException transformationException1 = new org.apache.xml.security.transforms.TransformationException("org.apache.xml.security.c14n.CanonicalizationException: No message with ID \"No message with ID \"KeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"\nOriginal Exception was org.apache.xml.security.signature.InvalidSignatureValueException: No message with ID \"Algorithm\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test140"); }

    org.apache.xml.security.transforms.implementations.TransformXPath2Filter transformXPath2Filter0 = new org.apache.xml.security.transforms.implementations.TransformXPath2Filter();
    boolean b1 = transformXPath2Filter0.returnsOctetStream();
    boolean b2 = transformXPath2Filter0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test141"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.toString();
    java.util.Set<java.security.Provider.Service> set_service3 = apacheXMLProvider0.getServices();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str5 = apacheXMLProvider4.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj6 = apacheXMLProvider4.entrySet();
    java.security.Provider.Service service9 = apacheXMLProvider4.getService("SignatureMethod", "EncryptionProperty");
    java.util.Set<java.security.Provider.Service> set_service10 = apacheXMLProvider4.getServices();
    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP11 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver12 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP11);
    boolean b14 = resourceResolver12.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider15 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver12.addProperties((java.util.Map)apacheXMLProvider15);
    boolean b18 = resourceResolver12.understandsProperty("");
    java.lang.String[] str_array19 = resourceResolver12.getPropertyKeys();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider20 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str21 = apacheXMLProvider20.stringPropertyNames();
    java.lang.String str22 = apacheXMLProvider20.getInfo();
    resourceResolver12.addProperties((java.util.Map)apacheXMLProvider20);
    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP24 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver25 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP24);
    boolean b27 = resourceResolver25.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider28 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver25.addProperties((java.util.Map)apacheXMLProvider28);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath30 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj31 = apacheXMLProvider28.remove((java.lang.Object)transformXPath30);
    java.util.Set<java.lang.String> set_str32 = apacheXMLProvider28.stringPropertyNames();
    resourceResolver12.addProperties((java.util.Map)apacheXMLProvider28);
    apacheXMLProvider4.putAll((java.util.Map<java.lang.Object,java.lang.Object>)apacheXMLProvider28);
    java.lang.Object obj35 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.Object obj36 = apacheXMLProvider0.put((java.lang.Object)apacheXMLProvider28, obj35);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "ApacheXML version 1.0"+ "'", str2.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(service9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "Apache XML Security Provider"+ "'", str22.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b27 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str32);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test142"); }

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
    org.apache.xml.security.signature.InvalidSignatureValueException invalidSignatureValueException39 = new org.apache.xml.security.signature.InvalidSignatureValueException("PGPData", obj_array6);
    
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

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test143"); }

    java.lang.String str1 = org.apache.xml.security.utils.HexDump.toBinaryString(1355390783);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + " a a    #aa  a  a#a  aaaaa#  aaaaaa"+ "'", str1.equals(" a a    #aa  a  a#a  aaaaa#  aaaaaa"));

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test144"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Attr attr4 = org.apache.xml.security.utils.XMLUtils.createAttr(document0, "http://www.w3.org/2001/04/xmldsig-more#rsa-md5", "http://www.w3.org/2001/04/xmlenc#kw-aes256", "No message with ID &quot;KeyName&quot; found in resource bundle &quot;org/apache/xml/security/resource/xmlsecurity&quot;");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test145"); }

    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException2 = new org.apache.xml.security.signature.XMLSignatureException("00 00 00 03 ");
    org.apache.xml.security.signature.Reference reference3 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException4 = new org.apache.xml.security.signature.MissingResourceFailureException("0000: 61 61 20 20 61 61 20 61   20 61 61 61 61 61 61 61  aa  aa a aaaaaaa\n0010: 61 20 61 61 61 20 20 20   20 61 20 20 20 61 61 20  a aaa    a   aa \n0020: 20 61 61 20 61 61 61 20   61 20 61 61 20 61 61 20   aa aaa a aa aa \n0030: 61 61 61 61 61 20 61 61   61 61 61 61 61 20 20 61  aaaaa aaaaaaa  a\n0040: 61 61 61 61 61 20 20 20   61 61 61 20 61 20 61 20  aaaaa   aaa a a \n0050: 20 20 20 61 61 20 20 20   61                          aa   a\n", (java.lang.Exception)xMLSignatureException2, reference3);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test146"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    byte[] byte_array3 = org.apache.xml.security.utils.HexDump.toByteArray((short)1);
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore6 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter7 = null;
    apacheKeyStore6.engineLoad(loadStoreParameter7);
    java.security.cert.Certificate[] certificate_array10 = apacheKeyStore6.engineGetCertificateChain("Date");
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException11 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2000/09/xmldsig#sha1", (java.lang.Object[])certificate_array10);
    java.lang.Object[] obj_array17 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException18 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array17);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException19 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array17);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException20 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array17);
    java.lang.Object[] obj_array25 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException26 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array25);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException27 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array25);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException28 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array25);
    java.lang.Object[] obj_array32 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException33 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array32);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException34 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array32);
    java.lang.Object[] obj_array38 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException39 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array38);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException40 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array38);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException41 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException40);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException42 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array32, (java.lang.Exception)invalidCanonicalizerException40);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException43 = new org.apache.xml.security.signature.InvalidDigestValueException("PgenCounter", obj_array25, (java.lang.Exception)xMLSecurityException42);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException44 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2000/09/xmldsig#rsa-sha1", obj_array17, (java.lang.Exception)xMLSecurityException42);
    java.lang.Object[] obj_array48 = new java.lang.Object[] { true, 0 };
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException49 = new org.apache.xml.security.signature.XMLSignatureException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array48);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException51 = new org.apache.xml.security.signature.ReferenceNotInitializedException("\n");
    xMLSignatureException49.addSuppressed((java.lang.Throwable)referenceNotInitializedException51);
    java.lang.Exception exception53 = xMLSignatureException49.getOriginalException();
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException54 = new org.apache.xml.security.signature.XMLSignatureException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array17, (java.lang.Exception)xMLSignatureException49);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException55 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2001/04/xmlenc#", (java.lang.Object[])certificate_array10, (java.lang.Exception)xMLSignatureException49);
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineSetKeyEntry("X509CRL", byte_array3, certificate_array10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(exception53);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test147"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData2 = new org.apache.xml.security.encryption.CipherData(element0, "0000: 00 00 00 20                                        ... \n");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test148"); }

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
    boolean b60 = storageResolver56.hasNext();
    
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
    org.junit.Assert.assertTrue(b60 == false);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test149"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = resourceResolver1.understandsProperty("");
    java.lang.String[] str_array8 = resourceResolver1.getPropertyKeys();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider9 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str10 = apacheXMLProvider9.stringPropertyNames();
    java.lang.String str11 = apacheXMLProvider9.getInfo();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider9);
    java.util.Set<java.security.Provider.Service> set_service13 = apacheXMLProvider9.getServices();
    java.io.OutputStream outputStream14 = null;
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider9.storeToXML(outputStream14, "http://www.w3.org/2000/09/xmldsig#DSAKeyValue", "http://www.w3.org/2000/09/xmldsig#MgmtData");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Apache XML Security Provider"+ "'", str11.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_service13);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test150"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException8 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array5);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException9 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2001/04/xmlenc#dh", obj_array5);
    org.apache.xml.security.signature.Reference reference10 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException11 = new org.apache.xml.security.signature.MissingResourceFailureException("ReferenceList", obj_array5, reference10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test151"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetBlockSize();
    java.lang.String str2 = keyTransportImpl_RSAPKCS15_BC0.getImplementedAlgorithmURI();
    int i3 = keyTransportImpl_RSAPKCS15_BC0.engineGetBlockSize();
    org.w3c.dom.Element element4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams5 = keyTransportImpl_RSAPKCS15_BC0.engineInit(element4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-1_5"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-1_5"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test152"); }

    org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments transformC14NExclusiveWithComments0 = new org.apache.xml.security.transforms.implementations.TransformC14NExclusiveWithComments();
    boolean b1 = transformC14NExclusiveWithComments0.returnsNodeSet();
    boolean b2 = transformC14NExclusiveWithComments0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test153"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    java.lang.String[] str_array4 = resourceResolver1.getPropertyKeys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array4);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test154"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.lang.String str2 = apacheXMLProvider0.getInfo();
    java.util.Enumeration<java.lang.Object> enumeration_obj3 = apacheXMLProvider0.elements();
    int i4 = apacheXMLProvider0.size();
    boolean b5 = apacheXMLProvider0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "Apache XML Security Provider"+ "'", str2.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == false);

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test155"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    java.lang.String str1 = blockEncryptionImpl_TRIPLEDES_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    byte[] byte_array4 = org.apache.xml.security.utils.HexDump.toByteArray((long)2048);
    java.lang.String str5 = ant.HexDump.toHexString(byte_array4);
    java.security.Key key6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.security.Key key8 = blockEncryptionImpl_TRIPLEDES_BC0.engineUnwrap(byte_array4, key6, "");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#tripledes-cbc"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#tripledes-cbc"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "004004004004004004084004"+ "'", str5.equals("004004004004004004084004"));

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test156"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    boolean b3 = xMLSignatureInput1.isOctetStream();
    java.io.InputStream inputStream4 = xMLSignatureInput1.getOctetStream();
    byte[] byte_array5 = org.apache.xml.security.utils.JavaUtils.getBytesFromStream(inputStream4);
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous6 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(inputStream4);
    org.w3c.dom.Attr attr7 = null;
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput9 = resolverAnonymous6.engineResolve(attr7, "X509CRL");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(xMLSignatureInput9);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test157"); }

    byte[] byte_array1 = ant.HexDump.toByteArray((-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test158"); }

    org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature transformEnvelopedSignature0 = new org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature();
    boolean b1 = transformEnvelopedSignature0.returnsNodeSet();
    boolean b2 = transformEnvelopedSignature0.wantsNodeSet();
    boolean b3 = transformEnvelopedSignature0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test159"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    java.lang.String str3 = xMLSignatureInput1.getSourceURI();
    java.lang.String str4 = xMLSignatureInput1.getMIMEType();
    byte[] byte_array5 = xMLSignatureInput1.getBytes();
    byte[] byte_array6 = org.apache.xml.security.utils.Base64.decode(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test160"); }

    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsRegisteredAtSecurity("AES/CBC/ISO10126PADDING");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test161"); }

    java.lang.Object[] obj_array3 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException4 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array3);
    java.lang.Exception exception5 = null;
    org.w3c.dom.Attr attr6 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException8 = new org.apache.xml.security.utils.resolver.ResourceResolverException("hi!", obj_array3, exception5, attr6, "KeyName");
    java.lang.Object[] obj_array20 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException21 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array20);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array20);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException23 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array20);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException24 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array20);
    java.lang.Object[] obj_array29 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException30 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array29);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException31 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array29);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException32 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array29);
    org.apache.xml.security.signature.Reference reference33 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException34 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array29, reference33);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException35 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array20, (java.lang.Exception)missingResourceFailureException34);
    java.lang.Object[] obj_array39 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException40 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array39);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException41 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array39);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException42 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException41);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException43 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("ks", obj_array20, (java.lang.Exception)keyResolverException42);
    java.lang.Object[] obj_array44 = new java.lang.Object[] { "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n", "ds", invalidCipherTextException43 };
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException45 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("http://www.w3.org/TR/2001/WD-xptr-20010108", obj_array44);
    java.lang.Object[] obj_array51 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException52 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array51);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException53 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array51);
    java.lang.Object[] obj_array57 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException58 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array57);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException59 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array57);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException60 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException59);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException61 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array51, (java.lang.Exception)invalidCanonicalizerException59);
    org.apache.xml.security.signature.Reference reference62 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException63 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array51, reference62);
    org.apache.xml.security.signature.Reference reference64 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException65 = new org.apache.xml.security.signature.MissingResourceFailureException("http://www.w3.org/2000/09/xmldsig#base64", (java.lang.Exception)missingResourceFailureException63, reference64);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException66 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n", obj_array44, (java.lang.Exception)missingResourceFailureException65);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException67 = new org.apache.xml.security.signature.InvalidDigestValueException("ds", obj_array44);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException68 = new org.apache.xml.security.signature.ReferenceNotInitializedException("aaaaaaaa#aaaaaaaa", obj_array3, (java.lang.Exception)invalidDigestValueException67);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array57);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test162"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array2 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str5 = ant.HexDump.byteArrayToHexString(byte_array2, 32, 0);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.CipherData cipherData6 = new org.apache.xml.security.encryption.CipherData(document0, byte_array2);
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + ""+ "'", str5.equals(""));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test163"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC blockEncryptionImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES192_BC();
    java.lang.String str1 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    int i2 = blockEncryptionImpl_AES192_BC0.engineGetIvLength();
    boolean b4 = org.apache.xml.security.utils.JavaUtils.instanceOf((java.lang.Object)blockEncryptionImpl_AES192_BC0, "aaaaaaaa aaaaaaaa aaaaaaaa aaa aaaa");
    java.lang.String str5 = blockEncryptionImpl_AES192_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "BC"+ "'", str1.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "BC"+ "'", str5.equals("BC"));

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test164"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.ReferenceList referenceList2 = new org.apache.xml.security.encryption.ReferenceList(element0, "00 01 ");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test165"); }

    java.lang.String str1 = org.apache.xml.security.c14n.helper.C14nHelper.normalizeProcessingInstruction("http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/"+ "'", str1.equals("http://www.w3.org/TR/2001/WD-xmlenc-core-20010626/"));

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test166"); }

    org.w3c.dom.Document document0 = null;
    byte[] byte_array9 = new byte[] { (byte)0, (byte)1, (byte)-1, (byte)100, (byte)100, (byte)0 };
    java.lang.String str10 = ant.HexDump.byteArrayToHexString(byte_array9);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams11 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("", byte_array9);
    org.apache.xml.security.keys.KeyInfo keyInfo12 = null;
    org.apache.xml.security.encryption.EncryptionProperties encryptionProperties13 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.encryption.EncryptedData encryptedData15 = new org.apache.xml.security.encryption.EncryptedData(document0, "", (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams11, keyInfo12, encryptionProperties13, "\u0000");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "004014FF464464400"+ "'", str10.equals("004014FF464464400"));

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test167"); }

    byte[] byte_array2 = org.apache.xml.security.utils.PRNG.createBytes(0);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams3 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("FF#FF#", byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test168"); }

    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException1 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("");

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test169"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    org.w3c.dom.Document document1 = null;
    byte[] byte_array4 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str5 = ant.HexDump.toString(byte_array4);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams6 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("http://www.w3.org/2000/09/xmldsig#rawX509Certificate", byte_array4);
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams7 = keyWrapImpl_TRIPLEDES_BC0.engineInit(document1, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams6);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "\u0000\u0000\u0000 "+ "'", str5.equals("\u0000\u0000\u0000 "));

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test170"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.InclusiveNamespaces inclusiveNamespaces2 = new org.apache.xml.security.transforms.params.InclusiveNamespaces(document0, "J");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test171"); }

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
    x509CertificateResolver0.engineSetProperty("AAA=", "\uFFFD");
    x509CertificateResolver0.engineSetProperty("DigestMethod", "64 ");
    
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
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test172"); }

    byte[] byte_array2 = ant.HexDump.toByteArray((int)' ');
    java.lang.String str3 = ant.HexDump.toString(byte_array2);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams4 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("http://www.w3.org/2000/09/xmldsig#rawX509Certificate", byte_array2);
    java.lang.String str5 = oAEPParams4.getDigestMethodURI();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "\u0000\u0000\u0000 "+ "'", str3.equals("\u0000\u0000\u0000 "));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "http://www.w3.org/2000/09/xmldsig#rawX509Certificate"+ "'", str5.equals("http://www.w3.org/2000/09/xmldsig#rawX509Certificate"));

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test173"); }

    java.security.cert.X509Certificate x509Certificate0 = null;
    org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver singleCertificateResolver1 = new org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver(x509Certificate0);
    java.util.Iterator iterator2 = singleCertificateResolver1.getIterator();
    java.util.Iterator iterator3 = singleCertificateResolver1.getIterator();
    java.util.Iterator iterator4 = singleCertificateResolver1.getIterator();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iterator4);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test174"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInEncryptionSpace(element0, "");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test175"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC blockEncryptionImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_AES256_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    byte[] byte_array9 = new byte[] { (byte)-1, (byte)100, (byte)100, (byte)100, (byte)10, (byte)0 };
    java.lang.String str10 = ant.HexDump.byteArrayToHexString(byte_array9);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput11 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array9);
    java.lang.String str12 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array9);
    java.lang.String str15 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array9, (int)'4', (int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array16 = blockEncryptionImpl_AES256_BC0.engineWrap(key1, key2, byte_array9);
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "FF46446446440A400"+ "'", str10.equals("FF46446446440A400"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "0000: FF 64 64 64 0A 00                                  .ddd..\n"+ "'", str12.equals("0000: FF 64 64 64 0A 00                                  .ddd..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + ""+ "'", str15.equals(""));

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test176"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "", "http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test177"); }

    java.lang.Object[] obj_array5 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException6 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array5);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException7 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array5);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException8 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array5);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException9 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array5);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException11 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-md5");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException12 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array5, (java.lang.Exception)invalidKeyResolverException11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array5);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test178"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider1 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str2 = apacheXMLProvider1.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj3 = apacheXMLProvider1.entrySet();
    java.lang.String str5 = apacheXMLProvider1.getProperty("2.5.29.14");
    java.lang.String str6 = apacheXMLProvider1.toString();
    java.lang.Object[] obj_array10 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException11 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array10);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException12 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array10);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException13 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array10);
    boolean b14 = apacheXMLProvider1.contains((java.lang.Object)obj_array10);
    java.lang.Object[] obj_array18 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException19 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array18);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException20 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array18);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException21 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException20);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException22 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p", obj_array10, (java.lang.Exception)invalidCanonicalizerException20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "ApacheXML version 1.0"+ "'", str6.equals("ApacheXML version 1.0"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array18);

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test179"); }

    java.lang.String str1 = ant.HexDump.toBinaryString((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa4aaaaaaaa4aaaaaaaa4a  aa aa"+ "'", str1.equals("aaaaaaaa4aaaaaaaa4aaaaaaaa4a  aa aa"));

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test180"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.KeyName keyName2 = new org.apache.xml.security.keys.content.KeyName(document0, "http://www.w3.org/2002/04/xmldsig-filter2");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test181"); }

    byte[] byte_array1 = org.apache.xml.security.utils.HexDump.toByteArray((short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array1);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test182"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    org.w3c.dom.Document document3 = null;
    byte[] byte_array5 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str6 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array5);
    java.lang.String str7 = org.apache.xml.security.utils.Base64.encode(byte_array5);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams8 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("\u0000\u0000\u0000 ", byte_array5);
    byte[] byte_array9 = oAEPParams8.getOAEPParamBytes();
    java.lang.String str10 = oAEPParams8.getAlgorithmURI();
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams11 = keyTransportImpl_RSAPKCS15_BC0.engineInit(document3, (org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams)oAEPParams8);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str6.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "yTZ4mVI+6vI="+ "'", str7.equals("yTZ4mVI+6vI="));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str10.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test183"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPathFilterCHGPContainer xPathFilterCHGPContainer2 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.getInstance(element0, "XPath");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test184"); }

    org.w3c.dom.Attr attr0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver2 = org.apache.xml.security.utils.resolver.ResourceResolver.getInstance(attr0, "Object");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.utils.resolver.ResourceResolverException");
    } catch (org.apache.xml.security.utils.resolver.ResourceResolverException e) {
      // Expected exception.
    }

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test185"); }

    org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature transformEnvelopedSignature0 = new org.apache.xml.security.transforms.implementations.TransformEnvelopedSignature();
    boolean b1 = transformEnvelopedSignature0.wantsNodeSet();
    boolean b2 = transformEnvelopedSignature0.wantsNodeSet();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test186"); }

    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsRegisteredAtSecurity("EncryptionMethod");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == false);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test187"); }

    java.lang.String str1 = ant.HexDump.toBinaryString(256);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "aaaaaaaa4aaaaaaaa4aaaaaaa 4aaaaaaaa"+ "'", str1.equals("aaaaaaaa4aaaaaaaa4aaaaaaa 4aaaaaaaa"));

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test188"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.getDirectChild(element0, "0000: 48 4D 41 43 4F 75 74 70   75 74 4C 65 6E 67 74 68  HMACOutputLength\n", "No message with ID \"X509IssuerName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidSignatureValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"BC\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test189"); }

    org.apache.xml.security.utils.PRNG pRNG0 = org.apache.xml.security.utils.PRNG.getInstance();
    java.security.SecureRandom secureRandom1 = pRNG0.getSecureRandom();
    org.apache.xml.security.utils.PRNG.init(secureRandom1);
    org.apache.xml.security.utils.PRNG.init(secureRandom1);
    org.apache.xml.security.utils.PRNG.init(secureRandom1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(secureRandom1);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test190"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.keyvalues.DSAKeyValue dSAKeyValue2 = new org.apache.xml.security.keys.content.keyvalues.DSAKeyValue(element0, "No message with ID \"\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\". Original Exception was a org.apache.xml.security.signature.InvalidDigestValueException and message No message with ID \"subtract\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test191"); }

    java.lang.Object[] obj_array11 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException12 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array11);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException13 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array11);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException14 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array11);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException15 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array11);
    java.lang.Object[] obj_array20 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException21 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array20);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array20);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException23 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array20);
    org.apache.xml.security.signature.Reference reference24 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException25 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array20, reference24);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException26 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array11, (java.lang.Exception)missingResourceFailureException25);
    java.lang.Object[] obj_array30 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException31 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array30);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException32 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array30);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException33 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException32);
    org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException invalidCipherTextException34 = new org.apache.xml.security.algorithms.encryption.helper.InvalidCipherTextException("ks", obj_array11, (java.lang.Exception)keyResolverException33);
    java.lang.Object[] obj_array35 = new java.lang.Object[] { "0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n", "ds", invalidCipherTextException34 };
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException36 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("http://www.w3.org/TR/2001/WD-xptr-20010108", obj_array35);
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
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException56 = new org.apache.xml.security.signature.MissingResourceFailureException("http://www.w3.org/2000/09/xmldsig#base64", (java.lang.Exception)missingResourceFailureException54, reference55);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException57 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n", obj_array35, (java.lang.Exception)missingResourceFailureException56);
    java.lang.Object[] obj_array64 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException65 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array64);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException66 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array64);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException67 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array64);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException68 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array64);
    java.lang.Object[] obj_array73 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException74 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array73);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException75 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array73);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException76 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array73);
    org.apache.xml.security.signature.Reference reference77 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException78 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array73, reference77);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException79 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array64, (java.lang.Exception)missingResourceFailureException78);
    java.lang.Object[] obj_array85 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException86 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array85);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException87 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array85);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException88 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array85);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException89 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array85);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException90 = new org.apache.xml.security.keys.storage.StorageResolverException("HMACOutputLength", obj_array85);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException91 = new org.apache.xml.security.signature.InvalidDigestValueException("BC", obj_array64, (java.lang.Exception)storageResolverException90);
    org.w3c.dom.Attr attr92 = null;
    org.apache.xml.security.utils.resolver.ResourceResolverException resourceResolverException94 = new org.apache.xml.security.utils.resolver.ResourceResolverException("http://www.w3.org/2001/04/xmlenc#aes128-cbc", obj_array35, (java.lang.Exception)storageResolverException90, attr92, "00000000");
    java.lang.String str95 = storageResolverException90.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array48);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array64);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array73);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array85);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str95 + "' != '" + "org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str95.equals("org.apache.xml.security.keys.storage.StorageResolverException: No message with ID \"HMACOutputLength\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test192"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "FF ";

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test193"); }

    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous1 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous("CarriedKeyName");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test194"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.provider.Alias alias2 = new org.apache.xml.security.keys.provider.Alias(document0, "aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test195"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetBlockSize();
    java.lang.String str2 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    java.lang.String str3 = blockEncryptionImpl_TRIPLEDES_BC0.getRequiredProviderName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "BC"+ "'", str2.equals("BC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "BC"+ "'", str3.equals("BC"));

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test196"); }

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
    org.apache.xml.security.signature.XMLSignatureException xMLSignatureException28 = new org.apache.xml.security.signature.XMLSignatureException("00 00 00 03 ");
    java.lang.String str29 = xMLSignatureException28.toString();
    org.apache.xml.security.signature.Reference reference30 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException31 = new org.apache.xml.security.signature.MissingResourceFailureException("aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa#aaaaaaaa", (java.lang.Object[])certificate_array25, (java.lang.Exception)xMLSignatureException28, reference30);
    java.lang.Object[] obj_array38 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException39 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array38);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException40 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array38);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException41 = new org.apache.xml.security.c14n.CanonicalizationException("subtract", obj_array38);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException42 = new org.apache.xml.security.signature.InvalidDigestValueException("No message with ID \"http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"", obj_array38);
    java.lang.Object[] obj_array46 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException47 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array46);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException48 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array46);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException49 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException48);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException50 = new org.apache.xml.security.c14n.CanonicalizationException("http://www.w3.org/2001/04/xmldsig-more#", obj_array38, (java.lang.Exception)invalidCanonicalizerException48);
    org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException contentHandlerAlreadyRegisteredException51 = new org.apache.xml.security.keys.ContentHandlerAlreadyRegisteredException("", (java.lang.Exception)canonicalizationException50);
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException52 = new org.apache.xml.security.signature.InvalidDigestValueException("FF#FF#", (java.lang.Object[])certificate_array25, (java.lang.Exception)canonicalizationException50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str19 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str19.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str22 + "' != '" + "  aa aa 4aa  a  a4a    aaa4 aa  aa 4a a aa a4aa     a4   a a a4    aa a"+ "'", str22.equals("  aa aa 4aa  a  a4a    aaa4 aa  aa 4a a aa a4aa     a4   a a a4    aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str23 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str23.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str24 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str24.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "org.apache.xml.security.signature.XMLSignatureException: No message with ID \"00 00 00 03 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""+ "'", str29.equals("org.apache.xml.security.signature.XMLSignatureException: No message with ID \"00 00 00 03 \" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\""));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array46);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test197"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    java.lang.String str3 = xMLSignatureInput1.getMIMEType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test198"); }

    org.apache.xml.security.utils.I18n.defaultLanguageCode = "PGPData";

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test199"); }

    java.lang.String str2 = org.apache.xml.security.Init.getKeyInfoContentHandler("DataReference", "http://www.w3.org/2001/04/xmlenc#Element");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test200"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "        ", "FF ");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test201"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.io.InputStream inputStream1 = null;
    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore2 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter3 = null;
    apacheKeyStore2.engineLoad(loadStoreParameter3);
    java.io.InputStream inputStream5 = null;
    char[] char_array10 = new char[] { ' ', 'a', '#', ' ' };
    apacheKeyStore2.engineLoad(inputStream5, char_array10);
    apacheKeyStore0.engineLoad(inputStream1, char_array10);
    byte[] byte_array13 = org.apache.xml.security.keys.provider.KeyElement.PKCS12PasswordToBytes(char_array10);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput14 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array13);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test202"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.XMLUtils.createDSctx(document0, "http://www.w3.org/2001/04/xmlenc#ripemd160", "PGPKeyPacket");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test203"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    java.security.Key key2 = null;
    java.security.Key key3 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array4 = keyTransportImpl_RSAPKCS15_BC0.engineWrap(key2, key3);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test204"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC keyTransportImpl_RSAOAEP_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAOAEP_BC();
    java.lang.String str1 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmURI();
    int i3 = keyTransportImpl_RSAOAEP_BC0.getImplementedAlgorithmType();
    int i4 = keyTransportImpl_RSAOAEP_BC0.engineGetIvLength();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str1.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"+ "'", str2.equals("http://www.w3.org/2001/04/xmlenc#rsa-oaep-mgf1p"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == (-1));

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test205"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element3 = org.apache.xml.security.utils.ElementProxy.createElementForFamily(document0, "Transforms", "You must initialize the xml-security library correctly before you use it. Call the static method \"org.apache.xml.security.Init.init();\" to do that before you use any functionality from that library.");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test206"); }

    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array1 = org.apache.xml.security.utils.JavaUtils.getBytesFromFile("http://www.w3.org/2001/04/xmlenc#dh");
      org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
    } catch (java.io.FileNotFoundException e) {
      // Expected exception.
    }

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test207"); }

    boolean b1 = org.apache.xml.security.c14n.helper.C14nHelper.namespaceIsRelative("00 64 ");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b1 == true);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test208"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter1 = null;
    apacheKeyStore0.engineLoad(loadStoreParameter1);
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider3 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str4 = apacheXMLProvider3.stringPropertyNames();
    java.lang.String str5 = apacheXMLProvider3.getInfo();
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput7 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b8 = xMLSignatureInput7.isInitialized();
    boolean b9 = xMLSignatureInput7.isOctetStream();
    java.io.InputStream inputStream10 = xMLSignatureInput7.getOctetStream();
    apacheXMLProvider3.load(inputStream10);
    org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous resolverAnonymous12 = new org.apache.xml.security.utils.resolver.implementations.ResolverAnonymous(inputStream10);
    char[] char_array17 = new char[] { ' ', '#', 'a', 'a' };
    // The following exception was thrown during execution in test generation
    try {
    apacheKeyStore0.engineLoad(inputStream10, char_array17);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Apache XML Security Provider"+ "'", str5.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(char_array17);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test209"); }

    org.w3c.dom.Element element0 = null;
    boolean b2 = org.apache.xml.security.utils.XMLUtils.elementIsInEncryptionSpace(element0, "aa  aa a aaaaaaaa aaa    a   aa  aa aaa a aa aa aaaaa aaaaaaa  aaaaaa   aaa a a    aa   a");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test210"); }

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
    boolean b16 = storageResolver13.hasNext();
    java.security.cert.X509Certificate x509Certificate17 = null;
    org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver singleCertificateResolver18 = new org.apache.xml.security.keys.storage.implementations.SingleCertificateResolver(x509Certificate17);
    storageResolver13.add((org.apache.xml.security.keys.storage.StorageResolverSpi)singleCertificateResolver18);
    // The following exception was thrown during execution in test generation
    try {
    boolean b20 = rSAKeyValueResolver0.engineCanResolve(element1, "http://www.w3.org/2001/04/xmlenc#aes192-cbc", storageResolver13);
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
    org.junit.Assert.assertTrue(b16 == false);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test211"); }

    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException1 = new org.apache.xml.security.exceptions.XMLSecurityException("");

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test212"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC blockEncryptionImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.BlockEncryptionImpl_TRIPLEDES_BC();
    int i1 = blockEncryptionImpl_TRIPLEDES_BC0.engineGetBlockSize();
    byte[] byte_array3 = org.apache.xml.security.utils.HexDump.toByteArray(0);
    java.security.Key key4 = null;
    byte[] byte_array7 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str8 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array7);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Id", byte_array7);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams10 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("G", byte_array7);
    java.lang.String str11 = ant.HexDump.toBinaryString(byte_array7);
    java.lang.String str12 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array7);
    java.lang.String str13 = org.apache.xml.security.utils.HexDump.byteArrayToHexString(byte_array7);
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array14 = blockEncryptionImpl_TRIPLEDES_BC0.engineEncrypt(byte_array3, key4, byte_array7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"+ "'", str8.equals("0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "  aa aa 4aa  a  a4a    aaa4 aa  aa 4a a aa a4aa     a4   a a a4    aa a"+ "'", str11.equals("  aa aa 4aa  a  a4a    aaa4 aa  aa 4a a aa a4aa     a4   a a a4    aa a"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str12.equals("C9#36#78#99#52#3E#EA#F2"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "C9#36#78#99#52#3E#EA#F2"+ "'", str13.equals("C9#36#78#99#52#3E#EA#F2"));

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test213"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Attr attr4 = org.apache.xml.security.utils.XMLUtils.createAttr(document0, "  aa aa 4aa  a  a4a    aaa4 aa  aa 4a a aa a4aa     a4   a a a4    aa a", "aaaaaaaa aaaaaaaa aaaaaaaa aa  a aa", "ApacheXML version 1.0");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test214"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments canonicalizer20010315OmitComments0 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315OmitComments();
    java.lang.String str1 = canonicalizer20010315OmitComments0.engineGetURI();
    boolean b2 = canonicalizer20010315OmitComments0.engineGetIncludeComments();
    boolean b3 = canonicalizer20010315OmitComments0.engineGetIncludeComments();
    boolean b4 = canonicalizer20010315OmitComments0.engineGetIncludeComments();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider5 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.Object> set_obj6 = apacheXMLProvider5.keySet();
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array8 = canonicalizer20010315OmitComments0.engineCanonicalizeXPathNodeSet((java.util.Set)set_obj6, "32#00#1E#CC#14#20#01#03#15#CE");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.c14n.CanonicalizationException");
    } catch (org.apache.xml.security.c14n.CanonicalizationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str1 + "' != '" + "http://www.w3.org/TR/2001/REC-xml-c14n-20010315"+ "'", str1.equals("http://www.w3.org/TR/2001/REC-xml-c14n-20010315"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_obj6);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test215"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str1 = apacheXMLProvider0.stringPropertyNames();
    java.util.Set<java.util.Map.Entry<java.lang.Object,java.lang.Object>> set_entry_obj_obj2 = apacheXMLProvider0.entrySet();
    java.lang.String str4 = apacheXMLProvider0.getProperty("2.5.29.14");
    byte[] byte_array6 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str7 = org.apache.xml.security.utils.HexDump.toHexString(byte_array6);
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput8 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array6);
    xMLSignatureInput8.setSourceURI("Y");
    boolean b11 = xMLSignatureInput8.isOctetStream();
    java.io.InputStream inputStream12 = xMLSignatureInput8.getOctetStream();
    // The following exception was thrown during execution in test generation
    try {
    apacheXMLProvider0.loadFromXML(inputStream12);
      org.junit.Assert.fail("Expected exception of type java.util.InvalidPropertiesFormatException");
    } catch (java.util.InvalidPropertiesFormatException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_entry_obj_obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str7.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(inputStream12);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test216"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Enumeration<java.lang.Object> enumeration_obj1 = apacheXMLProvider0.keys();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(enumeration_obj1);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test217"); }

    org.apache.xml.security.c14n.helper.AttrCompare attrCompare0 = new org.apache.xml.security.c14n.helper.AttrCompare();
    byte[] byte_array4 = new byte[] { (byte)0, (byte)0 };
    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput5 = new org.apache.xml.security.signature.XMLSignatureInput(byte_array4);
    xMLSignatureInput5.setSourceURI("Encoding");
    // The following exception was thrown during execution in test generation
    try {
    int i8 = attrCompare0.compare((java.lang.Object)"Key", (java.lang.Object)"Encoding");
      org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
    } catch (java.lang.RuntimeException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array4);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test218"); }

    org.apache.xml.security.signature.XMLSignatureInput xMLSignatureInput1 = new org.apache.xml.security.signature.XMLSignatureInput("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter");
    boolean b2 = xMLSignatureInput1.isInitialized();
    boolean b3 = xMLSignatureInput1.isOctetStream();
    java.lang.String str4 = xMLSignatureInput1.getMIMEType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test219"); }

    java.lang.Object[] obj_array7 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException8 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array7);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException9 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array7);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException10 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array7);
    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException13 = new org.apache.xml.security.signature.ReferenceNotInitializedException("FF 64 64 64 0A 00");
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException14 = new org.apache.xml.security.exceptions.XMLSecurityException("X509IssuerName", (java.lang.Exception)referenceNotInitializedException13);
    org.apache.xml.security.transforms.TransformationException transformationException15 = new org.apache.xml.security.transforms.TransformationException("EncryptedData", obj_array7, (java.lang.Exception)xMLSecurityException14);
    java.lang.Object[] obj_array20 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException21 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array20);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException22 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array20);
    java.lang.Object[] obj_array26 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException27 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array26);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException28 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array26);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException29 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("ds", (java.lang.Exception)invalidCanonicalizerException28);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException30 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.w3.org/2000/09/xmldsig#MgmtData", obj_array20, (java.lang.Exception)invalidCanonicalizerException28);
    org.apache.xml.security.signature.Reference reference31 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException32 = new org.apache.xml.security.signature.MissingResourceFailureException("KeyInfo", obj_array20, reference31);
    org.apache.xml.security.signature.Reference reference33 = null;
    missingResourceFailureException32.setReference(reference33);
    org.apache.xml.security.signature.Reference reference35 = missingResourceFailureException32.getReference();
    org.apache.xml.security.signature.InvalidDigestValueException invalidDigestValueException36 = new org.apache.xml.security.signature.InvalidDigestValueException("Algorithm", obj_array7, (java.lang.Exception)missingResourceFailureException32);
    java.lang.Object[] obj_array42 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException43 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array42);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException44 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array42);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException45 = new org.apache.xml.security.exceptions.XMLSecurityException("http://www.xmlsecurity.org/NS#randomval", obj_array42);
    org.apache.xml.security.keys.keyresolver.KeyResolverException keyResolverException46 = new org.apache.xml.security.keys.keyresolver.KeyResolverException("http://www.w3.org/2001/04/xmldsig-more#rsa-sha512", obj_array42);
    java.lang.Object[] obj_array51 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException52 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array51);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException53 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array51);
    org.apache.xml.security.keys.storage.StorageResolverException storageResolverException54 = new org.apache.xml.security.keys.storage.StorageResolverException("Certificate", obj_array51);
    org.apache.xml.security.signature.Reference reference55 = null;
    org.apache.xml.security.signature.MissingResourceFailureException missingResourceFailureException56 = new org.apache.xml.security.signature.MissingResourceFailureException("Transforms", obj_array51, reference55);
    org.apache.xml.security.c14n.CanonicalizationException canonicalizationException57 = new org.apache.xml.security.c14n.CanonicalizationException("", obj_array42, (java.lang.Exception)missingResourceFailureException56);
    org.apache.xml.security.transforms.InvalidTransformException invalidTransformException58 = new org.apache.xml.security.transforms.InvalidTransformException("http://www.nue.et-inf.uni-siegen.de/~geuer-pollmann/#xpathFilter", obj_array7, (java.lang.Exception)missingResourceFailureException56);
    org.apache.xml.security.signature.Reference reference59 = missingResourceFailureException56.getReference();
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException60 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("64 01 0A FF 01 ", (java.lang.Exception)missingResourceFailureException56);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reference35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(reference59);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test220"); }

    org.w3c.dom.Document document0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.Element element2 = org.apache.xml.security.utils.IdResolver.getElementById(document0, "http://www.w3.org/2001/04/xmlenc#ripemd160");
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test221"); }

    org.apache.xml.security.signature.ReferenceNotInitializedException referenceNotInitializedException1 = new org.apache.xml.security.signature.ReferenceNotInitializedException("http://www.w3.org/2002/04/xmldsig-filter2");

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test222"); }

    org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments canonicalizer20010315WithComments1 = new org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithComments();
    org.w3c.dom.NodeList nodeList2 = null;
    byte[] byte_array3 = canonicalizer20010315WithComments1.engineCanonicalizeXPathNodeSet(nodeList2);
    org.apache.xml.security.utils.JavaUtils.writeBytesToFilename("Y", byte_array3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array3);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test223"); }

    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP0 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver1 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP0);
    boolean b3 = resourceResolver1.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider4 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider4);
    boolean b7 = resourceResolver1.understandsProperty("");
    java.lang.String[] str_array8 = resourceResolver1.getPropertyKeys();
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider9 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    java.util.Set<java.lang.String> set_str10 = apacheXMLProvider9.stringPropertyNames();
    java.lang.String str11 = apacheXMLProvider9.getInfo();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider9);
    org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP resolverDirectHTTP13 = new org.apache.xml.security.utils.resolver.implementations.ResolverDirectHTTP();
    org.apache.xml.security.utils.resolver.ResourceResolver resourceResolver14 = new org.apache.xml.security.utils.resolver.ResourceResolver((org.apache.xml.security.utils.resolver.ResourceResolverSpi)resolverDirectHTTP13);
    boolean b16 = resourceResolver14.understandsProperty("CipherValue");
    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider17 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    resourceResolver14.addProperties((java.util.Map)apacheXMLProvider17);
    org.apache.xml.security.transforms.implementations.TransformXPath transformXPath19 = new org.apache.xml.security.transforms.implementations.TransformXPath();
    java.lang.Object obj20 = apacheXMLProvider17.remove((java.lang.Object)transformXPath19);
    java.util.Set<java.lang.String> set_str21 = apacheXMLProvider17.stringPropertyNames();
    resourceResolver1.addProperties((java.util.Map)apacheXMLProvider17);
    java.lang.String str24 = resourceResolver1.getProperty("11001001400110110401111000410011001401010010400111110411101010411110010");
    resourceResolver1.setProperty("00#00#00#00#00#00#00#01#", "X509CRL");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "Apache XML Security Provider"+ "'", str11.equals("Apache XML Security Provider"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(obj20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set_str21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str24);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test224"); }

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
    boolean b15 = resolverAnonymous9.engineCanResolve(attr13, "xslt");
    
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
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test225"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    java.security.Key key1 = null;
    java.security.Key key2 = null;
    // The following exception was thrown during execution in test generation
    try {
    byte[] byte_array3 = keyWrapImpl_AES256_BC0.engineWrap(key1, key2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test226"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore1 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    java.security.KeyStore.LoadStoreParameter loadStoreParameter2 = null;
    apacheKeyStore1.engineLoad(loadStoreParameter2);
    java.security.KeyStore.ProtectionParameter protectionParameter5 = null;
    java.security.KeyStore.Entry entry6 = apacheKeyStore1.engineGetEntry("ds", protectionParameter5);
    byte[] byte_array9 = ant.HexDump.hexStringToByteArray("http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments");
    java.lang.String str10 = org.apache.xml.security.utils.HexDump.toHexString(byte_array9);
    java.security.cert.Certificate[] certificate_array11 = new java.security.cert.Certificate[] {  };
    apacheKeyStore1.engineSetKeyEntry("", byte_array9, certificate_array11);
    org.apache.xml.security.algorithms.encryption.params.OAEPParams oAEPParams13 = new org.apache.xml.security.algorithms.encryption.params.OAEPParams("01100100", byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(entry6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(byte_array9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str10 + "' != '" + "32#00#1E#CC#14#20#01#03#15#CE#"+ "'", str10.equals("32#00#1E#CC#14#20#01#03#15#CE#"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(certificate_array11);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test227"); }

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
    java.lang.Object[] obj_array23 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException24 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array23);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException25 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array23);
    java.lang.Object[] obj_array27 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException28 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array27);
    java.lang.Object[] obj_array31 = new java.lang.Object[] {  };
    org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException algorithmAlreadyRegisteredException32 = new org.apache.xml.security.exceptions.AlgorithmAlreadyRegisteredException("hi!", obj_array31);
    org.apache.xml.security.c14n.InvalidCanonicalizerException invalidCanonicalizerException33 = new org.apache.xml.security.c14n.InvalidCanonicalizerException("http://www.w3.org/2001/04/xmlenc#Element", obj_array31);
    algorithmAlreadyRegisteredException28.addSuppressed((java.lang.Throwable)invalidCanonicalizerException33);
    org.apache.xml.security.exceptions.XMLSecurityException xMLSecurityException35 = new org.apache.xml.security.exceptions.XMLSecurityException("", obj_array23, (java.lang.Exception)algorithmAlreadyRegisteredException28);
    org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException invalidKeyResolverException36 = new org.apache.xml.security.keys.keyresolver.InvalidKeyResolverException("CipherValue", (java.lang.Exception)xMLSecurityException35);
    org.apache.xml.security.transforms.TransformationException transformationException37 = new org.apache.xml.security.transforms.TransformationException("http://www.w3.org/2001/04/xmldsig-more#hmac-sha384", (java.lang.Object[])str_array6, (java.lang.Exception)invalidKeyResolverException36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(str_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array31);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test228"); }

    org.apache.xml.security.algorithms.encryption.params.StreamParams streamParams1 = new org.apache.xml.security.algorithms.encryption.params.StreamParams((int)(byte)1);
    java.lang.String str2 = streamParams1.getAlgorithmURI();
    java.lang.String str3 = streamParams1.getAlgorithmURI();
    org.w3c.dom.Document document4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.w3c.dom.DocumentFragment documentFragment5 = streamParams1.createChildNodes(document4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str3);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test229"); }

    org.apache.xml.security.utils.PRNG pRNG0 = org.apache.xml.security.utils.PRNG.getInstance();
    java.security.SecureRandom secureRandom1 = pRNG0.getSecureRandom();
    double d2 = pRNG0.nextDouble();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(pRNG0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(secureRandom1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(d2 == 0.706132266583194d);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test230"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC keyTransportImpl_RSAPKCS15_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyTransportImpl_RSAPKCS15_BC();
    int i1 = keyTransportImpl_RSAPKCS15_BC0.engineGetIvLength();
    boolean b2 = keyTransportImpl_RSAPKCS15_BC0.getRequiredProviderAvailable();
    int i3 = keyTransportImpl_RSAPKCS15_BC0.engineGetBlockSize();
    org.w3c.dom.Element element4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.algorithms.encryption.params.EncryptionMethodParams encryptionMethodParams5 = keyTransportImpl_RSAPKCS15_BC0.engineInit(element4);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test231"); }

    org.w3c.dom.Node node0 = null;
    org.w3c.dom.NodeList nodeList1 = org.apache.xml.security.utils.XMLUtils.elementToNodeList(node0);
    java.util.Set set2 = org.apache.xml.security.utils.XMLUtils.convertNodelistToSet(nodeList1);
    org.w3c.dom.NodeList nodeList3 = org.apache.xml.security.utils.XMLUtils.convertSetToNodelist(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(set2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(nodeList3);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test232"); }

    org.apache.xml.security.utils.I18n.defaultCountryCode = "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"";

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test233"); }

    org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver dSAKeyValueResolver0 = new org.apache.xml.security.keys.keyresolver.implementations.DSAKeyValueResolver();
    org.w3c.dom.Element element1 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver3 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver3.engineSetProperty("X509IssuerName", "P");
    java.lang.String str8 = retrievalMethodResolver3.engineGetProperty("http://www.w3.org/2000/09/xmldsig#MgmtData");
    org.w3c.dom.Element element9 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver11 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    org.w3c.dom.Element element12 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver14 = null;
    java.security.PublicKey publicKey15 = retrievalMethodResolver11.engineResolvePublicKey(element12, "subtract", storageResolver14);
    org.w3c.dom.Element element16 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver18 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element19 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver21 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey22 = x509IssuerSerialResolver18.engineResolveSecretKey(element19, "subtract", storageResolver21);
    java.security.cert.X509Certificate x509Certificate23 = retrievalMethodResolver11.engineResolveX509Certificate(element16, "http://www.w3.org/TR/2001/REC-xml-c14n-20010315#WithComments", storageResolver21);
    javax.crypto.SecretKey secretKey24 = retrievalMethodResolver3.engineResolveSecretKey(element9, "http://www.w3.org/2001/10/xml-exc-c14n#WithComments", storageResolver21);
    org.w3c.dom.Element element25 = null;
    org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver x509IssuerSerialResolver27 = new org.apache.xml.security.keys.keyresolver.implementations.X509IssuerSerialResolver();
    org.w3c.dom.Element element28 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver30 = new org.apache.xml.security.keys.storage.StorageResolver();
    javax.crypto.SecretKey secretKey31 = x509IssuerSerialResolver27.engineResolveSecretKey(element28, "subtract", storageResolver30);
    org.w3c.dom.Element element32 = null;
    org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver retrievalMethodResolver34 = new org.apache.xml.security.keys.keyresolver.implementations.RetrievalMethodResolver();
    retrievalMethodResolver34.engineSetProperty("X509IssuerName", "P");
    org.w3c.dom.Element element38 = null;
    org.apache.xml.security.keys.storage.StorageResolver storageResolver40 = new org.apache.xml.security.keys.storage.StorageResolver();
    java.security.PublicKey publicKey41 = retrievalMethodResolver34.engineResolvePublicKey(element38, "HMACOutputLength", storageResolver40);
    javax.crypto.SecretKey secretKey42 = x509IssuerSerialResolver27.engineResolveSecretKey(element32, "", storageResolver40);
    java.security.cert.X509Certificate x509Certificate43 = null;
    storageResolver40.add(x509Certificate43);
    javax.crypto.SecretKey secretKey45 = retrievalMethodResolver3.engineResolveSecretKey(element25, "00 03 ", storageResolver40);
    java.security.cert.X509Certificate x509Certificate46 = dSAKeyValueResolver0.engineResolveX509Certificate(element1, "X509SKI", storageResolver40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(publicKey41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(secretKey45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(x509Certificate46);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test234"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial xMLX509IssuerSerial2 = new org.apache.xml.security.keys.content.x509.XMLX509IssuerSerial(element0, "X509SubjectName");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test235"); }

    org.w3c.dom.Element element0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.apache.xml.security.transforms.params.XPathFilterCHGPContainer xPathFilterCHGPContainer2 = org.apache.xml.security.transforms.params.XPathFilterCHGPContainer.getInstance(element0, "PGPData");
      org.junit.Assert.fail("Expected exception of type org.apache.xml.security.exceptions.XMLSecurityException");
    } catch (org.apache.xml.security.exceptions.XMLSecurityException e) {
      // Expected exception.
    }

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test236"); }

    org.apache.xml.security.keys.provider.ApacheXMLProvider apacheXMLProvider0 = new org.apache.xml.security.keys.provider.ApacheXMLProvider();
    org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP transformXPathFilterCHGP1 = new org.apache.xml.security.transforms.implementations.TransformXPathFilterCHGP();
    boolean b2 = transformXPathFilterCHGP1.wantsOctetStream();
    boolean b3 = transformXPathFilterCHGP1.returnsNodeSet();
    boolean b4 = apacheXMLProvider0.containsKey((java.lang.Object)b3);
    boolean b6 = apacheXMLProvider0.containsValue((java.lang.Object)"X509IssuerSerial");
    boolean b7 = apacheXMLProvider0.isEmpty();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest3.test237"); }

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
    java.lang.Exception exception32 = referenceNotInitializedException31.getOriginalException();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj_array25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(exception32);

  }

}
