import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

    public static boolean debug = false;

    @Test
    public void test01() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test01");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userSwitchTokenRoutine("", "", "X-Zeppelin-Token");
    }

    @Test
    public void test02() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test02");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory5 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager6 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph7 = new org.apache.zeppelin.notebook.Paragraph(note0, (org.apache.zeppelin.scheduler.JobListener) note2, interpreterFactory5, interpreterSettingManager6);
        org.junit.Assert.assertTrue("Contract failed: !paragraph7.equals(null)", !paragraph7.equals(null));
    }

    @Test
    public void test03() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test03");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("yarn-cache");
    }

    @Test
    public void test04() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test04");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
        org.apache.zeppelin.notebook.ApplicationState applicationState2 = new org.apache.zeppelin.notebook.ApplicationState(".//helium,https://s3.amazonaws.com/helium-package/helium.json", heliumPackage1);
        org.junit.Assert.assertTrue("Contract failed: applicationState2.equals(applicationState2)", applicationState2.equals(applicationState2));
    }

    @Test
    public void test05() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test05");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        note0.addParagraph(paragraph1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj3 = note0.getInfo();
        org.apache.zeppelin.scheduler.Job job4 = null;
        note0.onProgressUpdate(job4, (int) (byte) -1);
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
        note7.addParagraph(paragraph8);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = note7.getInfo();
        org.apache.zeppelin.scheduler.Job job11 = null;
        note7.onProgressUpdate(job11, (int) (byte) -1);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj14 = null;
        note7.setConfig(map_str_obj14);
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory16 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager17 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph18 = new org.apache.zeppelin.notebook.Paragraph(note0, (org.apache.zeppelin.scheduler.JobListener) note7, interpreterFactory16, interpreterSettingManager17);
        org.junit.Assert.assertTrue("Contract failed: !paragraph18.equals(null)", !paragraph18.equals(null));
    }

    @Test
    public void test06() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test06");
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory0 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph1 = null;
        heliumApplicationFactory0.unload(paragraph1, "zeppelin.dep.localrepo");
        org.apache.zeppelin.notebook.Note note4 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str5 = note4.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note7 = note4.getUserNote("heliumBundles");
        heliumApplicationFactory0.onNoteRemove(note4);
        org.apache.zeppelin.notebook.Note note9 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str10 = note9.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note12 = note9.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str14 = note9.generateSingleParagraphInfo(".//conf/interpreter-list");
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory15 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager16 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph17 = new org.apache.zeppelin.notebook.Paragraph(note4, (org.apache.zeppelin.scheduler.JobListener) note9, interpreterFactory15, interpreterSettingManager16);
        org.junit.Assert.assertTrue("Contract failed: !paragraph17.equals(null)", !paragraph17.equals(null));
    }

    @Test
    public void test07() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test07");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        java.util.List<org.apache.zeppelin.interpreter.thrift.InterpreterCompletion> list_interpreterCompletion5 = note0.completion("user", "X-Watcher-Key", (int) 'a');
    }

    @Test
    public void test08() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test08");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLoginRoutine(".//conf/interpreter.json");
    }

    @Test
    public void test09() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test09");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note0.isPersonalizedMode();
        java.lang.String str5 = note0.getNameWithoutPath();
    }

    @Test
    public void test10() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test10");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("zeppelin");
    }

    @Test
    public void test11() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test11");
        org.apache.zeppelin.conf.ZeppelinConfiguration zeppelinConfiguration0 = new org.apache.zeppelin.conf.ZeppelinConfiguration();
        zeppelinConfiguration0.clear();
        org.apache.zeppelin.notebook.repo.S3NotebookRepo s3NotebookRepo2 = new org.apache.zeppelin.notebook.repo.S3NotebookRepo(zeppelinConfiguration0);
        java.lang.String str3 = zeppelinConfiguration0.getWebsocketMaxTextMessageSize();
        org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars confVars4 = org.apache.zeppelin.conf.ZeppelinConfiguration.ConfVars.ZEPPELIN_INTERPRETER_OUTPUT_LIMIT;
        java.lang.String str5 = zeppelinConfiguration0.getRelativeDir(confVars4);
    }

    @Test
    public void test12() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test12");
        org.apache.zeppelin.notebook.Note note5 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph6 = null;
        note5.addParagraph(paragraph6);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj8 = note5.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo9 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj8);
        interpreterInfo9.setName("~Trash");
        org.apache.zeppelin.notebook.Note note15 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph16 = null;
        note15.addParagraph(paragraph16);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj18 = note15.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo19 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj18);
        interpreterInfo19.setName("~Trash");
        org.apache.zeppelin.notebook.Note note25 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph26 = null;
        note25.addParagraph(paragraph26);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj28 = note25.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo29 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj28);
        interpreterInfo29.setName("~Trash");
        org.apache.zeppelin.notebook.Note note35 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph36 = null;
        note35.addParagraph(paragraph36);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj38 = note35.getInfo();
        org.apache.zeppelin.interpreter.InterpreterInfo interpreterInfo39 = new org.apache.zeppelin.interpreter.InterpreterInfo("", "", true, map_str_obj38);
        interpreterInfo39.setName("notebook");
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array42 = new org.apache.zeppelin.interpreter.InterpreterInfo[] { interpreterInfo9, interpreterInfo19, interpreterInfo29, interpreterInfo39 };
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo43 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b44 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo43, interpreterInfo_array42);
        org.apache.zeppelin.helium.HeliumApplicationFactory heliumApplicationFactory45 = new org.apache.zeppelin.helium.HeliumApplicationFactory();
        org.apache.zeppelin.notebook.Paragraph paragraph46 = null;
        heliumApplicationFactory45.run(paragraph46, "local_modules");
        heliumApplicationFactory45.onOutputAppend("{\"paragraphs\":[null],\"name\":\"\",\"angularObjects\":{},\"config\":{},\"info\":{}}", "notebook", (int) 'a', "X-Zeppelin-Token", "src");
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
        org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type type71 = org.apache.zeppelin.notebook.repo.NotebookRepoSettingsInfo.Type.INPUT;
        org.apache.zeppelin.interpreter.InterpreterInfo[] interpreterInfo_array74 = new org.apache.zeppelin.interpreter.InterpreterInfo[] {};
        java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo> arraylist_interpreterInfo75 = new java.util.ArrayList<org.apache.zeppelin.interpreter.InterpreterInfo>();
        boolean b76 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo75, interpreterInfo_array74);
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp zeppelinHubOp77 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.protocol.ZeppelinHubOp.LIVE;
        org.apache.zeppelin.dep.Dependency[] dependency_array78 = new org.apache.zeppelin.dep.Dependency[] {};
        java.util.ArrayList<org.apache.zeppelin.dep.Dependency> arraylist_dependency79 = new java.util.ArrayList<org.apache.zeppelin.dep.Dependency>();
        boolean b80 = java.util.Collections.addAll((java.util.Collection<org.apache.zeppelin.dep.Dependency>) arraylist_dependency79, dependency_array78);
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption81 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner83 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting84 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "src", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo75, (java.lang.Object) zeppelinHubOp77, (java.util.List<org.apache.zeppelin.dep.Dependency>) arraylist_dependency79, interpreterOption81, "helium.bundle.js", interpreterRunner83);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency85 = interpreterSetting84.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption86 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner88 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting89 = new org.apache.zeppelin.interpreter.InterpreterSetting("yarn-cache", "heliumBundles", "zeppelin.dep.localrepo", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo61, (java.lang.Object) type71, list_dependency85, interpreterOption86, "local_modules", interpreterRunner88);
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency90 = interpreterSetting89.getDependencies();
        java.lang.String str91 = interpreterSetting89.getId();
        java.util.List<org.apache.zeppelin.dep.Dependency> list_dependency92 = interpreterSetting89.getDependencies();
        org.apache.zeppelin.interpreter.InterpreterOption interpreterOption93 = null;
        org.apache.zeppelin.interpreter.InterpreterRunner interpreterRunner95 = null;
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting96 = new org.apache.zeppelin.interpreter.InterpreterSetting("helium.bundle.js", "notebook", (java.util.List<org.apache.zeppelin.interpreter.InterpreterInfo>) arraylist_interpreterInfo43, (java.lang.Object) "src", list_dependency92, interpreterOption93, ".//helium,https://s3.amazonaws.com/helium-package/helium.json", interpreterRunner95);
        org.junit.Assert.assertTrue("Contract failed: equals-hashcode on interpreterInfo29 and interpreterInfo19", interpreterInfo29.equals(interpreterInfo19) ? interpreterInfo29.hashCode() == interpreterInfo19.hashCode() : true);
    }

    @Test
    public void test13() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test13");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note2 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph3 = null;
        note2.addParagraph(paragraph3);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj5 = note2.getInfo();
        note0.setInfo(map_str_obj5);
        org.apache.zeppelin.notebook.Note note7 = new org.apache.zeppelin.notebook.Note();
        org.apache.zeppelin.notebook.Paragraph paragraph8 = null;
        note7.addParagraph(paragraph8);
        java.util.Map<java.lang.String, java.lang.Object> map_str_obj10 = note7.getInfo();
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory11 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager12 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph13 = new org.apache.zeppelin.notebook.Paragraph(note0, (org.apache.zeppelin.scheduler.JobListener) note7, interpreterFactory11, interpreterSettingManager12);
        org.junit.Assert.assertTrue("Contract failed: !paragraph13.equals(null)", !paragraph13.equals(null));
    }

    @Test
    public void test14() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test14");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup3 = interpreterSetting0.getInterpreterGroup("bundles", "helium.bundle.js");
    }

    @Test
    public void test15() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test15");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        boolean b4 = note3.isPersonalizedMode();
        org.apache.zeppelin.notebook.Note note5 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str6 = note5.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note8 = note5.getUserNote("heliumBundles");
        org.apache.zeppelin.interpreter.InterpreterFactory interpreterFactory9 = null;
        org.apache.zeppelin.interpreter.InterpreterSettingManager interpreterSettingManager10 = null;
        org.apache.zeppelin.notebook.Paragraph paragraph11 = new org.apache.zeppelin.notebook.Paragraph(note3, (org.apache.zeppelin.scheduler.JobListener) note8, interpreterFactory9, interpreterSettingManager10);
        org.junit.Assert.assertTrue("Contract failed: !paragraph11.equals(null)", !paragraph11.equals(null));
    }

    @Test
    public void test16() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test16");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
        org.apache.zeppelin.notebook.ApplicationState applicationState2 = new org.apache.zeppelin.notebook.ApplicationState("~Trash", heliumPackage1);
        org.junit.Assert.assertTrue("Contract failed: applicationState2.equals(applicationState2)", applicationState2.equals(applicationState2));
    }

    @Test
    public void test17() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test17");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient zeppelinhubClient2 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.ZeppelinhubClient.initialize("bundles", "local_modules");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat zeppelinHubHeartbeat3 = org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.scheduler.ZeppelinHubHeartbeat.newInstance(zeppelinhubClient2);
        zeppelinHubHeartbeat3.run();
    }

    @Test
    public void test18() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test18");
        org.apache.zeppelin.interpreter.InterpreterSetting interpreterSetting0 = new org.apache.zeppelin.interpreter.InterpreterSetting();
        interpreterSetting0.addNoteToPara("configuration", "bundles");
        org.apache.zeppelin.interpreter.InterpreterGroup interpreterGroup6 = interpreterSetting0.getInterpreterGroup("s3.amazonaws.com", "s3.amazonaws.com");
    }

    @Test
    public void test19() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test19");
        org.apache.zeppelin.notebook.repo.zeppelinhub.websocket.utils.ZeppelinhubUtils.userLogoutRoutine("{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    }

    @Test
    public void test20() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test20");
        org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler zeppelinhubRestApiHandler1 = org.apache.zeppelin.notebook.repo.zeppelinhub.rest.ZeppelinhubRestApiHandler.newInstance("b3883bc7-9096-4750-9b75-98964ffef420");
        zeppelinhubRestApiHandler1.put("http://registry.npmjs.org/", "{\"op\":\"DEAD\",\"data\":{\"token\":\"bundles\"},\"meta\":{}}");
    }

    @Test
    public void test21() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test21");
        org.apache.zeppelin.notebook.Note note0 = new org.apache.zeppelin.notebook.Note();
        java.util.List<java.util.Map<java.lang.String, java.lang.String>> list_map_str_str1 = note0.generateParagraphsInfo();
        org.apache.zeppelin.notebook.Note note3 = note0.getUserNote("heliumBundles");
        java.util.Map<java.lang.String, java.lang.String> map_str_str5 = note0.generateSingleParagraphInfo(".//conf/interpreter-list");
        java.lang.String str6 = note0.getName();
    }

    @Test
    public void test22() throws Throwable {
        if (debug)
            System.out.format("%n%s%n", "ErrorTest0.test22");
        org.apache.zeppelin.helium.HeliumPackage heliumPackage1 = null;
        org.apache.zeppelin.notebook.ApplicationState applicationState2 = new org.apache.zeppelin.notebook.ApplicationState("helium.bundle.js", heliumPackage1);
        org.junit.Assert.assertTrue("Contract failed: applicationState2.equals(applicationState2)", applicationState2.equals(applicationState2));
    }
}

