/*
 * The Apache Software License, Version 1.1
 *
 *
 * Copyright (c) 1999 The Apache Software Foundation.  All rights
 * reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 *
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in
 *    the documentation and/or other materials provided with the
 *    distribution.
 *
 * 3. The end-user documentation included with the redistribution,
 *    if any, must include the following acknowledgment:
 *       "This product includes software developed by the
 *        Apache Software Foundation (http://www.apache.org/)."
 *    Alternately, this acknowledgment may appear in the software itself,
 *    if and wherever such third-party acknowledgments normally appear.
 *
 * 4. The names "<WebSig>" and "Apache Software Foundation" must
 *    not be used to endorse or promote products derived from this
 *    software without prior written permission. For written
 *    permission, please contact apache@apache.org.
 *
 * 5. Products derived from this software may not be called "Apache",
 *    nor may "Apache" appear in their name, without prior written
 *    permission of the Apache Software Foundation.
 *
 * THIS SOFTWARE IS PROVIDED ``AS IS'' AND ANY EXPRESSED OR IMPLIED
 * WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 * OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE
 * DISCLAIMED.  IN NO EVENT SHALL THE APACHE SOFTWARE FOUNDATION OR
 * ITS CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL,
 * SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT
 * LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF
 * USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND
 * ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY,
 * OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT
 * OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF
 * SUCH DAMAGE.
 * ====================================================================
 *
 * This software consists of voluntary contributions made by many
 * individuals on behalf of the Apache Software Foundation and was
 * originally based on software copyright (c) 2001, Institute for
 * Data Communications Systems, <http://www.nue.et-inf.uni-siegen.de/>.
 * The development of this software was partly funded by the European
 * Commission in the <WebSig> project in the ISIS Programme.
 * For more information on the Apache Software Foundation, please see
 * <http://www.apache.org/>.
 */
package org.apache.xml.security.test.c14n.implementations;



import java.io.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.OutputKeys;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.xpath.CachedXPathAPI;
import org.w3c.dom.*;
import org.xml.sax.SAXException;
import org.apache.xml.security.c14n.*;
import org.apache.xml.security.signature.*;
import org.apache.xml.security.utils.*;
import org.apache.xml.security.test.resource.TestVectorResolver;
import org.apache.xml.security.test.interop.InteropTest;


/**
 * Unit test for {@link org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithXPath}
 *
 * @author Christian Geuer-Pollmann
 */
public class Merlin_C14n_Two extends InteropTest {

   /** {@link org.apache.log4j} logging facility */
   static org.apache.log4j.Category cat =
      org.apache.log4j.Category
         .getInstance(Merlin_C14n_Two.class.getName());

   /**
    * Method suite
    *
    * @return
    */
   public static Test suite() {
      return new TestSuite(Merlin_C14n_Two.class);
   }

   /**
    *  Constructor Canonicalizer20010315WithXPathTest
    *
    *  @param Name_
    */
   public Merlin_C14n_Two(String Name_) {
      super(Name_);
   }

   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading",
                                Merlin_C14n_Two.class.getName() };

      org.apache.xml.security.Init.init();
      junit.textui.TestRunner.main(testCaseName);
   }

   public void test_merlin_c14n_two() throws Exception {

      String filename = "data/ie/baltimore/merlin-examples/c14n-merlin-c14n-two/signature.xml";
      // String filename = "sig2.xml";
      File f = new File(filename);
      javax.xml.parsers.DocumentBuilderFactory dbf = javax.xml.parsers.DocumentBuilderFactory.newInstance();
      dbf.setNamespaceAware(true);
      javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
      org.w3c.dom.Document doc = db.parse(f);

      Element sigElement = (Element) doc.getElementsByTagNameNS(Constants.SignatureSpecNS, Constants._TAG_SIGNATURE).item(0);
      XMLSignature signature = new XMLSignature(sigElement, f.toURL().toString());
      boolean verify = signature.checkSignatureValue(signature.getKeyInfo().getPublicKey());

      int failures = 0;
      if (!verify) {
         for (int i=0; i<signature.getSignedInfo().getLength(); i++) {
            boolean refVerify = signature.getSignedInfo().getVerificationResult(i);
            if (refVerify) {
               cat.debug("Reference " + i + " was OK");
            } else {
               cat.debug("Reference " + i + " failed");
               failures++;
               XMLSignatureInput result = signature.getSignedInfo().getReferencedContentAfterTransformsItem(i);
               JavaUtils.writeBytesToFilename("data/ie/baltimore/merlin-examples/c14n-merlin-c14n-two/c14n-" + i + "-apache.txt", result.getBytes());
            }
            // assertTrue("Reference " + i, refVerify);
         }
      }

      assertTrue(failures + "/" + signature.getSignedInfo().getLength() + " failed", verify);
   }
}
