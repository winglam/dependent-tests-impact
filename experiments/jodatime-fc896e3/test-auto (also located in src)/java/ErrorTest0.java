
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class ErrorTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test001"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime dateTime7 = dateTime5.minusHours((int)' ');
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test002"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.ReadableInstant readableInstant6 = null;
    org.joda.time.ReadableDuration readableDuration7 = null;
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
    org.joda.time.DateTime dateTime9 = dateTime5.minus((org.joda.time.ReadablePeriod)mutablePeriod8);
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test003"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
    org.joda.time.DateMidnight.Property property6 = dateMidnight4.dayOfYear();
    org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant2, (org.joda.time.ReadableInstant)dateMidnight4);
    int i8 = dateMidnight4.getEra();
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test004"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime dateTime7 = dateTime5.minusMonths((-101));
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test005"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime dateTime7 = dateTime5.withYearOfEra((int)(byte)100);
    
    // Checks the contract:  compareTo-equals on mutableDateTime1 and instant2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test006"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime dateTime7 = dateTime5.withWeekyear(6);
    
    // Checks the contract:  compareTo-equals on mutableDateTime1 and instant2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test007"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
    org.joda.time.DateMidnight.Property property6 = dateMidnight4.dayOfYear();
    org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant2, (org.joda.time.ReadableInstant)dateMidnight4);
    org.joda.time.Hours hours8 = minutes7.toStandardHours();
    
    // Checks the contract:  compareTo-equals on mutableDateTime1 and instant2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test008"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
    int i9 = dateTimeZone6.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone6);
    org.joda.time.DateTime dateTime11 = dateTime5.toDateTime(dateTimeZone6);
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test009"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    org.joda.time.Minutes minutes7 = minutes5.negated();
    
    // Checks the contract:  compareTo-substitutability on minutes7, days6, and days6
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes7, days6, and days6", !(minutes7.compareTo(days6) == 0) || (Math.signum(minutes7.compareTo(days6)) == Math.signum(days6.compareTo(days6))));

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test010"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = org.joda.time.Days.daysIn((org.joda.time.ReadableInterval)interval4);
    
    // Checks the contract:  compareTo-substitutability on days6, minutes5, and minutes5
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days6, minutes5, and minutes5", !(days6.compareTo(minutes5) == 0) || (Math.signum(days6.compareTo(minutes5)) == Math.signum(minutes5.compareTo(minutes5))));

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test011"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology1);
    org.joda.time.LocalDateTime localDateTime3 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime5 = localDateTime3.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property6 = localDateTime3.dayOfMonth();
    org.joda.time.Interval interval7 = property6.toInterval();
    org.joda.time.Minutes minutes8 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval7);
    org.joda.time.Days days9 = minutes8.toStandardDays();
    org.joda.time.YearMonth yearMonth10 = yearMonth2.minus((org.joda.time.ReadablePeriod)days9);
    
    // Checks the contract:  compareTo-substitutability on days9, minutes8, and minutes8
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days9, minutes8, and minutes8", !(days9.compareTo(minutes8) == 0) || (Math.signum(days9.compareTo(minutes8)) == Math.signum(minutes8.compareTo(minutes8))));

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test012"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.Chronology chronology6 = null;
    org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
    org.joda.time.Instant instant8 = mutableDateTime7.toInstant();
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone9);
    org.joda.time.DateMidnight.Property property11 = dateMidnight10.centuryOfEra();
    org.joda.time.DateMidnight.Property property12 = dateMidnight10.dayOfYear();
    org.joda.time.Minutes minutes13 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant8, (org.joda.time.ReadableInstant)dateMidnight10);
    org.joda.time.DateTime dateTime15 = dateTime5.withPeriodAdded((org.joda.time.ReadablePeriod)minutes13, (int)(byte)10);
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test013"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime dateTime7 = dateTime5.plusWeeks(345);
    
    // Checks the contract:  compareTo-equals on mutableDateTime1 and instant2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test014"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    org.joda.time.Minutes minutes7 = null;
    boolean b8 = minutes5.isLessThan(minutes7);
    
    // Checks the contract:  compareTo-substitutability on minutes5, days6, and days6
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes5, days6, and days6", !(minutes5.compareTo(days6) == 0) || (Math.signum(minutes5.compareTo(days6)) == Math.signum(days6.compareTo(days6))));

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test015"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    int i8 = minutes5.getValue(0);
    
    // Checks the contract:  compareTo-substitutability on minutes5, days6, and days6
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes5, days6, and days6", !(minutes5.compareTo(days6) == 0) || (Math.signum(minutes5.compareTo(days6)) == Math.signum(days6.compareTo(days6))));

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test016"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    org.joda.time.Duration duration7 = minutes5.toStandardDuration();
    
    // Checks the contract:  compareTo-substitutability on minutes5, days6, and days6
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes5, days6, and days6", !(minutes5.compareTo(days6) == 0) || (Math.signum(minutes5.compareTo(days6)) == Math.signum(days6.compareTo(days6))));

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test017"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
    org.joda.time.DateMidnight.Property property6 = dateMidnight4.dayOfYear();
    org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant2, (org.joda.time.ReadableInstant)dateMidnight4);
    org.joda.time.Instant instant9 = instant2.plus((long)(short)10);
    org.joda.time.Instant instant11 = instant9.plus((long)0);
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test018"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    java.lang.String str2 = localDate1.toString();
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = new org.joda.time.Period((long)(byte)1, (long)24, periodType5);
    org.joda.time.LocalDate localDate8 = localDate1.withPeriodAdded((org.joda.time.ReadablePeriod)period6, 345);
    org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay();
    org.joda.time.LocalDate localDate10 = localDate8.withFields((org.joda.time.ReadablePartial)timeOfDay9);
    
    // Checks the contract:  compareTo-substitutability on timeOfDay9, localDate8, and localDate10
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on timeOfDay9, localDate8, and localDate10", !(timeOfDay9.compareTo(localDate8) == 0) || (Math.signum(timeOfDay9.compareTo(localDate10)) == Math.signum(localDate8.compareTo(localDate10))));

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test019"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime dateTime7 = dateTime5.withMillisOfDay((int)(byte)0);
    
    // Checks the contract:  compareTo-equals on instant2 and mutableDateTime1
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on instant2 and mutableDateTime1", (instant2.compareTo(mutableDateTime1) == 0) == instant2.equals(mutableDateTime1));

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test020"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    mutableDateTime1.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
    long long7 = dateMidnight6.getMillis();
    org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(24);
    org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime1, (org.joda.time.ReadableInstant)dateMidnight9);
    org.joda.time.Minutes minutes11 = org.joda.time.Minutes.THREE;
    org.joda.time.Minutes minutes12 = minutes10.plus(minutes11);
    org.joda.time.Days days13 = minutes12.toStandardDays();
    
    // Checks the contract:  compareTo-substitutability on days13, minutes11, and minutes11
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days13, minutes11, and minutes11", !(days13.compareTo(minutes11) == 0) || (Math.signum(days13.compareTo(minutes11)) == Math.signum(minutes11.compareTo(minutes11))));

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test021"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone5);
    boolean b7 = localDateTime2.isAfter((org.joda.time.ReadablePartial)localDateTime6);
    org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withDayOfMonth((int)(short)10);
    org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
    org.joda.time.YearMonthDay yearMonthDay14 = yearMonthDay12.minusMonths(0);
    org.joda.time.LocalDateTime localDateTime15 = localDateTime9.withFields((org.joda.time.ReadablePartial)yearMonthDay14);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime6 and yearMonthDay12
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime6 and yearMonthDay12", Math.signum(localDateTime6.compareTo(yearMonthDay12)) == -Math.signum(yearMonthDay12.compareTo(localDateTime6)));

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test022"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
    org.joda.time.DateMidnight.Property property6 = dateMidnight4.dayOfYear();
    org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant2, (org.joda.time.ReadableInstant)dateMidnight4);
    org.joda.time.Seconds seconds8 = minutes7.toStandardSeconds();
    
    // Checks the contract:  compareTo-equals on mutableDateTime1 and instant2
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime1 and instant2", (mutableDateTime1.compareTo(instant2) == 0) == mutableDateTime1.equals(instant2));

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test023"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    mutableDateTime1.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
    long long7 = dateMidnight6.getMillis();
    org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(24);
    org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime1, (org.joda.time.ReadableInstant)dateMidnight9);
    org.joda.time.Minutes minutes11 = org.joda.time.Minutes.THREE;
    org.joda.time.Minutes minutes12 = minutes10.plus(minutes11);
    org.joda.time.Seconds seconds13 = org.joda.time.Seconds.standardSecondsIn((org.joda.time.ReadablePeriod)minutes11);
    
    // Checks the contract:  compareTo-substitutability on seconds13, minutes12, and minutes12
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on seconds13, minutes12, and minutes12", !(seconds13.compareTo(minutes12) == 0) || (Math.signum(seconds13.compareTo(minutes12)) == Math.signum(minutes12.compareTo(minutes12))));

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test024"); }

    org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone2);
    org.joda.time.YearMonth yearMonth4 = new org.joda.time.YearMonth((long)(byte)0, (org.joda.time.Chronology)iSOChronology3);
    org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(10L, (org.joda.time.Chronology)iSOChronology3);
    
    // Checks the contract:  compareTo-substitutability on timeOfDay5, yearMonth4, and yearMonth4
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on timeOfDay5, yearMonth4, and yearMonth4", !(timeOfDay5.compareTo(yearMonth4) == 0) || (Math.signum(timeOfDay5.compareTo(yearMonth4)) == Math.signum(yearMonth4.compareTo(yearMonth4))));

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test025"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
    java.util.Locale locale8 = null;
    org.joda.time.DateTime dateTime9 = property6.setCopy("26", locale8);
    org.joda.time.Seconds seconds10 = org.joda.time.Seconds.TWO;
    org.joda.time.DateTime dateTime12 = dateTime9.withPeriodAdded((org.joda.time.ReadablePeriod)seconds10, 5);
    org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
    org.joda.time.Chronology chronology15 = null;
    org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
    org.joda.time.Instant instant17 = mutableDateTime16.toInstant();
    mutableDateTime16.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone20 = null;
    org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone20);
    long long22 = dateMidnight21.getMillis();
    org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.plusDays(24);
    org.joda.time.Minutes minutes25 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime16, (org.joda.time.ReadableInstant)dateMidnight24);
    int i26 = dateTimeZone13.getOffset((org.joda.time.ReadableInstant)dateMidnight24);
    org.joda.time.DateTimeZone.setDefault(dateTimeZone13);
    org.joda.time.DateTime dateTime28 = dateTime12.withZone(dateTimeZone13);
    
    // Checks the contract:  compareTo-anti-symmetric on seconds10 and minutes25
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on seconds10 and minutes25", Math.signum(seconds10.compareTo(minutes25)) == -Math.signum(minutes25.compareTo(seconds10)));

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test026"); }

    org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
    org.joda.time.Days days1 = org.joda.time.Days.SEVEN;
    org.joda.time.Minutes minutes2 = days1.toStandardMinutes();
    org.joda.time.Days days3 = days0.plus(days1);
    
    // Checks the contract:  compareTo-substitutability on days3, minutes2, and minutes2
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days3, minutes2, and minutes2", !(days3.compareTo(minutes2) == 0) || (Math.signum(days3.compareTo(minutes2)) == Math.signum(minutes2.compareTo(minutes2))));

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test027"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    java.lang.String str2 = localDate1.toString();
    org.joda.time.LocalDate localDate4 = localDate1.withDayOfMonth(3);
    org.joda.time.YearMonth yearMonth6 = org.joda.time.YearMonth.parse("1969-12-31");
    int i7 = yearMonth6.size();
    org.joda.time.LocalDate localDate8 = localDate4.withFields((org.joda.time.ReadablePartial)yearMonth6);
    
    // Checks the contract:  compareTo-substitutability on yearMonth6, localDate1, and localDate1
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on yearMonth6, localDate1, and localDate1", !(yearMonth6.compareTo(localDate1) == 0) || (Math.signum(yearMonth6.compareTo(localDate1)) == Math.signum(localDate1.compareTo(localDate1))));

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test028"); }

    org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
    org.joda.time.Minutes minutes1 = days0.toStandardMinutes();
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
    mutableDateTime3.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone7);
    long long9 = dateMidnight8.getMillis();
    org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.plusDays(24);
    org.joda.time.Minutes minutes12 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime3, (org.joda.time.ReadableInstant)dateMidnight11);
    org.joda.time.Minutes minutes13 = org.joda.time.Minutes.THREE;
    org.joda.time.Minutes minutes14 = minutes12.plus(minutes13);
    boolean b15 = minutes1.isGreaterThan(minutes14);
    
    // Checks the contract:  compareTo-anti-symmetric on minutes13 and days0
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on minutes13 and days0", Math.signum(minutes13.compareTo(days0)) == -Math.signum(days0.compareTo(minutes13)));

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test029"); }

    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object)chronology5, periodType7, (org.joda.time.Chronology)gregorianChronology8);
    mutablePeriod3.setPeriod(readableDuration4, chronology5);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
    org.joda.time.DurationField durationField14 = copticChronology13.days();
    org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology13);
    org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
    mutablePeriod3.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology13);
    org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology13);
    int i19 = localTime18.getMillisOfSecond();
    org.joda.time.LocalTime.Property property20 = localTime18.secondOfMinute();
    org.joda.time.DateTime dateTime21 = localTime18.toDateTimeToday();
    org.joda.time.LocalDateTime localDateTime22 = dateTime21.toLocalDateTime();
    
    // Checks the contract:  compareTo-substitutability on localDateTime22, localTime18, and localTime18
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDateTime22, localTime18, and localTime18", !(localDateTime22.compareTo(localTime18) == 0) || (Math.signum(localDateTime22.compareTo(localTime18)) == Math.signum(localTime18.compareTo(localTime18))));

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test030"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    org.joda.time.Days days8 = days6.multipliedBy(47);
    
    // Checks the contract:  compareTo-substitutability on days8, minutes5, and minutes5
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days8, minutes5, and minutes5", !(days8.compareTo(minutes5) == 0) || (Math.signum(days8.compareTo(minutes5)) == Math.signum(minutes5.compareTo(minutes5))));

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test031"); }

    org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int)(short)-1);
    org.joda.time.Seconds seconds2 = org.joda.time.Seconds.TWO;
    boolean b3 = seconds1.isLessThan(seconds2);
    org.joda.time.Days days4 = seconds2.toStandardDays();
    
    // Checks the contract:  compareTo-substitutability on days4, seconds1, and seconds1
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days4, seconds1, and seconds1", !(days4.compareTo(seconds1) == 0) || (Math.signum(days4.compareTo(seconds1)) == Math.signum(seconds1.compareTo(seconds1))));

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test032"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfMonth();
    org.joda.time.Interval interval9 = property8.toInterval();
    boolean b10 = interval4.isAfter((org.joda.time.ReadableInterval)interval9);
    org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period16 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology15);
    org.joda.time.DateTimeZone dateTimeZone17 = gregorianChronology15.getZone();
    org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology15);
    org.joda.time.DateTimeField dateTimeField19 = gregorianChronology15.minuteOfHour();
    org.joda.time.Interval interval20 = interval4.withChronology((org.joda.time.Chronology)gregorianChronology15);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime2 and yearMonthDay18
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime2 and yearMonthDay18", Math.signum(localDateTime2.compareTo(yearMonthDay18)) == -Math.signum(yearMonthDay18.compareTo(localDateTime2)));

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test033"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period5 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology4.getZone();
    org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeField dateTimeField8 = gregorianChronology4.secondOfMinute();
    org.joda.time.Partial partial9 = new org.joda.time.Partial((org.joda.time.Chronology)gregorianChronology4);
    
    // Checks the contract:  compareTo-substitutability on partial9, yearMonthDay7, and yearMonthDay7
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on partial9, yearMonthDay7, and yearMonthDay7", !(partial9.compareTo(yearMonthDay7) == 0) || (Math.signum(partial9.compareTo(yearMonthDay7)) == Math.signum(yearMonthDay7.compareTo(yearMonthDay7))));

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test034"); }

    org.joda.time.Duration duration2 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.Days days3 = duration2.toStandardDays();
    org.joda.time.Seconds seconds4 = org.joda.time.Seconds.TWO;
    org.joda.time.DurationFieldType durationFieldType5 = seconds4.getFieldType();
    boolean b6 = days3.isSupported(durationFieldType5);
    
    // Checks the contract:  compareTo-substitutability on days3, seconds4, and seconds4
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days3, seconds4, and seconds4", !(days3.compareTo(seconds4) == 0) || (Math.signum(days3.compareTo(seconds4)) == Math.signum(seconds4.compareTo(seconds4))));

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test035"); }

    org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
    org.joda.time.Weeks weeks1 = days0.toStandardWeeks();
    org.joda.time.Minutes minutes2 = weeks1.toStandardMinutes();
    
    // Checks the contract:  compareTo-substitutability on minutes2, days0, and days0
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes2, days0, and days0", !(minutes2.compareTo(days0) == 0) || (Math.signum(minutes2.compareTo(days0)) == Math.signum(days0.compareTo(days0))));

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test036"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays((-1));
    org.joda.time.Chronology chronology3 = localDateTime2.getChronology();
    org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(chronology3);
    
    // Checks the contract:  compareTo-substitutability on timeOfDay4, localDateTime2, and localDateTime2
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on timeOfDay4, localDateTime2, and localDateTime2", !(timeOfDay4.compareTo(localDateTime2) == 0) || (Math.signum(timeOfDay4.compareTo(localDateTime2)) == Math.signum(localDateTime2.compareTo(localDateTime2))));

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test037"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.DurationField durationField3 = copticChronology2.days();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone5);
    org.joda.time.LocalDateTime.Property property7 = localDateTime6.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone9);
    boolean b11 = localDateTime6.isAfter((org.joda.time.ReadablePartial)localDateTime10);
    org.joda.time.DateTimeZone dateTimeZone13 = null;
    org.joda.time.LocalDateTime localDateTime14 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone13);
    org.joda.time.LocalDateTime localDateTime16 = localDateTime14.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property17 = localDateTime16.dayOfYear();
    org.joda.time.PeriodType periodType18 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period19 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime6, (org.joda.time.ReadablePartial)localDateTime16, periodType18);
    int[] i_array21 = copticChronology2.get((org.joda.time.ReadablePartial)localDateTime6, 1496646000000L);
    org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(3155760000000L, (org.joda.time.Chronology)copticChronology2);
    
    // Checks the contract:  compareTo-substitutability on timeOfDay22, localDateTime14, and localDateTime14
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on timeOfDay22, localDateTime14, and localDateTime14", !(timeOfDay22.compareTo(localDateTime14) == 0) || (Math.signum(timeOfDay22.compareTo(localDateTime14)) == Math.signum(localDateTime14.compareTo(localDateTime14))));

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test038"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Hours hours7 = period4.toStandardHours();
    org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfMonth();
    org.joda.time.Interval interval12 = property11.toInterval();
    org.joda.time.Minutes minutes13 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval12);
    org.joda.time.Period period14 = interval12.toPeriod();
    org.joda.time.Period period15 = period4.withFields((org.joda.time.ReadablePeriod)period14);
    
    // Checks the contract:  compareTo-anti-symmetric on hours7 and minutes13
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on hours7 and minutes13", Math.signum(hours7.compareTo(minutes13)) == -Math.signum(minutes13.compareTo(hours7)));

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test039"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    org.joda.time.DurationField durationField5 = copticChronology4.days();
    boolean b6 = org.joda.time.field.FieldUtils.equals((java.lang.Object)localDateTime2, (java.lang.Object)durationField5);
    org.joda.time.LocalDateTime localDateTime8 = localDateTime2.withEra(1);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(dateTimeZone9);
    org.joda.time.TimeOfDay timeOfDay12 = timeOfDay10.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property13 = timeOfDay10.secondOfMinute();
    org.joda.time.DateTimeZone dateTimeZone14 = null;
    org.joda.time.TimeOfDay timeOfDay15 = new org.joda.time.TimeOfDay(dateTimeZone14);
    boolean b16 = timeOfDay10.isBefore((org.joda.time.ReadablePartial)timeOfDay15);
    org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
    int i20 = dateTimeZone17.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone17);
    org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property24 = dateTime21.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
    int i29 = dateTimeZone26.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime30 = org.joda.time.DateTime.now(dateTimeZone26);
    org.joda.time.DateTime dateTime32 = dateTime30.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property33 = dateTime30.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType34 = property33.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator35 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType25, dateTimeFieldType34);
    org.joda.time.DateTimeZone dateTimeZone36 = null;
    org.joda.time.TimeOfDay timeOfDay37 = new org.joda.time.TimeOfDay(dateTimeZone36);
    org.joda.time.TimeOfDay timeOfDay39 = timeOfDay37.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property40 = timeOfDay37.secondOfMinute();
    org.joda.time.TimeOfDay.Property property41 = timeOfDay37.millisOfSecond();
    java.util.Locale locale42 = null;
    int i43 = property41.getMaximumTextLength(locale42);
    org.joda.time.DateTimeFieldType dateTimeFieldType44 = property41.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator45 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType34, dateTimeFieldType44);
    org.joda.time.TimeOfDay.Property property46 = timeOfDay15.property(dateTimeFieldType44);
    boolean b47 = localDateTime2.isSupported(dateTimeFieldType44);
    
    // Checks the contract:  compareTo-anti-symmetric on timeOfDay10 and localDateTime8
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on timeOfDay10 and localDateTime8", Math.signum(timeOfDay10.compareTo(localDateTime8)) == -Math.signum(localDateTime8.compareTo(timeOfDay10)));

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test040"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.DateTimeZone dateTimeZone2 = null;
    org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
    java.lang.String str4 = copticChronology3.toString();
    org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
    org.joda.time.TimeOfDay timeOfDay7 = new org.joda.time.TimeOfDay(dateTimeZone5);
    org.joda.time.Chronology chronology8 = copticChronology3.withZone(dateTimeZone5);
    org.joda.time.DateTime dateTime9 = mutableDateTime1.toDateTime(dateTimeZone5);
    java.lang.String str11 = dateTimeZone5.getShortName((long)298);
    org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay(dateTimeZone5);
    
    // Checks the contract:  compareTo-substitutability on monthDay12, timeOfDay7, and timeOfDay7
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on monthDay12, timeOfDay7, and timeOfDay7", !(monthDay12.compareTo(timeOfDay7) == 0) || (Math.signum(monthDay12.compareTo(timeOfDay7)) == Math.signum(timeOfDay7.compareTo(timeOfDay7))));

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test041"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
    int i6 = dateTimeZone3.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone3);
    org.joda.time.Duration duration10 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.Duration duration13 = duration10.withDurationAdded((long)28, (int)' ');
    org.joda.time.DateTimeZone dateTimeZone14 = null;
    org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone14);
    org.joda.time.DateMidnight.Property property16 = dateMidnight15.centuryOfEra();
    org.joda.time.PeriodType periodType17 = null;
    org.joda.time.MutablePeriod mutablePeriod18 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration13, (org.joda.time.ReadableInstant)dateMidnight15, periodType17);
    org.joda.time.DateTime dateTime20 = dateTime7.withDurationAdded((org.joda.time.ReadableDuration)duration13, 5);
    org.joda.time.DateTimeZone dateTimeZone21 = null;
    org.joda.time.chrono.CopticChronology copticChronology22 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone21);
    org.joda.time.YearMonth yearMonth23 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology22);
    org.joda.time.YearMonth yearMonth25 = yearMonth23.minusYears((int)'a');
    org.joda.time.YearMonth yearMonth27 = yearMonth23.minusYears((-1));
    org.joda.time.DateTimeFieldType dateTimeFieldType29 = yearMonth23.getFieldType(0);
    int i30 = dateTime20.get(dateTimeFieldType29);
    int i31 = localDateTime2.get(dateTimeFieldType29);
    
    // Checks the contract:  compareTo-substitutability on localDateTime2, yearMonth27, and yearMonth27
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDateTime2, yearMonth27, and yearMonth27", !(localDateTime2.compareTo(yearMonth27) == 0) || (Math.signum(localDateTime2.compareTo(yearMonth27)) == Math.signum(yearMonth27.compareTo(yearMonth27))));

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test042"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
    mutableDateTime3.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone7);
    long long9 = dateMidnight8.getMillis();
    org.joda.time.DateMidnight dateMidnight11 = dateMidnight8.plusDays(24);
    org.joda.time.Minutes minutes12 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime3, (org.joda.time.ReadableInstant)dateMidnight11);
    int i13 = dateTimeZone0.getOffset((org.joda.time.ReadableInstant)dateMidnight11);
    org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
    int i17 = dateTimeZone14.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone14);
    org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property21 = dateTime18.millisOfDay();
    org.joda.time.DateTime dateTime23 = property21.addToCopy(0);
    org.joda.time.Chronology chronology24 = null;
    org.joda.time.MutableDateTime mutableDateTime25 = new org.joda.time.MutableDateTime(chronology24);
    java.util.GregorianCalendar gregorianCalendar26 = mutableDateTime25.toGregorianCalendar();
    mutableDateTime25.addMinutes((int)(byte)1);
    org.joda.time.Weeks weeks29 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant)dateTime23, (org.joda.time.ReadableInstant)mutableDateTime25);
    int i30 = weeks29.getWeeks();
    org.joda.time.Weeks weeks32 = weeks29.minus(0);
    org.joda.time.DateMidnight dateMidnight34 = dateMidnight11.withPeriodAdded((org.joda.time.ReadablePeriod)weeks32, 236);
    
    // Checks the contract:  compareTo-anti-symmetric on minutes12 and weeks32
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on minutes12 and weeks32", Math.signum(minutes12.compareTo(weeks32)) == -Math.signum(weeks32.compareTo(minutes12)));

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test043"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DurationField durationField4 = copticChronology1.eras();
    org.joda.time.DateTimeField dateTimeField5 = copticChronology1.weekyearOfCentury();
    
    // Checks the contract:  compareTo-anti-symmetric on durationField2 and durationField4
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on durationField2 and durationField4", Math.signum(durationField2.compareTo(durationField4)) == -Math.signum(durationField4.compareTo(durationField2)));

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test044"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Period period8 = period6.minusHours(10);
    org.joda.time.Period period9 = period8.toPeriod();
    org.joda.time.Duration duration10 = period9.toStandardDuration();
    org.joda.time.ReadableInstant readableInstant11 = null;
    org.joda.time.ReadableDuration readableDuration12 = null;
    org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology15 = null;
    org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
    int i19 = dateTimeFormatter14.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime16, "secondOfMinute", 100);
    org.joda.time.DateTimeZone dateTimeZone20 = null;
    org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone20);
    long long22 = dateMidnight21.getMillis();
    org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.plusDays(24);
    mutablePeriod13.setPeriod((org.joda.time.ReadableInstant)mutableDateTime16, (org.joda.time.ReadableInstant)dateMidnight24);
    org.joda.time.DateTimeZone dateTimeZone27 = null;
    org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
    java.lang.String str29 = copticChronology28.toString();
    mutablePeriod13.setPeriod(0L, (org.joda.time.Chronology)copticChronology28);
    org.joda.time.DurationField durationField31 = copticChronology28.hours();
    java.lang.String str32 = copticChronology28.toString();
    org.joda.time.Period period33 = duration10.toPeriod((org.joda.time.Chronology)copticChronology28);
    org.joda.time.DateTimeZone dateTimeZone34 = null;
    org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone34);
    long long36 = dateMidnight35.getMillis();
    org.joda.time.DateMidnight dateMidnight38 = dateMidnight35.plusDays(24);
    org.joda.time.LocalDate localDate40 = new org.joda.time.LocalDate((long)10);
    org.joda.time.DateMidnight dateMidnight41 = dateMidnight38.withFields((org.joda.time.ReadablePartial)localDate40);
    org.joda.time.DateTimeZone dateTimeZone43 = null;
    org.joda.time.LocalDateTime localDateTime44 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone43);
    org.joda.time.LocalDateTime.Property property45 = localDateTime44.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone47 = null;
    org.joda.time.LocalDateTime localDateTime48 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone47);
    boolean b49 = localDateTime44.isAfter((org.joda.time.ReadablePartial)localDateTime48);
    org.joda.time.DateTimeZone dateTimeZone51 = null;
    org.joda.time.LocalDateTime localDateTime52 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone51);
    org.joda.time.LocalDateTime localDateTime54 = localDateTime52.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property55 = localDateTime54.dayOfYear();
    org.joda.time.PeriodType periodType56 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period57 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime44, (org.joda.time.ReadablePartial)localDateTime54, periodType56);
    org.joda.time.PeriodType periodType58 = periodType56.withSecondsRemoved();
    org.joda.time.MutablePeriod mutablePeriod59 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration10, (org.joda.time.ReadableInstant)dateMidnight41, periodType56);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime48 and localDate40
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime48 and localDate40", Math.signum(localDateTime48.compareTo(localDate40)) == -Math.signum(localDate40.compareTo(localDateTime48)));

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test045"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths(0);
    org.joda.time.Chronology chronology5 = null;
    java.util.Locale locale6 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket9 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology5, locale6, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket9.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket9.setZone(dateTimeZone12);
    org.joda.time.DateMidnight dateMidnight14 = yearMonthDay1.toDateMidnight(dateTimeZone12);
    org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property18 = localDateTime15.dayOfMonth();
    org.joda.time.Interval interval19 = property18.toInterval();
    org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval19);
    org.joda.time.Duration duration21 = minutes20.toStandardDuration();
    org.joda.time.DateMidnight dateMidnight22 = dateMidnight14.minus((org.joda.time.ReadableDuration)duration21);
    
    // Checks the contract:  compareTo-anti-symmetric on yearMonthDay3 and localDateTime15
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on yearMonthDay3 and localDateTime15", Math.signum(yearMonthDay3.compareTo(localDateTime15)) == -Math.signum(localDateTime15.compareTo(yearMonthDay3)));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test046"); }

    // during test generation this statement threw an exception of type java.lang.NullPointerException in error
    boolean b0 = org.joda.time.tz.ZoneInfoCompiler.verbose();

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test047"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.LocalDateTime localDateTime5 = localDateTime0.minusDays(535);
    org.joda.time.LocalDateTime localDateTime7 = localDateTime0.withWeekOfWeekyear((int)(byte)10);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.chrono.CopticChronology copticChronology10 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone9);
    org.joda.time.Chronology chronology11 = copticChronology10.withUTC();
    org.joda.time.MonthDay monthDay12 = new org.joda.time.MonthDay((long)'a', (org.joda.time.Chronology)copticChronology10);
    org.joda.time.MonthDay monthDay14 = monthDay12.plusDays((int)'#');
    org.joda.time.LocalDateTime localDateTime15 = localDateTime0.withFields((org.joda.time.ReadablePartial)monthDay12);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime0 and monthDay14
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime0 and monthDay14", Math.signum(localDateTime0.compareTo(monthDay14)) == -Math.signum(monthDay14.compareTo(localDateTime0)));

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test048"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period5 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology4.getZone();
    org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(dateTimeZone8);
    org.joda.time.TimeOfDay timeOfDay11 = timeOfDay9.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property12 = timeOfDay9.secondOfMinute();
    java.lang.String str13 = property12.getName();
    org.joda.time.TimeOfDay timeOfDay15 = property12.addWrapFieldToCopy(429);
    org.joda.time.DateTime dateTime16 = yearMonthDay7.toDateTime(timeOfDay15);
    
    // Checks the contract:  compareTo-substitutability on yearMonthDay7, timeOfDay11, and timeOfDay11
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on yearMonthDay7, timeOfDay11, and timeOfDay11", !(yearMonthDay7.compareTo(timeOfDay11) == 0) || (Math.signum(yearMonthDay7.compareTo(timeOfDay11)) == Math.signum(timeOfDay11.compareTo(timeOfDay11))));

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test049"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    mutablePeriod2.addMillis((int)(byte)1);
    int i8 = mutablePeriod2.getMonths();
    org.joda.time.LocalDateTime localDateTime9 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime11 = localDateTime9.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property12 = localDateTime9.dayOfMonth();
    org.joda.time.Interval interval13 = property12.toInterval();
    mutablePeriod2.setPeriod((org.joda.time.ReadableInterval)interval13);
    mutablePeriod2.setYears((-101));
    org.joda.time.DateTimeZone dateTimeZone20 = null;
    org.joda.time.chrono.CopticChronology copticChronology21 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone20);
    java.lang.String str22 = copticChronology21.toString();
    org.joda.time.DateTimeZone dateTimeZone23 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology24 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone23);
    org.joda.time.TimeOfDay timeOfDay25 = new org.joda.time.TimeOfDay(dateTimeZone23);
    org.joda.time.Chronology chronology26 = copticChronology21.withZone(dateTimeZone23);
    org.joda.time.MutableDateTime mutableDateTime27 = new org.joda.time.MutableDateTime((long)'a', chronology26);
    mutablePeriod2.setPeriod((long)999, (long)0, chronology26);
    
    // Checks the contract:  compareTo-anti-symmetric on timeOfDay25 and localDateTime9
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on timeOfDay25 and localDateTime9", Math.signum(timeOfDay25.compareTo(localDateTime9)) == -Math.signum(localDateTime9.compareTo(timeOfDay25)));

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test050"); }

    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.PeriodType periodType3 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object)chronology1, periodType3, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((-1L), chronology1);
    org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
    int i10 = dateTimeZone7.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone7);
    org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property14 = dateTime11.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone16 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology17 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone16);
    int i19 = dateTimeZone16.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime20 = org.joda.time.DateTime.now(dateTimeZone16);
    org.joda.time.DateTime dateTime22 = dateTime20.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property23 = dateTime20.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType24 = property23.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator25 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType15, dateTimeFieldType24);
    org.joda.time.Partial partial27 = new org.joda.time.Partial(dateTimeFieldType15, (int)(byte)1);
    int i28 = localTime6.get(dateTimeFieldType15);
    
    // Checks the contract:  compareTo-substitutability on localTime6, partial27, and partial27
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localTime6, partial27, and partial27", !(localTime6.compareTo(partial27) == 0) || (Math.signum(localTime6.compareTo(partial27)) == Math.signum(partial27.compareTo(partial27))));

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test051"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.minuteOfDay();
    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
    int i6 = dateTimeZone3.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone3);
    org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property10 = dateTime7.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType11 = property10.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
    int i15 = dateTimeZone12.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone12);
    org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property19 = dateTime16.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator21 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType11, dateTimeFieldType20);
    org.joda.time.Partial partial23 = new org.joda.time.Partial(dateTimeFieldType11, (int)(byte)1);
    org.joda.time.field.OffsetDateTimeField offsetDateTimeField27 = new org.joda.time.field.OffsetDateTimeField(dateTimeField2, dateTimeFieldType11, 14, 628, 1034);
    long long29 = offsetDateTimeField27.remainder(3155760000000L);
    org.joda.time.DateTimeZone dateTimeZone30 = null;
    org.joda.time.YearMonthDay yearMonthDay31 = new org.joda.time.YearMonthDay(dateTimeZone30);
    org.joda.time.DateMidnight dateMidnight32 = yearMonthDay31.toDateMidnight();
    java.util.Locale locale34 = null;
    java.lang.String str35 = offsetDateTimeField27.getAsText((org.joda.time.ReadablePartial)yearMonthDay31, 33, locale34);
    
    // Checks the contract:  compareTo-substitutability on yearMonthDay31, partial23, and partial23
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on yearMonthDay31, partial23, and partial23", !(yearMonthDay31.compareTo(partial23) == 0) || (Math.signum(yearMonthDay31.compareTo(partial23)) == Math.signum(partial23.compareTo(partial23))));

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test052"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)999, dateTimeZone1);
    org.joda.time.DateTimeZone dateTimeZone4 = null;
    org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
    java.lang.String str6 = copticChronology5.toString();
    org.joda.time.TimeOfDay timeOfDay7 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, (org.joda.time.Chronology)copticChronology5);
    org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
    int i11 = dateTimeZone8.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone8);
    org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property15 = dateTime12.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
    int i20 = dateTimeZone17.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone17);
    org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property24 = dateTime21.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator26 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType16, dateTimeFieldType25);
    int i27 = timeOfDay7.indexOf(dateTimeFieldType25);
    boolean b28 = localDateTime2.isSupported(dateTimeFieldType25);
    
    // Checks the contract:  compareTo-substitutability on localDateTime2, timeOfDay7, and timeOfDay7
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDateTime2, timeOfDay7, and timeOfDay7", !(localDateTime2.compareTo(timeOfDay7) == 0) || (Math.signum(localDateTime2.compareTo(timeOfDay7)) == Math.signum(timeOfDay7.compareTo(timeOfDay7))));

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test053"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalTime localTime3 = localDateTime0.toLocalTime();
    
    // Checks the contract:  compareTo-substitutability on localTime3, localDateTime0, and localDateTime2
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localTime3, localDateTime0, and localDateTime2", !(localTime3.compareTo(localDateTime0) == 0) || (Math.signum(localTime3.compareTo(localDateTime2)) == Math.signum(localDateTime0.compareTo(localDateTime2))));

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test054"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setMonths(100);
    mutablePeriod2.setDays((int)'#');
    int i11 = mutablePeriod2.getWeeks();
    int i12 = mutablePeriod2.getMillis();
    org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
    org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((org.joda.time.Chronology)iSOChronology15);
    org.joda.time.DateTimeZone dateTimeZone17 = null;
    org.joda.time.chrono.CopticChronology copticChronology18 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone17);
    org.joda.time.Chronology chronology19 = copticChronology18.withUTC();
    org.joda.time.DateTime dateTime20 = dateTime16.withChronology(chronology19);
    mutablePeriod2.setPeriod(0L, chronology19);
    
    // Checks the contract:  compareTo-equals on dateTime20 and dateTime16
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime20 and dateTime16", (dateTime20.compareTo(dateTime16) == 0) == dateTime20.equals(dateTime16));

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test055"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
    org.joda.time.DateMidnight.Property property6 = dateMidnight4.dayOfYear();
    org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant2, (org.joda.time.ReadableInstant)dateMidnight4);
    org.joda.time.ReadableInstant readableInstant8 = null;
    org.joda.time.ReadableDuration readableDuration9 = null;
    org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
    org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod10.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology12);
    org.joda.time.DateMidnight dateMidnight14 = dateMidnight4.plus((org.joda.time.ReadablePeriod)mutablePeriod10);
    org.joda.time.Chronology chronology15 = null;
    org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
    java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
    mutableDateTime16.addMinutes((int)(byte)1);
    org.joda.time.ReadableInstant readableInstant20 = null;
    org.joda.time.ReadableDuration readableDuration21 = null;
    org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod(readableInstant20, readableDuration21);
    org.joda.time.chrono.GregorianChronology gregorianChronology24 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod22.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology24);
    mutableDateTime16.setChronology((org.joda.time.Chronology)gregorianChronology24);
    org.joda.time.MutableDateTime mutableDateTime27 = mutableDateTime16.copy();
    org.joda.time.Period period28 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateMidnight14, (org.joda.time.ReadableInstant)mutableDateTime16);
    org.joda.time.DateTimeZone dateTimeZone29 = null;
    org.joda.time.DateMidnight dateMidnight30 = new org.joda.time.DateMidnight(dateTimeZone29);
    long long31 = dateMidnight30.getMillis();
    org.joda.time.DateMidnight dateMidnight33 = dateMidnight30.plusDays(24);
    org.joda.time.LocalDate localDate35 = new org.joda.time.LocalDate((long)10);
    org.joda.time.DateMidnight dateMidnight36 = dateMidnight33.withFields((org.joda.time.ReadablePartial)localDate35);
    long long37 = dateMidnight33.getMillis();
    org.joda.time.Days days38 = org.joda.time.Days.daysBetween((org.joda.time.ReadableInstant)dateMidnight14, (org.joda.time.ReadableInstant)dateMidnight33);
    
    // Checks the contract:  compareTo-substitutability on days38, minutes7, and minutes7
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days38, minutes7, and minutes7", !(days38.compareTo(minutes7) == 0) || (Math.signum(days38.compareTo(minutes7)) == Math.signum(minutes7.compareTo(minutes7))));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test056"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    org.joda.time.TimeOfDay.Property property5 = timeOfDay1.millisOfSecond();
    org.joda.time.ReadablePeriod readablePeriod6 = null;
    org.joda.time.TimeOfDay timeOfDay8 = timeOfDay1.withPeriodAdded(readablePeriod6, 330);
    org.joda.time.LocalTime localTime9 = timeOfDay1.toLocalTime();
    int i10 = localTime9.getMillisOfSecond();
    org.joda.time.LocalDateTime localDateTime11 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime13 = localDateTime11.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property14 = localDateTime11.dayOfMonth();
    boolean b15 = localTime9.equals((java.lang.Object)localDateTime11);
    
    // Checks the contract:  compareTo-anti-symmetric on timeOfDay1 and localDateTime11
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on timeOfDay1 and localDateTime11", Math.signum(timeOfDay1.compareTo(localDateTime11)) == -Math.signum(localDateTime11.compareTo(timeOfDay1)));

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test057"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.DurationField durationField3 = copticChronology2.days();
    java.util.Locale locale4 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long)8, (org.joda.time.Chronology)copticChronology2, locale4);
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period11 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeZone dateTimeZone12 = gregorianChronology10.getZone();
    org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeField dateTimeField14 = gregorianChronology10.dayOfWeek();
    org.joda.time.field.SkipDateTimeField skipDateTimeField15 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)copticChronology2, dateTimeField14);
    org.joda.time.DurationField durationField16 = skipDateTimeField15.getLeapDurationField();
    org.joda.time.DurationField durationField17 = skipDateTimeField15.getDurationField();
    int i18 = skipDateTimeField15.getMinimumValue();
    
    // Checks the contract:  compareTo-equals on durationField3 and durationField17
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test058"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    java.lang.String str2 = copticChronology1.toString();
    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
    org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(dateTimeZone3);
    org.joda.time.Chronology chronology6 = copticChronology1.withZone(dateTimeZone3);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone7);
    org.joda.time.TimeOfDay timeOfDay10 = timeOfDay8.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property11 = timeOfDay8.secondOfMinute();
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.TimeOfDay timeOfDay13 = new org.joda.time.TimeOfDay(dateTimeZone12);
    boolean b14 = timeOfDay8.isBefore((org.joda.time.ReadablePartial)timeOfDay13);
    boolean b15 = copticChronology1.equals((java.lang.Object)timeOfDay13);
    org.joda.time.LocalDateTime localDateTime16 = org.joda.time.LocalDateTime.now((org.joda.time.Chronology)copticChronology1);
    
    // Checks the contract:  compareTo-substitutability on localDateTime16, timeOfDay8, and timeOfDay10
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDateTime16, timeOfDay8, and timeOfDay10", !(localDateTime16.compareTo(timeOfDay8) == 0) || (Math.signum(localDateTime16.compareTo(timeOfDay10)) == Math.signum(timeOfDay8.compareTo(timeOfDay10))));

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test059"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.DateTimeZone dateTimeZone4 = null;
    org.joda.time.LocalDateTime localDateTime5 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone4);
    org.joda.time.LocalDateTime.Property property6 = localDateTime5.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.LocalDateTime localDateTime9 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone8);
    boolean b10 = localDateTime5.isAfter((org.joda.time.ReadablePartial)localDateTime9);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.LocalDateTime localDateTime13 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone12);
    org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property16 = localDateTime15.dayOfYear();
    org.joda.time.PeriodType periodType17 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period18 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime5, (org.joda.time.ReadablePartial)localDateTime15, periodType17);
    int[] i_array20 = copticChronology1.get((org.joda.time.ReadablePartial)localDateTime5, 1496646000000L);
    org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((org.joda.time.Chronology)copticChronology1);
    
    // Checks the contract:  compareTo-substitutability on timeOfDay21, localDateTime9, and localDateTime9
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on timeOfDay21, localDateTime9, and localDateTime9", !(timeOfDay21.compareTo(localDateTime9) == 0) || (Math.signum(timeOfDay21.compareTo(localDateTime9)) == Math.signum(localDateTime9.compareTo(localDateTime9))));

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test060"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
    org.joda.time.DateMidnight.Property property6 = dateMidnight4.dayOfYear();
    org.joda.time.Minutes minutes7 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant2, (org.joda.time.ReadableInstant)dateMidnight4);
    org.joda.time.DateTime dateTime8 = instant2.toDateTimeISO();
    org.joda.time.ReadableInterval readableInterval9 = null;
    org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
    org.joda.time.Duration duration11 = hours10.toStandardDuration();
    org.joda.time.Instant instant12 = instant2.plus((org.joda.time.ReadableDuration)duration11);
    
    // Checks the contract:  compareTo-anti-symmetric on hours10 and minutes7
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on hours10 and minutes7", Math.signum(hours10.compareTo(minutes7)) == -Math.signum(minutes7.compareTo(hours10)));

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test061"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone9);
    int i12 = dateTimeZone9.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone9);
    org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property16 = dateTime13.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator18 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType8, dateTimeFieldType17);
    org.joda.time.DateTimeZone dateTimeZone19 = null;
    org.joda.time.TimeOfDay timeOfDay20 = new org.joda.time.TimeOfDay(dateTimeZone19);
    org.joda.time.TimeOfDay timeOfDay22 = timeOfDay20.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property23 = timeOfDay20.secondOfMinute();
    org.joda.time.TimeOfDay.Property property24 = timeOfDay20.millisOfSecond();
    java.util.Locale locale25 = null;
    int i26 = property24.getMaximumTextLength(locale25);
    org.joda.time.DateTimeFieldType dateTimeFieldType27 = property24.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator28 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType17, dateTimeFieldType27);
    org.joda.time.DateTimeZone dateTimeZone30 = null;
    org.joda.time.LocalDateTime localDateTime31 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone30);
    org.joda.time.DateTimeZone dateTimeZone32 = null;
    org.joda.time.chrono.CopticChronology copticChronology33 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone32);
    org.joda.time.DurationField durationField34 = copticChronology33.days();
    boolean b35 = org.joda.time.field.FieldUtils.equals((java.lang.Object)localDateTime31, (java.lang.Object)durationField34);
    org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField36 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType17, durationField34);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime31 and timeOfDay22
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime31 and timeOfDay22", Math.signum(localDateTime31.compareTo(timeOfDay22)) == -Math.signum(timeOfDay22.compareTo(localDateTime31)));

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test062"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology1);
    org.joda.time.YearMonth yearMonth4 = yearMonth2.minusYears((int)'a');
    org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
    int i8 = dateTimeZone5.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
    org.joda.time.DateTime dateTime11 = dateTime9.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property12 = dateTime9.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType13 = property12.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
    int i17 = dateTimeZone14.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime18 = org.joda.time.DateTime.now(dateTimeZone14);
    org.joda.time.DateTime dateTime20 = dateTime18.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property21 = dateTime18.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType22 = property21.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator23 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType13, dateTimeFieldType22);
    org.joda.time.Partial partial25 = new org.joda.time.Partial(dateTimeFieldType13, (int)(byte)1);
    int i26 = yearMonth2.indexOf(dateTimeFieldType13);
    
    // Checks the contract:  compareTo-anti-symmetric on partial25 and yearMonth4
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on partial25 and yearMonth4", Math.signum(partial25.compareTo(yearMonth4)) == -Math.signum(yearMonth4.compareTo(partial25)));

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test063"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.DurationField durationField3 = copticChronology2.days();
    java.util.Locale locale4 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long)8, (org.joda.time.Chronology)copticChronology2, locale4);
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period11 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeZone dateTimeZone12 = gregorianChronology10.getZone();
    org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeField dateTimeField14 = gregorianChronology10.dayOfWeek();
    org.joda.time.field.SkipDateTimeField skipDateTimeField15 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)copticChronology2, dateTimeField14);
    org.joda.time.DurationField durationField16 = skipDateTimeField15.getLeapDurationField();
    org.joda.time.DurationField durationField17 = skipDateTimeField15.getDurationField();
    org.joda.time.DurationField durationField18 = skipDateTimeField15.getLeapDurationField();
    
    // Checks the contract:  compareTo-equals on durationField3 and durationField17
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test064"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.DurationField durationField3 = copticChronology2.days();
    java.util.Locale locale4 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long)8, (org.joda.time.Chronology)copticChronology2, locale4);
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period11 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeZone dateTimeZone12 = gregorianChronology10.getZone();
    org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeField dateTimeField14 = gregorianChronology10.dayOfWeek();
    org.joda.time.field.SkipDateTimeField skipDateTimeField15 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)copticChronology2, dateTimeField14);
    org.joda.time.DurationField durationField16 = skipDateTimeField15.getLeapDurationField();
    org.joda.time.DurationField durationField17 = skipDateTimeField15.getDurationField();
    java.util.Locale locale19 = null;
    java.lang.String str20 = skipDateTimeField15.getAsText((long)6, locale19);
    
    // Checks the contract:  compareTo-equals on durationField3 and durationField17
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test065"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.hourOfHalfday();
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime3.toGregorianCalendar();
    mutableDateTime3.addMinutes((int)(byte)1);
    org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
    int i10 = dateTimeZone7.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone7);
    org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property14 = dateTime11.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
    mutableDateTime3.set(dateTimeFieldType15, (int)(byte)10);
    org.joda.time.field.ZeroIsMaxDateTimeField zeroIsMaxDateTimeField18 = new org.joda.time.field.ZeroIsMaxDateTimeField(dateTimeField1, dateTimeFieldType15);
    org.joda.time.DateTimeZone dateTimeZone19 = null;
    org.joda.time.YearMonthDay yearMonthDay20 = new org.joda.time.YearMonthDay(dateTimeZone19);
    org.joda.time.YearMonthDay yearMonthDay22 = yearMonthDay20.plusDays((int)(short)100);
    org.joda.time.YearMonthDay yearMonthDay24 = yearMonthDay22.withMonthOfYear(10);
    org.joda.time.YearMonthDay.Property property25 = yearMonthDay22.monthOfYear();
    org.joda.time.YearMonthDay yearMonthDay27 = yearMonthDay22.minusMonths((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone29 = null;
    org.joda.time.chrono.CopticChronology copticChronology30 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone29);
    org.joda.time.DurationField durationField31 = copticChronology30.days();
    org.joda.time.DateTimeZone dateTimeZone33 = null;
    org.joda.time.LocalDateTime localDateTime34 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone33);
    org.joda.time.LocalDateTime.Property property35 = localDateTime34.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone37 = null;
    org.joda.time.LocalDateTime localDateTime38 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone37);
    boolean b39 = localDateTime34.isAfter((org.joda.time.ReadablePartial)localDateTime38);
    org.joda.time.DateTimeZone dateTimeZone41 = null;
    org.joda.time.LocalDateTime localDateTime42 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone41);
    org.joda.time.LocalDateTime localDateTime44 = localDateTime42.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property45 = localDateTime44.dayOfYear();
    org.joda.time.PeriodType periodType46 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period47 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime34, (org.joda.time.ReadablePartial)localDateTime44, periodType46);
    int[] i_array49 = copticChronology30.get((org.joda.time.ReadablePartial)localDateTime34, 1496646000000L);
    int[] i_array51 = zeroIsMaxDateTimeField18.addWrapField((org.joda.time.ReadablePartial)yearMonthDay22, 2, i_array49, 810);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime34 and yearMonthDay20
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime34 and yearMonthDay20", Math.signum(localDateTime34.compareTo(yearMonthDay20)) == -Math.signum(yearMonthDay20.compareTo(localDateTime34)));

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test066"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone9);
    int i12 = dateTimeZone9.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone9);
    org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property16 = dateTime13.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator18 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType8, dateTimeFieldType17);
    org.joda.time.Partial partial20 = new org.joda.time.Partial(dateTimeFieldType8, (int)(byte)1);
    int i22 = partial20.getValue((int)(short)0);
    java.lang.String str23 = partial20.toString();
    org.joda.time.DateTimeZone dateTimeZone25 = null;
    org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone25);
    org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
    boolean b30 = partial20.isMatch((org.joda.time.ReadablePartial)localDateTime28);
    
    // Checks the contract:  compareTo-substitutability on partial20, localDateTime26, and localDateTime26
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on partial20, localDateTime26, and localDateTime26", !(partial20.compareTo(localDateTime26) == 0) || (Math.signum(partial20.compareTo(localDateTime26)) == Math.signum(localDateTime26.compareTo(localDateTime26))));

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test067"); }

    org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
    org.joda.time.Minutes minutes1 = days0.toStandardMinutes();
    org.joda.time.Minutes minutes2 = org.joda.time.Minutes.ONE;
    org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
    org.joda.time.ReadableInstant readableInstant5 = null;
    org.joda.time.ReadableDuration readableDuration6 = null;
    org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
    org.joda.time.ReadableDuration readableDuration8 = null;
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    org.joda.time.PeriodType periodType11 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod((java.lang.Object)chronology9, periodType11, (org.joda.time.Chronology)gregorianChronology12);
    mutablePeriod7.setPeriod(readableDuration8, chronology9);
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
    org.joda.time.DurationField durationField18 = copticChronology17.days();
    org.joda.time.MutableDateTime mutableDateTime19 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology17);
    org.joda.time.DateTimeField dateTimeField20 = copticChronology17.millisOfSecond();
    mutablePeriod7.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology17);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = dateTimeFormatter4.withChronology((org.joda.time.Chronology)copticChronology17);
    org.joda.time.LocalTime localTime23 = new org.joda.time.LocalTime((long)(short)-1, (org.joda.time.Chronology)copticChronology17);
    org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object)minutes2, (org.joda.time.Chronology)copticChronology17);
    boolean b25 = minutes1.isLessThan(minutes2);
    
    // Checks the contract:  compareTo-substitutability on minutes1, days0, and days0
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes1, days0, and days0", !(minutes1.compareTo(days0) == 0) || (Math.signum(minutes1.compareTo(days0)) == Math.signum(days0.compareTo(days0))));

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test068"); }

    org.joda.time.Minutes minutes0 = org.joda.time.Minutes.THREE;
    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.DateMidnight dateMidnight2 = new org.joda.time.DateMidnight(dateTimeZone1);
    org.joda.time.ReadableDuration readableDuration3 = null;
    org.joda.time.MutableInterval mutableInterval4 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight2, readableDuration3);
    org.joda.time.Years years6 = org.joda.time.Years.years(0);
    org.joda.time.Years years8 = years6.minus((int)(byte)-1);
    mutableInterval4.setPeriodAfterStart((org.joda.time.ReadablePeriod)years8);
    org.joda.time.Years years11 = years8.dividedBy((int)(byte)100);
    org.joda.time.DurationFieldType durationFieldType12 = years11.getFieldType();
    boolean b13 = minutes0.isSupported(durationFieldType12);
    
    // Checks the contract:  compareTo-substitutability on minutes0, years8, and years8
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on minutes0, years8, and years8", !(minutes0.compareTo(years8) == 0) || (Math.signum(minutes0.compareTo(years8)) == Math.signum(years8.compareTo(years8))));

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test069"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.YearMonthDay yearMonthDay2 = new org.joda.time.YearMonthDay(dateTimeZone1);
    org.joda.time.YearMonthDay yearMonthDay4 = yearMonthDay2.plusDays((int)(short)100);
    int i5 = yearMonthDay4.getYear();
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period9 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology8);
    org.joda.time.DateTimeZone dateTimeZone10 = gregorianChronology8.getZone();
    org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime((long)1, dateTimeZone10);
    org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone10);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone13 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone10);
    int i15 = cachedDateTimeZone13.getOffset((long)(byte)100);
    org.joda.time.DateTimeZone dateTimeZone16 = cachedDateTimeZone13.getUncachedZone();
    org.joda.time.DateMidnight dateMidnight17 = yearMonthDay4.toDateMidnight((org.joda.time.DateTimeZone)cachedDateTimeZone13);
    org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long)365, (org.joda.time.DateTimeZone)cachedDateTimeZone13);
    
    // Checks the contract:  compareTo-substitutability on localDateTime18, yearMonthDay4, and yearMonthDay4
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDateTime18, yearMonthDay4, and yearMonthDay4", !(localDateTime18.compareTo(yearMonthDay4) == 0) || (Math.signum(localDateTime18.compareTo(yearMonthDay4)) == Math.signum(yearMonthDay4.compareTo(yearMonthDay4))));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test070"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter3 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology4 = null;
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
    int i8 = dateTimeFormatter3.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime5, "secondOfMinute", 100);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone9);
    long long11 = dateMidnight10.getMillis();
    org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.plusDays(24);
    mutablePeriod2.setPeriod((org.joda.time.ReadableInstant)mutableDateTime5, (org.joda.time.ReadableInstant)dateMidnight13);
    org.joda.time.Days days15 = org.joda.time.Days.SEVEN;
    mutablePeriod2.add((org.joda.time.ReadablePeriod)days15);
    org.joda.time.DurationFieldType durationFieldType17 = days15.getFieldType();
    org.joda.time.LocalDateTime localDateTime18 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime20 = localDateTime18.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property21 = localDateTime18.dayOfMonth();
    org.joda.time.Interval interval22 = property21.toInterval();
    org.joda.time.Minutes minutes23 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval22);
    org.joda.time.Days days24 = minutes23.toStandardDays();
    org.joda.time.Days days25 = days15.plus(days24);
    
    // Checks the contract:  compareTo-substitutability on days25, minutes23, and minutes23
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days25, minutes23, and minutes23", !(days25.compareTo(minutes23) == 0) || (Math.signum(days25.compareTo(minutes23)) == Math.signum(minutes23.compareTo(minutes23))));

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test071"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    long long2 = dateMidnight1.getMillis();
    org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.plusDays(24);
    org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long)10);
    org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withFields((org.joda.time.ReadablePartial)localDate6);
    org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
    int i11 = dateTimeZone8.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime12 = org.joda.time.DateTime.now(dateTimeZone8);
    org.joda.time.DateTime dateTime14 = dateTime12.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property15 = dateTime12.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType16 = property15.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
    int i20 = dateTimeZone17.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime21 = org.joda.time.DateTime.now(dateTimeZone17);
    org.joda.time.DateTime dateTime23 = dateTime21.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property24 = dateTime21.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType25 = property24.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator26 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType16, dateTimeFieldType25);
    org.joda.time.DateTimeZone dateTimeZone27 = null;
    org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(dateTimeZone27);
    org.joda.time.TimeOfDay timeOfDay30 = timeOfDay28.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property31 = timeOfDay28.secondOfMinute();
    org.joda.time.TimeOfDay.Property property32 = timeOfDay28.millisOfSecond();
    java.util.Locale locale33 = null;
    int i34 = property32.getMaximumTextLength(locale33);
    org.joda.time.DateTimeFieldType dateTimeFieldType35 = property32.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator36 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType25, dateTimeFieldType35);
    org.joda.time.DateMidnight.Property property37 = dateMidnight7.property(dateTimeFieldType25);
    
    // Checks the contract:  compareTo-anti-symmetric on timeOfDay28 and localDate6
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on timeOfDay28 and localDate6", Math.signum(timeOfDay28.compareTo(localDate6)) == -Math.signum(localDate6.compareTo(timeOfDay28)));

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test072"); }

    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object)chronology5, periodType7, (org.joda.time.Chronology)gregorianChronology8);
    mutablePeriod3.setPeriod(readableDuration4, chronology5);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
    org.joda.time.DurationField durationField14 = copticChronology13.days();
    org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology13);
    org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
    mutablePeriod3.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology13);
    org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology13);
    int i19 = localTime18.getMillisOfSecond();
    org.joda.time.LocalTime.Property property20 = localTime18.secondOfMinute();
    org.joda.time.DateTimeField dateTimeField21 = property20.getField();
    org.joda.time.LocalDateTime localDateTime22 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime24 = localDateTime22.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property25 = localDateTime22.dayOfMonth();
    org.joda.time.Interval interval26 = property25.toInterval();
    org.joda.time.LocalDateTime localDateTime27 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property30 = localDateTime27.dayOfMonth();
    org.joda.time.Interval interval31 = property30.toInterval();
    boolean b32 = interval31.containsNow();
    boolean b33 = interval26.abuts((org.joda.time.ReadableInterval)interval31);
    org.joda.time.Chronology chronology34 = interval31.getChronology();
    org.joda.time.DateTimeField dateTimeField35 = org.joda.time.field.LenientDateTimeField.getInstance(dateTimeField21, chronology34);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime29 and localTime18
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime29 and localTime18", Math.signum(localDateTime29.compareTo(localTime18)) == -Math.signum(localTime18.compareTo(localDateTime29)));

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test073"); }

    org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
    org.joda.time.LocalDate localDate3 = org.joda.time.LocalDate.now((org.joda.time.Chronology)iSOChronology2);
    org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay((long)(short)0, (org.joda.time.Chronology)iSOChronology2);
    
    // Checks the contract:  compareTo-substitutability on monthDay4, localDate3, and localDate3
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on monthDay4, localDate3, and localDate3", !(monthDay4.compareTo(localDate3) == 0) || (Math.signum(monthDay4.compareTo(localDate3)) == Math.signum(localDate3.compareTo(localDate3))));

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test074"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
    org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar2);
    org.joda.time.LocalDate localDate4 = org.joda.time.LocalDate.fromCalendarFields((java.util.Calendar)gregorianCalendar2);
    
    // Checks the contract:  compareTo-substitutability on localDate4, localTime3, and localTime3
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDate4, localTime3, and localTime3", !(localDate4.compareTo(localTime3) == 0) || (Math.signum(localDate4.compareTo(localTime3)) == Math.signum(localTime3.compareTo(localTime3))));

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test075"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Chronology chronology4 = null;
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
    org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
    mutableDateTime5.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone9);
    long long11 = dateMidnight10.getMillis();
    org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.plusDays(24);
    org.joda.time.Minutes minutes14 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime5, (org.joda.time.ReadableInstant)dateMidnight13);
    org.joda.time.Minutes minutes15 = org.joda.time.Minutes.THREE;
    org.joda.time.Minutes minutes16 = minutes14.plus(minutes15);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)minutes14);
    org.joda.time.MutableInterval mutableInterval18 = mutableInterval3.copy();
    org.joda.time.ReadableInterval readableInterval19 = null;
    org.joda.time.Hours hours20 = org.joda.time.Hours.hoursIn(readableInterval19);
    org.joda.time.Duration duration21 = hours20.toStandardDuration();
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)hours20);
    
    // Checks the contract:  compareTo-substitutability on hours20, minutes16, and minutes16
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours20, minutes16, and minutes16", !(hours20.compareTo(minutes16) == 0) || (Math.signum(hours20.compareTo(minutes16)) == Math.signum(minutes16.compareTo(minutes16))));

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test076"); }

    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.PeriodType periodType3 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object)chronology1, periodType3, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long)345, chronology1);
    org.joda.time.ReadableInstant readableInstant8 = null;
    org.joda.time.ReadableDuration readableDuration9 = null;
    org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod(readableInstant8, readableDuration9);
    org.joda.time.ReadableDuration readableDuration11 = null;
    org.joda.time.Chronology chronology12 = null;
    org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
    org.joda.time.PeriodType periodType14 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod16 = new org.joda.time.MutablePeriod((java.lang.Object)chronology12, periodType14, (org.joda.time.Chronology)gregorianChronology15);
    mutablePeriod10.setPeriod(readableDuration11, chronology12);
    org.joda.time.DateTimeZone dateTimeZone19 = null;
    org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
    org.joda.time.DurationField durationField21 = copticChronology20.days();
    org.joda.time.MutableDateTime mutableDateTime22 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology20);
    org.joda.time.DateTimeField dateTimeField23 = copticChronology20.millisOfSecond();
    mutablePeriod10.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology20);
    org.joda.time.LocalTime localTime25 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology20);
    int i26 = localTime25.getMillisOfSecond();
    org.joda.time.LocalTime.Property property27 = localTime25.secondOfMinute();
    org.joda.time.LocalTime localTime28 = property27.withMaximumValue();
    org.joda.time.Seconds seconds29 = org.joda.time.Seconds.TWO;
    org.joda.time.DurationFieldType durationFieldType30 = seconds29.getFieldType();
    org.joda.time.LocalTime localTime32 = localTime28.withFieldAdded(durationFieldType30, 365);
    boolean b33 = localDate6.isSupported(durationFieldType30);
    
    // Checks the contract:  compareTo-substitutability on localDate6, localTime28, and localTime28
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDate6, localTime28, and localTime28", !(localDate6.compareTo(localTime28) == 0) || (Math.signum(localDate6.compareTo(localTime28)) == Math.signum(localTime28.compareTo(localTime28))));

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test077"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    org.joda.time.Days days7 = days6.negated();
    
    // Checks the contract:  compareTo-substitutability on days7, minutes5, and minutes5
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days7, minutes5, and minutes5", !(days7.compareTo(minutes5) == 0) || (Math.signum(days7.compareTo(minutes5)) == Math.signum(minutes5.compareTo(minutes5))));

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test078"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfMonth();
    org.joda.time.Interval interval9 = property8.toInterval();
    boolean b10 = interval9.containsNow();
    boolean b11 = interval4.abuts((org.joda.time.ReadableInterval)interval9);
    org.joda.time.Seconds seconds12 = org.joda.time.Seconds.secondsIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period16 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology15);
    org.joda.time.DateTimeZone dateTimeZone17 = gregorianChronology15.getZone();
    org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime((long)1, dateTimeZone17);
    org.joda.time.DateMidnight dateMidnight19 = org.joda.time.DateMidnight.now(dateTimeZone17);
    org.joda.time.LocalDate localDate20 = org.joda.time.LocalDate.now(dateTimeZone17);
    org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
    int i24 = dateTimeZone21.getOffsetFromLocal((long)100);
    org.joda.time.Interval interval25 = localDate20.toInterval(dateTimeZone21);
    org.joda.time.Interval interval26 = interval4.gap((org.joda.time.ReadableInterval)interval25);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime5 and localDate20
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime5 and localDate20", Math.signum(localDateTime5.compareTo(localDate20)) == -Math.signum(localDate20.compareTo(localDateTime5)));

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test079"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
    org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance((org.joda.time.DateTimeZone)cachedDateTimeZone7);
    org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now((org.joda.time.DateTimeZone)cachedDateTimeZone7);
    org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay((org.joda.time.DateTimeZone)cachedDateTimeZone7);
    
    // Checks the contract:  compareTo-equals on dateTime9 and dateTime6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime6", (dateTime9.compareTo(dateTime6) == 0) == dateTime9.equals(dateTime6));

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test080"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
    org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance((org.joda.time.DateTimeZone)cachedDateTimeZone7);
    org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now((org.joda.time.DateTimeZone)cachedDateTimeZone7);
    org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.now((org.joda.time.DateTimeZone)cachedDateTimeZone7);
    
    // Checks the contract:  compareTo-equals on dateTime9 and dateTime6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateTime9 and dateTime6", (dateTime9.compareTo(dateTime6) == 0) == dateTime9.equals(dateTime6));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test081"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    org.joda.time.ReadableInstant readableInstant7 = null;
    org.joda.time.ReadableDuration readableDuration8 = null;
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter10 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology11 = null;
    org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
    int i15 = dateTimeFormatter10.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime12, "secondOfMinute", 100);
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.DateMidnight dateMidnight17 = new org.joda.time.DateMidnight(dateTimeZone16);
    long long18 = dateMidnight17.getMillis();
    org.joda.time.DateMidnight dateMidnight20 = dateMidnight17.plusDays(24);
    mutablePeriod9.setPeriod((org.joda.time.ReadableInstant)mutableDateTime12, (org.joda.time.ReadableInstant)dateMidnight20);
    org.joda.time.Days days22 = org.joda.time.Days.SEVEN;
    mutablePeriod9.add((org.joda.time.ReadablePeriod)days22);
    boolean b24 = days6.isLessThan(days22);
    
    // Checks the contract:  compareTo-substitutability on days6, minutes5, and minutes5
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days6, minutes5, and minutes5", !(days6.compareTo(minutes5) == 0) || (Math.signum(days6.compareTo(minutes5)) == Math.signum(minutes5.compareTo(minutes5))));

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test082"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
    java.util.Locale locale8 = null;
    org.joda.time.DateTime dateTime9 = property6.setCopy("26", locale8);
    org.joda.time.MonthDay monthDay10 = new org.joda.time.MonthDay((java.lang.Object)dateTime9);
    org.joda.time.ReadableInstant readableInstant11 = null;
    org.joda.time.ReadableDuration readableDuration12 = null;
    org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
    org.joda.time.chrono.GregorianChronology gregorianChronology15 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod13.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology15);
    mutablePeriod13.addMillis((int)(byte)1);
    int i19 = mutablePeriod13.getMonths();
    org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property23 = localDateTime20.dayOfMonth();
    org.joda.time.Interval interval24 = property23.toInterval();
    mutablePeriod13.setPeriod((org.joda.time.ReadableInterval)interval24);
    mutablePeriod13.setYears((-101));
    org.joda.time.MonthDay monthDay28 = monthDay10.minus((org.joda.time.ReadablePeriod)mutablePeriod13);
    
    // Checks the contract:  compareTo-substitutability on monthDay28, localDateTime20, and localDateTime22
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on monthDay28, localDateTime20, and localDateTime22", !(monthDay28.compareTo(localDateTime20) == 0) || (Math.signum(monthDay28.compareTo(localDateTime22)) == Math.signum(localDateTime20.compareTo(localDateTime22))));

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test083"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.DurationField durationField3 = copticChronology2.days();
    java.util.Locale locale4 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long)8, (org.joda.time.Chronology)copticChronology2, locale4);
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period11 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeZone dateTimeZone12 = gregorianChronology10.getZone();
    org.joda.time.YearMonthDay yearMonthDay13 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeField dateTimeField14 = gregorianChronology10.dayOfWeek();
    org.joda.time.field.SkipDateTimeField skipDateTimeField15 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)copticChronology2, dateTimeField14);
    org.joda.time.DurationField durationField16 = skipDateTimeField15.getLeapDurationField();
    org.joda.time.DurationField durationField17 = skipDateTimeField15.getDurationField();
    java.lang.String str19 = skipDateTimeField15.getAsShortText((long)26);
    
    // Checks the contract:  compareTo-equals on durationField3 and durationField17
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on durationField3 and durationField17", (durationField3.compareTo(durationField17) == 0) == durationField3.equals(durationField17));

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test084"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfMonth();
    org.joda.time.Interval interval9 = property8.toInterval();
    boolean b10 = interval9.containsNow();
    boolean b11 = interval4.abuts((org.joda.time.ReadableInterval)interval9);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone12);
    org.joda.time.ReadableDuration readableDuration14 = null;
    org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight13, readableDuration14);
    org.joda.time.Years years17 = org.joda.time.Years.years(0);
    org.joda.time.Years years19 = years17.minus((int)(byte)-1);
    mutableInterval15.setPeriodAfterStart((org.joda.time.ReadablePeriod)years19);
    boolean b21 = interval9.isAfter((org.joda.time.ReadableInterval)mutableInterval15);
    org.joda.time.MutableInterval mutableInterval22 = mutableInterval15.copy();
    boolean b24 = mutableInterval22.contains(1L);
    org.joda.time.Weeks weeks25 = org.joda.time.Weeks.weeksIn((org.joda.time.ReadableInterval)mutableInterval22);
    
    // Checks the contract:  compareTo-substitutability on weeks25, years19, and years19
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks25, years19, and years19", !(weeks25.compareTo(years19) == 0) || (Math.signum(weeks25.compareTo(years19)) == Math.signum(years19.compareTo(years19))));

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test085"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    java.lang.String str2 = copticChronology1.toString();
    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
    org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(dateTimeZone3);
    org.joda.time.Chronology chronology6 = copticChronology1.withZone(dateTimeZone3);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
    org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusDays((int)(byte)10);
    org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
    boolean b13 = dateTimeZone11.isStandardOffset((long)843);
    org.joda.time.Interval interval14 = yearMonthDay10.toInterval(dateTimeZone11);
    int[] i_array16 = copticChronology1.get((org.joda.time.ReadablePartial)yearMonthDay10, (long)(byte)-1);
    
    // Checks the contract:  compareTo-anti-symmetric on timeOfDay5 and yearMonthDay8
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on timeOfDay5 and yearMonthDay8", Math.signum(timeOfDay5.compareTo(yearMonthDay8)) == -Math.signum(yearMonthDay8.compareTo(timeOfDay5)));

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test086"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period5 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology4.getZone();
    org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.YearMonthDay yearMonthDay9 = yearMonthDay7.plusMonths(10);
    org.joda.time.ReadableInstant readableInstant11 = null;
    org.joda.time.ReadableDuration readableDuration12 = null;
    org.joda.time.MutablePeriod mutablePeriod13 = new org.joda.time.MutablePeriod(readableInstant11, readableDuration12);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology15 = null;
    org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
    int i19 = dateTimeFormatter14.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime16, "secondOfMinute", 100);
    org.joda.time.DateTimeZone dateTimeZone20 = null;
    org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone20);
    long long22 = dateMidnight21.getMillis();
    org.joda.time.DateMidnight dateMidnight24 = dateMidnight21.plusDays(24);
    mutablePeriod13.setPeriod((org.joda.time.ReadableInstant)mutableDateTime16, (org.joda.time.ReadableInstant)dateMidnight24);
    org.joda.time.DateTimeZone dateTimeZone27 = null;
    org.joda.time.chrono.CopticChronology copticChronology28 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone27);
    java.lang.String str29 = copticChronology28.toString();
    mutablePeriod13.setPeriod(0L, (org.joda.time.Chronology)copticChronology28);
    org.joda.time.DurationField durationField31 = copticChronology28.hours();
    java.lang.String str32 = copticChronology28.toString();
    org.joda.time.TimeOfDay timeOfDay33 = new org.joda.time.TimeOfDay(0L, (org.joda.time.Chronology)copticChronology28);
    org.joda.time.TimeOfDay timeOfDay35 = timeOfDay33.minusSeconds(17);
    org.joda.time.DateTimeZone dateTimeZone36 = null;
    org.joda.time.DateTime dateTime37 = yearMonthDay9.toDateTime(timeOfDay35, dateTimeZone36);
    
    // Checks the contract:  compareTo-anti-symmetric on timeOfDay33 and yearMonthDay7
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on timeOfDay33 and yearMonthDay7", Math.signum(timeOfDay33.compareTo(yearMonthDay7)) == -Math.signum(yearMonthDay7.compareTo(timeOfDay33)));

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test087"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Chronology chronology4 = null;
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
    org.joda.time.Instant instant6 = mutableDateTime5.toInstant();
    mutableDateTime5.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone9);
    long long11 = dateMidnight10.getMillis();
    org.joda.time.DateMidnight dateMidnight13 = dateMidnight10.plusDays(24);
    org.joda.time.Minutes minutes14 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime5, (org.joda.time.ReadableInstant)dateMidnight13);
    org.joda.time.Minutes minutes15 = org.joda.time.Minutes.THREE;
    org.joda.time.Minutes minutes16 = minutes14.plus(minutes15);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)minutes14);
    org.joda.time.DateTimeZone dateTimeZone18 = null;
    org.joda.time.DateMidnight dateMidnight19 = new org.joda.time.DateMidnight(dateTimeZone18);
    org.joda.time.ReadableDuration readableDuration20 = null;
    org.joda.time.MutableInterval mutableInterval21 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight19, readableDuration20);
    org.joda.time.Years years23 = org.joda.time.Years.years(0);
    org.joda.time.Years years25 = years23.minus((int)(byte)-1);
    mutableInterval21.setPeriodAfterStart((org.joda.time.ReadablePeriod)years25);
    org.joda.time.Years years28 = years25.dividedBy((int)(byte)100);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)years28);
    
    // Checks the contract:  compareTo-anti-symmetric on years25 and minutes15
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on years25 and minutes15", Math.signum(years25.compareTo(minutes15)) == -Math.signum(minutes15.compareTo(years25)));

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test088"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    java.lang.String str2 = copticChronology1.toString();
    org.joda.time.DateTimeField dateTimeField3 = copticChronology1.centuryOfEra();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
    java.lang.String str7 = copticChronology6.toString();
    org.joda.time.TimeOfDay timeOfDay8 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, (org.joda.time.Chronology)copticChronology6);
    org.joda.time.DateTimeZone dateTimeZone9 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology10 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone9);
    int i12 = dateTimeZone9.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone9);
    org.joda.time.DateTime dateTime15 = dateTime13.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property16 = dateTime13.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType17 = property16.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone18 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology19 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone18);
    int i21 = dateTimeZone18.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime22 = org.joda.time.DateTime.now(dateTimeZone18);
    org.joda.time.DateTime dateTime24 = dateTime22.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property25 = dateTime22.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType26 = property25.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator27 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType17, dateTimeFieldType26);
    int i28 = timeOfDay8.indexOf(dateTimeFieldType26);
    org.joda.time.field.OffsetDateTimeField offsetDateTimeField32 = new org.joda.time.field.OffsetDateTimeField(dateTimeField3, dateTimeFieldType26, 10, 1000, 628);
    java.lang.String str33 = offsetDateTimeField32.toString();
    org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField34 = new org.joda.time.field.DelegatedDateTimeField((org.joda.time.DateTimeField)offsetDateTimeField32);
    org.joda.time.DateTimeZone dateTimeZone36 = null;
    org.joda.time.LocalDateTime localDateTime37 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone36);
    org.joda.time.LocalDateTime localDateTime39 = localDateTime37.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property40 = localDateTime39.dayOfYear();
    boolean b41 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial)localDateTime39);
    org.joda.time.LocalDateTime localDateTime43 = localDateTime39.minusHours(843);
    org.joda.time.LocalDateTime.Property property44 = localDateTime43.hourOfDay();
    org.joda.time.Chronology chronology47 = null;
    java.util.Locale locale48 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket51 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology47, locale48, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket51.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone54 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket51.setZone(dateTimeZone54);
    org.joda.time.Chronology chronology56 = null;
    org.joda.time.MutableDateTime mutableDateTime57 = new org.joda.time.MutableDateTime(chronology56);
    org.joda.time.DateTimeZone dateTimeZone58 = null;
    org.joda.time.chrono.CopticChronology copticChronology59 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone58);
    java.lang.String str60 = copticChronology59.toString();
    org.joda.time.DateTimeZone dateTimeZone61 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology62 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone61);
    org.joda.time.TimeOfDay timeOfDay63 = new org.joda.time.TimeOfDay(dateTimeZone61);
    org.joda.time.Chronology chronology64 = copticChronology59.withZone(dateTimeZone61);
    org.joda.time.DateTime dateTime65 = mutableDateTime57.toDateTime(dateTimeZone61);
    org.joda.time.chrono.EthiopicChronology ethiopicChronology67 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone61, (int)(byte)1);
    boolean b68 = dateTimeParserBucket51.restoreState((java.lang.Object)ethiopicChronology67);
    java.util.Locale locale69 = dateTimeParserBucket51.getLocale();
    java.lang.String str70 = delegatedDateTimeField34.getAsText((org.joda.time.ReadablePartial)localDateTime43, 54, locale69);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime37 and timeOfDay63
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime37 and timeOfDay63", Math.signum(localDateTime37.compareTo(timeOfDay63)) == -Math.signum(timeOfDay63.compareTo(localDateTime37)));

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test089"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusDays((int)(short)100);
    org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period7 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology6);
    org.joda.time.DateTimeZone dateTimeZone8 = gregorianChronology6.getZone();
    org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((long)1, dateTimeZone8);
    org.joda.time.DateTime dateTime10 = org.joda.time.DateTime.now(dateTimeZone8);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone11 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone8);
    java.lang.String str13 = cachedDateTimeZone11.getNameKey((long)'a');
    org.joda.time.Interval interval14 = yearMonthDay1.toInterval((org.joda.time.DateTimeZone)cachedDateTimeZone11);
    org.joda.time.LocalDateTime localDateTime15 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime17 = localDateTime15.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property18 = localDateTime15.dayOfMonth();
    org.joda.time.Interval interval19 = property18.toInterval();
    org.joda.time.Minutes minutes20 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval19);
    boolean b21 = interval19.isAfterNow();
    org.joda.time.Interval interval22 = interval14.gap((org.joda.time.ReadableInterval)interval19);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime17 and yearMonthDay3
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime17 and yearMonthDay3", Math.signum(localDateTime17.compareTo(yearMonthDay3)) == -Math.signum(yearMonthDay3.compareTo(localDateTime17)));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test090"); }

    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.PeriodType periodType3 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object)chronology1, periodType3, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.LocalTime localTime6 = new org.joda.time.LocalTime((-1L), chronology1);
    org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period10 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology9);
    org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology9.getZone();
    org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long)1, dateTimeZone11);
    org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone11);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone14 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone11);
    org.joda.time.DateTimeZone dateTimeZone15 = cachedDateTimeZone14.getUncachedZone();
    org.joda.time.DateTime dateTime16 = localTime6.toDateTimeToday((org.joda.time.DateTimeZone)cachedDateTimeZone14);
    org.joda.time.LocalDate localDate17 = dateTime16.toLocalDate();
    
    // Checks the contract:  compareTo-substitutability on localDate17, localTime6, and localTime6
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDate17, localTime6, and localTime6", !(localDate17.compareTo(localTime6) == 0) || (Math.signum(localDate17.compareTo(localTime6)) == Math.signum(localTime6.compareTo(localTime6))));

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test091"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone5);
    boolean b7 = localDateTime2.isAfter((org.joda.time.ReadablePartial)localDateTime6);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.LocalDateTime localDateTime10 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone9);
    org.joda.time.LocalDateTime localDateTime12 = localDateTime10.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property13 = localDateTime12.dayOfYear();
    org.joda.time.PeriodType periodType14 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period15 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime2, (org.joda.time.ReadablePartial)localDateTime12, periodType14);
    org.joda.time.PeriodType periodType16 = periodType14.withSecondsRemoved();
    org.joda.time.DateTimeZone dateTimeZone17 = null;
    org.joda.time.YearMonthDay yearMonthDay18 = new org.joda.time.YearMonthDay(dateTimeZone17);
    org.joda.time.YearMonthDay.Property property19 = yearMonthDay18.year();
    org.joda.time.YearMonthDay yearMonthDay21 = property19.setCopy((int)(byte)-1);
    org.joda.time.YearMonthDay yearMonthDay22 = property19.getYearMonthDay();
    boolean b23 = periodType14.equals((java.lang.Object)yearMonthDay22);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime10 and yearMonthDay21
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime10 and yearMonthDay21", Math.signum(localDateTime10.compareTo(yearMonthDay21)) == -Math.signum(yearMonthDay21.compareTo(localDateTime10)));

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test092"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Years years5 = org.joda.time.Years.years(0);
    org.joda.time.Years years7 = years5.minus((int)(byte)-1);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)years7);
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    org.joda.time.Instant instant11 = mutableDateTime10.toInstant();
    mutableDateTime10.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone14 = null;
    org.joda.time.DateMidnight dateMidnight15 = new org.joda.time.DateMidnight(dateTimeZone14);
    long long16 = dateMidnight15.getMillis();
    org.joda.time.DateMidnight dateMidnight18 = dateMidnight15.plusDays(24);
    org.joda.time.Minutes minutes19 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime10, (org.joda.time.ReadableInstant)dateMidnight18);
    boolean b20 = mutableInterval3.isAfter((org.joda.time.ReadableInstant)dateMidnight18);
    
    // Checks the contract:  compareTo-anti-symmetric on years7 and minutes19
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on years7 and minutes19", Math.signum(years7.compareTo(minutes19)) == -Math.signum(minutes19.compareTo(years7)));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test093"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays((-1));
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.plusWeeks(999);
    org.joda.time.LocalDate localDate5 = localDateTime2.toLocalDate();
    
    // Checks the contract:  compareTo-substitutability on localDate5, localDateTime4, and localDateTime4
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localDate5, localDateTime4, and localDateTime4", !(localDate5.compareTo(localDateTime4) == 0) || (Math.signum(localDate5.compareTo(localDateTime4)) == Math.signum(localDateTime4.compareTo(localDateTime4))));

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test094"); }

    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.PeriodType periodType3 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod((java.lang.Object)chronology1, periodType3, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long)345, chronology1);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.YearMonthDay yearMonthDay8 = new org.joda.time.YearMonthDay(dateTimeZone7);
    org.joda.time.YearMonthDay yearMonthDay10 = yearMonthDay8.minusMonths(0);
    org.joda.time.Chronology chronology12 = null;
    java.util.Locale locale13 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket16 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology12, locale13, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket16.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone19 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket16.setZone(dateTimeZone19);
    org.joda.time.DateMidnight dateMidnight21 = yearMonthDay8.toDateMidnight(dateTimeZone19);
    org.joda.time.DateMidnight dateMidnight22 = localDate6.toDateMidnight(dateTimeZone19);
    org.joda.time.LocalDate.Property property23 = localDate6.weekyear();
    org.joda.time.DateTimeZone dateTimeZone25 = null;
    org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone25);
    org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
    org.joda.time.LocalDateTime.Property property30 = localDateTime28.yearOfEra();
    org.joda.time.LocalDateTime localDateTime32 = property30.addToCopy(42);
    org.joda.time.LocalDate localDate33 = localDate6.withFields((org.joda.time.ReadablePartial)localDateTime32);
    
    // Checks the contract:  compareTo-anti-symmetric on yearMonthDay10 and localDateTime28
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on yearMonthDay10 and localDateTime28", Math.signum(yearMonthDay10.compareTo(localDateTime28)) == -Math.signum(localDateTime28.compareTo(yearMonthDay10)));

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test095"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTimeField dateTimeField2 = iSOChronology1.minuteOfDay();
    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
    int i6 = dateTimeZone3.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone3);
    org.joda.time.DateTime dateTime9 = dateTime7.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property10 = dateTime7.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType11 = property10.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
    int i15 = dateTimeZone12.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone12);
    org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property19 = dateTime16.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator21 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType11, dateTimeFieldType20);
    org.joda.time.Partial partial23 = new org.joda.time.Partial(dateTimeFieldType11, (int)(byte)1);
    org.joda.time.field.OffsetDateTimeField offsetDateTimeField27 = new org.joda.time.field.OffsetDateTimeField(dateTimeField2, dateTimeFieldType11, 14, 628, 1034);
    java.util.Locale locale29 = null;
    java.lang.String str30 = offsetDateTimeField27.getAsText((long)235, locale29);
    int i31 = offsetDateTimeField27.getOffset();
    org.joda.time.chrono.GregorianChronology gregorianChronology35 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period36 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology35);
    org.joda.time.DateTimeZone dateTimeZone37 = gregorianChronology35.getZone();
    org.joda.time.MutableDateTime mutableDateTime38 = new org.joda.time.MutableDateTime((long)1, dateTimeZone37);
    org.joda.time.DateTime dateTime39 = org.joda.time.DateTime.now(dateTimeZone37);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone40 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone37);
    int i42 = cachedDateTimeZone40.getOffset((long)(byte)100);
    org.joda.time.DateTimeZone dateTimeZone43 = cachedDateTimeZone40.getUncachedZone();
    org.joda.time.Chronology chronology46 = null;
    java.util.Locale locale47 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket50 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology46, locale47, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket50.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone53 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket50.setZone(dateTimeZone53);
    org.joda.time.Chronology chronology55 = null;
    org.joda.time.MutableDateTime mutableDateTime56 = new org.joda.time.MutableDateTime(chronology55);
    org.joda.time.DateTimeZone dateTimeZone57 = null;
    org.joda.time.chrono.CopticChronology copticChronology58 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone57);
    java.lang.String str59 = copticChronology58.toString();
    org.joda.time.DateTimeZone dateTimeZone60 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology61 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone60);
    org.joda.time.TimeOfDay timeOfDay62 = new org.joda.time.TimeOfDay(dateTimeZone60);
    org.joda.time.Chronology chronology63 = copticChronology58.withZone(dateTimeZone60);
    org.joda.time.DateTime dateTime64 = mutableDateTime56.toDateTime(dateTimeZone60);
    org.joda.time.chrono.EthiopicChronology ethiopicChronology66 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone60, (int)(byte)1);
    boolean b67 = dateTimeParserBucket50.restoreState((java.lang.Object)ethiopicChronology66);
    java.util.Locale locale68 = dateTimeParserBucket50.getLocale();
    java.lang.String str69 = dateTimeZone43.getShortName(0L, locale68);
    java.lang.String str70 = offsetDateTimeField27.getAsText((long)1000, locale68);
    
    // Checks the contract:  compareTo-anti-symmetric on timeOfDay62 and partial23
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on timeOfDay62 and partial23", Math.signum(timeOfDay62.compareTo(partial23)) == -Math.signum(partial23.compareTo(timeOfDay62)));

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test096"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int)(short)0);
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
    org.joda.time.ReadableDuration readableDuration7 = null;
    org.joda.time.MutableInterval mutableInterval8 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight6, readableDuration7);
    org.joda.time.Years years10 = org.joda.time.Years.years(0);
    org.joda.time.Years years12 = years10.minus((int)(byte)-1);
    mutableInterval8.setPeriodAfterStart((org.joda.time.ReadablePeriod)years12);
    org.joda.time.LocalDateTime localDateTime15 = localDateTime4.withPeriodAdded((org.joda.time.ReadablePeriod)years12, (int)'a');
    org.joda.time.LocalDateTime localDateTime17 = localDateTime4.minusMonths(0);
    org.joda.time.LocalDateTime localDateTime19 = localDateTime17.plusDays((int)'#');
    java.util.Date date20 = localDateTime17.toDate();
    org.joda.time.TimeOfDay timeOfDay21 = org.joda.time.TimeOfDay.fromDateFields(date20);
    
    // Checks the contract:  compareTo-substitutability on timeOfDay21, localDateTime17, and localDateTime4
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on timeOfDay21, localDateTime17, and localDateTime4", !(timeOfDay21.compareTo(localDateTime17) == 0) || (Math.signum(timeOfDay21.compareTo(localDateTime4)) == Math.signum(localDateTime17.compareTo(localDateTime4))));

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test097"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Days days6 = minutes5.toStandardDays();
    org.joda.time.PeriodType periodType7 = days6.getPeriodType();
    
    // Checks the contract:  compareTo-substitutability on days6, minutes5, and minutes5
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days6, minutes5, and minutes5", !(days6.compareTo(minutes5) == 0) || (Math.signum(days6.compareTo(minutes5)) == Math.signum(minutes5.compareTo(minutes5))));

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test098"); }

    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object)chronology5, periodType7, (org.joda.time.Chronology)gregorianChronology8);
    mutablePeriod3.setPeriod(readableDuration4, chronology5);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
    org.joda.time.DurationField durationField14 = copticChronology13.days();
    org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology13);
    org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
    mutablePeriod3.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology13);
    org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology13);
    int i19 = localTime18.getMillisOfSecond();
    org.joda.time.LocalTime.Property property20 = localTime18.secondOfMinute();
    org.joda.time.DateTime dateTime21 = localTime18.toDateTimeToday();
    org.joda.time.DateTime dateTime22 = dateTime21.withTimeAtStartOfDay();
    org.joda.time.Chronology chronology23 = null;
    org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
    org.joda.time.Instant instant25 = mutableDateTime24.toInstant();
    org.joda.time.ReadableInstant readableInstant26 = null;
    boolean b27 = mutableDateTime24.isEqual(readableInstant26);
    org.joda.time.DateTime dateTime28 = mutableDateTime24.toDateTime();
    org.joda.time.DateTime.Property property29 = dateTime28.yearOfCentury();
    org.joda.time.DateTime dateTime31 = property29.addToCopy((long)365);
    org.joda.time.DateTime dateTime32 = property29.withMinimumValue();
    org.joda.time.DateTimeZone dateTimeZone33 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology34 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone33);
    int i36 = dateTimeZone33.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime37 = org.joda.time.DateTime.now(dateTimeZone33);
    org.joda.time.Duration duration40 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.Duration duration43 = duration40.withDurationAdded((long)28, (int)' ');
    org.joda.time.DateTimeZone dateTimeZone44 = null;
    org.joda.time.DateMidnight dateMidnight45 = new org.joda.time.DateMidnight(dateTimeZone44);
    org.joda.time.DateMidnight.Property property46 = dateMidnight45.centuryOfEra();
    org.joda.time.PeriodType periodType47 = null;
    org.joda.time.MutablePeriod mutablePeriod48 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration43, (org.joda.time.ReadableInstant)dateMidnight45, periodType47);
    org.joda.time.DateTime dateTime50 = dateTime37.withDurationAdded((org.joda.time.ReadableDuration)duration43, 5);
    org.joda.time.DateTimeZone dateTimeZone51 = null;
    org.joda.time.chrono.CopticChronology copticChronology52 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone51);
    org.joda.time.YearMonth yearMonth53 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology52);
    org.joda.time.YearMonth yearMonth55 = yearMonth53.minusYears((int)'a');
    org.joda.time.YearMonth yearMonth57 = yearMonth53.minusYears((-1));
    org.joda.time.DateTimeFieldType dateTimeFieldType59 = yearMonth53.getFieldType(0);
    int i60 = dateTime50.get(dateTimeFieldType59);
    org.joda.time.DateTime dateTime62 = dateTime32.withField(dateTimeFieldType59, (int)(short)10);
    org.joda.time.DateTime.Property property63 = dateTime22.property(dateTimeFieldType59);
    
    // Checks the contract:  compareTo-anti-symmetric on yearMonth53 and localTime18
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on yearMonth53 and localTime18", Math.signum(yearMonth53.compareTo(localTime18)) == -Math.signum(localTime18.compareTo(yearMonth53)));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test099"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Years years8 = org.joda.time.Years.years(0);
    org.joda.time.Years years10 = years8.minus((int)(byte)-1);
    org.joda.time.Period period11 = period4.minus((org.joda.time.ReadablePeriod)years8);
    org.joda.time.ReadableInstant readableInstant12 = null;
    org.joda.time.ReadableDuration readableDuration13 = null;
    org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
    org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod14.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology16);
    int i18 = mutablePeriod14.getWeeks();
    mutablePeriod14.setMonths(100);
    org.joda.time.Period period21 = mutablePeriod14.toPeriod();
    int i22 = period21.getYears();
    org.joda.time.DateTimeZone dateTimeZone23 = null;
    org.joda.time.TimeOfDay timeOfDay24 = new org.joda.time.TimeOfDay(dateTimeZone23);
    org.joda.time.Seconds seconds25 = org.joda.time.Seconds.TWO;
    org.joda.time.DurationFieldType durationFieldType26 = seconds25.getFieldType();
    org.joda.time.TimeOfDay timeOfDay28 = timeOfDay24.withFieldAdded(durationFieldType26, 1000);
    int i29 = period21.indexOf(durationFieldType26);
    int i30 = years8.get(durationFieldType26);
    
    // Checks the contract:  compareTo-anti-symmetric on seconds25 and years10
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on seconds25 and years10", Math.signum(seconds25.compareTo(years10)) == -Math.signum(years10.compareTo(seconds25)));

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test100"); }

    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object)chronology5, periodType7, (org.joda.time.Chronology)gregorianChronology8);
    mutablePeriod3.setPeriod(readableDuration4, chronology5);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
    org.joda.time.DurationField durationField14 = copticChronology13.days();
    org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology13);
    org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
    mutablePeriod3.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology13);
    org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology13);
    int i19 = localTime18.getMillisOfSecond();
    org.joda.time.LocalTime.Property property20 = localTime18.secondOfMinute();
    java.lang.String str21 = property20.getAsShortText();
    org.joda.time.DateTimeField dateTimeField22 = property20.getField();
    org.joda.time.LocalTime localTime23 = property20.roundFloorCopy();
    org.joda.time.LocalTime localTime24 = property20.roundHalfFloorCopy();
    
    // Checks the contract:  compareTo-equals on mutableDateTime6 and mutableDateTime15
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime15", (mutableDateTime6.compareTo(mutableDateTime15) == 0) == mutableDateTime6.equals(mutableDateTime15));

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test101"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.ReadableInstant readableInstant7 = null;
    org.joda.time.ReadableDuration readableDuration8 = null;
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
    org.joda.time.ReadableDuration readableDuration10 = null;
    org.joda.time.Chronology chronology11 = null;
    org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
    org.joda.time.PeriodType periodType13 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object)chronology11, periodType13, (org.joda.time.Chronology)gregorianChronology14);
    mutablePeriod9.setPeriod(readableDuration10, chronology11);
    org.joda.time.Period period17 = period4.plus((org.joda.time.ReadablePeriod)mutablePeriod9);
    org.joda.time.Period period19 = period4.withHours(32);
    org.joda.time.Seconds seconds20 = org.joda.time.Seconds.ONE;
    org.joda.time.Days days21 = seconds20.toStandardDays();
    org.joda.time.Period period22 = period4.minus((org.joda.time.ReadablePeriod)days21);
    
    // Checks the contract:  compareTo-substitutability on days21, seconds20, and seconds20
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days21, seconds20, and seconds20", !(days21.compareTo(seconds20) == 0) || (Math.signum(days21.compareTo(seconds20)) == Math.signum(seconds20.compareTo(seconds20))));

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test102"); }

    org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod3.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology5);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.DateMidnight dateMidnight8 = new org.joda.time.DateMidnight(dateTimeZone7);
    int i9 = dateMidnight8.getDayOfWeek();
    org.joda.time.Chronology chronology10 = null;
    org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
    java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime11.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology13 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology5, (org.joda.time.ReadableDateTime)dateMidnight8, (org.joda.time.ReadableDateTime)mutableDateTime11);
    org.joda.time.DateTime dateTime14 = limitChronology13.getUpperLimit();
    org.joda.time.DateTimeZone dateTimeZone17 = null;
    org.joda.time.LocalDateTime localDateTime18 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone17);
    org.joda.time.LocalDateTime.Property property19 = localDateTime18.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone21 = null;
    org.joda.time.LocalDateTime localDateTime22 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone21);
    boolean b23 = localDateTime18.isAfter((org.joda.time.ReadablePartial)localDateTime22);
    org.joda.time.DateTimeZone dateTimeZone25 = null;
    org.joda.time.LocalDateTime localDateTime26 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone25);
    org.joda.time.LocalDateTime localDateTime28 = localDateTime26.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property29 = localDateTime28.dayOfYear();
    org.joda.time.PeriodType periodType30 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime18, (org.joda.time.ReadablePartial)localDateTime28, periodType30);
    org.joda.time.PeriodType periodType32 = periodType30.withSecondsRemoved();
    org.joda.time.PeriodType periodType33 = org.joda.time.DateTimeUtils.getPeriodType(periodType32);
    org.joda.time.Chronology chronology34 = null;
    org.joda.time.MutableDateTime mutableDateTime35 = new org.joda.time.MutableDateTime(chronology34);
    org.joda.time.PeriodType periodType36 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod38 = new org.joda.time.MutablePeriod((java.lang.Object)chronology34, periodType36, (org.joda.time.Chronology)gregorianChronology37);
    org.joda.time.DateTimeField dateTimeField39 = gregorianChronology37.hourOfDay();
    org.joda.time.DurationField durationField40 = gregorianChronology37.minutes();
    org.joda.time.Period period41 = new org.joda.time.Period((long)37, periodType32, (org.joda.time.Chronology)gregorianChronology37);
    boolean b42 = limitChronology13.equals((java.lang.Object)gregorianChronology37);
    org.joda.time.MutableDateTime mutableDateTime43 = mutableDateTime0.toMutableDateTime((org.joda.time.Chronology)gregorianChronology37);
    org.joda.time.DateTimeField dateTimeField44 = gregorianChronology37.minuteOfHour();
    
    // Checks the contract:  compareTo-equals on mutableDateTime11 and mutableDateTime43
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime11 and mutableDateTime43", (mutableDateTime11.compareTo(mutableDateTime43) == 0) == mutableDateTime11.equals(mutableDateTime43));

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test103"); }

    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime((long)365);
    org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone2);
    int i5 = dateTimeZone2.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone2);
    org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks((int)'4');
    org.joda.time.ReadableDuration readableDuration9 = null;
    org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant)dateTime8, readableDuration9);
    org.joda.time.Interval interval11 = new org.joda.time.Interval((org.joda.time.ReadableInstant)mutableDateTime1, (org.joda.time.ReadablePeriod)mutablePeriod10);
    org.joda.time.ReadableInstant readableInstant13 = null;
    org.joda.time.ReadableDuration readableDuration14 = null;
    org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod(readableInstant13, readableDuration14);
    org.joda.time.ReadableDuration readableDuration16 = null;
    org.joda.time.Chronology chronology17 = null;
    org.joda.time.MutableDateTime mutableDateTime18 = new org.joda.time.MutableDateTime(chronology17);
    org.joda.time.PeriodType periodType19 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology20 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod21 = new org.joda.time.MutablePeriod((java.lang.Object)chronology17, periodType19, (org.joda.time.Chronology)gregorianChronology20);
    mutablePeriod15.setPeriod(readableDuration16, chronology17);
    org.joda.time.DateTimeZone dateTimeZone24 = null;
    org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
    org.joda.time.DurationField durationField26 = copticChronology25.days();
    org.joda.time.MutableDateTime mutableDateTime27 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology25);
    org.joda.time.DateTimeField dateTimeField28 = copticChronology25.millisOfSecond();
    mutablePeriod15.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology25);
    org.joda.time.LocalTime localTime30 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology25);
    int i31 = localTime30.getMillisOfSecond();
    org.joda.time.LocalTime.Property property32 = localTime30.secondOfMinute();
    org.joda.time.LocalTime localTime33 = property32.withMaximumValue();
    org.joda.time.Seconds seconds34 = org.joda.time.Seconds.TWO;
    org.joda.time.DurationFieldType durationFieldType35 = seconds34.getFieldType();
    org.joda.time.LocalTime localTime37 = localTime33.withFieldAdded(durationFieldType35, 365);
    mutablePeriod10.add(durationFieldType35, (int)'#');
    org.joda.time.IllegalFieldValueException illegalFieldValueException41 = new org.joda.time.IllegalFieldValueException(durationFieldType35, "2017-06-06T03:56:30.090");
    
    // Checks the contract:  compareTo-equals on mutableDateTime18 and mutableDateTime27
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime18 and mutableDateTime27", (mutableDateTime18.compareTo(mutableDateTime27) == 0) == mutableDateTime18.equals(mutableDateTime27));

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test104"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfMonth();
    org.joda.time.Interval interval9 = property8.toInterval();
    boolean b10 = interval9.containsNow();
    boolean b11 = interval4.abuts((org.joda.time.ReadableInterval)interval9);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone12);
    org.joda.time.ReadableDuration readableDuration14 = null;
    org.joda.time.MutableInterval mutableInterval15 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight13, readableDuration14);
    org.joda.time.Years years17 = org.joda.time.Years.years(0);
    org.joda.time.Years years19 = years17.minus((int)(byte)-1);
    mutableInterval15.setPeriodAfterStart((org.joda.time.ReadablePeriod)years19);
    boolean b21 = interval9.isAfter((org.joda.time.ReadableInterval)mutableInterval15);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter22 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
    org.joda.time.ReadableInstant readableInstant23 = null;
    org.joda.time.ReadableDuration readableDuration24 = null;
    org.joda.time.MutablePeriod mutablePeriod25 = new org.joda.time.MutablePeriod(readableInstant23, readableDuration24);
    org.joda.time.ReadableDuration readableDuration26 = null;
    org.joda.time.Chronology chronology27 = null;
    org.joda.time.MutableDateTime mutableDateTime28 = new org.joda.time.MutableDateTime(chronology27);
    org.joda.time.PeriodType periodType29 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology30 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object)chronology27, periodType29, (org.joda.time.Chronology)gregorianChronology30);
    mutablePeriod25.setPeriod(readableDuration26, chronology27);
    org.joda.time.DateTimeZone dateTimeZone34 = null;
    org.joda.time.chrono.CopticChronology copticChronology35 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone34);
    org.joda.time.DurationField durationField36 = copticChronology35.days();
    org.joda.time.MutableDateTime mutableDateTime37 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology35);
    org.joda.time.DateTimeField dateTimeField38 = copticChronology35.millisOfSecond();
    mutablePeriod25.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology35);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter40 = dateTimeFormatter22.withChronology((org.joda.time.Chronology)copticChronology35);
    org.joda.time.DateTimeField dateTimeField41 = copticChronology35.centuryOfEra();
    org.joda.time.DurationField durationField42 = copticChronology35.seconds();
    mutableInterval15.setChronology((org.joda.time.Chronology)copticChronology35);
    
    // Checks the contract:  compareTo-equals on mutableDateTime37 and mutableDateTime28
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime37 and mutableDateTime28", (mutableDateTime37.compareTo(mutableDateTime28) == 0) == mutableDateTime37.equals(mutableDateTime28));

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test105"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    org.joda.time.DateTime dateTime9 = property7.addToCopy(0);
    org.joda.time.Chronology chronology10 = null;
    org.joda.time.MutableDateTime mutableDateTime11 = new org.joda.time.MutableDateTime(chronology10);
    java.util.GregorianCalendar gregorianCalendar12 = mutableDateTime11.toGregorianCalendar();
    mutableDateTime11.addMinutes((int)(byte)1);
    org.joda.time.Weeks weeks15 = org.joda.time.Weeks.weeksBetween((org.joda.time.ReadableInstant)dateTime9, (org.joda.time.ReadableInstant)mutableDateTime11);
    int i16 = weeks15.getWeeks();
    org.joda.time.Hours hours17 = weeks15.toStandardHours();
    org.joda.time.Weeks weeks18 = org.joda.time.Weeks.ONE;
    boolean b19 = weeks15.isLessThan(weeks18);
    
    // Checks the contract:  compareTo-substitutability on weeks15, hours17, and hours17
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on weeks15, hours17, and hours17", !(weeks15.compareTo(hours17) == 0) || (Math.signum(weeks15.compareTo(hours17)) == Math.signum(hours17.compareTo(hours17))));

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test106"); }

    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object)chronology5, periodType7, (org.joda.time.Chronology)gregorianChronology8);
    mutablePeriod3.setPeriod(readableDuration4, chronology5);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
    org.joda.time.DurationField durationField14 = copticChronology13.days();
    org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology13);
    org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
    mutablePeriod3.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology13);
    org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology13);
    int i19 = localTime18.getMillisOfSecond();
    org.joda.time.LocalTime.Property property20 = localTime18.secondOfMinute();
    java.lang.String str21 = property20.getAsShortText();
    org.joda.time.DateTimeField dateTimeField22 = property20.getField();
    org.joda.time.DateTimeField dateTimeField23 = org.joda.time.field.StrictDateTimeField.getInstance(dateTimeField22);
    
    // Checks the contract:  compareTo-equals on mutableDateTime15 and mutableDateTime6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime6", (mutableDateTime15.compareTo(mutableDateTime6) == 0) == mutableDateTime15.equals(mutableDateTime6));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test107"); }

    org.joda.time.Days days0 = org.joda.time.Days.THREE;
    org.joda.time.Duration duration3 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.Days days4 = duration3.toStandardDays();
    org.joda.time.Days days5 = days0.minus(days4);
    org.joda.time.Hours hours6 = days4.toStandardHours();
    
    // Checks the contract:  compareTo-substitutability on hours6, days0, and days5
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on hours6, days0, and days5", !(hours6.compareTo(days0) == 0) || (Math.signum(hours6.compareTo(days5)) == Math.signum(days0.compareTo(days5))));

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test108"); }

    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object)chronology5, periodType7, (org.joda.time.Chronology)gregorianChronology8);
    mutablePeriod3.setPeriod(readableDuration4, chronology5);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
    org.joda.time.DurationField durationField14 = copticChronology13.days();
    org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology13);
    org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
    mutablePeriod3.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology13);
    org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology13);
    int i19 = localTime18.getMillisOfSecond();
    org.joda.time.LocalTime.Property property20 = localTime18.secondOfMinute();
    org.joda.time.DateTimeField dateTimeField21 = property20.getField();
    org.joda.time.LocalTime localTime22 = property20.withMinimumValue();
    org.joda.time.LocalTime localTime23 = property20.getLocalTime();
    
    // Checks the contract:  compareTo-equals on mutableDateTime15 and mutableDateTime6
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime15 and mutableDateTime6", (mutableDateTime15.compareTo(mutableDateTime6) == 0) == mutableDateTime15.equals(mutableDateTime6));

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test109"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.Duration duration4 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.minus((org.joda.time.ReadableDuration)duration4);
    org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long)1);
    org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateMidnight5, (org.joda.time.ReadableDuration)duration7);
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
    java.lang.String str13 = copticChronology12.toString();
    org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
    org.joda.time.TimeOfDay timeOfDay16 = new org.joda.time.TimeOfDay(dateTimeZone14);
    org.joda.time.Chronology chronology17 = copticChronology12.withZone(dateTimeZone14);
    org.joda.time.DateTime dateTime18 = mutableDateTime10.toDateTime(dateTimeZone14);
    org.joda.time.chrono.EthiopicChronology ethiopicChronology20 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone14, (int)(byte)1);
    org.joda.time.DateTime dateTime21 = dateMidnight5.toDateTime((org.joda.time.Chronology)ethiopicChronology20);
    org.joda.time.Chronology chronology22 = null;
    org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
    org.joda.time.DateTimeZone dateTimeZone24 = null;
    org.joda.time.chrono.CopticChronology copticChronology25 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone24);
    java.lang.String str26 = copticChronology25.toString();
    org.joda.time.DateTimeZone dateTimeZone27 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology28 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone27);
    org.joda.time.TimeOfDay timeOfDay29 = new org.joda.time.TimeOfDay(dateTimeZone27);
    org.joda.time.Chronology chronology30 = copticChronology25.withZone(dateTimeZone27);
    org.joda.time.DateTime dateTime31 = mutableDateTime23.toDateTime(dateTimeZone27);
    org.joda.time.chrono.EthiopicChronology ethiopicChronology33 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone27, (int)(byte)1);
    org.joda.time.Chronology chronology34 = ethiopicChronology20.withZone(dateTimeZone27);
    
    // Checks the contract:  compareTo-equals on dateMidnight5 and dateTime21
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on dateMidnight5 and dateTime21", (dateMidnight5.compareTo(dateTime21) == 0) == dateMidnight5.equals(dateTime21));

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test110"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
    org.joda.time.MonthDay monthDay3 = org.joda.time.MonthDay.fromCalendarFields((java.util.Calendar)gregorianCalendar2);
    org.joda.time.LocalTime localTime4 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar2);
    
    // Checks the contract:  compareTo-substitutability on localTime4, monthDay3, and monthDay3
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on localTime4, monthDay3, and monthDay3", !(localTime4.compareTo(monthDay3) == 0) || (Math.signum(localTime4.compareTo(monthDay3)) == Math.signum(monthDay3.compareTo(monthDay3))));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test111"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.ReadableInstant readableInstant7 = null;
    org.joda.time.ReadableDuration readableDuration8 = null;
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
    org.joda.time.ReadableDuration readableDuration10 = null;
    org.joda.time.Chronology chronology11 = null;
    org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime(chronology11);
    org.joda.time.PeriodType periodType13 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((java.lang.Object)chronology11, periodType13, (org.joda.time.Chronology)gregorianChronology14);
    mutablePeriod9.setPeriod(readableDuration10, chronology11);
    org.joda.time.Period period17 = period4.plus((org.joda.time.ReadablePeriod)mutablePeriod9);
    org.joda.time.MutableDateTime mutableDateTime19 = new org.joda.time.MutableDateTime((long)365);
    org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
    int i23 = dateTimeZone20.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone20);
    org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks((int)'4');
    org.joda.time.ReadableDuration readableDuration27 = null;
    org.joda.time.MutablePeriod mutablePeriod28 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant)dateTime26, readableDuration27);
    org.joda.time.Interval interval29 = new org.joda.time.Interval((org.joda.time.ReadableInstant)mutableDateTime19, (org.joda.time.ReadablePeriod)mutablePeriod28);
    org.joda.time.ReadableInstant readableInstant31 = null;
    org.joda.time.ReadableDuration readableDuration32 = null;
    org.joda.time.MutablePeriod mutablePeriod33 = new org.joda.time.MutablePeriod(readableInstant31, readableDuration32);
    org.joda.time.ReadableDuration readableDuration34 = null;
    org.joda.time.Chronology chronology35 = null;
    org.joda.time.MutableDateTime mutableDateTime36 = new org.joda.time.MutableDateTime(chronology35);
    org.joda.time.PeriodType periodType37 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology38 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod39 = new org.joda.time.MutablePeriod((java.lang.Object)chronology35, periodType37, (org.joda.time.Chronology)gregorianChronology38);
    mutablePeriod33.setPeriod(readableDuration34, chronology35);
    org.joda.time.DateTimeZone dateTimeZone42 = null;
    org.joda.time.chrono.CopticChronology copticChronology43 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone42);
    org.joda.time.DurationField durationField44 = copticChronology43.days();
    org.joda.time.MutableDateTime mutableDateTime45 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology43);
    org.joda.time.DateTimeField dateTimeField46 = copticChronology43.millisOfSecond();
    mutablePeriod33.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology43);
    org.joda.time.LocalTime localTime48 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology43);
    int i49 = localTime48.getMillisOfSecond();
    org.joda.time.LocalTime.Property property50 = localTime48.secondOfMinute();
    org.joda.time.LocalTime localTime51 = property50.withMaximumValue();
    org.joda.time.Seconds seconds52 = org.joda.time.Seconds.TWO;
    org.joda.time.DurationFieldType durationFieldType53 = seconds52.getFieldType();
    org.joda.time.LocalTime localTime55 = localTime51.withFieldAdded(durationFieldType53, 365);
    mutablePeriod28.add(durationFieldType53, (int)'#');
    mutablePeriod9.add(durationFieldType53, (int)(short)-1);
    org.joda.time.field.PreciseDurationField preciseDurationField61 = new org.joda.time.field.PreciseDurationField(durationFieldType53, 1498780800000L);
    
    // Checks the contract:  compareTo-equals on mutableDateTime36 and mutableDateTime45
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime36 and mutableDateTime45", (mutableDateTime36.compareTo(mutableDateTime45) == 0) == mutableDateTime36.equals(mutableDateTime45));

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test112"); }

    org.joda.time.ReadableInstant readableInstant1 = null;
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutablePeriod mutablePeriod3 = new org.joda.time.MutablePeriod(readableInstant1, readableDuration2);
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod((java.lang.Object)chronology5, periodType7, (org.joda.time.Chronology)gregorianChronology8);
    mutablePeriod3.setPeriod(readableDuration4, chronology5);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.chrono.CopticChronology copticChronology13 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone12);
    org.joda.time.DurationField durationField14 = copticChronology13.days();
    org.joda.time.MutableDateTime mutableDateTime15 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology13);
    org.joda.time.DateTimeField dateTimeField16 = copticChronology13.millisOfSecond();
    mutablePeriod3.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology13);
    org.joda.time.LocalTime localTime18 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology13);
    int i19 = localTime18.getMillisOfSecond();
    org.joda.time.LocalTime.Property property20 = localTime18.secondOfMinute();
    org.joda.time.LocalTime localTime21 = property20.withMinimumValue();
    org.joda.time.LocalTime localTime23 = localTime21.plusMillis(345);
    
    // Checks the contract:  compareTo-equals on mutableDateTime6 and mutableDateTime15
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime6 and mutableDateTime15", (mutableDateTime6.compareTo(mutableDateTime15) == 0) == mutableDateTime6.equals(mutableDateTime15));

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test113"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Period period8 = period6.minusHours(10);
    org.joda.time.Period period9 = period8.toPeriod();
    org.joda.time.Period period11 = period9.minusMonths((int)(short)100);
    org.joda.time.Minutes minutes12 = period9.toStandardMinutes();
    org.joda.time.Minutes minutes14 = minutes12.minus((int)(short)1);
    org.joda.time.Days days15 = minutes14.toStandardDays();
    
    // Checks the contract:  compareTo-substitutability on days15, minutes12, and minutes12
    org.junit.Assert.assertTrue("Contract failed: compareTo-substitutability on days15, minutes12, and minutes12", !(days15.compareTo(minutes12) == 0) || (Math.signum(days15.compareTo(minutes12)) == Math.signum(minutes12.compareTo(minutes12))));

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test114"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
    org.joda.time.Chronology chronology7 = null;
    org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
    org.joda.time.PeriodType periodType9 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object)chronology7, periodType9, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.LocalDate localDate12 = new org.joda.time.LocalDate((long)345, chronology7);
    org.joda.time.DateTimeZone dateTimeZone13 = null;
    org.joda.time.YearMonthDay yearMonthDay14 = new org.joda.time.YearMonthDay(dateTimeZone13);
    org.joda.time.YearMonthDay yearMonthDay16 = yearMonthDay14.minusMonths(0);
    org.joda.time.Chronology chronology18 = null;
    java.util.Locale locale19 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket22 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology18, locale19, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket22.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone25 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket22.setZone(dateTimeZone25);
    org.joda.time.DateMidnight dateMidnight27 = yearMonthDay14.toDateMidnight(dateTimeZone25);
    org.joda.time.DateMidnight dateMidnight28 = localDate12.toDateMidnight(dateTimeZone25);
    org.joda.time.Weeks weeks29 = org.joda.time.Weeks.MIN_VALUE;
    org.joda.time.Weeks weeks31 = weeks29.minus((-1));
    org.joda.time.Weeks weeks33 = weeks29.plus(5);
    org.joda.time.DurationFieldType durationFieldType34 = weeks29.getFieldType();
    org.joda.time.DateMidnight dateMidnight36 = dateMidnight28.withFieldAdded(durationFieldType34, 14);
    boolean b37 = localDateTime4.isSupported(durationFieldType34);
    
    // Checks the contract:  compareTo-anti-symmetric on localDateTime2 and yearMonthDay16
    org.junit.Assert.assertTrue("Contract failed: compareTo-anti-symmetric on localDateTime2 and yearMonthDay16", Math.signum(localDateTime2.compareTo(yearMonthDay16)) == -Math.signum(yearMonthDay16.compareTo(localDateTime2)));

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","ErrorTest0.test115"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setMonths(100);
    mutablePeriod2.setDays((int)'#');
    int i11 = mutablePeriod2.getWeeks();
    java.lang.Object obj12 = mutablePeriod2.clone();
    org.joda.time.format.DateTimeFormatter dateTimeFormatter14 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
    org.joda.time.ReadableInstant readableInstant15 = null;
    org.joda.time.ReadableDuration readableDuration16 = null;
    org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod(readableInstant15, readableDuration16);
    org.joda.time.ReadableDuration readableDuration18 = null;
    org.joda.time.Chronology chronology19 = null;
    org.joda.time.MutableDateTime mutableDateTime20 = new org.joda.time.MutableDateTime(chronology19);
    org.joda.time.PeriodType periodType21 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod23 = new org.joda.time.MutablePeriod((java.lang.Object)chronology19, periodType21, (org.joda.time.Chronology)gregorianChronology22);
    mutablePeriod17.setPeriod(readableDuration18, chronology19);
    org.joda.time.DateTimeZone dateTimeZone26 = null;
    org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
    org.joda.time.DurationField durationField28 = copticChronology27.days();
    org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology27);
    org.joda.time.DateTimeField dateTimeField30 = copticChronology27.millisOfSecond();
    mutablePeriod17.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology27);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter32 = dateTimeFormatter14.withChronology((org.joda.time.Chronology)copticChronology27);
    org.joda.time.DateTimeField dateTimeField33 = copticChronology27.centuryOfEra();
    org.joda.time.DateTimeField dateTimeField34 = copticChronology27.monthOfYear();
    mutablePeriod2.add((long)535, (org.joda.time.Chronology)copticChronology27);
    org.joda.time.chrono.GregorianChronology gregorianChronology37 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period38 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology37);
    org.joda.time.Weeks weeks39 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod)period38);
    org.joda.time.Weeks weeks40 = org.joda.time.Weeks.MIN_VALUE;
    org.joda.time.Weeks weeks42 = weeks40.minus((-1));
    int i43 = weeks42.getWeeks();
    org.joda.time.Weeks weeks44 = weeks39.plus(weeks42);
    mutablePeriod2.setPeriod((org.joda.time.ReadablePeriod)weeks44);
    
    // Checks the contract:  compareTo-equals on mutableDateTime20 and mutableDateTime29
    org.junit.Assert.assertTrue("Contract failed: compareTo-equals on mutableDateTime20 and mutableDateTime29", (mutableDateTime20.compareTo(mutableDateTime29) == 0) == mutableDateTime20.equals(mutableDateTime29));

  }

}
