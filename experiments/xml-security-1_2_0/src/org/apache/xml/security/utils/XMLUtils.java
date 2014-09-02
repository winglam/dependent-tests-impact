
/*
 * Copyright  1999-2004 The Apache Software Foundation.
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */
package org.apache.xml.security.utils;



import java.io.IOException;
import java.io.OutputStream;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.apache.xml.security.c14n.CanonicalizationException;
import org.apache.xml.security.c14n.Canonicalizer;
import org.apache.xml.security.c14n.InvalidCanonicalizerException;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;



/**
 * DOM and XML accessibility and comfort functions.
 *
 * @author Christian Geuer-Pollmann
 */
public class XMLUtils {

    /** {@link org.apache.commons.logging} logging facility */
    static org.apache.commons.logging.Log log =
            org.apache.commons.logging.LogFactory.getLog(XMLUtils.class.getName());

    /**
     * Constructor XMLUtils
     *
     */
    private XMLUtils() {

        // we don't allow instantiation
    }


    /**
     * @param rootNode
     * @param result
     * @param exclude
     * @param com wheather comments or not
     */
    public static void getSet(Node rootNode,Set result,Node exclude ,boolean com) {
        if ((exclude!=null) && isDescendantOrSelf(exclude,rootNode)){
            return;
        }
        getSetRec(rootNode,result,exclude,com);
    }
    static final void getSetRec(final Node rootNode,final Set result,
            final Node exclude ,final boolean com) {
        //Set result = new HashSet();
        if (rootNode==exclude) {
            return;
        }
        switch (rootNode.getNodeType()) {
        case Node.ELEMENT_NODE:
            result.add(rootNode);
            Element el=(Element)rootNode;
            if (el.hasAttributes()) {
                NamedNodeMap nl = ((Element)rootNode).getAttributes();
                for (int i=0;i<nl.getLength();i++) {
                    result.add(nl.item(i));
                }
            }
            //no return keep working
        case Node.DOCUMENT_NODE:
            for (Node r=rootNode.getFirstChild();r!=null;r=r.getNextSibling()){
                if (r.getNodeType()==Node.TEXT_NODE) {
                    result.add(r);
                    while ((r!=null) && (r.getNodeType()==Node.TEXT_NODE)) {
                        r=r.getNextSibling();
                    }
                    if (r==null) {
                        return;
                    }
                }
                getSetRec(r,result,exclude,com);
            }
            return;
        case Node.COMMENT_NODE:
            if (com) {
                result.add(rootNode);
            }
            return;
        case Node.DOCUMENT_TYPE_NODE:
            return;
        default:
            result.add(rootNode);
        }
        return;
    }
    /**
     * Method getXalanVersion
     *
     * @return
     */
    public static String getXalanVersion() {

        String version = XMLUtils.getXalan1Version();

        if (version != null) {
            return version;
        }

        version = XMLUtils.getXalan20Version();

        if (version != null) {
            return version;
        }

        version = XMLUtils.getXalan2Version();

        if (version != null) {
            return version;
        }

        return "Apache Xalan not installed";

        // return "Apache " + org.apache.xalan.processor.XSLProcessorVersion.S_VERSION;
        // return "Apache " + org.apache.xalan.Version.getVersion();
    }

    /**
     * Method getXercesVersion
     *
     * @return
     */
    public static String getXercesVersion() {

        String version = XMLUtils.getXerces1Version();

        if (version != null) {
            return version;
        }

        version = XMLUtils.getXerces2Version();

        if (version != null) {
            return version;
        }

        return "Apache Xerces not installed";

        // return "Apache " + org.apache.xerces.impl.Version.fVersion;
        // return "Apache " + org.apache.xerces.framework.Version.fVersion;
    }

