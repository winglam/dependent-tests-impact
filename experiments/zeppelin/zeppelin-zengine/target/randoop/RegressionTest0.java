import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

    public static boolean debug = false;

    @Test
    public void test001() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test001");
        java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLE;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "helium.bundle.js" + "'", str0.equals("helium.bundle.js"));
    }

    @Test
    public void test002() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test002");
        java.lang.Throwable throwable0 = null;
        java.lang.String str1 = org.apache.zeppelin.scheduler.Job.getStack(throwable0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test003() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test003");
        org.apache.zeppelin.util.Util util0 = new org.apache.zeppelin.util.Util();
    }

    @Test
    public void test004() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test004");
        int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_CLEAR;
        org.junit.Assert.assertTrue(i0 == 4);
    }

    @Test
    public void test005() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test005");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.FOLDER_RENAME));
    }

    @Test
    public void test006() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test006");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SAVE_INTERPRETER_BINDINGS));
    }

    @Test
    public void test007() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test007");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SET_NOTE_REVISION));
    }

    @Test
    public void test008() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test008");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEY_MANAGER_PASSWORD;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEY_MANAGER_PASSWORD + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEY_MANAGER_PASSWORD));
    }

    @Test
    public void test009() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test009");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COMMIT_PARAGRAPH));
    }

    @Test
    public void test010() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test010");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.APP_STATUS_CHANGE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_STATUS_CHANGE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_STATUS_CHANGE));
    }

    @Test
    public void test011() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test011");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_PUBLIC;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_PUBLIC + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_PUBLIC));
    }

    @Test
    public void test012() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test012");
        java.net.URL uRL0 = null;
        try {
            org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration(uRL0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test013() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test013");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_UPDATED));
    }

    @Test
    public void test014() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test014");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_EXECUTED_BY_SPELL));
    }

    @Test
    public void test015() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test015");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo1 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test016() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test016");
        org.apache.commons.configuration.AbstractConfiguration.setDelimiter(' ');
    }

    @Test
    public void test017() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test017");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.UNSUBSCRIBE_UPDATE_NOTE_JOBS));
    }

    @Test
    public void test018() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test018");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo1 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test019() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test019");
        java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_SRC_DIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "src" + "'", str0.equals("src"));
    }

    @Test
    public void test020() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test020");
        int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_ADD_PROPERTY;
        org.junit.Assert.assertTrue(i0 == 1);
    }

    @Test
    public void test021() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test021");
        java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.HttpProxyClient.ZEPPELIN_TOKEN_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token" + "'", str0.equals("X-Zeppelin-Token"));
    }

    @Test
    public void test022() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test022");
        java.net.URI uRI0 = null;
        try {
            org.apache.zeppelin.notebook.repo.zeppelinhub.rest.HttpProxyClient httpProxyClient1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.HttpProxyClient.newInstance(uRI0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test023() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test023");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PATH;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PATH + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PATH));
    }

    @Test
    public void test024() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test024");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
        int i1 = confVars0.getIntValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue(i1 == (-1));
    }

    @Test
    public void test025() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test025");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.getInstance();
        org.junit.Assert.assertNull(client0);
    }

    @Test
    public void test026() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test026");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DIR;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DIR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DIR));
    }

    @Test
    public void test027() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test027");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO;
        float f1 = confVars0.getFloatValue();
        java.lang.String str2 = confVars0.getVarName();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO));
        org.junit.Assert.assertTrue(f1 == (-1.0f));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "zeppelin.dep.localrepo" + "'", str2.equals("zeppelin.dep.localrepo"));
    }

    @Test
    public void test028() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test028");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NEW_NOTE));
    }

    @Test
    public void test029() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test029");
        java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("src");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "src" + "'", str1.equals("src"));
    }

    @Test
    public void test030() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test030");
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status0 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY + "'", status0.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY));
    }

    @Test
    public void test031() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test031");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo1 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test032() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test032");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.lang.String str1 = notebookRepoSettingsInfo0.selected;
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test033() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test033");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_REGISTRY;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_REGISTRY + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_REGISTRY));
    }

    @Test
    public void test034() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test034");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        instance0.name = "helium.bundle.js";
    }

    @Test
    public void test035() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test035");
        java.lang.String str0 = org.apache.zeppelin.util.WatcherSecurityKey.HTTP_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Watcher-Key" + "'", str0.equals("X-Watcher-Key"));
    }

    @Test
    public void test036() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test036");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.NotebookRepoSync notebookRepoSync1 = new org.apache.zeppelin.notebook.repo.NotebookRepoSync(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test037() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test037");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAS_INFO));
    }

    @Test
    public void test038() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test038");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        java.io.File file1 = null;
        java.io.File file2 = null;
        try {
            org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory3 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file1, file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test039() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test039");
        java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.YARN_CACHE_DIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "yarn-cache" + "'", str0.equals("yarn-cache"));
    }

    @Test
    public void test040() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test040");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PROGRESS));
    }

    @Test
    public void test041() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test041");
        char char0 = org.apache.commons.configuration.AbstractConfiguration.getDelimiter();
        org.junit.Assert.assertTrue(char0 == ' ');
    }

    @Test
    public void test042() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test042");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient0);
        try {
            zeppelinHubHeartbeat1.run();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat1);
    }

    @Test
    public void test043() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test043");
        int i0 = org.apache.commons.configuration.AbstractConfiguration.EVENT_CLEAR_PROPERTY;
        org.junit.Assert.assertTrue(i0 == 2);
    }

    @Test
    public void test044() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test044");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PONG));
    }

    @Test
    public void test045() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test045");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_USER;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_USER + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_USER));
    }

    @Test
    public void test046() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test046");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_ID;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_ID + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_ID));
    }

    @Test
    public void test047() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test047");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN_HIDE));
    }

    @Test
    public void test048() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test048");
        org.apache.zeppelin.notebook.Note note0 = null;
        try {
            org.apache.zeppelin.notebook.NoteInfo noteInfo1 = new org.apache.zeppelin.notebook.NoteInfo(note0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test049() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test049");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.APP_LOAD;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_LOAD + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_LOAD));
    }

    @Test
    public void test050() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test050");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH));
    }

    @Test
    public void test051() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test051");
        java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_VAR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "heliumBundles" + "'", str0.equals("heliumBundles"));
    }

    @Test
    public void test052() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test052");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.getInstance();
        org.junit.Assert.assertNull(zeppelinhubClient0);
    }

    @Test
    public void test053() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test053");
        java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_LOCAL_MODULE_DIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "local_modules" + "'", str0.equals("local_modules"));
    }

    @Test
    public void test054() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test054");
        org.apache.commons.configuration.AbstractConfiguration.setDelimiter('a');
    }

    @Test
    public void test055() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test055");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO;
        java.lang.Class class1 = confVars0.getVarClass();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO));
        org.junit.Assert.assertNotNull(class1);
    }

    @Test
    public void test056() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test056");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinHubOp("zeppelin.dep.localrepo");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test057() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test057");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo zeppelinHubRepo1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test058() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test058");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getScriptBody("local_modules");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "local_modules" + "'", str1.equals("local_modules"));
    }

    @Test
    public void test059() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test059");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTES));
    }

    @Test
    public void test060() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test060");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_ALL_PARAGRAPHS));
    }

    @Test
    public void test061() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test061");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.APP_UPDATE_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_UPDATE_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_UPDATE_OUTPUT));
    }

    @Test
    public void test062() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test062");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL));
    }

    @Test
    public void test063() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test063");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.eclipse.jetty.websocket.api.Session session1 = null;
        try {
            watcherWebsocket0.onWebSocketConnect(session1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test064() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test064");
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status0 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES + "'", status0.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.DOWNLOADING_DEPENDENCIES));
    }

    @Test
    public void test065() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test065");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message4 = null;
        try {
            zeppelinClient3.send(message4, "src");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
    }

    @Test
    public void test066() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test066");
        java.io.File file2 = null;
        try {
            org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry3 = new org.apache.zeppelin.helium.HeliumOnlineRegistry("heliumBundles", "", file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test067() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test067");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer userSessionContainer0 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer.instance;
        org.junit.Assert.assertNotNull(userSessionContainer0);
    }

    @Test
    public void test068() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test068");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.DEL_NOTE));
    }

    @Test
    public void test069() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test069");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.WATCHER;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.WATCHER + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.WATCHER));
    }

    @Test
    public void test070() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test070");
        org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.js", "hi!");
        java.lang.String str3 = heliumLocalRegistry2.uri();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "hi!" + "'", str3.equals("hi!"));
    }

    @Test
    public void test071() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test071");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_CONNECT_TIMEOUT;
        boolean b1 = confVars0.getBooleanValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_CONNECT_TIMEOUT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_CONNECT_TIMEOUT));
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test072() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test072");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_DEFAULT_DIR_ALLOWED;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_DEFAULT_DIR_ALLOWED + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_DEFAULT_DIR_ALLOWED));
    }

    @Test
    public void test073() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test073");
        java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_DIR;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "bundles" + "'", str0.equals("bundles"));
    }

    @Test
    public void test074() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test074");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_UPDATE_NOTE_JOBS));
    }

    @Test
    public void test075() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test075");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ENCODING;
        long long1 = confVars0.getLongValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ENCODING + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ENCODING));
        org.junit.Assert.assertTrue(long1 == (-1L));
    }

    @Test
    public void test076() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test076");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        npmPackage0.version = "hi!";
    }

    @Test
    public void test077() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test077");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage1.op = "helium.bundle.js";
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars4 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO;
        zeppelinhubMessage1.op = confVars4;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertTrue("'" + confVars4 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO + "'", confVars4.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO));
    }

    @Test
    public void test078() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test078");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_NOTE_TO_TRASH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_NOTE_TO_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_NOTE_TO_TRASH));
    }

    @Test
    public void test079() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test079");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVE));
    }

    @Test
    public void test080() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test080");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        try {
            org.apache.zeppelin.notebook.repo.GitNotebookRepo gitNotebookRepo1 = new org.apache.zeppelin.notebook.repo.GitNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test081() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test081");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.IMPORT_NOTE));
    }

    @Test
    public void test082() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test082");
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
        try {
            java.lang.String str11 = note6.getFolderId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj9);
    }

    @Test
    public void test083() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test083");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication2 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("bundles", zeppelinConfiguration1);
        org.junit.Assert.assertNull(authentication2);
    }

    @Test
    public void test084() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test084");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.EMPTY;
        org.junit.Assert.assertNotNull(zeppelinhubMessage0);
    }

    @Test
    public void test085() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test085");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.deadMessage("bundles");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}"));
    }

    @Test
    public void test086() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test086");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.ERROR;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.ERROR + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.ERROR));
    }

    @Test
    public void test087() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test087");
        java.lang.String str0 = org.apache.zeppelin.notebook.Folder.TRASH_FOLDER_CONFLICT_INFIX;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + " " + "'", str0.equals(" "));
    }

    @Test
    public void test088() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test088");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils zeppelinhubUtils0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils();
    }

    @Test
    public void test089() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test089");
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
        org.apache.zeppelin.helium.HeliumPackage heliumPackage11 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph12 = null;
        try {
            java.lang.String str13 = heliumApplicationFactory0.loadAndRun(heliumPackage11, paragraph12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj9);
    }

    @Test
    public void test090() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test090");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CHECKPOINT_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CHECKPOINT_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CHECKPOINT_NOTE));
    }

    @Test
    public void test091() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test091");
        java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId("yarn-cache");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "yarn-cache" + "'", str1.equals("yarn-cache"));
    }

    @Test
    public void test092() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test092");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_SETTINGS));
    }

    @Test
    public void test093() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test093");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INSERT_PARAGRAPH));
    }

    @Test
    public void test094() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test094");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        try {
            zeppelinConfiguration0.save();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
    }

    @Test
    public void test095() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test095");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy7 = null;
        try {
            zeppelinConfiguration0.setReloadingStrategy(reloadingStrategy7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test096() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test096");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo1 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo2 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] notebookRepoSettingsInfo_array3 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] { notebookRepoSettingsInfo1, notebookRepoSettingsInfo2 };
        java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> arraylist_notebookRepoSettingsInfo4 = new java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>) arraylist_notebookRepoSettingsInfo4, notebookRepoSettingsInfo_array3);
        notebookRepoWithSettings0.settings = arraylist_notebookRepoSettingsInfo4;
        boolean b7 = notebookRepoWithSettings0.isEmpty();
        org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo1);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo2);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo_array3);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b7 == true);
    }

    @Test
    public void test097() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test097");
        int i0 = org.apache.commons.configuration.HierarchicalConfiguration.EVENT_CLEAR_TREE;
        org.junit.Assert.assertTrue(i0 == 10);
    }

    @Test
    public void test098() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test098");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE_REVISION;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE_REVISION + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE_REVISION));
    }

    @Test
    public void test099() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test099");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HOME;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HOME + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HOME));
    }

    @Test
    public void test100() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test100");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_REVISION_HISTORY));
    }

    @Test
    public void test101() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test101");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting2 = interpreterInfoSaving0.interpreterSettings;
        org.junit.Assert.assertNull(map_str_list_str1);
        org.junit.Assert.assertNull(map_str_interpreterSetting2);
    }

    @Test
    public void test102() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test102");
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
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency35 = interpreterSetting34.getDependencies();
        java.lang.String str36 = interpreterSetting34.getGroup();
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
        org.junit.Assert.assertNotNull(list_dependency35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "zeppelin.dep.localrepo" + "'", str36.equals("zeppelin.dep.localrepo"));
    }

    @Test
    public void test103() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test103");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo6 = null;
        try {
            s3NotebookRepo2.save(note3, authenticationInfo6);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test104() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test104");
        java.lang.String str0 = org.apache.zeppelin.notebook.Folder.TRASH_FOLDER_ID;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "~Trash" + "'", str0.equals("~Trash"));
    }

    @Test
    public void test105() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test105");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.REMOVE_FOLDER));
    }

    @Test
    public void test106() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test106");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinHubOp("");
        org.junit.Assert.assertNull(zeppelinHubOp1);
    }

    @Test
    public void test107() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test107");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.WELCOME));
    }

    @Test
    public void test108() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test108");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_NOTE_JOBS));
    }

    @Test
    public void test109() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test109");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo8 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph9 = note0.insertNewParagraph(2, authenticationInfo8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test110() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test110");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo3 = null;
        try {
            java.util.List<org.apache.zeppelin.notebook.NoteInfo> list_noteInfo4 = s3NotebookRepo2.list(authenticationInfo3);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test111() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test111");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.unload(paragraph1, "zeppelin.dep.localrepo");
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        try {
            org.apache.zeppelin.notebook.ApplicationState applicationState6 = heliumApplicationFactory0.get(paragraph4, "yarn-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test112() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test112");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        try {
            boolean b8 = zeppelinConfiguration4.getBoolean(".//helium,https://s3.amazonaws.com/helium-package/helium.json");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test113() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test113");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_NPM_REGISTRY;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_NPM_REGISTRY + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_HELIUM_NPM_REGISTRY));
    }

    @Test
    public void test114() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test114");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_ENDPOINT;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_ENDPOINT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_ENDPOINT));
    }

    @Test
    public void test115() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test115");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.EDITOR_SETTING;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.EDITOR_SETTING + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.EDITOR_SETTING));
    }

    @Test
    public void test116() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test116");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.LOADED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.LOADED + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.LOADED));
    }

    @Test
    public void test117() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test117");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.getInstance();
        schedulerService0.close();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration4);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient5);
        try {
            schedulerService0.addOnce((java.lang.Runnable) zeppelinHeartbeat6, (int) (short) -1);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
        } catch (java.util.concurrent.RejectedExecutionException e) {
        }
        org.junit.Assert.assertNotNull(schedulerService0);
        org.junit.Assert.assertNotNull(zeppelinClient5);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat6);
    }

    @Test
    public void test118() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test118");
        int i0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.getMaxNoteSize();
        org.junit.Assert.assertTrue(i0 == 67108864);
    }

    @Test
    public void test119() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test119");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.String str2 = zeppelinConfiguration0.getMongoDatabase();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "zeppelin" + "'", str2.equals("zeppelin"));
    }

    @Test
    public void test120() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test120");
        try {
            org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("zeppelin.dep.localrepo", "zeppelin", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
    }

    @Test
    public void test121() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test121");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration3.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo5 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration3);
        boolean b6 = zeppelinConfiguration3.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration7 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration7.clear();
        zeppelinConfiguration3.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration7);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfigurationKeyPredicate configurationKeyPredicate10 = null;
        try {
            java.util.Map<java.lang.String, java.lang.String> map_str_str11 = zeppelinConfiguration0.dumpConfigurations(zeppelinConfiguration7, configurationKeyPredicate10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue(b6 == true);
    }

    @Test
    public void test122() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test122");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        try {
            float f9 = zeppelinConfiguration0.getFloat("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
    }

    @Test
    public void test123() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test123");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        try {
            org.eclipse.jetty.websocket.api.Session session8 = zeppelinClient3.getZeppelinConnection("zeppelin.dep.localrepo", " ", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
    }

    @Test
    public void test124() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test124");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN;
        org.junit.Assert.assertTrue("'" + type0 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN + "'", type0.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.DROPDOWN));
    }

    @Test
    public void test125() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test125");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        zeppelinhubClient2.start();
        try {
            zeppelinhubClient2.send("hi!", "yarn-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
    }

    @Test
    public void test126() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test126");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer userSessionContainer0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer();
        java.lang.String str3 = userSessionContainer0.setSession("heliumBundles", "");
        java.lang.String str6 = userSessionContainer0.setSession("X-Watcher-Key", "");
        java.lang.String str8 = userSessionContainer0.getSession("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "" + "'", str6.equals(""));
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test127() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test127");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_CREDENTIALS_PERSIST));
    }

    @Test
    public void test128() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test128");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getScriptBody("hi!");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "hi!" + "'", str1.equals("hi!"));
    }

    @Test
    public void test129() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test129");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_USER;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_USER + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_USER));
    }

    @Test
    public void test130() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test130");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_BINDINGS));
    }

    @Test
    public void test131() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test131");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = note0.getInfo();
        try {
            java.lang.String str8 = note0.getFolderId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(map_str_obj7);
    }

    @Test
    public void test132() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test132");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        java.lang.Float f6 = zeppelinConfiguration0.getFloat("X-Zeppelin-Token", (java.lang.Float) 0.0f);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + f6 + "' != '" + 0.0f + "'", f6.equals(0.0f));
    }

    @Test
    public void test133() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test133");
        java.lang.String str0 = org.apache.zeppelin.util.Util.getVersion();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "0.8.0-SNAPSHOT" + "'", str0.equals("0.8.0-SNAPSHOT"));
    }

    @Test
    public void test134() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test134");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.MOVE_PARAGRAPH));
    }

    @Test
    public void test135() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test135");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str2 = null;
        interpreterInfoSaving0.interpreterBindings = map_str_list_str2;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str4 = interpreterInfoSaving0.interpreterBindings;
        org.junit.Assert.assertNull(map_str_list_str1);
        org.junit.Assert.assertNull(map_str_list_str4);
    }

    @Test
    public void test136() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test136");
        int i0 = org.apache.commons.configuration.HierarchicalConfiguration.EVENT_SUBNODE_CHANGED;
        org.junit.Assert.assertTrue(i0 == 12);
    }

    @Test
    public void test137() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test137");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.INTERPRETER_BINDINGS));
    }

    @Test
    public void test138() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test138");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo5 = null;
        org.apache.zeppelin.notebook.Note note6 = s3NotebookRepo2.get(".//helium,https://s3.amazonaws.com/helium-package/helium.json", ".//conf/interpreter-list", authenticationInfo5);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo8 = null;
        try {
            s3NotebookRepo2.remove("yarn-cache", authenticationInfo8);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNull(note6);
    }

    @Test
    public void test139() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test139");
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
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo12 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph13 = note0.addNewParagraph(authenticationInfo12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNotNull(list_paragraph11);
    }

    @Test
    public void test140() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test140");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note3.isPersonalizedMode();
        try {
            note3.moveParagraph("configuration", 4, true);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test141() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test141");
        java.lang.String str0 = org.apache.zeppelin.helium.HeliumBundleFactory.HELIUM_BUNDLES_SRC;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "load.js" + "'", str0.equals("load.js"));
    }

    @Test
    public void test142() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test142");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.commons.configuration.tree.ConfigurationNode configurationNode7 = null;
        try {
            zeppelinConfiguration4.setRootNode(configurationNode7);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test143() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test143");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.clearProperty("zeppelin");
        try {
            float f5 = zeppelinConfiguration0.getFloat("heliumBundles");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test144() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test144");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket0.onWebSocketBinary(byte_array6, 10, (int) ' ');
        org.eclipse.jetty.websocket.api.Session session10 = null;
        try {
            watcherWebsocket0.onWebSocketConnect(session10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array6);
    }

    @Test
    public void test145() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test145");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        java.lang.String str7 = zeppelinConfiguration0.getHeliumRegistry();
        java.io.File file8 = null;
        try {
            zeppelinConfiguration0.save(file8);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str7.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test146() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test146");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_URI;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_URI + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_URI));
    }

    @Test
    public void test147() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test147");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_PASSWORD));
    }

    @Test
    public void test148() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test148");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_NOTE));
    }

    @Test
    public void test149() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test149");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_PORT;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_PORT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_PORT));
    }

    @Test
    public void test150() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test150");
        try {
            org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("~Trash", "hi!", "yarn-cache");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test151() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test151");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        zeppelinConfiguration0.setThrowExceptionOnMissing(true);
        java.io.OutputStream outputStream7 = null;
        try {
            zeppelinConfiguration0.save(outputStream7);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test152() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test152");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.create(0);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str4 = zeppelinConfiguration3.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication5 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration3);
        try {
            schedulerService1.addOnce((java.lang.Runnable) authentication5, (-1));
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
        } catch (java.util.concurrent.RejectedExecutionException e) {
        }
        org.junit.Assert.assertNotNull(schedulerService1);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(authentication5);
    }

    @Test
    public void test153() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test153");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.pingMessage("src");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}"));
    }

    @Test
    public void test154() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test154");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.getInstance();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient4);
        try {
            schedulerService0.addOnce((java.lang.Runnable) zeppelinHeartbeat5, (int) (byte) -1);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
        } catch (java.util.concurrent.RejectedExecutionException e) {
        }
        org.junit.Assert.assertNotNull(schedulerService0);
        org.junit.Assert.assertNotNull(zeppelinClient4);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat5);
    }

    @Test
    public void test155() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test155");
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
        try {
            note6.moveParagraph("", (int) (short) 0, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj9);
    }

    @Test
    public void test156() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test156");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_BIND;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_BIND + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_BIND));
    }

    @Test
    public void test157() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test157");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_UPDATE));
    }

    @Test
    public void test158() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test158");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETERS;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETERS + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETERS));
    }

    @Test
    public void test159() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test159");
        java.io.File file0 = null;
        java.io.File file1 = null;
        try {
            java.util.List<java.lang.String> list_str2 = org.apache.zeppelin.helium.HeliumBundleFactory.unTgz(file0, file1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test160() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test160");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = null;
        interpreterSetting0.setOption(interpreterOption1);
        java.lang.Object obj3 = interpreterSetting0.getProperties();
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test161() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test161");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.unload(paragraph1, "zeppelin.dep.localrepo");
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        try {
            org.apache.zeppelin.notebook.ApplicationState applicationState6 = heliumApplicationFactory0.get(paragraph4, "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test162() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test162");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        try {
            org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration5 = zeppelinConfiguration0.configurationAt("yarn-cache", false);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
    }

    @Test
    public void test163() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test163");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        java.lang.Object obj2 = zeppelinhubMessage1.op;
        java.lang.Object obj3 = zeppelinhubMessage1.data;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertTrue("'" + obj2 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO + "'", obj2.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_DEP_LOCALREPO));
        org.junit.Assert.assertNull(obj3);
    }

    @Test
    public void test164() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test164");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.Note note1 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str2 = note1.generateParagraphsInfo();
        notebookRepoSettingsInfo0.value = list_map_str_str2;
        java.lang.String str4 = notebookRepoSettingsInfo0.selected;
        org.junit.Assert.assertNotNull(list_map_str_str2);
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test165() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test165");
        int i0 = org.apache.commons.configuration.HierarchicalConfiguration.EVENT_ADD_NODES;
        org.junit.Assert.assertTrue(i0 == 11);
    }

    @Test
    public void test166() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test166");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
        try {
            s3NotebookRepo2.remove("helium.bundle.js", authenticationInfo7);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test167() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test167");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_BUCKET;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_BUCKET + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_BUCKET));
    }

    @Test
    public void test168() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test168");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_COLLECTION;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_COLLECTION + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_COLLECTION));
    }

    @Test
    public void test169() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test169");
        org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo", "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}");
    }

    @Test
    public void test170() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test170");
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
        org.apache.commons.configuration.HierarchicalConfiguration.setDefaultExpressionEngine(expressionEngine11);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(expressionEngine11);
    }

    @Test
    public void test171() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test171");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.getInstance();
        schedulerService0.close();
        schedulerService0.close();
        org.junit.Assert.assertNotNull(schedulerService0);
    }

    @Test
    public void test172() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test172");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_CLIENT_UNBIND));
    }

    @Test
    public void test173() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test173");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinHubOp("yarn-cache");
        org.junit.Assert.assertNull(zeppelinHubOp1);
    }

    @Test
    public void test174() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test174");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj6);
        interpreterInfo7.setName("notebook");
        org.junit.Assert.assertNotNull(map_str_obj6);
    }

    @Test
    public void test175() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test175");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PASSWORD;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PASSWORD + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_KEYSTORE_PASSWORD));
    }

    @Test
    public void test176() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test176");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.APP_APPEND_OUTPUT));
    }

    @Test
    public void test177() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test177");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        org.apache.commons.configuration.Configuration configuration7 = zeppelinConfiguration0.interpolatedConfiguration();
        java.io.Writer writer8 = null;
        try {
            zeppelinConfiguration0.save(writer8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(configuration7);
    }

    @Test
    public void test178() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test178");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_REGION;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_REGION + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_KMS_KEY_REGION));
    }

    @Test
    public void test179() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test179");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE;
        java.lang.String str1 = confVars0.getStringValue();
        float f2 = confVars0.getFloatValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str1.equals("org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue(f2 == (-1.0f));
    }

    @Test
    public void test180() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test180");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        try {
            java.lang.String str4 = note0.getFolderId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test181() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test181");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ANGULAR_OBJECT_REMOVE));
    }

    @Test
    public void test182() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test182");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        java.util.Map<java.lang.String, java.net.URL> map_str_uRL11 = zeppelinConfiguration0.getRegisteredEntities();
        org.apache.commons.configuration.event.ConfigurationEvent configurationEvent12 = null;
        try {
            zeppelinConfiguration0.configurationChanged(configurationEvent12);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(map_str_uRL11);
    }

    @Test
    public void test183() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test183");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.LOADING;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.LOADING + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.LOADING));
    }

    @Test
    public void test184() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test184");
        java.lang.String str0 = org.apache.zeppelin.util.WatcherSecurityKey.getKey();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4" + "'", str0.equals("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4"));
    }

    @Test
    public void test185() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test185");
        java.lang.String str1 = org.apache.zeppelin.notebook.Folder.normalizeFolderId(".//conf/interpreter.json");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "./conf/interpreter.json" + "'", str1.equals("./conf/interpreter.json"));
    }

    @Test
    public void test186() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test186");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.setAutoSave(false);
        try {
            org.apache.zeppelin.notebook.repo.AzureNotebookRepo azureNotebookRepo4 = new org.apache.zeppelin.notebook.repo.AzureNotebookRepo(zeppelinConfiguration0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
    }

    @Test
    public void test187() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test187");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinOp(".//conf/interpreter-list");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test188() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test188");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.eclipse.jetty.websocket.api.Session session1 = watcherWebsocket0.connection;
        org.junit.Assert.assertNull(session1);
    }

    @Test
    public void test189() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test189");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE;
        boolean b1 = confVars0.getBooleanValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WEBSOCKET_MAX_TEXT_MESSAGE_SIZE));
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test190() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test190");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization3 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b4 = notebookAuthorization3.isPublic();
        java.lang.String[] str_array12 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str13 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str13, str_array12);
        notebookAuthorization3.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str13);
        boolean b16 = notebookAuthorization0.isWriter("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", (java.util.Set<java.lang.String>) linkedhashset_str13);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration17 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization18 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration17);
        java.lang.String[] str_array28 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str29 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b30 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str29, str_array28);
        notebookAuthorization18.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str29);
        java.util.Set<java.lang.String> set_str33 = notebookAuthorization18.getOwners("load.js");
        boolean b35 = notebookAuthorization0.hasWriteAuthorization(set_str33, "org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization3);
        org.junit.Assert.assertTrue(b4 == true);
        org.junit.Assert.assertNotNull(str_array12);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization18);
        org.junit.Assert.assertNotNull(str_array28);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(set_str33);
        org.junit.Assert.assertTrue(b35 == true);
    }

    @Test
    public void test191() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test191");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo7 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision8 = s3NotebookRepo2.revisionHistory("zeppelin.dep.localrepo", authenticationInfo7);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo10 = null;
        try {
            s3NotebookRepo2.remove("src", authenticationInfo10);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(list_revision8);
    }

    @Test
    public void test192() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test192");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        org.apache.zeppelin.helium.HeliumPackage heliumPackage8 = null;
        java.lang.String[] str_array14 = new java.lang.String[] { "conf", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "JKS", ".//conf/interpreter.json", "X-Zeppelin-Token" };
        java.io.File file15 = null;
        com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory frontendPluginFactory18 = null;
        try {
            java.lang.String str19 = heliumBundleFactory7.downloadPackage(heliumPackage8, str_array14, file15, "conf", "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", frontendPluginFactory18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array14);
    }

    @Test
    public void test193() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test193");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        java.lang.String str1 = instance0.token;
        instance0.id = 100;
        instance0.id = (short) 10;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test194() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test194");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook1 = null;
        heliumApplicationFactory0.setNotebook(notebook1);
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        heliumApplicationFactory0.unload(paragraph3, "X-Watcher-Key");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory6 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        heliumApplicationFactory6.unload(paragraph7, "zeppelin.dep.localrepo");
        org.apache.zeppelin.notebook.Notebook notebook10 = null;
        heliumApplicationFactory6.setNotebook(notebook10);
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
        note12.addParagraph(paragraph13);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj15 = note12.getInfo();
        heliumApplicationFactory6.onNoteRemove(note12);
        heliumApplicationFactory0.onNoteCreate(note12);
        org.junit.Assert.assertNotNull(map_str_obj15);
    }

    @Test
    public void test195() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test195");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setFileName("zeppelin");
        java.io.File file4 = null;
        try {
            zeppelinConfiguration0.save(file4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test196() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test196");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.AUTH_INFO));
    }

    @Test
    public void test197() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test197");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        try {
            double d10 = zeppelinConfiguration0.getDouble("s3.amazonaws.com");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
    }

    @Test
    public void test198() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test198");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook1 = null;
        heliumApplicationFactory0.setNotebook(notebook1);
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        heliumApplicationFactory0.unload(paragraph3, "X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
        heliumApplicationFactory0.onNoteCreate(note6);
        java.lang.String str8 = note6.getName();
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test199() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test199");
        java.io.File file2 = null;
        try {
            org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry3 = new org.apache.zeppelin.helium.HeliumOnlineRegistry("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "conf", file2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test200() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test200");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        try {
            zeppelinhubRestApiHandler1.del("yarn-cache", "heliumBundles");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test201() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test201");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        try {
            org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration8 = zeppelinConfiguration0.configurationAt("./conf/interpreter.json");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
    }

    @Test
    public void test202() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test202");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        try {
            java.lang.String str5 = zeppelinhubRestApiHandler1.putWithResponseBody("helium.bundle.js", "conf", "");
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
    }

    @Test
    public void test203() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test203");
        org.apache.zeppelin.helium.HeliumPackageSuggestion heliumPackageSuggestion0 = new org.apache.zeppelin.helium.HeliumPackageSuggestion();
        org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult1 = null;
        heliumPackageSuggestion0.addAvailablePackage(heliumPackageSearchResult1);
    }

    @Test
    public void test204() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test204");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.String str2 = zeppelinConfiguration0.getBasePath();
        java.io.Reader reader3 = null;
        try {
            zeppelinConfiguration0.load(reader3);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test205() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test205");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        java.lang.String str1 = instance0.token;
        instance0.id = 100;
        instance0.name = "hi!";
        java.lang.String str6 = instance0.token;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertNull(str6);
    }

    @Test
    public void test206() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test206");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message4 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = message4.data;
        try {
            zeppelinClient3.send(message4, "X-Zeppelin-Token");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(message4);
        org.junit.Assert.assertNotNull(map_str_obj5);
    }

    @Test
    public void test207() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test207");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.builder("notebook");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test208() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test208");
        org.apache.commons.configuration.AbstractConfiguration.setDefaultListDelimiter('#');
    }

    @Test
    public void test209() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test209");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        java.lang.Object obj2 = zeppelinhubMessage1.data;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNull(obj2);
    }

    @Test
    public void test210() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test210");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getTrustStoreType();
        java.net.URL uRL4 = null;
        try {
            zeppelinConfiguration0.save(uRL4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JKS" + "'", str3.equals("JKS"));
    }

    @Test
    public void test211() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test211");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook4 = null;
        heliumApplicationFactory3.setNotebook(notebook4);
        heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
        org.apache.zeppelin.notebook.Notebook notebook7 = heliumApplicationFactory3.getNotebook();
        org.junit.Assert.assertNull(notebook7);
    }

    @Test
    public void test212() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test212");
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
        java.lang.String str11 = zeppelinConfiguration0.getWebsocketMaxTextMessageSize();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_str8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "1024000" + "'", str11.equals("1024000"));
    }

    @Test
    public void test213() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test213");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.util.Set<java.lang.String> set_str3 = notebookAuthorization0.getRoles("zeppelin.dep.localrepo");
        java.lang.String[] str_array20 = new java.lang.String[] { "heliumBundles", "heliumBundles", "yarn-cache", "heliumBundles", "", "zeppelin.dep.localrepo", "hi!", "hi!", "~Trash", "heliumBundles", "~Trash", "yarn-cache", ".//bin/interpreter.sh", "", "helium.bundle.js" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        notebookAuthorization0.setReaders("hi!", (java.util.Set<java.lang.String>) linkedhashset_str21);
        java.util.Set<java.lang.String> set_str25 = notebookAuthorization0.getRoles(" ");
        java.util.Set<java.lang.String> set_str27 = null;
        try {
            notebookAuthorization0.setOwners("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", set_str27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(set_str3);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set_str25);
    }

    @Test
    public void test214() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test214");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = null;
        note0.setConfig(map_str_obj7);
        org.apache.zeppelin.user.Credentials credentials9 = note0.getCredentials();
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph11 = note0.getParagraph("zeppelin");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test215() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test215");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph3 = note0.getParagraphs();
        try {
            boolean b4 = note0.isTrash();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_paragraph3);
    }

    @Test
    public void test216() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test216");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        zeppelinConfiguration0.setSystemID("zeppelin");
        try {
            int i7 = zeppelinConfiguration0.getInt(".//conf/.//conf/keystore");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNull(document3);
    }

    @Test
    public void test217() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test217");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING;
        org.junit.Assert.assertTrue("'" + zeppelinHubOp0 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING + "'", zeppelinHubOp0.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.PING));
    }

    @Test
    public void test218() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test218");
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
        java.io.File file15 = zeppelinConfiguration0.getFile();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(long13 == 1L);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNull(file15);
    }

    @Test
    public void test219() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test219");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        zeppelinConfiguration0.setThrowExceptionOnMissing(false);
        org.apache.commons.configuration.event.ConfigurationErrorEvent configurationErrorEvent11 = null;
        try {
            zeppelinConfiguration0.configurationError(configurationErrorEvent11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
    }

    @Test
    public void test220() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test220");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
        notebookRepoWithSettings0.name = "helium.bundle.js";
        notebookRepoWithSettings0.name = "";
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo5 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array8 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo9 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b10 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo9, interpreterInfo_array8);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp11 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array12 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency13 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b14 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency13, dependency_array12);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption15 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner17 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting18 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo9, (java.lang.Object) zeppelinHubOp11, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency13, interpreterOption15, "helium.bundle.js", interpreterRunner17);
        org.apache.zeppelin.notebook.Note note19 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str20 = note19.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note22 = note19.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str24 = note19.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting18.setInfos(map_str_str24);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arraylist_map_str_str26 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>>();
        boolean b27 = arraylist_map_str_str26.add(map_str_str24);
        notebookRepoSettingsInfo5.value = arraylist_map_str_str26;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type29 = notebookRepoSettingsInfo5.type;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo30 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo31 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str32 = notebookRepoSettingsInfo31.value;
        java.lang.String str33 = notebookRepoSettingsInfo31.selected;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo34 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo35 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
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
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arraylist_map_str_str56 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>>();
        boolean b57 = arraylist_map_str_str56.add(map_str_str54);
        notebookRepoSettingsInfo35.value = arraylist_map_str_str56;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type59 = notebookRepoSettingsInfo35.type;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo60 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.lang.String str61 = notebookRepoSettingsInfo60.selected;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo62 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo63 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array66 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo67 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo67, interpreterInfo_array66);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp69 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array70 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency71 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b72 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency71, dependency_array70);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption73 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner75 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting76 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo67, (java.lang.Object) zeppelinHubOp69, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency71, interpreterOption73, "helium.bundle.js", interpreterRunner75);
        org.apache.zeppelin.notebook.Note note77 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str78 = note77.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note80 = note77.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str82 = note77.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting76.setInfos(map_str_str82);
        java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>> arraylist_map_str_str84 = new java.util.ArrayList<java.util.Map<java.lang.String, java.lang.String>>();
        boolean b85 = arraylist_map_str_str84.add(map_str_str82);
        notebookRepoSettingsInfo63.value = arraylist_map_str_str84;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type87 = notebookRepoSettingsInfo63.type;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] notebookRepoSettingsInfo_array88 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] { notebookRepoSettingsInfo5, notebookRepoSettingsInfo30, notebookRepoSettingsInfo31, notebookRepoSettingsInfo34, notebookRepoSettingsInfo35, notebookRepoSettingsInfo60, notebookRepoSettingsInfo62, notebookRepoSettingsInfo63 };
        java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> arraylist_notebookRepoSettingsInfo89 = new java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>();
        boolean b90 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>) arraylist_notebookRepoSettingsInfo89, notebookRepoSettingsInfo_array88);
        notebookRepoWithSettings0.settings = arraylist_notebookRepoSettingsInfo89;
        org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo5);
        org.junit.Assert.assertNotNull(interpreterInfo_array8);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp11 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp11.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertNotNull(list_map_str_str20);
        org.junit.Assert.assertNotNull(note22);
        org.junit.Assert.assertNotNull(map_str_str24);
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNull(type29);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo30);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo31);
        org.junit.Assert.assertNull(list_map_str_str32);
        org.junit.Assert.assertNull(str33);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo35);
        org.junit.Assert.assertNotNull(interpreterInfo_array38);
        org.junit.Assert.assertTrue(b40 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp41 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp41.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array42);
        org.junit.Assert.assertTrue(b44 == false);
        org.junit.Assert.assertNotNull(list_map_str_str50);
        org.junit.Assert.assertNotNull(note52);
        org.junit.Assert.assertNotNull(map_str_str54);
        org.junit.Assert.assertTrue(b57 == true);
        org.junit.Assert.assertNull(type59);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo60);
        org.junit.Assert.assertNull(str61);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo63);
        org.junit.Assert.assertNotNull(interpreterInfo_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp69 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp69.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array70);
        org.junit.Assert.assertTrue(b72 == false);
        org.junit.Assert.assertNotNull(list_map_str_str78);
        org.junit.Assert.assertNotNull(note80);
        org.junit.Assert.assertNotNull(map_str_str82);
        org.junit.Assert.assertTrue(b85 == true);
        org.junit.Assert.assertNull(type87);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo_array88);
        org.junit.Assert.assertTrue(b90 == true);
    }

    @Test
    public void test221() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test221");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADING;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADING + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADING));
    }

    @Test
    public void test222() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test222");
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
        interpreterSetting34.clearNoteIdAndParaMap();
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
    }

    @Test
    public void test223() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test223");
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
        try {
            boolean b12 = note0.isLastParagraph("src");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test224() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test224");
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.scheduler.Job job6 = null;
        note2.onProgressUpdate(job6, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note2.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo10 = new org.apache.zeppelin.notebook.NoteInfo("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "", map_str_obj9);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj11 = noteInfo10.getConfig();
        java.lang.String str12 = noteInfo10.getId();
        java.lang.String str13 = noteInfo10.getId();
        java.lang.String str14 = noteInfo10.getName();
        org.junit.Assert.assertNotNull(map_str_obj5);
        org.junit.Assert.assertNotNull(map_str_obj9);
        org.junit.Assert.assertNotNull(map_str_obj11);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}" + "'", str12.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}" + "'", str13.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}"));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "" + "'", str14.equals(""));
    }

    @Test
    public void test225() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test225");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.addErrorLogListener();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test226() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test226");
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
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo18 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.Note note19 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str20 = note19.generateParagraphsInfo();
        notebookRepoSettingsInfo18.value = list_map_str_str20;
        java.lang.String str22 = notebookRepoSettingsInfo18.selected;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo23 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.Note note24 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str25 = note24.generateParagraphsInfo();
        notebookRepoSettingsInfo23.value = list_map_str_str25;
        java.lang.String str27 = notebookRepoSettingsInfo23.name;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo28 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str29 = notebookRepoSettingsInfo28.value;
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo30 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] notebookRepoSettingsInfo_array31 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo[] { notebookRepoSettingsInfo18, notebookRepoSettingsInfo23, notebookRepoSettingsInfo28, notebookRepoSettingsInfo30 };
        java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> arraylist_notebookRepoSettingsInfo32 = new java.util.ArrayList<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>();
        boolean b33 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>) arraylist_notebookRepoSettingsInfo32, notebookRepoSettingsInfo_array31);
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder34 = builder1.settings((java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo>) arraylist_notebookRepoSettingsInfo32);
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings35 = builder34.build();
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
        org.junit.Assert.assertNotNull(list_map_str_str20);
        org.junit.Assert.assertNull(str22);
        org.junit.Assert.assertNotNull(list_map_str_str25);
        org.junit.Assert.assertNull(str27);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo28);
        org.junit.Assert.assertNull(list_map_str_str29);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo30);
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo_array31);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertNotNull(builder34);
        org.junit.Assert.assertNotNull(notebookRepoWithSettings35);
    }

    @Test
    public void test227() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test227");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.EMPTY;
        zeppelinhubSession0.sendByFuture("local_modules");
        org.junit.Assert.assertNotNull(zeppelinhubSession0);
    }

    @Test
    public void test228() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test228");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        try {
            watcherWebsocket0.onWebSocketText(".//helium,https://s3.amazonaws.com/helium-package/helium.json");
            org.junit.Assert.fail("Expected exception of type com.google.gson.JsonSyntaxException");
        } catch (com.google.gson.JsonSyntaxException e) {
        }
    }

    @Test
    public void test229() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test229");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_MOVED));
    }

    @Test
    public void test230() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test230");
        java.lang.String str0 = org.apache.zeppelin.notebook.repo.zeppelinhub.ZeppelinHubRepo.TOKEN_HEADER;
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "X-Zeppelin-Token" + "'", str0.equals("X-Zeppelin-Token"));
    }

    @Test
    public void test231() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test231");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("zeppelin.dep.localrepo");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}"));
    }

    @Test
    public void test232() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test232");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        zeppelinConfiguration0.setThrowExceptionOnMissing(true);
        java.lang.String str7 = zeppelinConfiguration0.getS3KMSKeyRegion();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test233() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test233");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_APPEND_OUTPUT));
    }

    @Test
    public void test234() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test234");
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
        java.io.File file11 = null;
        try {
            java.io.File file12 = heliumBundleFactory7.bundleHeliumPackage(frontendPluginFactory10, file11);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(file9);
    }

    @Test
    public void test235() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test235");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        org.apache.commons.configuration.Configuration configuration7 = zeppelinConfiguration0.interpolatedConfiguration();
        double d10 = zeppelinConfiguration0.getDouble("zeppelin", (double) (short) 100);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(configuration7);
        org.junit.Assert.assertTrue(d10 == 100.0d);
    }

    @Test
    public void test236() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test236");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_CONNECTION_STRING;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_CONNECTION_STRING + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AZURE_CONNECTION_STRING));
    }

    @Test
    public void test237() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test237");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        java.util.Collection<org.apache.commons.configuration.event.ConfigurationListener> collection_configurationListener4 = zeppelinConfiguration0.getConfigurationListeners();
        java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration6 = zeppelinConfiguration0.configurationsAt("helium.bundle.js");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNotNull(collection_configurationListener4);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration6);
    }

    @Test
    public void test238() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test238");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.CLONE_NOTE));
    }

    @Test
    public void test239() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test239");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.helium.HeliumPackage heliumPackage3 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        try {
            java.lang.String str5 = heliumApplicationFactory0.loadAndRun(heliumPackage3, paragraph4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test240() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test240");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str2 = null;
        interpreterInfoSaving0.interpreterBindings = map_str_list_str2;
        java.util.List<org.sonatype.aether.repository.RemoteRepository> list_remoteRepository4 = interpreterInfoSaving0.interpreterRepositories;
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting5 = interpreterInfoSaving0.interpreterSettings;
        org.junit.Assert.assertNull(map_str_list_str1);
        org.junit.Assert.assertNull(list_remoteRepository4);
        org.junit.Assert.assertNull(map_str_interpreterSetting5);
    }

    @Test
    public void test241() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test241");
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
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency35 = interpreterSetting12.getDependencies();
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
        org.junit.Assert.assertNotNull(list_dependency35);
    }

    @Test
    public void test242() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test242");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_SSE;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_SSE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_SSE));
    }

    @Test
    public void test243() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test243");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.COPY_PARAGRAPH));
    }

    @Test
    public void test244() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test244");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        java.util.Map<java.lang.String, java.util.Set<java.lang.String>> map_str_set_str1 = interpreterSetting0.getNoteIdAndParaMap();
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array7 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo8 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo8, interpreterInfo_array7);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp10 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array11 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency12 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency12, dependency_array11);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption14 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner16 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting17 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo8, (java.lang.Object) zeppelinHubOp10, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency12, interpreterOption14, "helium.bundle.js", interpreterRunner16);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type18 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array21 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo22 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo22, interpreterInfo_array21);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp24 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array25 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency26 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency26, dependency_array25);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption28 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner30 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting31 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo22, (java.lang.Object) zeppelinHubOp24, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency26, interpreterOption28, "helium.bundle.js", interpreterRunner30);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency32 = interpreterSetting31.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption33 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner35 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting36 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo8, (java.lang.Object) type18, list_dependency32, interpreterOption33, "local_modules", interpreterRunner35);
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting37 = new org.apache.zeppelin.interpreter.InterpreterSetting(interpreterSetting36);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array40 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo41 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b42 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo41, interpreterInfo_array40);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp43 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array44 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency45 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency45, dependency_array44);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption47 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner49 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting50 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo41, (java.lang.Object) zeppelinHubOp43, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency45, interpreterOption47, "helium.bundle.js", interpreterRunner49);
        org.apache.zeppelin.notebook.Note note51 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str52 = note51.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note54 = note51.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str56 = note51.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting50.setInfos(map_str_str56);
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array60 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo61 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b62 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo61, interpreterInfo_array60);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp63 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array64 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency65 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b66 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency65, dependency_array64);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption67 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner69 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting70 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo61, (java.lang.Object) zeppelinHubOp63, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency65, interpreterOption67, "helium.bundle.js", interpreterRunner69);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency71 = interpreterSetting70.getDependencies();
        interpreterSetting50.setDependencies(list_dependency71);
        interpreterSetting37.setDependencies(list_dependency71);
        interpreterSetting0.setDependencies(list_dependency71);
        org.junit.Assert.assertNull(map_str_set_str1);
        org.junit.Assert.assertNotNull(interpreterInfo_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp10 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp10.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type18.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp24 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp24.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_dependency32);
        org.junit.Assert.assertNotNull(interpreterInfo_array40);
        org.junit.Assert.assertTrue(b42 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp43 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp43.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array44);
        org.junit.Assert.assertTrue(b46 == false);
        org.junit.Assert.assertNotNull(list_map_str_str52);
        org.junit.Assert.assertNotNull(note54);
        org.junit.Assert.assertNotNull(map_str_str56);
        org.junit.Assert.assertNotNull(interpreterInfo_array60);
        org.junit.Assert.assertTrue(b62 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp63 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp63.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array64);
        org.junit.Assert.assertTrue(b66 == false);
        org.junit.Assert.assertNotNull(list_dependency71);
    }

    @Test
    public void test245() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test245");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer userSessionContainer0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserSessionContainer();
        java.lang.String str3 = userSessionContainer0.setSession("heliumBundles", "");
        java.lang.String str6 = userSessionContainer0.setSession("JKS", "./conf/interpreter.json");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "./conf/interpreter.json" + "'", str6.equals("./conf/interpreter.json"));
    }

    @Test
    public void test246() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test246");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("heliumBundles");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.subject("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder5 = builder3.message("helium.bundle.js");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
        org.junit.Assert.assertNotNull(builder5);
    }

    @Test
    public void test247() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test247");
        org.apache.zeppelin.notebook.utility.IdHashes idHashes0 = new org.apache.zeppelin.notebook.utility.IdHashes();
    }

    @Test
    public void test248() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test248");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.SESSION_LOGOUT));
    }

    @Test
    public void test249() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test249");
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
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration10 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration10.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo12 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration10);
        java.util.Properties properties14 = null;
        java.util.Properties properties15 = zeppelinConfiguration10.getProperties("bundles", properties14);
        java.lang.String str16 = zeppelinConfiguration10.getInterpreterRemoteRunnerPath();
        java.lang.String str17 = zeppelinConfiguration10.getUser();
        boolean b18 = zeppelinConfiguration10.isAnonymousAllowed();
        zeppelinConfiguration10.setThrowExceptionOnMissing(false);
        zeppelinConfiguration10.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy23 = zeppelinConfiguration10.getReloadingStrategy();
        zeppelinConfiguration0.setReloadingStrategy(reloadingStrategy23);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".//conf/.//conf/keystore" + "'", str9.equals(".//conf/.//conf/keystore"));
        org.junit.Assert.assertNotNull(properties15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + ".//bin/interpreter.sh" + "'", str16.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str17 + "' != '" + "user" + "'", str17.equals("user"));
        org.junit.Assert.assertTrue(b18 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy23);
    }

    @Test
    public void test250() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test250");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS;
        org.apache.zeppelin.notebook.socket.Message message1 = new org.apache.zeppelin.notebook.socket.Message(oP0);
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.GET_INTERPRETER_SETTINGS));
    }

    @Test
    public void test251() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test251");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph3 = note0.getParagraphs();
        java.lang.String str4 = note0.toJson();
        org.junit.Assert.assertNotNull(list_paragraph3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}" + "'", str4.equals("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}"));
    }

    @Test
    public void test252() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test252");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket1.onWebSocketBinary(byte_array7, 10, (int) ' ');
        watcherWebsocket0.onWebSocketBinary(byte_array7, (int) (short) 0, 100);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket14 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array20 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket14.onWebSocketBinary(byte_array20, 10, (int) ' ');
        byte[] byte_array28 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        watcherWebsocket14.onWebSocketBinary(byte_array28, (int) (short) -1, (int) (byte) 0);
        watcherWebsocket0.onWebSocketBinary(byte_array28, (int) (short) 100, (int) (short) -1);
        org.eclipse.jetty.websocket.api.Session session35 = watcherWebsocket0.connection;
        org.junit.Assert.assertNotNull(byte_array7);
        org.junit.Assert.assertNotNull(byte_array20);
        org.junit.Assert.assertNotNull(byte_array28);
        org.junit.Assert.assertNull(session35);
    }

    @Test
    public void test253() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test253");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.clearTree("X-Watcher-Key");
        java.lang.String str6 = zeppelinConfiguration0.getString("configuration", ".//bin/interpreter.sh");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
    }

    @Test
    public void test254() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test254");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getKeyManagerPassword();
        org.apache.commons.configuration.Configuration configuration6 = zeppelinConfiguration0.subset("bundles");
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "" + "'", str4.equals(""));
        org.junit.Assert.assertNotNull(configuration6);
    }

    @Test
    public void test255() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test255");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook1 = null;
        heliumApplicationFactory0.setNotebook(notebook1);
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        heliumApplicationFactory0.unload(paragraph3, "X-Watcher-Key");
        org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
        heliumApplicationFactory0.onNoteCreate(note6);
        org.apache.zeppelin.notebook.Notebook notebook8 = null;
        heliumApplicationFactory0.setNotebook(notebook8);
    }

    @Test
    public void test256() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test256");
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
        java.lang.String str13 = zeppelinConfiguration0.getHeliumConfPath();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ".//conf/helium.json" + "'", str13.equals(".//conf/helium.json"));
    }

    @Test
    public void test257() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test257");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WAR;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WAR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_WAR));
    }

    @Test
    public void test258() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test258");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        zeppelinClient3.removeNoteConnection("load.js");
        try {
            org.eclipse.jetty.websocket.api.Session session9 = zeppelinClient3.getZeppelinConnection("{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", "conf", "X-Zeppelin-Token");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
    }

    @Test
    public void test259() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test259");
        org.apache.zeppelin.notebook.ApplicationState.Status status0 = org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED;
        org.junit.Assert.assertTrue("'" + status0 + "' != '" + org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED + "'", status0.equals(org.apache.zeppelin.notebook.ApplicationState.Status.UNLOADED));
    }

    @Test
    public void test260() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test260");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getRequiredReplName("~Trash");
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test261() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test261");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        heliumApplicationFactory0.onParagraphCreate(paragraph3);
    }

    @Test
    public void test262() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test262");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_LOCALREPO;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_LOCALREPO + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_LOCALREPO));
    }

    @Test
    public void test263() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test263");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.getInstance();
        org.junit.Assert.assertNotNull(zeppelinClient0);
    }

    @Test
    public void test264() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test264");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.math.BigDecimal bigDecimal6 = zeppelinConfiguration0.getBigDecimal("");
        boolean b7 = zeppelinConfiguration0.isAttributeSplittingDisabled();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test265() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test265");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_HOMESCREEN));
    }

    @Test
    public void test266() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test266");
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
        java.io.InputStream inputStream17 = null;
        try {
            zeppelinConfiguration0.load(inputStream17);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "configuration" + "'", str16.equals("configuration"));
    }

    @Test
    public void test267() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test267");
        java.lang.String str0 = org.apache.zeppelin.notebook.utility.IdHashes.generateId();
        org.junit.Assert.assertTrue("'" + str0 + "' != '" + "2CHF9171K" + "'", str0.equals("2CHF9171K"));
    }

    @Test
    public void test268() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test268");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.liveMessage("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}"));
    }

    @Test
    public void test269() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test269");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        heliumApplicationFactory3.run(paragraph4, "local_modules");
        heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
        heliumApplicationFactory0.onOutputAppend("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", "hi!", 0, ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo", "zeppelin.dep.localrepo");
    }

    @Test
    public void test270() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test270");
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
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo17 = null;
        try {
            s3NotebookRepo2.remove("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", authenticationInfo17);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
    }

    @Test
    public void test271() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test271");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        int i1 = instance0.id;
        int i2 = instance0.id;
        org.junit.Assert.assertTrue(i1 == 0);
        org.junit.Assert.assertTrue(i2 == 0);
    }

    @Test
    public void test272() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test272");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        try {
            zeppelinConfiguration0.load();
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
    }

    @Test
    public void test273() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test273");
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
        interpreterSetting12.setErrorReason("heliumBundles");
        org.junit.Assert.assertNotNull(interpreterInfo_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp5 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp5.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_dependency13);
    }

    @Test
    public void test274() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test274");
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
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo18 = null;
        try {
            s3NotebookRepo2.remove("anonymous", authenticationInfo18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(list_revision8);
        org.junit.Assert.assertNotNull(list_map_str_str10);
        org.junit.Assert.assertNotNull(note12);
        org.junit.Assert.assertNotNull(map_str_str14);
    }

    @Test
    public void test275() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test275");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.io.File file9 = heliumBundleFactory7.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage10 = null;
        java.lang.String[] str_array15 = new java.lang.String[] { "heliumBundles", "anonymous", "JKS", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}" };
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
        org.apache.zeppelin.helium.Helium helium51 = new org.apache.zeppelin.helium.Helium(".//bin/interpreter.sh", "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", file27, heliumBundleFactory35, heliumApplicationFactory42);
        com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory frontendPluginFactory54 = null;
        try {
            java.lang.String str55 = heliumBundleFactory7.downloadPackage(heliumPackage10, str_array15, file27, " ", ".//0.0.0.0", frontendPluginFactory54);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertTrue(b22 == false);
        org.junit.Assert.assertNotNull(file27);
        org.junit.Assert.assertTrue(b31 == true);
        org.junit.Assert.assertTrue(b32 == false);
        org.junit.Assert.assertNotNull(file37);
    }

    @Test
    public void test276() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test276");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.EMPTY_TRASH));
    }

    @Test
    public void test277() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test277");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer0 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.getInstance();
        org.junit.Assert.assertNull(userTokenContainer0);
    }

    @Test
    public void test278() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test278");
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
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption36 = null;
        interpreterSetting35.setOption(interpreterOption36);
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
    }

    @Test
    public void test279() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test279");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService schedulerService1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.SchedulerService.create((int) (short) 10);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient4);
        try {
            schedulerService1.add((java.lang.Runnable) zeppelinHubHeartbeat5, 4, (int) (short) 100);
            org.junit.Assert.fail("Expected exception of type java.util.concurrent.RejectedExecutionException");
        } catch (java.util.concurrent.RejectedExecutionException e) {
        }
        org.junit.Assert.assertNotNull(schedulerService1);
        org.junit.Assert.assertNotNull(zeppelinhubClient4);
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat5);
    }

    @Test
    public void test280() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test280");
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
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration12 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str13 = zeppelinConfiguration12.getHeliumRegistry();
        java.lang.Boolean b14 = zeppelinConfiguration12.credentialsPersist();
        org.w3c.dom.Document document15 = zeppelinConfiguration12.getDocument();
        zeppelinConfiguration0.append((org.apache.commons.configuration.Configuration) zeppelinConfiguration12);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertTrue(f11 == 0.0f);
        org.junit.Assert.assertTrue("'" + str13 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str13.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b14 + "' != '" + true + "'", b14.equals(true));
        org.junit.Assert.assertNull(document15);
    }

    @Test
    public void test281() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test281");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
        try {
            zeppelinhubClient2.send(".//conf", "zeppelin");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat3);
    }

    @Test
    public void test282() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test282");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.setAutoSave(false);
        org.apache.commons.logging.Log log4 = null;
        zeppelinConfiguration0.setLogger(log4);
        java.lang.String str6 = zeppelinConfiguration0.getMongoUri();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + "mongodb://localhost" + "'", str6.equals("mongodb://localhost"));
    }

    @Test
    public void test283() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test283");
        org.apache.zeppelin.helium.NpmPackage npmPackage0 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str1 = npmPackage0.version;
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test284() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test284");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        try {
            boolean b3 = zeppelinConfiguration0.getBoolean("mongodb://localhost");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
    }

    @Test
    public void test285() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test285");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder("zeppelin.dep.localrepo");
    }

    @Test
    public void test286() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test286");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getWebsocketMaxTextMessageSize();
        java.lang.String str4 = zeppelinConfiguration0.getNotebookDir();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "1024000" + "'", str3.equals("1024000"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "notebook" + "'", str4.equals("notebook"));
    }

    @Test
    public void test287() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test287");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getTrustStoreType();
        org.xml.sax.EntityResolver entityResolver4 = zeppelinConfiguration0.getEntityResolver();
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JKS" + "'", str3.equals("JKS"));
        org.junit.Assert.assertNotNull(entityResolver4);
    }

    @Test
    public void test288() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test288");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        zeppelinClient3.removeNoteConnection(".//conf/interpreter-list");
        try {
            org.eclipse.jetty.websocket.api.Session session10 = zeppelinClient3.getZeppelinConnection("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}", "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
    }

    @Test
    public void test289() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test289");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_AUTOIMPORT;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_AUTOIMPORT + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_AUTOIMPORT));
    }

    @Test
    public void test290() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test290");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
        org.sonatype.aether.repository.RemoteRepository[] remoteRepository_array1 = new org.sonatype.aether.repository.RemoteRepository[] {};
        java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository> arraylist_remoteRepository2 = new java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository>();
        boolean b3 = java.util.Collections.addAll((java.util.Collection<org.sonatype.aether.repository.RemoteRepository>) arraylist_remoteRepository2, remoteRepository_array1);
        interpreterInfoSaving0.interpreterRepositories = arraylist_remoteRepository2;
        org.junit.Assert.assertNotNull(remoteRepository_array1);
        org.junit.Assert.assertTrue(b3 == false);
    }

    @Test
    public void test291() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test291");
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
        java.lang.String str12 = zeppelinConfiguration0.getS3KMSKeyRegion();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertNotNull(configuration9);
        org.junit.Assert.assertNull(str11);
        org.junit.Assert.assertNull(str12);
    }

    @Test
    public void test292() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test292");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RUN_PARAGRAPH_USING_SPELL));
    }

    @Test
    public void test293() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test293");
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
        boolean b18 = zeppelinConfiguration0.isS3ServerSideEncryption();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "configuration" + "'", str16.equals("configuration"));
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertTrue(b18 == false);
    }

    @Test
    public void test294() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test294");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        java.lang.String str1 = instance0.token;
        instance0.token = "2CHF9171K";
        instance0.token = "local_modules";
        org.junit.Assert.assertNull(str1);
    }

    @Test
    public void test295() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test295");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.clearProperty("");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
    }

    @Test
    public void test296() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test296");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        note0.runAll();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note0.onOutputAppend(paragraph3, (int) (byte) 10, "helium.bundle.js");
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        try {
            note0.insertParagraph(paragraph7, (int) (byte) 100);
            org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
        } catch (java.lang.IndexOutOfBoundsException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str1);
    }

    @Test
    public void test297() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test297");
        org.apache.zeppelin.notebook.Notebook notebook0 = org.apache.zeppelin.notebook.Notebook.CronJob.notebook;
        org.junit.Assert.assertNull(notebook0);
    }

    @Test
    public void test298() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test298");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        zeppelinhubClient2.start();
        java.lang.String str4 = zeppelinhubClient2.getToken();
        zeppelinhubClient2.stop();
        zeppelinhubClient2.removeSession("bundles");
        try {
            zeppelinhubClient2.send("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "local_modules" + "'", str4.equals("local_modules"));
    }

    @Test
    public void test299() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test299");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage1.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str4 = zeppelinhubMessage1.meta;
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder6 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("heliumBundles");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder8 = builder6.message(" ");
        zeppelinhubMessage1.data = builder8;
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder11 = builder8.message("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}");
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNotNull(map_str_str4);
        org.junit.Assert.assertNotNull(builder6);
        org.junit.Assert.assertNotNull(builder8);
        org.junit.Assert.assertNotNull(builder11);
    }

    @Test
    public void test300() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test300");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.ERROR_INFO));
    }

    @Test
    public void test301() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test301");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.socket.Message message5 = zeppelinClient3.deserialize(" ");
        int i6 = zeppelinClient3.countConnectedNotes();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNull(message5);
        org.junit.Assert.assertTrue(i6 == 0);
    }

    @Test
    public void test302() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test302");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        zeppelinConfiguration4.addErrorLogListener();
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test303() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test303");
        org.apache.zeppelin.notebook.socket.Message.OP oP1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.toZeppelinOp("X-Watcher-Key");
        org.junit.Assert.assertNull(oP1);
    }

    @Test
    public void test304() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test304");
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
            java.lang.String str11 = note0.getFolderId();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertNotNull(map_str_obj10);
    }

    @Test
    public void test305() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test305");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory3 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Notebook notebook4 = null;
        heliumApplicationFactory3.setNotebook(notebook4);
        heliumApplicationFactory0.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory3);
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        org.apache.zeppelin.scheduler.Job.Status status8 = null;
        heliumApplicationFactory3.onParagraphStatusChange(paragraph7, status8);
    }

    @Test
    public void test306() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test306");
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        org.apache.zeppelin.notebook.NoteInfo noteInfo6 = new org.apache.zeppelin.notebook.NoteInfo("src", "X-Watcher-Key", map_str_obj5);
        java.lang.String str7 = noteInfo6.getName();
        noteInfo6.setName("2CHF9171K");
        org.junit.Assert.assertNotNull(map_str_obj5);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "X-Watcher-Key" + "'", str7.equals("X-Watcher-Key"));
    }

    @Test
    public void test307() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test307");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.setAutoSave(false);
        java.lang.String str7 = zeppelinConfiguration0.getString("9b49838f-dc67-47f7-8ec6-fd89b914fc08", ".//0.0.0.0", ".//conf/.//conf/keystore");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + ".//conf/.//conf/keystore" + "'", str7.equals(".//conf/.//conf/keystore"));
    }

    @Test
    public void test308() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test308");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array6 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket0.onWebSocketBinary(byte_array6, 10, (int) ' ');
        byte[] byte_array14 = new byte[] { (byte) 0, (byte) 10, (byte) -1, (byte) 1 };
        watcherWebsocket0.onWebSocketBinary(byte_array14, (int) (short) -1, (int) (byte) 0);
        java.lang.Throwable throwable18 = null;
        watcherWebsocket0.onWebSocketError(throwable18);
        org.junit.Assert.assertNotNull(byte_array6);
        org.junit.Assert.assertNotNull(byte_array14);
    }

    @Test
    public void test309() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test309");
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
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo33 = null;
        org.apache.zeppelin.notebook.Note note34 = mongoNotebookRepo5.setNoteRevision("JKS", "", authenticationInfo33);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo37 = null;
        org.apache.zeppelin.notebook.Note note38 = mongoNotebookRepo5.setNoteRevision("helium.bundle.js", "bundles", authenticationInfo37);
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
        org.junit.Assert.assertNull(note34);
        org.junit.Assert.assertNull(note38);
    }

    @Test
    public void test310() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test310");
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
            helium35.save();
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
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
    public void test311() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test311");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        note0.runAll();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note0.onOutputAppend(paragraph3, (int) (byte) 10, "helium.bundle.js");
        try {
            java.lang.String str7 = note0.getNameWithoutPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str1);
    }

    @Test
    public void test312() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test312");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.LIST_CONFIGURATIONS));
    }

    @Test
    public void test313() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test313");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getEndpoint();
        boolean b5 = zeppelinConfiguration0.isValidating();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s3.amazonaws.com" + "'", str4.equals("s3.amazonaws.com"));
        org.junit.Assert.assertTrue(b5 == false);
    }

    @Test
    public void test314() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test314");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings0 = org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.EMPTY;
        notebookRepoWithSettings0.className = "X-Watcher-Key";
        java.lang.String str3 = notebookRepoWithSettings0.name;
        org.junit.Assert.assertNotNull(notebookRepoWithSettings0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "" + "'", str3.equals(""));
    }

    @Test
    public void test315() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test315");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration3 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str4 = zeppelinConfiguration3.getHeliumRegistry();
        java.lang.Boolean b5 = zeppelinConfiguration3.credentialsPersist();
        java.lang.Boolean b8 = zeppelinConfiguration3.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal10 = null;
        java.math.BigDecimal bigDecimal11 = zeppelinConfiguration3.getBigDecimal("helium.bundle.js", bigDecimal10);
        java.lang.String str12 = zeppelinConfiguration3.getFileName();
        boolean b14 = zeppelinConfiguration3.isWindowsPath("~Trash");
        java.lang.String str15 = zeppelinConfiguration3.getMongoDatabase();
        org.apache.commons.logging.Log log16 = null;
        zeppelinConfiguration3.setLogger(log16);
        java.util.List<java.lang.Object> list_obj19 = zeppelinConfiguration3.getList("X-Zeppelin-Token");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client client20 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.Client.initialize("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", "interpreter-setting.json", "zeppelin.dep.localrepo", zeppelinConfiguration3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str4.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + true + "'", b5.equals(true));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + false + "'", b8.equals(false));
        org.junit.Assert.assertNull(bigDecimal11);
        org.junit.Assert.assertNull(str12);
        org.junit.Assert.assertTrue(b14 == false);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "zeppelin" + "'", str15.equals("zeppelin"));
        org.junit.Assert.assertNotNull(list_obj19);
        org.junit.Assert.assertNotNull(client20);
    }

    @Test
    public void test316() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test316");
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
        int i12 = zeppelinConfiguration0.getServerSslPort();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(expressionEngine11);
        org.junit.Assert.assertTrue(i12 == 8443);
    }

    @Test
    public void test317() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test317");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = new org.apache.zeppelin.notebook.socket.WatcherMessage.Builder("load.js");
    }

    @Test
    public void test318() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test318");
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
            helium35.save();
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
    }

    @Test
    public void test319() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test319");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        note0.moveParagraph("heliumBundles", (int) (short) 10);
        java.lang.String str10 = note0.toJson();
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + "{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}" + "'", str10.equals("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}"));
    }

    @Test
    public void test320() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test320");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.addNoteToPara("configuration", "bundles");
        java.lang.String str4 = interpreterSetting0.getId();
        org.junit.Assert.assertNull(str4);
    }

    @Test
    public void test321() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test321");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        zeppelinHeartbeat6.run();
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat5);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat6);
    }

    @Test
    public void test322() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test322");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array7 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo8 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b9 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo8, interpreterInfo_array7);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp10 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array11 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency12 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency12, dependency_array11);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption14 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner16 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting17 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo8, (java.lang.Object) zeppelinHubOp10, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency12, interpreterOption14, "helium.bundle.js", interpreterRunner16);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type18 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array21 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo22 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b23 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo22, interpreterInfo_array21);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp24 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array25 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency26 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b27 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency26, dependency_array25);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption28 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner30 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting31 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo22, (java.lang.Object) zeppelinHubOp24, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency26, interpreterOption28, "helium.bundle.js", interpreterRunner30);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency32 = interpreterSetting31.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption33 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner35 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting36 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo8, (java.lang.Object) type18, list_dependency32, interpreterOption33, "local_modules", interpreterRunner35);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage38 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        zeppelinhubMessage38.op = "helium.bundle.js";
        java.util.Map<java.lang.String, java.lang.String> map_str_str41 = null;
        zeppelinhubMessage38.meta = map_str_str41;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array48 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo49 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b50 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo49, interpreterInfo_array48);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp51 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array52 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency53 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b54 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency53, dependency_array52);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption55 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner57 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting58 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo49, (java.lang.Object) zeppelinHubOp51, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency53, interpreterOption55, "helium.bundle.js", interpreterRunner57);
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type59 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array62 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo63 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b64 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo63, interpreterInfo_array62);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp65 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array66 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency67 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b68 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency67, dependency_array66);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption69 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner71 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting72 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo63, (java.lang.Object) zeppelinHubOp65, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency67, interpreterOption69, "helium.bundle.js", interpreterRunner71);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency73 = interpreterSetting72.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption74 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner76 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting77 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo49, (java.lang.Object) type59, list_dependency73, interpreterOption74, "local_modules", interpreterRunner76);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption78 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner80 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting81 = new org.apache.zeppelin.interpreter.InterpreterSetting(".//helium,https://s3.amazonaws.com/helium-package/helium.json", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo8, (java.lang.Object) zeppelinhubMessage38, list_dependency73, interpreterOption78, "user", interpreterRunner80);
        org.junit.Assert.assertNotNull(interpreterInfo_array7);
        org.junit.Assert.assertTrue(b9 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp10 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp10.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array11);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertTrue("'" + type18 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type18.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array21);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp24 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp24.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array25);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(list_dependency32);
        org.junit.Assert.assertNotNull(zeppelinhubMessage38);
        org.junit.Assert.assertNotNull(interpreterInfo_array48);
        org.junit.Assert.assertTrue(b50 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp51 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp51.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array52);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertTrue("'" + type59 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", type59.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
        org.junit.Assert.assertNotNull(interpreterInfo_array62);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp65 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp65.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array66);
        org.junit.Assert.assertTrue(b68 == false);
        org.junit.Assert.assertNotNull(list_dependency73);
    }

    @Test
    public void test323() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test323");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.lang.String[] str_array9 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str10, str_array9);
        notebookAuthorization0.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str10);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization13 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b14 = notebookAuthorization13.isPublic();
        java.lang.String[] str_array22 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str23 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b24 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str23, str_array22);
        notebookAuthorization13.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str23);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization27 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b28 = notebookAuthorization27.isPublic();
        java.util.Set<java.lang.String> set_str30 = notebookAuthorization27.getRoles("zeppelin.dep.localrepo");
        notebookAuthorization13.setReaders("", set_str30);
        boolean b33 = notebookAuthorization0.hasWriteAuthorization(set_str30, "org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp34 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.ZEPPELIN_STATUS;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array37 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo38 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo38, interpreterInfo_array37);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp40 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array41 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency42 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b43 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency42, dependency_array41);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption44 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner46 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting47 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo38, (java.lang.Object) zeppelinHubOp40, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency42, interpreterOption44, "helium.bundle.js", interpreterRunner46);
        org.apache.zeppelin.notebook.Note note48 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str49 = note48.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note51 = note48.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str53 = note48.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting47.setInfos(map_str_str53);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage55 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.newMessage((java.lang.Object) "org.apache.zeppelin.notebook.repo.GitNotebookRepo", (java.lang.Object) zeppelinHubOp34, map_str_str53);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization13);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertNotNull(str_array22);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(set_str30);
        org.junit.Assert.assertTrue(b33 == true);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp34 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.ZEPPELIN_STATUS + "'", zeppelinHubOp34.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.ZEPPELIN_STATUS));
        org.junit.Assert.assertNotNull(interpreterInfo_array37);
        org.junit.Assert.assertTrue(b39 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp40 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp40.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array41);
        org.junit.Assert.assertTrue(b43 == false);
        org.junit.Assert.assertNotNull(list_map_str_str49);
        org.junit.Assert.assertNotNull(note51);
        org.junit.Assert.assertNotNull(map_str_str53);
        org.junit.Assert.assertNotNull(zeppelinhubMessage55);
    }

    @Test
    public void test324() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test324");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj1 = message0.data;
        java.util.HashSet<java.lang.String> hashset_str3 = message0.getType("heliumBundles");
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertNotNull(map_str_obj1);
        org.junit.Assert.assertNull(hashset_str3);
    }

    @Test
    public void test325() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test325");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        authentication3.run();
        java.lang.String str5 = authentication3.getPrincipal();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "anonymous" + "'", str5.equals("anonymous"));
    }

    @Test
    public void test326() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test326");
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
        org.apache.zeppelin.helium.NpmPackage npmPackage71 = new org.apache.zeppelin.helium.NpmPackage();
        java.lang.String str72 = npmPackage71.name;
        npmPackage71.version = "local_modules";
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array77 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo78 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b79 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo78, interpreterInfo_array77);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp80 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array81 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency82 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b83 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency82, dependency_array81);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption84 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner86 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting87 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo78, (java.lang.Object) zeppelinHubOp80, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency82, interpreterOption84, "helium.bundle.js", interpreterRunner86);
        org.apache.zeppelin.notebook.Note note88 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str89 = note88.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note91 = note88.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str93 = note88.generateSingleParagraphInfo(".//conf/interpreter-list");
        interpreterSetting87.setInfos(map_str_str93);
        npmPackage71.dependencies = map_str_str93;
        zeppelinhubMessage1.meta = map_str_str93;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNull(map_str_str4);
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
        org.junit.Assert.assertNull(str72);
        org.junit.Assert.assertNotNull(interpreterInfo_array77);
        org.junit.Assert.assertTrue(b79 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp80 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp80.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array81);
        org.junit.Assert.assertTrue(b83 == false);
        org.junit.Assert.assertNotNull(list_map_str_str89);
        org.junit.Assert.assertNotNull(note91);
        org.junit.Assert.assertNotNull(map_str_str93);
    }

    @Test
    public void test327() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test327");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        zeppelinhubClient2.start();
        java.lang.String str4 = zeppelinhubClient2.getToken();
        zeppelinhubClient2.stop();
        zeppelinhubClient2.start();
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "local_modules" + "'", str4.equals("local_modules"));
    }

    @Test
    public void test328() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test328");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj6);
        interpreterInfo7.setName("~Trash");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp10 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD;
        boolean b11 = interpreterInfo7.equals((java.lang.Object) zeppelinHubOp10);
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp10 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD + "'", zeppelinHubOp10.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.DEAD));
        org.junit.Assert.assertTrue(b11 == false);
    }

    @Test
    public void test329() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test329");
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
        java.util.Collection<org.apache.commons.configuration.event.ConfigurationErrorListener> collection_configurationErrorListener19 = zeppelinConfiguration0.getErrorListeners();
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
        org.junit.Assert.assertNotNull(collection_configurationErrorListener19);
    }

    @Test
    public void test330() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test330");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance instance0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance();
        java.lang.String str1 = instance0.token;
        instance0.id = 100;
        int i4 = instance0.id;
        instance0.id = (byte) 100;
        org.junit.Assert.assertNull(str1);
        org.junit.Assert.assertTrue(i4 == 100);
    }

    @Test
    public void test331() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test331");
        org.eclipse.jetty.websocket.api.Session session0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, ".//conf/.//conf/keystore");
        zeppelinhubSession2.close();
        org.junit.Assert.assertNotNull(zeppelinhubSession2);
    }

    @Test
    public void test332() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test332");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = null;
        interpreterSetting0.setOption(interpreterOption1);
        interpreterSetting0.addNoteToPara("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", ".//local-repo");
    }

    @Test
    public void test333() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test333");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_CONTEXT_PATH;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_CONTEXT_PATH + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SERVER_CONTEXT_PATH));
    }

    @Test
    public void test334() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test334");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        java.lang.String str4 = zeppelinConfiguration0.getSystemID();
        java.lang.String str5 = zeppelinConfiguration0.getBucketName();
        org.apache.commons.lang.text.StrSubstitutor strSubstitutor6 = zeppelinConfiguration0.getSubstitutor();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "zeppelin" + "'", str5.equals("zeppelin"));
        org.junit.Assert.assertNotNull(strSubstitutor6);
    }

    @Test
    public void test335() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test335");
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
        org.apache.zeppelin.notebook.Paragraph paragraph40 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage42 = null;
        note36.onOutputUpdate(paragraph40, 2, interpreterResultMessage42);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
    }

    @Test
    public void test336() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test336");
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
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency35 = interpreterSetting34.getDependencies();
        java.lang.String str36 = interpreterSetting34.getId();
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency37 = interpreterSetting34.getDependencies();
        java.lang.String str38 = interpreterSetting34.getPath();
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
        org.junit.Assert.assertNotNull(list_dependency35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "yarn-cache" + "'", str36.equals("yarn-cache"));
        org.junit.Assert.assertNotNull(list_dependency37);
        org.junit.Assert.assertTrue("'" + str38 + "' != '" + "local_modules" + "'", str38.equals("local_modules"));
    }

    @Test
    public void test337() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test337");
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
            org.apache.zeppelin.helium.HeliumPackageSearchResult heliumPackageSearchResult38 = helium35.getEnabledPackageInfo("src");
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
    public void test338() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test338");
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
        org.apache.zeppelin.notebook.socket.Message message13 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP14 = org.apache.zeppelin.notebook.socket.Message.OP.PING;
        message13.op = oP14;
        java.lang.String str16 = message13.roles;
        try {
            client12.relayToZeppelin(message13, ".//0.0.0.0");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalStateException");
        } catch (java.lang.IllegalStateException e) {
        }
        org.junit.Assert.assertTrue(b6 == true);
        org.junit.Assert.assertTrue("'" + confVars10 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC + "'", confVars10.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_ONE_WAY_SYNC));
        org.junit.Assert.assertTrue(f11 == (-1.0f));
        org.junit.Assert.assertNotNull(client12);
        org.junit.Assert.assertNotNull(message13);
        org.junit.Assert.assertTrue("'" + oP14 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PING + "'", oP14.equals(org.apache.zeppelin.notebook.socket.Message.OP.PING));
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "" + "'", str16.equals(""));
    }

    @Test
    public void test339() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test339");
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
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo13 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(expressionEngine11);
    }

    @Test
    public void test340() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test340");
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
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo33 = null;
        org.apache.zeppelin.notebook.Note note34 = mongoNotebookRepo5.get(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo", "2CHF9171K", authenticationInfo33);
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
        org.junit.Assert.assertNull(note34);
    }

    @Test
    public void test341() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test341");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RELOAD_NOTES_FROM_REPO));
    }

    @Test
    public void test342() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test342");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_ALL;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_ALL + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.RESTORE_ALL));
    }

    @Test
    public void test343() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test343");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.math.BigDecimal bigDecimal6 = zeppelinConfiguration0.getBigDecimal("");
        java.lang.String str7 = zeppelinConfiguration0.getFileName();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(bigDecimal6);
        org.junit.Assert.assertNull(str7);
    }

    @Test
    public void test344() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test344");
        org.apache.zeppelin.notebook.NotebookImportDeserializer notebookImportDeserializer0 = new org.apache.zeppelin.notebook.NotebookImportDeserializer();
        com.google.gson.JsonElement jsonElement1 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars2 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE;
        java.lang.Class class3 = confVars2.getVarClass();
        com.google.gson.JsonDeserializationContext jsonDeserializationContext4 = null;
        try {
            java.util.Date date5 = notebookImportDeserializer0.deserialize(jsonElement1, (java.lang.reflect.Type) class3, jsonDeserializationContext4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + confVars2 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE + "'", confVars2.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_MONGO_DATABASE));
        org.junit.Assert.assertNotNull(class3);
    }

    @Test
    public void test345() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test345");
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication0 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.getInstance();
        authentication0.run();
        boolean b2 = authentication0.authenticate();
        org.junit.Assert.assertNotNull(authentication0);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test346() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test346");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.newInstance();
        notebookRepoSettingsInfo0.name = "anonymous";
        org.junit.Assert.assertNotNull(notebookRepoSettingsInfo0);
    }

    @Test
    public void test347() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test347");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration1 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str2 = zeppelinConfiguration1.getKeyStorePassword();
        org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication authentication3 = org.apache.zeppelin.notebook.repo.zeppelinhub.security.Authentication.initialize("hi!", zeppelinConfiguration1);
        authentication3.run();
        boolean b5 = authentication3.isAuthenticated();
        boolean b6 = authentication3.isAuthenticated();
        authentication3.run();
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "" + "'", str2.equals(""));
        org.junit.Assert.assertNotNull(authentication3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test348() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test348");
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
        java.util.List<org.apache.zeppelin.notebook.Paragraph> list_paragraph16 = note15.getParagraphs();
        org.junit.Assert.assertNotNull(list_paragraph16);
    }

    @Test
    public void test349() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test349");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.pingMessage("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"PING\",\"data\":{\"token\":\"{\\\"op\\\":\\\"DEAD\\\",\\\"data\\\":{\\\"token\\\":\\\"bundles\\\"},\\\"meta\\\":{}}\"},\"meta\":{}}"));
    }

    @Test
    public void test350() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test350");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        org.apache.zeppelin.scheduler.Job.Status status4 = null;
        heliumApplicationFactory0.onParagraphStatusChange(paragraph3, status4);
    }

    @Test
    public void test351() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test351");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        com.github.eirslett.maven.plugins.frontend.lib.FrontendPluginFactory frontendPluginFactory8 = null;
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration9 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration9.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo11 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration9);
        boolean b12 = zeppelinConfiguration9.isEmpty();
        boolean b13 = zeppelinConfiguration9.isAutoSave();
        java.io.File file14 = null;
        java.io.File file15 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory16 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration9, file14, file15);
        java.io.File file18 = heliumBundleFactory16.getHeliumPackageDirectory("~Trash");
        try {
            java.io.File file19 = heliumBundleFactory7.bundleHeliumPackage(frontendPluginFactory8, file18);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b12 == true);
        org.junit.Assert.assertTrue(b13 == false);
        org.junit.Assert.assertNotNull(file18);
    }

    @Test
    public void test352() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test352");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note1 = null;
        heliumApplicationFactory0.onNoteRemove(note1);
        org.apache.zeppelin.notebook.Notebook notebook3 = null;
        heliumApplicationFactory0.setNotebook(notebook3);
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        heliumApplicationFactory0.unload(paragraph5, "local_modules");
    }

    @Test
    public void test353() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test353");
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
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration72 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str73 = zeppelinConfiguration72.getHeliumRegistry();
        java.lang.Boolean b74 = zeppelinConfiguration72.credentialsPersist();
        org.w3c.dom.Document document75 = zeppelinConfiguration72.getDocument();
        java.lang.String str76 = zeppelinConfiguration72.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo77 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration72);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo78 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo> list_notebookRepoSettingsInfo79 = mongoNotebookRepo77.getSettings(authenticationInfo78);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration80 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration80.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo82 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration80);
        java.util.Map<java.lang.String, java.lang.String> map_str_str83 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo84 = null;
        s3NotebookRepo82.updateSettings(map_str_str83, authenticationInfo84);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo87 = null;
        java.util.List<org.apache.zeppelin.notebook.repo.NotebookRepo.Revision> list_revision88 = s3NotebookRepo82.revisionHistory("zeppelin.dep.localrepo", authenticationInfo87);
        org.apache.zeppelin.notebook.Note note89 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str90 = note89.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note92 = note89.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str94 = note89.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo95 = null;
        s3NotebookRepo82.updateSettings(map_str_str94, authenticationInfo95);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo97 = null;
        mongoNotebookRepo77.updateSettings(map_str_str94, authenticationInfo97);
        interpreterSetting35.setInfos(map_str_str94);
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
        org.junit.Assert.assertTrue("'" + str73 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str73.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b74 + "' != '" + true + "'", b74.equals(true));
        org.junit.Assert.assertNull(document75);
        org.junit.Assert.assertTrue("'" + str76 + "' != '" + "s3.amazonaws.com" + "'", str76.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(list_notebookRepoSettingsInfo79);
        org.junit.Assert.assertNotNull(list_revision88);
        org.junit.Assert.assertNotNull(list_map_str_str90);
        org.junit.Assert.assertNotNull(note92);
        org.junit.Assert.assertNotNull(map_str_str94);
    }

    @Test
    public void test354() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test354");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array3 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo4 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b5 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo4, interpreterInfo_array3);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration8 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient9 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration8);
        org.apache.zeppelin.dep.Dependency[] dependency_array10 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency11 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b12 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency11, dependency_array10);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption13 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner15 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting16 = new org.apache.zeppelin.interpreter.InterpreterSetting("heliumBundles", "user", "", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo4, (java.lang.Object) "src", (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency11, interpreterOption13, "X-Watcher-Key", interpreterRunner15);
        org.apache.zeppelin.dep.Dependency[] dependency_array17 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency18 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b19 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency18, dependency_array17);
        interpreterSetting16.setDependencies((java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency18);
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner21 = null;
        interpreterSetting16.setInterpreterRunner(interpreterRunner21);
        org.junit.Assert.assertNotNull(interpreterInfo_array3);
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertNotNull(zeppelinClient9);
        org.junit.Assert.assertNotNull(dependency_array10);
        org.junit.Assert.assertTrue(b12 == false);
        org.junit.Assert.assertNotNull(dependency_array17);
        org.junit.Assert.assertTrue(b19 == false);
    }

    @Test
    public void test355() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test355");
        org.eclipse.jetty.websocket.api.Session session0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.junit.Assert.assertNotNull(zeppelinhubSession2);
    }

    @Test
    public void test356() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test356");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        zeppelinConfiguration0.setThrowExceptionOnMissing(true);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration11 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration11.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo13 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration11);
        boolean b14 = zeppelinConfiguration11.isEmpty();
        boolean b15 = zeppelinConfiguration11.isAutoSave();
        java.io.File file16 = null;
        java.io.File file17 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory18 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration11, file16, file17);
        java.io.File file20 = heliumBundleFactory18.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration21 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration21.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo23 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration21);
        boolean b24 = zeppelinConfiguration21.isEmpty();
        boolean b25 = zeppelinConfiguration21.isAutoSave();
        java.io.File file26 = null;
        java.io.File file27 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory28 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration21, file26, file27);
        java.io.File file30 = heliumBundleFactory28.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory31 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph32 = null;
        heliumApplicationFactory31.unload(paragraph32, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory35 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note36 = null;
        heliumApplicationFactory35.onNoteRemove(note36);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory38 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph39 = null;
        heliumApplicationFactory38.run(paragraph39, "local_modules");
        heliumApplicationFactory35.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory38);
        heliumApplicationFactory31.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory35);
        org.apache.zeppelin.helium.Helium helium44 = new org.apache.zeppelin.helium.Helium("yarn-cache", ".//conf/interpreter.json", file20, heliumBundleFactory28, heliumApplicationFactory35);
        org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry45 = new org.apache.zeppelin.helium.HeliumOnlineRegistry("", "bundles", file20);
        try {
            zeppelinConfiguration0.save(file20);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue(b14 == true);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(file20);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertTrue(b25 == false);
        org.junit.Assert.assertNotNull(file30);
    }

    @Test
    public void test357() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test357");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        try {
            zeppelinConfiguration0.load("org.apache.zeppelin.notebook.repo.GitNotebookRepo");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
    }

    @Test
    public void test358() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test358");
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
        java.lang.String str20 = zeppelinConfiguration0.getString("~Trash");
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
        org.junit.Assert.assertNull(str20);
    }

    @Test
    public void test359() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test359");
        try {
            org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", "zeppelin.dep.localrepo", "hi!");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test360() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test360");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}");
    }

    @Test
    public void test361() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test361");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.util.Set<java.lang.String> set_str3 = notebookAuthorization0.getRoles("zeppelin.dep.localrepo");
        java.lang.String[] str_array20 = new java.lang.String[] { "heliumBundles", "heliumBundles", "yarn-cache", "heliumBundles", "", "zeppelin.dep.localrepo", "hi!", "hi!", "~Trash", "heliumBundles", "~Trash", "yarn-cache", ".//bin/interpreter.sh", "", "helium.bundle.js" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        notebookAuthorization0.setReaders("hi!", (java.util.Set<java.lang.String>) linkedhashset_str21);
        java.util.Set<java.lang.String> set_str25 = notebookAuthorization0.getRoles(" ");
        boolean b26 = notebookAuthorization0.isPublic();
        notebookAuthorization0.removeNote("9b49838f-dc67-47f7-8ec6-fd89b914fc08");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(set_str3);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set_str25);
        org.junit.Assert.assertTrue(b26 == true);
    }

    @Test
    public void test362() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test362");
        org.apache.zeppelin.helium.HeliumLocalRegistry heliumLocalRegistry2 = new org.apache.zeppelin.helium.HeliumLocalRegistry("helium.bundle.js", "hi!");
        java.util.List<org.apache.zeppelin.helium.HeliumPackage> list_heliumPackage3 = heliumLocalRegistry2.getAll();
        java.lang.String str4 = heliumLocalRegistry2.name();
        org.junit.Assert.assertNotNull(list_heliumPackage3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "helium.bundle.js" + "'", str4.equals("helium.bundle.js"));
    }

    @Test
    public void test363() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test363");
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
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array15 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo16 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo16, interpreterInfo_array15);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp18 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array19 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency20 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b21 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency20, dependency_array19);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption22 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner24 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting25 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo16, (java.lang.Object) zeppelinHubOp18, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency20, interpreterOption22, "helium.bundle.js", interpreterRunner24);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency26 = interpreterSetting25.getDependencies();
        interpreterSetting12.setDependencies(list_dependency26);
        java.lang.Object obj28 = interpreterSetting12.getProperties();
        org.junit.Assert.assertNotNull(interpreterInfo_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp5 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp5.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(interpreterInfo_array15);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp18 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp18.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array19);
        org.junit.Assert.assertTrue(b21 == false);
        org.junit.Assert.assertNotNull(list_dependency26);
        org.junit.Assert.assertTrue("'" + obj28 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", obj28.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
    }

    @Test
    public void test364() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test364");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        org.apache.zeppelin.notebook.NoteInfo noteInfo7 = new org.apache.zeppelin.notebook.NoteInfo(note0);
        org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage10 = null;
        note0.onOutputUpdate(paragraph8, (int) '4', interpreterResultMessage10);
        org.junit.Assert.assertNotNull(map_str_obj3);
    }

    @Test
    public void test365() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test365");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getTrustStoreType();
        java.lang.String str4 = zeppelinConfiguration0.getNotebookDir();
        zeppelinConfiguration0.setAttributeSplittingDisabled(false);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JKS" + "'", str3.equals("JKS"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "notebook" + "'", str4.equals("notebook"));
    }

    @Test
    public void test366() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test366");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        java.lang.String str9 = zeppelinConfiguration0.getInterpreterJson();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "interpreter-setting.json" + "'", str9.equals("interpreter-setting.json"));
    }

    @Test
    public void test367() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test367");
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
        try {
            org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration13 = zeppelinConfiguration0.configurationAt(".//bin/interpreter.sh");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertTrue(f11 == 0.0f);
    }

    @Test
    public void test368() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test368");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        org.eclipse.jetty.websocket.api.Session session2 = null;
        zeppelinWebsocket1.onWebSocketConnect(session2);
        java.lang.String str4 = zeppelinWebsocket1.noteId;
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "./conf/interpreter.json" + "'", str4.equals("./conf/interpreter.json"));
    }

    @Test
    public void test369() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test369");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance("mongodb://localhost");
        org.eclipse.jetty.websocket.api.Session session2 = null;
        try {
            zeppelinhubWebsocket1.onWebSocketConnect(session2);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
    }

    @Test
    public void test370() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test370");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getTrustStoreType();
        java.lang.String str7 = zeppelinConfiguration0.getString(".//bin/interpreter.sh", ".//conf", "notebook");
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JKS" + "'", str3.equals("JKS"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "notebook" + "'", str7.equals("notebook"));
    }

    @Test
    public void test371() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test371");
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
            helium35.enable("2CHF9171K", "local_modules");
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
    public void test372() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test372");
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
            installInterpreter49.install("yarn-cache");
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
    public void test373() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test373");
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
        try {
            long long16 = zeppelinConfiguration0.getLong("mongodb://localhost");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".//0.0.0.0" + "'", str14.equals(".//0.0.0.0"));
    }

    @Test
    public void test374() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test374");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getTrustStoreType();
        java.lang.String str4 = zeppelinConfiguration0.getNotebookDir();
        try {
            zeppelinConfiguration0.load("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "JKS" + "'", str3.equals("JKS"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "notebook" + "'", str4.equals("notebook"));
    }

    @Test
    public void test375() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test375");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.Object obj7 = zeppelinConfiguration0.clone();
        java.lang.String str8 = zeppelinConfiguration0.getTrustStoreType();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(obj7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "JKS" + "'", str8.equals("JKS"));
    }

    @Test
    public void test376() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test376");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        boolean b2 = zeppelinConfiguration0.isDetailEvents();
        java.net.URL uRL3 = null;
        zeppelinConfiguration0.setURL(uRL3);
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test377() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test377");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("helium.bundle.js");
        java.util.Map<java.lang.String, java.lang.String> map_str_str2 = zeppelinhubMessage1.meta;
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
        org.junit.Assert.assertNotNull(map_str_str2);
    }

    @Test
    public void test378() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test378");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
        java.lang.String[] str_array11 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str12, str_array11);
        notebookAuthorization1.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str12);
        java.util.Set<java.lang.String> set_str16 = notebookAuthorization1.getOwners("load.js");
        java.util.Set<java.lang.String> set_str18 = null;
        boolean b19 = notebookAuthorization1.isOwner("http://registry.npmjs.org/", set_str18);
        org.junit.Assert.assertNotNull(notebookAuthorization1);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(set_str16);
        org.junit.Assert.assertTrue(b19 == true);
    }

    @Test
    public void test379() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test379");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = zeppelinConfiguration2.getProperties("bundles", properties6);
        java.lang.String str8 = zeppelinConfiguration2.getInterpreterRemoteRunnerPath();
        java.lang.String str9 = zeppelinConfiguration2.getUser();
        boolean b10 = zeppelinConfiguration2.isAnonymousAllowed();
        zeppelinConfiguration2.setThrowExceptionOnMissing(false);
        zeppelinConfiguration2.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy15 = zeppelinConfiguration2.getReloadingStrategy();
        java.lang.String str16 = zeppelinConfiguration2.getHeliumNpmRegistry();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient17 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize(" ", "{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", zeppelinConfiguration2);
        try {
            boolean b19 = zeppelinConfiguration2.getBoolean("");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".//bin/interpreter.sh" + "'", str8.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "user" + "'", str9.equals("user"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "http://registry.npmjs.org/" + "'", str16.equals("http://registry.npmjs.org/"));
        org.junit.Assert.assertNotNull(zeppelinClient17);
    }

    @Test
    public void test380() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test380");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.String str3 = zeppelinConfiguration0.getPublicID();
        java.lang.String str4 = zeppelinConfiguration0.getConfDir();
        java.lang.Short s7 = zeppelinConfiguration0.getShort(".//conf/interpreter-list", (java.lang.Short) (short) 100);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(str3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "conf" + "'", str4.equals("conf"));
        org.junit.Assert.assertTrue("'" + s7 + "' != '" + (short) 100 + "'", s7.equals((short) 100));
    }

    @Test
    public void test381() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test381");
        org.apache.zeppelin.notebook.Notebook.CronJob cronJob0 = new org.apache.zeppelin.notebook.Notebook.CronJob();
        org.quartz.JobExecutionContext jobExecutionContext1 = null;
        try {
            cronJob0.execute(jobExecutionContext1);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test382() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test382");
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
        java.lang.Boolean b19 = zeppelinConfiguration0.credentialsPersist();
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
        org.junit.Assert.assertTrue("'" + b19 + "' != '" + true + "'", b19.equals(true));
    }

    @Test
    public void test383() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test383");
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
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str25 = notebookRepoSettingsInfo0.value;
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
        org.junit.Assert.assertNotNull(list_map_str_str25);
    }

    @Test
    public void test384() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test384");
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
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note6.addParagraph(paragraph11);
        org.junit.Assert.assertNotNull(map_str_obj9);
    }

    @Test
    public void test385() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test385");
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
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency35 = interpreterSetting34.getDependencies();
        java.lang.String str36 = interpreterSetting34.getId();
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency37 = interpreterSetting34.getDependencies();
        java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo> list_interpreterInfo38 = interpreterSetting34.getInterpreterInfos();
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
        org.junit.Assert.assertNotNull(list_dependency35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "yarn-cache" + "'", str36.equals("yarn-cache"));
        org.junit.Assert.assertNotNull(list_dependency37);
        org.junit.Assert.assertNotNull(list_interpreterInfo38);
    }

    @Test
    public void test386() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test386");
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
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars14 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i15 = zeppelinConfiguration0.getInt(confVars14);
        java.net.URL uRL16 = null;
        try {
            zeppelinConfiguration0.save(uRL16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(long13 == 1L);
        org.junit.Assert.assertTrue("'" + confVars14 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars14.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i15 == (-1));
    }

    @Test
    public void test387() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test387");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration4.isS3ServerSideEncryption();
        try {
            float f9 = zeppelinConfiguration4.getFloat("0.8.0-SNAPSHOT");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test388() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test388");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterListPath();
        java.lang.Object obj7 = zeppelinConfiguration0.getReloadLock();
        java.io.Reader reader8 = null;
        try {
            zeppelinConfiguration0.load(reader8);
            org.junit.Assert.fail("Expected exception of type org.apache.commons.configuration.ConfigurationException");
        } catch (org.apache.commons.configuration.ConfigurationException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//conf/interpreter-list" + "'", str6.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertNotNull(obj7);
    }

    @Test
    public void test389() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test389");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("heliumBundles");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder3 = builder1.message("");
        org.junit.Assert.assertNotNull(builder1);
        org.junit.Assert.assertNotNull(builder3);
    }

    @Test
    public void test390() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test390");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo5 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo8 = null;
        org.apache.zeppelin.notebook.Note note9 = mongoNotebookRepo5.setNoteRevision("s3.amazonaws.com", "X-Zeppelin-Token", authenticationInfo8);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s3.amazonaws.com" + "'", str4.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNull(note9);
    }

    @Test
    public void test391() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test391");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        org.eclipse.jetty.websocket.api.Session session2 = null;
        zeppelinWebsocket1.connection = session2;
        org.eclipse.jetty.websocket.api.Session session4 = null;
        zeppelinWebsocket1.onWebSocketConnect(session4);
    }

    @Test
    public void test392() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test392");
        org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = org.apache.zeppelin.ticket.TicketContainer.instance;
        java.lang.String str2 = ticketContainer0.getTicket("2CHF9171K");
        java.lang.String str4 = ticketContainer0.getTicket("./conf/interpreter.json");
        org.junit.Assert.assertNotNull(ticketContainer0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9b49838f-dc67-47f7-8ec6-fd89b914fc08" + "'", str2.equals("9b49838f-dc67-47f7-8ec6-fd89b914fc08"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "b3883bc7-9096-4750-9b75-98964ffef420" + "'", str4.equals("b3883bc7-9096-4750-9b75-98964ffef420"));
    }

    @Test
    public void test393() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test393");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.lang.String[] str_array9 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str10 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b11 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str10, str_array9);
        notebookAuthorization0.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str10);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo14 = null;
        notebookAuthorization0.setNewNotePermissions("zeppelin.dep.localrepo", authenticationInfo14);
        java.util.Set<java.lang.String> set_str17 = notebookAuthorization0.getWriters("1024000");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(str_array9);
        org.junit.Assert.assertTrue(b11 == true);
        org.junit.Assert.assertNotNull(set_str17);
    }

    @Test
    public void test394() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test394");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_TYPE;
        long long1 = confVars0.getLongValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_TYPE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_SSL_TRUSTSTORE_TYPE));
        org.junit.Assert.assertTrue(long1 == (-1L));
    }

    @Test
    public void test395() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test395");
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
        notebookRepoWithSettings4.name = "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}";
        org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "X-Watcher-Key" + "'", str5.equals("X-Watcher-Key"));
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
    }

    @Test
    public void test396() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test396");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        long long9 = zeppelinConfiguration0.getLong("notebook", (long) 32);
        java.lang.String str10 = zeppelinConfiguration0.getS3KMSKeyID();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(long9 == 32L);
        org.junit.Assert.assertNull(str10);
    }

    @Test
    public void test397() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test397");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_EMP;
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_EMP + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_S3_EMP));
    }

    @Test
    public void test398() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test398");
        java.lang.String str1 = org.apache.zeppelin.notebook.Paragraph.getScriptBody("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}"));
    }

    @Test
    public void test399() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test399");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket zeppelinWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinWebsocket("./conf/interpreter.json");
        org.eclipse.jetty.websocket.api.Session session2 = null;
        zeppelinWebsocket1.connection = session2;
        zeppelinWebsocket1.noteId = "{\"op\":\"LIVE\",\"data\":{\"token\":\"zeppelin.dep.localrepo\"},\"meta\":{}}";
    }

    @Test
    public void test400() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test400");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.w3c.dom.Document document7 = zeppelinConfiguration4.getDocument();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertNull(document7);
    }

    @Test
    public void test401() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test401");
        org.apache.zeppelin.ticket.TicketContainer ticketContainer0 = org.apache.zeppelin.ticket.TicketContainer.instance;
        java.lang.String str2 = ticketContainer0.getTicket("2CHF9171K");
        boolean b5 = ticketContainer0.isValid("interpreter-setting.json", "load.js");
        java.lang.String str7 = ticketContainer0.getTicket("local_modules");
        org.junit.Assert.assertNotNull(ticketContainer0);
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "9b49838f-dc67-47f7-8ec6-fd89b914fc08" + "'", str2.equals("9b49838f-dc67-47f7-8ec6-fd89b914fc08"));
        org.junit.Assert.assertTrue(b5 == false);
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "b71190c4-a07f-4d06-8d2c-2a742dab6398" + "'", str7.equals("b71190c4-a07f-4d06-8d2c-2a742dab6398"));
    }

    @Test
    public void test402() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test402");
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
        interpreterSetting12.clearNoteIdAndParaMap();
        org.junit.Assert.assertNotNull(interpreterInfo_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp5 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp5.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_dependency13);
    }

    @Test
    public void test403() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test403");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.NOTE;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.NOTE + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.NOTE));
    }

    @Test
    public void test404() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test404");
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
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration19 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration19.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo21 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration19);
        java.util.Properties properties23 = null;
        java.util.Properties properties24 = zeppelinConfiguration19.getProperties("bundles", properties23);
        java.lang.String str25 = zeppelinConfiguration19.getInterpreterRemoteRunnerPath();
        java.lang.String str26 = zeppelinConfiguration19.getUser();
        boolean b27 = zeppelinConfiguration19.isAnonymousAllowed();
        zeppelinConfiguration19.setThrowExceptionOnMissing(false);
        zeppelinConfiguration19.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy32 = zeppelinConfiguration19.getReloadingStrategy();
        java.util.List<org.apache.commons.configuration.HierarchicalConfiguration> list_hierarchicalConfiguration34 = zeppelinConfiguration19.configurationsAt("");
        java.lang.String str35 = zeppelinConfiguration19.getRootElementName();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration19);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "configuration" + "'", str16.equals("configuration"));
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertNotNull(properties24);
        org.junit.Assert.assertTrue("'" + str25 + "' != '" + ".//bin/interpreter.sh" + "'", str25.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str26 + "' != '" + "user" + "'", str26.equals("user"));
        org.junit.Assert.assertTrue(b27 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy32);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration34);
        org.junit.Assert.assertTrue("'" + str35 + "' != '" + "configuration" + "'", str35.equals("configuration"));
    }

    @Test
    public void test405() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test405");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        int i2 = folder1.countNotes();
        java.lang.String str3 = folder1.getName();
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "interpreter.json" + "'", str3.equals("interpreter.json"));
    }

    @Test
    public void test406() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test406");
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
        interpreterSetting35.addNoteToPara("./conf/interpreter.json", "./conf/interpreter.json");
        java.lang.Object obj39 = interpreterSetting35.getProperties();
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
        org.junit.Assert.assertTrue("'" + obj39 + "' != '" + org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT + "'", obj39.equals(org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT));
    }

    @Test
    public void test407() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test407");
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder builder1 = new org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings.Builder(".//conf/interpreter-list");
    }

    @Test
    public void test408() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test408");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.commons.configuration.interpol.ConfigurationInterpolator configurationInterpolator2 = zeppelinConfiguration0.getInterpolator();
        org.junit.Assert.assertNotNull(configurationInterpolator2);
    }

    @Test
    public void test409() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test409");
        org.eclipse.jetty.websocket.api.Session session0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "hi!");
        org.junit.Assert.assertNotNull(zeppelinhubSession2);
    }

    @Test
    public void test410() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test410");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Map<java.lang.String, java.lang.String> map_str_str3 = null;
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo4 = null;
        s3NotebookRepo2.updateSettings(map_str_str3, authenticationInfo4);
        org.apache.zeppelin.notebook.Note note6 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph7 = null;
        note6.addParagraph(paragraph7);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj9 = note6.getInfo();
        org.apache.zeppelin.scheduler.Job job10 = null;
        note6.onProgressUpdate(job10, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj13 = null;
        note6.setConfig(map_str_obj13);
        boolean b15 = note6.isPersonalizedMode();
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj16 = note6.getInfo();
        java.lang.String str17 = note6.getName();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo18 = null;
        try {
            s3NotebookRepo2.save(note6, authenticationInfo18);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj9);
        org.junit.Assert.assertTrue(b15 == false);
        org.junit.Assert.assertNotNull(map_str_obj16);
        org.junit.Assert.assertNull(str17);
    }

    @Test
    public void test411() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test411");
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
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency35 = interpreterSetting34.getDependencies();
        java.lang.String str36 = interpreterSetting34.getId();
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency37 = interpreterSetting34.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status38 = interpreterSetting34.getStatus();
        java.lang.String str39 = interpreterSetting34.getGroup();
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
        org.junit.Assert.assertNotNull(list_dependency35);
        org.junit.Assert.assertTrue("'" + str36 + "' != '" + "yarn-cache" + "'", str36.equals("yarn-cache"));
        org.junit.Assert.assertNotNull(list_dependency37);
        org.junit.Assert.assertTrue("'" + status38 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY + "'", status38.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.READY));
        org.junit.Assert.assertTrue("'" + str39 + "' != '" + "zeppelin.dep.localrepo" + "'", str39.equals("zeppelin.dep.localrepo"));
    }

    @Test
    public void test412() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test412");
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
        try {
            boolean b12 = zeppelinConfiguration0.getBoolean("9b49838f-dc67-47f7-8ec6-fd89b914fc08");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test413() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test413");
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
        java.lang.Double d18 = zeppelinConfiguration0.getDouble("load.js", (java.lang.Double) (-1.0d));
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".//0.0.0.0" + "'", str14.equals(".//0.0.0.0"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + d18 + "' != '" + (-1.0d) + "'", d18.equals((-1.0d)));
    }

    @Test
    public void test414() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test414");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note3.isPersonalizedMode();
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        note3.onOutputAppend(paragraph5, 8443, "JKS");
        org.junit.Assert.assertNotNull(list_map_str_str1);
        org.junit.Assert.assertNotNull(note3);
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test415() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test415");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration4.isS3ServerSideEncryption();
        java.lang.String str8 = zeppelinConfiguration4.getKeyManagerPassword();
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + "" + "'", str8.equals(""));
    }

    @Test
    public void test416() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test416");
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
        org.apache.zeppelin.notebook.Note note16 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph17 = null;
        note16.addParagraph(paragraph17);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj19 = note16.getInfo();
        org.apache.zeppelin.scheduler.Job job20 = null;
        note16.onProgressUpdate(job20, (int) (byte) -1);
        boolean b23 = note16.isPersonalizedMode();
        org.apache.zeppelin.notebook.Note note24 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str25 = note24.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note26 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph27 = null;
        note26.addParagraph(paragraph27);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj29 = note26.getInfo();
        note24.setInfo(map_str_obj29);
        note16.setConfig(map_str_obj29);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo32 = null;
        try {
            s3NotebookRepo2.save(note16, authenticationInfo32);
            org.junit.Assert.fail("Expected exception of type java.io.IOException");
        } catch (java.io.IOException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj19);
        org.junit.Assert.assertTrue(b23 == false);
        org.junit.Assert.assertNotNull(list_map_str_str25);
        org.junit.Assert.assertNotNull(map_str_obj29);
    }

    @Test
    public void test417() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test417");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo7 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj6);
        org.apache.zeppelin.notebook.socket.Message message8 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        org.apache.zeppelin.notebook.socket.Message.OP oP9 = org.apache.zeppelin.notebook.socket.Message.OP.PING;
        message8.op = oP9;
        java.lang.String str11 = message8.ticket;
        org.apache.zeppelin.notebook.socket.Message message12 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj13 = message12.data;
        message8.data = map_str_obj13;
        java.util.Map<java.lang.String, java.util.Map<java.lang.String, java.lang.Object>> map_str_map_str_obj15 = org.apache.zeppelin.helium.Helium.createMixedConfig(map_str_obj6, map_str_obj13);
        org.junit.Assert.assertNotNull(map_str_obj6);
        org.junit.Assert.assertNotNull(message8);
        org.junit.Assert.assertTrue("'" + oP9 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PING + "'", oP9.equals(org.apache.zeppelin.notebook.socket.Message.OP.PING));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "anonymous" + "'", str11.equals("anonymous"));
        org.junit.Assert.assertNotNull(message12);
        org.junit.Assert.assertNotNull(map_str_obj13);
        org.junit.Assert.assertNotNull(map_str_map_str_obj15);
    }

    @Test
    public void test418() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test418");
        org.apache.zeppelin.helium.HeliumPackageSuggestion heliumPackageSuggestion0 = new org.apache.zeppelin.helium.HeliumPackageSuggestion();
        heliumPackageSuggestion0.sort();
    }

    @Test
    public void test419() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test419");
        try {
            org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("conf", "", "configuration");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test420() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test420");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        zeppelinConfiguration0.setEncoding(" ");
        boolean b10 = zeppelinConfiguration0.isAutoSave();
        java.math.BigDecimal bigDecimal12 = null;
        java.math.BigDecimal bigDecimal13 = zeppelinConfiguration0.getBigDecimal(".//local-repo", bigDecimal12);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(bigDecimal13);
    }

    @Test
    public void test421() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test421");
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
        org.apache.zeppelin.notebook.Note note12 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph13 = null;
        note12.addParagraph(paragraph13);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo15 = null;
        try {
            gitNotebookRepo11.save(note12, authenticationInfo15);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test422() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test422");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING;
        float f1 = confVars0.getFloatValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_AUTO_INTERPRETER_BINDING));
        org.junit.Assert.assertTrue(f1 == (-1.0f));
    }

    @Test
    public void test423() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test423");
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo notebookRepoSettingsInfo0 = new org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo();
        org.apache.zeppelin.notebook.Note note1 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str2 = note1.generateParagraphsInfo();
        notebookRepoSettingsInfo0.value = list_map_str_str2;
        java.lang.String str4 = notebookRepoSettingsInfo0.name;
        java.lang.String str5 = notebookRepoSettingsInfo0.name;
        org.junit.Assert.assertNotNull(list_map_str_str2);
        org.junit.Assert.assertNull(str4);
        org.junit.Assert.assertNull(str5);
    }

    @Test
    public void test424() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test424");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.lang.String[] str_array6 = zeppelinConfiguration0.getStringArray("bundles");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR;
        int i8 = zeppelinConfiguration0.getInt(confVars7);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration13 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration13.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo15 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration13);
        boolean b16 = zeppelinConfiguration13.isEmpty();
        boolean b17 = zeppelinConfiguration13.isAutoSave();
        java.io.File file18 = null;
        java.io.File file19 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory20 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration13, file18, file19);
        java.io.File file22 = heliumBundleFactory20.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration23 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration23.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo25 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration23);
        boolean b26 = zeppelinConfiguration23.isEmpty();
        boolean b27 = zeppelinConfiguration23.isAutoSave();
        java.io.File file28 = null;
        java.io.File file29 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory30 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration23, file28, file29);
        java.io.File file32 = heliumBundleFactory30.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory33 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph34 = null;
        heliumApplicationFactory33.unload(paragraph34, "zeppelin.dep.localrepo");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory37 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Note note38 = null;
        heliumApplicationFactory37.onNoteRemove(note38);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory40 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph41 = null;
        heliumApplicationFactory40.run(paragraph41, "local_modules");
        heliumApplicationFactory37.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory40);
        heliumApplicationFactory33.setApplicationEventListener((org.apache.zeppelin.helium.ApplicationEventListener) heliumApplicationFactory37);
        org.apache.zeppelin.helium.Helium helium46 = new org.apache.zeppelin.helium.Helium("yarn-cache", ".//conf/interpreter.json", file22, heliumBundleFactory30, heliumApplicationFactory37);
        org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry47 = new org.apache.zeppelin.helium.HeliumOnlineRegistry("", "bundles", file22);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration50 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration50.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo52 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration50);
        boolean b53 = zeppelinConfiguration50.isEmpty();
        boolean b54 = zeppelinConfiguration50.isAutoSave();
        java.io.File file55 = null;
        java.io.File file56 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory57 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration50, file55, file56);
        java.io.File file59 = heliumBundleFactory57.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration60 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration60.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo62 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration60);
        boolean b63 = zeppelinConfiguration60.isEmpty();
        boolean b64 = zeppelinConfiguration60.isAutoSave();
        java.io.File file65 = null;
        java.io.File file66 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory67 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration60, file65, file66);
        java.io.File file69 = heliumBundleFactory67.getHeliumPackageDirectory("~Trash");
        java.io.File file71 = heliumBundleFactory67.getHeliumPackageBundleCache(".//conf/interpreter-list");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory72 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph73 = null;
        heliumApplicationFactory72.run(paragraph73, "local_modules");
        org.apache.zeppelin.interpreter.InterpreterResult.Type type80 = null;
        heliumApplicationFactory72.onOutputUpdated("zeppelin", "hi!", 0, "", type80, "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage86 = null;
        heliumApplicationFactory72.onLoad(" ", ".//conf/.//conf/keystore", "{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}", heliumPackage86);
        org.apache.zeppelin.helium.Helium helium88 = new org.apache.zeppelin.helium.Helium("yarn-cache", "bundles", file59, heliumBundleFactory67, heliumApplicationFactory72);
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory89 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file22, file59);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(str_array6);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_DIR));
        org.junit.Assert.assertTrue(i8 == (-1));
        org.junit.Assert.assertTrue(b16 == true);
        org.junit.Assert.assertTrue(b17 == false);
        org.junit.Assert.assertNotNull(file22);
        org.junit.Assert.assertTrue(b26 == true);
        org.junit.Assert.assertTrue(b27 == false);
        org.junit.Assert.assertNotNull(file32);
        org.junit.Assert.assertTrue(b53 == true);
        org.junit.Assert.assertTrue(b54 == false);
        org.junit.Assert.assertNotNull(file59);
        org.junit.Assert.assertTrue(b63 == true);
        org.junit.Assert.assertTrue(b64 == false);
        org.junit.Assert.assertNotNull(file69);
        org.junit.Assert.assertNotNull(file71);
    }

    @Test
    public void test425() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test425");
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
        org.apache.zeppelin.notebook.Paragraph paragraph44 = null;
        try {
            org.apache.zeppelin.helium.HeliumPackageSuggestion heliumPackageSuggestion45 = helium40.suggestApp(paragraph44);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file23);
        org.junit.Assert.assertNull(file43);
    }

    @Test
    public void test426() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test426");
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
        java.lang.String str19 = zeppelinConfiguration0.getInterpreterSettingPath();
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
        org.junit.Assert.assertTrue("'" + str19 + "' != '" + ".//conf/interpreter.json" + "'", str19.equals(".//conf/interpreter.json"));
    }

    @Test
    public void test427() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test427");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        boolean b7 = zeppelinConfiguration0.isValidating();
        java.lang.Boolean b8 = zeppelinConfiguration0.credentialsPersist();
        java.lang.String str11 = zeppelinConfiguration0.getString("interpreter.json", "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertTrue("'" + b8 + "' != '" + true + "'", b8.equals(true));
        org.junit.Assert.assertTrue("'" + str11 + "' != '" + "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}" + "'", str11.equals("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}"));
    }

    @Test
    public void test428() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test428");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        zeppelinConfiguration0.setProperty("X-Watcher-Key", (java.lang.Object) ".//helium,https://s3.amazonaws.com/helium-package/helium.json");
        boolean b9 = zeppelinConfiguration0.getBoolean("src", true);
        java.lang.Boolean b12 = zeppelinConfiguration0.getBoolean("mongodb://localhost", (java.lang.Boolean) true);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(b9 == true);
        org.junit.Assert.assertTrue("'" + b12 + "' != '" + true + "'", b12.equals(true));
    }

    @Test
    public void test429() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test429");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.util.List<java.lang.String> list_str8 = zeppelinConfiguration0.getAllowedOrigins();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration9 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str10 = zeppelinConfiguration9.getHeliumRegistry();
        zeppelinConfiguration9.setRootElementName(" ");
        java.lang.String str13 = zeppelinConfiguration9.getSystemID();
        java.lang.String str14 = zeppelinConfiguration9.getBucketName();
        boolean b15 = zeppelinConfiguration9.isAutoSave();
        zeppelinConfiguration0.addConfigurationListener((org.apache.commons.configuration.event.ConfigurationListener) zeppelinConfiguration9);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_str8);
        org.junit.Assert.assertTrue("'" + str10 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str10.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertNull(str13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "zeppelin" + "'", str14.equals("zeppelin"));
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test430() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test430");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.clear();
        java.lang.Object obj3 = zeppelinConfiguration0.getReloadLock();
        try {
            org.apache.commons.configuration.SubnodeConfiguration subnodeConfiguration5 = zeppelinConfiguration0.configurationAt("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNotNull(obj3);
    }

    @Test
    public void test431() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test431");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.clear();
        java.lang.String str3 = zeppelinConfiguration0.getInterpreterMvnRepoPath();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str3 + "' != '" + "http://repo1.maven.org/maven2/" + "'", str3.equals("http://repo1.maven.org/maven2/"));
    }

    @Test
    public void test432() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test432");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.util.Properties properties8 = zeppelinConfiguration0.getProperties("{\"op\":\"PING\",\"data\":{\"token\":\"src\"},\"meta\":{}}");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertNotNull(properties8);
    }

    @Test
    public void test433() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test433");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR;
        java.lang.String str1 = confVars0.getStringValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "0.0.0.0" + "'", str1.equals("0.0.0.0"));
    }

    @Test
    public void test434() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test434");
        org.apache.zeppelin.notebook.socket.Message message0 = org.apache.zeppelin.notebook.socket.Message.EMPTY;
        java.lang.String str1 = message0.roles;
        java.lang.String str2 = message0.ticket;
        message0.principal = "0.8.0-SNAPSHOT";
        org.junit.Assert.assertNotNull(message0);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue("'" + str2 + "' != '" + "anonymous" + "'", str2.equals("anonymous"));
    }

    @Test
    public void test435() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test435");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize("src", "", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat4 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat zeppelinHeartbeat6 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHeartbeat.newInstance(zeppelinClient3);
        zeppelinClient3.removeNoteConnection(".//local-repo");
        org.junit.Assert.assertNotNull(zeppelinClient3);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat4);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat5);
        org.junit.Assert.assertNotNull(zeppelinHeartbeat6);
    }

    @Test
    public void test436() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test436");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        java.lang.String str9 = zeppelinConfiguration0.getInterpreterListPath();
        double d12 = zeppelinConfiguration0.getDouble(" ", (double) (byte) 100);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + ".//conf/interpreter-list" + "'", str9.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue(d12 == 100.0d);
    }

    @Test
    public void test437() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test437");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterRemoteRunnerPath();
        java.lang.String str7 = zeppelinConfiguration0.getUser();
        boolean b8 = zeppelinConfiguration0.isAnonymousAllowed();
        long long11 = zeppelinConfiguration0.getLong("configuration", (long) (byte) 100);
        int i13 = zeppelinConfiguration0.getMaxIndex("0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4");
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue(long11 == 100L);
        org.junit.Assert.assertTrue(i13 == (-1));
    }

    @Test
    public void test438() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test438");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption1 = null;
        interpreterSetting0.setOption(interpreterOption1);
        interpreterSetting0.setPath("./conf/interpreter.json");
        org.apache.zeppelin.interpreter.InterpreterSetting.Status status5 = org.apache.zeppelin.interpreter.InterpreterSetting.Status.ERROR;
        interpreterSetting0.setStatus(status5);
        org.junit.Assert.assertTrue("'" + status5 + "' != '" + org.apache.zeppelin.interpreter.InterpreterSetting.Status.ERROR + "'", status5.equals(org.apache.zeppelin.interpreter.InterpreterSetting.Status.ERROR));
    }

    @Test
    public void test439() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test439");
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
        org.apache.commons.configuration.Configuration configuration22 = zeppelinConfiguration13.interpolatedConfiguration();
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
        org.junit.Assert.assertNotNull(configuration22);
    }

    @Test
    public void test440() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test440");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.util.Set<java.lang.String> set_str3 = notebookAuthorization0.getRoles("zeppelin.dep.localrepo");
        java.lang.String[] str_array20 = new java.lang.String[] { "heliumBundles", "heliumBundles", "yarn-cache", "heliumBundles", "", "zeppelin.dep.localrepo", "hi!", "hi!", "~Trash", "heliumBundles", "~Trash", "yarn-cache", ".//bin/interpreter.sh", "", "helium.bundle.js" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        notebookAuthorization0.setReaders("hi!", (java.util.Set<java.lang.String>) linkedhashset_str21);
        java.util.Set<java.lang.String> set_str25 = notebookAuthorization0.getRoles(" ");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization27 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b28 = notebookAuthorization27.isPublic();
        java.lang.String[] str_array37 = new java.lang.String[] { "heliumBundles", "yarn-cache", "X-Watcher-Key", "X-Watcher-Key", "hi!", "zeppelin.dep.localrepo", "local_modules", "local_modules" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str38 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b39 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str38, str_array37);
        boolean b41 = notebookAuthorization27.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str38, "X-Zeppelin-Token");
        java.lang.String[] str_array68 = new java.lang.String[] { "anonymous", "load.js", "anonymous", "hi!", "anonymous", "zeppelin", "configuration", "load.js", " ", "src", "zeppelin", ".//bin/interpreter.sh", "load.js", "zeppelin.dep.localrepo", "1024000", "2CHF9171K", ".//conf/interpreter.json", ".//conf/interpreter.json", ".//conf/interpreter.json", "heliumBundles", "heliumBundles", "0d0382ec-ee2b-45d7-948b-20f9e7ebb9c4", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "src", ".//0.0.0.0" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str69 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b70 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str69, str_array68);
        boolean b71 = notebookAuthorization27.isWriter(".//conf/interpreter-list", (java.util.Set<java.lang.String>) linkedhashset_str69);
        notebookAuthorization0.setOwners("conf", (java.util.Set<java.lang.String>) linkedhashset_str69);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(set_str3);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set_str25);
        org.junit.Assert.assertNotNull(notebookAuthorization27);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertNotNull(str_array37);
        org.junit.Assert.assertTrue(b39 == true);
        org.junit.Assert.assertTrue(b41 == true);
        org.junit.Assert.assertNotNull(str_array68);
        org.junit.Assert.assertTrue(b70 == true);
        org.junit.Assert.assertTrue(b71 == true);
    }

    @Test
    public void test441() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test441");
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
        zeppelinConfiguration0.setValidating(false);
        java.lang.Float f22 = zeppelinConfiguration0.getFloat(".//conf/notebook-authorization.json", (java.lang.Float) 100.0f);
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertNotNull(list_hierarchicalConfiguration15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "configuration" + "'", str16.equals("configuration"));
        org.junit.Assert.assertNotNull(strSubstitutor17);
        org.junit.Assert.assertTrue("'" + f22 + "' != '" + 100.0f + "'", f22.equals(100.0f));
    }

    @Test
    public void test442() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test442");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_JSON;
        java.lang.String str1 = confVars0.getStringValue();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_JSON + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_JSON));
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "interpreter-setting.json" + "'", str1.equals("interpreter-setting.json"));
    }

    @Test
    public void test443() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test443");
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
        try {
            long long23 = zeppelinConfiguration13.getLong(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
            org.junit.Assert.fail("Expected exception of type java.util.NoSuchElementException");
        } catch (java.util.NoSuchElementException e) {
        }
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
    }

    @Test
    public void test444() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test444");
        boolean b1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.isZeppelinHubOp("heliumBundles");
        org.junit.Assert.assertTrue(b1 == false);
    }

    @Test
    public void test445() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test445");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
        java.lang.String[] str_array11 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str12 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b13 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str12, str_array11);
        notebookAuthorization1.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str12);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization16 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b17 = notebookAuthorization16.isPublic();
        java.lang.String[] str_array26 = new java.lang.String[] { "heliumBundles", "yarn-cache", "X-Watcher-Key", "X-Watcher-Key", "hi!", "zeppelin.dep.localrepo", "local_modules", "local_modules" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str27 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b28 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str27, str_array26);
        boolean b30 = notebookAuthorization16.hasReadAuthorization((java.util.Set<java.lang.String>) linkedhashset_str27, "X-Zeppelin-Token");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration32 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization33 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration32);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization35 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b36 = notebookAuthorization35.isPublic();
        java.lang.String[] str_array44 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str45 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b46 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str45, str_array44);
        notebookAuthorization35.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str45);
        notebookAuthorization33.setOwners("src", (java.util.Set<java.lang.String>) linkedhashset_str45);
        notebookAuthorization16.setOwners("notes", (java.util.Set<java.lang.String>) linkedhashset_str45);
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration51 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization52 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration51);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization54 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b55 = notebookAuthorization54.isPublic();
        java.lang.String[] str_array63 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str64 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b65 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str64, str_array63);
        notebookAuthorization54.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str64);
        notebookAuthorization52.setOwners("src", (java.util.Set<java.lang.String>) linkedhashset_str64);
        java.util.Set<java.lang.String> set_str69 = notebookAuthorization52.getOwners("notebook");
        boolean b70 = notebookAuthorization16.isOwner("X-Zeppelin-Token", set_str69);
        notebookAuthorization1.setOwners(" ", set_str69);
        org.junit.Assert.assertNotNull(notebookAuthorization1);
        org.junit.Assert.assertNotNull(str_array11);
        org.junit.Assert.assertTrue(b13 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization16);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(str_array26);
        org.junit.Assert.assertTrue(b28 == true);
        org.junit.Assert.assertTrue(b30 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization33);
        org.junit.Assert.assertNotNull(notebookAuthorization35);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertNotNull(str_array44);
        org.junit.Assert.assertTrue(b46 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization52);
        org.junit.Assert.assertNotNull(notebookAuthorization54);
        org.junit.Assert.assertTrue(b55 == true);
        org.junit.Assert.assertNotNull(str_array63);
        org.junit.Assert.assertTrue(b65 == true);
        org.junit.Assert.assertNotNull(set_str69);
        org.junit.Assert.assertTrue(b70 == true);
    }

    @Test
    public void test446() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test446");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj7 = null;
        note0.setConfig(map_str_obj7);
        org.apache.zeppelin.user.Credentials credentials9 = note0.getCredentials();
        org.apache.zeppelin.scheduler.Job job10 = null;
        org.apache.zeppelin.scheduler.Job.Status status11 = null;
        org.apache.zeppelin.scheduler.Job.Status status12 = null;
        note0.beforeStatusChange(job10, status11, status12);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo14 = null;
        try {
            org.apache.zeppelin.notebook.Paragraph paragraph15 = note0.addNewParagraph(authenticationInfo14);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertNull(credentials9);
    }

    @Test
    public void test447() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test447");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.setRootElementName(" ");
        java.lang.String str4 = zeppelinConfiguration0.getInterpreterJson();
        zeppelinConfiguration0.clearProperty("~Trash");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "interpreter-setting.json" + "'", str4.equals("interpreter-setting.json"));
    }

    @Test
    public void test448() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test448");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        boolean b7 = note0.isPersonalizedMode();
        org.apache.zeppelin.notebook.Note note8 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str9 = note8.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note10 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph11 = null;
        note10.addParagraph(paragraph11);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj13 = note10.getInfo();
        note8.setInfo(map_str_obj13);
        note0.setConfig(map_str_obj13);
        try {
            java.util.Map<java.lang.String, java.lang.String> map_str_str17 = note0.generateSingleParagraphInfo("conf");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue(b7 == false);
        org.junit.Assert.assertNotNull(list_map_str_str9);
        org.junit.Assert.assertNotNull(map_str_obj13);
    }

    @Test
    public void test449() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test449");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        short s11 = zeppelinConfiguration0.getShort(".//conf/interpreter.json", (short) 1);
        boolean b12 = zeppelinConfiguration0.isValidating();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertTrue(s11 == (short) 1);
        org.junit.Assert.assertTrue(b12 == false);
    }

    @Test
    public void test450() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test450");
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
        heliumApplicationFactory0.onOutputUpdated("mongodb://localhost", "heliumBundles", (int) (byte) 0, "heliumBundles", type19, "http://registry.npmjs.org/");
    }

    @Test
    public void test451() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test451");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        java.util.Properties properties6 = null;
        java.util.Properties properties7 = zeppelinConfiguration2.getProperties("bundles", properties6);
        java.lang.String str8 = zeppelinConfiguration2.getInterpreterRemoteRunnerPath();
        java.lang.String str9 = zeppelinConfiguration2.getUser();
        boolean b10 = zeppelinConfiguration2.isAnonymousAllowed();
        zeppelinConfiguration2.setThrowExceptionOnMissing(false);
        zeppelinConfiguration2.setBasePath("yarn-cache");
        org.apache.commons.configuration.reloading.ReloadingStrategy reloadingStrategy15 = zeppelinConfiguration2.getReloadingStrategy();
        java.lang.String str16 = zeppelinConfiguration2.getHeliumNpmRegistry();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient zeppelinClient17 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinClient.initialize(" ", "{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}", zeppelinConfiguration2);
        org.apache.zeppelin.notebook.repo.VFSNotebookRepo vFSNotebookRepo18 = new org.apache.zeppelin.notebook.repo.VFSNotebookRepo(zeppelinConfiguration2);
        org.apache.zeppelin.notebook.Note note19 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph20 = null;
        note19.addParagraph(paragraph20);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj22 = note19.getInfo();
        org.apache.zeppelin.scheduler.Job job23 = null;
        note19.onProgressUpdate(job23, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj26 = note19.getInfo();
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo27 = null;
        try {
            vFSNotebookRepo18.save(note19, authenticationInfo27);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(properties7);
        org.junit.Assert.assertTrue("'" + str8 + "' != '" + ".//bin/interpreter.sh" + "'", str8.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str9 + "' != '" + "user" + "'", str9.equals("user"));
        org.junit.Assert.assertTrue(b10 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy15);
        org.junit.Assert.assertTrue("'" + str16 + "' != '" + "http://registry.npmjs.org/" + "'", str16.equals("http://registry.npmjs.org/"));
        org.junit.Assert.assertNotNull(zeppelinClient17);
        org.junit.Assert.assertNotNull(map_str_obj22);
        org.junit.Assert.assertNotNull(map_str_obj26);
    }

    @Test
    public void test452() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test452");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        boolean b2 = zeppelinConfiguration0.isDetailEvents();
        java.io.OutputStream outputStream3 = null;
        try {
            zeppelinConfiguration0.save(outputStream3, "./conf/interpreter.json");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b2 == false);
    }

    @Test
    public void test453() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test453");
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
        java.io.File file37 = heliumBundleFactory19.getHeliumPackageBundleCache("JKS");
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
        org.junit.Assert.assertNotNull(file37);
    }

    @Test
    public void test454() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test454");
        org.apache.zeppelin.notebook.Folder folder1 = new org.apache.zeppelin.notebook.Folder(".//conf/interpreter.json");
        int i2 = folder1.countNotes();
        java.util.Map<java.lang.String, org.apache.zeppelin.notebook.Folder> map_str_folder3 = folder1.getChildren();
        org.apache.zeppelin.notebook.Note note4 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str5 = note4.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note7 = note4.getUserNote("heliumBundles");
        boolean b8 = note7.isPersonalizedMode();
        note7.setPersonalizedMode((java.lang.Boolean) true);
        folder1.addNote(note7);
        org.apache.zeppelin.notebook.FolderListener folderListener12 = null;
        folder1.addFolderListener(folderListener12);
        org.junit.Assert.assertTrue(i2 == 0);
        org.junit.Assert.assertNotNull(map_str_folder3);
        org.junit.Assert.assertNotNull(list_map_str_str5);
        org.junit.Assert.assertNotNull(note7);
        org.junit.Assert.assertTrue(b8 == false);
    }

    @Test
    public void test455() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test455");
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
            zeppelinConfiguration0.load();
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
    public void test456() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test456");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance("mongodb://localhost");
        zeppelinhubWebsocket1.onWebSocketText(" ");
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
    }

    @Test
    public void test457() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test457");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        org.w3c.dom.Document document3 = zeppelinConfiguration0.getDocument();
        java.lang.String str4 = zeppelinConfiguration0.getEndpoint();
        org.apache.zeppelin.notebook.repo.MongoNotebookRepo mongoNotebookRepo5 = new org.apache.zeppelin.notebook.repo.MongoNotebookRepo(zeppelinConfiguration0);
        org.apache.zeppelin.user.AuthenticationInfo authenticationInfo8 = null;
        org.apache.zeppelin.notebook.repo.NotebookRepo.Revision revision9 = mongoNotebookRepo5.checkpoint(".//conf", "", authenticationInfo8);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(document3);
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "s3.amazonaws.com" + "'", str4.equals("s3.amazonaws.com"));
        org.junit.Assert.assertNotNull(revision9);
    }

    @Test
    public void test458() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test458");
        char char0 = org.apache.commons.configuration.AbstractConfiguration.getDefaultListDelimiter();
        org.junit.Assert.assertTrue(char0 == '#');
    }

    @Test
    public void test459() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test459");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        zeppelinhubClient2.initUser(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat5 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
        org.junit.Assert.assertNotNull(zeppelinhubClient2);
        org.junit.Assert.assertNotNull(zeppelinHubHeartbeat5);
    }

    @Test
    public void test460() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test460");
        org.apache.zeppelin.search.LuceneSearch luceneSearch0 = new org.apache.zeppelin.search.LuceneSearch();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str2 = luceneSearch0.query(".//bin/interpreter.sh");
        org.apache.zeppelin.notebook.Note note3 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph4 = null;
        note3.addParagraph(paragraph4);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj6 = note3.getInfo();
        try {
            luceneSearch0.updateIndexDoc(note3);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(list_map_str_str2);
        org.junit.Assert.assertNotNull(map_str_obj6);
    }

    @Test
    public void test461() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test461");
        org.apache.commons.configuration.tree.ExpressionEngine expressionEngine0 = null;
        try {
            org.apache.commons.configuration.HierarchicalConfiguration.setDefaultExpressionEngine(expressionEngine0);
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
    }

    @Test
    public void test462() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test462");
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
        java.lang.String str14 = zeppelinConfiguration0.getHeliumNpmRegistry();
        java.lang.Boolean b15 = zeppelinConfiguration0.credentialsPersist();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertNotNull(reloadingStrategy13);
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + "http://registry.npmjs.org/" + "'", str14.equals("http://registry.npmjs.org/"));
        org.junit.Assert.assertTrue("'" + b15 + "' != '" + true + "'", b15.equals(true));
    }

    @Test
    public void test463() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test463");
        org.apache.zeppelin.notebook.socket.Message.OP oP0 = org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED;
        org.junit.Assert.assertTrue("'" + oP0 + "' != '" + org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED + "'", oP0.equals(org.apache.zeppelin.notebook.socket.Message.OP.PARAGRAPH_REMOVED));
    }

    @Test
    public void test464() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test464");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        zeppelinConfiguration0.clear();
        boolean b4 = zeppelinConfiguration0.isWindowsPath("user");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertTrue(b4 == false);
    }

    @Test
    public void test465() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test465");
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars0 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_MAX_POOL_SIZE;
        java.lang.Class class1 = confVars0.getVarClass();
        org.junit.Assert.assertTrue("'" + confVars0 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_MAX_POOL_SIZE + "'", confVars0.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_MAX_POOL_SIZE));
        org.junit.Assert.assertNotNull(class1);
    }

    @Test
    public void test466() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test466");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage zeppelinhubMessage1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinhubMessage.deserialize("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}");
        org.junit.Assert.assertNotNull(zeppelinhubMessage1);
    }

    @Test
    public void test467() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test467");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization1 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration0);
        java.util.Set<java.lang.String> set_str3 = notebookAuthorization1.getWriters("");
        org.junit.Assert.assertNotNull(notebookAuthorization1);
        org.junit.Assert.assertNotNull(set_str3);
    }

    @Test
    public void test468() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test468");
        org.apache.zeppelin.interpreter.InterpreterInfoSaving interpreterInfoSaving0 = new org.apache.zeppelin.interpreter.InterpreterInfoSaving();
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str1 = interpreterInfoSaving0.interpreterBindings;
        java.util.List<org.sonatype.aether.repository.RemoteRepository> list_remoteRepository2 = interpreterInfoSaving0.interpreterRepositories;
        java.util.Map<java.lang.String, org.apache.zeppelin.interpreter.InterpreterSetting> map_str_interpreterSetting3 = interpreterInfoSaving0.interpreterSettings;
        org.sonatype.aether.repository.RemoteRepository[] remoteRepository_array4 = new org.sonatype.aether.repository.RemoteRepository[] {};
        java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository> arraylist_remoteRepository5 = new java.util.ArrayList<org.sonatype.aether.repository.RemoteRepository>();
        boolean b6 = java.util.Collections.addAll((java.util.Collection<org.sonatype.aether.repository.RemoteRepository>) arraylist_remoteRepository5, remoteRepository_array4);
        interpreterInfoSaving0.interpreterRepositories = arraylist_remoteRepository5;
        java.util.Map<java.lang.String, java.util.List<java.lang.String>> map_str_list_str8 = null;
        interpreterInfoSaving0.interpreterBindings = map_str_list_str8;
        org.junit.Assert.assertNull(map_str_list_str1);
        org.junit.Assert.assertNull(list_remoteRepository2);
        org.junit.Assert.assertNull(map_str_interpreterSetting3);
        org.junit.Assert.assertNotNull(remoteRepository_array4);
        org.junit.Assert.assertTrue(b6 == false);
    }

    @Test
    public void test469() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test469");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        java.math.BigDecimal bigDecimal7 = null;
        java.math.BigDecimal bigDecimal8 = zeppelinConfiguration0.getBigDecimal("helium.bundle.js", bigDecimal7);
        java.lang.String str9 = zeppelinConfiguration0.getFileName();
        boolean b10 = zeppelinConfiguration0.getMongoAutoimport();
        org.xml.sax.InputSource inputSource13 = zeppelinConfiguration0.resolveEntity("local_modules", "X-Zeppelin-Token");
        char char14 = zeppelinConfiguration0.getListDelimiter();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b10 == false);
        org.junit.Assert.assertNull(inputSource13);
        org.junit.Assert.assertTrue(char14 == '#');
    }

    @Test
    public void test470() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test470");
        org.apache.zeppelin.notebook.socket.WatcherMessage.Builder builder1 = org.apache.zeppelin.notebook.socket.WatcherMessage.builder("zeppelin.dep.localrepo");
        org.junit.Assert.assertNotNull(builder1);
    }

    @Test
    public void test471() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test471");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket1 = new org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket();
        byte[] byte_array7 = new byte[] { (byte) 0, (byte) 100, (byte) 0, (byte) 1, (byte) 100 };
        watcherWebsocket1.onWebSocketBinary(byte_array7, 10, (int) ' ');
        watcherWebsocket0.onWebSocketBinary(byte_array7, (int) (short) 0, 100);
        org.eclipse.jetty.websocket.api.Session session14 = null;
        watcherWebsocket0.connection = session14;
        org.eclipse.jetty.websocket.api.Session session16 = null;
        try {
            watcherWebsocket0.onWebSocketConnect(session16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(byte_array7);
    }

    @Test
    public void test472() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test472");
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
        org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
        try {
            heliumApplicationFactory11.onParagraphRemove(paragraph16);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
    }

    @Test
    public void test473() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test473");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        zeppelinConfiguration0.clearProperty("zeppelin");
        java.lang.String str4 = zeppelinConfiguration0.getMongoDatabase();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + str4 + "' != '" + "zeppelin" + "'", str4.equals("zeppelin"));
    }

    @Test
    public void test474() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test474");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration2 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration2.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo4 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration2);
        boolean b5 = zeppelinConfiguration2.isEmpty();
        boolean b6 = zeppelinConfiguration2.isAutoSave();
        java.io.File file7 = null;
        java.io.File file8 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory9 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration2, file7, file8);
        java.io.File file11 = heliumBundleFactory9.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage12 = null;
        java.io.File file15 = heliumBundleFactory9.buildPackage(heliumPackage12, true, true);
        java.io.File file17 = heliumBundleFactory9.getHeliumPackageDirectory(".//conf/.//conf/keystore");
        org.apache.zeppelin.helium.HeliumOnlineRegistry heliumOnlineRegistry18 = new org.apache.zeppelin.helium.HeliumOnlineRegistry(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo", ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo", file17);
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertNull(file15);
        org.junit.Assert.assertNotNull(file17);
    }

    @Test
    public void test475() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test475");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getKeyStorePassword();
        java.lang.String str2 = zeppelinConfiguration0.getS3KMSKeyRegion();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "" + "'", str1.equals(""));
        org.junit.Assert.assertNull(str2);
    }

    @Test
    public void test476() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test476");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.io.File file5 = null;
        java.io.File file6 = null;
        org.apache.zeppelin.helium.HeliumBundleFactory heliumBundleFactory7 = new org.apache.zeppelin.helium.HeliumBundleFactory(zeppelinConfiguration0, file5, file6);
        java.io.File file9 = heliumBundleFactory7.getHeliumPackageDirectory("~Trash");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage10 = null;
        java.io.File file13 = heliumBundleFactory7.buildPackage(heliumPackage10, true, true);
        java.io.File file15 = heliumBundleFactory7.getHeliumPackageDirectory(".//conf/.//conf/keystore");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage16 = null;
        java.lang.String[] str_array18 = new java.lang.String[] { "src" };
        try {
            heliumBundleFactory7.prepareSource(heliumPackage16, str_array18, "helium.bundle.js");
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(file9);
        org.junit.Assert.assertNull(file13);
        org.junit.Assert.assertNotNull(file15);
        org.junit.Assert.assertNotNull(str_array18);
    }

    @Test
    public void test477() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test477");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.util.Set<java.lang.String> set_str2 = notebookAuthorization0.getReaders(".//0.0.0.0");
        java.util.Set<java.lang.String> set_str4 = null;
        try {
            notebookAuthorization0.setReaders("b3883bc7-9096-4750-9b75-98964ffef420", set_str4);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(set_str2);
    }

    @Test
    public void test478() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test478");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket zeppelinhubWebsocket1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.ZeppelinhubWebsocket.newInstance(".//conf/interpreter-list");
        byte[] byte_array2 = null;
        zeppelinhubWebsocket1.onWebSocketBinary(byte_array2, (int) (short) 100, (int) (byte) 0);
        java.lang.Throwable throwable6 = null;
        zeppelinhubWebsocket1.onWebSocketError(throwable6);
        org.junit.Assert.assertNotNull(zeppelinhubWebsocket1);
    }

    @Test
    public void test479() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test479");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket watcherWebsocket0 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.listener.WatcherWebsocket.createInstace();
        org.eclipse.jetty.websocket.api.Session session1 = watcherWebsocket0.connection;
        org.junit.Assert.assertNotNull(watcherWebsocket0);
        org.junit.Assert.assertNull(session1);
    }

    @Test
    public void test480() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test480");
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
        org.apache.zeppelin.helium.HeliumPackage[] heliumPackage_array13 = new org.apache.zeppelin.helium.HeliumPackage[] {};
        java.util.ArrayList<org.apache.zeppelin.helium.HeliumPackage> arraylist_heliumPackage14 = new java.util.ArrayList<org.apache.zeppelin.helium.HeliumPackage>();
        boolean b15 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.helium.HeliumPackage>) arraylist_heliumPackage14, heliumPackage_array13);
        heliumBundleFactory7.buildAllPackages((java.util.List<org.apache.zeppelin.helium.HeliumPackage>) arraylist_heliumPackage14, false);
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNotNull(list_heliumPackage11);
        org.junit.Assert.assertNotNull(heliumPackage_array13);
        org.junit.Assert.assertTrue(b15 == false);
    }

    @Test
    public void test481() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test481");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.math.BigDecimal bigDecimal4 = zeppelinConfiguration0.getBigDecimal("src");
        org.w3c.dom.Document document5 = null;
        try {
            zeppelinConfiguration0.initProperties(document5, false);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertNull(bigDecimal4);
    }

    @Test
    public void test482() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test482");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        boolean b4 = zeppelinConfiguration0.isAutoSave();
        java.math.BigDecimal bigDecimal6 = zeppelinConfiguration0.getBigDecimal("");
        zeppelinConfiguration0.setListDelimiter(' ');
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertNull(bigDecimal6);
    }

    @Test
    public void test483() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test483");
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
        java.util.List<java.lang.Object> list_obj16 = zeppelinConfiguration0.getList("X-Zeppelin-Token");
        zeppelinConfiguration0.clear();
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertNull(bigDecimal8);
        org.junit.Assert.assertNull(str9);
        org.junit.Assert.assertTrue(b11 == false);
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + "zeppelin" + "'", str12.equals("zeppelin"));
        org.junit.Assert.assertNotNull(list_obj16);
    }

    @Test
    public void test484() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test484");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b1 = notebookAuthorization0.isPublic();
        java.util.Set<java.lang.String> set_str3 = notebookAuthorization0.getRoles("zeppelin.dep.localrepo");
        java.lang.String[] str_array20 = new java.lang.String[] { "heliumBundles", "heliumBundles", "yarn-cache", "heliumBundles", "", "zeppelin.dep.localrepo", "hi!", "hi!", "~Trash", "heliumBundles", "~Trash", "yarn-cache", ".//bin/interpreter.sh", "", "helium.bundle.js" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str21 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b22 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str21, str_array20);
        notebookAuthorization0.setReaders("hi!", (java.util.Set<java.lang.String>) linkedhashset_str21);
        java.util.Set<java.lang.String> set_str25 = notebookAuthorization0.getRoles(" ");
        java.util.Set<java.lang.String> set_str27 = notebookAuthorization0.getWriters(".//bin/interpreter.sh");
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertTrue(b1 == true);
        org.junit.Assert.assertNotNull(set_str3);
        org.junit.Assert.assertNotNull(str_array20);
        org.junit.Assert.assertTrue(b22 == true);
        org.junit.Assert.assertNotNull(set_str25);
        org.junit.Assert.assertNotNull(set_str27);
    }

    @Test
    public void test485() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test485");
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
        try {
            java.lang.String str40 = note36.getNameWithoutPath();
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b5 == true);
        org.junit.Assert.assertTrue(b6 == false);
        org.junit.Assert.assertNotNull(file11);
        org.junit.Assert.assertTrue(b15 == true);
        org.junit.Assert.assertTrue(b16 == false);
        org.junit.Assert.assertNotNull(file21);
    }

    @Test
    public void test486() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test486");
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
        org.apache.zeppelin.notebook.repo.NotebookRepoWithSettings notebookRepoWithSettings19 = builder17.build();
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
        org.junit.Assert.assertNotNull(notebookRepoWithSettings19);
    }

    @Test
    public void test487() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test487");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration4.clear();
        zeppelinConfiguration0.copy((org.apache.commons.configuration.Configuration) zeppelinConfiguration4);
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED;
        java.lang.String str8 = zeppelinConfiguration0.getString(confVars7);
        zeppelinConfiguration0.save("X-Watcher-Key");
        org.junit.Assert.assertTrue(b3 == true);
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ANONYMOUS_ALLOWED));
        org.junit.Assert.assertNull(str8);
    }

    @Test
    public void test488() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test488");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.util.Properties properties4 = null;
        java.util.Properties properties5 = zeppelinConfiguration0.getProperties("bundles", properties4);
        java.lang.String str6 = zeppelinConfiguration0.getInterpreterListPath();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars7 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO;
        long long8 = confVars7.getLongValue();
        float f9 = zeppelinConfiguration0.getFloat(confVars7);
        org.apache.commons.configuration.event.ConfigurationEvent configurationEvent10 = null;
        try {
            zeppelinConfiguration0.configurationChanged(configurationEvent10);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//conf/interpreter-list" + "'", str6.equals(".//conf/interpreter-list"));
        org.junit.Assert.assertTrue("'" + confVars7 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO + "'", confVars7.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_DEP_MVNREPO));
        org.junit.Assert.assertTrue(long8 == (-1L));
        org.junit.Assert.assertTrue(f9 == (-1.0f));
    }

    @Test
    public void test489() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test489");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        java.lang.Boolean b2 = zeppelinConfiguration0.credentialsPersist();
        java.lang.Boolean b5 = zeppelinConfiguration0.getBoolean("src", (java.lang.Boolean) false);
        boolean b7 = zeppelinConfiguration0.containsKey("s3.amazonaws.com");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue("'" + b2 + "' != '" + true + "'", b2.equals(true));
        org.junit.Assert.assertTrue("'" + b5 + "' != '" + false + "'", b5.equals(false));
        org.junit.Assert.assertTrue(b7 == false);
    }

    @Test
    public void test490() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test490");
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
        java.lang.Boolean b16 = zeppelinConfiguration0.credentialsPersist();
        org.junit.Assert.assertNotNull(properties5);
        org.junit.Assert.assertTrue("'" + str6 + "' != '" + ".//bin/interpreter.sh" + "'", str6.equals(".//bin/interpreter.sh"));
        org.junit.Assert.assertTrue("'" + str7 + "' != '" + "user" + "'", str7.equals("user"));
        org.junit.Assert.assertTrue(b8 == true);
        org.junit.Assert.assertTrue("'" + confVars11 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE + "'", confVars11.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_NOTEBOOK_STORAGE));
        org.junit.Assert.assertTrue("'" + str12 + "' != '" + ".//org.apache.zeppelin.notebook.repo.GitNotebookRepo" + "'", str12.equals(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo"));
        org.junit.Assert.assertTrue("'" + confVars13 + "' != '" + org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR + "'", confVars13.equals(org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_ADDR));
        org.junit.Assert.assertTrue("'" + str14 + "' != '" + ".//0.0.0.0" + "'", str14.equals(".//0.0.0.0"));
        org.junit.Assert.assertNull(str15);
        org.junit.Assert.assertTrue("'" + b16 + "' != '" + true + "'", b16.equals(true));
    }

    @Test
    public void test491() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test491");
        java.lang.String str1 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.pingMessage(".//org.apache.zeppelin.notebook.repo.GitNotebookRepo");
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + "{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}" + "'", str1.equals("{\"op\":\"PING\",\"data\":{\"token\":\".//org.apache.zeppelin.notebook.repo.GitNotebookRepo\"},\"meta\":{}}"));
    }

    @Test
    public void test492() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test492");
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
        boolean b22 = zeppelinConfiguration0.isEmpty();
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
        org.junit.Assert.assertTrue(b22 == true);
    }

    @Test
    public void test493() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test493");
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
        boolean b50 = notebookRepoWithSettings4.isEmpty();
        org.junit.Assert.assertNotNull(notebookRepoWithSettings4);
        org.junit.Assert.assertTrue("'" + str5 + "' != '" + "X-Watcher-Key" + "'", str5.equals("X-Watcher-Key"));
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
        org.junit.Assert.assertTrue(b50 == true);
    }

    @Test
    public void test494() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test494");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        boolean b4 = note0.isNameEmpty();
        org.apache.zeppelin.notebook.Paragraph paragraph5 = null;
        org.apache.zeppelin.interpreter.InterpreterResultMessage interpreterResultMessage7 = null;
        note0.onOutputUpdate(paragraph5, (int) '4', interpreterResultMessage7);
        org.junit.Assert.assertNotNull(map_str_obj3);
        org.junit.Assert.assertTrue(b4 == true);
    }

    @Test
    public void test495() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test495");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        java.lang.String str1 = zeppelinConfiguration0.getHeliumRegistry();
        char char2 = zeppelinConfiguration0.getListDelimiter();
        java.lang.Double d5 = zeppelinConfiguration0.getDouble("", (java.lang.Double) 100.0d);
        org.junit.Assert.assertTrue("'" + str1 + "' != '" + ".//helium,https://s3.amazonaws.com/helium-package/helium.json" + "'", str1.equals(".//helium,https://s3.amazonaws.com/helium-package/helium.json"));
        org.junit.Assert.assertTrue(char2 == '#');
        org.junit.Assert.assertTrue("'" + d5 + "' != '" + 100.0d + "'", d5.equals(100.0d));
    }

    @Test
    public void test496() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test496");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        boolean b3 = zeppelinConfiguration0.isEmpty();
        org.apache.zeppelin.dep.DependencyResolver dependencyResolver4 = null;
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption5 = null;
        try {
            org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager6 = new org.apache.zeppelin.interpreter.InterpreterSettingManager(zeppelinConfiguration0, dependencyResolver4, interpreterOption5);
            org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
        } catch (java.lang.NullPointerException e) {
        }
        org.junit.Assert.assertTrue(b3 == true);
    }

    @Test
    public void test497() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test497");
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
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner14 = interpreterSetting12.getInterpreterRunner();
        java.lang.String str15 = interpreterSetting12.getPath();
        org.junit.Assert.assertNotNull(interpreterInfo_array2);
        org.junit.Assert.assertTrue(b4 == false);
        org.junit.Assert.assertTrue("'" + zeppelinHubOp5 + "' != '" + org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE + "'", zeppelinHubOp5.equals(org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE));
        org.junit.Assert.assertNotNull(dependency_array6);
        org.junit.Assert.assertTrue(b8 == false);
        org.junit.Assert.assertNotNull(list_dependency13);
        org.junit.Assert.assertNull(interpreterRunner14);
        org.junit.Assert.assertTrue("'" + str15 + "' != '" + "helium.bundle.js" + "'", str15.equals("helium.bundle.js"));
    }

    @Test
    public void test498() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test498");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
        org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer userTokenContainer3 = org.apache.zeppelin.notebook.repo.zeppelinhub.model.UserTokenContainer.init(zeppelinhubRestApiHandler1, "anonymous");
        try {
            java.util.List<org.apache.zeppelin.notebook.repo.zeppelinhub.model.Instance> list_instance5 = zeppelinhubRestApiHandler1.getInstances("{\"op\":\"helium.bundle.js\",\"data\":{\"noteId\":\"heliumBundles\",\"message\":\" \"},\"meta\":{}}");
            org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
        } catch (java.lang.IllegalArgumentException e) {
        }
        org.junit.Assert.assertNotNull(zeppelinhubRestApiHandler1);
        org.junit.Assert.assertNotNull(userTokenContainer3);
    }

    @Test
    public void test499() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test499");
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization0 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        java.util.Set<java.lang.String> set_str2 = notebookAuthorization0.getReaders(".//0.0.0.0");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration4 = null;
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization5 = org.apache.zeppelin.notebook.NotebookAuthorization.init(zeppelinConfiguration4);
        java.lang.String[] str_array15 = new java.lang.String[] { "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", " ", ".//helium,https://s3.amazonaws.com/helium-package/helium.json", "local_modules", "X-Watcher-Key", "zeppelin.dep.localrepo", "", "bundles" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str16 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b17 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str16, str_array15);
        notebookAuthorization5.setReaders("zeppelin.dep.localrepo", (java.util.Set<java.lang.String>) linkedhashset_str16);
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization20 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b21 = notebookAuthorization20.isPublic();
        org.apache.zeppelin.notebook.NotebookAuthorization notebookAuthorization23 = org.apache.zeppelin.notebook.NotebookAuthorization.getInstance();
        boolean b24 = notebookAuthorization23.isPublic();
        java.lang.String[] str_array32 = new java.lang.String[] { "", "X-Zeppelin-Token", "heliumBundles", "", "X-Watcher-Key", "hi!" };
        java.util.LinkedHashSet<java.lang.String> linkedhashset_str33 = new java.util.LinkedHashSet<java.lang.String>();
        boolean b34 = java.util.Collections.addAll((java.util.Collection<java.lang.String>) linkedhashset_str33, str_array32);
        notebookAuthorization23.setWriters("", (java.util.Set<java.lang.String>) linkedhashset_str33);
        boolean b36 = notebookAuthorization20.isWriter("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}", (java.util.Set<java.lang.String>) linkedhashset_str33);
        boolean b37 = notebookAuthorization5.isOwner("load.js", (java.util.Set<java.lang.String>) linkedhashset_str33);
        boolean b38 = notebookAuthorization0.isReader("./conf/interpreter.json", (java.util.Set<java.lang.String>) linkedhashset_str33);
        org.junit.Assert.assertNotNull(notebookAuthorization0);
        org.junit.Assert.assertNotNull(set_str2);
        org.junit.Assert.assertNotNull(notebookAuthorization5);
        org.junit.Assert.assertNotNull(str_array15);
        org.junit.Assert.assertTrue(b17 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization20);
        org.junit.Assert.assertTrue(b21 == true);
        org.junit.Assert.assertNotNull(notebookAuthorization23);
        org.junit.Assert.assertTrue(b24 == true);
        org.junit.Assert.assertNotNull(str_array32);
        org.junit.Assert.assertTrue(b34 == true);
        org.junit.Assert.assertTrue(b36 == true);
        org.junit.Assert.assertTrue(b37 == true);
        org.junit.Assert.assertTrue(b38 == true);
    }

    @Test
    public void test500() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "RegressionTest0.test500");
        org.eclipse.jetty.websocket.api.Session session0 = null;
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession zeppelinhubSession2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.session.ZeppelinhubSession.createInstance(session0, "zeppelin");
        org.junit.Assert.assertNotNull(zeppelinhubSession2);
    }
}

