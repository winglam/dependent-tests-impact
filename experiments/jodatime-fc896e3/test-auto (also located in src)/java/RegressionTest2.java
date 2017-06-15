
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest2 {

  public static boolean debug = false;

  @Test
  public void test01() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test01"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.ReadableInstant readableInstant5 = null;
    org.joda.time.ReadableDuration readableDuration6 = null;
    org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
    org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod7.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology9);
    int i11 = mutablePeriod7.getWeeks();
    boolean b12 = org.joda.time.field.FieldUtils.equals((java.lang.Object)mutableDateTime1, (java.lang.Object)i11);
    org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period15 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology14);
    org.joda.time.DateTimeZone dateTimeZone16 = gregorianChronology14.getZone();
    org.joda.time.MutableDateTime mutableDateTime17 = mutableDateTime1.toMutableDateTime(dateTimeZone16);
    org.joda.time.chrono.BuddhistChronology buddhistChronology18 = org.joda.time.chrono.BuddhistChronology.getInstance(dateTimeZone16);
    org.joda.time.Chronology chronology19 = buddhistChronology18.withUTC();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(buddhistChronology18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology19);

  }

  @Test
  public void test02() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test02"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
    org.joda.time.ReadableInstant readableInstant2 = null;
    org.joda.time.ReadableDuration readableDuration3 = null;
    org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant2, readableDuration3);
    org.joda.time.ReadableDuration readableDuration5 = null;
    org.joda.time.Chronology chronology6 = null;
    org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime(chronology6);
    org.joda.time.PeriodType periodType8 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((java.lang.Object)chronology6, periodType8, (org.joda.time.Chronology)gregorianChronology9);
    mutablePeriod4.setPeriod(readableDuration5, chronology6);
    org.joda.time.DateTimeZone dateTimeZone13 = null;
    org.joda.time.chrono.CopticChronology copticChronology14 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone13);
    org.joda.time.DurationField durationField15 = copticChronology14.days();
    org.joda.time.MutableDateTime mutableDateTime16 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology14);
    org.joda.time.DateTimeField dateTimeField17 = copticChronology14.millisOfSecond();
    mutablePeriod4.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology14);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = dateTimeFormatter1.withChronology((org.joda.time.Chronology)copticChronology14);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonth yearMonth20 = org.joda.time.YearMonth.parse("26", dateTimeFormatter19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter19);

  }

  @Test
  public void test03() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test03"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime2 = new org.joda.time.LocalTime(1900, 100);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test04() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test04"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusDays((int)(byte)10);
    int i4 = yearMonthDay1.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1970);

  }

  @Test
  public void test05() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test05"); }

    org.joda.time.PeriodType periodType8 = null;
    org.joda.time.Period period9 = new org.joda.time.Period(12, 429, 157, 1900, 843, 843, 24, (-101), periodType8);

  }

  @Test
  public void test06() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test06"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    java.lang.Object obj2 = mutableDateTime1.clone();
    org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.millisOfSecond();
    org.joda.time.MutableDateTime mutableDateTime5 = property3.addWrapField((int)(short)100);
    java.lang.String str6 = property3.getAsShortText();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "107"+ "'", str6.equals("107"));

  }

  @Test
  public void test07() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test07"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.now(dateTimeZone4);
    org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone4);
    org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
    int i11 = dateTimeZone8.getOffsetFromLocal((long)100);
    org.joda.time.Interval interval12 = localDate7.toInterval(dateTimeZone8);
    long long16 = dateTimeZone8.convertLocalToUTC((long)535, true, (-72835200000L));
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.EthiopicChronology ethiopicChronology18 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone8, 86);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long16 == 535L);

  }

  @Test
  public void test08() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test08"); }

    org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException("", (java.lang.Number)47, (java.lang.Number)(byte)-1, (java.lang.Number)10080);
    illegalFieldValueException4.prependMessage("2017-09-14T00:00:00.000/2017-09-15T00:00:00.000");

  }

  @Test
  public void test09() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test09"); }

    org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
    org.joda.time.MutableDateTime.Property property1 = mutableDateTime0.year();
    mutableDateTime0.addYears(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property1);

  }

  @Test
  public void test10() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test10"); }

    org.joda.time.Duration duration2 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
    int i6 = dateTimeZone3.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone3);
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration2, (org.joda.time.ReadableInstant)dateTime7);
    org.joda.time.Duration duration11 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
    int i15 = dateTimeZone12.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone12);
    org.joda.time.MutablePeriod mutablePeriod17 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration11, (org.joda.time.ReadableInstant)dateTime16);
    long long18 = duration11.getStandardHours();
    org.joda.time.DateTime dateTime19 = dateTime7.minus((org.joda.time.ReadableDuration)duration11);
    org.joda.time.DateTimeZone dateTimeZone20 = null;
    org.joda.time.DateMidnight dateMidnight21 = new org.joda.time.DateMidnight(dateTimeZone20);
    org.joda.time.DateMidnight.Property property22 = dateMidnight21.centuryOfEra();
    org.joda.time.DateMidnight dateMidnight24 = property22.addWrapFieldToCopy((int)(short)100);
    org.joda.time.Interval interval25 = property22.toInterval();
    org.joda.time.DateMidnight dateMidnight26 = property22.withMinimumValue();
    org.joda.time.PeriodType periodType27 = org.joda.time.PeriodType.yearMonthDayTime();
    org.joda.time.Period period28 = duration11.toPeriodFrom((org.joda.time.ReadableInstant)dateMidnight26, periodType27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long18 == 0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period28);

  }

  @Test
  public void test11() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test11"); }

    org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder0 = new org.joda.time.format.PeriodFormatterBuilder();
    org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder1 = periodFormatterBuilder0.appendMinutes();
    org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder3 = periodFormatterBuilder0.appendLiteral("CopticChronology[America/Los_Angeles]");
    org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder4 = periodFormatterBuilder0.appendSeconds();
    org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder5 = periodFormatterBuilder0.appendMonths();
    org.joda.time.format.PeriodFormatterBuilder periodFormatterBuilder7 = periodFormatterBuilder5.maximumParsedDigits(24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatterBuilder1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatterBuilder3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatterBuilder4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatterBuilder5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatterBuilder7);

  }

  @Test
  public void test12() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test12"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int i3 = timeOfDay1.getMillisOfSecond();
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array4 = timeOfDay1.getFieldTypes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array4);

  }

  @Test
  public void test13() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test13"); }

    org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long)(short)10);
    org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
    org.joda.time.LocalDateTime.Property property3 = localDateTime1.secondOfMinute();
    boolean b4 = property3.isLeap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);

  }

  @Test
  public void test14() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test14"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Period period8 = period6.minusHours(10);
    org.joda.time.Period period9 = period8.toPeriod();
    org.joda.time.Period period11 = period9.minusMonths((int)(short)100);
    org.joda.time.Minutes minutes12 = period9.toStandardMinutes();
    int i13 = period9.getWeeks();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);

  }

  @Test
  public void test15() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test15"); }

    java.lang.Object obj0 = null;
    org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(obj0);
    java.lang.String str3 = monthDay1.toString("14238");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "14238"+ "'", str3.equals("14238"));

  }

  @Test
  public void test16() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest2.test16"); }

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
    org.joda.time.Interval interval13 = interval4.withEndMillis((long)628);
    org.joda.time.ReadableInterval readableInterval14 = null;
    boolean b15 = interval4.abuts(readableInterval14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b15 == false);

  }

}