    /**
     * Method getXalan1Version
     *
     * @return
     */
    private static String getXalan1Version() {

        try {
            final String XALAN1_VERSION_CLASS =
                    "org.apache.xalan.xslt.XSLProcessorVersion";
            Class clazz = classForName(XALAN1_VERSION_CLASS);

            // Found Xalan-J 1.x, grab it's version fields
            StringBuffer buf = new StringBuffer();
            Field f = clazz.getField("PRODUCT");

            buf.append(f.get(null));
            buf.append(';');

            f = clazz.getField("LANGUAGE");

            buf.append(f.get(null));
            buf.append(';');

            f = clazz.getField("S_VERSION");

            buf.append(f.get(null));
            buf.append(';');

            return buf.toString();
        } catch (Exception e1) {
            return null;
        }
    }

    /**
     * Method getXalan20Version
     *
     * @return
     */
    private static String getXalan20Version() {

        try {

            // NOTE: This is the new Xalan 2.2+ version class
            final String XALAN2_2_VERSION_CLASS = "org.apache.xalan.Version";
            final String XALAN2_2_VERSION_METHOD = "getVersion";
            final Class noArgs[] = new Class[0];
            Class clazz = classForName(XALAN2_2_VERSION_CLASS);
            Method method = clazz.getMethod(XALAN2_2_VERSION_METHOD, noArgs);
            Object returnValue = method.invoke(null, new Object[0]);

            return (String) returnValue;
        } catch (Exception e2) {
            return null;
        }
    }

    /**
     * Method getXalan2Version
     *
     * @return
     */
    private static String getXalan2Version() {

        try {

            // NOTE: This is the old Xalan 2.0, 2.1, 2.2 version class,
            //    is being replaced by class below
            final String XALAN2_VERSION_CLASS =
                    "org.apache.xalan.processor.XSLProcessorVersion";
            Class clazz = classForName(XALAN2_VERSION_CLASS);

            // Found Xalan-J 2.x, grab it's version fields
            StringBuffer buf = new StringBuffer();
            Field f = clazz.getField("S_VERSION");

            buf.append(f.get(null));

            return buf.toString();
        } catch (Exception e2) {
            return null;
        }
    }

