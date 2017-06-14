package org.apache.xml.security.test.interop;


import java.io.*;
import java.lang.reflect.*;
import java.security.cert.*;
import java.security.PublicKey;
import java.util.*;
import javax.xml.parsers.*;
import javax.xml.transform.TransformerException;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import junit.extensions.TestSetup;
import org.apache.xml.security.c14n.*;
import org.apache.xml.security.exceptions.XMLSecurityException;
import org.apache.xml.security.Init;
import org.apache.xml.security.keys.*;
import org.apache.xml.security.keys.content.*;
import org.apache.xml.security.keys.content.x509.*;
import org.apache.xml.security.keys.keyresolver.*;
import org.apache.xml.security.keys.storage.*;
import org.apache.xml.security.keys.storage.implementations.*;
import org.apache.xml.security.test.utils.resolver.OfflineResolver;
import org.apache.xml.security.signature.*;
import org.apache.xml.security.utils.*;
import org.apache.xml.security.utils.resolver.*;
import org.apache.xml.security.utils.resolver.implementations.*;
import org.apache.xpath.objects.*;
import org.apache.xpath.XPathAPI;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 *
 *
 *
 *
 * @author $Author$
 *
 */

public class B1  extends InteropTest {


   /**
    * Method suite
    *
    * @return
    */
   public static Test suite() {
      TestSuite suite = new TestSuite(B1.class);

      return suite;
   }
   /**
    * Constructor B1
    *
    * @param Name_
    */
   public B1(String Name_) {
      super(Name_);
   }


   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading", B1.class.getName() };

      junit.textui.TestRunner.main(testCaseName);
   }

   public void test_sixteen_external_dsa() throws Exception {

      String filename =
         "data/ie/baltimore/merlin-examples/merlin-xmldsig-sixteen/signature.xml";
      ResourceResolverSpi resolver = new OfflineResolver();


      File f = new File(filename);
      javax.xml.parsers.DocumentBuilder db = this.dbf.newDocumentBuilder();
      org.w3c.dom.Document doc = db.parse(new java.io.FileInputStream(f));
      Element nscontext = XMLUtils.createDSctx(doc, "ds",
                                               Constants.SignatureSpecNS);
      Element sigElement = (Element) XPathAPI.selectSingleNode(doc,
                              "//ds:Signature[1]", nscontext);
      XMLSignature signature = new XMLSignature(sigElement,
                                                f.toURL().toString());

      if (resolver != null) {
         signature.addResourceResolver(resolver);
      }

      byte[] r = signature.getSignedInfo().item(3).getReferencedBytes();
      System.out.println(new String(r));


      /*
      boolean verify = signature.checkSignatureValue(signature.getKeyInfo().getPublicKey());

      if (!verify) {
         for (int i=0; i<signature.getSignedInfo().getLength(); i++) {
            boolean refVerify = signature.getSignedInfo().getVerificationResult(i);
            if (!refVerify) {
               System.out.println("\"" + signature.getSignedInfo().item(i).getURI() + "\" (" + i + ") failed");
               JavaUtils.writeBytesToFilename("" + i + "_before.xml", signature.getSignedInfo().getReferencedContentBeforeTransformsItem(i).getBytes());
               JavaUtils.writeBytesToFilename("" + i + "_after.xml", signature.getSignedInfo().getReferencedContentAfterTransformsItem(i).getBytes());
            } else {
               System.out.println("\"" + signature.getSignedInfo().item(i).getURI() + "\" (" + i + ") success");
            }
         }
      }
      */




      // assertTrue(filename, verify);
   }

}