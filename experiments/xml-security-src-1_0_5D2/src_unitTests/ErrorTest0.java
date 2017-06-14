
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test01"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    byte[] byte_array2 = org.apache.xml.security.keys.provider.KeyElement.salt;
    java.lang.String str3 = org.apache.xml.security.utils.HexDump.prettyPrintHex(byte_array2);
    java.lang.String str4 = org.apache.xml.security.utils.Base64.encode(byte_array2);
    java.security.cert.Certificate[] certificate_array5 = new java.security.cert.Certificate[] {  };
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    apacheKeyStore0.engineSetKeyEntry("SymmetricKeyWrap", byte_array2, certificate_array5);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test02"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.util.Enumeration enumeration1 = apacheKeyStore0.engineAliases();

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test03"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("J");

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test04"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("0000: 68 74 74 70 3A 2F 2F 77   77 77 2E 77 33 2E 6F 72  http://www.w3.or\n0010: 67 2F 32 30 30 31 2F 30   34 2F 78 6D 6C 65 6E 63  g/2001/04/xmlenc\n0020: 23 45 6C 65 6D 65 6E 74                            #Element\n");

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test05"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str1 = org.apache.xml.security.algorithms.JCEMapper.getAlgorithmClassFromURI("http://www.w3.org/TR/2001/REC-xml-c14n-20010315");

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test06"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.security.cert.Certificate certificate2 = apacheKeyStore0.engineGetCertificate("http://www.w3.org/XML/1998/namespace");

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test07"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass providerIdClass2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("", "Y");

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test08"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("ds");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test09"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.security.cert.Certificate[] certificate_array2 = apacheKeyStore0.engineGetCertificateChain("Modulus");

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test10"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver certsInFilesystemDirectoryResolver1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("JCAType");

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test11"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass providerIdClass2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("http://www.w3.org/2000/09/xmldsig#dsa-sha1", "No message with ID \"CarriedKeyName\" found in resource bundle \"org/apache/xml/security/resource/xmlsecurity\"");

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test12"); }

    org.apache.xml.security.keys.provider.ApacheKeyStore apacheKeyStore0 = new org.apache.xml.security.keys.provider.ApacheKeyStore();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i1 = apacheKeyStore0.engineSize();

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test13"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC keyWrapImpl_AES192_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES192_BC();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i1 = keyWrapImpl_AES192_BC0.engineGetBlockSize();

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test14"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass providerIdClass2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("C9#36#78#99#52#3E#EA#F2", "Modulus");

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test15"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass providerIdClass2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160", "0000: C9 36 78 99 52 3E EA F2                            .6x.R>..\n");

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test16"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    java.lang.String str2 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    java.lang.String str3 = keyWrapImpl_AES128_BC0.getRequiredProviderName();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i4 = keyWrapImpl_AES128_BC0.engineGetBlockSize();

  }

  @Test
  public void test17() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test17"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("http://www.w3.org/2000/09/xmldsig#X509Data");

  }

  @Test
  public void test18() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test18"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver certsInFilesystemDirectoryResolver1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("Xalan Java 2.5.1");

  }

  @Test
  public void test19() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test19"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("00000000");

  }

  @Test
  public void test20() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test20"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i1 = keyWrapImpl_AES256_BC0.engineGetBlockSize();

  }

  @Test
  public void test21() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test21"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver certsInFilesystemDirectoryResolver1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("http://www.w3.org/2001/04/xmldsig-more#hmac-ripemd160");

  }

  @Test
  public void test22() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test22"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC keyWrapImpl_AES128_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES128_BC();
    java.lang.String str1 = keyWrapImpl_AES128_BC0.getImplementedAlgorithmURI();
    int i2 = keyWrapImpl_AES128_BC0.engineGetIvLength();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = keyWrapImpl_AES128_BC0.engineGetBlockSize();

  }

  @Test
  public void test23() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test23"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str1 = org.apache.xml.security.algorithms.JCEMapper.getAlgorithmClassFromURI("HMACOutputLength");

  }

  @Test
  public void test24() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test24"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.addProvider("SignatureMethod");

  }

  @Test
  public void test25() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test25"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC keyWrapImpl_AES256_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_AES256_BC();
    int i1 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    int i3 = keyWrapImpl_AES256_BC0.engineGetIvLength();
    java.lang.String str4 = keyWrapImpl_AES256_BC0.getRequiredProviderName();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i5 = keyWrapImpl_AES256_BC0.engineGetBlockSize();

  }

  @Test
  public void test26() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test26"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.algorithms.JCEMapper.ProviderIdClass providerIdClass2 = org.apache.xml.security.algorithms.JCEMapper.translateURItoJCEID("http://www.w3.org/2001/10/xml-exc-c14n#", "http://www.w3.org/2001/04/xmldsig-more#rsa-sha384");

  }

  @Test
  public void test27() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test27"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b1 = org.apache.xml.security.algorithms.JCEMapper.getProviderIsInClassPath("http://www.w3.org/1999/XSL/Transform");

  }

  @Test
  public void test28() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test28"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str1 = org.apache.xml.security.algorithms.JCEMapper.getAlgorithmClassFromURI("Methods");

  }

  @Test
  public void test29() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test29"); }

    org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC keyWrapImpl_TRIPLEDES_BC0 = new org.apache.xml.security.algorithms.encryption.implementations.BC.KeyWrapImpl_TRIPLEDES_BC();
    int i1 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    int i2 = keyWrapImpl_TRIPLEDES_BC0.engineGetIvLength();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    int i3 = keyWrapImpl_TRIPLEDES_BC0.engineGetBlockSize();

  }

  @Test
  public void test30() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test30"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver certsInFilesystemDirectoryResolver1 = new org.apache.xml.security.keys.storage.implementations.CertsInFilesystemDirectoryResolver("0000: 00 01 FF 64 64 00                                  ...dd.\n");

  }

}
