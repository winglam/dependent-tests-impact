package org.apache.xml.security.test.c14n;

import java.io.*;
import java.util.*;
import javax.xml.parsers.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.apache.xml.security.c14n.*;
import org.apache.xml.security.c14n.implementations.*;
import org.apache.xml.security.signature.*;
import org.apache.xml.security.test.interop.InteropTest;
import org.apache.xml.security.transforms.*;
import org.apache.xml.security.transforms.params.*;
import org.apache.xml.security.utils.*;
import org.apache.xpath.CachedXPathAPI;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

/**
 *
 * @author $Author$
 *
 */
public class C14nTest extends TestCase {
   /** {@link org.apache.log4j} logging facility */
   static org.apache.log4j.Category cat =
      org.apache.log4j.Category
         .getInstance(C14nTest.class.getName());

   /**
    * Method suite
    *
    * @return
    */
   public static Test suite() {
      TestSuite suite =
         new TestSuite("All c14n related JUnit Tests");

      //J-
      // suite.addTest(org.apache.xml.security.test.c14n.helper.AttrCompareTest.suite());
      suite.addTest(org.apache.xml.security.test.c14n.helper.C14nHelperTest.suite());

      suite.addTest(org.apache.xml.security.test.c14n.implementations.Canonicalizer20010315Test.suite());
      suite.addTest(org.apache.xml.security.test.c14n.implementations.C14NInterop.suite());

      suite.addTest(org.apache.xml.security.test.c14n.implementations.Canonicalizer20010315ExclusiveTest.suite());
      suite.addTest(org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.suite());

      suite.addTest(org.apache.xml.security.test.c14n.implementations.Merlin_C14n_Two.suite());
      //J+

      return suite;
   }

   /**
    *  Constructor C14nTest
    *
    *  @param Name_
    */
   public C14nTest(String Name_) {
      super(Name_);
   }

   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {

      String[] testCaseName = { "-noloading",
                                C14nTest.class.getName() };

      junit.textui.TestRunner.main(testCaseName);
   }

}