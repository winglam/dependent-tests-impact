org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r3 = new java.io.File >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r4 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r4 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r4.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r4.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r15 = virtualinvoke $r4.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r15 = virtualinvoke $r4.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r16 = virtualinvoke $r15.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r16 = virtualinvoke $r15.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r17 = virtualinvoke $r16.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r2)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r17 = virtualinvoke $r16.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r2) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r18 = virtualinvoke $r17.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r18 = virtualinvoke $r17.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r3.<java.io.File: void <init>(java.lang.String)>($r18)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r3.<java.io.File: void <init>(java.lang.String)>($r18) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r5 = $r3
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r5 = $r3 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r6 = staticinvoke <javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilderFactory newInstance()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r6 = staticinvoke <javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilderFactory newInstance()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: void setNamespaceAware(boolean)>(1)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: void setNamespaceAware(boolean)>(1) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r7 = virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilder newDocumentBuilder()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r7 = virtualinvoke r6.<javax.xml.parsers.DocumentBuilderFactory: javax.xml.parsers.DocumentBuilder newDocumentBuilder()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r8 = virtualinvoke r7.<javax.xml.parsers.DocumentBuilder: org.w3c.dom.Document parse(java.io.File)>(r5)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r8 = virtualinvoke r7.<javax.xml.parsers.DocumentBuilder: org.w3c.dom.Document parse(java.io.File)>(r5) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : l0 = staticinvoke <java.lang.System: long currentTimeMillis()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : l0 = staticinvoke <java.lang.System: long currentTimeMillis()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : staticinvoke <org.apache.xml.security.utils.XMLUtils: void circumventBug2650(org.w3c.dom.Document)>(r8)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : staticinvoke <org.apache.xml.security.utils.XMLUtils: void circumventBug2650(org.w3c.dom.Document)>(r8) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : l1 = staticinvoke <java.lang.System: long currentTimeMillis()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : l1 = staticinvoke <java.lang.System: long currentTimeMillis()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r19 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat>
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r19 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat> >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r20 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r20 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r20.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r20.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r21 = virtualinvoke $r20.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("fixSubtree took ")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r21 = virtualinvoke $r20.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("fixSubtree took ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $l5 = l1 - l0
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $l5 = l1 - l0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i6 = (int) $l5
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i6 = (int) $l5 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r22 = virtualinvoke $r21.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>($i6)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r22 = virtualinvoke $r21.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>($i6) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r23 = virtualinvoke $r22.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r23 = virtualinvoke $r22.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r19.<org.apache.log4j.Category: void debug(java.lang.Object)>($r23)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r19.<org.apache.log4j.Category: void debug(java.lang.Object)>($r23) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r24 = interfaceinvoke r8.<org.w3c.dom.Document: org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String,java.lang.String)>("http://www.w3.org/2000/09/xmldsig#", "Signature")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r24 = interfaceinvoke r8.<org.w3c.dom.Document: org.w3c.dom.NodeList getElementsByTagNameNS(java.lang.String,java.lang.String)>("http://www.w3.org/2000/09/xmldsig#", "Signature") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r25 = interfaceinvoke $r24.<org.w3c.dom.NodeList: org.w3c.dom.Node item(int)>(0)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r25 = interfaceinvoke $r24.<org.w3c.dom.NodeList: org.w3c.dom.Node item(int)>(0) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r9 = (org.w3c.dom.Element) $r25
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r9 = (org.w3c.dom.Element) $r25 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r26 = new org.apache.xml.security.signature.XMLSignature
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r26 = new org.apache.xml.security.signature.XMLSignature >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r27 = virtualinvoke r5.<java.io.File: java.net.URL toURL()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r27 = virtualinvoke r5.<java.io.File: java.net.URL toURL()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r28 = virtualinvoke $r27.<java.net.URL: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r28 = virtualinvoke $r27.<java.net.URL: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r26.<org.apache.xml.security.signature.XMLSignature: void <init>(org.w3c.dom.Element,java.lang.String)>(r9, $r28)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r26.<org.apache.xml.security.signature.XMLSignature: void <init>(org.w3c.dom.Element,java.lang.String)>(r9, $r28) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r10 = $r26
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r10 = $r26 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r29 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.keys.KeyInfo getKeyInfo()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r29 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.keys.KeyInfo getKeyInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r30 = virtualinvoke $r29.<org.apache.xml.security.keys.KeyInfo: java.security.PublicKey getPublicKey()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r30 = virtualinvoke $r29.<org.apache.xml.security.keys.KeyInfo: java.security.PublicKey getPublicKey()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : z0 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: boolean checkSignatureValue(java.security.Key)>($r30)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : z0 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: boolean checkSignatureValue(java.security.Key)>($r30) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r31 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat>
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r31 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat> >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r32 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r32 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r32.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r32.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r33 = virtualinvoke $r32.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("   signature.checkSignatureValue finished: ")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r33 = virtualinvoke $r32.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("   signature.checkSignatureValue finished: ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r34 = virtualinvoke $r33.<java.lang.StringBuilder: java.lang.StringBuilder append(boolean)>(z0)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r34 = virtualinvoke $r33.<java.lang.StringBuilder: java.lang.StringBuilder append(boolean)>(z0) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r35 = virtualinvoke $r34.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r35 = virtualinvoke $r34.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r31.<org.apache.log4j.Category: void debug(java.lang.Object)>($r35)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r31.<org.apache.log4j.Category: void debug(java.lang.Object)>($r35) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i2 = 0
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i2 = 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if z0 != 0
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if z0 != 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r36 = new java.lang.StringBuffer
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if z0 != 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : return null
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r36 = new java.lang.StringBuffer >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r36.<java.lang.StringBuffer: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r36.<java.lang.StringBuffer: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r11 = $r36
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r11 = $r36 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i3 = 0
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i3 = 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r37 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r37 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i7 = virtualinvoke $r37.<org.apache.xml.security.signature.SignedInfo: int getLength()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i7 = virtualinvoke $r37.<org.apache.xml.security.signature.SignedInfo: int getLength()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if i3 >= $i7
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if i3 >= $i7 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r38 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if i3 >= $i7 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r69 = virtualinvoke r11.<java.lang.StringBuffer: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r69 = virtualinvoke r11.<java.lang.StringBuffer: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r70 = virtualinvoke $r69.<java.lang.String: java.lang.String trim()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r70 = virtualinvoke $r69.<java.lang.String: java.lang.String trim()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i9 = virtualinvoke r70.<java.lang.String: int length()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i9 = virtualinvoke r70.<java.lang.String: int length()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if $i9 != 0
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if $i9 != 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : return null
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if $i9 != 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : return r70
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r38 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : z1 = virtualinvoke $r38.<org.apache.xml.security.signature.SignedInfo: boolean getVerificationResult(int)>(i3)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : z1 = virtualinvoke $r38.<org.apache.xml.security.signature.SignedInfo: boolean getVerificationResult(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if z1 == 0
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if z1 == 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r39 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat>
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : if z1 == 0 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i2 = i2 + 1
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i2 = i2 + 1 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r45 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r45 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r45.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r45.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r46 = virtualinvoke $r45.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r46 = virtualinvoke $r45.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r47 = virtualinvoke $r46.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" ")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r47 = virtualinvoke $r46.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r48 = virtualinvoke $r47.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r48 = virtualinvoke $r47.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke r11.<java.lang.StringBuffer: java.lang.StringBuffer append(java.lang.String)>($r48)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke r11.<java.lang.StringBuffer: java.lang.StringBuffer append(java.lang.String)>($r48) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r50 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r50 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r12 = virtualinvoke $r50.<org.apache.xml.security.signature.SignedInfo: org.apache.xml.security.signature.XMLSignatureInput getReferencedContentAfterTransformsItem(int)>(i3)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r12 = virtualinvoke $r50.<org.apache.xml.security.signature.SignedInfo: org.apache.xml.security.signature.XMLSignatureInput getReferencedContentAfterTransformsItem(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r51 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r51 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r51.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r51.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r52 = virtualinvoke $r51.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r52 = virtualinvoke $r51.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r1) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r53 = virtualinvoke $r52.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/c14n-")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r53 = virtualinvoke $r52.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("/c14n-") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r54 = virtualinvoke $r53.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r54 = virtualinvoke $r53.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r55 = virtualinvoke $r54.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(".apache.txt")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r55 = virtualinvoke $r54.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(".apache.txt") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r56 = virtualinvoke $r55.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r56 = virtualinvoke $r55.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r57 = virtualinvoke r12.<org.apache.xml.security.signature.XMLSignatureInput: byte[] getBytes()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r57 = virtualinvoke r12.<org.apache.xml.security.signature.XMLSignatureInput: byte[] getBytes()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : staticinvoke <org.apache.xml.security.utils.JavaUtils: void writeBytesToFilename(java.lang.String,byte[])>($r56, $r57)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : staticinvoke <org.apache.xml.security.utils.JavaUtils: void writeBytesToFilename(java.lang.String,byte[])>($r56, $r57) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r58 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r58 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r13 = virtualinvoke $r58.<org.apache.xml.security.signature.SignedInfo: org.apache.xml.security.signature.Reference item(int)>(i3)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r13 = virtualinvoke $r58.<org.apache.xml.security.signature.SignedInfo: org.apache.xml.security.signature.Reference item(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r59 = virtualinvoke r13.<org.apache.xml.security.signature.Reference: org.apache.xml.security.transforms.Transforms getTransforms()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r59 = virtualinvoke r13.<org.apache.xml.security.signature.Reference: org.apache.xml.security.transforms.Transforms getTransforms()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i4 = virtualinvoke $r59.<org.apache.xml.security.transforms.Transforms: int getLength()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i4 = virtualinvoke $r59.<org.apache.xml.security.transforms.Transforms: int getLength()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r60 = virtualinvoke r13.<org.apache.xml.security.signature.Reference: org.apache.xml.security.transforms.Transforms getTransforms()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r60 = virtualinvoke r13.<org.apache.xml.security.signature.Reference: org.apache.xml.security.transforms.Transforms getTransforms()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i8 = i4 - 1
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $i8 = i4 - 1 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r61 = virtualinvoke $r60.<org.apache.xml.security.transforms.Transforms: org.apache.xml.security.transforms.Transform item(int)>($i8)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r61 = virtualinvoke $r60.<org.apache.xml.security.transforms.Transforms: org.apache.xml.security.transforms.Transform item(int)>($i8) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r14 = virtualinvoke $r61.<org.apache.xml.security.transforms.Transform: java.lang.String getURI()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : r14 = virtualinvoke $r61.<org.apache.xml.security.transforms.Transform: java.lang.String getURI()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r62 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat>
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r62 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat> >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r63 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r63 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r63.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r63.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r64 = virtualinvoke $r63.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r64 = virtualinvoke $r63.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r65 = virtualinvoke $r64.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r65 = virtualinvoke $r64.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r66 = virtualinvoke $r65.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" failed: ")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r66 = virtualinvoke $r65.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" failed: ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r67 = virtualinvoke $r66.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r14)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r67 = virtualinvoke $r66.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(r14) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r68 = virtualinvoke $r67.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r68 = virtualinvoke $r67.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r62.<org.apache.log4j.Category: void debug(java.lang.Object)>($r68)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r62.<org.apache.log4j.Category: void debug(java.lang.Object)>($r68) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i3 = i3 + 1
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i3 = i3 + 1 >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : goto [?= $r37 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()]
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : goto [?= $r37 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()] >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r37 = virtualinvoke r10.<org.apache.xml.security.signature.XMLSignature: org.apache.xml.security.signature.SignedInfo getSignedInfo()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r39 = <org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop: org.apache.log4j.Category cat> >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r40 = new java.lang.StringBuilder
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r40 = new java.lang.StringBuilder >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r40.<java.lang.StringBuilder: void <init>()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : specialinvoke $r40.<java.lang.StringBuilder: void <init>()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r41 = virtualinvoke $r40.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r41 = virtualinvoke $r40.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>("Reference ") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r42 = virtualinvoke $r41.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r42 = virtualinvoke $r41.<java.lang.StringBuilder: java.lang.StringBuilder append(int)>(i3) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r43 = virtualinvoke $r42.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" was OK")
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r43 = virtualinvoke $r42.<java.lang.StringBuilder: java.lang.StringBuilder append(java.lang.String)>(" was OK") >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r44 = virtualinvoke $r43.<java.lang.StringBuilder: java.lang.String toString()>()
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : $r44 = virtualinvoke $r43.<java.lang.StringBuilder: java.lang.String toString()>() >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r39.<org.apache.log4j.Category: void debug(java.lang.Object)>($r44)
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : virtualinvoke $r39.<org.apache.log4j.Category: void debug(java.lang.Object)>($r44) >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : goto [?= i3 = i3 + 1]
org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : goto [?= i3 = i3 + 1] >>>>>>>> org.apache.xml.security.test.c14n.implementations.ExclusiveC14NInterop.t : i3 = i3 + 1
