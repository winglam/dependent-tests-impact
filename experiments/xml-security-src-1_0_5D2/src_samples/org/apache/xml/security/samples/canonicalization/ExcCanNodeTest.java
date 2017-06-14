
package org.apache.xml.security.samples.canonicalization;



import org.apache.xml.security.c14n.*;
import org.w3c.dom.*;
import org.apache.xpath.XPathAPI;
import org.apache.xml.security.utils.*;


/**
 * Class ExcCanNodeTest
 *
 * 
 */
public class ExcCanNodeTest {

   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {
      org.apache.xml.security.Init.init();

      try {
         //J-

      String node =
      "<?xml version=\"1.0\" encoding=\"ISO-8859-1\"?>\n"                                       +
      "<Foo xmlns:bar=\"urn:bar\" xmlns=\"urn:foo\" xmlns:dsig=\"http://www.w3.org/2000/09/xmldsig#\" xml:space=\"preserve\">\n"+
      " <dsig:SignedInfo>\n"                                                                    +
      "  <dsig:CanonicalizationMethod Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/>\n"+
      "  <dsig:SignatureMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#dsa-sha1\"/>\n"    +
      "  <dsig:Reference URI=\"#xpointer(id('to-be-signed'))\">\n"                              +
      "   <dsig:Transforms>\n"                                                                  +
      "    <dsig:Transform Algorithm=\"http://www.w3.org/2001/10/xml-exc-c14n#\"/>\n"           +
      "   </dsig:Transforms>\n"                                                                 +
      "   <dsig:DigestMethod Algorithm=\"http://www.w3.org/2000/09/xmldsig#sha1\"/>\n"          +
      "   <dsig:DigestValue>7yOTjUu+9oEhShgyIIXDLjQ08aY=</dsig:DigestValue>\n"                  +
      "  </dsig:Reference>\n"                                                                   +
      " </dsig:SignedInfo>\n"                                                                   +
      "</Foo>\n";
      //J+
         java.io.InputStream in =
            new java.io.ByteArrayInputStream(node.getBytes());
         javax.xml.parsers.DocumentBuilderFactory dbf =
            javax.xml.parsers.DocumentBuilderFactory.newInstance();

         dbf.setNamespaceAware(true);

         javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
         org.w3c.dom.Document doc = db.parse(in);
         Element nscontext = XMLUtils.createDSctx(doc, "dsig",
                                                  Constants.SignatureSpecNS);
         NodeList nsList = XPathAPI.selectNodeList(doc.getDocumentElement(),
                                                   "//dsig:SignedInfo",
                                                   nscontext);
         Canonicalizer can =
            Canonicalizer
               .getInstance(Canonicalizer.ALGO_ID_C14N_EXCL_OMIT_COMMENTS);

         //Canonicalizer can = Canonicalizer.getInstance( Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS );
         //can.setIncludingPrefixes("#default bar");
         long start = System.currentTimeMillis();

         System.out.println("Start to canonicalize.");

         byte[] canSubset = can.canonicalizeSubtree(nsList.item(0));

         System.out.println("Finished canonicalization. Time: "
                            + (System.currentTimeMillis() - start) + " ms");
         System.out.println();
         System.out.println("canSubset: \n" + new String(canSubset));
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}
