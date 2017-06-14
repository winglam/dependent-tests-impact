
package org.apache.xml.security.c14n;



import java.io.ByteArrayInputStream;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import javax.xml.parsers.*;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.w3c.dom.*;
import org.apache.xml.security.exceptions.*;
import org.apache.xml.security.signature.XMLSignatureInput;
import org.apache.xml.security.utils.Constants;
import org.apache.xml.security.utils.JavaUtils;


public class Canonicalizer {

   //J-
   /** The output encoding of canonicalized data */
   public static final String ENCODING = "UTF8";

   private static final String XPATH_NO_COMMENTS = "[not(self::comment())]";
   public static final String XPATH_C14N_WITH_COMMENTS = "(//. | //@* | //namespace::*)";
   public static final String XPATH_C14N_OMIT_COMMENTS = XPATH_C14N_WITH_COMMENTS + XPATH_NO_COMMENTS;
   public static final String XPATH_C14N_WITH_COMMENTS_SINGLE_NODE = "(.//. | .//@* | .//namespace::*)";
   public static final String XPATH_C14N_OMIT_COMMENTS_SINGLE_NODE = XPATH_C14N_WITH_COMMENTS_SINGLE_NODE + XPATH_NO_COMMENTS;

   public static final String ALGO_ID_C14N_OMIT_COMMENTS = "http://www.w3.org/TR/2001/REC-xml-c14n-20010315";
   public static final String ALGO_ID_C14N_WITH_COMMENTS = ALGO_ID_C14N_OMIT_COMMENTS + "#WithComments";
   public static final String ALGO_ID_C14N_EXCL_OMIT_COMMENTS = "http://www.w3.org/2001/10/xml-exc-c14n#";
   public static final String ALGO_ID_C14N_EXCL_WITH_COMMENTS = ALGO_ID_C14N_EXCL_OMIT_COMMENTS + "WithComments";

   static boolean _alreadyInitialized = false;
   static Map _canonicalizerHash = null;

   protected CanonicalizerSpi canonicalizerSpi = null;
   //J+

   /**
    * Method init
    *
    */
   public static void init() {

      if (!Canonicalizer._alreadyInitialized) {
         Canonicalizer._canonicalizerHash = new HashMap(10);
         Canonicalizer._alreadyInitialized = true;
      }
   }

   /**
    * Constructor Canonicalizer
    *
    * @param algorithmURI
    * @throws InvalidCanonicalizerException
    */
   private Canonicalizer(String algorithmURI)
           throws InvalidCanonicalizerException {

      try {
         String implementingClass = getImplementingClass(algorithmURI);

         this.canonicalizerSpi =
            (CanonicalizerSpi) Class.forName(implementingClass).newInstance();
      } catch (Exception e) {
         Object exArgs[] = { algorithmURI };

         throw new InvalidCanonicalizerException(
            "signature.Canonicalizer.UnknownCanonicalizer", exArgs);
      }
   }

   /**
    * Method getInstance
    *
    * @param algorithmURI
    *
    * @throws InvalidCanonicalizerException
    */
   public static final Canonicalizer getInstance(String algorithmURI)
           throws InvalidCanonicalizerException {

      Canonicalizer c14nizer = new Canonicalizer(algorithmURI);

      return c14nizer;
   }

   /**
    * Method register
    *
    * @param algorithmURI
    * @param implementingClass
    * @throws AlgorithmAlreadyRegisteredException
    */
   public static void register(String algorithmURI, String implementingClass)
           throws AlgorithmAlreadyRegisteredException {

      // check whether URI is already registered
      String registeredClass = getImplementingClass(algorithmURI);

      if ((registeredClass != null) && (registeredClass.length() != 0)) {
         Object exArgs[] = { algorithmURI, registeredClass };

         throw new AlgorithmAlreadyRegisteredException(
            "algorithm.alreadyRegistered", exArgs);
      }

      _canonicalizerHash.put(algorithmURI, implementingClass);
   }

   /**
    * Method getURI
    *
    *
    */
   public final String getURI() {
      return this.canonicalizerSpi.engineGetURI();
   }

   /**
    * Method getIncludeComments
    *
    *
    */
   public boolean getIncludeComments() {
      return this.canonicalizerSpi.engineGetIncludeComments();
   }


