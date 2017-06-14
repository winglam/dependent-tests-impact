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
import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.IgnoreAllErrorHandler;
import org.apache.xml.security.utils.JavaUtils;
import org.apache.xml.security.utils.XMLUtils;
import org.apache.xml.security.test.resource.TestVectorResolver;


/**
 * Unit test for {@link org.apache.xml.security.c14n.implementations.Canonicalizer20010315WithXPath}
 *
 * @author Christian Geuer-Pollmann
 */
public class Canonicalizer20010315Test37 extends TestCase {

   /** {@link org.apache.log4j} logging facility */
   static org.apache.log4j.Category cat =
      org.apache.log4j.Category
         .getInstance(Canonicalizer20010315Test37.class.getName());

   /**
    * Method suite
    *
    * @return
    */
   public static Test suite() {
      return new TestSuite(Canonicalizer20010315Test37.class);
   }

   /**
    *  Constructor Canonicalizer20010315WithXPathTest
    *
    *  @param Name_
    */
   public Canonicalizer20010315Test37(String Name_) {
      super(Name_);
   }

   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading",
                                Canonicalizer20010315Test37.class.getName() };

      junit.textui.TestRunner.main(testCaseName);
   }

   /** Field prefix */
   private static String prefix = "data/org/apache/xml/security/c14n/";

   public static void testXMLAttributes1()
           throws IOException, FileNotFoundException, SAXException,
                  ParserConfigurationException, CanonicalizationException,
                  InvalidCanonicalizerException, TransformerException {
      //J-
      String input = ""
         + "<included    xml:lang='de'>"
         + "<notIncluded xml:lang='de'>"
         + "<notIncluded xml:lang='uk'>"
         + "<included                 >"
         + "</included>"
         + "</notIncluded>"
         + "</notIncluded>"
         + "</included>";

      String definedOutput = ""
         + "<included xml:lang=\"de\">"
         + " xml:lang=\"de\""
         + " xml:lang=\"uk\""
         + "<included xml:lang=\"uk\">"
         + "</included>"
         + "</included>";
      //J+
      assertTrue(doTestXMLAttributes(input, definedOutput, true));
   }



   /**
    * Method c14nAndCompare
    *
    * @param fileIn
    * @param fileRef
    * @param fileOut
    * @param c14nURI
    * @param validating
    * @param xpath
    * @return
    * @throws CanonicalizationException
    * @throws FileNotFoundException
    * @throws IOException
    * @throws InvalidCanonicalizerException
    * @throws ParserConfigurationException
    * @throws SAXException
    * @throws TransformerException
    */
   private static boolean c14nAndCompare(
           String fileIn, String fileRef, String fileOut, String c14nURI, boolean validating, Object xpath)
              throws IOException, FileNotFoundException, SAXException,
                     ParserConfigurationException, CanonicalizationException,
                     InvalidCanonicalizerException, TransformerException {

      DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();

      dfactory.setNamespaceAware(true);
      dfactory.setValidating(validating);

      DocumentBuilder documentBuilder = dfactory.newDocumentBuilder();

      // throw away all warnings and errors
      documentBuilder.setErrorHandler(new IgnoreAllErrorHandler());

      // org.xml.sax.EntityResolver resolver = new TestVectorResolver();
      // documentBuilder.setEntityResolver(resolver);
      // Document doc = documentBuilder.parse(resolver.resolveEntity(null, fileIn));
      Document doc = documentBuilder.parse(fileIn);
      XMLUtils.circumventBug2650(doc);
      Canonicalizer c14n = Canonicalizer.getInstance(c14nURI);
      byte c14nBytes[] = null;

      if (xpath == null) {
         c14nBytes = c14n.canonicalizeSubtree(doc);
      } else {
         CachedXPathAPI xpathAPI = new CachedXPathAPI();
         NodeList nl = null;

         if (xpath instanceof String) {
            nl = xpathAPI.selectNodeList(doc, (String) xpath);
         } else {
            Element xpathElement = (Element) xpath;
            String xpathStr = ((Text) xpathElement.getFirstChild()).getData();

            nl = xpathAPI.selectNodeList(doc, xpathStr, xpathElement);
         }

         c14nBytes = c14n.canonicalizeXPathNodeSet(nl);
      }

      // org.xml.sax.InputSource refIs = resolver.resolveEntity(null, fileRef);
      // byte refBytes[] = JavaUtils.getBytesFromStream(refIs.getByteStream());
      byte refBytes[] = JavaUtils.getBytesFromFile(fileRef);

      // if everything is OK, result is true; we do a binary compare, byte by byte
      boolean result = JavaUtils.binaryCompare(refBytes, c14nBytes);

      if (result == false) {
         File f = new File(fileOut);
         FileOutputStream fos = new FileOutputStream(f);

         fos.write(c14nBytes);
         cat.debug("Wrote errornous result to file " + f.toURL().toString());
      }

      return result;
   }

   /**
    * This method takes the input bytes as XML Document and converts it to an
    * UTF-16 encoded XML document which is serialized to byte[] and returned.
    *
    * @param input
    * @return
    * @throws IOException
    * @throws ParserConfigurationException
    * @throws SAXException
    * @throws TransformerConfigurationException
    * @throws TransformerException
    */
   public static byte[] convertToUTF16(byte input[])
           throws ParserConfigurationException, IOException, SAXException,
                  TransformerConfigurationException, TransformerException {

      String ENCODING_ISO8859_1 = "ISO-8859-1";
      String ENCODING_UTF8 = "UTF-8";
      String ENCODING_UTF16 = "UTF-16";
      DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
      DocumentBuilder db = dbf.newDocumentBuilder();
      Document doc = db.parse(new ByteArrayInputStream(input));
      TransformerFactory tFactory = TransformerFactory.newInstance();
      Transformer transformer = tFactory.newTransformer();

      transformer.setOutputProperty(OutputKeys.ENCODING, ENCODING_UTF16);
      transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "no");

      DOMSource source = new DOMSource(doc);
      ByteArrayOutputStream os = new ByteArrayOutputStream();
      StreamResult result = new StreamResult(os);

      transformer.transform(source, result);

      return os.toByteArray();
   }

   private static boolean doTestXMLAttributes(
           String input, String definedOutput, boolean writeResultsToFile)
              throws IOException, FileNotFoundException, SAXException,
                     ParserConfigurationException, CanonicalizationException,
                     InvalidCanonicalizerException, TransformerException {

      DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();

      dfactory.setNamespaceAware(true);
      dfactory.setValidating(true);

      DocumentBuilder db = dfactory.newDocumentBuilder();

      db.setErrorHandler(new org.apache.xml.security.utils
         .IgnoreAllErrorHandler());

      Document doc = db.parse(new ByteArrayInputStream(input.getBytes()));
      Canonicalizer c14nizer =
         Canonicalizer.getInstance(Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS);
      CachedXPathAPI xpathAPI = new CachedXPathAPI();
      XMLUtils.circumventBug2650(doc);
      NodeList nodes =
         xpathAPI.selectNodeList(doc, "(//*[local-name()='included'] | //@*)");
      byte result[] = c14nizer.canonicalizeXPathNodeSet(nodes);
      byte defined[] = definedOutput.getBytes();

      if (writeResultsToFile) {
         File fileD = new File("defined.txt");
         FileOutputStream fd = new FileOutputStream(fileD);

         fd.write(defined);
         cat.debug("Wrote defined output from test to file "
                   + fileD.toURL().toString());

         File fileR = new File("result.txt");
         FileOutputStream fr = new FileOutputStream(fileR);

         fr.write(result);
         cat.debug("Wrote result output from test to file "
                   + fileR.toURL().toString());
      }

      return JavaUtils.binaryCompare(defined, result);
   }

   static {
      org.apache.xml.security.Init.init();
   }
}
