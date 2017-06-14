Signatures[1] using additional[2][3] digest and signature algorithms

[1] http://www.w3.org/TR/2001/PR-xmldsig-core-20010820/
[2] http://www.ietf.org/internet-drafts/draft-eastlake-xmldsig-uri-02.txt
[3] http://www.w3.org/TR/2001/WD-xmlenc-core-20011018/

. signature-md5.xml
. signature-ripemd160.xml
. signature-sha256.xml
. signature-sha384.xml
. signature-sha512.xml
. signature-hmac-md5.xml
. signature-hmac-ripemd160.xml
. signature-hmac-sha256.xml
. signature-hmac-sha384.xml
. signature-hmac-sha512.xml
. signature-rsa-md5.xml
. signature-rsa-ripemd160.xml
. signature-rsa-sha256.xml
. signature-rsa-sha384.xml
. signature-rsa-sha512.xml

The key for the HMAC signatures is "secret".getBytes("ASCII")
which is, in hex, (73 65 63 72 65 74).

Nonstandardized ASN.1 OIDs are:

  SHA256- 2.16.840.1.101.3.4.2.1
  SHA384- 2.16.840.1.101.3.4.2.2
  SHA512- 2.16.840.1.101.3.4.2.3

At variance with a note in the document, RSA signatures based
on the SHA variants use PKCS#1 padding, not OAEP.

Merlin Hughes <merlin@baltimore.ie>
Baltimore Technologies, Ltd.

Thursday, January 31, 2002