    /**
     * Method getXerces1Version
     *
     * @return
     */
    private static String getXerces1Version() {

        try {
            final String XERCES1_VERSION_CLASS =
                    "org.apache.xerces.framework.Version";
            Class clazz = classForName(XERCES1_VERSION_CLASS);

            // Found Xerces-J 1.x, grab it's version fields
            Field f = clazz.getField("fVersion");
            String parserVersion = (String) f.get(null);

            return parserVersion;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Method getXerces2Version
     *
     * @return
     */
    private static String getXerces2Version() {

        try {
            final String XERCES2_VERSION_CLASS = "org.apache.xerces.impl.Version";
            Class clazz = classForName(XERCES2_VERSION_CLASS);

            // Found Xerces-J 2.x, grab it's version fields
            Field f = clazz.getField("fVersion");
            String parserVersion = (String) f.get(null);

            return parserVersion;
        } catch (Exception e) {
            return null;
        }
    }

    /**
     * Worker method to load a class.
     * Factor out loading classes for future use and JDK differences.
     * Copied from javax.xml.*.FactoryFinder
     * @param className name of class to load from
     * an appropriate classLoader
     * @return the class asked for
     * @throws ClassNotFoundException
     */
    public static Class classForName(String className)
            throws ClassNotFoundException {

        ClassLoader classLoader = findClassLoader();

        if (classLoader == null) {
            return Class.forName(className);
        }
        return classLoader.loadClass(className);
    }

    /**
     * Worker method to figure out which ClassLoader to use.
     * For JDK 1.2 and later use the context ClassLoader.
     * Copied from javax.xml.*.FactoryFinder
     * @return the appropriate ClassLoader
     */
    protected static ClassLoader findClassLoader() {

        Method m = null;

        try {
            m = Thread.class.getMethod("getContextClassLoader", new Class[]{});
        } catch (NoSuchMethodException e) {

            // Assume that we are running JDK 1.1, use the current ClassLoader
            return XMLUtils.class.getClassLoader();
        }

        try {
            return (ClassLoader) m.invoke(Thread.currentThread(), new Object[]{});
        } catch (Exception e) {
            throw new RuntimeException(e.toString());
        }
    }


    /**
     * Method spitOutVersions
     *
     * @param log
     */
    public static void spitOutVersions(org.apache.commons.logging.Log log) {
        if (log.isDebugEnabled()) {
            log.debug(XMLUtils.getXercesVersion());
            log.debug(XMLUtils.getXalanVersion());
        }
    }

    /** Field nodeTypeString */
    private static String[] nodeTypeString = new String[]{ "", "ELEMENT",
        "ATTRIBUTE",
        "TEXT_NODE",
        "CDATA_SECTION",
        "ENTITY_REFERENCE",
        "ENTITY",
        "PROCESSING_INSTRUCTION",
        "COMMENT", "DOCUMENT",
        "DOCUMENT_TYPE",
        "DOCUMENT_FRAGMENT",
    "NOTATION" };

    /**
     * Transforms <code>org.w3c.dom.Node.XXX_NODE</code> NodeType values into
     * Strings.
     *
     * @param nodeType as taken from the {@link org.w3c.dom.Node#getNodeType} function
     * @return the String value.
     * @see org.w3c.dom.Node#getNodeType
     */
    public static String getNodeTypeString(short nodeType) {

        if ((nodeType > 0) && (nodeType < 13)) {
            return nodeTypeString[nodeType];
        }
        return "";
    }


    /**
     * Outputs a DOM tree to an {@link OutputStream}.
     *
     * @param contextNode root node of the DOM tree
     * @param os the {@link OutputStream}
     */
    public static void outputDOM(Node contextNode, OutputStream os) {
        XMLUtils.outputDOM(contextNode, os, false);
    }

    /**
     * Outputs a DOM tree to an {@link OutputStream}. <I>If an Exception is
     * thrown during execution, it's StackTrace is output to System.out, but the
     * Exception is not re-thrown.</I>
     *
     * @param contextNode root node of the DOM tree
     * @param os the {@link OutputStream}
     * @param addPreamble
     */
    public static void outputDOM(Node contextNode, OutputStream os,
            boolean addPreamble) {

        try {
            if (addPreamble) {
                os.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n".getBytes());
            }

            os.write(
                    Canonicalizer.getInstance(
                            Canonicalizer.ALGO_ID_C14N_WITH_COMMENTS).canonicalizeSubtree(
                                    contextNode));
        } catch (IOException ex) {}
        catch (InvalidCanonicalizerException ex) {
            ex.printStackTrace();
        } catch (CanonicalizationException ex) {
            ex.printStackTrace();
        }
    }

    /**
     * Serializes the <CODE>contextNode</CODE> into the OutputStream, <I>but
     * supresses all Exceptions</I>.
     * <BR />
     * NOTE: <I>This should only be used for debugging purposes,
     * NOT in a production environment; this method ignores all exceptions,
     * so you won't notice if something goes wrong. If you're asking what is to
     * be used in a production environment, simply use the code inside the
     * <code>try{}</code> statement, but handle the Exceptions appropriately.</I>
     *
     * @param contextNode
     * @param os
     */
    public static void outputDOMc14nWithComments(Node contextNode,
            OutputStream os) {

        try {
            os.write(
                    Canonicalizer.getInstance(
                            Canonicalizer.ALGO_ID_C14N_WITH_COMMENTS).canonicalizeSubtree(
                                    contextNode));
        } catch (IOException ex) {

            // throw new RuntimeException(ex.getMessage());
        } catch (InvalidCanonicalizerException ex) {

            // throw new RuntimeException(ex.getMessage());
        } catch (CanonicalizationException ex) {

            // throw new RuntimeException(ex.getMessage());
        }
    }


    /**
     * Method getFullTextChildrenFromElement
     *
     * @param element
     * @return
     */
    public static String getFullTextChildrenFromElement(Element element) {

        StringBuffer sb = new StringBuffer();
        NodeList children = element.getChildNodes();
        int iMax = children.getLength();

        for (int i = 0; i < iMax; i++) {
            Node curr = children.item(i);

            if (curr.getNodeType() == Node.TEXT_NODE) {
                sb.append(((Text) curr).getData());
            }
        }

        return sb.toString();
    }


    /**
     * Creates an Element in the XML Signature specification namespace.
     *
     * @param doc the factory Document
     * @param elementName the local name of the Element
     * @return the Element
     */
    public static Element createElementInSignatureSpace(Document doc,
            String elementName) {

        if (doc == null) {
            throw new RuntimeException("Document is null");
        }

        String ds = Constants.getSignatureSpecNSprefix();

        if ((ds == null) || (ds.length() == 0)) {
            Element element = doc.createElementNS(Constants.SignatureSpecNS,
                    elementName);

            element.setAttributeNS(Constants.NamespaceSpecNS, "xmlns",
                    Constants.SignatureSpecNS);

            return element;
        }
        Element element = doc.createElementNS(Constants.SignatureSpecNS,
                ds + ":" + elementName);

        element.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:" + ds,
                Constants.SignatureSpecNS);

        return element;

    }


    /**
     * Returns true if the element is in XML Signature namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Signature namespace and the local name equals the supplied one
     */
    public static boolean elementIsInSignatureSpace(Element element,
            String localName) {

        if ((element == null) ||
                !Constants.SignatureSpecNS.equals(element.getNamespaceURI()) ){
            return false;
        }

        if (!element.getLocalName().equals(localName)) {
            return false;
        }

        return true;
    }

    /**
     * Returns true if the element is in XML Encryption namespace and the local
     * name equals the supplied one.
     *
     * @param element
     * @param localName
     * @return true if the element is in XML Encryption namespace and the local name equals the supplied one
     */
    public static boolean elementIsInEncryptionSpace(Element element,
            String localName) {

        if ((element == null) ||
                !EncryptionConstants.EncryptionSpecNS.equals(element.getNamespaceURI())
                ){
            return false;
        }

        if (!element.getLocalName().equals(localName)) {
            return false;
        }

        return true;
    }

    /**
     * This method returns the owner document of a particular node.
     * This method is necessary because it <I>always</I> returns a
     * {@link Document}. {@link Node#getOwnerDocument} returns <CODE>null</CODE>
     * if the {@link Node} is a {@link Document}.
     *
     * @param node
     * @return the owner document of the node
     */
    public static Document getOwnerDocument(Node node) {

        if (node.getNodeType() == Node.DOCUMENT_NODE) {
            return (Document) node;
        }
        try {
            return node.getOwnerDocument();
        } catch (NullPointerException npe) {
            throw new NullPointerException(I18n.translate("endorsed.jdk1.4.0")
                    + " Original message was \""
                    + npe.getMessage() + "\"");
        }

    }

    /**
     * This method returns the first non-null owner document of the Node's in this Set.
     * This method is necessary because it <I>always</I> returns a
     * {@link Document}. {@link Node#getOwnerDocument} returns <CODE>null</CODE>
     * if the {@link Node} is a {@link Document}.
     *
     * @param xpathNodeSet
     * @return the owner document
     */
    public static Document getOwnerDocument(Set xpathNodeSet) {
        NullPointerException npe = null;
        Iterator iterator = xpathNodeSet.iterator();
        while(iterator.hasNext()) {
            Node node = (Node) iterator.next();
            int nodeType =node.getNodeType();
            if (nodeType == Node.DOCUMENT_NODE) {
                return (Document) node;
            }
            try {
                if (nodeType==Node.ATTRIBUTE_NODE) {
                    return ((Attr)node).getOwnerElement().getOwnerDocument();
                }
                return node.getOwnerDocument();
            } catch (NullPointerException e) {
                npe = e;
            }

        }
        throw new NullPointerException(I18n.translate("endorsed.jdk1.4.0")
                + " Original message was \""
                + (npe == null ? "" : npe.getMessage()) + "\"");
    }



    /**
     * Method createDSctx
     *
     * @param doc
     * @param prefix
     * @param namespace
     * @return
     */
    public static Element createDSctx(Document doc, String prefix,
            String namespace) {

        if ((prefix == null) || (prefix.trim().length() == 0)) {
            throw new IllegalArgumentException("You must supply a prefix");
        }

        Element ctx = doc.createElementNS(null, "namespaceContext");

        ctx.setAttributeNS(Constants.NamespaceSpecNS, "xmlns:" + prefix.trim(),
                namespace);

        return ctx;
    }



    /**
     * Method addReturnToElement
     *
     * @param e
     */
    public static void addReturnToElement(Element e) {

        Document doc = e.getOwnerDocument();

        e.appendChild(doc.createTextNode("\n"));
    }

    /**
     * Method convertNodelistToSet
     *
     * @param xpathNodeSet
     * @return
     */
    public static Set convertNodelistToSet(NodeList xpathNodeSet) {

        if (xpathNodeSet == null) {
            return new HashSet();
        }

        int length = xpathNodeSet.getLength();
        Set set = new HashSet(length);

        for (int i = 0; i < length; i++) {
            set.add(xpathNodeSet.item(i));
        }

        return set;
    }


    /**
     * This method spreads all namespace attributes in a DOM document to their
     * children. This is needed because the XML Signature XPath transform
     * must evaluate the XPath against all nodes in the input, even against
     * XPath namespace nodes. Through a bug in XalanJ2, the namespace nodes are
     * not fully visible in the Xalan XPath model, so we have to do this by
     * hand in DOM spaces so that the nodes become visible in XPath space.
     *
     * @param doc
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">Namespace axis resolution is not XPath compliant </A>
     */
    public static void circumventBug2650(Document doc) {

        Element documentElement = doc.getDocumentElement();

        // if the document element has no xmlns definition, we add xmlns=""
        Attr xmlnsAttr =
                documentElement.getAttributeNodeNS(Constants.NamespaceSpecNS, "xmlns");

        if (xmlnsAttr == null) {
            documentElement.setAttributeNS(Constants.NamespaceSpecNS, "xmlns", "");
        }

        XMLUtils.circumventBug2650recurse(doc);
    }

    /**
     * This is the work horse for {@link #circumventBug2650}.
     *
     * @param node
     * @see <A HREF="http://nagoya.apache.org/bugzilla/show_bug.cgi?id=2650">Namespace axis resolution is not XPath compliant </A>
     */
    private static void circumventBug2650recurse(Node node) {

        if (node.getNodeType() == Node.ELEMENT_NODE) {
            Element element = (Element) node;
            if (element.hasChildNodes() && element.hasAttributes()) {
                NamedNodeMap attributes = element.getAttributes();
                int attributesLength = attributes.getLength();

                for (Node child = element.getFirstChild(); child!=null;
                        child=child.getNextSibling()) {

                    if (child.getNodeType() == Node.ELEMENT_NODE) {
                        Element childElement = (Element) child;

                        for (int i = 0; i < attributesLength; i++) {
                            Attr currentAttr = (Attr) attributes.item(i);
                            if (Constants.NamespaceSpecNS.equals(
                                    currentAttr.getNamespaceURI())) {

                                if (!childElement.hasAttributeNS(
                                        Constants.NamespaceSpecNS,
                                        currentAttr.getLocalName())) {
                                    childElement.setAttributeNS(Constants.NamespaceSpecNS,
                                            currentAttr.getName(),
                                            currentAttr.getNodeValue());
                                }
                            }
                        }
                    }
                }
            }
        }

        for (Node child = node.getFirstChild(); child != null;
                child = child.getNextSibling()) {
            switch (child.getNodeType()) {

            case Node.ELEMENT_NODE :
            case Node.ENTITY_REFERENCE_NODE :
            case Node.DOCUMENT_NODE :
                circumventBug2650recurse(child);
            }
        }
    }

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return
     */
    public static Element selectDsNode(Node sibling, String nodeName, int number) {
        while (sibling!=null) {
            if (nodeName.equals(sibling.getLocalName())
                    && Constants.SignatureSpecNS.equals(sibling.getNamespaceURI())) {
                if (number==0){
                    return (Element)sibling;
                }
                number--;
            }
            sibling=sibling.getNextSibling();
        }
        return null;
    }

    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return
     */

    public static Element selectXencNode(Node sibling, String nodeName, int number) {
        while (sibling!=null) {
            if (nodeName.equals(sibling.getLocalName())
                    && EncryptionConstants.EncryptionSpecNS.equals(sibling.getNamespaceURI())) {
                if (number==0){
                    return (Element)sibling;
                }
                number--;
            }
            sibling=sibling.getNextSibling();
        }
        return null;
    }


    /**
     * @param sibling
     * @param nodeName
     * @param number
     * @return
     */
    public static Text selectDsNodeText(Node sibling, String nodeName, int number) {
        Node n=selectDsNode(sibling,nodeName,number);
        if (n==null) {
            return null;
        }
        n=n.getFirstChild();
        while (n!=null && n.getNodeType()!=Node.TEXT_NODE) {
            n=n.getNextSibling();
        }
        return (Text)n;
    }

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
     * @return
     */
    public static Text selectNodeText(Node sibling, String uri, String nodeName, int number) {
        Node n=selectNode(sibling,uri,nodeName,number);
        if (n==null) {
            return null;
        }
        n=n.getFirstChild();
        while (n!=null && n.getNodeType()!=Node.TEXT_NODE) {
            n=n.getNextSibling();
        }
        return (Text)n;
    }

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @param number
     * @return
     */
    public static Element selectNode(Node sibling, String uri,String nodeName, int number) {
        while (sibling!=null) {
            if (nodeName.equals(sibling.getLocalName())
                    && uri.equals(sibling.getNamespaceURI())) {
                if (number==0){
                    return (Element)sibling;
                }
                number--;
            }
            sibling=sibling.getNextSibling();
        }
        return null;
    }

    /**
     * @param sibling
     * @param nodeName
     * @return
     */
    public static Element[] selectDsNodes(Node sibling,String nodeName) {
        return selectNodes(sibling,Constants.SignatureSpecNS,nodeName);
    }

    /**
     * @param sibling
     * @param uri
     * @param nodeName
     * @return
     */
    public static Element[] selectNodes(Node sibling,String uri,String nodeName) {
        int size=20;
        Element[] a= new Element[size];
        int curr=0;
        //List list=new ArrayList();
        while (sibling!=null) {
            if (nodeName.equals(sibling.getLocalName())
                    && uri.equals(sibling.getNamespaceURI())) {
                a[curr++]=(Element)sibling;
                if (size<=curr) {
                    int cursize= size<<2;
                    Element []cp=new Element[cursize];
                    System.arraycopy(a,0,cp,0,size);
                    a=cp;
                    size=cursize;
                }
            }
            sibling=sibling.getNextSibling();
        }
        Element []af=new Element[curr];
        System.arraycopy(a,0,af,0,curr);
        return af;
    }

    /**
     * @param signatureElement
     * @param inputSet
     * @return
     */
    public static Set excludeNodeFromSet(Node signatureElement, Set inputSet) {
        Set resultSet = new HashSet();
        Iterator iterator = inputSet.iterator();

        while (iterator.hasNext()) {
            Node inputNode = (Node) iterator.next();

            if (!XMLUtils
                    .isDescendantOrSelf(signatureElement, inputNode)) {
                resultSet.add(inputNode);
            }
        }
        return resultSet;
    }

    /**
     * Returns true if the descendantOrSelf is on the descendant-or-self axis
     * of the context node.
     *
     * @param ctx
     * @param descendantOrSelf
     * @return
     */
    static boolean isDescendantOrSelf(Node ctx, Node descendantOrSelf) {

        if (ctx == descendantOrSelf) {
            return true;
        }

        Node parent = descendantOrSelf;

        while (true) {
            if (parent == null) {
                return false;
            }

            if (parent == ctx) {
                return true;
            }

            if (parent.getNodeType() == Node.ATTRIBUTE_NODE) {
                parent = ((Attr) parent).getOwnerElement();
            } else {
                parent = parent.getParentNode();
            }
        }
    }


    public static String getRandomNamespacePrefix() {
        // TODO Auto-generated method stub
        return null;
    }


    public static NodeList convertSetToNodelist(Set var1) {
        // TODO Auto-generated method stub
        return null;
    }
}