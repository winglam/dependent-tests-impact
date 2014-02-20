package org.apache.xml.security.keys.provider;

import java.io.InputStream;
import java.security.Key;
import java.security.cert.Certificate;
import java.util.Date;
import java.util.Enumeration;

public class ApacheKeyStore {

    public int engineSize() {
        // TODO Auto-generated method stub
        return 0;
    }

    public Key engineGetKey(String string, char[] var4) {
        // TODO Auto-generated method stub
        return null;
    }

    public Certificate[] engineGetCertificateChain(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    public boolean engineIsKeyEntry(String string) {
        // TODO Auto-generated method stub
        return false;
    }

    public boolean engineContainsAlias(String string) {
        // TODO Auto-generated method stub
        return false;
    }

    public Certificate engineGetCertificate(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    public void engineDeleteEntry(String string) {
        // TODO Auto-generated method stub

    }

    public void engineSetKeyEntry(String string, byte[] var5,
            Certificate[] var10) {
        // TODO Auto-generated method stub

    }

    public Date engineGetCreationDate(String string) {
        // TODO Auto-generated method stub
        return null;
    }

    public void engineLoad(InputStream var7, char[] var11) {
        // TODO Auto-generated method stub

    }

    public boolean engineIsCertificateEntry(String string) {
        // TODO Auto-generated method stub
        return false;
    }

    public Enumeration engineAliases() {
        // TODO Auto-generated method stub
        return null;
    }

}
