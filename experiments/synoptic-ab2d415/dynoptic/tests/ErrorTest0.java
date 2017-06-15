
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }

    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState0 = null;
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState1 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState2 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState0, immutableMultiChState1);

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }

    synoptic.model.channelid.ChannelId[] channelId_array2 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId3 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId3, channelId_array2);
    dynoptic.model.fifosys.cfsm.CFSM cFSM5 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    mcscm.McScMCExample mcScMCExample6 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.CFSM cFSM7 = new dynoptic.model.fifosys.cfsm.CFSM((int)(short)-1, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState5 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState4.removeObs(obsFifoSysState5);

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str5 = cFSM4.toString();

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }

    dynoptic.model.fifosys.cfsm.CFSMState cFSMState0 = null;
    java.lang.String[] str_array3 = new java.lang.String[] { "", "hi!" };
    java.util.ArrayList<java.lang.String> arraylist_str4 = new java.util.ArrayList<java.lang.String>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<java.lang.String>)arraylist_str4, str_array3);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.BadState badState6 = new dynoptic.model.fifosys.cfsm.BadState(cFSMState0, (java.util.List<java.lang.String>)arraylist_str4);

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }

    synoptic.model.event.DistEventType distEventType0 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.invariants.EventuallyHappens eventuallyHappens1 = new dynoptic.invariants.EventuallyHappens(distEventType0);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    java.lang.String str5 = gFSMState4.toLongString();
    synoptic.model.event.DistEventType distEventType6 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState7 = gFSMState4.getNextStates(distEventType6);

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b6 = gFSMState4.isInitForPid((int)(byte)-1);

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState1 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState2 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array3 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState4 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState4, fSMState_array3);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM7 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)' ', fSMState1, fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState4, 1);

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str6 = cFSM4.toScmString("amd64");

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState5 = gFSMState4.getTerminalObs();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b7 = gFSMState4.isInitForPid((int)(short)10);

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i2 = obsFSMState1.getPid();
    synoptic.model.event.DistEventType distEventType3 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState4 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState1, distEventType3);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array1 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, fSMState_array1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState5 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, fSMState_array4);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState8 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, fSMState_array7);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM11 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, 0);
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState12 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState13 = null;
    synoptic.model.event.DistEventType distEventType14 = null;
    synoptic.model.event.DistEventType distEventType15 = null;
    synoptic.model.event.DistEventType distEventType16 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSM11.addSyntheticState(fSMState12, fSMState13, distEventType14, distEventType15, distEventType16);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.CFSMState> set_cFSMState5 = cFSM4.getInitStates();

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.export.GraphExporter.generatePngFileFromDotFile("amd64");

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }

    synoptic.model.event.DistEventType distEventType0 = null;
    synoptic.model.event.DistEventType distEventType1 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.invariants.AlwaysPrecedes alwaysPrecedes2 = new dynoptic.invariants.AlwaysPrecedes(distEventType0, distEventType1);

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.CFSMState> set_cFSMState5 = cFSM4.getAcceptStates();

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }

    synoptic.model.event.DistEventType distEventType0 = null;
    synoptic.model.event.DistEventType distEventType1 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.invariants.AlwaysFollowedBy alwaysFollowedBy2 = new dynoptic.invariants.AlwaysFollowedBy(distEventType0, distEventType1);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType6 = cFSM4.getAlphabet();

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array0 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState1 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState1, fSMState_array0);
    dynoptic.model.fifosys.cfsm.CFSMState cFSMState3 = new dynoptic.model.fifosys.cfsm.CFSMState((java.util.List<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState1);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b5 = cFSMState3.isInitForPid((int)' ');

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState5 = gFSMState4.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState7 = gFSMState4.getTerminalObsForPid(100);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b9 = gFSMState4.isInitForPid((int)(byte)100);

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array1 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, fSMState_array1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState5 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, fSMState_array4);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState8 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, fSMState_array7);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM11 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, 0);
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState12 = fSM11.getAcceptStates();
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType13 = fSM11.getAlphabet();
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState14 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState15 = null;
    synoptic.model.event.DistEventType distEventType16 = null;
    synoptic.model.event.DistEventType distEventType17 = null;
    synoptic.model.event.DistEventType distEventType18 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSM11.addSyntheticState(fSMState14, fSMState15, distEventType16, distEventType17, distEventType18);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }

    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState0 = null;
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState4 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState0, immutableMultiChState2);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId5 = dynoptic.util.Util.newList((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState7 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array9 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId10 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId10, channelId_array9);
    dynoptic.model.fifosys.cfsm.CFSM cFSM12 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId10);
    boolean b13 = obsFSMState7.equals((java.lang.Object)arraylist_channelId10);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState15 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array17 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId18 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId18, channelId_array17);
    dynoptic.model.fifosys.cfsm.CFSM cFSM20 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId18);
    boolean b21 = obsFSMState15.equals((java.lang.Object)arraylist_channelId18);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState22 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath24 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState22, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState25 = gFSMPath24.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState26 = dynoptic.util.Util.newPair(obsFSMState15, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState25);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState30 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array31 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState7, obsFSMState15, obsFSMState28, obsFSMState30 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState32 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState32, obsFSMState_array31);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState34 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState32);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType35 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState36 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType35);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId37 = immutableMultiChState36.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState38 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState34, immutableMultiChState36);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState40 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array42 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId43 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId43, channelId_array42);
    dynoptic.model.fifosys.cfsm.CFSM cFSM45 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId43);
    boolean b46 = obsFSMState40.equals((java.lang.Object)arraylist_channelId43);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState48 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array50 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId51 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b52 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId51, channelId_array50);
    dynoptic.model.fifosys.cfsm.CFSM cFSM53 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId51);
    boolean b54 = obsFSMState48.equals((java.lang.Object)arraylist_channelId51);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState55 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath57 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState55, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState58 = gFSMPath57.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState59 = dynoptic.util.Util.newPair(obsFSMState48, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState58);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState61 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState63 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array64 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState40, obsFSMState48, obsFSMState61, obsFSMState63 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState65 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState65, obsFSMState_array64);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState67 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState65);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType68 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState69 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType68);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId70 = immutableMultiChState69.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState71 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState67, immutableMultiChState69);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array73 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState74 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState74, obsFifoSysState_array73);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState76 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState74);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array78 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState79 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b80 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState79, obsFifoSysState_array78);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState81 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState79);
    java.util.List<java.util.List<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>> list_list_obsFifoSysState82 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState74, (java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState79);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSys obsFifoSys83 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSys(list_channelId5, obsFifoSysState38, obsFifoSysState71, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState79);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array1 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, fSMState_array1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState5 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, fSMState_array4);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState8 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, fSMState_array7);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM11 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, 0);
    dynoptic.model.fifosys.channel.channelid.LocalEventsChannelId localEventsChannelId12 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str13 = fSM11.toScmString(localEventsChannelId12);

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i2 = obsFSMState1.getPid();
    obsFSMState1.markInit();
    synoptic.model.event.DistEventType distEventType4 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState5 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState1, distEventType4);

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }

    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode[] obsDAGNode_array0 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode> arraylist_obsDAGNode1 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode>();
    boolean b2 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode>)arraylist_obsDAGNode1, obsDAGNode_array0);
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode[] obsDAGNode_array3 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode> arraylist_obsDAGNode4 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode>)arraylist_obsDAGNode4, obsDAGNode_array3);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType7 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState8 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType7);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId9 = immutableMultiChState8.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM10 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId9);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAG obsDAG12 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAG((java.util.List<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode>)arraylist_obsDAGNode1, (java.util.List<dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode>)arraylist_obsDAGNode4, list_channelId9, 35);

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }

    mcscm.McScM mcScM1 = new mcscm.McScM("[]");
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState7 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelIds((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    mcscm.VerifyResult verifyResult8 = mcScM1.getVerifyResult((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId3);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = gFSM4.getCFSM(true);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState4 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.namedObsFSMState(1, "amd64", true, false);
    synoptic.model.event.DistEventType distEventType5 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState6 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState4, distEventType5);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }

    synoptic.model.event.DistEventType distEventType0 = null;
    synoptic.model.event.DistEventType distEventType1 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.invariants.NeverFollowedBy neverFollowedBy2 = new dynoptic.invariants.NeverFollowedBy(distEventType0, distEventType1);

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.export.GraphExporter.generatePngFileFromDotFile("CExample[\n]");

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    synoptic.model.channelid.ChannelId[] channelId_array9 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId10 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId10, channelId_array9);
    dynoptic.model.fifosys.cfsm.CFSM cFSM12 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId10);
    boolean b13 = obsFSMState1.equals((java.lang.Object)arraylist_channelId10);
    synoptic.model.event.DistEventType distEventType14 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState15 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState1, distEventType14);

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.export.GraphExporter.generatePngFileFromDotFile("");

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }

    dynoptic.model.fifosys.gfsm.GFSMState gFSMState0 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath2 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState0, (int)(byte)100);
    int i3 = gFSMPath2.getPid();
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath4 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMPath2);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType6 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState7 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType6);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId8 = immutableMultiChState7.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM9 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId8);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    mcscm.McScMCExample mcScMCExample15 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType16 = mcScMCExample15.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath18 = gFSM9.getCExamplePaths(mcScMCExample15, 1);
    boolean b19 = gFSMPath4.refine(gFSM9);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState21 = gFSM9.getInitStatesForPid((int)(short)-1);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType23 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState24 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType23);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId25 = immutableMultiChState24.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM26 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId25);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState27 = gFSM26.getAcceptStates();
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM32 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId31);
    synoptic.model.channelid.ChannelId[] channelId_array34 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId35 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId35, channelId_array34);
    dynoptic.model.fifosys.cfsm.CFSM cFSM37 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId35);
    mcscm.McScMCExample mcScMCExample38 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId35);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType39 = mcScMCExample38.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath41 = gFSM32.getCExamplePaths(mcScMCExample38, 1);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath43 = gFSM26.getCExamplePaths(mcScMCExample38, 100);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState44 = gFSM26.getAcceptStates();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM9.addAllGFSMStates((java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)set_gFSMState44);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    int i6 = cFSM4.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.CFSMState> set_cFSMState7 = cFSM4.getAcceptStates();

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = cFSM4.toString();

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState5 = gFSMState4.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState7 = gFSMState4.getTerminalObsForPid(100);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array9 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState10 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState10, obsFifoSysState_array9);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState12 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState10);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array14 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState15 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState15, obsFifoSysState_array14);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState17 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState15);
    java.util.List<java.util.List<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>> list_list_obsFifoSysState18 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState10, (java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState15);
    gFSMState4.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState10);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b21 = gFSMState4.isInitForPid((int)'4');

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }

    mcscm.McScM mcScM1 = new mcscm.McScM("[]");
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    mcscm.VerifyResult verifyResult7 = mcScM1.getVerifyResult((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    int i6 = cFSM4.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.List<dynoptic.model.fifosys.cfsm.BadState> list_badState7 = cFSM4.getBadStates();

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }

    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath1 = new dynoptic.model.fifosys.gfsm.GFSMPath((int)(byte)0);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState2 = gFSMPath1.lastState();

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b6 = fSMState4.equals((java.lang.Object)(-1L));
    synoptic.model.event.DistEventType distEventType7 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState12 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b14 = fSMState12.equals((java.lang.Object)(-1L));
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.addSynthTransition(distEventType7, fSMState12);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState0 = null;
    dynoptic.model.fifosys.cfsm.CFSMState cFSMState1 = new dynoptic.model.fifosys.cfsm.CFSMState(fSMState0);
    int i2 = cFSMState1.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b4 = cFSMState1.isInitForPid((int)(short)-1);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType5 = fSMState4.getTransitioningEvents();
    synoptic.model.event.DistEventType distEventType6 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState11 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b13 = fSMState11.equals((java.lang.Object)(-1L));
    dynoptic.model.fifosys.channel.channelid.LocalEventsChannelId localEventsChannelId14 = null;
    java.lang.String str15 = fSMState11.toScmString(localEventsChannelId14);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.rmTransition(distEventType6, fSMState11);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState8 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath10 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState8, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState11 = gFSMPath10.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState12 = dynoptic.util.Util.newPair(obsFSMState1, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState11);
    synoptic.model.event.DistEventType distEventType13 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState14 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState1, distEventType13);

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState0 = null;
    dynoptic.model.fifosys.cfsm.CFSMState cFSMState1 = new dynoptic.model.fifosys.cfsm.CFSMState(fSMState0);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = cFSMState1.isInitForPid((int)(byte)1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState0 = null;
    dynoptic.model.fifosys.cfsm.CFSMState cFSMState1 = new dynoptic.model.fifosys.cfsm.CFSMState(fSMState0);
    int i2 = cFSMState1.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b4 = cFSMState1.isAcceptForPid(17);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType5 = cFSM4.getAlphabet();

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId3);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState5 = gFSM4.getAcceptStates();
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType7 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState8 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType7);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId9 = immutableMultiChState8.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM10 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId9);
    synoptic.model.channelid.ChannelId[] channelId_array12 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId13 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId13, channelId_array12);
    dynoptic.model.fifosys.cfsm.CFSM cFSM15 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    mcscm.McScMCExample mcScMCExample16 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType17 = mcScMCExample16.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath19 = gFSM10.getCExamplePaths(mcScMCExample16, 1);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath21 = gFSM4.getCExamplePaths(mcScMCExample16, 100);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState22 = gFSM4.getAcceptStates();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState24 = gFSM4.getAcceptStatesForPid((int)'4');
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array26 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState27 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState27, obsFifoSysState_array26);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState29 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState27);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState30 = gFSMState29.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState32 = gFSMState29.getTerminalObsForPid(0);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array34 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState35 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState35, obsFifoSysState_array34);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState37 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState35);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState38 = gFSMState37.getTerminalObs();
    java.lang.String str39 = gFSMState37.toIntermediateString();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState41 = gFSMState37.getTerminalObsForPid((int)(short)1);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array43 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState44 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44, obsFifoSysState_array43);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState46 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array48 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState49 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49, obsFifoSysState_array48);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState51 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState52 = dynoptic.util.Util.newSet((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49);
    gFSMState46.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM4.refineWithRandNonRelevantObsAssignment(gFSMState29, set_obsFifoSysState41, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState33 = obsFifoSysState32.getFSMStates();
    java.lang.String str34 = obsFifoSysState32.toString();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b36 = obsFifoSysState32.isAcceptForPid((int)' ');

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i2 = obsFSMState1.getPid();
    obsFSMState1.markInit();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode4 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState1);
    synoptic.model.event.Event event5 = null;
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState7 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i8 = obsFSMState7.getPid();
    obsFSMState7.markInit();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode10 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState7);
    obsDAGNode10.setOccurred(true);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    obsDAGNode4.addTransition(event5, obsDAGNode10);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(true, true, (int)'a', (int)(short)10);
    boolean b5 = fSMState4.isAccept();
    synoptic.model.event.DistEventType distEventType6 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState11 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(true, true, (int)'a', (int)(short)10);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.addTransition(distEventType6, fSMState11);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.CFSMState> set_cFSMState6 = cFSM4.getAcceptStates();

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }

    dynoptic.model.fifosys.gfsm.GFSMState gFSMState0 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath2 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState0, (int)(byte)100);
    int i3 = gFSMPath2.getPid();
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath4 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMPath2);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType6 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState7 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType6);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId8 = immutableMultiChState7.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM9 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId8);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    mcscm.McScMCExample mcScMCExample15 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType16 = mcScMCExample15.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath18 = gFSM9.getCExamplePaths(mcScMCExample15, 1);
    boolean b19 = gFSMPath4.refine(gFSM9);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState21 = gFSM9.getInitStatesForPid((int)(short)-1);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array23 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState24 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState24, obsFifoSysState_array23);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState26 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState24);
    java.lang.String str27 = gFSMState26.toLongString();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array29 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState30 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState30, obsFifoSysState_array29);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState32 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState30);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState33 = gFSMState32.getTerminalObs();
    java.lang.String str34 = gFSMState32.toIntermediateString();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState36 = gFSMState32.getTerminalObsForPid((int)'#');
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array38 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState39 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState39, obsFifoSysState_array38);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState41 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState39);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState42 = gFSMState41.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState44 = gFSMState41.getTerminalObsForPid(100);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array46 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState47 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b48 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState47, obsFifoSysState_array46);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState49 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState47);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array51 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState52 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState52, obsFifoSysState_array51);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState54 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState52);
    java.util.List<java.util.List<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>> list_list_obsFifoSysState55 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState47, (java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState52);
    gFSMState41.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState47);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM9.refineWithRandNonRelevantObsAssignment(gFSMState26, set_obsFifoSysState36, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState47);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState33 = obsFifoSysState32.getFSMStates();
    java.lang.String str34 = obsFifoSysState32.toString();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b36 = obsFifoSysState32.isAcceptForPid((int)'a');

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }

    mcscm.McScM mcScM1 = new mcscm.McScM("CExample[\n]");
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId7 = cFSM6.getChannelIds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    mcscm.VerifyResult verifyResult8 = mcScM1.getVerifyResult(list_channelId7);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }

    synoptic.model.channelid.ChannelId[] channelId_array2 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId3 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId3, channelId_array2);
    dynoptic.model.fifosys.cfsm.CFSM cFSM5 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    int i6 = cFSM5.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    dynoptic.model.export.GraphExporter.exportCFSM("1", cFSM5);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId3);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState5 = gFSM4.getAcceptStates();
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType7 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState8 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType7);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId9 = immutableMultiChState8.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM10 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId9);
    synoptic.model.channelid.ChannelId[] channelId_array12 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId13 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId13, channelId_array12);
    dynoptic.model.fifosys.cfsm.CFSM cFSM15 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    mcscm.McScMCExample mcScMCExample16 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType17 = mcScMCExample16.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath19 = gFSM10.getCExamplePaths(mcScMCExample16, 1);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath21 = gFSM4.getCExamplePaths(mcScMCExample16, 100);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState22 = gFSM4.getAcceptStates();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState24 = gFSM4.getAcceptStatesForPid((int)'4');
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array26 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState27 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState27, obsFifoSysState_array26);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState29 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState27);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState30 = gFSMState29.getTerminalObs();
    java.lang.String str31 = gFSMState29.toIntermediateString();
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState33 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)1);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState34 = gFSMState33.getObservedStates();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array36 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState37 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b38 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState37, obsFifoSysState_array36);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState39 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState37);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array41 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState42 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState42, obsFifoSysState_array41);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState44 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState42);
    java.util.List<java.util.List<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>> list_list_obsFifoSysState45 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState37, (java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState42);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM4.refineWithRandNonRelevantObsAssignment(gFSMState29, set_obsFifoSysState34, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState37);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId3);
    dynoptic.model.fifosys.channel.channelstate.MutableMultiChState mutableMultiChState5 = dynoptic.model.fifosys.channel.channelstate.MutableMultiChState.fromChannelIds(list_channelId3);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState7 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array9 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId10 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId10, channelId_array9);
    dynoptic.model.fifosys.cfsm.CFSM cFSM12 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId10);
    boolean b13 = obsFSMState7.equals((java.lang.Object)arraylist_channelId10);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState15 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array17 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId18 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId18, channelId_array17);
    dynoptic.model.fifosys.cfsm.CFSM cFSM20 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId18);
    boolean b21 = obsFSMState15.equals((java.lang.Object)arraylist_channelId18);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState22 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath24 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState22, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState25 = gFSMPath24.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState26 = dynoptic.util.Util.newPair(obsFSMState15, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState25);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState30 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array31 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState7, obsFSMState15, obsFSMState28, obsFSMState30 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState32 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState32, obsFSMState_array31);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState34 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState32);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType35 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState36 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType35);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId37 = immutableMultiChState36.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState38 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState34, immutableMultiChState36);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array40 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState41 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState41, obsFifoSysState_array40);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState43 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState41);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState44 = gFSMState43.getTerminalObs();
    java.lang.String str45 = gFSMState43.toIntermediateString();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState47 = gFSMState43.getTerminalObsForPid(4);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array49 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState50 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState50, obsFifoSysState_array49);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState52 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState50);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState53 = gFSMState52.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState55 = gFSMState52.getTerminalObsForPid((int)'a');
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSys obsFifoSys56 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSys(list_channelId3, obsFifoSysState38, set_obsFifoSysState47, set_obsFifoSysState55);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId3);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState5 = gFSM4.getAcceptStates();
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType7 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState8 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType7);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId9 = immutableMultiChState8.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM10 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId9);
    synoptic.model.channelid.ChannelId[] channelId_array12 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId13 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId13, channelId_array12);
    dynoptic.model.fifosys.cfsm.CFSM cFSM15 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    mcscm.McScMCExample mcScMCExample16 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType17 = mcScMCExample16.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath19 = gFSM10.getCExamplePaths(mcScMCExample16, 1);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath21 = gFSM4.getCExamplePaths(mcScMCExample16, 100);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState22 = gFSM4.getAcceptStates();
    synoptic.model.channelid.ChannelId[] channelId_array24 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId25 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId25, channelId_array24);
    dynoptic.model.fifosys.cfsm.CFSM cFSM27 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId25);
    mcscm.McScMCExample mcScMCExample28 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId25);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType29 = mcScMCExample28.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath31 = gFSM4.getCExamplePaths(mcScMCExample28, (int)(byte)0);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType33 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState34 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType33);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId35 = immutableMultiChState34.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM36 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId35);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState37 = gFSM36.getInitStates();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState38 = gFSM36.getAcceptStates();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM4.addAllGFSMStates((java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)set_gFSMState38);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array1 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, fSMState_array1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState5 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, fSMState_array4);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState8 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, fSMState_array7);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM11 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, 0);
    int i12 = fSM11.getPid();
    fSM11.minimize();
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array15 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState16 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState16, fSMState_array15);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array18 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState19 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b20 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState19, fSMState_array18);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array21 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState22 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState22, fSMState_array21);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM25 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState16, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState19, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState22, 0);
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState26 = fSM25.getAcceptStates();
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType27 = fSM25.getAlphabet();
    dynoptic.model.automaton.EventTypeEncodings eventTypeEncodings28 = new dynoptic.model.automaton.EventTypeEncodings((java.util.Set<synoptic.model.event.DistEventType>)fsmalphabet_distEventType27);
    dynoptic.model.automaton.EncodedAutomaton encodedAutomaton29 = fSM11.getEncodedAutomaton(eventTypeEncodings28);
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set_fSMState26 and fsmalphabet_distEventType27.", set_fSMState26.equals(fsmalphabet_distEventType27) == fsmalphabet_distEventType27.equals(set_fSMState26));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b6 = fSMState4.equals((java.lang.Object)(-1L));
    synoptic.model.event.DistEventType distEventType7 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState12 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType13 = fSMState12.getTransitioningEvents();
    fSMState12.setInitial(true);
    boolean b17 = fSMState12.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType18 = fSMState12.getTransitioningEvents();
    int i19 = fSMState12.getScmId();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.addTransition(distEventType7, fSMState12);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    mcscm.McScMCExample mcScMCExample5 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    dynoptic.model.fifosys.cfsm.CFSMExecution cFSMExecution6 = new dynoptic.model.fifosys.cfsm.CFSMExecution(mcScMCExample5);
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState11 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(true, true, (int)'a', (int)(short)10);
    boolean b12 = fSMState11.isAccept();
    cFSMExecution6.addToPath(fSMState11);
    synoptic.model.event.DistEventType distEventType14 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState19 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType20 = fSMState19.getTransitioningEvents();
    fSMState19.setInitial(true);
    boolean b24 = fSMState19.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType25 = fSMState19.getTransitioningEvents();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState11.addTransition(distEventType14, fSMState19);

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array34 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState35 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState35, obsFifoSysState_array34);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState37 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState35);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array39 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState40 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40, obsFifoSysState_array39);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState42 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState43 = dynoptic.util.Util.newSet((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40);
    gFSMState37.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40);
    gFSMState37.recreateCachedTransitions();
    java.lang.String str46 = gFSMState37.toIntermediateString();
    obsFifoSysState32.setParent(gFSMState37);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState49 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array51 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId52 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b53 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId52, channelId_array51);
    dynoptic.model.fifosys.cfsm.CFSM cFSM54 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId52);
    boolean b55 = obsFSMState49.equals((java.lang.Object)arraylist_channelId52);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState57 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array59 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId60 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId60, channelId_array59);
    dynoptic.model.fifosys.cfsm.CFSM cFSM62 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId60);
    boolean b63 = obsFSMState57.equals((java.lang.Object)arraylist_channelId60);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState64 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath66 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState64, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState67 = gFSMPath66.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState68 = dynoptic.util.Util.newPair(obsFSMState57, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState67);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState70 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState72 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array73 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState49, obsFSMState57, obsFSMState70, obsFSMState72 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState74 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b75 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState74, obsFSMState_array73);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState76 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState74);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType77 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState78 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType77);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId79 = immutableMultiChState78.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState80 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState76, immutableMultiChState78);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> set_obsDistEventType81 = obsFifoSysState80.getTransitioningEvents();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType82 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState83 = obsFifoSysState80.getNextState(obsDistEventType82);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState37.addObs(obsFifoSysState83);

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    boolean b6 = cFSM4.equals((java.lang.Object)'a');
    mcscm.Os os7 = new mcscm.Os();
    boolean b8 = cFSM4.equals((java.lang.Object)os7);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str9 = cFSM4.toString();

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b6 = fSMState4.equals((java.lang.Object)(-1L));
    dynoptic.model.fifosys.channel.channelid.LocalEventsChannelId localEventsChannelId7 = null;
    java.lang.String str8 = fSMState4.toScmString(localEventsChannelId7);
    synoptic.model.event.DistEventType distEventType9 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState14 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType15 = fSMState14.getTransitioningEvents();
    fSMState14.setInitial(true);
    boolean b19 = fSMState14.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType20 = fSMState14.getTransitioningEvents();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.addSynthTransition(distEventType9, fSMState14);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType5 = fSMState4.getTransitioningEvents();
    fSMState4.setInitial(true);
    synoptic.model.event.DistEventType distEventType8 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState13 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType14 = fSMState13.getTransitioningEvents();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.rmTransition(distEventType8, fSMState13);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }

    mcscm.McScM mcScM1 = new mcscm.McScM("[]");
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState4 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array6 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId7 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId7, channelId_array6);
    dynoptic.model.fifosys.cfsm.CFSM cFSM9 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId7);
    boolean b10 = obsFSMState4.equals((java.lang.Object)arraylist_channelId7);
    synoptic.model.channelid.ChannelId[] channelId_array12 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId13 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId13, channelId_array12);
    dynoptic.model.fifosys.cfsm.CFSM cFSM15 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    boolean b16 = obsFSMState4.equals((java.lang.Object)arraylist_channelId13);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType17 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState18 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType17);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId19 = immutableMultiChState18.getChannelIds();
    java.util.List<java.util.List<synoptic.model.channelid.ChannelId>> list_list_channelId20 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<synoptic.model.channelid.ChannelId>)arraylist_channelId13, (java.lang.Iterable<synoptic.model.channelid.ChannelId>)list_channelId19);
    dynoptic.model.fifosys.cfsm.CFSM cFSM21 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)1, list_channelId19);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    mcscm.VerifyResult verifyResult22 = mcScM1.getVerifyResult(list_channelId19);

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }

    dynoptic.model.fifosys.gfsm.GFSMState gFSMState1 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)1);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState2 = gFSMState1.getObservedStates();
    synoptic.model.event.DistEventType distEventType3 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState4 = gFSMState1.getNextStates(distEventType3);

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState3 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.anonObsFSMState((int)' ', false, false);
    boolean b4 = obsFSMState3.isTerminal();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode5 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState3);
    synoptic.model.event.DistEventType distEventType6 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState7 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState3, distEventType6);

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    int i6 = cFSM4.getNumProcesses();
    java.util.List<dynoptic.model.fifosys.cfsm.fsm.FSM> list_fSM7 = cFSM4.getFSMs();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str8 = cFSM4.toString();

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState33 = obsFifoSysState32.getParent();
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState35 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array37 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId38 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId38, channelId_array37);
    dynoptic.model.fifosys.cfsm.CFSM cFSM40 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId38);
    boolean b41 = obsFSMState35.equals((java.lang.Object)arraylist_channelId38);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState43 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array45 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId46 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId46, channelId_array45);
    dynoptic.model.fifosys.cfsm.CFSM cFSM48 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId46);
    boolean b49 = obsFSMState43.equals((java.lang.Object)arraylist_channelId46);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState50 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath52 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState50, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState53 = gFSMPath52.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState54 = dynoptic.util.Util.newPair(obsFSMState43, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState53);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState56 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState58 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array59 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState35, obsFSMState43, obsFSMState56, obsFSMState58 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState60 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b61 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState60, obsFSMState_array59);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState62 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState60);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType63 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState64 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType63);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId65 = immutableMultiChState64.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState66 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState62, immutableMultiChState64);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType67 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState68 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType67);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId69 = immutableMultiChState68.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState70 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState62, immutableMultiChState68);
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType71 = null;
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState72 = obsFifoSysState70.getNextStates(obsDistEventType71);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState33.addAllObs(set_obsFifoSysState72);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId3);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState5 = gFSM4.getAcceptStates();
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType7 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState8 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType7);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId9 = immutableMultiChState8.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM10 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId9);
    synoptic.model.channelid.ChannelId[] channelId_array12 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId13 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b14 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId13, channelId_array12);
    dynoptic.model.fifosys.cfsm.CFSM cFSM15 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    mcscm.McScMCExample mcScMCExample16 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId13);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType17 = mcScMCExample16.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath19 = gFSM10.getCExamplePaths(mcScMCExample16, 1);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath21 = gFSM4.getCExamplePaths(mcScMCExample16, 100);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState22 = gFSM4.getAcceptStates();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array24 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState25 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b26 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState25, obsFifoSysState_array24);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState27 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState25);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState28 = gFSMState27.getTerminalObs();
    java.lang.String str29 = gFSMState27.toIntermediateString();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState31 = gFSMState27.getTerminalObsForPid((int)'#');
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array33 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState34 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState34, obsFifoSysState_array33);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState36 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState34);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array38 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState39 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState39, obsFifoSysState_array38);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState41 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState39);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState42 = gFSMState41.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState44 = gFSMState41.getTerminalObsForPid((int)'a');
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM4.refineWithRandNonRelevantObsAssignment(gFSMState27, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState34, set_obsFifoSysState44);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array1 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, fSMState_array1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState5 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, fSMState_array4);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState8 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, fSMState_array7);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM11 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, 0);
    int i12 = fSM11.getPid();
    fSM11.minimize();
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState18 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b20 = fSMState18.equals((java.lang.Object)(-1L));
    fSMState18.setAccept(true);
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState27 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType28 = fSMState27.getTransitioningEvents();
    fSMState27.setInitial(true);
    synoptic.model.event.DistEventType distEventType31 = null;
    synoptic.model.event.DistEventType distEventType32 = null;
    synoptic.model.event.DistEventType distEventType33 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSM11.addSyntheticState(fSMState18, fSMState27, distEventType31, distEventType32, distEventType33);

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }

    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.export.GraphExporter.generatePngFileFromDotFile("Part-0-879220873");

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState5 = gFSMState4.getTerminalObs();
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState7 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array9 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId10 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId10, channelId_array9);
    dynoptic.model.fifosys.cfsm.CFSM cFSM12 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId10);
    boolean b13 = obsFSMState7.equals((java.lang.Object)arraylist_channelId10);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState15 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array17 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId18 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId18, channelId_array17);
    dynoptic.model.fifosys.cfsm.CFSM cFSM20 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId18);
    boolean b21 = obsFSMState15.equals((java.lang.Object)arraylist_channelId18);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState22 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath24 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState22, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState25 = gFSMPath24.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState26 = dynoptic.util.Util.newPair(obsFSMState15, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState25);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState30 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array31 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState7, obsFSMState15, obsFSMState28, obsFSMState30 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState32 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState32, obsFSMState_array31);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState34 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState32);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType35 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState36 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType35);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId37 = immutableMultiChState36.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState38 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState34, immutableMultiChState36);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> set_obsDistEventType39 = obsFifoSysState38.getTransitioningEvents();
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState40 = obsFifoSysState38.getParent();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState4.addObs(obsFifoSysState38);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i2 = obsFSMState1.getPid();
    obsFSMState1.markInit();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode4 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState1);
    boolean b5 = obsDAGNode4.isInitState();
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState7 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i8 = obsFSMState7.getPid();
    obsFSMState7.markInit();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode10 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState7);
    boolean b11 = obsDAGNode10.isTermState();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    obsDAGNode4.addRemoteDependency(obsDAGNode10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array6 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState7 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7, obsFifoSysState_array6);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState9 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState10 = dynoptic.util.Util.newSet((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7);
    gFSMState4.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState13 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array15 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId16 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId16, channelId_array15);
    dynoptic.model.fifosys.cfsm.CFSM cFSM18 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId16);
    boolean b19 = obsFSMState13.equals((java.lang.Object)arraylist_channelId16);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState21 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array23 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId24 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId24, channelId_array23);
    dynoptic.model.fifosys.cfsm.CFSM cFSM26 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId24);
    boolean b27 = obsFSMState21.equals((java.lang.Object)arraylist_channelId24);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState28 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath30 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState28, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState31 = gFSMPath30.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState32 = dynoptic.util.Util.newPair(obsFSMState21, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState31);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState34 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState36 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array37 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState13, obsFSMState21, obsFSMState34, obsFSMState36 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState38 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState38, obsFSMState_array37);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState40 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState38);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType41 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState42 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType41);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId43 = immutableMultiChState42.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState44 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState40, immutableMultiChState42);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> set_obsDistEventType45 = obsFifoSysState44.getTransitioningEvents();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType46 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState47 = obsFifoSysState44.getNextState(obsDistEventType46);
    int i48 = obsFifoSysState44.getNumProcesses();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType49 = null;
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState50 = obsFifoSysState44.getNextStates(obsDistEventType49);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState4.addAllObs(set_obsFifoSysState50);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState6 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array8 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId9 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId9, channelId_array8);
    dynoptic.model.fifosys.cfsm.CFSM cFSM11 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId9);
    boolean b12 = obsFSMState6.equals((java.lang.Object)arraylist_channelId9);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState14 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array16 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId17 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId17, channelId_array16);
    dynoptic.model.fifosys.cfsm.CFSM cFSM19 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId17);
    boolean b20 = obsFSMState14.equals((java.lang.Object)arraylist_channelId17);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState21 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath23 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState21, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState24 = gFSMPath23.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState25 = dynoptic.util.Util.newPair(obsFSMState14, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState24);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState27 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState29 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array30 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState6, obsFSMState14, obsFSMState27, obsFSMState29 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState31 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState31, obsFSMState_array30);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState33 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState31);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType34 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState35 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType34);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId36 = immutableMultiChState35.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState37 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState33, immutableMultiChState35);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> set_obsDistEventType38 = obsFifoSysState37.getTransitioningEvents();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType39 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState40 = obsFifoSysState37.getNextState(obsDistEventType39);
    boolean b41 = obsFifoSysState37.isInitial();
    java.lang.String str42 = obsFifoSysState37.toString();
    boolean b44 = obsFifoSysState37.isAcceptForPid((int)(short)1);
    int i45 = obsFifoSysState37.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState4.addObs(obsFifoSysState37);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }

    mcscm.McScMCExample mcScMCExample1 = null;
    dynoptic.model.fifosys.cfsm.CFSMExecution cFSMExecution2 = new dynoptic.model.fifosys.cfsm.CFSMExecution(mcScMCExample1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType8 = fSMState7.getTransitioningEvents();
    fSMState7.setInitial(true);
    boolean b12 = fSMState7.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType13 = fSMState7.getTransitioningEvents();
    int i14 = fSMState7.getScmId();
    fSMState7.setInitial(true);
    cFSMExecution2.addToPath(fSMState7);
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState22 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType23 = fSMState22.getTransitioningEvents();
    fSMState22.setInitial(true);
    boolean b27 = fSMState22.equals((java.lang.Object)"amd64");
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array29 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState30 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, fSMState_array29);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array32 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState33 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState33, fSMState_array32);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array35 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState36 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState36, fSMState_array35);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM39 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState33, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState36, 0);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM41 = new dynoptic.model.fifosys.cfsm.fsm.FSM(35, fSMState7, fSMState22, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, (int)(byte)1);

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    int i6 = cFSM4.getNumProcesses();
    java.util.List<dynoptic.model.fifosys.cfsm.fsm.FSM> list_fSM7 = cFSM4.getFSMs();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str9 = cFSM4.toScmString("CExample[\n]");

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str7 = cFSM4.toScmString("[]");

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }

    synoptic.model.channelid.ChannelId[] channelId_array2 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId3 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId3, channelId_array2);
    dynoptic.model.fifosys.cfsm.CFSM cFSM5 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState6 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelIds((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM7 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)1, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    dynoptic.main.OptionException optionException9 = new dynoptic.main.OptionException("");
    java.lang.Throwable[] throwable_array10 = optionException9.getSuppressed();
    boolean b11 = cFSM7.equals((java.lang.Object)optionException9);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType12 = cFSM7.getAlphabet();

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    int i6 = cFSM4.getNumProcesses();
    java.util.List<dynoptic.model.fifosys.cfsm.fsm.FSM> list_fSM7 = cFSM4.getFSMs();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType8 = cFSM4.getAlphabet();

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i2 = obsFSMState1.getPid();
    int i3 = obsFSMState1.getPid();
    boolean b4 = obsFSMState1.isTerminal();
    synoptic.model.event.DistEventType distEventType5 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState6 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState1, distEventType5);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array2 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState3 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState3, fSMState_array2);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array5 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState6 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState6, fSMState_array5);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array8 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState9 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState9, fSMState_array8);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM12 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState3, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState6, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState9, 0);
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState13 = fSM12.getAcceptStates();
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array15 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState16 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b17 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState16, fSMState_array15);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array19 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState20 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState20, fSMState_array19);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array22 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState23 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState23, fSMState_array22);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array25 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState26, fSMState_array25);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM29 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState20, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState23, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState26, 0);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array31 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState32 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState32, fSMState_array31);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array34 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState35 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState35, fSMState_array34);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array37 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState38 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState38, fSMState_array37);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM41 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState32, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState35, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState38, 0);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM43 = new dynoptic.model.fifosys.cfsm.fsm.FSM(1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState16, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState23, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState38, (int)' ');
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array45 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState46 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b47 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState46, fSMState_array45);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array49 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState50 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState50, fSMState_array49);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array52 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState53 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b54 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState53, fSMState_array52);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array55 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState56 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b57 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState56, fSMState_array55);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM59 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState50, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState53, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState56, 0);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array61 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState62 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b63 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState62, fSMState_array61);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array64 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState65 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b66 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState65, fSMState_array64);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array67 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState68 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b69 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState68, fSMState_array67);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM71 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState62, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState65, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState68, 0);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM73 = new dynoptic.model.fifosys.cfsm.fsm.FSM(1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState46, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState53, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState68, (int)' ');
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM75 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(byte)-1, set_fSMState13, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState23, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState68, (int)(short)-1);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState5 = gFSMState4.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState7 = gFSMState4.getTerminalObsForPid(100);
    synoptic.model.event.DistEventType distEventType8 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState9 = gFSMState4.getNextStates(distEventType8);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array1 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, fSMState_array1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState5 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, fSMState_array4);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState8 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, fSMState_array7);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM11 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, 0);
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState12 = fSM11.getStates();
    dynoptic.model.fifosys.channel.channelid.LocalEventsChannelId localEventsChannelId13 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.lang.String str14 = fSM11.toScmString(localEventsChannelId13);

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType5 = fSMState4.getTransitioningEvents();
    fSMState4.setInitial(true);
    boolean b9 = fSMState4.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType10 = fSMState4.getTransitioningEvents();
    int i11 = fSMState4.getScmId();
    int i12 = fSMState4.getPid();
    synoptic.model.event.DistEventType distEventType13 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState14 = fSMState4.getNextStates(distEventType13);

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array6 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState7 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7, obsFifoSysState_array6);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState9 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState10 = dynoptic.util.Util.newSet((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7);
    gFSMState4.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState7);
    gFSMState4.recreateCachedTransitions();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b14 = gFSMState4.isAcceptForPid(97);

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }

    dynoptic.model.fifosys.gfsm.GFSMState gFSMState1 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)1);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState2 = gFSMState1.getObservedStates();
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState4 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array6 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId7 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b8 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId7, channelId_array6);
    dynoptic.model.fifosys.cfsm.CFSM cFSM9 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId7);
    boolean b10 = obsFSMState4.equals((java.lang.Object)arraylist_channelId7);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState12 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array14 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId15 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId15, channelId_array14);
    dynoptic.model.fifosys.cfsm.CFSM cFSM17 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId15);
    boolean b18 = obsFSMState12.equals((java.lang.Object)arraylist_channelId15);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState19 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath21 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState19, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState22 = gFSMPath21.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState23 = dynoptic.util.Util.newPair(obsFSMState12, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState22);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState25 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState27 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array28 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState4, obsFSMState12, obsFSMState25, obsFSMState27 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState29 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b30 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState29, obsFSMState_array28);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState31 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState29);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType32 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState33 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType32);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId34 = immutableMultiChState33.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState35 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState31, immutableMultiChState33);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType36 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState37 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType36);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId38 = immutableMultiChState37.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState39 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState31, immutableMultiChState37);
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType40 = null;
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState41 = obsFifoSysState39.getNextStates(obsDistEventType40);
    int i42 = obsFifoSysState39.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState1.addObs(obsFifoSysState39);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i2 = obsFSMState1.getPid();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode3 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState1);
    java.lang.String str4 = obsDAGNode3.toString();
    synoptic.model.event.Event event5 = null;
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState7 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    int i8 = obsFSMState7.getPid();
    obsFSMState7.markInit();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode10 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState7);
    boolean b11 = obsDAGNode10.isTermState();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    obsDAGNode3.addTransition(event5, obsDAGNode10);

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState3 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array5 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId6 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId6, channelId_array5);
    dynoptic.model.fifosys.cfsm.CFSM cFSM8 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId6);
    boolean b9 = obsFSMState3.equals((java.lang.Object)arraylist_channelId6);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState3.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSM gFSM16 = new dynoptic.model.fifosys.gfsm.GFSM((int)(short)100, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    dynoptic.model.export.GraphExporter.exportGFSM("amd64", gFSM16);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState19 = new dynoptic.model.fifosys.gfsm.GFSMState(100);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM16.removeGFSMState(gFSMState19);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }

    dynoptic.model.fifosys.gfsm.GFSMState gFSMState0 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath2 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState0, (int)(byte)100);
    int i3 = gFSMPath2.getPid();
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath4 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMPath2);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType6 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState7 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType6);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId8 = immutableMultiChState7.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM9 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId8);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    mcscm.McScMCExample mcScMCExample15 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType16 = mcScMCExample15.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath18 = gFSM9.getCExamplePaths(mcScMCExample15, 1);
    boolean b19 = gFSMPath4.refine(gFSM9);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState21 = gFSM9.getInitStatesForPid((int)(short)-1);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState22 = gFSM9.getInitStates();
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState24 = new dynoptic.model.fifosys.gfsm.GFSMState((int)'a');
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array26 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState27 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState27, obsFifoSysState_array26);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState29 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState27);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array31 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState32 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState32, obsFifoSysState_array31);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState34 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState32);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState35 = dynoptic.util.Util.newSet((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState32);
    gFSMState29.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState32);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array38 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState39 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b40 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState39, obsFifoSysState_array38);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState41 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState39);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array43 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState44 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44, obsFifoSysState_array43);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState46 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44);
    java.util.List<java.util.List<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>> list_list_obsFifoSysState47 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState39, (java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM9.refineWithRandNonRelevantObsAssignment(gFSMState24, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState32, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> set_obsDistEventType33 = obsFifoSysState32.getTransitioningEvents();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType34 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState35 = obsFifoSysState32.getNextState(obsDistEventType34);
    boolean b36 = obsFifoSysState32.isInitial();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType37 = null;
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState39 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array41 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId42 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId42, channelId_array41);
    dynoptic.model.fifosys.cfsm.CFSM cFSM44 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId42);
    boolean b45 = obsFSMState39.equals((java.lang.Object)arraylist_channelId42);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState47 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array49 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId50 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b51 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId50, channelId_array49);
    dynoptic.model.fifosys.cfsm.CFSM cFSM52 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId50);
    boolean b53 = obsFSMState47.equals((java.lang.Object)arraylist_channelId50);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState54 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath56 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState54, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState57 = gFSMPath56.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState58 = dynoptic.util.Util.newPair(obsFSMState47, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState57);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState60 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState62 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array63 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState39, obsFSMState47, obsFSMState60, obsFSMState62 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState64 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b65 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState64, obsFSMState_array63);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState66 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState64);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType67 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState68 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType67);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId69 = immutableMultiChState68.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState70 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState66, immutableMultiChState68);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType71 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState72 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType71);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId73 = immutableMultiChState72.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState74 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState66, immutableMultiChState72);
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType75 = null;
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState76 = obsFifoSysState74.getNextStates(obsDistEventType75);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    obsFifoSysState32.addTransition(obsDistEventType37, obsFifoSysState74);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState3 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.anonObsFSMState((int)(byte)1, true, true);
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode4 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState3);
    synoptic.model.event.Event event5 = null;
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.anonObsFSMState((int)' ', false, false);
    boolean b10 = obsFSMState9.isTerminal();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode11 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState9);
    boolean b12 = obsDAGNode11.isTermState();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    obsDAGNode4.addTransition(event5, obsDAGNode11);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState33 = obsFifoSysState32.getFSMStates();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType34 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState35 = obsFifoSysState32.getNextState(obsDistEventType34);
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType36 = null;
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState38 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array40 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId41 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b42 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId41, channelId_array40);
    dynoptic.model.fifosys.cfsm.CFSM cFSM43 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId41);
    boolean b44 = obsFSMState38.equals((java.lang.Object)arraylist_channelId41);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState46 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array48 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId49 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId49, channelId_array48);
    dynoptic.model.fifosys.cfsm.CFSM cFSM51 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId49);
    boolean b52 = obsFSMState46.equals((java.lang.Object)arraylist_channelId49);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState53 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath55 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState53, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState56 = gFSMPath55.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState57 = dynoptic.util.Util.newPair(obsFSMState46, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState56);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState59 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState61 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array62 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState38, obsFSMState46, obsFSMState59, obsFSMState61 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState63 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b64 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState63, obsFSMState_array62);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState65 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState63);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType66 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState67 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType66);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId68 = immutableMultiChState67.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState69 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState65, immutableMultiChState67);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> set_obsDistEventType70 = obsFifoSysState69.getTransitioningEvents();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType71 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState72 = obsFifoSysState69.getNextState(obsDistEventType71);
    int i73 = obsFifoSysState69.getNumProcesses();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType74 = null;
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState75 = obsFifoSysState69.getNextStates(obsDistEventType74);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    obsFifoSysState32.addTransition(obsDistEventType36, obsFifoSysState69);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState3 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.anonObsFSMState((int)' ', false, false);
    boolean b4 = obsFSMState3.isTerminal();
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode5 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState3);
    boolean b6 = obsDAGNode5.isTermState();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    synoptic.model.event.Event event7 = obsDAGNode5.getNextEvent();

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState33 = obsFifoSysState32.getFSMStates();
    synoptic.model.channelid.ChannelId[] channelId_array35 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId36 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId36, channelId_array35);
    dynoptic.model.fifosys.cfsm.CFSM cFSM38 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId36);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId39 = dynoptic.util.Util.newList((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId36);
    dynoptic.model.fifosys.channel.channelstate.MutableMultiChState mutableMultiChState40 = dynoptic.model.fifosys.channel.channelstate.MutableMultiChState.fromChannelIds(list_channelId39);
    dynoptic.model.fifosys.channel.channelstate.MutableMultiChState mutableMultiChState41 = mutableMultiChState40.clone();
    dynoptic.model.fifosys.channel.channelstate.MutableMultiChState mutableMultiChState42 = mutableMultiChState40.clone();
    synoptic.model.event.DistEventType[] distEventType_array43 = new synoptic.model.event.DistEventType[] {  };
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType44 = new dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<synoptic.model.event.DistEventType>)fsmalphabet_distEventType44, distEventType_array43);
    boolean b46 = fsmalphabet_distEventType44.isEmpty();
    java.util.Set<java.lang.String> set_str47 = fsmalphabet_distEventType44.getLocalEventScmStrings();
    boolean b48 = mutableMultiChState42.equals((java.lang.Object)fsmalphabet_distEventType44);
    dynoptic.model.fifosys.exec.FifoSysExecState<dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState> fifosysexecstate_obsMultFSMState49 = new dynoptic.model.fifosys.exec.FifoSysExecState<dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState>(obsMultFSMState33, mutableMultiChState42);
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on set_str47 and fsmalphabet_distEventType44.", set_str47.equals(fsmalphabet_distEventType44) == fsmalphabet_distEventType44.equals(set_str47));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }

    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array1 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2, obsFifoSysState_array1);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState2);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState5 = gFSMState4.getTerminalObs();
    java.lang.String str6 = gFSMState4.toLongString();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState7 = gFSMState4.getObservedStates();
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState17 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array19 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId20 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b21 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId20, channelId_array19);
    dynoptic.model.fifosys.cfsm.CFSM cFSM22 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId20);
    boolean b23 = obsFSMState17.equals((java.lang.Object)arraylist_channelId20);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState24 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath26 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState24, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState27 = gFSMPath26.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState28 = dynoptic.util.Util.newPair(obsFSMState17, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState27);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState30 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState32 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array33 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState9, obsFSMState17, obsFSMState30, obsFSMState32 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState34 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b35 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState34, obsFSMState_array33);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState36 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState34);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType37 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState38 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType37);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId39 = immutableMultiChState38.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState40 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState36, immutableMultiChState38);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array42 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState43 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState43, obsFifoSysState_array42);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState45 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState43);
    obsFifoSysState40.setParent(gFSMState45);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSMState4.removeObs(obsFifoSysState40);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(short)1, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState6 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array8 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId9 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b10 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId9, channelId_array8);
    dynoptic.model.fifosys.cfsm.CFSM cFSM11 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId9);
    boolean b12 = obsFSMState6.equals((java.lang.Object)arraylist_channelId9);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState14 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array16 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId17 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b18 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId17, channelId_array16);
    dynoptic.model.fifosys.cfsm.CFSM cFSM19 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId17);
    boolean b20 = obsFSMState14.equals((java.lang.Object)arraylist_channelId17);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState21 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath23 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState21, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState24 = gFSMPath23.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState25 = dynoptic.util.Util.newPair(obsFSMState14, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState24);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState27 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState29 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array30 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState6, obsFSMState14, obsFSMState27, obsFSMState29 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState31 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState31, obsFSMState_array30);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState33 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState31);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType34 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState35 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType34);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId36 = immutableMultiChState35.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState37 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState33, immutableMultiChState35);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState38 = obsFifoSysState37.getFSMStates();
    boolean b39 = obsFifoSysState37.isAccept();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array42 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState43 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b44 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState43, obsFifoSysState_array42);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState45 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState43);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array47 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState48 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState48, obsFifoSysState_array47);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState50 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState48);
    java.util.List<java.util.List<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>> list_list_obsFifoSysState51 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState43, (java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState48);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState52 = new dynoptic.model.fifosys.gfsm.GFSMState((int)'#', (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState43);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState54 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)1);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState55 = gFSMState54.getObservedStates();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState57 = gFSMState54.getTerminalObsForPid(97);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSys obsFifoSys58 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSys((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2, obsFifoSysState37, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState43, set_obsFifoSysState57);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState3 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.anonObsFSMState((int)(byte)1, true, true);
    dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode obsDAGNode4 = new dynoptic.model.fifosys.gfsm.observed.dag.ObsDAGNode(obsFSMState3);
    synoptic.model.event.DistEventType distEventType5 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState6 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonObsFSMState(obsFSMState3, distEventType5);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType5 = fSMState4.getTransitioningEvents();
    fSMState4.setInitial(true);
    boolean b9 = fSMState4.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType10 = fSMState4.getTransitioningEvents();
    int i11 = fSMState4.getScmId();
    synoptic.model.event.DistEventType distEventType12 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState17 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType18 = fSMState17.getTransitioningEvents();
    fSMState17.setInitial(true);
    boolean b22 = fSMState17.equals((java.lang.Object)"amd64");
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.addSynthTransition(distEventType12, fSMState17);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState3 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array5 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId6 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId6, channelId_array5);
    dynoptic.model.fifosys.cfsm.CFSM cFSM8 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId6);
    boolean b9 = obsFSMState3.equals((java.lang.Object)arraylist_channelId6);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState3.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSM gFSM16 = new dynoptic.model.fifosys.gfsm.GFSM((int)(short)100, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    dynoptic.model.export.GraphExporter.exportGFSM("amd64", gFSM16);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType19 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState20 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType19);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId21 = immutableMultiChState20.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM22 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId21);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState23 = gFSM22.getInitStates();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM16.addAllGFSMStates((java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)set_gFSMState23);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState2 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array4 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId5 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId5, channelId_array4);
    dynoptic.model.fifosys.cfsm.CFSM cFSM7 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId5);
    boolean b8 = obsFSMState2.equals((java.lang.Object)arraylist_channelId5);
    synoptic.model.channelid.ChannelId[] channelId_array10 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId11 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b12 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId11, channelId_array10);
    dynoptic.model.fifosys.cfsm.CFSM cFSM13 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId11);
    boolean b14 = obsFSMState2.equals((java.lang.Object)arraylist_channelId11);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType15 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState16 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType15);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId17 = immutableMultiChState16.getChannelIds();
    java.util.List<java.util.List<synoptic.model.channelid.ChannelId>> list_list_channelId18 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<synoptic.model.channelid.ChannelId>)arraylist_channelId11, (java.lang.Iterable<synoptic.model.channelid.ChannelId>)list_channelId17);
    dynoptic.model.fifosys.cfsm.CFSM cFSM19 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)1, list_channelId17);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType20 = cFSM19.getAlphabet();

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    int i5 = cFSM4.getNumProcesses();
    int i6 = cFSM4.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.CFSMState> set_cFSMState7 = cFSM4.getInitStates();

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }

    synoptic.model.channelid.ChannelId[] channelId_array1 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId2 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId2, channelId_array1);
    dynoptic.model.fifosys.cfsm.CFSM cFSM4 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId2);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId5 = cFSM4.getChannelIds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str6 = cFSM4.toString();

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }

    synoptic.model.channelid.ChannelId[] channelId_array2 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId3 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId3, channelId_array2);
    dynoptic.model.fifosys.cfsm.CFSM cFSM5 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    boolean b7 = cFSM5.equals((java.lang.Object)'a');
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId8 = cFSM5.getChannelIds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    dynoptic.model.export.GraphExporter.exportCFSM("mcscm.VerifyOutputParseException: Part-0-1970692513", cFSM5);

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b6 = fSMState4.equals((java.lang.Object)(-1L));
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType7 = fSMState4.getTransitioningEvents();
    dynoptic.model.fifosys.channel.channelid.LocalEventsChannelId localEventsChannelId8 = null;
    java.lang.String str9 = fSMState4.toScmString(localEventsChannelId8);
    synoptic.model.event.DistEventType distEventType10 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState11 = fSMState4.getNextStates(distEventType10);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }

    dynoptic.model.fifosys.gfsm.GFSMState gFSMState0 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath2 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState0, (int)(byte)100);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType3 = gFSMPath2.getEvents();
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState4 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath6 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState4, (int)(byte)100);
    int i7 = gFSMPath6.getPid();
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath8 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMPath6);
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath9 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMPath2, gFSMPath8);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState10 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath12 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState10, (int)(byte)100);
    int i13 = gFSMPath12.getPid();
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath14 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMPath12);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType16 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState17 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType16);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId18 = immutableMultiChState17.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM19 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId18);
    synoptic.model.channelid.ChannelId[] channelId_array21 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId22 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b23 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId22, channelId_array21);
    dynoptic.model.fifosys.cfsm.CFSM cFSM24 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId22);
    mcscm.McScMCExample mcScMCExample25 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId22);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType26 = mcScMCExample25.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath28 = gFSM19.getCExamplePaths(mcScMCExample25, 1);
    boolean b29 = gFSMPath14.refine(gFSM19);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState31 = gFSM19.getInitStatesForPid((int)(short)-1);
    boolean b32 = gFSMPath2.refine(gFSM19);
    synoptic.model.event.DistEventType distEventType33 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array35 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState36 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState36, obsFifoSysState_array35);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState38 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState36);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState39 = gFSMState38.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState41 = gFSMState38.getTerminalObsForPid(100);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array43 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState44 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b45 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44, obsFifoSysState_array43);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState46 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array48 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState49 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b50 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49, obsFifoSysState_array48);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState51 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49);
    java.util.List<java.util.List<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>> list_list_obsFifoSysState52 = dynoptic.util.Util.get2DPermutations((java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44, (java.lang.Iterable<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState49);
    gFSMState38.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState44);
    gFSMPath2.prefixEventAndState(distEventType33, gFSMState38);
    synoptic.model.event.DistEventType distEventType55 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState56 = gFSMState38.getNextStates(distEventType55);

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }

    java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType>> list_chstate_obsDistEventType0 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.channel.channelstate.MutableMultiChState mutableMultiChState1 = new dynoptic.model.fifosys.channel.channelstate.MutableMultiChState(list_chstate_obsDistEventType0);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState5 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType6 = fSMState5.getTransitioningEvents();
    fSMState5.setInitial(true);
    boolean b10 = fSMState5.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType11 = fSMState5.getTransitioningEvents();
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState16 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType17 = fSMState16.getTransitioningEvents();
    fSMState16.setInitial(true);
    boolean b21 = fSMState16.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType22 = fSMState16.getTransitioningEvents();
    int i23 = fSMState16.getScmId();
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array25 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState26 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState26, fSMState_array25);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array29 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState30 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, fSMState_array29);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array32 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState33 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState33, fSMState_array32);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array35 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState36 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b37 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState36, fSMState_array35);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM39 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState33, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState36, 0);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array41 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState42 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b43 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState42, fSMState_array41);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array44 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState45 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b46 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState45, fSMState_array44);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array47 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState48 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b49 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState48, fSMState_array47);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM51 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState42, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState45, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState48, 0);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM53 = new dynoptic.model.fifosys.cfsm.fsm.FSM(1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState26, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState33, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState48, (int)' ');
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM55 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(byte)-1, fSMState5, fSMState16, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState33, (int)(byte)10);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b6 = fSMState4.equals((java.lang.Object)(-1L));
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType7 = fSMState4.getTransitioningEvents();
    dynoptic.model.fifosys.channel.channelid.LocalEventsChannelId localEventsChannelId8 = null;
    java.lang.String str9 = fSMState4.toScmString(localEventsChannelId8);
    boolean b10 = fSMState4.isAccept();
    dynoptic.model.fifosys.cfsm.CFSMState cFSMState11 = new dynoptic.model.fifosys.cfsm.CFSMState(fSMState4);
    synoptic.model.event.DistEventType distEventType12 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState13 = fSMState4.getNextStates(distEventType12);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array1 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState2 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b3 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, fSMState_array1);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState5 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b6 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, fSMState_array4);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array7 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState8 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b9 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, fSMState_array7);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM11 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState2, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState5, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState8, 0);
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState12 = fSM11.getAcceptStates();
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType13 = fSM11.getAlphabet();
    java.util.Set<java.lang.String> set_str14 = fsmalphabet_distEventType13.getLocalEventScmStrings();
    java.util.Iterator<synoptic.model.event.DistEventType> iterator_distEventType15 = fsmalphabet_distEventType13.iterator();
    synoptic.model.channelid.ChannelId[] channelId_array17 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId18 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b19 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId18, channelId_array17);
    dynoptic.model.fifosys.cfsm.CFSM cFSM20 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId18);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId21 = dynoptic.util.Util.newList((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId18);
    synoptic.model.channelid.ChannelId[] channelId_array23 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId24 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b25 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId24, channelId_array23);
    dynoptic.model.fifosys.cfsm.CFSM cFSM26 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId24);
    boolean b28 = cFSM26.equals((java.lang.Object)'a');
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId29 = cFSM26.getChannelIds();
    synoptic.model.channelid.ChannelId[] channelId_array31 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId32 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b33 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId32, channelId_array31);
    dynoptic.model.fifosys.cfsm.CFSM cFSM34 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId32);
    mcscm.McScMCExample mcScMCExample35 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId32);
    synoptic.model.channelid.ChannelId[] channelId_array37 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId38 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b39 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId38, channelId_array37);
    dynoptic.model.fifosys.cfsm.CFSM cFSM40 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId38);
    mcscm.McScMCExample mcScMCExample41 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId38);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType43 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState44 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType43);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId45 = immutableMultiChState44.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM46 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId45);
    java.util.ArrayList<java.util.List<synoptic.model.channelid.ChannelId>> arraylist_list_channelId47 = new java.util.ArrayList<java.util.List<synoptic.model.channelid.ChannelId>>();
    boolean b48 = arraylist_list_channelId47.add((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId18);
    boolean b49 = arraylist_list_channelId47.add(list_channelId29);
    boolean b50 = arraylist_list_channelId47.add((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId32);
    boolean b51 = arraylist_list_channelId47.add((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId38);
    boolean b52 = arraylist_list_channelId47.add(list_channelId45);
    boolean b53 = fsmalphabet_distEventType13.removeAll((java.util.Collection<java.util.List<synoptic.model.channelid.ChannelId>>)arraylist_list_channelId47);
    dynoptic.model.fifosys.AbsMultiFSMState<dynoptic.model.fifosys.exec.FifoSysExecState<dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState>,dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> absmultifsmstate_fifosysexecstate_obsMultFSMState_obsDistEventType54 = null;
    synoptic.util.Pair<java.util.AbstractList<java.util.List<synoptic.model.channelid.ChannelId>>,dynoptic.model.fifosys.AbsMultiFSMState<dynoptic.model.fifosys.exec.FifoSysExecState<dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState>,dynoptic.model.fifosys.gfsm.observed.ObsDistEventType>> pair_abstractlist_list_channelId_absmultifsmstate_fifosysexecstate_obsMultFSMState_obsDistEventType55 = dynoptic.util.Util.newPair((java.util.AbstractList<java.util.List<synoptic.model.channelid.ChannelId>>)arraylist_list_channelId47, absmultifsmstate_fifosysexecstate_obsMultFSMState_obsDistEventType54);
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on linkedhashset_fSMState5 and fsmalphabet_distEventType13.", linkedhashset_fSMState5.equals(fsmalphabet_distEventType13) == fsmalphabet_distEventType13.equals(linkedhashset_fSMState5));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    boolean b6 = fSMState4.equals((java.lang.Object)(-1L));
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType7 = fSMState4.getTransitioningEvents();
    synoptic.model.event.DistEventType distEventType8 = null;
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState13 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(true, true, (int)'a', (int)(short)10);
    boolean b14 = fSMState13.isAccept();
    int i15 = fSMState13.getPid();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    fSMState4.addTransition(distEventType8, fSMState13);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test116"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState4 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(true, true, (int)'a', (int)(short)10);
    boolean b5 = fSMState4.isAccept();
    int i6 = fSMState4.getPid();
    synoptic.model.event.DistEventType distEventType7 = null;
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState> set_fSMState8 = fSMState4.getNextStates(distEventType7);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test117"); }

    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState7 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelIds((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    dynoptic.model.fifosys.cfsm.CFSM cFSM8 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)1, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    dynoptic.model.export.GraphExporter.exportCFSM("Part-0-357159137", cFSM8);

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test118"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState0 = null;
    dynoptic.model.fifosys.cfsm.CFSMState cFSMState1 = new dynoptic.model.fifosys.cfsm.CFSMState(fSMState0);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b3 = cFSMState1.isInitForPid(1);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test119"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType1 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState2 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType1);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId3 = immutableMultiChState2.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM4 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId3);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState5 = gFSM4.getInitStates();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState6 = gFSM4.getAcceptStates();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState7 = gFSM4.getAcceptStates();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array9 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState10 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b11 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState10, obsFifoSysState_array9);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState12 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState10);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array14 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState15 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b16 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState15, obsFifoSysState_array14);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState17 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState15);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState18 = dynoptic.util.Util.newSet((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState15);
    gFSMState12.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState15);
    gFSMState12.recreateCachedTransitions();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array22 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState23 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b24 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState23, obsFifoSysState_array22);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState25 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState23);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState26 = gFSMState25.getTerminalObs();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState28 = gFSMState25.getTerminalObsForPid(100);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array30 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState31 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b32 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState31, obsFifoSysState_array30);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState33 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState31);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState34 = gFSMState33.getTerminalObs();
    java.lang.String str35 = gFSMState33.toIntermediateString();
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState37 = gFSMState33.getTerminalObsForPid(4);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    gFSM4.refineWithRandNonRelevantObsAssignment(gFSMState12, set_obsFifoSysState28, set_obsFifoSysState37);

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test120"); }

    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath1 = new dynoptic.model.fifosys.gfsm.GFSMPath((-1));
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath2 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMPath1);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test121"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState0 = null;
    dynoptic.model.fifosys.cfsm.CFSMState cFSMState1 = new dynoptic.model.fifosys.cfsm.CFSMState(fSMState0);
    int i2 = cFSMState1.getNumProcesses();
    int i3 = cFSMState1.getNumProcesses();
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    boolean b5 = cFSMState1.isInitForPid((-1));

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test122"); }

    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState5 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType6 = fSMState5.getTransitioningEvents();
    fSMState5.setInitial(true);
    boolean b10 = fSMState5.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType11 = fSMState5.getTransitioningEvents();
    dynoptic.model.fifosys.cfsm.fsm.FSMState fSMState16 = new dynoptic.model.fifosys.cfsm.fsm.FSMState(false, true, (int)(short)1, (int)'a');
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType17 = fSMState16.getTransitioningEvents();
    fSMState16.setInitial(true);
    boolean b21 = fSMState16.equals((java.lang.Object)"amd64");
    java.util.Set<synoptic.model.event.DistEventType> set_distEventType22 = fSMState16.getTransitioningEvents();
    int i23 = fSMState16.getScmId();
    int i24 = fSMState16.getPid();
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array26 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState27 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b28 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState27, fSMState_array26);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array29 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState> linkedhashset_fSMState30 = new java.util.LinkedHashSet<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b31 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, fSMState_array29);
    dynoptic.model.fifosys.cfsm.fsm.FSMState[] fSMState_array32 = new dynoptic.model.fifosys.cfsm.fsm.FSMState[] {  };
    java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState> arraylist_fSMState33 = new java.util.ArrayList<dynoptic.model.fifosys.cfsm.fsm.FSMState>();
    boolean b34 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState33, fSMState_array32);
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM36 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(short)-1, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState27, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, (java.util.Collection<dynoptic.model.fifosys.cfsm.fsm.FSMState>)arraylist_fSMState33, 0);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.fsm.FSM fSM38 = new dynoptic.model.fifosys.cfsm.fsm.FSM((int)(byte)0, fSMState5, fSMState16, (java.util.Set<dynoptic.model.fifosys.cfsm.fsm.FSMState>)linkedhashset_fSMState30, (int)(byte)100);

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test123"); }

    mcscm.McScM mcScM1 = new mcscm.McScM("[]");
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId7 = cFSM6.getChannelIds();
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    mcscm.VerifyResult verifyResult8 = mcScM1.getVerifyResult(list_channelId7);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test124"); }

    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType2 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState3 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType2);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId4 = immutableMultiChState3.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM5 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId4);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState6 = gFSM5.getAcceptStates();
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType8 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState9 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType8);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId10 = immutableMultiChState9.getChannelIds();
    dynoptic.model.fifosys.gfsm.GFSM gFSM11 = new dynoptic.model.fifosys.gfsm.GFSM((int)(byte)1, list_channelId10);
    synoptic.model.channelid.ChannelId[] channelId_array13 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId14 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b15 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId14, channelId_array13);
    dynoptic.model.fifosys.cfsm.CFSM cFSM16 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId14);
    mcscm.McScMCExample mcScMCExample17 = new mcscm.McScMCExample((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId14);
    java.util.List<synoptic.model.event.DistEventType> list_distEventType18 = mcScMCExample17.getEvents();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath20 = gFSM11.getCExamplePaths(mcScMCExample17, 1);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMPath> set_gFSMPath22 = gFSM5.getCExamplePaths(mcScMCExample17, 100);
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState23 = gFSM5.getAcceptStates();
    java.util.Set<dynoptic.model.fifosys.gfsm.GFSMState> set_gFSMState25 = gFSM5.getAcceptStatesForPid((int)'4');
    dynoptic.model.export.GraphExporter.exportGFSM("[]", gFSM5);
    // during test generation this statement threw an exception of type java.lang.AssertionError in error
    dynoptic.model.fifosys.cfsm.CFSM cFSM28 = gFSM5.getCFSM(true);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test125"); }

    synoptic.model.channelid.ChannelId[] channelId_array2 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId3 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b4 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId3, channelId_array2);
    dynoptic.model.fifosys.cfsm.CFSM cFSM5 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState6 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelIds((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM7 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)1, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId3);
    dynoptic.main.OptionException optionException9 = new dynoptic.main.OptionException("");
    java.lang.Throwable[] throwable_array10 = optionException9.getSuppressed();
    boolean b11 = cFSM7.equals((java.lang.Object)optionException9);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    java.lang.String str12 = cFSM7.toString();

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test126"); }

    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState1 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array3 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId4 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b5 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId4, channelId_array3);
    dynoptic.model.fifosys.cfsm.CFSM cFSM6 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId4);
    boolean b7 = obsFSMState1.equals((java.lang.Object)arraylist_channelId4);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState9 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState9.equals((java.lang.Object)arraylist_channelId12);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState16 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath18 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState16, (int)(byte)100);
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState19 = gFSMPath18.getStates();
    synoptic.util.Pair<dynoptic.model.fifosys.gfsm.observed.ObsFSMState,java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>> pair_obsFSMState_collection_gFSMState20 = dynoptic.util.Util.newPair(obsFSMState9, (java.util.Collection<dynoptic.model.fifosys.gfsm.GFSMState>)list_gFSMState19);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState22 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState24 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] obsFSMState_array25 = new dynoptic.model.fifosys.gfsm.observed.ObsFSMState[] { obsFSMState1, obsFSMState9, obsFSMState22, obsFSMState24 };
    java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState> arraylist_obsFSMState26 = new java.util.ArrayList<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>();
    boolean b27 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26, obsFSMState_array25);
    dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState obsMultFSMState28 = dynoptic.model.fifosys.gfsm.observed.ObsMultFSMState.getMultiFSMState((java.util.List<dynoptic.model.fifosys.gfsm.observed.ObsFSMState>)arraylist_obsFSMState26);
    java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>> arraylist_chstate_distEventType29 = new java.util.ArrayList<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>();
    dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState immutableMultiChState30 = dynoptic.model.fifosys.channel.channelstate.ImmutableMultiChState.fromChannelStates((java.util.List<dynoptic.model.fifosys.channel.channelstate.ChState<synoptic.model.event.DistEventType>>)arraylist_chstate_distEventType29);
    java.util.List<synoptic.model.channelid.ChannelId> list_channelId31 = immutableMultiChState30.getChannelIds();
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState32 = dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState.getFifoSysState(obsMultFSMState28, immutableMultiChState30);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array34 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState35 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b36 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState35, obsFifoSysState_array34);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState37 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState35);
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] obsFifoSysState_array39 = new dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState[] {  };
    java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> linkedhashset_obsFifoSysState40 = new java.util.LinkedHashSet<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>();
    boolean b41 = java.util.Collections.addAll((java.util.Collection<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40, obsFifoSysState_array39);
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState42 = new dynoptic.model.fifosys.gfsm.GFSMState((int)(byte)10, (java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState43 = dynoptic.util.Util.newSet((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40);
    gFSMState37.addAllObs((java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState>)linkedhashset_obsFifoSysState40);
    gFSMState37.recreateCachedTransitions();
    java.lang.String str46 = gFSMState37.toIntermediateString();
    obsFifoSysState32.setParent(gFSMState37);
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType48 = null;
    dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState obsFifoSysState49 = obsFifoSysState32.getNextState(obsDistEventType48);
    java.lang.String str50 = obsFifoSysState32.toShortIntStr();
    dynoptic.model.fifosys.gfsm.observed.ObsDistEventType obsDistEventType51 = null;
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.fifosys.ObsFifoSysState> set_obsFifoSysState52 = obsFifoSysState32.getNextStates(obsDistEventType51);
    synoptic.model.event.DistEventType[] distEventType_array53 = new synoptic.model.event.DistEventType[] {  };
    dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType> fsmalphabet_distEventType54 = new dynoptic.model.alphabet.FSMAlphabet<synoptic.model.event.DistEventType>();
    boolean b55 = java.util.Collections.addAll((java.util.Collection<synoptic.model.event.DistEventType>)fsmalphabet_distEventType54, distEventType_array53);
    java.lang.String str56 = fsmalphabet_distEventType54.anyEventScmQRe();
    int i57 = fsmalphabet_distEventType54.size();
    java.lang.String str58 = fsmalphabet_distEventType54.toString();
    fsmalphabet_distEventType54.clear();
    dynoptic.model.fifosys.gfsm.GFSMState gFSMState60 = null;
    dynoptic.model.fifosys.gfsm.GFSMPath gFSMPath62 = new dynoptic.model.fifosys.gfsm.GFSMPath(gFSMState60, (int)(byte)100);
    int i63 = gFSMPath62.getPid();
    java.util.List<dynoptic.model.fifosys.gfsm.GFSMState> list_gFSMState64 = gFSMPath62.getStates();
    boolean b65 = fsmalphabet_distEventType54.remove((java.lang.Object)gFSMPath62);
    fsmalphabet_distEventType54.clear();
    boolean b67 = obsFifoSysState32.equals((java.lang.Object)fsmalphabet_distEventType54);
    java.util.Set<dynoptic.model.fifosys.gfsm.observed.ObsDistEventType> set_obsDistEventType68 = obsFifoSysState32.getTransitioningEvents();
    
    // This assertion (symmetry of equals) fails 
    org.junit.Assert.assertTrue("Contract failed: equals-symmetric on linkedhashset_obsFifoSysState40 and fsmalphabet_distEventType54.", linkedhashset_obsFifoSysState40.equals(fsmalphabet_distEventType54) == fsmalphabet_distEventType54.equals(linkedhashset_obsFifoSysState40));

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test127"); }

    mcscm.McScM mcScM1 = new mcscm.McScM("[]");
    dynoptic.model.fifosys.gfsm.observed.ObsFSMState obsFSMState3 = dynoptic.model.fifosys.gfsm.observed.ObsFSMState.consistentAnonInitObsFSMState(0);
    synoptic.model.channelid.ChannelId[] channelId_array5 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId6 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b7 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId6, channelId_array5);
    dynoptic.model.fifosys.cfsm.CFSM cFSM8 = new dynoptic.model.fifosys.cfsm.CFSM((int)'#', (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId6);
    boolean b9 = obsFSMState3.equals((java.lang.Object)arraylist_channelId6);
    synoptic.model.channelid.ChannelId[] channelId_array11 = new synoptic.model.channelid.ChannelId[] {  };
    java.util.ArrayList<synoptic.model.channelid.ChannelId> arraylist_channelId12 = new java.util.ArrayList<synoptic.model.channelid.ChannelId>();
    boolean b13 = java.util.Collections.addAll((java.util.Collection<synoptic.model.channelid.ChannelId>)arraylist_channelId12, channelId_array11);
    dynoptic.model.fifosys.cfsm.CFSM cFSM14 = new dynoptic.model.fifosys.cfsm.CFSM((int)(byte)10, (java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);
    boolean b15 = obsFSMState3.equals((java.lang.Object)arraylist_channelId12);
    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    mcscm.VerifyResult verifyResult16 = mcScM1.getVerifyResult((java.util.List<synoptic.model.channelid.ChannelId>)arraylist_channelId12);

  }

}
