org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r3 = new java.io.File >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r4 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r4 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r4.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r4.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r12 = virtualinvoke $r4.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r12 = virtualinvoke $r4.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r13 = virtualinvoke $r12.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r13 = virtualinvoke $r12.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r14 = virtualinvoke $r13.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r2)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r14 = virtualinvoke $r13.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r2) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r15 = virtualinvoke $r14.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r15 = virtualinvoke $r14.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r3.<java.io.File: void <init>(java.lang.String)>($r15)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r3.<java.io.File: void <init>(java.lang.String)>($r15) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r5 = $r3
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r5 = $r3 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r6 = staticinvoke <javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilderFactory newInstance()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r6 = staticinvoke <javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilderFactory newInstance()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: void setNamespaceAware(boolean)>(1)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: void setNamespaceAware(boolean)>(1) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r7 = virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilder newDocumentBuilder()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r7 = virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilder newDocumentBuilder()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r8 = virtualinvoke r7.<javax.xml.parsers.DocumentBuilder: org.w3c.dom.Document parse(java.io.File)>(r5)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r8 = virtualinvoke r7.<javax.xml.parsers.DocumentBuilder: org.w3c.dom.Document parse(java.io.File)>(r5) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : l0 = staticinvoke <java.lang.System: long currentTimeMillis()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : l0 = staticinvoke <java.lang.System: long currentTimeMillis()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : staticinvoke <org.apache.xml.security.utils.XMLUtils: void circumventBug2650(org.w3c.dom.Document)>(r8)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : staticinvoke <org.apache.xml.security.utils.XMLUtils: void circumventBug2650(org.w3c.dom.Document)>(r8) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : l1 = staticinvoke <java.lang.System: long currentTimeMillis()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : l1 = staticinvoke <java.lang.System: long currentTimeMillis()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r16 = <org.apache.xml.security.test.c14n.implementations.C14NInterop: org.apache.log4j.Category cat>
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r16 = <org.apache.xml.security.test.c14n.implementations.C14NInterop: org.apache.log4j.Category cat> >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r17 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r17 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r17.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r17.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r18 = virtualinvoke $r17.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("fixSubtree took ")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r18 = virtualinvoke $r17.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("fixSubtree took ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $l4 = l1 - l0
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $l4 = l1 - l0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $i5 = (int) $l4
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $i5 = (int) $l4 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r19 = virtualinvoke $r18.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>($i5)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r19 = virtualinvoke $r18.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>($i5) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r20 = virtualinvoke $r19.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r20 = virtualinvoke $r19.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke $r16.<org.apache.log4j.Category: void debug(java.lang.Object)>($r20)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke $r16.<org.apache.log4j.Category: void debug(java.lang.Object)>($r20) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r21 = interfaceinvoke r8.<org.w3c.dom.Document: org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String,java.lang.String)>("http://www.w3.org/2000/09/xmldsig#", "Signature")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r21 = interfaceinvoke r8.<org.w3c.dom.Document: org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String,java.lang.String)>("http://www.w3.org/2000/09/xmldsig#", "Signature") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r22 = interfaceinvoke $r21.<org.w3c.dom.NodeList: org.w3c.dom.Node item(int)>(0)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r22 = interfaceinvoke $r21.<org.w3c.dom.NodeList: org.w3c.dom.Node item(int)>(0) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r9 = (org.w3c.dom.Element) $r22
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r9 = (org.w3c.dom.Element) $r22 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r23 = new org.apache.xml.security.signature.XMLSignature
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r23 = new org.apache.xml.security.signature.XMLSignature >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r24 = virtualinvoke r5.<java.io.File: java.net.URL toURL()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r24 = virtualinvoke r5.<java.io.File: java.net.URL toURL()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r25 = virtualinvoke $r24.<java.net.URL: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r25 = virtualinvoke $r24.<java.net.URL: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r23.<org.apache.xml.security.signature.XMLSignature: void <init>(org.w3c.dom.Element,java.lang.String)>(r9, $r25)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r23.<org.apache.xml.security.signature.XMLSignature: void <init>(org.w3c.dom.Element,java.lang.String)>(r9, $r25) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r10 = $r23
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r10 = $r23 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r26 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.keys.KeyInfo getKeyInfo()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r26 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.keys.KeyInfo getKeyInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r27 = virtualinvoke $r26.<org.apache.xml.security.keys.KeyInfo: java.security.PublicKey getPublicKey()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r27 = virtualinvoke $r26.<org.apache.xml.security.keys.KeyInfo: java.security.PublicKey getPublicKey()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : z0 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: boolean checkSignatureValue(java.security.Key)>($r27)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : z0 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: boolean checkSignatureValue(java.security.Key)>($r27) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i2 = 0
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i2 = 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if z0 != 0
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if z0 != 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i3 = 0
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if z0 != 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : return z0
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i3 = 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r28 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r28 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $i6 = virtualinvoke $r28.<org.apache.xml.security.signature.SignedInfo: int getLength()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $i6 = virtualinvoke $r28.<org.apache.xml.security.signature.SignedInfo: int getLength()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if i3 >= $i6
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if i3 >= $i6 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r29 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if i3 >= $i6 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : return z0
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r29 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : z1 = virtualinvoke $r29.<org.apache.xml.security.signature.SignedInfo: boolean getVerificationResult(int)>(i3)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : z1 = virtualinvoke $r29.<org.apache.xml.security.signature.SignedInfo: boolean getVerificationResult(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if z1 == 0
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if z1 == 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r30 = <org.apache.xml.security.test.c14n.implementations.C14NInterop: org.apache.log4j.Category cat>
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : if z1 == 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r36 = <org.apache.xml.security.test.c14n.implementations.C14NInterop: org.apache.log4j.Category cat>
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r36 = <org.apache.xml.security.test.c14n.implementations.C14NInterop: org.apache.log4j.Category cat> >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r37 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r37 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r37.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r37.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r38 = virtualinvoke $r37.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r38 = virtualinvoke $r37.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r39 = virtualinvoke $r38.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r39 = virtualinvoke $r38.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r40 = virtualinvoke $r39.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" failed")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r40 = virtualinvoke $r39.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" failed") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r41 = virtualinvoke $r40.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r41 = virtualinvoke $r40.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke $r36.<org.apache.log4j.Category: void debug(java.lang.Object)>($r41)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke $r36.<org.apache.log4j.Category: void debug(java.lang.Object)>($r41) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i2 = i2 + 1
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i2 = i2 + 1 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r42 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r42 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r11 = virtualinvoke $r42.<org.apache.xml.security.signature.SignedInfo: org.apache.xml.security.signature.XMLSignatureInput getReferencedContentAfterTransformsItem(int)>(i3)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : r11 = virtualinvoke $r42.<org.apache.xml.security.signature.SignedInfo: org.apache.xml.security.signature.XMLSignatureInput getReferencedContentAfterTransformsItem(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r43 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r43 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r43.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r43.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r44 = virtualinvoke $r43.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r44 = virtualinvoke $r43.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r45 = virtualinvoke $r44.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/c14n-")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r45 = virtualinvoke $r44.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/c14n-") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r46 = virtualinvoke $r45.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r46 = virtualinvoke $r45.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r47 = virtualinvoke $r46.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("-apache.txt")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r47 = virtualinvoke $r46.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("-apache.txt") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r48 = virtualinvoke $r47.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r48 = virtualinvoke $r47.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r49 = virtualinvoke r11.<org.apache.xml.security.signature.XMLSignatureInput: byte[] getBytes()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r49 = virtualinvoke r11.<org.apache.xml.security.signature.XMLSignatureInput: byte[] getBytes()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : staticinvoke <org.apache.xml.security.utils.JavaUtils: void writeBytesToFilename(java.lang.String,byte[])>($r48, $r49)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : staticinvoke <org.apache.xml.security.utils.JavaUtils: void writeBytesToFilename(java.lang.String,byte[])>($r48, $r49) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i3 = i3 + 1
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i3 = i3 + 1 >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : goto [?= $r28 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()]
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : goto [?= $r28 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()] >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r28 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r30 = <org.apache.xml.security.test.c14n.implementations.C14NInterop: org.apache.log4j.Category cat> >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r31 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r31 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r31.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : specialinvoke $r31.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r32 = virtualinvoke $r31.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r32 = virtualinvoke $r31.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r33 = virtualinvoke $r32.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r33 = virtualinvoke $r32.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r34 = virtualinvoke $r33.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" was OK")
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r34 = virtualinvoke $r33.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" was OK") >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r35 = virtualinvoke $r34.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : $r35 = virtualinvoke $r34.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke $r30.<org.apache.log4j.Category: void debug(java.lang.Object)>($r35)
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : virtualinvoke $r30.<org.apache.log4j.Category: void debug(java.lang.Object)>($r35) >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : goto [?= i3 = i3 + 1]
org.apache.xml.security.test.c14n.implementations.C14NInterop.t : goto [?= i3 = i3 + 1] >>>>>>>> org.apache.xml.security.test.c14n.implementations.C14NInterop.t : i3 = i3 + 1