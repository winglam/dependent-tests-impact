
package org.apache.xml.security.samples.canonicalization;



import org.apache.xml.security.c14n.*;
import org.w3c.dom.*;
import org.apache.xpath.XPathAPI;
import org.apache.xml.security.utils.*;


/**
 * Class ExcCanNodesetTest
 *
 */
public class ExcCanNodesetTest {

   /**
    * Method main
    *
    * @param args
    */
   public static void main(String[] args) {
      org.apache.xml.security.Init.init();

      try {
         //J-
      String node = ""
        + "<doc xmlns=\"urn:default\" xmlns:x=\"urn:xns\"><!-- comment inside -->\n"
        + "   <x:e1   />\n"
        + "   <x:e2   ></x:e2>\n"
        + "   <x:e3    name = \"elem3\"   id=\"elem3\"    />\n"
        + "   <x:e4    name=\"elem4\"   id=\"elem4\"    ></x:e4>\n"
        + "   <x:e5 a:attr=\"out\" b:attr=\"sorted\" attr2=\"all\" attr=\"I'm\"\n"
        + "       xmlns=\"http://example.org\">\n"
        + "       <e6> e6 tag </e6>\n"
        + "       <x:e7> e7 tag </x:e7>\n"
        + "   </x:e5>\n"
        + "   <x:e8 xmlns=\"\" xmlns:a=\"http://www.w3.org\">\n"
        + "       <x:e9 xmlns=\"http://www.ietf.org\">\n"
        + "           <x:e10 xmlns=\"\" xmlns:a=\"http://www.w3.org\">\n"
        + "               <x:e11 xmlns=\"http://www.ietf.org\"/>\n"
        + "               <text>&#169;</text>\n"
        + "           </x:e10>\n"
        + "       </x:e9>\n"
        + "   </x:e8>\n"
        + "   <x:e1   />\n"
        + "   <x:e2   ></x:e2>\n"
        + "   <x:e3    name = \"elem3\"   id=\"elem3\"    />\n"
        + "   <x:e4    name=\"elem4\"   id=\"elem4\"    ></x:e4>\n"
        + "   <x:e5 a:attr=\"out\" b:attr=\"sorted\" attr2=\"all\" attr=\"I'm\"\n"
        + "       xmlns=\"http://example.org\">\n"
        + "       <e6> e6 tag </e6>\n"
        + "       <x:e7> e7 tag </x:e7>\n"
        + "   </x:e5>\n"
        + "   <x:e8 xmlns=\"\" xmlns:a=\"http://www.w3.org\">\n"
        + "       <x:e9 xmlns=\"http://www.ietf.org\">\n"
        + "           <x:e10 xmlns=\"\" xmlns:a=\"http://www.w3.org\">\n"
        + "               <x:e11 xmlns=\"http://www.ietf.org\"/>\n"
        + "               <text>&#169;</text>\n"
        + "           </x:e10>\n"
        + "       </x:e9>\n"
        + "   </x:e8>\n"
        + "</doc><!-- Comment 3 -->\n";
      //J+
         java.io.InputStream in =
            new java.io.ByteArrayInputStream(node.getBytes());
         javax.xml.parsers.DocumentBuilderFactory dbf =
            javax.xml.parsers.DocumentBuilderFactory.newInstance();

         dbf.setNamespaceAware(true);

         javax.xml.parsers.DocumentBuilder db = dbf.newDocumentBuilder();
         org.w3c.dom.Document doc = db.parse(in);
         Element nscontext = XMLUtils.createDSctx(doc, "x",
                                                  "xmlns:x=\"urn:xns\"");
         NodeList nsList = XPathAPI.selectNodeList(
            doc.getDocumentElement(),
            "(//. | //@* | //namespace::*)[ancestor-or-self::x:e8]");    //,nscontext);
         Canonicalizer can =
            Canonicalizer
               .getInstance(Canonicalizer.ALGO_ID_C14N_EXCL_OMIT_COMMENTS);

         //Canonicalizer can = Canonicalizer.getInstance( Canonicalizer.ALGO_ID_C14N_OMIT_COMMENTS );
         //can.setIncludingPrefixes("#default");
         long start = System.currentTimeMillis();

         System.out.println("Start to canonicalize.");

         byte[] canSubset = can.canonicalizeXPathNodeSet(nsList);

         System.out.println("Finished canonicalization. Time: "
                            + (System.currentTimeMillis() - start) + " ms");
         System.out.println();
         System.out.println("canSubset: \n" + new String(canSubset));
      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}