   public byte[] canonicalize(byte[] inputBytes)
           throws javax.xml.parsers.ParserConfigurationException,
                  java.io.IOException, org.xml.sax.SAXException,
                  CanonicalizationException {

      ByteArrayInputStream bais = new ByteArrayInputStream(inputBytes);
      InputSource in = new InputSource(bais);
      DocumentBuilderFactory dfactory = DocumentBuilderFactory.newInstance();

      dfactory.setNamespaceAware(true);

      // needs to validate for ID attribute nomalization
      dfactory.setValidating(true);

      DocumentBuilder db = dfactory.newDocumentBuilder();

      db.setErrorHandler(new org.apache.xml.security.utils
         .IgnoreAllErrorHandler());

      Document document = db.parse(in);
      byte result[] = this.canonicalizeSubtree(document);

      return result;
   }

   /**
    * Canonicalizes the subtree rooted by <CODE>node</CODE>.
    *
    * @param node
    *
    * @throws CanonicalizationException
    */
   public byte[] canonicalizeSubtree(Node node)
           throws CanonicalizationException {
      return this.canonicalizerSpi.engineCanonicalizeSubTree(node);
   }

   /**
    * Canonicalizes the subtree rooted by <CODE>node</CODE>.
    *
    * @param node
    * @param inclusiveNamespaces
    *
    * @throws CanonicalizationException
    */
   public byte[] canonicalizeSubtree(Node node, String inclusiveNamespaces)
           throws CanonicalizationException {
      return this.canonicalizerSpi.engineCanonicalizeSubTree(node,
              inclusiveNamespaces);
   }

   /**
    * Canonicalizes an XPath node set. The <CODE>xpathNodeSet</CODE> is treated
    * as a list of XPath nodes, not as a list of subtrees.
    *
    * @param xpathNodeSet
    *
    * @throws CanonicalizationException
    */
   public byte[] canonicalizeXPathNodeSet(NodeList xpathNodeSet)
           throws CanonicalizationException {
      return this.canonicalizerSpi.engineCanonicalizeXPathNodeSet(xpathNodeSet);
   }

   /**
    * Canonicalizes an XPath node set. The <CODE>xpathNodeSet</CODE> is treated
    * as a list of XPath nodes, not as a list of subtrees.
    *
    * @param xpathNodeSet
    * @param inclusiveNamespaces
    *
    * @throws CanonicalizationException
    */
   public byte[] canonicalizeXPathNodeSet(
           NodeList xpathNodeSet, String inclusiveNamespaces)
              throws CanonicalizationException {
      return this.canonicalizerSpi.engineCanonicalizeXPathNodeSet(xpathNodeSet,
              inclusiveNamespaces);
   }

   /**
    * Canonicalizes an XPath node set.
    *
    * @param xpathNodeSet
    *
    * @throws CanonicalizationException
    */
   public byte[] canonicalizeXPathNodeSet(Set xpathNodeSet)
           throws CanonicalizationException {
      return this.canonicalizerSpi.engineCanonicalizeXPathNodeSet(xpathNodeSet);
   }

   /**
    * Canonicalizes an XPath node set.
    *
    * @param xpathNodeSet
    * @param inclusiveNamespaces
    *
    * @throws CanonicalizationException
    */
   public byte[] canonicalizeXPathNodeSet(
           Set xpathNodeSet, String inclusiveNamespaces)
              throws CanonicalizationException {
      return this.canonicalizerSpi.engineCanonicalizeXPathNodeSet(xpathNodeSet,
              inclusiveNamespaces);
   }

   /**
    * Returns the name of the implementing {@link CanonicalizerSpi} class
    *
    * @return the name of the implementing {@link CanonicalizerSpi} class
    */
   public String getImplementingCanonicalizerClass() {
      return this.canonicalizerSpi.getClass().getName();
   }

   /**
    * Method getImplementingClass
    *
    * @param URI
    *
    */
   private static String getImplementingClass(String URI) {

      Iterator i = _canonicalizerHash.keySet().iterator();

      while (i.hasNext()) {
         String key = (String) i.next();

         if (key.equals(URI)) {
            return (String) _canonicalizerHash.get(key);
         }
      }

      return null;
   }
}
