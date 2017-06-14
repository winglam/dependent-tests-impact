import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest1 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test001");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket1.onWebSocketBinary(byte_array7, 10, (int) ' ');
        watcherWebsocket0.onWebSocketBinary(byte_array7, (int) (short) 0, 100);
        watcherWebsocket0.onWebSocketClose(100, ".//bin/interpreter.sh");
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test002");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note0.isPersonalizedMode();
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        note0.onOutputAppend(paragraph5, 12, "org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        boolean b10 = note0.isLastParagraph("http://registry.npmjs.org/");
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test003");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        java.lang.String str2 = folder1.getParentFolderId();
        folder1.notifyRenamed("0.8.0-SNAPSHOT");
        folder1.notifyRenamed("X-Watcher-Key");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf" + "'", str2.equals(".//conf"));
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test004");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        int i3 = zeppelinConfiguration0.getMaxIndex("configuration");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(i3 == (-1));
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test005");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook1 = null;
        heliumApplicationFactory0.setNotebook(notebook1);
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        heliumApplicationFactory0.unload(paragraph3, "X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
        heliumApplicationFactory0.onNoteCreate(note6);
        try {
            java.lang.String str8 = note6.getFolderId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test006");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        boolean b4 = note0.isNameEmpty();
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage7 = null;
        note0.onOutputUpdate(paragraph5, (int) (short) 0, interpreterResultMessage7);
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test007");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        instance0.token = ".//bin/interpreter.sh";
        org.junit.Assert.assertTrue(i1 == 0);
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test008");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
        float f8 = zeppelinConfiguration0.getFloat(confVars7);
        java.lang.String str9 = zeppelinConfiguration0.getTrustStoreType();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
        org.junit.Assert.assertTrue(f8 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "JKS" + "'", str9.equals("JKS"));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test009");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        boolean b4 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        java.io.Reader reader5 = null;
        try {
            zeppelinConfiguration0.load(reader5);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test010");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.run(paragraph1, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = null;
        heliumApplicationFactory0.onOutputUpdated("interpreter.json", "", 0, "JKS", type8, "0.8.0-SNAPSHOT");
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test011");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook4 = null;
        heliumApplicationFactory3.setNotebook(notebook4);
        heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
        org.apache.zeppelin.notebook.Notebook notebook7 = null;
        heliumApplicationFactory0.setNotebook(notebook7);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory9 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
        heliumApplicationFactory9.unload(paragraph10, "zeppelin.dep.localrepo");
        heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory9);
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test012");
        java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.ZEPPELIN_TOKEN_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token" + "'", str0.equals("X-Zeppelin-Token"));
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test013");
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.scheduler.Job job6 = null;
        note2.onProgressUpdate(job6, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note2.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "", map_str_obj9);
        org.apache.zeppelin.notebook.Note note13 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph14 = null;
        note13.addParagraph(paragraph14);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj16 = note13.getInfo();
        org.apache.zeppelin.scheduler.Job job17 = null;
        note13.onProgressUpdate(job17, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj20 = note13.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo21 = new org.apache.zeppelin.notebook.NoteInfo("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "", map_str_obj20);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj22 = noteInfo21.getConfig();
        noteInfo10.setConfig(map_str_obj22);
        org.junit.Assert.assertNotNull(map_str_obj5);
        org.junit.Assert.assertNotNull(map_str_obj9);
        org.junit.Assert.assertNotNull(map_str_obj16);
        org.junit.Assert.assertNotNull(map_str_obj20);
        org.junit.Assert.assertNotNull(map_str_obj22);
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test014");
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication0 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.getInstance();
        authentication0.run();
        authentication0.run();
        org.junit.Assert.assertNotNull(authentication0);
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test015");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b9 = zeppelinConfiguration0.getBoolean("src", true);
        zeppelinConfiguration0.setValidating(true);
        try {
            org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration14 = zeppelinConfiguration0.configurationAt("0.8.0-SNAPSHOT", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test016");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        boolean b9 = zeppelinConfiguration0.getBoolean("b71190c4-a07f-4d06-8d2c-2a742dab6398", ".//local-repo", true);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test017");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        org.apache.zeppelin.scheduler.Job job3 = null;
        note0.onProgressUpdate(job3, (int) (byte) 1);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
        try {
            note0.persist(authenticationInfo6);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test018");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo9 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
        org.apache.zeppelin.notebook.Note note13 = vFSNotebookRepo9.get("", ".//conf/.//conf/keystore", authenticationInfo12);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        org.apache.zeppelin.notebook.Note note17 = vFSNotebookRepo9.setNoteRevision("", "b3883bc7-9096-4750-9b75-98964ffef420", authenticationInfo16);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(note13);
        org.junit.Assert.assertNull(note17);
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test019");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message5 = zeppelinClient3.deserialize(" ");
        zeppelinClient3.ping();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNull(message5);
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test020");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        boolean b4 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars5 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_PORT;
        float f6 = zeppelinConfiguration0.getFloat(confVars5);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + confVars5 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_PORT + "'", confVars5.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_PORT));
        org.junit.Assert.assertTrue(f6 == (-1.0f));
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test021");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration3.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo5 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration3);
        boolean b6 = zeppelinConfiguration3.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration7.clear();
        zeppelinConfiguration3.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration7);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars10 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
        float f11 = zeppelinConfiguration3.getFloat(confVars10);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client12 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", "load.js", "", zeppelinConfiguration3);
        org.xml.sax.InputSource inputSource15 = zeppelinConfiguration3.resolveEntity("zeppelin", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
        java.lang.String str16 = zeppelinConfiguration3.getUser();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration17 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration17.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo19 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration17);
        java.util.Properties properties21 = null;
        java.util.Properties properties22 = zeppelinConfiguration17.getProperties("bundles", properties21);
        java.lang.String str23 = zeppelinConfiguration17.getInterpreterRemoteRunnerPath();
        java.lang.String str24 = zeppelinConfiguration17.getUser();
        boolean b25 = zeppelinConfiguration17.isAnonymousAllowed();
        zeppelinConfiguration17.setThrowExceptionOnMissing(false);
        org.apache.commons.configuration.tree.ExpressionEngine expressionEngine28 = zeppelinConfiguration17.getExpressionEngine();
        zeppelinConfiguration3.setExpressionEngine(expressionEngine28);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + confVars10 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars10.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
        org.junit.Assert.assertTrue(f11 == (-1.0f));
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNull(inputSource15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "user" + "'", str16.equals("user"));
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ".//bin/interpreter.sh" + "'", str23.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "user" + "'", str24.equals("user"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(expressionEngine28);
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test022");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.String str7 = zeppelinConfiguration0.getNotebookDir();
        boolean b8 = zeppelinConfiguration0.isNotebokPublic();
        javax.xml.parsers.DocumentBuilder documentBuilder9 = zeppelinConfiguration0.getDocumentBuilder();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo10 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision14 = mongoNotebookRepo10.checkpoint("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", authenticationInfo13);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//conf/interpreter-list" + "'", str6.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "notebook" + "'", str7.equals("notebook"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(documentBuilder9);
        org.junit.Assert.assertNotNull(revision14);
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test023");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.run(paragraph1, "local_modules");
        heliumApplicationFactory0.onOutputAppend("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "notebook", (int) 'a', "X-Zeppelin-Token", "src");
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note10.addParagraph(paragraph11);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj13 = note10.getInfo();
        org.apache.zeppelin.scheduler.Job job14 = null;
        note10.onProgressUpdate(job14, (int) (byte) -1);
        boolean b17 = note10.isPersonalizedMode();
        heliumApplicationFactory0.onNoteRemove(note10);
        org.junit.Assert.assertNotNull(map_str_obj13);
        org.junit.Assert.assertTrue(b17 == false);
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test024");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium("yarn-cache", ".//conf/interpreter.json", file11, heliumBundleFactory19, heliumApplicationFactory26);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration36 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration36.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo38 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration36);
        boolean b39 = zeppelinConfiguration36.isEmpty();
        boolean b40 = zeppelinConfiguration36.isAutoSave();
        java.io.File file41 = null;
        java.io.File file42 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory43 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration36, file41, file42);
        java.io.File file45 = heliumBundleFactory43.getHeliumPackageDirectory("~Trash");
        java.io.File file47 = heliumBundleFactory43.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter49 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file11, file47, ".//0.0.0.0");
        try {
            installInterpreter49.install("{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.RuntimeException");
        } catch (java.lang.RuntimeException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertNotNull(file47);
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test025");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        org.eclipse.jetty.websocket.api.Session session2 = null;
        zeppelinWebsocket1.connection = session2;
        zeppelinWebsocket1.noteId = "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}";
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test026");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b9 = zeppelinConfiguration0.getBoolean("src", true);
        java.lang.String str10 = zeppelinConfiguration0.getNotebookAuthorizationPath();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ".//conf/notebook-authorization.json" + "'", str10.equals(".//conf/notebook-authorization.json"));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test027");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note3.isPersonalizedMode();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
        note3.persist((-1), authenticationInfo6);
        org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage10 = null;
        note3.onOutputUpdate(paragraph8, (int) (byte) -1, interpreterResultMessage10);
        boolean b13 = note3.isLastParagraph("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4");
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b13 == true);
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test028");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        java.lang.String str12 = zeppelinConfiguration0.getMongoDatabase();
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo13 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo14 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo15 = gitNotebookRepo13.getSettings(authenticationInfo14);
        org.apache.zeppelin.notebook.Note note16 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str17 = note16.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note19 = note16.getUserNote("heliumBundles");
        boolean b20 = note19.isPersonalizedMode();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo22 = null;
        note19.persist((-1), authenticationInfo22);
        org.apache.zeppelin.notebook.Paragraph paragraph24 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage26 = null;
        note19.onOutputUpdate(paragraph24, (int) (byte) -1, interpreterResultMessage26);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo28 = null;
        try {
            gitNotebookRepo13.save(note19, authenticationInfo28);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo15);
        org.junit.Assert.assertNotNull(list_map_str_str17);
        org.junit.Assert.assertNotNull(note19);
        org.junit.Assert.assertTrue(b20 == false);
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test029");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        java.lang.Integer i9 = zeppelinConfiguration0.getInteger(".//bin/interpreter.sh", (java.lang.Integer) 67108864);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + i9 + "' != '" + 67108864 + "'", i9.equals(67108864));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test030");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        java.lang.String str2 = folder1.getParentFolderId();
        folder1.notifyRenamed("0.8.0-SNAPSHOT");
        folder1.notifyRenamed("1024000");
        boolean b7 = folder1.hasChild();
        org.apache.zeppelin.notebook.Folder folder9 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        folder9.rename("org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        java.util.List<org.apache.zeppelin.notebook.Note> list_note12 = folder9.getNotesRecursively();
        folder1.addNotes(list_note12);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf" + "'", str2.equals(".//conf"));
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_note12);
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test031");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        java.lang.Throwable throwable2 = null;
        zeppelinWebsocket1.onWebSocketError(throwable2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket4 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket5 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array11 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket5.onWebSocketBinary(byte_array11, 10, (int) ' ');
        watcherWebsocket4.onWebSocketBinary(byte_array11, (int) (short) 0, 100);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket18 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array24 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket18.onWebSocketBinary(byte_array24, 10, (int) ' ');
        byte[] byte_array32 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        watcherWebsocket18.onWebSocketBinary(byte_array32, (int) (short) -1, (int) (byte) 0);
        watcherWebsocket4.onWebSocketBinary(byte_array32, (int) (short) 100, (int) (short) -1);
        zeppelinWebsocket1.onWebSocketBinary(byte_array32, 1, (int) '4');
        java.lang.Throwable throwable42 = null;
        zeppelinWebsocket1.onWebSocketError(throwable42);
        org.junit.Assert.assertNotNull(byte_array11);
        org.junit.Assert.assertNotNull(byte_array24);
        org.junit.Assert.assertNotNull(byte_array32);
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test032");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        boolean b12 = zeppelinConfiguration0.isAutoSave();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration13.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo15 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration13);
        java.util.Properties properties17 = null;
        java.util.Properties properties18 = zeppelinConfiguration13.getProperties("bundles", properties17);
        java.lang.String str19 = zeppelinConfiguration13.getInterpreterRemoteRunnerPath();
        java.lang.String str20 = zeppelinConfiguration13.getUser();
        boolean b21 = zeppelinConfiguration0.removeErrorListener((org.apache.commons.configuration.event.ConfigurationErrorListener) zeppelinConfiguration13);
        boolean b25 = zeppelinConfiguration13.getBoolean(".//conf/interpreter.json", "{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}", false);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ".//bin/interpreter.sh" + "'", str19.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "user" + "'", str20.equals("user"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test033");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "anonymous");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = userTokenContainer3.getAllUserTokens();
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
        org.junit.Assert.assertNotNull(map_str_str4);
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test034");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage1.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = zeppelinhubMessage1.meta;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array10 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo11 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo11, interpreterInfo_array10);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp13 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array14 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency15 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency15, dependency_array14);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption17 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner19 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting20 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo11, (java.lang.Object) zeppelinHubOp13, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency15, interpreterOption17, "helium.bundle.js", interpreterRunner19);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type21 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array24 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo25 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo25, interpreterInfo_array24);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp27 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array28 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency29 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency29, dependency_array28);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption31 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner33 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting34 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo25, (java.lang.Object) zeppelinHubOp27, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency29, interpreterOption31, "helium.bundle.js", interpreterRunner33);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency35 = interpreterSetting34.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption36 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner38 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting39 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo11, (java.lang.Object) type21, list_dependency35, interpreterOption36, "local_modules", interpreterRunner38);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting40 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting39);
        java.util.Map<java.lang.String, java.lang.String> map_str_str41 = interpreterSetting39.getInfos();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration42 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str43 = zeppelinConfiguration42.getHeliumRegistry();
        java.lang.Boolean b44 = zeppelinConfiguration42.credentialsPersist();
        org.w3c.dom.Document document45 = zeppelinConfiguration42.getDocument();
        java.lang.String str46 = zeppelinConfiguration42.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo47 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration42);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo48 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo49 = mongoNotebookRepo47.getSettings(authenticationInfo48);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration50 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration50.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo52 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration50);
        java.util.Map<java.lang.String, java.lang.String> map_str_str53 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo54 = null;
        s3NotebookRepo52.updateSettings(map_str_str53, authenticationInfo54);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo57 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision58 = s3NotebookRepo52.revisionHistory("zeppelin.dep.localrepo", authenticationInfo57);
        org.apache.zeppelin.notebook.Note note59 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str60 = note59.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note62 = note59.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str64 = note59.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo65 = null;
        s3NotebookRepo52.updateSettings(map_str_str64, authenticationInfo65);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo67 = null;
        mongoNotebookRepo47.updateSettings(map_str_str64, authenticationInfo67);
        interpreterSetting39.setInfos(map_str_str64);
        zeppelinhubMessage1.meta = map_str_str64;
        java.lang.String str71 = zeppelinhubMessage1.serialize();
        java.lang.Object obj72 = zeppelinhubMessage1.op;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNotNull(map_str_str4);
        org.junit.Assert.assertNotNull(interpreterInfo_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp13 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp13.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type21.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp27 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp27.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(list_dependency35);
        org.junit.Assert.assertNull(map_str_str41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str43.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b44 + "' != '" + true + "'", b44.equals(true));
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "s3.amazonaws.com" + "'", str46.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo49);
        org.junit.Assert.assertNotNull(list_revision58);
        org.junit.Assert.assertNotNull(list_map_str_str60);
        org.junit.Assert.assertNotNull(note62);
        org.junit.Assert.assertNotNull(map_str_str64);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}" + "'", str71.equals("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + obj72 + "' != '" + "helium.bundle.js" + "'", obj72.equals("helium.bundle.js"));
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test035");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        zeppelinConfiguration0.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy13 = zeppelinConfiguration0.getReloadingStrategy();
        java.lang.String str14 = zeppelinConfiguration0.getHeliumConfPath();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".//conf/helium.json" + "'", str14.equals(".//conf/helium.json"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test036");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        java.util.Collection<org.apache.commons.configuration.event.ConfigurationListener> collection_configurationListener4 = zeppelinConfiguration0.getConfigurationListeners();
        try {
            short s6 = zeppelinConfiguration0.getShort("X-Zeppelin-Token");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection_configurationListener4);
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test037");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        boolean b12 = zeppelinConfiguration0.isAutoSave();
        boolean b16 = zeppelinConfiguration0.getBoolean(".//conf/interpreter-list", "s3.amazonaws.com", true);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b16 == true);
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test038");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo8 = null;
        org.apache.zeppelin.notebook.Note note9 = s3NotebookRepo2.setNoteRevision("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", "~Trash", authenticationInfo8);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo11 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision12 = s3NotebookRepo2.revisionHistory("load.js", authenticationInfo11);
        org.junit.Assert.assertNull(note9);
        org.junit.Assert.assertNotNull(list_revision12);
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test039");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setDelimiterParsingDisabled(true);
        java.lang.Object obj4 = zeppelinConfiguration0.clone();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNotNull(obj4);
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test040");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        try {
            s3NotebookRepo2.remove("1024000", authenticationInfo4);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test041");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo3 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph4 = note0.addNewParagraph(authenticationInfo3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test042");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph9 = note0.clearPersonalizedParagraphOutput("{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", ".//conf/interpreter-list");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test043");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.Note note1 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str2 = note1.generateParagraphsInfo();
        notebookRepoSettingsInfo0.value = list_map_str_str2;
        notebookRepoSettingsInfo0.name = "notebook";
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str6 = notebookRepoSettingsInfo0.value;
        org.junit.Assert.assertNotNull(list_map_str_str2);
        org.junit.Assert.assertNotNull(list_map_str_str6);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test044");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket1.onWebSocketBinary(byte_array7, 10, (int) ' ');
        watcherWebsocket0.onWebSocketBinary(byte_array7, (int) (short) 0, 100);
        org.eclipse.jetty.websocket.api.Session session14 = null;
        watcherWebsocket0.connection = session14;
        try {
            watcherWebsocket0.onWebSocketText("1024000");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test045");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.util.List<java.lang.String> list_str36 = helium35.setVisualizationPackageOrder();
        java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult38 = helium35.getSinglePackageInfo("helium.bundle.js");
        try {
            java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj40 = helium35.getSpellConfig("hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(list_str36);
        org.junit.Assert.assertNotNull(list_heliumPackageSearchResult38);
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test046");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage1.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = zeppelinhubMessage1.meta;
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder6 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("heliumBundles");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder8 = builder6.message(" ");
        zeppelinhubMessage1.data = builder8;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type10 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        zeppelinhubMessage1.op = type10;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str13 = zeppelinConfiguration12.getHeliumRegistry();
        zeppelinConfiguration12.setRootElementName(" ");
        java.lang.String str16 = zeppelinConfiguration12.getSystemID();
        java.lang.String str17 = zeppelinConfiguration12.getBucketName();
        int i18 = zeppelinConfiguration12.getServerSslPort();
        zeppelinhubMessage1.op = i18;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNotNull(map_str_str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type10.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str13.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(str16);
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "zeppelin" + "'", str17.equals("zeppelin"));
        org.junit.Assert.assertTrue(i18 == 8443);
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test047");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        zeppelinhubClient2.initUser("JKS");
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test048");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b9 = zeppelinConfiguration0.getBoolean("src", true);
        zeppelinConfiguration0.setValidating(true);
        java.lang.Object obj12 = zeppelinConfiguration0.getReloadLock();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertNotNull(obj12);
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test049");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars11 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
        java.lang.String str12 = zeppelinConfiguration0.getRelativeDir(confVars11);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars13 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR;
        java.lang.String str14 = zeppelinConfiguration0.getRelativeDir(confVars13);
        java.lang.String str15 = zeppelinConfiguration0.getS3EncryptionMaterialsProviderClass();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars16 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE;
        java.lang.Class class17 = confVars16.getVarClass();
        float f18 = zeppelinConfiguration0.getFloat(confVars16);
        java.lang.Long long21 = zeppelinConfiguration0.getLong("configuration", (java.lang.Long) 1L);
        org.apache.commons.configuration.interpol.ConfigurationInterpolator configurationInterpolator22 = zeppelinConfiguration0.getInterpolator();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".//0.0.0.0" + "'", str14.equals(".//0.0.0.0"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + confVars16 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE + "'", confVars16.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE));
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertTrue(f18 == (-1.0f));
        org.junit.Assert.assertTrue("'" + long21 + "' != '" + 1L + "'", long21.equals(1L));
        org.junit.Assert.assertNotNull(configurationInterpolator22);
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test050");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        boolean b12 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array14 = zeppelinConfiguration0.getStringArray(".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(str_array14);
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test051");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_SHARE;
        long long1 = confVars0.getLongValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_SHARE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_SHARE));
        org.junit.Assert.assertTrue(long1 == (-1L));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test052");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("zeppelin");
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test053");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        java.lang.Long long13 = zeppelinConfiguration0.getLong("configuration", (java.lang.Long) 0L);
        org.apache.commons.logging.Log log14 = zeppelinConfiguration0.getLogger();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 0L + "'", long13.equals(0L));
        org.junit.Assert.assertNotNull(log14);
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test054");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.run(paragraph1, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = null;
        heliumApplicationFactory0.onOutputUpdated("zeppelin", "hi!", 0, "", type8, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        org.apache.zeppelin.scheduler.Job.Status status12 = null;
        heliumApplicationFactory0.onParagraphStatusChange(paragraph11, status12);
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test055");
        org.apache.zeppelin.notebook.ParagraphRuntimeInfo paragraphRuntimeInfo5 = new org.apache.zeppelin.notebook.ParagraphRuntimeInfo(".//conf/.//conf/keystore", ".//bin/interpreter.sh", "local_modules", "2CHF9171K", "");
        java.lang.String str6 = paragraphRuntimeInfo5.getInterpreterSettingId();
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test056");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo9 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
        java.lang.String str10 = zeppelinConfiguration0.getInterpreterLocalRepoPath();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ".//local-repo" + "'", str10.equals(".//local-repo"));
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test057");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("user");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo2 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str4 = note3.generateParagraphsInfo();
        notebookRepoSettingsInfo2.value = list_map_str_str4;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo6 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str7 = notebookRepoSettingsInfo6.value;
        java.lang.String str8 = notebookRepoSettingsInfo6.selected;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo9 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo10 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str11 = notebookRepoSettingsInfo10.value;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo12 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.lang.String str13 = notebookRepoSettingsInfo12.selected;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] notebookRepoSettingsInfo_array14 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] { notebookRepoSettingsInfo2, notebookRepoSettingsInfo6, notebookRepoSettingsInfo9, notebookRepoSettingsInfo10, notebookRepoSettingsInfo12 };
        java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> arraylist_notebookRepoSettingsInfo15 = new java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>) arraylist_notebookRepoSettingsInfo15, notebookRepoSettingsInfo_array14);
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder17 = builder1.settings((java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>) arraylist_notebookRepoSettingsInfo15);
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings18 = builder17.build();
        java.lang.String str19 = notebookRepoWithSettings18.className;
        org.junit.Assert.assertNotNull(list_map_str_str4);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo6);
        org.junit.Assert.assertNull(list_map_str_str7);
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo10);
        org.junit.Assert.assertNull(list_map_str_str11);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo12);
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo_array14);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(builder17);
        org.junit.Assert.assertNotNull(notebookRepoWithSettings18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + "" + "'", str19.equals(""));
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test058");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration3.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo5 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration3);
        boolean b6 = zeppelinConfiguration3.isEmpty();
        boolean b7 = zeppelinConfiguration3.isAutoSave();
        java.math.BigDecimal bigDecimal9 = zeppelinConfiguration3.getBigDecimal("");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client10 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("b3883bc7-9096-4750-9b75-98964ffef420", "interpreter-setting.json", ".//interpreter", zeppelinConfiguration3);
        client10.start();
        client10.stop();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(bigDecimal9);
        org.junit.Assert.assertNotNull(client10);
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test059");
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.scheduler.Job job6 = null;
        note2.onProgressUpdate(job6, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note2.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "", map_str_obj9);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj11 = noteInfo10.getConfig();
        java.lang.String str12 = noteInfo10.getName();
        org.junit.Assert.assertNotNull(map_str_obj5);
        org.junit.Assert.assertNotNull(map_str_obj9);
        org.junit.Assert.assertNotNull(map_str_obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "" + "'", str12.equals(""));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test060");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        boolean b4 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        java.lang.String str5 = zeppelinConfiguration0.getMongoCollection();
        org.xml.sax.InputSource inputSource8 = zeppelinConfiguration0.resolveEntity("{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", "{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "notes" + "'", str5.equals("notes"));
        org.junit.Assert.assertNull(inputSource8);
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test061");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket(".//local-repo");
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test062");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.io.File file9 = heliumBundleFactory7.getHeliumPackageDirectory("~Trash");
        com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory frontendPluginFactory10 = null;
        try {
            heliumBundleFactory7.installNodeModules(frontendPluginFactory10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(file9);
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test063");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        char char2 = zeppelinConfiguration0.getListDelimiter();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}", (java.lang.Boolean) false);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(char2 == '#');
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test064");
        org.apache.commons.configuration.AbstractConfiguration.setDefaultListDelimiter(' ');
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test065");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo5 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo7 = mongoNotebookRepo5.getSettings(authenticationInfo6);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.util.Map<java.lang.String, java.lang.String> map_str_str11 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
        s3NotebookRepo10.updateSettings(map_str_str11, authenticationInfo12);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision16 = s3NotebookRepo10.revisionHistory("zeppelin.dep.localrepo", authenticationInfo15);
        org.apache.zeppelin.notebook.Note note17 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str18 = note17.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note20 = note17.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str22 = note17.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo23 = null;
        s3NotebookRepo10.updateSettings(map_str_str22, authenticationInfo23);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo25 = null;
        mongoNotebookRepo5.updateSettings(map_str_str22, authenticationInfo25);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo28 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision29 = mongoNotebookRepo5.revisionHistory("s3.amazonaws.com", authenticationInfo28);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo30 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo31 = mongoNotebookRepo5.getSettings(authenticationInfo30);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s3.amazonaws.com" + "'", str4.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo7);
        org.junit.Assert.assertNotNull(list_revision16);
        org.junit.Assert.assertNotNull(list_map_str_str18);
        org.junit.Assert.assertNotNull(note20);
        org.junit.Assert.assertNotNull(map_str_str22);
        org.junit.Assert.assertNotNull(list_revision29);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo31);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test066");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE;
        java.lang.String str8 = zeppelinConfiguration0.getString(confVars7);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration9 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration9.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo11 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration9);
        java.util.Properties properties13 = null;
        java.util.Properties properties14 = zeppelinConfiguration9.getProperties("bundles", properties13);
        java.lang.String str15 = zeppelinConfiguration9.getConfDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration16 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str17 = zeppelinConfiguration16.getHeliumRegistry();
        java.lang.Boolean b18 = zeppelinConfiguration16.credentialsPersist();
        java.lang.String str19 = zeppelinConfiguration16.getPublicID();
        java.lang.String str20 = zeppelinConfiguration16.getConfDir();
        zeppelinConfiguration9.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration16);
        org.apache.commons.configuration.FileSystem fileSystem22 = zeppelinConfiguration16.getFileSystem();
        zeppelinConfiguration0.setFileSystem(fileSystem22);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "JKS" + "'", str8.equals("JKS"));
        org.junit.Assert.assertNotNull(properties14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "conf" + "'", str15.equals("conf"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str17.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b18 + "' != '" + true + "'", b18.equals(true));
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "conf" + "'", str20.equals("conf"));
        org.junit.Assert.assertNotNull(fileSystem22);
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test067");
        org.apache.zeppelin.interpreter.install.InstallInterpreter.usage();
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test068");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        zeppelinConfiguration0.setSystemID("zeppelin");
        org.xml.sax.EntityResolver entityResolver6 = zeppelinConfiguration0.getEntityResolver();
        java.net.URL uRL7 = zeppelinConfiguration0.getURL();
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(entityResolver6);
        org.junit.Assert.assertNull(uRL7);
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test069");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note3.isPersonalizedMode();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
        note3.persist((-1), authenticationInfo6);
        org.apache.zeppelin.scheduler.Job job8 = null;
        note3.onProgressUpdate(job8, 0);
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test070");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = null;
        interpreterSetting0.setOption(interpreterOption1);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency3 = interpreterSetting0.getDependencies();
        java.lang.String str4 = interpreterSetting0.getGroup();
        interpreterSetting0.setPath(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.junit.Assert.assertNotNull(list_dependency3);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test071");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        zeppelinClient3.removeNoteConnection("load.js");
        org.apache.zeppelin.notebook.socket.Message message6 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message message7 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj8 = message7.data;
        message6.data = map_str_obj8;
        java.lang.String str10 = message6.principal;
        message6.ticket = ".//conf/interpreter-list";
        try {
            zeppelinClient3.send(message6, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(message6);
        org.junit.Assert.assertNotNull(message7);
        org.junit.Assert.assertNotNull(map_str_obj8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "s3.amazonaws.com" + "'", str10.equals("s3.amazonaws.com"));
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test072");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        java.lang.String str4 = authentication3.getRoles();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test073");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo5 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo7 = mongoNotebookRepo5.getSettings(authenticationInfo6);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.util.Map<java.lang.String, java.lang.String> map_str_str11 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
        s3NotebookRepo10.updateSettings(map_str_str11, authenticationInfo12);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision16 = s3NotebookRepo10.revisionHistory("zeppelin.dep.localrepo", authenticationInfo15);
        org.apache.zeppelin.notebook.Note note17 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str18 = note17.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note20 = note17.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str22 = note17.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo23 = null;
        s3NotebookRepo10.updateSettings(map_str_str22, authenticationInfo23);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo25 = null;
        mongoNotebookRepo5.updateSettings(map_str_str22, authenticationInfo25);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo29 = null;
        org.apache.zeppelin.notebook.Note note30 = mongoNotebookRepo5.setNoteRevision(" ", ".//conf/helium.json", authenticationInfo29);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo32 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision33 = mongoNotebookRepo5.revisionHistory("local_modules", authenticationInfo32);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo34 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo35 = mongoNotebookRepo5.getSettings(authenticationInfo34);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s3.amazonaws.com" + "'", str4.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo7);
        org.junit.Assert.assertNotNull(list_revision16);
        org.junit.Assert.assertNotNull(list_map_str_str18);
        org.junit.Assert.assertNotNull(note20);
        org.junit.Assert.assertNotNull(map_str_str22);
        org.junit.Assert.assertNull(note30);
        org.junit.Assert.assertNotNull(list_revision33);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo35);
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test074");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        int i2 = folder1.countNotes();
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.scheduler.Job job7 = null;
        note3.onProgressUpdate(job7, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = null;
        note3.setConfig(map_str_obj10);
        org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage14 = null;
        note3.onOutputUpdate(paragraph12, (int) '#', interpreterResultMessage14);
        folder1.removeNote(note3);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map_str_obj6);
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test075");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note3.isPersonalizedMode();
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        note3.addParagraph(paragraph5);
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test076");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        java.lang.String str9 = zeppelinConfiguration0.getTrustStorePath();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration11 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str12 = zeppelinConfiguration11.getHeliumRegistry();
        zeppelinConfiguration11.setRootElementName(" ");
        zeppelinConfiguration11.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b20 = zeppelinConfiguration11.getBoolean("src", true);
        zeppelinConfiguration0.addProperty("b71190c4-a07f-4d06-8d2c-2a742dab6398", (java.lang.Object) b20);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".//conf/.//conf/keystore" + "'", str9.equals(".//conf/.//conf/keystore"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str12.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b20 == true);
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test077");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj6);
        interpreterInfo7.setName("~Trash");
        java.lang.String str10 = interpreterInfo7.getClassName();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj11 = interpreterInfo7.getEditor();
        interpreterInfo7.setName("http://repo1.maven.org/maven2/");
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
        org.junit.Assert.assertNotNull(map_str_obj11);
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test078");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        float f11 = zeppelinConfiguration0.getFloat("load.js", (float) (byte) 0);
        org.w3c.dom.Document document12 = zeppelinConfiguration0.getDocument();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertTrue(f11 == 0.0f);
        org.junit.Assert.assertNull(document12);
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test079");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        java.lang.String str12 = zeppelinConfiguration0.getMongoDatabase();
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo13 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo14 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo15 = gitNotebookRepo13.getSettings(authenticationInfo14);
        org.apache.zeppelin.notebook.Note note16 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
        note16.addParagraph(paragraph17);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj19 = note16.getInfo();
        org.apache.zeppelin.scheduler.Job job20 = null;
        note16.onProgressUpdate(job20, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj23 = null;
        note16.setConfig(map_str_obj23);
        boolean b25 = note16.isPersonalizedMode();
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph26 = note16.getParagraphs();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo27 = null;
        try {
            gitNotebookRepo13.save(note16, authenticationInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo15);
        org.junit.Assert.assertNotNull(map_str_obj19);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_paragraph26);
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test080");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory6 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager7 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory8 = null;
        org.apache.zeppelin.search.SearchService searchService9 = null;
        org.apache.zeppelin.user.Credentials credentials10 = null;
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory11 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
        heliumApplicationFactory11.run(paragraph12, "local_modules");
        org.apache.zeppelin.notebook.Note note15 = new org.apache.zeppelin.notebook.Note((org.apache.zeppelin.notebook.repo.NotebookRepo) s3NotebookRepo2, interpreterFactory6, interpreterSettingManager7, jobListenerFactory8, searchService9, credentials10, (org.apache.zeppelin.notebook.NoteEventListener) heliumApplicationFactory11);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo18 = null;
        org.apache.zeppelin.notebook.Note note19 = s3NotebookRepo2.get("s3.amazonaws.com", ".//0.0.0.0", authenticationInfo18);
        org.junit.Assert.assertNull(note19);
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test081");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration3.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo5 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration3);
        boolean b6 = zeppelinConfiguration3.isEmpty();
        boolean b7 = zeppelinConfiguration3.isAutoSave();
        java.math.BigDecimal bigDecimal9 = zeppelinConfiguration3.getBigDecimal("");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client10 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("b3883bc7-9096-4750-9b75-98964ffef420", "interpreter-setting.json", ".//interpreter", zeppelinConfiguration3);
        client10.start();
        org.apache.zeppelin.notebook.socket.Message message12 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message12.principal = "s3.amazonaws.com";
        java.lang.String str15 = message12.ticket;
        try {
            client10.relayToZeppelin(message12, ".//conf/interpreter-list");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(bigDecimal9);
        org.junit.Assert.assertNotNull(client10);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ".//conf/interpreter-list" + "'", str15.equals(".//conf/interpreter-list"));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test082");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance(".//conf/interpreter-list");
        zeppelinhubWebsocket1.onWebSocketText("org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket5 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        java.lang.Throwable throwable6 = null;
        zeppelinWebsocket5.onWebSocketError(throwable6);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket8 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket9 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array15 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket9.onWebSocketBinary(byte_array15, 10, (int) ' ');
        watcherWebsocket8.onWebSocketBinary(byte_array15, (int) (short) 0, 100);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket22 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array28 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket22.onWebSocketBinary(byte_array28, 10, (int) ' ');
        byte[] byte_array36 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        watcherWebsocket22.onWebSocketBinary(byte_array36, (int) (short) -1, (int) (byte) 0);
        watcherWebsocket8.onWebSocketBinary(byte_array36, (int) (short) 100, (int) (short) -1);
        zeppelinWebsocket5.onWebSocketBinary(byte_array36, 1, (int) '4');
        zeppelinhubWebsocket1.onWebSocketBinary(byte_array36, (int) (byte) -1, 0);
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
        org.junit.Assert.assertNotNull(byte_array15);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertNotNull(byte_array36);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test083");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        java.lang.String str7 = zeppelinConfiguration0.getRootElementName();
        try {
            byte byte9 = zeppelinConfiguration0.getByte(".//conf/interpreter-list");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "configuration" + "'", str7.equals("configuration"));
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test084");
        org.eclipse.jetty.websocket.api.Session session0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}");
        zeppelinhubSession2.sendByFuture("~Trash");
        org.junit.Assert.assertNotNull(zeppelinhubSession2);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test085");
        org.apache.zeppelin.helium.WebpackResult webpackResult0 = new org.apache.zeppelin.helium.WebpackResult();
        java.lang.String[] str_array1 = webpackResult0.warnings;
        java.lang.String[] str_array2 = webpackResult0.warnings;
        org.junit.Assert.assertNotNull(str_array1);
        org.junit.Assert.assertNotNull(str_array2);
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test086");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CANCEL_PARAGRAPH));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test087");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.lang.String[] str_array9 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str10, str_array9);
        notebookAuthorization0.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str10);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization14 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b15 = notebookAuthorization14.isPublic();
        java.util.Set<java.lang.String> set_str17 = notebookAuthorization14.getRoles("zeppelin.dep.localrepo");
        notebookAuthorization0.setReaders("", set_str17);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo20 = null;
        notebookAuthorization0.setNewNotePermissions("configuration", authenticationInfo20);
        java.util.Set<java.lang.String> set_str23 = notebookAuthorization0.getWriters("yarn-cache");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set_str17);
        org.junit.Assert.assertNotNull(set_str23);
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test088");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        java.io.OutputStream outputStream11 = null;
        try {
            zeppelinConfiguration0.save(outputStream11, ".//0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test089");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.socket.Message.OP.PING;
        message0.op = oP1;
        java.lang.String str3 = message0.ticket;
        message0.roles = "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}";
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + oP1 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PING + "'", oP1.equals(org.apache.zeppelin.notebook.socket.Message.OP.PING));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".//conf/interpreter-list" + "'", str3.equals(".//conf/interpreter-list"));
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test090");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test091");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        zeppelinClient3.stop();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat5);
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test092");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry10 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.js", "hi!");
        java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage11 = heliumLocalRegistry10.getAll();
        heliumBundleFactory7.buildAllPackages(list_heliumPackage11);
        com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory frontendPluginFactory13 = null;
        try {
            heliumBundleFactory7.installNodeModules(frontendPluginFactory13);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_heliumPackage11);
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test093");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.util.List<java.lang.String> list_str8 = zeppelinConfiguration0.getAllowedOrigins();
        boolean b10 = zeppelinConfiguration0.isWindowsPath("local_modules");
        try {
            long long12 = zeppelinConfiguration0.getLong("9b49838f-dc67-47f7-8ec6-fd89b914fc08");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_str8);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test094");
        java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo> list_interpreterInfo3 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings4 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
        java.lang.String str5 = notebookRepoWithSettings4.className;
        notebookRepoWithSettings4.className = "";
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array13 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo14 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo14, interpreterInfo_array13);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp16 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array17 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency18 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency18, dependency_array17);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption20 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner22 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting23 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo14, (java.lang.Object) zeppelinHubOp16, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency18, interpreterOption20, "helium.bundle.js", interpreterRunner22);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type24 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array27 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo28 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b29 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo28, interpreterInfo_array27);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp30 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array31 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency32 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency32, dependency_array31);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption34 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner36 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting37 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo28, (java.lang.Object) zeppelinHubOp30, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency32, interpreterOption34, "helium.bundle.js", interpreterRunner36);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency38 = interpreterSetting37.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption39 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner41 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting42 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo14, (java.lang.Object) type24, list_dependency38, interpreterOption39, "local_modules", interpreterRunner41);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency43 = interpreterSetting42.getDependencies();
        java.lang.String str44 = interpreterSetting42.getId();
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency45 = interpreterSetting42.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption46 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner48 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting49 = new org.apache.zeppelin.interpreter.InterpreterSetting("0.8.0-SNAPSHOT", "", "configuration", list_interpreterInfo3, (java.lang.Object) notebookRepoWithSettings4, list_dependency45, interpreterOption46, "zeppelin.dep.localrepo", interpreterRunner48);
        java.lang.String str50 = notebookRepoWithSettings4.name;
        org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
        org.junit.Assert.assertNotNull(interpreterInfo_array13);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp16 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp16.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array17);
        org.junit.Assert.assertTrue(b19 == false);
        org.junit.Assert.assertTrue("'" + type24 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type24.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array27);
        org.junit.Assert.assertTrue(b29 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp30 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp30.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array31);
        org.junit.Assert.assertTrue(b33 == false);
        org.junit.Assert.assertNotNull(list_dependency38);
        org.junit.Assert.assertNotNull(list_dependency43);
        org.junit.Assert.assertTrue("'" + str44 + "' != '" + "yarn-cache" + "'", str44.equals("yarn-cache"));
        org.junit.Assert.assertNotNull(list_dependency45);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}" + "'", str50.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}"));
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test095");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str1 = npmPackage0.name;
        npmPackage0.version = "local_modules";
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array6 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo7 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo7, interpreterInfo_array6);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp9 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array10 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency11 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency11, dependency_array10);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption13 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner15 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting16 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo7, (java.lang.Object) zeppelinHubOp9, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency11, interpreterOption13, "helium.bundle.js", interpreterRunner15);
        org.apache.zeppelin.notebook.Note note17 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str18 = note17.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note20 = note17.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str22 = note17.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting16.setInfos(map_str_str22);
        npmPackage0.dependencies = map_str_str22;
        npmPackage0.name = ".//bin/interpreter.sh";
        npmPackage0.name = "{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}";
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNotNull(interpreterInfo_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp9 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp9.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(list_map_str_str18);
        org.junit.Assert.assertNotNull(note20);
        org.junit.Assert.assertNotNull(map_str_str22);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test096");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.lang.String str1 = message0.roles;
        java.lang.String str2 = message0.ticket;
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.scheduler.Job job7 = null;
        note3.onProgressUpdate(job7, (int) (byte) -1);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note3);
        noteInfo10.setId("configuration");
        org.apache.zeppelin.notebook.Note note13 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph14 = null;
        note13.addParagraph(paragraph14);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj16 = note13.getInfo();
        org.apache.zeppelin.scheduler.Job job17 = null;
        note13.onProgressUpdate(job17, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj20 = null;
        note13.setConfig(map_str_obj20);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj22 = note13.getInfo();
        noteInfo10.setConfig(map_str_obj22);
        message0.data = map_str_obj22;
        org.apache.zeppelin.notebook.socket.Message.OP oP25 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE;
        message0.op = oP25;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + ".//conf/interpreter-list" + "'", str2.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertNotNull(map_str_obj16);
        org.junit.Assert.assertNotNull(map_str_obj22);
        org.junit.Assert.assertTrue("'" + oP25 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE + "'", oP25.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATE));
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test097");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.commons.configuration.HierarchicalConfiguration.Node node7 = zeppelinConfiguration4.getRoot();
        java.lang.String str9 = zeppelinConfiguration4.getString("helium.bundle.js");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(node7);
        org.junit.Assert.assertNull(str9);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test098");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.net.URL uRL9 = null;
        zeppelinConfiguration0.setURL(uRL9);
        java.lang.String str11 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.String str12 = zeppelinConfiguration0.getInterpreterDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration13.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo15 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration13);
        boolean b16 = zeppelinConfiguration13.isEmpty();
        boolean b17 = zeppelinConfiguration13.isAutoSave();
        java.io.File file18 = null;
        java.io.File file19 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory20 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration13, file18, file19);
        java.lang.Boolean b21 = zeppelinConfiguration13.credentialsPersist();
        zeppelinConfiguration0.append((org.apache.commons.configuration.Configuration) zeppelinConfiguration13);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars23 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
        java.lang.String str24 = confVars23.getStringValue();
        long long25 = zeppelinConfiguration0.getLong(confVars23);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//conf/interpreter-list" + "'", str11.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//interpreter" + "'", str12.equals(".//interpreter"));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + b21 + "' != '" + true + "'", b21.equals(true));
        org.junit.Assert.assertTrue("'" + confVars23 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars23.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str24.equals("org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue(long25 == (-1L));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test099");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        npmPackage0.name = "X-Zeppelin-Token";
        npmPackage0.name = "s3.amazonaws.com";
        npmPackage0.version = "interpreter-setting.json";
        npmPackage0.name = "X-Watcher-Key";
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test100");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        java.lang.String str12 = zeppelinConfiguration0.getMongoDatabase();
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo13 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision17 = gitNotebookRepo13.checkpoint(".//conf/helium.json", "", authenticationInfo16);
        org.apache.zeppelin.notebook.Note note18 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str19 = note18.generateParagraphsInfo();
        note18.runAll();
        org.apache.zeppelin.notebook.Paragraph paragraph21 = null;
        note18.onOutputAppend(paragraph21, (int) (byte) 10, "helium.bundle.js");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo25 = null;
        try {
            gitNotebookRepo13.save(note18, authenticationInfo25);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
        org.junit.Assert.assertNotNull(revision17);
        org.junit.Assert.assertNotNull(list_map_str_str19);
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test101");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.net.URL uRL9 = null;
        zeppelinConfiguration0.setURL(uRL9);
        java.lang.String str11 = zeppelinConfiguration0.getInterpreterListPath();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration14 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration14.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo16 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration14);
        boolean b17 = zeppelinConfiguration14.isEmpty();
        boolean b18 = zeppelinConfiguration14.isAutoSave();
        java.io.File file19 = null;
        java.io.File file20 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory21 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration14, file19, file20);
        java.io.File file23 = heliumBundleFactory21.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration24 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration24.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo26 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration24);
        boolean b27 = zeppelinConfiguration24.isEmpty();
        boolean b28 = zeppelinConfiguration24.isAutoSave();
        java.io.File file29 = null;
        java.io.File file30 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory31 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration24, file29, file30);
        java.io.File file33 = heliumBundleFactory31.getHeliumPackageDirectory("~Trash");
        java.io.File file35 = heliumBundleFactory31.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory36 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph37 = null;
        heliumApplicationFactory36.run(paragraph37, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type44 = null;
        heliumApplicationFactory36.onOutputUpdated("zeppelin", "hi!", 0, "", type44, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage50 = null;
        heliumApplicationFactory36.onLoad(" ", ".//conf/.//conf/keystore", "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", heliumPackage50);
        org.apache.zeppelin.helium.Helium helium52 = new org.apache.zeppelin.helium.Helium("yarn-cache", "bundles", file23, heliumBundleFactory31, heliumApplicationFactory36);
        try {
            zeppelinConfiguration0.load(file23);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//conf/interpreter-list" + "'", str11.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertTrue(b18 == false);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertNotNull(file35);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test102");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.util.List<org.apache.zeppelin.helium.HeliumRegistry> list_heliumRegistry36 = helium35.getAllRegistry();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj37 = helium35.getAllPackageConfig();
        try {
            org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult40 = helium35.getPackageInfo("0.0.0.0", "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(list_heliumRegistry36);
        org.junit.Assert.assertNotNull(map_str_map_str_obj37);
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test103");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        try {
            boolean b5 = zeppelinConfiguration0.getBoolean("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test104");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.String str7 = zeppelinConfiguration0.getNotebookDir();
        boolean b8 = zeppelinConfiguration0.isNotebokPublic();
        javax.xml.parsers.DocumentBuilder documentBuilder9 = zeppelinConfiguration0.getDocumentBuilder();
        java.io.Writer writer10 = null;
        try {
            zeppelinConfiguration0.save(writer10);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//conf/interpreter-list" + "'", str6.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "notebook" + "'", str7.equals("notebook"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNull(documentBuilder9);
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test105");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket0.onWebSocketBinary(byte_array6, 10, (int) ' ');
        java.lang.Throwable throwable10 = null;
        watcherWebsocket0.onWebSocketError(throwable10);
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test106");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.lang.String str1 = message0.roles;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT;
        message0.op = oP2;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_CLEAR_ALL_OUTPUT));
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test107");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test108");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.net.URL uRL9 = null;
        zeppelinConfiguration0.setURL(uRL9);
        java.lang.String str11 = zeppelinConfiguration0.getConfDir();
        boolean b12 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "conf" + "'", str11.equals("conf"));
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test109");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.util.List<java.lang.String> list_str36 = helium35.setVisualizationPackageOrder();
        java.util.List<org.apache.zeppelin.helium.HeliumPackageSearchResult> list_heliumPackageSearchResult38 = helium35.getSinglePackageInfo("helium.bundle.js");
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj39 = helium35.getAllPackageConfig();
        org.apache.zeppelin.notebook.socket.Message message41 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.lang.String str42 = message41.roles;
        java.lang.String str43 = message41.ticket;
        org.apache.zeppelin.notebook.Note note44 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph45 = null;
        note44.addParagraph(paragraph45);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj47 = note44.getInfo();
        org.apache.zeppelin.scheduler.Job job48 = null;
        note44.onProgressUpdate(job48, (int) (byte) -1);
        org.apache.zeppelin.notebook.NoteInfo noteInfo51 = new org.apache.zeppelin.notebook.NoteInfo(note44);
        noteInfo51.setId("configuration");
        org.apache.zeppelin.notebook.Note note54 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph55 = null;
        note54.addParagraph(paragraph55);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj57 = note54.getInfo();
        org.apache.zeppelin.scheduler.Job job58 = null;
        note54.onProgressUpdate(job58, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj61 = null;
        note54.setConfig(map_str_obj61);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj63 = note54.getInfo();
        noteInfo51.setConfig(map_str_obj63);
        message41.data = map_str_obj63;
        try {
            helium35.updatePackageConfig("interpreter-setting.json", map_str_obj63);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(list_str36);
        org.junit.Assert.assertNotNull(list_heliumPackageSearchResult38);
        org.junit.Assert.assertNotNull(map_str_map_str_obj39);
        org.junit.Assert.assertNotNull(message41);
        org.junit.Assert.assertTrue("'" + str42 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}" + "'", str42.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ".//conf/interpreter-list" + "'", str43.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertNotNull(map_str_obj47);
        org.junit.Assert.assertNotNull(map_str_obj57);
        org.junit.Assert.assertNotNull(map_str_obj63);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test110");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        java.lang.String str12 = zeppelinConfiguration0.getMongoDatabase();
        org.apache.commons.logging.Log log13 = null;
        zeppelinConfiguration0.setLogger(log13);
        java.lang.String str15 = zeppelinConfiguration0.getBucketName();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "zeppelin" + "'", str15.equals("zeppelin"));
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test111");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars11 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
        java.lang.String str12 = zeppelinConfiguration0.getRelativeDir(confVars11);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars13 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR;
        java.lang.String str14 = zeppelinConfiguration0.getRelativeDir(confVars13);
        java.lang.String str15 = zeppelinConfiguration0.getS3EncryptionMaterialsProviderClass();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars16 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE;
        java.lang.Class class17 = confVars16.getVarClass();
        float f18 = zeppelinConfiguration0.getFloat(confVars16);
        zeppelinConfiguration0.clearTree("0.8.0-SNAPSHOT");
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".//0.0.0.0" + "'", str14.equals(".//0.0.0.0"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + confVars16 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE + "'", confVars16.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE));
        org.junit.Assert.assertNotNull(class17);
        org.junit.Assert.assertTrue(f18 == (-1.0f));
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test112");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        note0.runAll();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note0.onOutputAppend(paragraph3, (int) (byte) 10, "helium.bundle.js");
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph7 = note0.getLastParagraph();
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str1);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test113");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.math.BigDecimal bigDecimal6 = zeppelinConfiguration0.getBigDecimal("");
        java.util.Iterator<java.lang.String> iterator_str8 = zeppelinConfiguration0.getKeys(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        java.util.Collection<org.apache.commons.configuration.event.ConfigurationListener> collection_configurationListener9 = zeppelinConfiguration0.getConfigurationListeners();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str11 = zeppelinConfiguration10.getHeliumRegistry();
        java.lang.Boolean b12 = zeppelinConfiguration10.credentialsPersist();
        java.lang.Boolean b15 = zeppelinConfiguration10.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str16 = zeppelinConfiguration10.getInterpreterRemoteRunnerPath();
        boolean b17 = zeppelinConfiguration10.isValidating();
        java.lang.String str18 = zeppelinConfiguration10.getMongoCollection();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration19 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str20 = zeppelinConfiguration19.getHeliumRegistry();
        java.lang.Boolean b21 = zeppelinConfiguration19.credentialsPersist();
        java.lang.Boolean b24 = zeppelinConfiguration19.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str25 = zeppelinConfiguration19.getInterpreterRemoteRunnerPath();
        java.lang.Object obj26 = zeppelinConfiguration19.clone();
        org.apache.commons.logging.Log log27 = zeppelinConfiguration19.getLogger();
        zeppelinConfiguration10.setLogger(log27);
        zeppelinConfiguration0.addErrorListener((org.apache.commons.configuration.event.ConfigurationErrorListener) zeppelinConfiguration10);
        zeppelinConfiguration10.setEncoding("{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(collection_configurationListener9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str11.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + true + "'", b12.equals(true));
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ".//bin/interpreter.sh" + "'", str16.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + "notes" + "'", str18.equals("notes"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str20.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b21 + "' != '" + true + "'", b21.equals(true));
        org.junit.Assert.assertTrue("'" + b24 + "' != '" + false + "'", b24.equals(false));
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ".//bin/interpreter.sh" + "'", str25.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(obj26);
        org.junit.Assert.assertNotNull(log27);
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test114");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE;
        java.lang.String str8 = zeppelinConfiguration0.getString(confVars7);
        try {
            zeppelinConfiguration0.load();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "JKS" + "'", str8.equals("JKS"));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test115");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array5 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo6 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, interpreterInfo_array5);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp8 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array9 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency10 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, dependency_array9);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption12 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner14 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting15 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) zeppelinHubOp8, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, interpreterOption12, "helium.bundle.js", interpreterRunner14);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type16 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array19 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo20 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, interpreterInfo_array19);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp22 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array23 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency24 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, dependency_array23);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption26 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner28 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting29 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, (java.lang.Object) zeppelinHubOp22, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, interpreterOption26, "helium.bundle.js", interpreterRunner28);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency30 = interpreterSetting29.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption31 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner33 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting34 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) type16, list_dependency30, interpreterOption31, "local_modules", interpreterRunner33);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting35 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting34);
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner36 = interpreterSetting35.getInterpreterRunner();
        interpreterSetting35.clearNoteIdAndParaMap();
        org.junit.Assert.assertNotNull(interpreterInfo_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp8 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp8.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type16.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp22 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp22.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_dependency30);
        org.junit.Assert.assertNull(interpreterRunner36);
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test116");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMPLETION_LIST));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test117");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.lang.String str11 = zeppelinConfiguration8.getTrustStoreType();
        boolean b12 = zeppelinConfiguration0.removeConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration8);
        java.net.URL uRL14 = null;
        zeppelinConfiguration8.registerEntityId("X-Zeppelin-Token", uRL14);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration18 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration18.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo20 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration18);
        boolean b21 = zeppelinConfiguration18.isEmpty();
        boolean b22 = zeppelinConfiguration18.isAutoSave();
        java.io.File file23 = null;
        java.io.File file24 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory25 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration18, file23, file24);
        java.io.File file27 = heliumBundleFactory25.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration28 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration28.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo30 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration28);
        boolean b31 = zeppelinConfiguration28.isEmpty();
        boolean b32 = zeppelinConfiguration28.isAutoSave();
        java.io.File file33 = null;
        java.io.File file34 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory35 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration28, file33, file34);
        java.io.File file37 = heliumBundleFactory35.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory38 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph39 = null;
        heliumApplicationFactory38.unload(paragraph39, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory42 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note43 = null;
        heliumApplicationFactory42.onNoteRemove(note43);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory45 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph46 = null;
        heliumApplicationFactory45.run(paragraph46, "local_modules");
        heliumApplicationFactory42.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory45);
        heliumApplicationFactory38.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory42);
        org.apache.zeppelin.helium.Helium helium51 = new org.apache.zeppelin.helium.Helium("yarn-cache", ".//conf/interpreter.json", file27, heliumBundleFactory35, heliumApplicationFactory42);
        try {
            zeppelinConfiguration8.load(file27);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "JKS" + "'", str11.equals("JKS"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(file37);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test118");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b9 = zeppelinConfiguration0.getBoolean("src", true);
        boolean b10 = zeppelinConfiguration0.isDelimiterParsingDisabled();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration11 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str12 = zeppelinConfiguration11.getHeliumRegistry();
        java.lang.Boolean b13 = zeppelinConfiguration11.credentialsPersist();
        java.lang.Boolean b16 = zeppelinConfiguration11.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str17 = zeppelinConfiguration11.getInterpreterRemoteRunnerPath();
        java.lang.Object obj18 = zeppelinConfiguration11.clone();
        org.apache.commons.logging.Log log19 = zeppelinConfiguration11.getLogger();
        zeppelinConfiguration0.setLogger(log19);
        org.apache.commons.configuration.FileSystem fileSystem21 = null;
        try {
            zeppelinConfiguration0.setFileSystem(fileSystem21);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str12.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + true + "'", b13.equals(true));
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + false + "'", b16.equals(false));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ".//bin/interpreter.sh" + "'", str17.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(log19);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test119");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        org.apache.commons.configuration.HierarchicalConfiguration.Node node4 = zeppelinConfiguration1.getRoot();
        org.xml.sax.InputSource inputSource7 = zeppelinConfiguration1.resolveEntity("configuration", "helium.bundle.js");
        java.lang.String str8 = zeppelinConfiguration1.getBucketName();
        java.lang.String str9 = zeppelinConfiguration1.getWebsocketMaxTextMessageSize();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(inputSource7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "zeppelin" + "'", str8.equals("zeppelin"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "1024000" + "'", str9.equals("1024000"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test120");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}"));
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test121");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        int i2 = folder1.countNotes();
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.Folder> map_str_folder3 = folder1.getChildren();
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook5 = null;
        heliumApplicationFactory4.setNotebook(notebook5);
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        heliumApplicationFactory4.unload(paragraph7, "X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note();
        heliumApplicationFactory4.onNoteCreate(note10);
        folder1.addNote(note10);
        org.apache.zeppelin.scheduler.Job job13 = null;
        note10.onProgressUpdate(job13, (int) (byte) -1);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map_str_folder3);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test122");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo9 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
        org.apache.zeppelin.notebook.Note note13 = vFSNotebookRepo9.get("{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", authenticationInfo12);
        vFSNotebookRepo9.close();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(note13);
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test123");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        boolean b4 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        java.lang.String str5 = zeppelinConfiguration0.getEndpoint();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "s3.amazonaws.com" + "'", str5.equals("s3.amazonaws.com"));
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test124");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium("yarn-cache", ".//conf/interpreter.json", file11, heliumBundleFactory19, heliumApplicationFactory26);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration36 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration36.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo38 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration36);
        boolean b39 = zeppelinConfiguration36.isEmpty();
        boolean b40 = zeppelinConfiguration36.isAutoSave();
        java.io.File file41 = null;
        java.io.File file42 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory43 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration36, file41, file42);
        java.io.File file45 = heliumBundleFactory43.getHeliumPackageDirectory("~Trash");
        java.io.File file47 = heliumBundleFactory43.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter49 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file11, file47, ".//0.0.0.0");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration50 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration50.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo52 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration50);
        boolean b53 = zeppelinConfiguration50.isEmpty();
        boolean b54 = zeppelinConfiguration50.isAutoSave();
        java.lang.String[] str_array56 = zeppelinConfiguration50.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration57 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration57.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo59 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration57);
        boolean b60 = zeppelinConfiguration57.isEmpty();
        boolean b61 = zeppelinConfiguration57.isAutoSave();
        java.lang.String[] str_array63 = zeppelinConfiguration57.getStringArray("bundles");
        installInterpreter49.install(str_array56, str_array63);
        installInterpreter49.install("hi!", ".//conf/interpreter.json");
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(str_array56);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(str_array63);
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test125");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium("yarn-cache", ".//conf/interpreter.json", file11, heliumBundleFactory19, heliumApplicationFactory26);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration36 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration36.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo38 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration36);
        boolean b39 = zeppelinConfiguration36.isEmpty();
        boolean b40 = zeppelinConfiguration36.isAutoSave();
        java.io.File file41 = null;
        java.io.File file42 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory43 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration36, file41, file42);
        java.io.File file45 = heliumBundleFactory43.getHeliumPackageDirectory("~Trash");
        java.io.File file47 = heliumBundleFactory43.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.interpreter.install.InstallInterpreter installInterpreter49 = new org.apache.zeppelin.interpreter.install.InstallInterpreter(file11, file47, ".//0.0.0.0");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration50 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration50.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo52 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration50);
        boolean b53 = zeppelinConfiguration50.isEmpty();
        boolean b54 = zeppelinConfiguration50.isAutoSave();
        java.lang.String[] str_array56 = zeppelinConfiguration50.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration57 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration57.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo59 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration57);
        boolean b60 = zeppelinConfiguration57.isEmpty();
        boolean b61 = zeppelinConfiguration57.isAutoSave();
        java.lang.String[] str_array63 = zeppelinConfiguration57.getStringArray("bundles");
        installInterpreter49.install(str_array56, str_array63);
        org.apache.zeppelin.helium.WebpackResult webpackResult65 = new org.apache.zeppelin.helium.WebpackResult();
        java.lang.String[] str_array66 = webpackResult65.warnings;
        installInterpreter49.install(str_array66);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertNotNull(file47);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(str_array56);
        org.junit.Assert.assertTrue(b60 == true);
        org.junit.Assert.assertTrue(b61 == false);
        org.junit.Assert.assertNotNull(str_array63);
        org.junit.Assert.assertNotNull(str_array66);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test126");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        int i2 = folder1.countNotes();
        boolean b3 = folder1.hasChild();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test127");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array5 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo6 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, interpreterInfo_array5);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp8 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array9 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency10 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, dependency_array9);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption12 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner14 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting15 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) zeppelinHubOp8, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, interpreterOption12, "helium.bundle.js", interpreterRunner14);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type16 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array19 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo20 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, interpreterInfo_array19);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp22 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array23 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency24 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, dependency_array23);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption26 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner28 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting29 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, (java.lang.Object) zeppelinHubOp22, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, interpreterOption26, "helium.bundle.js", interpreterRunner28);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency30 = interpreterSetting29.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption31 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner33 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting34 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) type16, list_dependency30, interpreterOption31, "local_modules", interpreterRunner33);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting35 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting34);
        java.util.Map<java.lang.String, java.lang.String> map_str_str36 = interpreterSetting34.getInfos();
        interpreterSetting34.clearNoteIdAndParaMap();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption38 = interpreterSetting34.getOption();
        org.junit.Assert.assertNotNull(interpreterInfo_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp8 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp8.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type16.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp22 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp22.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_dependency30);
        org.junit.Assert.assertNull(map_str_str36);
        org.junit.Assert.assertNotNull(interpreterOption38);
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test128");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array2 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo3 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo3, interpreterInfo_array2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array6 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency7 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency7, dependency_array6);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption9 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner11 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting12 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo3, (java.lang.Object) zeppelinHubOp5, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency7, interpreterOption9, "helium.bundle.js", interpreterRunner11);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency13 = interpreterSetting12.getDependencies();
        java.lang.Object obj14 = interpreterSetting12.getProperties();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration15 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration15.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo17 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration15);
        java.util.Properties properties19 = null;
        java.util.Properties properties20 = zeppelinConfiguration15.getProperties("bundles", properties19);
        interpreterSetting12.setProperties(properties20);
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map_str_set_str22 = interpreterSetting12.getNoteIdAndParaMap();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map_str_set_str23 = interpreterSetting12.getNoteIdAndParaMap();
        org.junit.Assert.assertNotNull(interpreterInfo_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp5 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp5.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_dependency13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", obj14.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(properties20);
        org.junit.Assert.assertNull(map_str_set_str22);
        org.junit.Assert.assertNull(map_str_set_str23);
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test129");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        java.lang.String str12 = zeppelinConfiguration0.getMongoDatabase();
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo13 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        org.apache.zeppelin.notebook.Note note17 = gitNotebookRepo13.setNoteRevision("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", "0.0.0.0", authenticationInfo16);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
        org.junit.Assert.assertNull(note17);
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test130");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        java.lang.String str4 = zeppelinConfiguration0.getInterpreterJson();
        boolean b5 = zeppelinConfiguration0.isEmpty();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "interpreter-setting.json" + "'", str4.equals("interpreter-setting.json"));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test131");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = notebookRepoSettingsInfo0.value;
        java.lang.String str2 = notebookRepoSettingsInfo0.selected;
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str3 = notebookRepoSettingsInfo0.value;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNull(list_map_str_str1);
        org.junit.Assert.assertNull(str2);
        org.junit.Assert.assertNull(list_map_str_str3);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test132");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        boolean b7 = note0.isPersonalizedMode();
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph8 = note0.getParagraphs();
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph9 = note0.getParagraphs();
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_paragraph8);
        org.junit.Assert.assertNotNull(list_paragraph9);
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test133");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str4 = zeppelinConfiguration3.getKeyStorePassword();
        zeppelinConfiguration3.clear();
        java.lang.Object obj6 = zeppelinConfiguration3.getReloadLock();
        int i7 = zeppelinConfiguration3.getServerPort();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client8 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("X-Zeppelin-Token", "{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}", ".//conf/.//conf/keystore", zeppelinConfiguration3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(obj6);
        org.junit.Assert.assertTrue(i7 == 8080);
        org.junit.Assert.assertNotNull(client8);
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test134");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.util.List<java.lang.String> list_str36 = helium35.setVisualizationPackageOrder();
        try {
            org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult38 = helium35.getEnabledPackageInfo("1024000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(list_str36);
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test135");
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo6 = new org.apache.zeppelin.notebook.NoteInfo("src", "X-Watcher-Key", map_str_obj5);
        noteInfo6.setId("");
        org.junit.Assert.assertNotNull(map_str_obj5);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test136");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
        float f8 = zeppelinConfiguration0.getFloat(confVars7);
        char char9 = zeppelinConfiguration0.getListDelimiter();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
        org.junit.Assert.assertTrue(f8 == (-1.0f));
        org.junit.Assert.assertTrue(char9 == ' ');
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test137");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        npmPackage0.name = "X-Zeppelin-Token";
        npmPackage0.name = "s3.amazonaws.com";
        npmPackage0.version = "interpreter-setting.json";
        npmPackage0.name = "{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}";
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test138");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.run(paragraph1, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = null;
        heliumApplicationFactory0.onOutputUpdated("zeppelin", "hi!", 0, "", type8, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type15 = null;
        heliumApplicationFactory0.onOutputUpdated("interpreter-setting.json", "bundles", 10, ".//conf/notebook-authorization.json", type15, ".//conf/helium.json");
        org.apache.zeppelin.notebook.Paragraph paragraph18 = null;
        heliumApplicationFactory0.run(paragraph18, "{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}");
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test139");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = null;
        note0.setConfig(map_str_obj7);
        boolean b9 = note0.isPersonalizedMode();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = note0.getInfo();
        try {
            note0.run("");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map_str_obj10);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test140");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
        notebookRepoWithSettings0.className = "X-Watcher-Key";
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo3 = notebookRepoWithSettings0.settings;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo4 = notebookRepoWithSettings0.settings;
        java.lang.String str5 = notebookRepoWithSettings0.className;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo6 = notebookRepoWithSettings0.settings;
        org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo3);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "X-Watcher-Key" + "'", str5.equals("X-Watcher-Key"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo6);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test141");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        java.lang.String str12 = zeppelinConfiguration0.getMongoDatabase();
        try {
            float f14 = zeppelinConfiguration0.getFloat("conf");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test142");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message5 = zeppelinClient3.deserialize(" ");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.socket.Message message7 = null;
        try {
            zeppelinClient3.send(message7, "{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNull(message5);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat6);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test143");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
        java.util.List<org.sonatype.aether.repository.RemoteRepository> list_remoteRepository2 = interpreterInfoSaving0.interpreterRepositories;
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting3 = interpreterInfoSaving0.interpreterSettings;
        java.util.List<org.sonatype.aether.repository.RemoteRepository> list_remoteRepository4 = interpreterInfoSaving0.interpreterRepositories;
        org.junit.Assert.assertNull(map_str_list_str1);
        org.junit.Assert.assertNull(list_remoteRepository2);
        org.junit.Assert.assertNull(map_str_interpreterSetting3);
        org.junit.Assert.assertNull(list_remoteRepository4);
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test144");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array3 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo4 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo4, interpreterInfo_array3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array7 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency8 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency8, dependency_array7);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption10 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner12 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting13 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo4, (java.lang.Object) zeppelinHubOp6, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency8, interpreterOption10, "helium.bundle.js", interpreterRunner12);
        org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note14.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note14.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str19 = note14.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting13.setInfos(map_str_str19);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arraylist_map_str_str21 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>>();
        boolean b22 = arraylist_map_str_str21.add(map_str_str19);
        notebookRepoSettingsInfo0.value = arraylist_map_str_str21;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type24 = notebookRepoSettingsInfo0.type;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type25 = notebookRepoSettingsInfo0.type;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNotNull(interpreterInfo_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp6 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp6.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNotNull(map_str_str19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(type24);
        org.junit.Assert.assertNull(type25);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test145");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getKeyManagerPassword();
        org.apache.commons.configuration.event.ConfigurationEvent configurationEvent5 = null;
        try {
            zeppelinConfiguration0.configurationChanged(configurationEvent5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test146");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.String str7 = zeppelinConfiguration0.getNotebookDir();
        java.lang.Short s10 = zeppelinConfiguration0.getShort("JKS", (java.lang.Short) (short) 100);
        zeppelinConfiguration0.clear();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//conf/interpreter-list" + "'", str6.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "notebook" + "'", str7.equals("notebook"));
        org.junit.Assert.assertTrue("'" + s10 + "' != '" + (short) 100 + "'", s10.equals((short) 100));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test147");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        java.util.List<java.lang.Object> list_obj10 = zeppelinConfiguration0.getList("zeppelin.dep.localrepo");
        zeppelinConfiguration0.validate();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertNotNull(list_obj10);
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test148");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        org.apache.zeppelin.notebook.Note note36 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph37 = null;
        note36.addParagraph(paragraph37);
        heliumApplicationFactory26.onNoteCreate(note36);
        org.apache.zeppelin.notebook.Note note40 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str41 = note40.generateParagraphsInfo();
        note40.runAll();
        heliumApplicationFactory26.onNoteRemove(note40);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(list_map_str_str41);
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test149");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        authentication3.run();
        boolean b5 = authentication3.authenticate();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test150");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration4.isS3ServerSideEncryption();
        char char8 = zeppelinConfiguration4.getListDelimiter();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(char8 == ' ');
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test151");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder(" ");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test152");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getScriptBody("9b49838f-dc67-47f7-8ec6-fd89b914fc08");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "9b49838f-dc67-47f7-8ec6-fd89b914fc08" + "'", str1.equals("9b49838f-dc67-47f7-8ec6-fd89b914fc08"));
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test153");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.String str3 = zeppelinConfiguration0.getPublicID();
        java.lang.String str4 = zeppelinConfiguration0.getUser();
        org.apache.commons.configuration.Configuration configuration5 = null;
        zeppelinConfiguration0.append(configuration5);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "user" + "'", str4.equals("user"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test154");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration3.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo5 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration3);
        boolean b6 = zeppelinConfiguration3.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration7.clear();
        zeppelinConfiguration3.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration7);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars10 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
        float f11 = zeppelinConfiguration3.getFloat(confVars10);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client12 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", "load.js", "", zeppelinConfiguration3);
        org.xml.sax.InputSource inputSource15 = zeppelinConfiguration3.resolveEntity("zeppelin", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
        char char16 = zeppelinConfiguration3.getListDelimiter();
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + confVars10 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars10.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
        org.junit.Assert.assertTrue(f11 == (-1.0f));
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNull(inputSource15);
        org.junit.Assert.assertTrue(char16 == ' ');
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test155");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note0.isPersonalizedMode();
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        note0.onOutputAppend(paragraph5, 12, "org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        note0.moveParagraph(" ", (int) '#');
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test156");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        org.apache.zeppelin.notebook.NoteInfo noteInfo7 = new org.apache.zeppelin.notebook.NoteInfo(note0);
        java.lang.String str8 = note0.getId();
        org.apache.zeppelin.user.Credentials credentials9 = null;
        note0.setCredentials(credentials9);
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test157");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration3.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo5 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration3);
        boolean b6 = zeppelinConfiguration3.isEmpty();
        boolean b7 = zeppelinConfiguration3.isAutoSave();
        java.math.BigDecimal bigDecimal9 = zeppelinConfiguration3.getBigDecimal("");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client10 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("b3883bc7-9096-4750-9b75-98964ffef420", "interpreter-setting.json", ".//interpreter", zeppelinConfiguration3);
        java.lang.Long long13 = zeppelinConfiguration3.getLong(".//0.0.0.0", (java.lang.Long) 100L);
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(bigDecimal9);
        org.junit.Assert.assertNotNull(client10);
        org.junit.Assert.assertTrue("'" + long13 + "' != '" + 100L + "'", long13.equals(100L));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test158");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        s3NotebookRepo2.close();
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test159");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str6 = zeppelinConfiguration0.getHeliumRegistry();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str6.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test160");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo11 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision14 = gitNotebookRepo11.revisionHistory("http://registry.npmjs.org/", authenticationInfo13);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo16 = gitNotebookRepo11.getSettings(authenticationInfo15);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_revision14);
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo16);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test161");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization2 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b3 = notebookAuthorization2.isPublic();
        java.util.Set<java.lang.String> set_str5 = notebookAuthorization2.getOwners(".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b7 = notebookAuthorization1.hasReadAuthorization(set_str5, "http://repo1.maven.org/maven2/");
        org.junit.Assert.assertNotNull(notebookAuthorization1);
        org.junit.Assert.assertNotNull(notebookAuthorization2);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(set_str5);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test162");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTES_INFO));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test163");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array2 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo3 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo3, interpreterInfo_array2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array6 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency7 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency7, dependency_array6);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption9 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner11 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting12 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo3, (java.lang.Object) zeppelinHubOp5, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency7, interpreterOption9, "helium.bundle.js", interpreterRunner11);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency13 = interpreterSetting12.getDependencies();
        java.lang.Object obj14 = interpreterSetting12.getProperties();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array20 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo21 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo21, interpreterInfo_array20);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp23 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array24 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency25 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency25, dependency_array24);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption27 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner29 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting30 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo21, (java.lang.Object) zeppelinHubOp23, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency25, interpreterOption27, "helium.bundle.js", interpreterRunner29);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type31 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array34 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo35 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b36 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo35, interpreterInfo_array34);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp37 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array38 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency39 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency39, dependency_array38);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption41 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner43 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting44 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo35, (java.lang.Object) zeppelinHubOp37, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency39, interpreterOption41, "helium.bundle.js", interpreterRunner43);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency45 = interpreterSetting44.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption46 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner48 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting49 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo21, (java.lang.Object) type31, list_dependency45, interpreterOption46, "local_modules", interpreterRunner48);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency50 = interpreterSetting49.getDependencies();
        java.lang.String str51 = interpreterSetting49.getId();
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency52 = interpreterSetting49.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status53 = interpreterSetting49.getStatus();
        interpreterSetting12.setStatus(status53);
        org.junit.Assert.assertNotNull(interpreterInfo_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp5 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp5.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_dependency13);
        org.junit.Assert.assertTrue("'" + obj14 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", obj14.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(interpreterInfo_array20);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp23 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp23.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + type31 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type31.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array34);
        org.junit.Assert.assertTrue(b36 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp37 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp37.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertNotNull(list_dependency45);
        org.junit.Assert.assertNotNull(list_dependency50);
        org.junit.Assert.assertTrue("'" + str51 + "' != '" + "yarn-cache" + "'", str51.equals("yarn-cache"));
        org.junit.Assert.assertNotNull(list_dependency52);
        org.junit.Assert.assertTrue("'" + status53 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY + "'", status53.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY));
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test164");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.unload(paragraph1, "zeppelin.dep.localrepo");
        org.apache.zeppelin.notebook.Notebook notebook4 = null;
        heliumApplicationFactory0.setNotebook(notebook4);
        org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        note6.addParagraph(paragraph7);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note6.getInfo();
        heliumApplicationFactory0.onNoteRemove(note6);
        org.apache.zeppelin.helium.ApplicationEventListener applicationEventListener11 = heliumApplicationFactory0.getApplicationEventListener();
        org.junit.Assert.assertNotNull(map_str_obj9);
        org.junit.Assert.assertNull(applicationEventListener11);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test165");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.io.File file37 = heliumBundleFactory19.getHeliumPackageSourceDirectory(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file37);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test166");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        java.lang.String str9 = zeppelinConfiguration0.getS3KMSKeyRegion();
        long long13 = zeppelinConfiguration0.getLong("./conf/interpreter.json", "X-Watcher-Key", (long) 1);
        boolean b14 = zeppelinConfiguration0.isAnonymousAllowed();
        java.net.URL uRL15 = zeppelinConfiguration0.getURL();
        org.apache.commons.configuration.interpol.ConfigurationInterpolator configurationInterpolator16 = zeppelinConfiguration0.getInterpolator();
        java.lang.Long long19 = zeppelinConfiguration0.getLong("interpreter-setting.json", (java.lang.Long) 10L);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(long13 == 1L);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(uRL15);
        org.junit.Assert.assertNotNull(configurationInterpolator16);
        org.junit.Assert.assertTrue("'" + long19 + "' != '" + 10L + "'", long19.equals(10L));
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test167");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str1 = npmPackage0.name;
        npmPackage0.version = ".//local-repo";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test168");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.EMPTY;
        zeppelinhubSession0.close();
        zeppelinhubSession0.sendByFuture(".//conf/credentials.json");
        org.junit.Assert.assertNotNull(zeppelinhubSession0);
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test169");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket0.onWebSocketBinary(byte_array6, 10, (int) ' ');
        org.eclipse.jetty.websocket.api.Session session10 = null;
        watcherWebsocket0.connection = session10;
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test170");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.clear();
        java.lang.Object obj3 = zeppelinConfiguration0.getReloadLock();
        java.lang.Float f6 = zeppelinConfiguration0.getFloat("", (java.lang.Float) 0.0f);
        int i7 = zeppelinConfiguration0.getServerSslPort();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue("'" + f6 + "' != '" + 0.0f + "'", f6.equals(0.0f));
        org.junit.Assert.assertTrue(i7 == 8443);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test171");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        message0.principal = "s3.amazonaws.com";
        message0.roles = ".//0.0.0.0";
        org.junit.Assert.assertNotNull(message0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test172");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        java.lang.String str11 = zeppelinConfiguration0.getInterpreterLocalRepoPath();
        org.apache.commons.configuration.tree.ConfigurationNode configurationNode12 = zeppelinConfiguration0.getRootNode();
        java.lang.String str13 = zeppelinConfiguration0.getFileName();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//local-repo" + "'", str11.equals(".//local-repo"));
        org.junit.Assert.assertNotNull(configurationNode12);
        org.junit.Assert.assertNull(str13);
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test173");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("./conf/interpreter.json");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"./conf/interpreter.json\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"./conf/interpreter.json\"},\"meta\":{}}"));
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test174");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        zeppelinConfiguration1.clear();
        java.lang.Object obj4 = zeppelinConfiguration1.getReloadLock();
        int i5 = zeppelinConfiguration1.getServerPort();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication6 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", zeppelinConfiguration1);
        boolean b7 = authentication6.authenticate();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(obj4);
        org.junit.Assert.assertTrue(i5 == 8080);
        org.junit.Assert.assertNotNull(authentication6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test175");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("heliumBundles");
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test176");
        int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_SET_PROPERTY;
        org.junit.Assert.assertTrue(i0 == 3);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test178");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        zeppelinConfiguration0.setThrowExceptionOnMissing(true);
        java.lang.String str7 = zeppelinConfiguration0.getMongoDatabase();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket10 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        java.lang.Throwable throwable11 = null;
        zeppelinWebsocket10.onWebSocketError(throwable11);
        zeppelinConfiguration0.setProperty("user", (java.lang.Object) throwable11);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "zeppelin" + "'", str7.equals("zeppelin"));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test179");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        boolean b8 = zeppelinConfiguration0.useClientAuth();
        zeppelinConfiguration0.setRootElementName("user");
        java.math.BigDecimal bigDecimal12 = null;
        java.math.BigDecimal bigDecimal13 = zeppelinConfiguration0.getBigDecimal("1024000", bigDecimal12);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test180");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.net.URL uRL9 = null;
        zeppelinConfiguration0.setURL(uRL9);
        java.lang.String str11 = zeppelinConfiguration0.getConfDir();
        try {
            zeppelinConfiguration0.save("helium-bundle");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "conf" + "'", str11.equals("conf"));
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test181");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo11 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision14 = gitNotebookRepo11.revisionHistory("http://registry.npmjs.org/", authenticationInfo13);
        gitNotebookRepo11.close();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_revision14);
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test182");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage1.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = zeppelinhubMessage1.meta;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array10 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo11 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo11, interpreterInfo_array10);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp13 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array14 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency15 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency15, dependency_array14);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption17 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner19 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting20 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo11, (java.lang.Object) zeppelinHubOp13, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency15, interpreterOption17, "helium.bundle.js", interpreterRunner19);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type21 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array24 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo25 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b26 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo25, interpreterInfo_array24);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp27 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array28 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency29 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency29, dependency_array28);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption31 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner33 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting34 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo25, (java.lang.Object) zeppelinHubOp27, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency29, interpreterOption31, "helium.bundle.js", interpreterRunner33);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency35 = interpreterSetting34.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption36 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner38 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting39 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo11, (java.lang.Object) type21, list_dependency35, interpreterOption36, "local_modules", interpreterRunner38);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting40 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting39);
        java.util.Map<java.lang.String, java.lang.String> map_str_str41 = interpreterSetting39.getInfos();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration42 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str43 = zeppelinConfiguration42.getHeliumRegistry();
        java.lang.Boolean b44 = zeppelinConfiguration42.credentialsPersist();
        org.w3c.dom.Document document45 = zeppelinConfiguration42.getDocument();
        java.lang.String str46 = zeppelinConfiguration42.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo47 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration42);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo48 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo49 = mongoNotebookRepo47.getSettings(authenticationInfo48);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration50 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration50.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo52 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration50);
        java.util.Map<java.lang.String, java.lang.String> map_str_str53 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo54 = null;
        s3NotebookRepo52.updateSettings(map_str_str53, authenticationInfo54);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo57 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision58 = s3NotebookRepo52.revisionHistory("zeppelin.dep.localrepo", authenticationInfo57);
        org.apache.zeppelin.notebook.Note note59 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str60 = note59.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note62 = note59.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str64 = note59.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo65 = null;
        s3NotebookRepo52.updateSettings(map_str_str64, authenticationInfo65);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo67 = null;
        mongoNotebookRepo47.updateSettings(map_str_str64, authenticationInfo67);
        interpreterSetting39.setInfos(map_str_str64);
        zeppelinhubMessage1.meta = map_str_str64;
        java.lang.String str71 = zeppelinhubMessage1.serialize();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp72 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK;
        zeppelinhubMessage1.op = zeppelinHubOp72;
        java.lang.Object obj74 = zeppelinhubMessage1.op;
        org.apache.zeppelin.notebook.Note note77 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph78 = null;
        note77.addParagraph(paragraph78);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj80 = note77.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo81 = new org.apache.zeppelin.notebook.NoteInfo("src", "X-Watcher-Key", map_str_obj80);
        java.lang.String str82 = noteInfo81.getId();
        zeppelinhubMessage1.data = str82;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNotNull(map_str_str4);
        org.junit.Assert.assertNotNull(interpreterInfo_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp13 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp13.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + type21 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type21.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array24);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp27 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp27.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertNotNull(list_dependency35);
        org.junit.Assert.assertNull(map_str_str41);
        org.junit.Assert.assertTrue("'" + str43 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str43.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b44 + "' != '" + true + "'", b44.equals(true));
        org.junit.Assert.assertNull(document45);
        org.junit.Assert.assertTrue("'" + str46 + "' != '" + "s3.amazonaws.com" + "'", str46.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo49);
        org.junit.Assert.assertNotNull(list_revision58);
        org.junit.Assert.assertNotNull(list_map_str_str60);
        org.junit.Assert.assertNotNull(note62);
        org.junit.Assert.assertNotNull(map_str_str64);
        org.junit.Assert.assertTrue("'" + str71 + "' != '" + "{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}" + "'", str71.equals("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + zeppelinHubOp72 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK + "'", zeppelinHubOp72.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK));
        org.junit.Assert.assertTrue("'" + obj74 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK + "'", obj74.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.RUN_NOTEBOOK));
        org.junit.Assert.assertNotNull(map_str_obj80);
        org.junit.Assert.assertTrue("'" + str82 + "' != '" + "src" + "'", str82.equals("src"));
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test183");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        org.xml.sax.InputSource inputSource8 = zeppelinConfiguration0.resolveEntity("yarn-cache", "0.8.0-SNAPSHOT");
        zeppelinConfiguration0.save("load.js");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(inputSource8);
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test184");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo11 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision14 = gitNotebookRepo11.revisionHistory("http://registry.npmjs.org/", authenticationInfo13);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        try {
            org.apache.zeppelin.notebook.Note note17 = gitNotebookRepo11.get("zeppelin", authenticationInfo16);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_revision14);
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test185");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo5 = null;
        org.apache.zeppelin.notebook.Note note6 = s3NotebookRepo2.get(".//conf", "user", authenticationInfo5);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
        org.apache.zeppelin.notebook.Note note10 = s3NotebookRepo2.setNoteRevision("b3883bc7-9096-4750-9b75-98964ffef420", "interpreter.json", authenticationInfo9);
        org.junit.Assert.assertNull(note6);
        org.junit.Assert.assertNull(note10);
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test186");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        org.apache.commons.configuration.Configuration configuration7 = zeppelinConfiguration0.interpolatedConfiguration();
        zeppelinConfiguration0.setPublicID("{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}");
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(configuration7);
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test187");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        java.lang.String str11 = zeppelinConfiguration0.getServerAddress();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "0.0.0.0" + "'", str11.equals("0.0.0.0"));
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test188");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.run(paragraph1, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type8 = null;
        heliumApplicationFactory0.onOutputUpdated("zeppelin", "hi!", 0, "", type8, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.Notebook notebook11 = null;
        heliumApplicationFactory0.setNotebook(notebook11);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test189");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getConfDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str8 = zeppelinConfiguration7.getHeliumRegistry();
        java.lang.Boolean b9 = zeppelinConfiguration7.credentialsPersist();
        java.lang.String str10 = zeppelinConfiguration7.getPublicID();
        java.lang.String str11 = zeppelinConfiguration7.getConfDir();
        zeppelinConfiguration0.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration7);
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo13 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration7);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "conf" + "'", str6.equals("conf"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str8.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + true + "'", b9.equals(true));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "conf" + "'", str11.equals("conf"));
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test190");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        int i9 = zeppelinConfiguration0.getInt("conf", (int) ' ');
        boolean b10 = zeppelinConfiguration0.isSchemaValidation();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue(i9 == 32);
        org.junit.Assert.assertTrue(b10 == false);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test191");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo11 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision14 = gitNotebookRepo11.revisionHistory("http://registry.npmjs.org/", authenticationInfo13);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision17 = gitNotebookRepo11.revisionHistory("hi!", authenticationInfo16);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_revision14);
        org.junit.Assert.assertNotNull(list_revision17);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test192");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.math.BigDecimal bigDecimal6 = zeppelinConfiguration0.getBigDecimal("");
        java.util.Iterator<java.lang.String> iterator_str8 = zeppelinConfiguration0.getKeys(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.apache.commons.lang.text.StrSubstitutor strSubstitutor9 = zeppelinConfiguration0.getSubstitutor();
        java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration11 = zeppelinConfiguration0.configurationsAt("zeppelin.dep.localrepo");
        java.lang.String str12 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNotNull(iterator_str8);
        org.junit.Assert.assertNotNull(strSubstitutor9);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//bin/interpreter.sh" + "'", str12.equals(".//bin/interpreter.sh"));
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test193");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        org.apache.zeppelin.scheduler.Job job3 = null;
        note0.onProgressUpdate(job3, (int) (byte) 1);
        org.apache.zeppelin.notebook.NoteNameListener noteNameListener6 = null;
        note0.setNoteNameListener(noteNameListener6);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph10 = note0.insertNewParagraph(12, authenticationInfo9);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test194");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        boolean b12 = zeppelinConfiguration0.isAutoSave();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration13.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo15 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration13);
        java.util.Properties properties17 = null;
        java.util.Properties properties18 = zeppelinConfiguration13.getProperties("bundles", properties17);
        java.lang.String str19 = zeppelinConfiguration13.getInterpreterRemoteRunnerPath();
        java.lang.String str20 = zeppelinConfiguration13.getUser();
        boolean b21 = zeppelinConfiguration0.removeErrorListener((org.apache.commons.configuration.event.ConfigurationErrorListener) zeppelinConfiguration13);
        java.util.List<java.lang.String> list_str22 = zeppelinConfiguration13.getAllowedOrigins();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ".//bin/interpreter.sh" + "'", str19.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "user" + "'", str20.equals("user"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_str22);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test195");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("~Trash");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        java.lang.String str3 = watcherMessage2.message;
        java.lang.String str4 = watcherMessage2.noteId;
        watcherMessage2.subject = " ";
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "~Trash" + "'", str4.equals("~Trash"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test196");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        org.apache.zeppelin.notebook.NoteInfo noteInfo7 = new org.apache.zeppelin.notebook.NoteInfo(note0);
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph9 = note0.clearParagraphOutput(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test198");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterListPath();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration7.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo9 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration7);
        boolean b10 = zeppelinConfiguration7.isEmpty();
        boolean b11 = zeppelinConfiguration7.isAutoSave();
        java.lang.String[] str_array13 = zeppelinConfiguration7.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars14 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i15 = zeppelinConfiguration7.getInt(confVars14);
        java.net.URL uRL16 = null;
        zeppelinConfiguration7.setURL(uRL16);
        java.lang.String str18 = zeppelinConfiguration7.getInterpreterListPath();
        java.lang.String str19 = zeppelinConfiguration7.getInterpreterDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration20 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration20.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo22 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration20);
        boolean b23 = zeppelinConfiguration20.isEmpty();
        boolean b24 = zeppelinConfiguration20.isAutoSave();
        java.io.File file25 = null;
        java.io.File file26 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration20, file25, file26);
        java.lang.Boolean b28 = zeppelinConfiguration20.credentialsPersist();
        zeppelinConfiguration7.append((org.apache.commons.configuration.Configuration) zeppelinConfiguration20);
        zeppelinConfiguration0.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration20);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//conf/interpreter-list" + "'", str6.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertNotNull(str_array13);
        org.junit.Assert.assertTrue("'" + confVars14 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars14.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i15 == (-1));
        org.junit.Assert.assertTrue("'" + str18 + "' != '" + ".//conf/interpreter-list" + "'", str18.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ".//interpreter" + "'", str19.equals(".//interpreter"));
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + b28 + "' != '" + true + "'", b28.equals(true));
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test199");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getRequiredReplName("9b49838f-dc67-47f7-8ec6-fd89b914fc08");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test200");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getRequiredReplName("1024000");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test201");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj6);
        java.lang.String str8 = interpreterInfo7.getName();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization9 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b10 = notebookAuthorization9.isPublic();
        java.lang.String[] str_array19 = new java.lang.String[] { "heliumBundles", "yarn-cache", "X-Watcher-Key", "X-Watcher-Key", "hi!", "zeppelin.dep.localrepo", "local_modules", "local_modules" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str20, str_array19);
        boolean b23 = notebookAuthorization9.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str20, "X-Zeppelin-Token");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo25 = null;
        notebookAuthorization9.setNewNotePermissions("user", authenticationInfo25);
        boolean b27 = interpreterInfo7.equals((java.lang.Object) authenticationInfo25);
        org.apache.zeppelin.notebook.Note note28 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph29 = null;
        note28.addParagraph(paragraph29);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj31 = note28.getInfo();
        org.apache.zeppelin.scheduler.Job job32 = null;
        note28.onProgressUpdate(job32, (int) (byte) -1);
        org.apache.zeppelin.notebook.NoteInfo noteInfo35 = new org.apache.zeppelin.notebook.NoteInfo(note28);
        noteInfo35.setId("configuration");
        org.apache.zeppelin.notebook.Note note38 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph39 = null;
        note38.addParagraph(paragraph39);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj41 = note38.getInfo();
        noteInfo35.setConfig(map_str_obj41);
        interpreterInfo7.setEditor(map_str_obj41);
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(notebookAuthorization9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(map_str_obj31);
        org.junit.Assert.assertNotNull(map_str_obj41);
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test202");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj6);
        java.lang.String str8 = interpreterInfo7.getName();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization9 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b10 = notebookAuthorization9.isPublic();
        java.lang.String[] str_array19 = new java.lang.String[] { "heliumBundles", "yarn-cache", "X-Watcher-Key", "X-Watcher-Key", "hi!", "zeppelin.dep.localrepo", "local_modules", "local_modules" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str20 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str20, str_array19);
        boolean b23 = notebookAuthorization9.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str20, "X-Zeppelin-Token");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo25 = null;
        notebookAuthorization9.setNewNotePermissions("user", authenticationInfo25);
        boolean b27 = interpreterInfo7.equals((java.lang.Object) authenticationInfo25);
        interpreterInfo7.setName("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        java.lang.String str30 = interpreterInfo7.getClassName();
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
        org.junit.Assert.assertNotNull(notebookAuthorization9);
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(str_array19);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test203");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
        zeppelinhubClient2.initUser("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}");
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat3);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test204");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getConfDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str8 = zeppelinConfiguration7.getHeliumRegistry();
        java.lang.Boolean b9 = zeppelinConfiguration7.credentialsPersist();
        java.lang.String str10 = zeppelinConfiguration7.getPublicID();
        java.lang.String str11 = zeppelinConfiguration7.getConfDir();
        zeppelinConfiguration0.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration7);
        org.apache.commons.configuration.FileSystem fileSystem13 = zeppelinConfiguration7.getFileSystem();
        java.lang.Double d16 = zeppelinConfiguration7.getDouble("", (java.lang.Double) 0.0d);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "conf" + "'", str6.equals("conf"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str8.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + true + "'", b9.equals(true));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "conf" + "'", str11.equals("conf"));
        org.junit.Assert.assertNotNull(fileSystem13);
        org.junit.Assert.assertTrue("'" + d16 + "' != '" + 0.0d + "'", d16.equals(0.0d));
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test205");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.EMPTY;
        boolean b1 = zeppelinhubSession0.isSessionOpen();
        zeppelinhubSession0.sendByFuture("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}");
        org.junit.Assert.assertNotNull(zeppelinhubSession0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test206");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        org.eclipse.jetty.websocket.api.Session session2 = null;
        zeppelinWebsocket1.onWebSocketConnect(session2);
        java.lang.Throwable throwable4 = null;
        zeppelinWebsocket1.onWebSocketError(throwable4);
        java.lang.Throwable throwable6 = null;
        zeppelinWebsocket1.onWebSocketError(throwable6);
        zeppelinWebsocket1.onWebSocketClose((int) (byte) 1, "");
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test207");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "mongodb://localhost");
        java.lang.String str5 = userTokenContainer3.getExistingUserToken(" ");
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test208");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.unload(paragraph1, "zeppelin.dep.localrepo");
        org.apache.zeppelin.notebook.Notebook notebook4 = null;
        heliumApplicationFactory0.setNotebook(notebook4);
        org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        note6.addParagraph(paragraph7);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note6.getInfo();
        heliumApplicationFactory0.onNoteRemove(note6);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = note6.getLastParagraph();
        note6.moveParagraph("9b49838f-dc67-47f7-8ec6-fd89b914fc08", (int) '4');
        org.junit.Assert.assertNotNull(map_str_obj9);
        org.junit.Assert.assertNull(paragraph11);
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test209");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_ADDED));
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test210");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        org.apache.zeppelin.notebook.Folder folder3 = folderView0.renameFolder("./conf/interpreter.json", ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        org.apache.zeppelin.notebook.Folder folder5 = folderView0.getFolder("X-Zeppelin-Token");
        org.junit.Assert.assertNull(folder3);
        org.junit.Assert.assertNull(folder5);
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test211");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance(".//conf/interpreter-list");
        zeppelinhubWebsocket1.onWebSocketText(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test212");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        zeppelinConfiguration0.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy13 = zeppelinConfiguration0.getReloadingStrategy();
        java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration15 = zeppelinConfiguration0.configurationsAt("");
        java.lang.String str16 = zeppelinConfiguration0.getRootElementName();
        org.apache.commons.lang.text.StrSubstitutor strSubstitutor17 = zeppelinConfiguration0.getSubstitutor();
        zeppelinConfiguration0.clearErrorListeners();
        org.apache.commons.configuration.HierarchicalConfiguration.Node node19 = zeppelinConfiguration0.getRoot();
        java.lang.Object obj20 = zeppelinConfiguration0.clone();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "configuration" + "'", str16.equals("configuration"));
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertNotNull(node19);
        org.junit.Assert.assertNotNull(obj20);
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test213");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo5 = null;
        org.apache.zeppelin.notebook.Note note6 = s3NotebookRepo2.get(".//conf", "user", authenticationInfo5);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo9 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision10 = s3NotebookRepo2.checkpoint("helium.bundle.cache.js", "helium.bundle.cache.js", authenticationInfo9);
        org.junit.Assert.assertNull(note6);
        org.junit.Assert.assertNotNull(revision10);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test214");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket1.onWebSocketBinary(byte_array7, 10, (int) ' ');
        watcherWebsocket0.onWebSocketBinary(byte_array7, (int) (short) 0, 100);
        org.eclipse.jetty.websocket.api.Session session14 = watcherWebsocket0.connection;
        watcherWebsocket0.onWebSocketClose((int) (byte) -1, ".//conf/notebook-authorization.json");
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNull(session14);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test215");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision8 = s3NotebookRepo2.revisionHistory("zeppelin.dep.localrepo", authenticationInfo7);
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str10 = note9.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note12 = note9.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = note9.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        s3NotebookRepo2.updateSettings(map_str_str14, authenticationInfo15);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo19 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision20 = s3NotebookRepo2.checkpoint(".//conf/interpreter-list", "", authenticationInfo19);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo21 = null;
        try {
            java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo22 = s3NotebookRepo2.list(authenticationInfo21);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(list_revision8);
        org.junit.Assert.assertNotNull(list_map_str_str10);
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNotNull(map_str_str14);
        org.junit.Assert.assertNotNull(revision20);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test216");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder(".//bin/interpreter.sh");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.subject("notebook");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage4 = builder3.build();
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(watcherMessage4);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test217");
        org.apache.commons.configuration.tree.ExpressionEngine expressionEngine0 = org.apache.commons.configuration.HierarchicalConfiguration.getDefaultExpressionEngine();
        org.apache.commons.configuration.HierarchicalConfiguration.setDefaultExpressionEngine(expressionEngine0);
        org.apache.commons.configuration.HierarchicalConfiguration.setDefaultExpressionEngine(expressionEngine0);
        org.junit.Assert.assertNotNull(expressionEngine0);
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test218");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.lang.String str11 = zeppelinConfiguration8.getTrustStoreType();
        boolean b12 = zeppelinConfiguration0.removeConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration8);
        java.lang.Boolean b15 = zeppelinConfiguration8.getBoolean("helium.bundle.js", (java.lang.Boolean) false);
        java.lang.String str16 = zeppelinConfiguration8.getCredentialsPath();
        zeppelinConfiguration8.setFileName("zeppelin");
        boolean b22 = zeppelinConfiguration8.getBoolean("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "JKS" + "'", str11.equals("JKS"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ".//conf/credentials.json" + "'", str16.equals(".//conf/credentials.json"));
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test219");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        zeppelinConfiguration0.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy13 = zeppelinConfiguration0.getReloadingStrategy();
        java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration15 = zeppelinConfiguration0.configurationsAt("");
        org.xml.sax.InputSource inputSource18 = zeppelinConfiguration0.resolveEntity("9b49838f-dc67-47f7-8ec6-fd89b914fc08", "9b49838f-dc67-47f7-8ec6-fd89b914fc08");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration20 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str21 = zeppelinConfiguration20.getHeliumRegistry();
        zeppelinConfiguration20.setRootElementName(" ");
        java.lang.String str24 = zeppelinConfiguration20.getSystemID();
        java.lang.String str25 = zeppelinConfiguration20.getInterpreterSettingPath();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars26 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_CLIENT_AUTH;
        float f27 = zeppelinConfiguration20.getFloat(confVars26);
        java.util.Properties properties29 = zeppelinConfiguration20.getProperties("{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}");
        java.util.Properties properties30 = zeppelinConfiguration0.getProperties(".//bin/interpreter.sh", properties29);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertNull(inputSource18);
        org.junit.Assert.assertTrue("'" + str21 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str21.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ".//conf/interpreter.json" + "'", str25.equals(".//conf/interpreter.json"));
        org.junit.Assert.assertTrue("'" + confVars26 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_CLIENT_AUTH + "'", confVars26.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_CLIENT_AUTH));
        org.junit.Assert.assertTrue(f27 == (-1.0f));
        org.junit.Assert.assertNotNull(properties29);
        org.junit.Assert.assertNotNull(properties30);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test220");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage1.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = null;
        zeppelinhubMessage1.meta = map_str_str4;
        java.util.Map<java.lang.String, java.lang.String> map_str_str6 = zeppelinhubMessage1.meta;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNull(map_str_str6);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test221");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        org.apache.commons.configuration.Configuration configuration7 = zeppelinConfiguration0.interpolatedConfiguration();
        boolean b8 = zeppelinConfiguration0.useClientAuth();
        boolean b12 = zeppelinConfiguration0.getBoolean("X-Watcher-Key", ".//conf/.//conf/keystore", true);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b12 == true);
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test222");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        float f6 = zeppelinConfiguration0.getFloat("X-Zeppelin-Token", (float) 100L);
        java.lang.Object obj7 = zeppelinConfiguration0.getReloadLock();
        org.apache.zeppelin.dep.DependencyResolver dependencyResolver8 = null;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array14 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo15 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, interpreterInfo_array14);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp17 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array18 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency19 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency19, dependency_array18);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption21 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner23 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting24 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, (java.lang.Object) zeppelinHubOp17, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency19, interpreterOption21, "helium.bundle.js", interpreterRunner23);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type25 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array28 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo29 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo29, interpreterInfo_array28);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp31 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array32 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency33 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency33, dependency_array32);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption35 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner37 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting38 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo29, (java.lang.Object) zeppelinHubOp31, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency33, interpreterOption35, "helium.bundle.js", interpreterRunner37);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency39 = interpreterSetting38.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption40 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner42 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting43 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, (java.lang.Object) type25, list_dependency39, interpreterOption40, "local_modules", interpreterRunner42);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency44 = interpreterSetting43.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption45 = interpreterSetting43.getOption();
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager46 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, dependencyResolver8, interpreterOption45);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue(f6 == 100.0f);
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertNotNull(interpreterInfo_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp17 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp17.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type25.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp31 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp31.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(list_dependency39);
        org.junit.Assert.assertNotNull(list_dependency44);
        org.junit.Assert.assertNotNull(interpreterOption45);
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test223");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        org.xml.sax.EntityResolver entityResolver9 = zeppelinConfiguration0.getEntityResolver();
        java.lang.Boolean b10 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Float f13 = zeppelinConfiguration0.getFloat("org.apache.zeppelin.notebook.repo.GitNotebookRepo", (java.lang.Float) 10.0f);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(entityResolver9);
        org.junit.Assert.assertTrue("'" + b10 + "' != '" + true + "'", b10.equals(true));
        org.junit.Assert.assertTrue("'" + f13 + "' != '" + 10.0f + "'", f13.equals(10.0f));
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test224");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array5 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo6 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, interpreterInfo_array5);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp8 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array9 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency10 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, dependency_array9);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption12 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner14 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting15 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) zeppelinHubOp8, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, interpreterOption12, "helium.bundle.js", interpreterRunner14);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type16 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array19 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo20 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, interpreterInfo_array19);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp22 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array23 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency24 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, dependency_array23);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption26 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner28 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting29 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, (java.lang.Object) zeppelinHubOp22, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, interpreterOption26, "helium.bundle.js", interpreterRunner28);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency30 = interpreterSetting29.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption31 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner33 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting34 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) type16, list_dependency30, interpreterOption31, "local_modules", interpreterRunner33);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting35 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting34);
        java.lang.String str36 = interpreterSetting34.getErrorReason();
        org.junit.Assert.assertNotNull(interpreterInfo_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp8 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp8.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type16.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp22 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp22.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_dependency30);
        org.junit.Assert.assertNull(str36);
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test225");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo5 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo7 = mongoNotebookRepo5.getSettings(authenticationInfo6);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.util.Map<java.lang.String, java.lang.String> map_str_str11 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
        s3NotebookRepo10.updateSettings(map_str_str11, authenticationInfo12);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision16 = s3NotebookRepo10.revisionHistory("zeppelin.dep.localrepo", authenticationInfo15);
        org.apache.zeppelin.notebook.Note note17 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str18 = note17.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note20 = note17.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str22 = note17.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo23 = null;
        s3NotebookRepo10.updateSettings(map_str_str22, authenticationInfo23);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo25 = null;
        mongoNotebookRepo5.updateSettings(map_str_str22, authenticationInfo25);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo29 = null;
        org.apache.zeppelin.notebook.Note note30 = mongoNotebookRepo5.get("src", "helium.bundle.js", authenticationInfo29);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array36 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo37 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b38 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo37, interpreterInfo_array36);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp39 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array40 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency41 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency41, dependency_array40);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption43 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner45 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting46 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo37, (java.lang.Object) zeppelinHubOp39, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency41, interpreterOption43, "helium.bundle.js", interpreterRunner45);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type47 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array50 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo51 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b52 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo51, interpreterInfo_array50);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp53 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array54 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency55 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b56 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency55, dependency_array54);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption57 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner59 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting60 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo51, (java.lang.Object) zeppelinHubOp53, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency55, interpreterOption57, "helium.bundle.js", interpreterRunner59);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency61 = interpreterSetting60.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption62 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner64 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting65 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo37, (java.lang.Object) type47, list_dependency61, interpreterOption62, "local_modules", interpreterRunner64);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting66 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting65);
        java.util.Map<java.lang.String, java.lang.String> map_str_str67 = interpreterSetting65.getInfos();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration68 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str69 = zeppelinConfiguration68.getHeliumRegistry();
        java.lang.Boolean b70 = zeppelinConfiguration68.credentialsPersist();
        org.w3c.dom.Document document71 = zeppelinConfiguration68.getDocument();
        java.lang.String str72 = zeppelinConfiguration68.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo73 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration68);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo74 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo75 = mongoNotebookRepo73.getSettings(authenticationInfo74);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration76 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration76.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo78 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration76);
        java.util.Map<java.lang.String, java.lang.String> map_str_str79 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo80 = null;
        s3NotebookRepo78.updateSettings(map_str_str79, authenticationInfo80);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo83 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision84 = s3NotebookRepo78.revisionHistory("zeppelin.dep.localrepo", authenticationInfo83);
        org.apache.zeppelin.notebook.Note note85 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str86 = note85.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note88 = note85.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str90 = note85.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo91 = null;
        s3NotebookRepo78.updateSettings(map_str_str90, authenticationInfo91);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo93 = null;
        mongoNotebookRepo73.updateSettings(map_str_str90, authenticationInfo93);
        interpreterSetting65.setInfos(map_str_str90);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo96 = null;
        mongoNotebookRepo5.updateSettings(map_str_str90, authenticationInfo96);
        mongoNotebookRepo5.close();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s3.amazonaws.com" + "'", str4.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo7);
        org.junit.Assert.assertNotNull(list_revision16);
        org.junit.Assert.assertNotNull(list_map_str_str18);
        org.junit.Assert.assertNotNull(note20);
        org.junit.Assert.assertNotNull(map_str_str22);
        org.junit.Assert.assertNull(note30);
        org.junit.Assert.assertNotNull(interpreterInfo_array36);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp39 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp39.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + type47 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type47.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array50);
        org.junit.Assert.assertTrue(b52 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp53 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp53.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array54);
        org.junit.Assert.assertTrue(b56 == false);
        org.junit.Assert.assertNotNull(list_dependency61);
        org.junit.Assert.assertNull(map_str_str67);
        org.junit.Assert.assertTrue("'" + str69 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str69.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b70 + "' != '" + true + "'", b70.equals(true));
        org.junit.Assert.assertNull(document71);
        org.junit.Assert.assertTrue("'" + str72 + "' != '" + "s3.amazonaws.com" + "'", str72.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo75);
        org.junit.Assert.assertNotNull(list_revision84);
        org.junit.Assert.assertNotNull(list_map_str_str86);
        org.junit.Assert.assertNotNull(note88);
        org.junit.Assert.assertNotNull(map_str_str90);
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test226");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "mongodb://localhost");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = userTokenContainer3.getAllUserTokens();
        java.lang.String str6 = userTokenContainer3.getExistingUserToken("interpreter-setting.json");
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
        org.junit.Assert.assertNotNull(map_str_str4);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test227");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.String str2 = zeppelinConfiguration0.getBasePath();
        zeppelinConfiguration0.validate();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test228");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        boolean b11 = zeppelinConfiguration8.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        zeppelinConfiguration8.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration8.isValidating();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration16 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration16.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo18 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration16);
        java.util.Properties properties20 = null;
        java.util.Properties properties21 = zeppelinConfiguration16.getProperties("bundles", properties20);
        java.lang.String str22 = zeppelinConfiguration16.getInterpreterRemoteRunnerPath();
        java.lang.String str23 = zeppelinConfiguration16.getUser();
        boolean b24 = zeppelinConfiguration16.isAnonymousAllowed();
        zeppelinConfiguration16.setThrowExceptionOnMissing(false);
        org.apache.commons.configuration.tree.ExpressionEngine expressionEngine27 = zeppelinConfiguration16.getExpressionEngine();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration29 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str30 = zeppelinConfiguration29.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication31 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration29);
        org.apache.commons.configuration.HierarchicalConfiguration.Node node32 = zeppelinConfiguration29.getRoot();
        zeppelinConfiguration16.setRoot(node32);
        zeppelinConfiguration8.setRootNode((org.apache.commons.configuration.tree.ConfigurationNode) node32);
        zeppelinConfiguration0.setRootNode((org.apache.commons.configuration.tree.ConfigurationNode) node32);
        zeppelinConfiguration0.reload();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(properties21);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ".//bin/interpreter.sh" + "'", str22.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + "user" + "'", str23.equals("user"));
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(expressionEngine27);
        org.junit.Assert.assertTrue("'" + str30 + "' != '" + "" + "'", str30.equals(""));
        org.junit.Assert.assertNotNull(authentication31);
        org.junit.Assert.assertNotNull(node32);
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test229");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.lang.String[] str_array10 = new java.lang.String[] { "heliumBundles", "yarn-cache", "X-Watcher-Key", "X-Watcher-Key", "hi!", "zeppelin.dep.localrepo", "local_modules", "local_modules" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str11 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str11, str_array10);
        boolean b14 = notebookAuthorization0.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str11, "X-Zeppelin-Token");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration16 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization17 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration16);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization19 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b20 = notebookAuthorization19.isPublic();
        java.lang.String[] str_array28 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str29, str_array28);
        notebookAuthorization19.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str29);
        notebookAuthorization17.setOwners("src", (java.util.Set<java.lang.String>) linkedhashset_str29);
        notebookAuthorization0.setOwners("notes", (java.util.Set<java.lang.String>) linkedhashset_str29);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration35 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization36 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration35);
        java.lang.String[] str_array46 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str47 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b48 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str47, str_array46);
        notebookAuthorization36.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str47);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization51 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b52 = notebookAuthorization51.isPublic();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization54 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b55 = notebookAuthorization54.isPublic();
        java.lang.String[] str_array63 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str64, str_array63);
        notebookAuthorization54.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str64);
        boolean b67 = notebookAuthorization51.isWriter("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", (java.util.Set<java.lang.String>) linkedhashset_str64);
        boolean b68 = notebookAuthorization36.isOwner("load.js", (java.util.Set<java.lang.String>) linkedhashset_str64);
        boolean b69 = notebookAuthorization0.isOwner("load.js", (java.util.Set<java.lang.String>) linkedhashset_str64);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization17);
        org.junit.Assert.assertNotNull(notebookAuthorization19);
        org.junit.Assert.assertTrue(b20 == true);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization36);
        org.junit.Assert.assertNotNull(str_array46);
        org.junit.Assert.assertTrue(b48 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization51);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(str_array63);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertTrue(b67 == true);
        org.junit.Assert.assertTrue(b68 == true);
        org.junit.Assert.assertTrue(b69 == true);
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test230");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        java.lang.String str1 = instance0.token;
        instance0.id = 100;
        instance0.token = "zeppelin.dep.localrepo";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test231");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.util.List<java.lang.String> list_str36 = helium35.setVisualizationPackageOrder();
        java.util.List<java.lang.String> list_str37 = helium35.setVisualizationPackageOrder();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(list_str36);
        org.junit.Assert.assertNotNull(list_str37);
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test232");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        boolean b9 = zeppelinConfiguration0.isNotebokPublic();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue(b9 == true);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test233");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.lang.String str11 = zeppelinConfiguration8.getTrustStoreType();
        boolean b12 = zeppelinConfiguration0.removeConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration8);
        java.lang.Boolean b15 = zeppelinConfiguration8.getBoolean("helium.bundle.js", (java.lang.Boolean) false);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars16 = null;
        try {
            float f17 = zeppelinConfiguration8.getFloat(confVars16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "JKS" + "'", str11.equals("JKS"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test234");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getScriptBody("mongodb://localhost");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "mongodb://localhost" + "'", str1.equals("mongodb://localhost"));
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test235");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo11 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo13 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision14 = gitNotebookRepo11.revisionHistory("http://registry.npmjs.org/", authenticationInfo13);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision18 = gitNotebookRepo11.checkpoint("notes", ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo", authenticationInfo17);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_revision14);
        org.junit.Assert.assertNotNull(revision18);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test236");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        npmPackage0.name = "X-Zeppelin-Token";
        npmPackage0.name = "s3.amazonaws.com";
        java.util.Map<java.lang.String, java.lang.String> map_str_str5 = npmPackage0.dependencies;
        org.junit.Assert.assertNull(map_str_str5);
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test237");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getTrustStoreType();
        java.lang.String str4 = zeppelinConfiguration0.getPublicID();
        boolean b5 = zeppelinConfiguration0.isS3ServerSideEncryption();
        boolean b6 = zeppelinConfiguration0.isValidating();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JKS" + "'", str3.equals("JKS"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test238");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.EMPTY;
        boolean b1 = zeppelinhubSession0.isSessionOpen();
        zeppelinhubSession0.sendByFuture("2CJPAEGM3");
        org.junit.Assert.assertNotNull(zeppelinhubSession0);
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test239");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.math.BigDecimal bigDecimal4 = zeppelinConfiguration0.getBigDecimal("src");
        java.lang.Boolean b5 = zeppelinConfiguration0.credentialsPersist();
        org.apache.commons.configuration.tree.ExpressionEngine expressionEngine6 = zeppelinConfiguration0.getExpressionEngine();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(bigDecimal4);
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + true + "'", b5.equals(true));
        org.junit.Assert.assertNotNull(expressionEngine6);
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test240");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array2 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo3 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b4 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo3, interpreterInfo_array2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array6 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency7 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b8 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency7, dependency_array6);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption9 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner11 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting12 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo3, (java.lang.Object) zeppelinHubOp5, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency7, interpreterOption9, "helium.bundle.js", interpreterRunner11);
        org.apache.zeppelin.notebook.Note note13 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str14 = note13.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note16 = note13.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str18 = note13.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting12.setInfos(map_str_str18);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array22 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo23 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo23, interpreterInfo_array22);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp25 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array26 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency27 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency27, dependency_array26);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption29 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner31 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting32 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo23, (java.lang.Object) zeppelinHubOp25, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency27, interpreterOption29, "helium.bundle.js", interpreterRunner31);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency33 = interpreterSetting32.getDependencies();
        interpreterSetting12.setDependencies(list_dependency33);
        java.lang.String str35 = interpreterSetting12.getId();
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner36 = interpreterSetting12.getInterpreterRunner();
        org.junit.Assert.assertNotNull(interpreterInfo_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp5 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp5.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_map_str_str14);
        org.junit.Assert.assertNotNull(note16);
        org.junit.Assert.assertNotNull(map_str_str18);
        org.junit.Assert.assertNotNull(interpreterInfo_array22);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp25 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp25.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array26);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(list_dependency33);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "2CKAXVA4Z" + "'", str35.equals("2CKAXVA4Z"));
        org.junit.Assert.assertNull(interpreterRunner36);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test241");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.lang.String[] str_array9 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str10, str_array9);
        notebookAuthorization0.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str10);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization14 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b15 = notebookAuthorization14.isPublic();
        java.util.Set<java.lang.String> set_str17 = notebookAuthorization14.getRoles("zeppelin.dep.localrepo");
        notebookAuthorization0.setReaders("", set_str17);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration20 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization21 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration20);
        java.lang.String[] str_array31 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str32 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str32, str_array31);
        notebookAuthorization21.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str32);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization36 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b37 = notebookAuthorization36.isPublic();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization39 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b40 = notebookAuthorization39.isPublic();
        java.lang.String[] str_array48 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str49 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str49, str_array48);
        notebookAuthorization39.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str49);
        boolean b52 = notebookAuthorization36.isWriter("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", (java.util.Set<java.lang.String>) linkedhashset_str49);
        boolean b53 = notebookAuthorization21.isOwner("load.js", (java.util.Set<java.lang.String>) linkedhashset_str49);
        notebookAuthorization0.setReaders(".//helium,https://s3.amazonaws.com/helium-package/helium.json", (java.util.Set<java.lang.String>) linkedhashset_str49);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration56 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization57 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration56);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization58 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b59 = notebookAuthorization58.isPublic();
        java.lang.String[] str_array67 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str68 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b69 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str68, str_array67);
        notebookAuthorization58.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str68);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization72 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b73 = notebookAuthorization72.isPublic();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization75 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b76 = notebookAuthorization75.isPublic();
        java.lang.String[] str_array84 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str85 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b86 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str85, str_array84);
        notebookAuthorization75.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str85);
        boolean b88 = notebookAuthorization72.isWriter("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", (java.util.Set<java.lang.String>) linkedhashset_str85);
        notebookAuthorization58.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str85);
        boolean b91 = notebookAuthorization57.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str85, "1024000");
        boolean b92 = notebookAuthorization0.isWriter("2CHF9171K", (java.util.Set<java.lang.String>) linkedhashset_str85);
        java.util.Set<java.lang.String> set_str94 = notebookAuthorization0.getRoles("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization14);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertNotNull(set_str17);
        org.junit.Assert.assertNotNull(notebookAuthorization21);
        org.junit.Assert.assertNotNull(str_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization36);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(str_array48);
        org.junit.Assert.assertTrue(b50 == true);
        org.junit.Assert.assertTrue(b52 == true);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization57);
        org.junit.Assert.assertNotNull(notebookAuthorization58);
        org.junit.Assert.assertTrue(b59 == true);
        org.junit.Assert.assertNotNull(str_array67);
        org.junit.Assert.assertTrue(b69 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization72);
        org.junit.Assert.assertTrue(b73 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization75);
        org.junit.Assert.assertTrue(b76 == true);
        org.junit.Assert.assertNotNull(str_array84);
        org.junit.Assert.assertTrue(b86 == true);
        org.junit.Assert.assertTrue(b88 == true);
        org.junit.Assert.assertTrue(b91 == true);
        org.junit.Assert.assertTrue(b92 == true);
        org.junit.Assert.assertNotNull(set_str94);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test242");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        org.eclipse.jetty.websocket.api.Session session2 = null;
        zeppelinWebsocket1.onWebSocketConnect(session2);
        java.lang.Throwable throwable4 = null;
        zeppelinWebsocket1.onWebSocketError(throwable4);
        zeppelinWebsocket1.noteId = "interpreter-setting.json";
        java.lang.Throwable throwable8 = null;
        zeppelinWebsocket1.onWebSocketError(throwable8);
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test243");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.io.File file9 = heliumBundleFactory7.getHeliumPackageSourceDirectory(" ");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration22 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration22.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo24 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration22);
        boolean b25 = zeppelinConfiguration22.isEmpty();
        boolean b26 = zeppelinConfiguration22.isAutoSave();
        java.io.File file27 = null;
        java.io.File file28 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory29 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration22, file27, file28);
        java.io.File file31 = heliumBundleFactory29.getHeliumPackageDirectory("~Trash");
        java.io.File file33 = heliumBundleFactory29.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory34 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph35 = null;
        heliumApplicationFactory34.run(paragraph35, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type42 = null;
        heliumApplicationFactory34.onOutputUpdated("zeppelin", "hi!", 0, "", type42, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage48 = null;
        heliumApplicationFactory34.onLoad(" ", ".//conf/.//conf/keystore", "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", heliumPackage48);
        org.apache.zeppelin.helium.Helium helium50 = new org.apache.zeppelin.helium.Helium("yarn-cache", "bundles", file21, heliumBundleFactory29, heliumApplicationFactory34);
        try {
            java.util.List<java.lang.String> list_str51 = org.apache.zeppelin.helium.HeliumBundleFactory.unTgz(file9, file21);
            org.junit.Assert.fail("Expected exception of type java.io.FileNotFoundException");
        } catch (java.io.FileNotFoundException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertTrue(b26 == false);
        org.junit.Assert.assertNotNull(file31);
        org.junit.Assert.assertNotNull(file33);
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test244");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder(".//local-repo");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test245");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        int i1 = folderView0.countFolders();
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.scheduler.Job job6 = null;
        note2.onProgressUpdate(job6, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = null;
        note2.setConfig(map_str_obj9);
        org.apache.zeppelin.notebook.Folder folder11 = folderView0.getFolderOf(note2);
        note2.moveParagraph("", (int) '4');
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(map_str_obj5);
        org.junit.Assert.assertNull(folder11);
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test246");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration7.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo9 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration7);
        boolean b10 = zeppelinConfiguration7.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration11 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration11.clear();
        zeppelinConfiguration7.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration11);
        boolean b14 = zeppelinConfiguration7.isValidating();
        java.lang.Boolean b15 = zeppelinConfiguration7.credentialsPersist();
        boolean b16 = zeppelinConfiguration0.removeErrorListener((org.apache.commons.configuration.event.ConfigurationErrorListener) zeppelinConfiguration7);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration17 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration17.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo19 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration17);
        java.util.Properties properties21 = null;
        java.util.Properties properties22 = zeppelinConfiguration17.getProperties("bundles", properties21);
        java.lang.String str23 = zeppelinConfiguration17.getInterpreterListPath();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars24 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO;
        long long25 = confVars24.getLongValue();
        float f26 = zeppelinConfiguration17.getFloat(confVars24);
        zeppelinConfiguration7.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration17);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + true + "'", b15.equals(true));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ".//conf/interpreter-list" + "'", str23.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + confVars24 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO + "'", confVars24.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO));
        org.junit.Assert.assertTrue(long25 == (-1L));
        org.junit.Assert.assertTrue(f26 == (-1.0f));
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test247");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        try {
            heliumApplicationFactory0.onParagraphRemove(paragraph1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test248");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        java.lang.String str4 = zeppelinConfiguration0.getSystemID();
        java.lang.String str5 = zeppelinConfiguration0.getInterpreterSettingPath();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars6 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_CLIENT_AUTH;
        float f7 = zeppelinConfiguration0.getFloat(confVars6);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars8 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED;
        float f9 = zeppelinConfiguration0.getFloat(confVars8);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ".//conf/interpreter.json" + "'", str5.equals(".//conf/interpreter.json"));
        org.junit.Assert.assertTrue("'" + confVars6 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_CLIENT_AUTH + "'", confVars6.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_CLIENT_AUTH));
        org.junit.Assert.assertTrue(f7 == (-1.0f));
        org.junit.Assert.assertTrue("'" + confVars8 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED + "'", confVars8.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED));
        org.junit.Assert.assertTrue(f9 == (-1.0f));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test249");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "anonymous");
        try {
            java.util.List<org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance> list_instance5 = zeppelinhubRestApiHandler1.getInstances("9b49838f-dc67-47f7-8ec6-fd89b914fc08");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test250");
        org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("");
        org.junit.Assert.assertNull(oP1);
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test251");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message message1 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj2 = message1.data;
        message0.data = map_str_obj2;
        java.lang.String str4 = message0.principal;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = message0.data;
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertNotNull(message1);
        org.junit.Assert.assertNotNull(map_str_obj2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s3.amazonaws.com" + "'", str4.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(map_str_obj5);
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test252");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.net.URL uRL9 = null;
        zeppelinConfiguration0.setURL(uRL9);
        java.lang.String str11 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.String str12 = zeppelinConfiguration0.getInterpreterDir();
        org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo13 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//conf/interpreter-list" + "'", str11.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//interpreter" + "'", str12.equals(".//interpreter"));
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test253");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = null;
        note0.setConfig(map_str_obj7);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note0.getInfo();
        try {
            org.apache.zeppelin.notebook.Note note11 = note0.getUserNote("1024000");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(map_str_obj9);
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test254");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        boolean b8 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        zeppelinConfiguration0.setListDelimiter('a');
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo11 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array14 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo15 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, interpreterInfo_array14);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp17 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array18 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency19 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency19, dependency_array18);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption21 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner23 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting24 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, (java.lang.Object) zeppelinHubOp17, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency19, interpreterOption21, "helium.bundle.js", interpreterRunner23);
        org.apache.zeppelin.notebook.Note note25 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str26 = note25.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note28 = note25.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str30 = note25.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting24.setInfos(map_str_str30);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo32 = null;
        gitNotebookRepo11.updateSettings(map_str_str30, authenticationInfo32);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(interpreterInfo_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp17 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp17.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertNotNull(list_map_str_str26);
        org.junit.Assert.assertNotNull(note28);
        org.junit.Assert.assertNotNull(map_str_str30);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test255");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getConfDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str8 = zeppelinConfiguration7.getHeliumRegistry();
        java.lang.Boolean b9 = zeppelinConfiguration7.credentialsPersist();
        java.lang.String str10 = zeppelinConfiguration7.getPublicID();
        java.lang.String str11 = zeppelinConfiguration7.getConfDir();
        zeppelinConfiguration0.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration7);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars13 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE;
        java.lang.String str14 = zeppelinConfiguration7.getString(confVars13);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "conf" + "'", str6.equals("conf"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str8.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + true + "'", b9.equals(true));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "conf" + "'", str11.equals("conf"));
        org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "1024000" + "'", str14.equals("1024000"));
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test256");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        zeppelinConfiguration0.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy13 = zeppelinConfiguration0.getReloadingStrategy();
        java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration15 = zeppelinConfiguration0.configurationsAt("");
        java.lang.String str16 = zeppelinConfiguration0.getRootElementName();
        org.apache.commons.lang.text.StrSubstitutor strSubstitutor17 = zeppelinConfiguration0.getSubstitutor();
        zeppelinConfiguration0.clearErrorListeners();
        java.lang.String str19 = zeppelinConfiguration0.getPublicID();
        int i20 = zeppelinConfiguration0.getServerSslPort();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "configuration" + "'", str16.equals("configuration"));
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertNull(str19);
        org.junit.Assert.assertTrue(i20 == 8443);
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test257");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.setDetailEvents(true);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test258");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.lang.String str11 = zeppelinConfiguration8.getTrustStoreType();
        boolean b12 = zeppelinConfiguration0.removeConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration8);
        java.lang.Boolean b15 = zeppelinConfiguration8.getBoolean("helium.bundle.js", (java.lang.Boolean) false);
        java.lang.String str16 = zeppelinConfiguration8.getMongoDatabase();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "JKS" + "'", str11.equals("JKS"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "zeppelin" + "'", str16.equals("zeppelin"));
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test259");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_FOLDER_TO_TRASH));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test260");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        zeppelinConfiguration0.setSystemID("zeppelin");
        org.xml.sax.EntityResolver entityResolver6 = zeppelinConfiguration0.getEntityResolver();
        zeppelinConfiguration0.setBasePath("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertNotNull(entityResolver6);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test261");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        org.apache.commons.configuration.Configuration configuration9 = zeppelinConfiguration0.interpolatedConfiguration();
        java.lang.String str11 = zeppelinConfiguration0.getString("s3.amazonaws.com");
        boolean b12 = zeppelinConfiguration0.useSsl();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertNotNull(configuration9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test262");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration3.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo5 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration3);
        boolean b6 = zeppelinConfiguration3.isEmpty();
        boolean b7 = zeppelinConfiguration3.isAutoSave();
        java.math.BigDecimal bigDecimal9 = zeppelinConfiguration3.getBigDecimal("");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client10 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("b3883bc7-9096-4750-9b75-98964ffef420", "interpreter-setting.json", ".//interpreter", zeppelinConfiguration3);
        client10.start();
        org.apache.zeppelin.notebook.socket.Message message12 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP13 = org.apache.zeppelin.notebook.socket.Message.OP.PING;
        message12.op = oP13;
        java.lang.String str15 = message12.ticket;
        org.apache.zeppelin.notebook.socket.Message message16 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj17 = message16.data;
        message12.data = map_str_obj17;
        org.apache.zeppelin.notebook.socket.Message.OP oP19 = org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE;
        message12.op = oP19;
        try {
            client10.relayToZeppelin(message12, "notebook");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNull(bigDecimal9);
        org.junit.Assert.assertNotNull(client10);
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertTrue("'" + oP13 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PING + "'", oP13.equals(org.apache.zeppelin.notebook.socket.Message.OP.PING));
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + ".//conf/interpreter-list" + "'", str15.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertNotNull(message16);
        org.junit.Assert.assertNotNull(map_str_obj17);
        org.junit.Assert.assertTrue("'" + oP19 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE + "'", oP19.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_NOTE));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test263");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        float f6 = zeppelinConfiguration0.getFloat("X-Zeppelin-Token", (float) 100L);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING;
        long long8 = zeppelinConfiguration0.getLong(confVars7);
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue(f6 == 100.0f);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING));
        org.junit.Assert.assertTrue(long8 == (-1L));
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test264");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.lang.String str1 = message0.roles;
        org.apache.zeppelin.notebook.socket.Message.OP oP2 = org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER;
        message0.op = oP2;
        java.lang.Object obj5 = message0.get("");
        org.apache.zeppelin.notebook.socket.Message.OP oP7 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED;
        org.apache.zeppelin.notebook.socket.Message message8 = message0.put("helium-bundle", (java.lang.Object) oP7);
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//0.0.0.0" + "'", str1.equals(".//0.0.0.0"));
        org.junit.Assert.assertTrue("'" + oP2 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER + "'", oP2.equals(org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_FOLDER));
        org.junit.Assert.assertNull(obj5);
        org.junit.Assert.assertTrue("'" + oP7 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED + "'", oP7.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATED));
        org.junit.Assert.assertNotNull(message8);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test265");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        org.apache.commons.configuration.HierarchicalConfiguration.Node node4 = zeppelinConfiguration1.getRoot();
        org.xml.sax.InputSource inputSource7 = zeppelinConfiguration1.resolveEntity("configuration", "helium.bundle.js");
        java.lang.String str8 = zeppelinConfiguration1.getBucketName();
        zeppelinConfiguration1.setThrowExceptionOnMissing(false);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(inputSource7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "zeppelin" + "'", str8.equals("zeppelin"));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test266");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_RENAME;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_RENAME + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_RENAME));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test267");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.lang.String str11 = zeppelinConfiguration8.getTrustStoreType();
        boolean b12 = zeppelinConfiguration0.removeConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration8);
        java.lang.Boolean b15 = zeppelinConfiguration8.getBoolean("helium.bundle.js", (java.lang.Boolean) false);
        java.lang.String str16 = zeppelinConfiguration8.getCredentialsPath();
        javax.xml.parsers.DocumentBuilder documentBuilder17 = zeppelinConfiguration8.getDocumentBuilder();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration18 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration18.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo20 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration18);
        java.util.Properties properties22 = null;
        java.util.Properties properties23 = zeppelinConfiguration18.getProperties("bundles", properties22);
        java.lang.String str24 = zeppelinConfiguration18.getInterpreterRemoteRunnerPath();
        zeppelinConfiguration18.clearProperty("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        boolean b27 = zeppelinConfiguration8.removeConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration18);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "JKS" + "'", str11.equals("JKS"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ".//conf/credentials.json" + "'", str16.equals(".//conf/credentials.json"));
        org.junit.Assert.assertNull(documentBuilder17);
        org.junit.Assert.assertNotNull(properties23);
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + ".//bin/interpreter.sh" + "'", str24.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue(b27 == false);
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test268");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage1.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = zeppelinhubMessage1.meta;
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder6 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("heliumBundles");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder8 = builder6.message(" ");
        zeppelinhubMessage1.data = builder8;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type10 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        zeppelinhubMessage1.op = type10;
        org.apache.zeppelin.notebook.socket.Message.OP oP12 = org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE;
        zeppelinhubMessage1.op = oP12;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNull(map_str_str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertTrue("'" + type10 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type10.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertTrue("'" + oP12 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE + "'", oP12.equals(org.apache.zeppelin.notebook.socket.Message.OP.UPDATE_PERSONALIZED_MODE));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test269");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        org.apache.zeppelin.scheduler.Job job7 = null;
        org.apache.zeppelin.scheduler.Job.Status status8 = null;
        org.apache.zeppelin.scheduler.Job.Status status9 = null;
        note0.beforeStatusChange(job7, status8, status9);
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph11 = note0.getParagraphs();
        org.apache.zeppelin.notebook.FolderView folderView12 = new org.apache.zeppelin.notebook.FolderView();
        org.apache.zeppelin.notebook.Folder folder15 = folderView12.renameFolder("./conf/interpreter.json", ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        note0.setNoteNameListener((org.apache.zeppelin.notebook.NoteNameListener) folderView12);
        boolean b18 = folderView12.hasFolder(".//0.0.0.0");
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(list_paragraph11);
        org.junit.Assert.assertNull(folder15);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test270");
        org.apache.zeppelin.helium.HeliumRegistrySerializer heliumRegistrySerializer0 = new org.apache.zeppelin.helium.HeliumRegistrySerializer();
        com.google.gson.JsonElement jsonElement1 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars2 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE;
        java.lang.Class class3 = confVars2.getVarClass();
        com.google.gson.JsonDeserializationContext jsonDeserializationContext4 = null;
        try {
            org.apache.zeppelin.helium.HeliumRegistry heliumRegistry5 = heliumRegistrySerializer0.deserialize(jsonElement1, (java.lang.reflect.Type) class3, jsonDeserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + confVars2 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE + "'", confVars2.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE));
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test271");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = note0.getInfo();
        note0.setName("");
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = note0.getConfig();
        org.apache.zeppelin.notebook.Note note13 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph14 = null;
        note13.addParagraph(paragraph14);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj16 = note13.getInfo();
        org.apache.zeppelin.scheduler.Job job17 = null;
        note13.onProgressUpdate(job17, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj20 = note13.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo21 = new org.apache.zeppelin.notebook.NoteInfo("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "", map_str_obj20);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj22 = noteInfo21.getConfig();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj23 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj10, map_str_obj22);
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(map_str_obj7);
        org.junit.Assert.assertNotNull(map_str_obj10);
        org.junit.Assert.assertNotNull(map_str_obj16);
        org.junit.Assert.assertNotNull(map_str_obj20);
        org.junit.Assert.assertNotNull(map_str_obj22);
        org.junit.Assert.assertNotNull(map_str_map_str_obj23);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test272");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED;
        java.lang.String str8 = zeppelinConfiguration0.getString(confVars7);
        java.lang.Boolean b11 = zeppelinConfiguration0.getBoolean(" ", (java.lang.Boolean) true);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED));
        org.junit.Assert.assertNull(str8);
        org.junit.Assert.assertTrue("'" + b11 + "' != '" + true + "'", b11.equals(true));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test273");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.clear();
        java.lang.Object obj3 = zeppelinConfiguration0.getReloadLock();
        int i4 = zeppelinConfiguration0.getServerPort();
        char char5 = zeppelinConfiguration0.getListDelimiter();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration6 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration6.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo8 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration6);
        org.w3c.dom.Document document9 = zeppelinConfiguration6.getDocument();
        zeppelinConfiguration6.setSystemID("zeppelin");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str13 = zeppelinConfiguration12.getHeliumRegistry();
        zeppelinConfiguration12.setFileName("zeppelin");
        boolean b16 = zeppelinConfiguration12.isAttributeSplittingDisabled();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration17 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration17.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo19 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration17);
        java.util.Properties properties21 = null;
        java.util.Properties properties22 = zeppelinConfiguration17.getProperties("bundles", properties21);
        java.lang.String str23 = zeppelinConfiguration17.getInterpreterRemoteRunnerPath();
        java.lang.String str24 = zeppelinConfiguration17.getUser();
        boolean b25 = zeppelinConfiguration17.isAnonymousAllowed();
        zeppelinConfiguration17.setThrowExceptionOnMissing(false);
        zeppelinConfiguration17.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy30 = zeppelinConfiguration17.getReloadingStrategy();
        zeppelinConfiguration12.setReloadingStrategy(reloadingStrategy30);
        zeppelinConfiguration6.setReloadingStrategy(reloadingStrategy30);
        zeppelinConfiguration0.setReloadingStrategy(reloadingStrategy30);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration34 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration34.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo36 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration34);
        java.util.Properties properties38 = null;
        java.util.Properties properties39 = zeppelinConfiguration34.getProperties("bundles", properties38);
        java.lang.String str40 = zeppelinConfiguration34.getInterpreterRemoteRunnerPath();
        java.lang.String str41 = zeppelinConfiguration34.getUser();
        boolean b42 = zeppelinConfiguration34.isAnonymousAllowed();
        zeppelinConfiguration34.setThrowExceptionOnMissing(false);
        zeppelinConfiguration34.setBasePath("yarn-cache");
        zeppelinConfiguration0.append((org.apache.commons.configuration.Configuration) zeppelinConfiguration34);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(obj3);
        org.junit.Assert.assertTrue(i4 == 8080);
        org.junit.Assert.assertTrue(char5 == ' ');
        org.junit.Assert.assertNull(document9);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str13.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(properties22);
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ".//bin/interpreter.sh" + "'", str23.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str24 + "' != '" + "user" + "'", str24.equals("user"));
        org.junit.Assert.assertTrue(b25 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy30);
        org.junit.Assert.assertNotNull(properties39);
        org.junit.Assert.assertTrue("'" + str40 + "' != '" + ".//bin/interpreter.sh" + "'", str40.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str41 + "' != '" + "user" + "'", str41.equals("user"));
        org.junit.Assert.assertTrue(b42 == true);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test274");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        boolean b4 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration5 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration5.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo7 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration5);
        java.util.Properties properties9 = null;
        java.util.Properties properties10 = zeppelinConfiguration5.getProperties("bundles", properties9);
        java.lang.String str11 = zeppelinConfiguration5.getInterpreterRemoteRunnerPath();
        java.lang.String str12 = zeppelinConfiguration5.getUser();
        boolean b13 = zeppelinConfiguration5.isAnonymousAllowed();
        zeppelinConfiguration5.setThrowExceptionOnMissing(false);
        zeppelinConfiguration5.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy18 = zeppelinConfiguration5.getReloadingStrategy();
        zeppelinConfiguration0.setReloadingStrategy(reloadingStrategy18);
        java.lang.String str20 = zeppelinConfiguration0.getTrustStoreType();
        java.io.InputStream inputStream21 = null;
        try {
            zeppelinConfiguration0.load(inputStream21, "");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(properties10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//bin/interpreter.sh" + "'", str11.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "user" + "'", str12.equals("user"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy18);
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "JKS" + "'", str20.equals("JKS"));
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test275");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Object obj3 = zeppelinConfiguration0.getProperty("zeppelin");
        zeppelinConfiguration0.setValidating(true);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test276");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
        zeppelinhubClient2.stop();
        zeppelinhubClient2.start();
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat3);
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test277");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars11 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
        java.lang.String str12 = zeppelinConfiguration0.getRelativeDir(confVars11);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars13 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR;
        java.lang.String str14 = zeppelinConfiguration0.getRelativeDir(confVars13);
        java.lang.String str15 = zeppelinConfiguration0.getS3EncryptionMaterialsProviderClass();
        java.math.BigDecimal bigDecimal17 = null;
        java.math.BigDecimal bigDecimal18 = zeppelinConfiguration0.getBigDecimal("0.8.0-SNAPSHOT", bigDecimal17);
        java.lang.String str19 = zeppelinConfiguration0.getNotebookAuthorizationPath();
        org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo zeppelinHubRepo20 = new org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo(zeppelinConfiguration0);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".//0.0.0.0" + "'", str14.equals(".//0.0.0.0"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertNull(bigDecimal18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ".//conf/notebook-authorization.json" + "'", str19.equals(".//conf/notebook-authorization.json"));
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test278");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.lang.String str8 = zeppelinConfiguration0.getServerContextPath();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "/" + "'", str8.equals("/"));
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test279");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.net.URL uRL9 = null;
        zeppelinConfiguration0.setURL(uRL9);
        java.lang.String str11 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.String str12 = zeppelinConfiguration0.getInterpreterDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration13.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo15 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration13);
        boolean b16 = zeppelinConfiguration13.isEmpty();
        boolean b17 = zeppelinConfiguration13.isAutoSave();
        java.io.File file18 = null;
        java.io.File file19 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory20 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration13, file18, file19);
        java.lang.Boolean b21 = zeppelinConfiguration13.credentialsPersist();
        zeppelinConfiguration0.append((org.apache.commons.configuration.Configuration) zeppelinConfiguration13);
        java.lang.String str23 = zeppelinConfiguration0.getInterpreterLocalRepoPath();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//conf/interpreter-list" + "'", str11.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//interpreter" + "'", str12.equals(".//interpreter"));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + b21 + "' != '" + true + "'", b21.equals(true));
        org.junit.Assert.assertTrue("'" + str23 + "' != '" + ".//local-repo" + "'", str23.equals(".//local-repo"));
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test280");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        boolean b12 = zeppelinConfiguration0.isAutoSave();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration13.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo15 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration13);
        java.util.Properties properties17 = null;
        java.util.Properties properties18 = zeppelinConfiguration13.getProperties("bundles", properties17);
        java.lang.String str19 = zeppelinConfiguration13.getInterpreterRemoteRunnerPath();
        java.lang.String str20 = zeppelinConfiguration13.getUser();
        boolean b21 = zeppelinConfiguration0.removeErrorListener((org.apache.commons.configuration.event.ConfigurationErrorListener) zeppelinConfiguration13);
        java.lang.Short s24 = zeppelinConfiguration13.getShort("9b49838f-dc67-47f7-8ec6-fd89b914fc08", (java.lang.Short) (short) 1);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(properties18);
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ".//bin/interpreter.sh" + "'", str19.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str20 + "' != '" + "user" + "'", str20.equals("user"));
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + s24 + "' != '" + (short) 1 + "'", s24.equals((short) 1));
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test281");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = note0.getInfo();
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note0.setIndex(searchService8);
        org.apache.zeppelin.notebook.Paragraph paragraph10 = null;
        note0.addParagraph(paragraph10);
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(map_str_obj7);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test282");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b11 = zeppelinConfiguration0.isWindowsPath("~Trash");
        java.lang.String str12 = zeppelinConfiguration0.getMongoDatabase();
        org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo13 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo16 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision17 = gitNotebookRepo13.checkpoint(".//conf/helium.json", "", authenticationInfo16);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo19 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision20 = gitNotebookRepo13.revisionHistory("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", authenticationInfo19);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
        org.junit.Assert.assertNotNull(revision17);
        org.junit.Assert.assertNotNull(list_revision20);
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test283");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinHubOp("mongodb://localhost");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test284");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE;
        java.lang.String str8 = zeppelinConfiguration0.getString(confVars7);
        java.lang.Object obj10 = zeppelinConfiguration0.getProperty(".//conf");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_TYPE));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "JKS" + "'", str8.equals("JKS"));
        org.junit.Assert.assertNull(obj10);
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test285");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        org.xml.sax.EntityResolver entityResolver9 = zeppelinConfiguration0.getEntityResolver();
        java.lang.String str10 = zeppelinConfiguration0.getWebsocketMaxTextMessageSize();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(entityResolver9);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "1024000" + "'", str10.equals("1024000"));
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test286");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.net.URL uRL9 = null;
        zeppelinConfiguration0.setURL(uRL9);
        java.lang.String str11 = zeppelinConfiguration0.getInterpreterListPath();
        zeppelinConfiguration0.setThrowExceptionOnMissing(true);
        zeppelinConfiguration0.setPublicID(".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//conf/interpreter-list" + "'", str11.equals(".//conf/interpreter-list"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test287");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        org.apache.zeppelin.scheduler.Job job7 = null;
        org.apache.zeppelin.scheduler.Job.Status status8 = null;
        org.apache.zeppelin.scheduler.Job.Status status9 = null;
        note0.beforeStatusChange(job7, status8, status9);
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph11 = note0.getParagraphs();
        org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
        note0.addParagraph(paragraph12);
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(list_paragraph11);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test288");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        java.lang.String str4 = zeppelinConfiguration0.getKeyStorePath();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ".//conf/keystore" + "'", str4.equals(".//conf/keystore"));
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test289");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("~Trash");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        java.lang.String str3 = watcherMessage2.message;
        java.lang.String str4 = watcherMessage2.serialize();
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{\"noteId\":\"~Trash\"}" + "'", str4.equals("{\"noteId\":\"~Trash\"}"));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test290");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        org.apache.commons.configuration.HierarchicalConfiguration.Node node4 = zeppelinConfiguration1.getRoot();
        org.xml.sax.InputSource inputSource7 = zeppelinConfiguration1.resolveEntity("configuration", "helium.bundle.js");
        java.lang.String str8 = zeppelinConfiguration1.getBucketName();
        javax.xml.parsers.DocumentBuilder documentBuilder9 = zeppelinConfiguration1.getDocumentBuilder();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str11 = zeppelinConfiguration10.getHeliumRegistry();
        zeppelinConfiguration10.setRootElementName(" ");
        zeppelinConfiguration10.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b19 = zeppelinConfiguration10.getBoolean("src", true);
        boolean b20 = zeppelinConfiguration10.isDelimiterParsingDisabled();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration21 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str22 = zeppelinConfiguration21.getHeliumRegistry();
        java.lang.Boolean b23 = zeppelinConfiguration21.credentialsPersist();
        java.lang.Boolean b26 = zeppelinConfiguration21.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str27 = zeppelinConfiguration21.getInterpreterRemoteRunnerPath();
        java.lang.Object obj28 = zeppelinConfiguration21.clone();
        org.apache.commons.logging.Log log29 = zeppelinConfiguration21.getLogger();
        zeppelinConfiguration10.setLogger(log29);
        zeppelinConfiguration1.setLogger(log29);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertNull(inputSource7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "zeppelin" + "'", str8.equals("zeppelin"));
        org.junit.Assert.assertNull(documentBuilder9);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str11.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b19 == true);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + str22 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str22.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b23 + "' != '" + true + "'", b23.equals(true));
        org.junit.Assert.assertTrue("'" + b26 + "' != '" + false + "'", b26.equals(false));
        org.junit.Assert.assertTrue("'" + str27 + "' != '" + ".//bin/interpreter.sh" + "'", str27.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(obj28);
        org.junit.Assert.assertNotNull(log29);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test291");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        zeppelinConfiguration0.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy13 = zeppelinConfiguration0.getReloadingStrategy();
        boolean b14 = zeppelinConfiguration0.isNotebokPublic();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertTrue(b14 == true);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test292");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        folder1.rename("org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        java.util.List<org.apache.zeppelin.notebook.Note> list_note4 = folder1.getNotesRecursively();
        boolean b5 = folder1.isTrash();
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.Folder> map_str_folder6 = folder1.getChildren();
        org.junit.Assert.assertNotNull(list_note4);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(map_str_folder6);
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test293");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        java.lang.String str5 = zeppelinConfiguration1.getRelativeDir(".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + ".//.//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str5.equals(".//.//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test294");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration8.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo10 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration8);
        java.lang.String str11 = zeppelinConfiguration8.getTrustStoreType();
        boolean b12 = zeppelinConfiguration0.removeConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration8);
        java.lang.Boolean b15 = zeppelinConfiguration8.getBoolean("helium.bundle.js", (java.lang.Boolean) false);
        int i19 = zeppelinConfiguration8.getInt(".//conf/interpreter-list", "zeppelin.dep.localrepo", (int) '4');
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "JKS" + "'", str11.equals("JKS"));
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + false + "'", b15.equals(false));
        org.junit.Assert.assertTrue(i19 == 52);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test295");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket0.onWebSocketBinary(byte_array6, 10, (int) ' ');
        byte[] byte_array14 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        watcherWebsocket0.onWebSocketBinary(byte_array14, (int) (short) -1, (int) (byte) 0);
        org.eclipse.jetty.websocket.api.Session session18 = watcherWebsocket0.connection;
        try {
            watcherWebsocket0.onWebSocketText("zeppelin");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNull(session18);
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test296");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        org.apache.zeppelin.helium.HeliumPackage heliumPackage36 = null;
        java.io.File file38 = helium35.getBundle(heliumPackage36, true);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj40 = helium35.getPackagePersistedConfig("heliumBundles");
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNull(file38);
        org.junit.Assert.assertNotNull(map_str_obj40);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test297");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        boolean b2 = folderView0.hasFolder("b71190c4-a07f-4d06-8d2c-2a742dab6398");
        try {
            boolean b4 = folderView0.hasFolder("");
            org.junit.Assert.fail("Expected exception of type java.lang.StringIndexOutOfBoundsException");
        } catch (java.lang.StringIndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test298");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        org.apache.commons.configuration.tree.ExpressionEngine expressionEngine11 = zeppelinConfiguration0.getExpressionEngine();
        zeppelinConfiguration0.clearConfigurationListeners();
        java.io.InputStream inputStream13 = null;
        try {
            zeppelinConfiguration0.load(inputStream13);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(expressionEngine11);
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test299");
        org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving notebookAuthorizationInfoSaving0 = new org.apache.zeppelin.notebook.NotebookAuthorizationInfoSaving();
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Set<java.lang.String>>> map_str_map_str_set_str1 = null;
        notebookAuthorizationInfoSaving0.authInfo = map_str_map_str_set_str1;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.util.Set<java.lang.String>>> map_str_map_str_set_str3 = notebookAuthorizationInfoSaving0.authInfo;
        org.junit.Assert.assertNull(map_str_map_str_set_str3);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test300");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("~Trash");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        java.lang.String str3 = watcherMessage2.message;
        watcherMessage2.noteId = "2CJPAEGM3";
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test301");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.util.Set<java.lang.String> set_str2 = notebookAuthorization0.getReaders(".//0.0.0.0");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo6 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration4.isEmpty();
        boolean b8 = zeppelinConfiguration4.isAutoSave();
        java.lang.String[] str_array10 = zeppelinConfiguration4.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration11 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization12 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration11);
        java.lang.String[] str_array22 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str23, str_array22);
        notebookAuthorization12.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str23);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage27 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage27.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str30 = zeppelinhubMessage27.meta;
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder32 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("heliumBundles");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder34 = builder32.message(" ");
        zeppelinhubMessage27.data = builder34;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type36 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        zeppelinhubMessage27.op = type36;
        java.util.Map<java.lang.String, java.lang.String> map_str_str38 = zeppelinhubMessage27.meta;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage39 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage((java.lang.Object) str_array10, (java.lang.Object) linkedhashset_str23, map_str_str38);
        boolean b40 = notebookAuthorization0.isOwner("local_modules", (java.util.Set<java.lang.String>) linkedhashset_str23);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration42 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization43 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration42);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration45 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization46 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration45);
        java.lang.String[] str_array56 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str57 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b58 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str57, str_array56);
        notebookAuthorization46.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str57);
        notebookAuthorization43.setRoles("helium-bundle", (java.util.Set<java.lang.String>) linkedhashset_str57);
        notebookAuthorization0.setOwners(".//conf/notebook-authorization.json", (java.util.Set<java.lang.String>) linkedhashset_str57);
        boolean b62 = notebookAuthorization0.isPublic();
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(set_str2);
        org.junit.Assert.assertTrue(b7 == true);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(str_array10);
        org.junit.Assert.assertNotNull(notebookAuthorization12);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(zeppelinhubMessage27);
        org.junit.Assert.assertNull(map_str_str30);
        org.junit.Assert.assertNotNull(builder32);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertTrue("'" + type36 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type36.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNull(map_str_str38);
        org.junit.Assert.assertNotNull(zeppelinhubMessage39);
        org.junit.Assert.assertTrue(b40 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization43);
        org.junit.Assert.assertNotNull(notebookAuthorization46);
        org.junit.Assert.assertNotNull(str_array56);
        org.junit.Assert.assertTrue(b58 == true);
        org.junit.Assert.assertTrue(b62 == true);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test302");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision8 = s3NotebookRepo2.revisionHistory("zeppelin.dep.localrepo", authenticationInfo7);
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str10 = note9.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note12 = note9.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = note9.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        s3NotebookRepo2.updateSettings(map_str_str14, authenticationInfo15);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array19 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo20 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, interpreterInfo_array19);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp22 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array23 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency24 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, dependency_array23);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption26 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner28 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting29 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, (java.lang.Object) zeppelinHubOp22, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, interpreterOption26, "helium.bundle.js", interpreterRunner28);
        org.apache.zeppelin.notebook.Note note30 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str31 = note30.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note33 = note30.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str35 = note30.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting29.setInfos(map_str_str35);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo37 = null;
        s3NotebookRepo2.updateSettings(map_str_str35, authenticationInfo37);
        org.junit.Assert.assertNotNull(list_revision8);
        org.junit.Assert.assertNotNull(list_map_str_str10);
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNotNull(map_str_str14);
        org.junit.Assert.assertNotNull(interpreterInfo_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp22 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp22.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_map_str_str31);
        org.junit.Assert.assertNotNull(note33);
        org.junit.Assert.assertNotNull(map_str_str35);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test303");
        org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = new org.apache.zeppelin.ticket.TicketContainer();
        java.lang.String str2 = ticketContainer0.getTicket("");
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "76d07052-9b1b-46b9-ace4-b5dee20ef637" + "'", str2.equals("76d07052-9b1b-46b9-ace4-b5dee20ef637"));
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test304");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj6);
        interpreterInfo7.setName("~Trash");
        java.lang.String str10 = interpreterInfo7.getClassName();
        interpreterInfo7.setName("mongodb://localhost");
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "" + "'", str10.equals(""));
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test305");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getWebsocketMaxTextMessageSize();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars4 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_REMOTE_RUNNER;
        boolean b5 = zeppelinConfiguration0.getBoolean(confVars4);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1024000" + "'", str3.equals("1024000"));
        org.junit.Assert.assertTrue("'" + confVars4 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_REMOTE_RUNNER + "'", confVars4.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_REMOTE_RUNNER));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test306");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        boolean b2 = notebookAuthorization0.isPublic();
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertTrue(b2 == true);
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test307");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        note0.runAll();
        java.lang.String str3 = note0.getId();
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test308");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        zeppelinClient3.removeNoteConnection("load.js");
        zeppelinClient3.stop();
        zeppelinClient3.ping();
        zeppelinClient3.ping();
        org.junit.Assert.assertNotNull(zeppelinClient3);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test309");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        zeppelinConfiguration0.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy13 = zeppelinConfiguration0.getReloadingStrategy();
        java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration15 = zeppelinConfiguration0.configurationsAt("");
        java.lang.String str16 = zeppelinConfiguration0.getRootElementName();
        java.lang.String str17 = zeppelinConfiguration0.getEndpoint();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "configuration" + "'", str16.equals("configuration"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "s3.amazonaws.com" + "'", str17.equals("s3.amazonaws.com"));
    }

    @Test
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test311");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting1 = interpreterInfoSaving0.interpreterSettings;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str2 = interpreterInfoSaving0.interpreterBindings;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str3 = interpreterInfoSaving0.interpreterBindings;
        org.junit.Assert.assertNull(map_str_interpreterSetting1);
        org.junit.Assert.assertNull(map_str_list_str2);
        org.junit.Assert.assertNull(map_str_list_str3);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test312");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "mongodb://localhost");
        try {
            zeppelinhubRestApiHandler1.put("bundles", "X-Watcher-Key");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test313");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.String str3 = zeppelinConfiguration0.getPublicID();
        java.lang.String str4 = zeppelinConfiguration0.getUser();
        java.lang.String str5 = zeppelinConfiguration0.getKeyStoreType();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "user" + "'", str4.equals("user"));
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "JKS" + "'", str5.equals("JKS"));
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test314");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
        float f8 = zeppelinConfiguration0.getFloat(confVars7);
        java.math.BigDecimal bigDecimal10 = null;
        java.math.BigDecimal bigDecimal11 = zeppelinConfiguration0.getBigDecimal("mongodb://localhost", bigDecimal10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
        org.junit.Assert.assertTrue(f8 == (-1.0f));
        org.junit.Assert.assertNull(bigDecimal11);
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test315");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "mongodb://localhost");
        try {
            java.lang.String str7 = zeppelinhubRestApiHandler1.putWithResponseBody(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo", "mongodb://localhost", "conf");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test316");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        zeppelinConfiguration0.reload();
        byte byte10 = zeppelinConfiguration0.getByte("{\"op\":\"LIVE\",\"data\":{\"token\":\"hi!\"},\"meta\":{}}", (byte) 10);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(byte10 == (byte) 10);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test317");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array3 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo4 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo4, interpreterInfo_array3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array7 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency8 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency8, dependency_array7);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption10 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner12 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting13 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo4, (java.lang.Object) zeppelinHubOp6, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency8, interpreterOption10, "helium.bundle.js", interpreterRunner12);
        org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str15 = note14.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note17 = note14.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str19 = note14.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting13.setInfos(map_str_str19);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arraylist_map_str_str21 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>>();
        boolean b22 = arraylist_map_str_str21.add(map_str_str19);
        notebookRepoSettingsInfo0.value = arraylist_map_str_str21;
        java.lang.String str24 = notebookRepoSettingsInfo0.selected;
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str25 = notebookRepoSettingsInfo0.value;
        notebookRepoSettingsInfo0.selected = "";
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNotNull(interpreterInfo_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp6 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp6.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(list_map_str_str15);
        org.junit.Assert.assertNotNull(note17);
        org.junit.Assert.assertNotNull(map_str_str19);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNull(str24);
        org.junit.Assert.assertNotNull(list_map_str_str25);
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test318");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance(".//conf/interpreter-list");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket2 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array8 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket2.onWebSocketBinary(byte_array8, 10, (int) ' ');
        zeppelinhubWebsocket1.onWebSocketBinary(byte_array8, 12, (int) '4');
        zeppelinhubWebsocket1.onWebSocketClose(4, ".//conf/.//conf/keystore");
        java.lang.Throwable throwable18 = null;
        zeppelinhubWebsocket1.onWebSocketError(throwable18);
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
        org.junit.Assert.assertNotNull(byte_array8);
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test319");
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo6 = new org.apache.zeppelin.notebook.NoteInfo("src", "X-Watcher-Key", map_str_obj5);
        java.lang.String str7 = noteInfo6.getId();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj8 = noteInfo6.getConfig();
        noteInfo6.setName("local_modules");
        org.junit.Assert.assertNotNull(map_str_obj5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "src" + "'", str7.equals("src"));
        org.junit.Assert.assertNotNull(map_str_obj8);
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test320");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getConfDir();
        boolean b7 = zeppelinConfiguration0.isAutoSave();
        zeppelinConfiguration0.setEncoding("0.8.0-SNAPSHOT");
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "conf" + "'", str6.equals("conf"));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test321");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = null;
        note0.setConfig(map_str_obj7);
        org.apache.zeppelin.notebook.Paragraph paragraph9 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage11 = null;
        note0.onOutputUpdate(paragraph9, (int) '#', interpreterResultMessage11);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj13 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job14 = null;
        org.apache.zeppelin.scheduler.Job.Status status15 = null;
        org.apache.zeppelin.scheduler.Job.Status status16 = null;
        note0.afterStatusChange(job14, status15, status16);
        try {
            java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion21 = note0.completion("X-Watcher-Key", "bundles", 8443);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(map_str_obj13);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test322");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        note0.moveParagraph("heliumBundles", (int) (short) 10);
        try {
            java.lang.String str10 = note0.getFolderId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test323");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        int i1 = folderView0.countFolders();
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.scheduler.Job job6 = null;
        note2.onProgressUpdate(job6, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = null;
        note2.setConfig(map_str_obj9);
        org.apache.zeppelin.notebook.Folder folder11 = folderView0.getFolderOf(note2);
        folderView0.clear();
        org.apache.zeppelin.notebook.Note note13 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str14 = note13.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note16 = note13.getUserNote("heliumBundles");
        boolean b17 = note16.isPersonalizedMode();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo19 = null;
        note16.persist((-1), authenticationInfo19);
        org.apache.zeppelin.notebook.Paragraph paragraph21 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage23 = null;
        note16.onOutputUpdate(paragraph21, (int) (byte) -1, interpreterResultMessage23);
        boolean b25 = folderView0.hasNote(note16);
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertNotNull(map_str_obj5);
        org.junit.Assert.assertNull(folder11);
        org.junit.Assert.assertNotNull(list_map_str_str14);
        org.junit.Assert.assertNotNull(note16);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue(b25 == false);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test324");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision8 = s3NotebookRepo2.revisionHistory("zeppelin.dep.localrepo", authenticationInfo7);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array14 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo15 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b16 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, interpreterInfo_array14);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp17 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array18 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency19 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b20 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency19, dependency_array18);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption21 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner23 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting24 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, (java.lang.Object) zeppelinHubOp17, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency19, interpreterOption21, "helium.bundle.js", interpreterRunner23);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type25 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array28 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo29 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo29, interpreterInfo_array28);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp31 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array32 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency33 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency33, dependency_array32);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption35 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner37 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting38 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo29, (java.lang.Object) zeppelinHubOp31, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency33, interpreterOption35, "helium.bundle.js", interpreterRunner37);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency39 = interpreterSetting38.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption40 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner42 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting43 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo15, (java.lang.Object) type25, list_dependency39, interpreterOption40, "local_modules", interpreterRunner42);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting44 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting43);
        java.util.Map<java.lang.String, java.lang.String> map_str_str45 = interpreterSetting43.getInfos();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration46 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str47 = zeppelinConfiguration46.getHeliumRegistry();
        java.lang.Boolean b48 = zeppelinConfiguration46.credentialsPersist();
        org.w3c.dom.Document document49 = zeppelinConfiguration46.getDocument();
        java.lang.String str50 = zeppelinConfiguration46.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo51 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration46);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo52 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo53 = mongoNotebookRepo51.getSettings(authenticationInfo52);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration54 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration54.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo56 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration54);
        java.util.Map<java.lang.String, java.lang.String> map_str_str57 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo58 = null;
        s3NotebookRepo56.updateSettings(map_str_str57, authenticationInfo58);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo61 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision62 = s3NotebookRepo56.revisionHistory("zeppelin.dep.localrepo", authenticationInfo61);
        org.apache.zeppelin.notebook.Note note63 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str64 = note63.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note66 = note63.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str68 = note63.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo69 = null;
        s3NotebookRepo56.updateSettings(map_str_str68, authenticationInfo69);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo71 = null;
        mongoNotebookRepo51.updateSettings(map_str_str68, authenticationInfo71);
        interpreterSetting43.setInfos(map_str_str68);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo74 = null;
        s3NotebookRepo2.updateSettings(map_str_str68, authenticationInfo74);
        s3NotebookRepo2.close();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo79 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision80 = s3NotebookRepo2.checkpoint("org.apache.zeppelin.notebook.repo.GitNotebookRepo", "", authenticationInfo79);
        s3NotebookRepo2.close();
        org.junit.Assert.assertNotNull(list_revision8);
        org.junit.Assert.assertNotNull(interpreterInfo_array14);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp17 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp17.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array18);
        org.junit.Assert.assertTrue(b20 == false);
        org.junit.Assert.assertTrue("'" + type25 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type25.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array28);
        org.junit.Assert.assertTrue(b30 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp31 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp31.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array32);
        org.junit.Assert.assertTrue(b34 == false);
        org.junit.Assert.assertNotNull(list_dependency39);
        org.junit.Assert.assertNull(map_str_str45);
        org.junit.Assert.assertTrue("'" + str47 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str47.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b48 + "' != '" + true + "'", b48.equals(true));
        org.junit.Assert.assertNull(document49);
        org.junit.Assert.assertTrue("'" + str50 + "' != '" + "s3.amazonaws.com" + "'", str50.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo53);
        org.junit.Assert.assertNotNull(list_revision62);
        org.junit.Assert.assertNotNull(list_map_str_str64);
        org.junit.Assert.assertNotNull(note66);
        org.junit.Assert.assertNotNull(map_str_str68);
        org.junit.Assert.assertNotNull(revision80);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test325");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook1 = null;
        heliumApplicationFactory0.setNotebook(notebook1);
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        heliumApplicationFactory0.unload(paragraph3, "X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        note6.addParagraph(paragraph7);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note6.getInfo();
        boolean b10 = note6.isNameEmpty();
        heliumApplicationFactory0.onNoteRemove(note6);
        try {
            java.lang.String str12 = note6.getNameWithoutPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj9);
        org.junit.Assert.assertTrue(b10 == true);
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test326");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        java.lang.String str1 = instance0.token;
        int i2 = instance0.id;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test327");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars11 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
        java.lang.String str12 = zeppelinConfiguration0.getRelativeDir(confVars11);
        java.lang.String str13 = zeppelinConfiguration0.getInterpreterSettingPath();
        java.io.Reader reader14 = null;
        try {
            zeppelinConfiguration0.load(reader14);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ".//conf/interpreter.json" + "'", str13.equals(".//conf/interpreter.json"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test328");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        java.lang.String str7 = zeppelinConfiguration0.getRootElementName();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration10.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo12 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration10);
        boolean b13 = zeppelinConfiguration10.isEmpty();
        boolean b14 = zeppelinConfiguration10.isAutoSave();
        java.io.File file15 = null;
        java.io.File file16 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory17 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration10, file15, file16);
        java.io.File file19 = heliumBundleFactory17.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration20 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration20.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo22 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration20);
        boolean b23 = zeppelinConfiguration20.isEmpty();
        boolean b24 = zeppelinConfiguration20.isAutoSave();
        java.io.File file25 = null;
        java.io.File file26 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory27 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration20, file25, file26);
        java.io.File file29 = heliumBundleFactory27.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory30 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph31 = null;
        heliumApplicationFactory30.unload(paragraph31, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory34 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note35 = null;
        heliumApplicationFactory34.onNoteRemove(note35);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory37 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph38 = null;
        heliumApplicationFactory37.run(paragraph38, "local_modules");
        heliumApplicationFactory34.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory37);
        heliumApplicationFactory30.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory34);
        org.apache.zeppelin.helium.Helium helium43 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file19, heliumBundleFactory27, heliumApplicationFactory34);
        zeppelinConfiguration0.setFile(file19);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "configuration" + "'", str7.equals("configuration"));
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(file19);
        org.junit.Assert.assertTrue(b23 == true);
        org.junit.Assert.assertTrue(b24 == false);
        org.junit.Assert.assertNotNull(file29);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test329");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
        org.eclipse.jetty.websocket.api.Session session1 = null;
        watcherWebsocket0.connection = session1;
        watcherWebsocket0.onWebSocketClose(10, "anonymous");
        watcherWebsocket0.onWebSocketClose(11, "load.js");
        org.junit.Assert.assertNotNull(watcherWebsocket0);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test330");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_UPDATE_OUTPUT));
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test331");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = note0.getInfo();
        org.apache.zeppelin.search.SearchService searchService8 = null;
        note0.setIndex(searchService8);
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo(note0);
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(map_str_obj7);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test332");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PATH;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PATH + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PATH));
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test333");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium("yarn-cache", ".//conf/interpreter.json", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage36 = helium35.getBundlePackagesToBundle();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(list_heliumPackage36);
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test334");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        int i7 = zeppelinClient3.countConnectedNotes();
        zeppelinClient3.ping();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat5);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test335");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory22 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        heliumApplicationFactory22.unload(paragraph23, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory26 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note27 = null;
        heliumApplicationFactory26.onNoteRemove(note27);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory29 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph30 = null;
        heliumApplicationFactory29.run(paragraph30, "local_modules");
        heliumApplicationFactory26.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory29);
        heliumApplicationFactory22.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory26);
        org.apache.zeppelin.helium.Helium helium35 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file11, heliumBundleFactory19, heliumApplicationFactory26);
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj36 = helium35.getAllPackageConfig();
        try {
            org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult38 = helium35.getEnabledPackageInfo(".//conf/notebook-authorization.json");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(map_str_map_str_obj36);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test336");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        int i9 = zeppelinConfiguration0.getInt("conf", (int) ' ');
        zeppelinConfiguration0.setEncoding(".//bin/interpreter.sh");
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue(i9 == 32);
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test337");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.String str7 = zeppelinConfiguration0.getRootElementName();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//conf/interpreter-list" + "'", str6.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "configuration" + "'", str7.equals("configuration"));
    }

    @Test
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test338");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("heliumBundles");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.subject("conf");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder5 = builder3.message("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test339");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.io.File file9 = heliumBundleFactory7.getHeliumPackageDirectory("~Trash");
        java.io.File file11 = heliumBundleFactory7.getHeliumPackageBundleCache(".//conf/interpreter-list");
        com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory frontendPluginFactory12 = null;
        try {
            heliumBundleFactory7.installNodeModules(frontendPluginFactory12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNotNull(file11);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test340");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        float f11 = zeppelinConfiguration0.getFloat("load.js", (float) (byte) 0);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration15 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration15.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo17 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration15);
        boolean b18 = zeppelinConfiguration15.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration19 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration19.clear();
        zeppelinConfiguration15.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration19);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars22 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC;
        float f23 = zeppelinConfiguration15.getFloat(confVars22);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client24 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", "load.js", "", zeppelinConfiguration15);
        zeppelinConfiguration0.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration15);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertTrue(f11 == 0.0f);
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertTrue("'" + confVars22 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars22.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
        org.junit.Assert.assertTrue(f23 == (-1.0f));
        org.junit.Assert.assertNotNull(client24);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test341");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "mongodb://localhost");
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = userTokenContainer3.getAllUserTokens();
        java.util.List<java.lang.String> list_str5 = userTokenContainer3.getAllTokens();
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
        org.junit.Assert.assertNotNull(map_str_str4);
        org.junit.Assert.assertNotNull(list_str5);
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test342");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        zeppelinConfiguration1.clearConfigurationListeners();
        java.lang.String str5 = zeppelinConfiguration1.getShiroPath();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "" + "'", str5.equals(""));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test343");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b9 = zeppelinConfiguration0.getBoolean("src", true);
        boolean b10 = zeppelinConfiguration0.isDelimiterParsingDisabled();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration11 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str12 = zeppelinConfiguration11.getHeliumRegistry();
        java.lang.Boolean b13 = zeppelinConfiguration11.credentialsPersist();
        java.lang.Boolean b16 = zeppelinConfiguration11.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str17 = zeppelinConfiguration11.getInterpreterRemoteRunnerPath();
        java.lang.Object obj18 = zeppelinConfiguration11.clone();
        org.apache.commons.logging.Log log19 = zeppelinConfiguration11.getLogger();
        zeppelinConfiguration0.setLogger(log19);
        zeppelinConfiguration0.setBasePath(".//conf/interpreter-list");
        java.io.File file23 = zeppelinConfiguration0.getFile();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str12.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b13 + "' != '" + true + "'", b13.equals(true));
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + false + "'", b16.equals(false));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + ".//bin/interpreter.sh" + "'", str17.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(obj18);
        org.junit.Assert.assertNotNull(log19);
        org.junit.Assert.assertNull(file23);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test344");
        try {
            org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLoginRoutine("X-Watcher-Key");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test345");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("~Trash");
        org.apache.zeppelin.notebook.socket.WatcherMessage watcherMessage2 = builder1.build();
        java.lang.String str3 = watcherMessage2.message;
        watcherMessage2.message = "{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}";
        org.junit.Assert.assertNotNull(watcherMessage2);
        org.junit.Assert.assertNull(str3);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test346");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.String str3 = zeppelinConfiguration0.getRelativeDir("org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        java.math.BigInteger bigInteger5 = zeppelinConfiguration0.getBigInteger(".//conf/interpreter-list");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str3.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertNull(bigInteger5);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test347");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        boolean b7 = note0.isPersonalizedMode();
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph8 = note0.getParagraphs();
        org.apache.zeppelin.notebook.Paragraph paragraph9 = note0.getLastParagraph();
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_paragraph8);
        org.junit.Assert.assertNull(paragraph9);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test348");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getInterpreterSettingPath();
        int i4 = zeppelinConfiguration0.getServerSslPort();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + ".//conf/interpreter.json" + "'", str3.equals(".//conf/interpreter.json"));
        org.junit.Assert.assertTrue(i4 == 8443);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test349");
        org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = org.apache.zeppelin.ticket.TicketContainer.instance;
        java.lang.String str2 = ticketContainer0.getTicket("2CHF9171K");
        boolean b5 = ticketContainer0.isValid("interpreter-setting.json", "load.js");
        boolean b8 = ticketContainer0.isValid(".//interpreter", "X-Watcher-Key");
        org.junit.Assert.assertNotNull(ticketContainer0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9b49838f-dc67-47f7-8ec6-fd89b914fc08" + "'", str2.equals("9b49838f-dc67-47f7-8ec6-fd89b914fc08"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test350");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        int i7 = zeppelinClient3.countConnectedNotes();
        zeppelinClient3.start();
        zeppelinClient3.stop();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat5);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat6);
        org.junit.Assert.assertTrue(i7 == 0);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test351");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note0.isPersonalizedMode();
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        note0.onOutputAppend(paragraph5, 12, "org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        try {
            boolean b9 = note0.isNameEmpty();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test352");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        java.lang.String str7 = zeppelinConfiguration0.getNotebookDir();
        long long10 = zeppelinConfiguration0.getLong("heliumBundles", (long) '#');
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "notebook" + "'", str7.equals("notebook"));
        org.junit.Assert.assertTrue(long10 == 35L);
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test353");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array5 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo6 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b7 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, interpreterInfo_array5);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp8 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array9 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency10 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, dependency_array9);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption12 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner14 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting15 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) zeppelinHubOp8, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency10, interpreterOption12, "helium.bundle.js", interpreterRunner14);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type16 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array19 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo20 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, interpreterInfo_array19);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp22 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array23 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency24 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b25 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, dependency_array23);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption26 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner28 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting29 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo20, (java.lang.Object) zeppelinHubOp22, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency24, interpreterOption26, "helium.bundle.js", interpreterRunner28);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency30 = interpreterSetting29.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption31 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner33 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting34 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo6, (java.lang.Object) type16, list_dependency30, interpreterOption31, "local_modules", interpreterRunner33);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting35 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting34);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array38 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo39 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b40 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo39, interpreterInfo_array38);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp41 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array42 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency43 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency43, dependency_array42);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption45 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner47 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting48 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo39, (java.lang.Object) zeppelinHubOp41, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency43, interpreterOption45, "helium.bundle.js", interpreterRunner47);
        org.apache.zeppelin.notebook.Note note49 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str50 = note49.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note52 = note49.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str54 = note49.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting48.setInfos(map_str_str54);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array58 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo59 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b60 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo59, interpreterInfo_array58);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp61 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array62 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency63 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency63, dependency_array62);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption65 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner67 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting68 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo59, (java.lang.Object) zeppelinHubOp61, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency63, interpreterOption65, "helium.bundle.js", interpreterRunner67);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency69 = interpreterSetting68.getDependencies();
        interpreterSetting48.setDependencies(list_dependency69);
        interpreterSetting35.setDependencies(list_dependency69);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency72 = interpreterSetting35.getDependencies();
        java.lang.String str73 = interpreterSetting35.getId();
        org.junit.Assert.assertNotNull(interpreterInfo_array5);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp8 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp8.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + type16 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type16.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp22 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp22.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array23);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(list_dependency30);
        org.junit.Assert.assertNotNull(interpreterInfo_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp41 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp41.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(list_map_str_str50);
        org.junit.Assert.assertNotNull(note52);
        org.junit.Assert.assertNotNull(map_str_str54);
        org.junit.Assert.assertNotNull(interpreterInfo_array58);
        org.junit.Assert.assertTrue(b60 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp61 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp61.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(list_dependency69);
        org.junit.Assert.assertNotNull(list_dependency72);
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + "2CMW6DG21" + "'", str73.equals("2CMW6DG21"));
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test354");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        org.apache.commons.configuration.HierarchicalConfiguration.Node node4 = zeppelinConfiguration1.getRoot();
        boolean b5 = zeppelinConfiguration1.isThrowExceptionOnMissing();
        zeppelinConfiguration1.clear();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertNotNull(node4);
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test355");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i1 = confVars0.getIntValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i1 == (-1));
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test356");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}");
        java.lang.String str2 = zeppelinWebsocket1.noteId;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket4 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        java.lang.Throwable throwable5 = null;
        zeppelinWebsocket4.onWebSocketError(throwable5);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket7 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket8 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array14 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket8.onWebSocketBinary(byte_array14, 10, (int) ' ');
        watcherWebsocket7.onWebSocketBinary(byte_array14, (int) (short) 0, 100);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket21 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array27 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket21.onWebSocketBinary(byte_array27, 10, (int) ' ');
        byte[] byte_array35 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        watcherWebsocket21.onWebSocketBinary(byte_array35, (int) (short) -1, (int) (byte) 0);
        watcherWebsocket7.onWebSocketBinary(byte_array35, (int) (short) 100, (int) (short) -1);
        zeppelinWebsocket4.onWebSocketBinary(byte_array35, 1, (int) '4');
        zeppelinWebsocket1.onWebSocketBinary(byte_array35, 100, 0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}" + "'", str2.equals("{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}"));
        org.junit.Assert.assertNotNull(byte_array14);
        org.junit.Assert.assertNotNull(byte_array27);
        org.junit.Assert.assertNotNull(byte_array35);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test357");
        org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp(".//conf/interpreter.json");
        org.junit.Assert.assertNull(oP1);
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test358");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration12.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo14 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration12);
        boolean b15 = zeppelinConfiguration12.isEmpty();
        boolean b16 = zeppelinConfiguration12.isAutoSave();
        java.io.File file17 = null;
        java.io.File file18 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory19 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration12, file17, file18);
        java.io.File file21 = heliumBundleFactory19.getHeliumPackageDirectory("~Trash");
        java.io.File file23 = heliumBundleFactory19.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory24 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph25 = null;
        heliumApplicationFactory24.run(paragraph25, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type32 = null;
        heliumApplicationFactory24.onOutputUpdated("zeppelin", "hi!", 0, "", type32, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage38 = null;
        heliumApplicationFactory24.onLoad(" ", ".//conf/.//conf/keystore", "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", heliumPackage38);
        org.apache.zeppelin.helium.Helium helium40 = new org.apache.zeppelin.helium.Helium("yarn-cache", "bundles", file11, heliumBundleFactory19, heliumApplicationFactory24);
        org.apache.zeppelin.helium.HeliumPackage heliumPackage41 = null;
        java.io.File file43 = helium40.getBundle(heliumPackage41, true);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory44 = helium40.getApplicationFactory();
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNull(file43);
        org.junit.Assert.assertNotNull(heliumApplicationFactory44);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test359");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.lang.Boolean b9 = zeppelinConfiguration0.credentialsPersist();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + true + "'", b9.equals(true));
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test360");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getConfDir();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str8 = zeppelinConfiguration7.getHeliumRegistry();
        java.lang.Boolean b9 = zeppelinConfiguration7.credentialsPersist();
        java.lang.String str10 = zeppelinConfiguration7.getPublicID();
        java.lang.String str11 = zeppelinConfiguration7.getConfDir();
        zeppelinConfiguration0.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration7);
        java.lang.Byte byte15 = zeppelinConfiguration0.getByte("{\"noteId\":\"~Trash\"}", (java.lang.Byte) (byte) 0);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "conf" + "'", str6.equals("conf"));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str8.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b9 + "' != '" + true + "'", b9.equals(true));
        org.junit.Assert.assertNull(str10);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "conf" + "'", str11.equals("conf"));
        org.junit.Assert.assertTrue("'" + byte15 + "' != '" + (byte) 0 + "'", byte15.equals((byte) 0));
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test361");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        zeppelinhubClient2.start();
        zeppelinhubClient2.initUser("b71190c4-a07f-4d06-8d2c-2a742dab6398");
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test362");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision8 = s3NotebookRepo2.revisionHistory("zeppelin.dep.localrepo", authenticationInfo7);
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str10 = note9.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note12 = note9.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = note9.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        s3NotebookRepo2.updateSettings(map_str_str14, authenticationInfo15);
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory17 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager18 = null;
        org.apache.zeppelin.notebook.JobListenerFactory jobListenerFactory19 = null;
        org.apache.zeppelin.search.LuceneSearch luceneSearch20 = new org.apache.zeppelin.search.LuceneSearch();
        org.apache.zeppelin.user.Credentials credentials21 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration24 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration24.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo26 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration24);
        boolean b27 = zeppelinConfiguration24.isEmpty();
        boolean b28 = zeppelinConfiguration24.isAutoSave();
        java.io.File file29 = null;
        java.io.File file30 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory31 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration24, file29, file30);
        java.io.File file33 = heliumBundleFactory31.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration34 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration34.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo36 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration34);
        boolean b37 = zeppelinConfiguration34.isEmpty();
        boolean b38 = zeppelinConfiguration34.isAutoSave();
        java.io.File file39 = null;
        java.io.File file40 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory41 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration34, file39, file40);
        java.io.File file43 = heliumBundleFactory41.getHeliumPackageDirectory("~Trash");
        java.io.File file45 = heliumBundleFactory41.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory46 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph47 = null;
        heliumApplicationFactory46.run(paragraph47, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type54 = null;
        heliumApplicationFactory46.onOutputUpdated("zeppelin", "hi!", 0, "", type54, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage60 = null;
        heliumApplicationFactory46.onLoad(" ", ".//conf/.//conf/keystore", "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", heliumPackage60);
        org.apache.zeppelin.helium.Helium helium62 = new org.apache.zeppelin.helium.Helium("yarn-cache", "bundles", file33, heliumBundleFactory41, heliumApplicationFactory46);
        org.apache.zeppelin.notebook.Note note63 = new org.apache.zeppelin.notebook.Note((org.apache.zeppelin.notebook.repo.NotebookRepo) s3NotebookRepo2, interpreterFactory17, interpreterSettingManager18, jobListenerFactory19, (org.apache.zeppelin.search.SearchService) luceneSearch20, credentials21, (org.apache.zeppelin.notebook.NoteEventListener) heliumApplicationFactory46);
        luceneSearch20.close();
        org.apache.zeppelin.notebook.Note note65 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str66 = note65.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note68 = note65.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str70 = note65.generateSingleParagraphInfo(".//conf/interpreter-list");
        try {
            luceneSearch20.addIndexDoc(note65);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_revision8);
        org.junit.Assert.assertNotNull(list_map_str_str10);
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNotNull(map_str_str14);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertTrue(b28 == false);
        org.junit.Assert.assertNotNull(file33);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == false);
        org.junit.Assert.assertNotNull(file43);
        org.junit.Assert.assertNotNull(file45);
        org.junit.Assert.assertNotNull(list_map_str_str66);
        org.junit.Assert.assertNotNull(note68);
        org.junit.Assert.assertNotNull(map_str_str70);
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test363");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
        zeppelinhubClient2.stop();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat3);
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat5);
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test364");
        org.apache.zeppelin.notebook.FolderView folderView0 = new org.apache.zeppelin.notebook.FolderView();
        boolean b2 = folderView0.hasFolder("b71190c4-a07f-4d06-8d2c-2a742dab6398");
        boolean b4 = folderView0.hasFolder("~Trash");
        org.junit.Assert.assertTrue(b2 == false);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test365");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder3 = builder1.className("heliumBundles");
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test366");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.unload(paragraph1, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory4 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note5 = null;
        heliumApplicationFactory4.onNoteRemove(note5);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory7 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
        heliumApplicationFactory7.run(paragraph8, "local_modules");
        heliumApplicationFactory4.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory7);
        heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory4);
        org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
        heliumApplicationFactory0.onParagraphCreate(paragraph13);
        org.apache.zeppelin.interpreter.InterpreterResult.Type type19 = null;
        heliumApplicationFactory0.onOutputUpdated("2CHF9171K", "X-Watcher-Key", (int) '4', "X-Zeppelin-Token", type19, "user");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage22 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph23 = null;
        try {
            java.lang.String str24 = heliumApplicationFactory0.loadAndRun(heliumPackage22, paragraph23);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest1.test367");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        org.apache.zeppelin.notebook.FolderView folderView2 = new org.apache.zeppelin.notebook.FolderView();
        int i3 = folderView2.countFolders();
        org.apache.zeppelin.notebook.Folder folder5 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        int i6 = folder5.countNotes();
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.Folder> map_str_folder7 = folder5.getChildren();
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory8 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook9 = null;
        heliumApplicationFactory8.setNotebook(notebook9);
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        heliumApplicationFactory8.unload(paragraph11, "X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note14 = new org.apache.zeppelin.notebook.Note();
        heliumApplicationFactory8.onNoteCreate(note14);
        folder5.addNote(note14);
        folderView2.removeNote(note14);
        folder1.removeNote(note14);
        org.junit.Assert.assertTrue(i3 == 0);
        org.junit.Assert.assertTrue(i6 == 0);
        org.junit.Assert.assertNotNull(map_str_folder7);
    }
}

