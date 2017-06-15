
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class RegressionTest0 {

  public static boolean debug = false;

  @Test
  public void test001() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test001"); }

    org.joda.time.DateTimeField dateTimeField0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.DelegatedDateTimeField delegatedDateTimeField1 = new org.joda.time.field.DelegatedDateTimeField(dateTimeField0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test002() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test002"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test003() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test003"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight dateMidnight1 = org.joda.time.DateMidnight.now(dateTimeZone0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test004() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test004"); }

    org.joda.time.format.PeriodFormatter periodFormatter1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("hi!", periodFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test005() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test005"); }

    org.joda.time.DateTimeUtils.MillisProvider millisProvider0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeUtils.setCurrentMillisProvider(millisProvider0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test006() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test006"); }

    org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array1 = new org.joda.time.DateTimeFieldType[] { dateTimeFieldType0 };
    int[] i_array2 = new int[] {  };
    org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Partial partial4 = new org.joda.time.Partial(dateTimeFieldType_array1, i_array2, (org.joda.time.Chronology)gregorianChronology3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology3);

  }

  @Test
  public void test007() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test007"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime1 = org.joda.time.MutableDateTime.parse("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test008() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test008"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime1.setDateTime((int)(short)-1, (int)(byte)10, 0, (int)'4', (int)(byte)-1, 10, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test009() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test009"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i3 = timeOfDay1.get(dateTimeFieldType2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test010() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test010"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.hourOfHalfday();
    org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.OffsetDateTimeField offsetDateTimeField4 = new org.joda.time.field.OffsetDateTimeField(dateTimeField1, dateTimeFieldType2, (int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField1);

  }

  @Test
  public void test011() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test011"); }

    java.util.Locale locale0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.format.PeriodFormatter periodFormatter1 = org.joda.time.format.PeriodFormat.wordBased(locale0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test012() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test012"); }

    int i0 = org.joda.time.DateTimeConstants.MINUTES_PER_WEEK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10080);

  }

  @Test
  public void test013() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test013"); }

    org.joda.time.Months months0 = org.joda.time.Months.FIVE;
    int i1 = months0.getMonths();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 5);

  }

  @Test
  public void test014() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test014"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Duration duration1 = org.joda.time.Duration.parse("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test015() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test015"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    java.util.Locale locale5 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str6 = timeOfDay1.toString("hi!", locale5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);

  }

  @Test
  public void test016() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test016"); }

    java.lang.StringBuffer stringBuffer0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (int)(short)-1, 10080);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test017() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test017"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusDays((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeField dateTimeField5 = yearMonthDay1.getField((int)' ');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);

  }

  @Test
  public void test018() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test018"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime7 = dateTime5.withHourOfDay(10080);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);

  }

  @Test
  public void test019() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test019"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.DateTimeField dateTimeField1 = gregorianChronology0.hourOfHalfday();
    // The following exception was thrown during execution in test generation
    try {
    long long6 = gregorianChronology0.getDateTimeMillis((int)'a', (int)'#', (int)(short)1, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField1);

  }

  @Test
  public void test020() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test020"); }

    int i0 = org.joda.time.chrono.EthiopicChronology.EE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test021() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test021"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight.Property property3 = dateMidnight1.property(dateTimeFieldType2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test022() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test022"); }

    int i0 = org.joda.time.TimeOfDay.HOUR_OF_DAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test023() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test023"); }

    int i0 = org.joda.time.DateTimeConstants.PM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test024() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test024"); }

    int i0 = org.joda.time.DateTimeConstants.HOURS_PER_DAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 24);

  }

  @Test
  public void test025() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test025"); }

    org.joda.time.DateTimeZone dateTimeZone5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime(0, 0, 5, (-1), 0, dateTimeZone5);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test026() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test026"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime7 = new org.joda.time.MutableDateTime((int)'#', (int)(short)-1, 1, (int)(byte)-1, 10080, (int)(short)1, (-1));
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test027() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test027"); }

    java.io.Writer writer0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.format.FormatUtils.writeUnpaddedInteger(writer0, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test028() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test028"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("Property[secondOfMinute]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test029() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test029"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime7 = dateTime5.withHourOfDay((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);

  }

  @Test
  public void test030() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test030"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicWeekDateTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test031() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test031"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.now(dateTimeZone0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test032() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test032"); }

    org.joda.time.TimeOfDay timeOfDay0 = org.joda.time.TimeOfDay.MIDNIGHT;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = timeOfDay0.toString("CopticChronology[America/Los_Angeles]");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay0);

  }

  @Test
  public void test033() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test033"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.GJChronology gJChronology3 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone0, (long)330, (-1));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test034() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test034"); }

    org.joda.time.Period period0 = org.joda.time.Period.ZERO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period0);

  }

  @Test
  public void test035() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test035"); }

    org.joda.time.ReadableInterval readableInterval0 = null;
    org.joda.time.Hours hours1 = org.joda.time.Hours.hoursIn(readableInterval0);
    int i2 = hours1.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 0);

  }

  @Test
  public void test036() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test036"); }

    org.joda.time.Hours hours0 = org.joda.time.Hours.MIN_VALUE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours0);

  }

  @Test
  public void test037() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test037"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Years years1 = org.joda.time.Years.parseYears("5");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test038() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test038"); }

    int i0 = org.joda.time.chrono.IslamicChronology.AH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test039() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test039"); }

    org.joda.time.Years years1 = org.joda.time.Years.years(0);
    org.joda.time.Years years3 = years1.minus((int)(byte)-1);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Weeks weeks4 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod)years3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years3);

  }

  @Test
  public void test040() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test040"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
    java.lang.String str9 = copticChronology8.toString();
    org.joda.time.TimeOfDay timeOfDay10 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, (org.joda.time.Chronology)copticChronology8);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object)timeOfDay1, periodType5, (org.joda.time.Chronology)copticChronology8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "CopticChronology[America/Los_Angeles]"+ "'", str9.equals("CopticChronology[America/Los_Angeles]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay10);

  }

  @Test
  public void test041() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test041"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    org.joda.time.Months months4 = org.joda.time.Months.FIVE;
    mutableDateTime3.add((org.joda.time.ReadablePeriod)months4, 330);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
    org.joda.time.DurationField durationField9 = copticChronology8.days();
    org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology8);
    org.joda.time.DateTimeField dateTimeField11 = copticChronology8.millisOfSecond();
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime3.setRounding(dateTimeField11, 330);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField11);

  }

  @Test
  public void test042() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test042"); }

    org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.PeriodFormat.getDefault();
    java.io.Writer writer1 = null;
    org.joda.time.Months months2 = org.joda.time.Months.TWELVE;
    // The following exception was thrown during execution in test generation
    try {
    periodFormatter0.printTo(writer1, (org.joda.time.ReadablePeriod)months2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months2);

  }

  @Test
  public void test043() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test043"); }

    org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.PeriodFormat.getDefault();
    java.io.Writer writer1 = null;
    org.joda.time.DateTimeZone dateTimeZone2 = null;
    org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
    org.joda.time.DurationField durationField4 = copticChronology3.days();
    org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology3);
    org.joda.time.Months months6 = org.joda.time.Months.FIVE;
    mutableDateTime5.add((org.joda.time.ReadablePeriod)months6, 330);
    // The following exception was thrown during execution in test generation
    try {
    periodFormatter0.printTo(writer1, (org.joda.time.ReadablePeriod)months6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months6);

  }

  @Test
  public void test044() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test044"); }

    int i0 = org.joda.time.DateTimeConstants.JUNE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test045() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test045"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    int i5 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime2, "secondOfMinute", 100);
    mutableDateTime2.addSeconds(999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-101));

  }

  @Test
  public void test046() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test046"); }

    org.joda.time.Period period1 = org.joda.time.Period.hours(999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period1);

  }

  @Test
  public void test047() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test047"); }

    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    org.joda.time.Chronology chronology5 = copticChronology4.withUTC();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay((int)(byte)-1, (int)(byte)1, (int)(byte)1, chronology5);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology5);

  }

  @Test
  public void test048() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test048"); }

    int i0 = org.joda.time.YearMonth.YEAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test049() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test049"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.fullDate();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime2 = org.joda.time.DateTime.parse("P0Y", dateTimeFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);

  }

  @Test
  public void test050() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test050"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    org.joda.time.TimeOfDay.Property property5 = timeOfDay1.millisOfSecond();
    int i6 = property5.getMaximumValue();
    org.joda.time.PeriodType periodType7 = null;
    org.joda.time.Chronology chronology8 = null;
    org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime(chronology8);
    org.joda.time.PeriodType periodType10 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod((java.lang.Object)chronology8, periodType10, (org.joda.time.Chronology)gregorianChronology11);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Period period13 = new org.joda.time.Period((java.lang.Object)i6, periodType7, (org.joda.time.Chronology)gregorianChronology11);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology11);

  }

  @Test
  public void test051() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test051"); }

    int i0 = org.joda.time.MonthDay.DAY_OF_MONTH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test052() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test052"); }

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
    org.joda.time.DateTimeZone dateTimeZone18 = null;
    org.joda.time.chrono.CopticChronology copticChronology19 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone18);
    org.joda.time.Chronology chronology20 = copticChronology19.withUTC();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay21 = new org.joda.time.TimeOfDay((java.lang.Object)period17, (org.joda.time.Chronology)copticChronology19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology20);

  }

  @Test
  public void test053() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test053"); }

    int i2 = org.joda.time.field.FieldUtils.safeAdd((int)'#', 999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 1034);

  }

  @Test
  public void test054() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test054"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.Chronology chronology3 = copticChronology2.withUTC();
    org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay((long)'a', (org.joda.time.Chronology)copticChronology2);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDate localDate6 = monthDay4.toLocalDate((-1));
      org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology3);

  }

  @Test
  public void test055() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test055"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    java.lang.String str2 = localDate1.toString();
    org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay((long)345);
    // The following exception was thrown during execution in test generation
    try {
    int i5 = localDate1.compareTo((org.joda.time.ReadablePartial)timeOfDay4);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1969-12-31"+ "'", str2.equals("1969-12-31"));

  }

  @Test
  public void test056() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test056"); }

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
    org.joda.time.DateTimeFieldType dateTimeFieldType19 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i20 = localTime18.get(dateTimeFieldType19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);

  }

  @Test
  public void test057() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test057"); }

    org.joda.time.MonthDay monthDay0 = org.joda.time.MonthDay.now();
    org.joda.time.DurationFieldType durationFieldType1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MonthDay monthDay3 = monthDay0.withFieldAdded(durationFieldType1, 330);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(monthDay0);

  }

  @Test
  public void test058() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test058"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int)(short)0);
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(dateTimeZone5);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array7 = timeOfDay6.getFieldTypes();
    int i8 = timeOfDay6.getMillisOfSecond();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Period period9 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime4, (org.joda.time.ReadablePartial)timeOfDay6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 492);

  }

  @Test
  public void test059() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test059"); }

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
    org.joda.time.DurationFieldType durationFieldType19 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime21 = localTime18.withFieldAdded(durationFieldType19, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);

  }

  @Test
  public void test060() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test060"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Chronology chronology4 = null;
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
    java.util.GregorianCalendar gregorianCalendar6 = mutableDateTime5.toGregorianCalendar();
    // The following exception was thrown during execution in test generation
    try {
    mutableInterval3.setStart((org.joda.time.ReadableInstant)mutableDateTime5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar6);

  }

  @Test
  public void test061() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test061"); }

    int i0 = org.joda.time.TimeOfDay.SECOND_OF_MINUTE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test062() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test062"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology1);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = yearMonth2.toString("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);

  }

  @Test
  public void test063() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test063"); }

    int i1 = org.joda.time.field.FieldUtils.safeNegate((int)'a');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == (-97));

  }

  @Test
  public void test064() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test064"); }

    java.io.Writer writer0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.format.FormatUtils.writePaddedInteger(writer0, (int)(short)0, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test065() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test065"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime7 = new org.joda.time.LocalDateTime(6, (int)'4', 100, 3, 0, (int)(byte)10, 3);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test066() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test066"); }

    org.joda.time.Instant instant0 = new org.joda.time.Instant();
    long long1 = instant0.getMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long1 == 1496721385602L);

  }

  @Test
  public void test067() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test067"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.Chronology chronology3 = copticChronology2.withUTC();
    org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay((long)'a', (org.joda.time.Chronology)copticChronology2);
    int i5 = monthDay4.size();
    org.joda.time.DateTimeFieldType dateTimeFieldType6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MonthDay monthDay8 = monthDay4.withField(dateTimeFieldType6, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);

  }

  @Test
  public void test068() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test068"); }

    java.util.Locale locale0 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.text.DateFormatSymbols dateFormatSymbols1 = org.joda.time.DateTimeUtils.getDateFormatSymbols(locale0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test069() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test069"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusDays((int)(short)100);
    java.lang.String str4 = yearMonthDay1.toString();
    org.joda.time.DurationFieldType durationFieldType5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.withFieldAdded(durationFieldType5, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2017-06-05"+ "'", str4.equals("2017-06-05"));

  }

  @Test
  public void test070() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test070"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime6 = new org.joda.time.DateTime((int)(byte)-1, 1, (int)'a', (int)(byte)100, (-101), (int)(short)1);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test071() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test071"); }

    org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Seconds seconds1 = weeks0.toStandardSeconds();
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks0);

  }

  @Test
  public void test072() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test072"); }

    org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
    java.util.Locale locale1 = null;
    java.lang.String str4 = defaultNameProvider0.getShortName(locale1, "", "Property[secondOfMinute]");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test073() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test073"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight dateMidnight4 = property2.addWrapFieldToCopy((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight dateMidnight6 = property2.setCopy("2017-06-05");
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);

  }

  @Test
  public void test074() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test074"); }

    org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(10L);
    java.util.Locale locale3 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str4 = monthDay1.toString("", locale3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test075() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test075"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(dateTimeZone0);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);

  }

  @Test
  public void test076() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test076"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeFieldType dateTimeFieldType3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonth yearMonth5 = yearMonth2.withField(dateTimeFieldType3, (int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);

  }

  @Test
  public void test077() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test077"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone5);
    boolean b7 = localDateTime2.isAfter((org.joda.time.ReadablePartial)localDateTime6);
    org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withDayOfMonth((int)(short)10);
    org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime12 = property10.setCopy("secondOfMinute");
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property10);

  }

  @Test
  public void test078() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test078"); }

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
    org.joda.time.DateTimeZone dateTimeZone20 = null;
    org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone20);
    org.joda.time.LocalDateTime.Property property22 = localDateTime21.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone24 = null;
    org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone24);
    boolean b26 = localDateTime21.isAfter((org.joda.time.ReadablePartial)localDateTime25);
    org.joda.time.LocalDateTime localDateTime28 = localDateTime21.withDayOfMonth((int)(short)10);
    org.joda.time.LocalDateTime.Property property29 = localDateTime28.weekyear();
    // The following exception was thrown during execution in test generation
    try {
    int i30 = localTime18.compareTo((org.joda.time.ReadablePartial)localDateTime28);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b26 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property29);

  }

  @Test
  public void test079() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test079"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusDays((int)(short)100);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeFieldType dateTimeFieldType5 = yearMonthDay3.getFieldType((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);

  }

  @Test
  public void test080() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test080"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusDays((int)(short)100);
    java.lang.String str4 = yearMonthDay1.toString();
    org.joda.time.DurationFieldType durationFieldType5 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonthDay yearMonthDay7 = yearMonthDay1.withFieldAdded(durationFieldType5, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2017-06-05"+ "'", str4.equals("2017-06-05"));

  }

  @Test
  public void test081() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test081"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period9 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology8);
    org.joda.time.DateTimeField dateTimeField10 = gregorianChronology8.era();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime11 = new org.joda.time.DateTime((-1), (int)(byte)100, (int)'a', (int)(byte)0, (int)(short)-1, (int)(byte)-1, 0, (org.joda.time.Chronology)gregorianChronology8);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField10);

  }

  @Test
  public void test082() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test082"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    org.joda.time.TimeOfDay.Property property5 = timeOfDay1.millisOfSecond();
    java.util.Locale locale6 = null;
    int i7 = property5.getMaximumTextLength(locale6);
    java.util.Locale locale9 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay10 = property5.setCopy("secondOfMinute", locale9);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 3);

  }

  @Test
  public void test083() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test083"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    // The following exception was thrown during execution in test generation
    try {
    mutableInterval3.setDurationAfterStart((long)(-101));
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test084() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test084"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int i3 = timeOfDay1.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusSeconds((int)(byte)1);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
    org.joda.time.Chronology chronology9 = copticChronology8.withUTC();
    org.joda.time.MonthDay monthDay10 = new org.joda.time.MonthDay((long)'a', (org.joda.time.Chronology)copticChronology8);
    int i11 = monthDay10.size();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Years years12 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)timeOfDay1, (org.joda.time.ReadablePartial)monthDay10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 2);

  }

  @Test
  public void test085() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test085"); }

    org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long)(short)10);
    org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
    org.joda.time.LocalDateTime.Property property3 = localDateTime1.secondOfMinute();
    org.joda.time.DateTimeZone dateTimeZone4 = null;
    org.joda.time.TimeOfDay timeOfDay5 = new org.joda.time.TimeOfDay(dateTimeZone4);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array6 = timeOfDay5.getFieldTypes();
    int i7 = timeOfDay5.getMillisOfSecond();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime1, (org.joda.time.ReadablePartial)timeOfDay5);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 78);

  }

  @Test
  public void test086() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test086"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
    int i8 = dateMidnight7.getDayOfWeek();
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology12 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology4, (org.joda.time.ReadableDateTime)dateMidnight7, (org.joda.time.ReadableDateTime)mutableDateTime10);
    // The following exception was thrown during execution in test generation
    try {
    long long17 = limitChronology12.getDateTimeMillis(24, 2, (int)(short)-1, (int)'#');
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(limitChronology12);

  }

  @Test
  public void test087() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test087"); }

    int i1 = org.joda.time.format.FormatUtils.calculateDigitCount((long)' ');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2);

  }

  @Test
  public void test088() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test088"); }

    java.lang.StringBuffer stringBuffer0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.format.FormatUtils.appendUnpaddedInteger(stringBuffer0, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test089() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test089"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Period period8 = period6.minusHours(10);
    java.lang.String str9 = period8.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "PT-10H52M1S"+ "'", str9.equals("PT-10H52M1S"));

  }

  @Test
  public void test090() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test090"); }

    java.lang.StringBuffer stringBuffer0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.format.FormatUtils.appendPaddedInteger(stringBuffer0, (long)3, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test091() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test091"); }

    org.joda.time.Duration duration1 = org.joda.time.Duration.standardHours((long)1);
    long long2 = duration1.getMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 3600000L);

  }

  @Test
  public void test092() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test092"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    long long5 = durationField2.subtract(3600000L, (long)843);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-72835200000L));

  }

  @Test
  public void test093() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test093"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.DateTimeField dateTimeField3 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.SkipUndoDateTimeField skipUndoDateTimeField5 = new org.joda.time.field.SkipUndoDateTimeField((org.joda.time.Chronology)copticChronology1, dateTimeField3, (int)(short)1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);

  }

  @Test
  public void test094() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test094"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period2 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology1);
    org.joda.time.DateTimeField dateTimeField3 = gregorianChronology1.era();
    // The following exception was thrown during execution in test generation
    try {
    long long8 = gregorianChronology1.getDateTimeMillis(843, (int)(byte)0, 2, 1034);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);

  }

  @Test
  public void test095() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test095"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.DurationFieldType durationFieldType3 = null;
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime1.add(durationFieldType3, 3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);

  }

  @Test
  public void test096() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test096"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setMonths(100);
    mutablePeriod2.addMinutes((-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test097() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test097"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
    int i8 = dateMidnight7.getDayOfWeek();
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology12 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology4, (org.joda.time.ReadableDateTime)dateMidnight7, (org.joda.time.ReadableDateTime)mutableDateTime10);
    org.joda.time.DateTimeFieldType dateTimeFieldType13 = null;
    // The following exception was thrown during execution in test generation
    try {
    int i14 = mutableDateTime10.get(dateTimeFieldType13);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(limitChronology12);

  }

  @Test
  public void test098() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test098"); }

    org.joda.time.Months months0 = org.joda.time.Months.TWELVE;
    org.joda.time.Months months1 = org.joda.time.Months.FIVE;
    boolean b2 = months0.isLessThan(months1);
    java.lang.String str3 = months0.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b2 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "P12M"+ "'", str3.equals("P12M"));

  }

  @Test
  public void test099() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test099"); }

    java.util.Date date0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonthDay yearMonthDay1 = org.joda.time.YearMonthDay.fromDateFields(date0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test100() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test100"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.time();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test101() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test101"); }

    org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
    org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(dateTimeZone7);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime10 = new org.joda.time.DateTime(1034, 100, (int)(byte)100, 3, (int)(byte)0, (-101), 6, dateTimeZone7);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology8);

  }

  @Test
  public void test102() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test102"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateParser();
    java.lang.StringBuffer stringBuffer1 = null;
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    java.util.GregorianCalendar gregorianCalendar4 = mutableDateTime3.toGregorianCalendar();
    org.joda.time.LocalTime localTime5 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar4);
    // The following exception was thrown during execution in test generation
    try {
    dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadablePartial)localTime5);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime5);

  }

  @Test
  public void test103() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test103"); }

    int i0 = org.joda.time.YearMonth.MONTH_OF_YEAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test104() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test104"); }

    org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
    org.joda.time.LocalTime localTime1 = timeOfDay0.toLocalTime();
    org.joda.time.DateTimeFieldType dateTimeFieldType2 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime4 = localTime1.withField(dateTimeFieldType2, (int)'a');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime1);

  }

  @Test
  public void test105() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test105"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths(0);
    org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonthDay.Property property5 = yearMonthDay3.property(dateTimeFieldType4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);

  }

  @Test
  public void test106() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test106"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    long long5 = durationField2.subtract(1L, (long)6);
    org.joda.time.DurationFieldType durationFieldType6 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.ScaledDurationField scaledDurationField8 = new org.joda.time.field.ScaledDurationField(durationField2, durationFieldType6, 843);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long5 == (-518399999L));

  }

  @Test
  public void test107() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test107"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime5 = localDateTime0.withHourOfDay((int)(byte)-1);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);

  }

  @Test
  public void test108() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test108"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((int)(short)1, (int)(short)-1);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test109() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test109"); }

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
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime1.setWeekOfWeekyear(10080);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b12 == false);

  }

  @Test
  public void test110() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test110"); }

    long long2 = org.joda.time.field.FieldUtils.safeMultiply((long)1, (-518399999L));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == (-518399999L));

  }

  @Test
  public void test111() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test111"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    java.lang.String str3 = copticChronology2.toString();
    org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, (org.joda.time.Chronology)copticChronology2);
    // The following exception was thrown during execution in test generation
    try {
    long long9 = copticChronology2.getDateTimeMillis(5, (int)(short)10, 2017, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CopticChronology[America/Los_Angeles]"+ "'", str3.equals("CopticChronology[America/Los_Angeles]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay4);

  }

  @Test
  public void test112() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test112"); }

    org.joda.time.Months months0 = org.joda.time.Months.ONE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);

  }

  @Test
  public void test113() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test113"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
    int i6 = property5.getMaximumValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 365);

  }

  @Test
  public void test114() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test114"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
    java.util.Locale locale9 = null;
    int i10 = property7.getMaximumShortTextLength(locale9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 8);

  }

  @Test
  public void test115() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test115"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Period period8 = period4.minusMillis((int)'a');
    org.joda.time.DurationFieldType durationFieldType9 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Period period11 = period4.withFieldAdded(durationFieldType9, 4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period8);

  }

  @Test
  public void test116() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test116"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(345);
    org.joda.time.LocalDateTime.Property property5 = localDateTime2.dayOfMonth();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);

  }

  @Test
  public void test117() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test117"); }

    org.joda.time.field.DividedDateTimeField dividedDateTimeField0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.RemainderDateTimeField remainderDateTimeField1 = new org.joda.time.field.RemainderDateTimeField(dividedDateTimeField0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test118() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test118"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.localTimeParser();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MonthDay monthDay2 = org.joda.time.MonthDay.parse("CopticChronology[UTC]", dateTimeFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);

  }

  @Test
  public void test119() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test119"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.DateTimeFormat.forStyle("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test120() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test120"); }

    org.joda.time.Hours hours0 = org.joda.time.Hours.THREE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours0);

  }

  @Test
  public void test121() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test121"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight dateMidnight3 = new org.joda.time.DateMidnight(330, (int)(short)-1, 843);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test122() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test122"); }

    org.joda.time.MutablePeriod mutablePeriod0 = new org.joda.time.MutablePeriod();

  }

  @Test
  public void test123() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test123"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType8 = property7.getFieldType();
    org.joda.time.DateTime dateTime9 = property7.roundHalfCeilingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);

  }

  @Test
  public void test124() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test124"); }

    int i0 = org.joda.time.DateTimeConstants.CE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test125() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test125"); }

    org.joda.time.Months months0 = org.joda.time.Months.NINE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);

  }

  @Test
  public void test126() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test126"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
    java.util.Locale locale8 = null;
    org.joda.time.DateTime dateTime9 = property6.setCopy("26", locale8);
    int i10 = dateTime9.getYearOfCentury();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 26);

  }

  @Test
  public void test127() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test127"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicWeekDate();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Instant instant2 = org.joda.time.Instant.parse("5", dateTimeFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);

  }

  @Test
  public void test128() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test128"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.Chronology chronology3 = copticChronology2.withUTC();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime4 = new org.joda.time.DateTime((java.lang.Object)(-1.0d), (org.joda.time.Chronology)copticChronology2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology3);

  }

  @Test
  public void test129() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test129"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test130() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test130"); }

    org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearWeekDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType0);

  }

  @Test
  public void test131() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test131"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDateTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test132() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test132"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MonthDay monthDay2 = new org.joda.time.MonthDay(330, (int)(short)10);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test133() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test133"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    java.lang.String str5 = property4.getName();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay7 = property4.setCopy((int)(byte)100);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "secondOfMinute"+ "'", str5.equals("secondOfMinute"));

  }

  @Test
  public void test134() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test134"); }

    int i0 = org.joda.time.DateTimeConstants.OCTOBER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 10);

  }

  @Test
  public void test135() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test135"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime((int)(short)100, 2, (int)(byte)10);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test136() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test136"); }

    int i0 = org.joda.time.YearMonthDay.MONTH_OF_YEAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test137() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test137"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    java.util.Locale locale4 = null;
    java.lang.String str5 = property3.getAsText(locale4);
    org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfFloorCopy();
    int i7 = localDateTime6.getWeekyear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "6"+ "'", str5.equals("6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 2017);

  }

  @Test
  public void test138() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test138"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.Chronology chronology3 = copticChronology2.withUTC();
    org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay((long)'a', (org.joda.time.Chronology)copticChronology2);
    org.joda.time.LocalDate localDate6 = monthDay4.toLocalDate((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate6);

  }

  @Test
  public void test139() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test139"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay(8, (int)(short)100, 365);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test140() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test140"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    org.joda.time.DateTime dateTime9 = property7.addToCopy(0);
    org.joda.time.DateTime dateTime10 = property7.roundCeilingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);

  }

  @Test
  public void test141() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test141"); }

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
    org.joda.time.LocalTime localTime21 = property20.withMaximumValue();
    java.util.Locale locale23 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str24 = localTime21.toString("PT-10H52M1S", locale23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime21);

  }

  @Test
  public void test142() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test142"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Period period8 = period6.minusHours(10);
    org.joda.time.Period period9 = period8.toPeriod();
    int i10 = period8.getWeeks();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test143() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test143"); }

    org.joda.time.tz.ZoneInfoCompiler zoneInfoCompiler0 = new org.joda.time.tz.ZoneInfoCompiler();

  }

  @Test
  public void test144() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test144"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.minusMonths(0);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.withMonthOfYear((int)'#');
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);

  }

  @Test
  public void test145() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test145"); }

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
    org.joda.time.Minutes minutes14 = minutes11.multipliedBy(2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes14);

  }

  @Test
  public void test146() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test146"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.now(dateTimeZone4);
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology7);

  }

  @Test
  public void test147() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test147"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setMonths(100);
    mutablePeriod2.setDays((int)'#');
    java.lang.Object obj11 = mutablePeriod2.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj11);

  }

  @Test
  public void test148() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test148"); }

    org.joda.time.TimeOfDay timeOfDay0 = new org.joda.time.TimeOfDay();
    org.joda.time.LocalTime localTime1 = timeOfDay0.toLocalTime();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay0.withMinuteOfHour(100);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime1);

  }

  @Test
  public void test149() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test149"); }

    org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("1969-12-31");
    int i2 = yearMonth1.size();
    org.joda.time.YearMonth yearMonth4 = yearMonth1.minusYears((int)'a');
    java.util.Locale locale6 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str7 = yearMonth4.toString("P0Y", locale6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth4);

  }

  @Test
  public void test150() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test150"); }

    int i0 = org.joda.time.DateTimeConstants.DAYS_PER_WEEK;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test151() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test151"); }

    int i3 = org.joda.time.field.FieldUtils.getWrappedValue(330, 5, 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 6);

  }

  @Test
  public void test152() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test152"); }

    org.joda.time.DateTimeComparator dateTimeComparator0 = org.joda.time.DateTimeComparator.getInstance();
    org.joda.time.DateTimeFieldType dateTimeFieldType1 = dateTimeComparator0.getLowerLimit();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(dateTimeFieldType1);

  }

  @Test
  public void test153() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test153"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
    org.joda.time.Chronology chronology1 = dateTimeFormatter0.getChronology();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(chronology1);

  }

  @Test
  public void test154() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test154"); }

    // The following exception was thrown during execution in test generation
    try {
    int i4 = org.joda.time.field.FieldUtils.getWrappedValue((-1), (int)'4', (int)(byte)100, (int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test155() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test155"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfYear();
    org.joda.time.DateMidnight dateMidnight4 = property3.roundHalfFloorCopy();
    org.joda.time.DateMidnight dateMidnight5 = property3.roundHalfFloorCopy();
    org.joda.time.DateMidnight dateMidnight6 = property3.roundHalfFloorCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight6);

  }

  @Test
  public void test156() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test156"); }

    org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("1969-12-31");
    int i2 = yearMonth1.size();
    org.joda.time.YearMonth yearMonth4 = yearMonth1.minusYears((int)'a');
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeFieldType dateTimeFieldType6 = yearMonth4.getFieldType(24);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth4);

  }

  @Test
  public void test157() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test157"); }

    int i0 = org.joda.time.chrono.CopticChronology.AM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test158() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test158"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.DateMidnight dateMidnight2 = yearMonthDay1.toDateMidnight();
    org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
    org.joda.time.DateTimeField dateTimeField4 = property3.getField();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);

  }

  @Test
  public void test159() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test159"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    // The following exception was thrown during execution in test generation
    try {
    long long9 = iSOChronology1.getDateTimeMillis((int)(short)0, 1, 3, (int)(byte)1, 26, 1034, (int)(byte)0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);

  }

  @Test
  public void test160() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test160"); }

    org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.PeriodFormat.getDefault();
    java.io.Writer writer1 = null;
    org.joda.time.ReadableInstant readableInstant2 = null;
    org.joda.time.ReadableDuration readableDuration3 = null;
    org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant2, readableDuration3);
    org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod4.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology6);
    int i8 = mutablePeriod4.getWeeks();
    mutablePeriod4.setMonths(100);
    org.joda.time.Period period11 = mutablePeriod4.toPeriod();
    int i12 = period11.getYears();
    // The following exception was thrown during execution in test generation
    try {
    periodFormatter0.printTo(writer1, (org.joda.time.ReadablePeriod)period11);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);

  }

  @Test
  public void test161() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test161"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
    org.joda.time.format.DateTimeParser dateTimeParser1 = dateTimeFormatter0.getParser();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeParser1);

  }

  @Test
  public void test162() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test162"); }

    org.joda.time.Years years1 = org.joda.time.Years.years(0);
    org.joda.time.Years years3 = org.joda.time.Years.years(0);
    org.joda.time.Years years5 = years3.minus((int)(byte)-1);
    org.joda.time.Years years6 = years1.minus(years3);
    java.lang.String str7 = years1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "P0Y"+ "'", str7.equals("P0Y"));

  }

  @Test
  public void test163() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test163"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.Duration duration4 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight5 = dateMidnight1.minus((org.joda.time.ReadableDuration)duration4);
    org.joda.time.Duration duration7 = org.joda.time.Duration.standardHours((long)1);
    org.joda.time.Period period8 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateMidnight5, (org.joda.time.ReadableDuration)duration7);
    org.joda.time.DateTimeZone dateTimeZone10 = null;
    org.joda.time.LocalDateTime localDateTime11 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone10);
    org.joda.time.LocalDateTime.Property property12 = localDateTime11.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone14 = null;
    org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone14);
    boolean b16 = localDateTime11.isAfter((org.joda.time.ReadablePartial)localDateTime15);
    org.joda.time.DateTimeZone dateTimeZone18 = null;
    org.joda.time.LocalDateTime localDateTime19 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone18);
    org.joda.time.LocalDateTime localDateTime21 = localDateTime19.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property22 = localDateTime21.dayOfYear();
    org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period24 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime11, (org.joda.time.ReadablePartial)localDateTime21, periodType23);
    org.joda.time.PeriodType periodType25 = periodType23.withSecondsRemoved();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object)dateMidnight5, periodType23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b16 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType25);

  }

  @Test
  public void test164() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test164"); }

    // The following exception was thrown during execution in test generation
    try {
    int i4 = org.joda.time.field.FieldUtils.getWrappedValue((int)'#', 999, (int)(byte)0, (int)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test165() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test165"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    java.lang.String str2 = localDate1.toString();
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = new org.joda.time.Period((long)(byte)1, (long)24, periodType5);
    org.joda.time.LocalDate localDate8 = localDate1.withPeriodAdded((org.joda.time.ReadablePeriod)period6, 345);
    org.joda.time.LocalDate localDate10 = localDate8.withWeekyear(10);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDate localDate12 = localDate10.withDayOfYear(843);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1970-01-01"+ "'", str2.equals("1970-01-01"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate10);

  }

  @Test
  public void test166() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test166"); }

    org.joda.time.ReadableInstant readableInstant3 = null;
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant3, readableDuration4);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology7 = null;
    org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
    int i11 = dateTimeFormatter6.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime8, "secondOfMinute", 100);
    org.joda.time.DateTimeZone dateTimeZone12 = null;
    org.joda.time.DateMidnight dateMidnight13 = new org.joda.time.DateMidnight(dateTimeZone12);
    long long14 = dateMidnight13.getMillis();
    org.joda.time.DateMidnight dateMidnight16 = dateMidnight13.plusDays(24);
    mutablePeriod5.setPeriod((org.joda.time.ReadableInstant)mutableDateTime8, (org.joda.time.ReadableInstant)dateMidnight16);
    org.joda.time.DateTimeZone dateTimeZone19 = null;
    org.joda.time.chrono.CopticChronology copticChronology20 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone19);
    java.lang.String str21 = copticChronology20.toString();
    mutablePeriod5.setPeriod(0L, (org.joda.time.Chronology)copticChronology20);
    org.joda.time.DurationField durationField23 = copticChronology20.hours();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(535, 2017, 843, (org.joda.time.Chronology)copticChronology20);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long14 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "CopticChronology[UTC]"+ "'", str21.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField23);

  }

  @Test
  public void test167() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test167"); }

    org.joda.time.Months months0 = org.joda.time.Months.EIGHT;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);

  }

  @Test
  public void test168() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test168"); }

    org.joda.time.chrono.EthiopicChronology ethiopicChronology0 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.Instant instant3 = mutableDateTime2.toInstant();
    mutableDateTime2.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
    long long8 = dateMidnight7.getMillis();
    org.joda.time.DateMidnight dateMidnight10 = dateMidnight7.plusDays(24);
    org.joda.time.Minutes minutes11 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime2, (org.joda.time.ReadableInstant)dateMidnight10);
    org.joda.time.Minutes minutes12 = org.joda.time.Minutes.THREE;
    org.joda.time.Minutes minutes13 = minutes11.plus(minutes12);
    boolean b14 = ethiopicChronology0.equals((java.lang.Object)minutes11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ethiopicChronology0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test169() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test169"); }

    org.joda.time.DateTimeComparator dateTimeComparator0 = org.joda.time.DateTimeComparator.getDateOnlyInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator0);

  }

  @Test
  public void test170() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test170"); }

    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    boolean b5 = dateTimeZone3.isStandardOffset((long)843);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(100, 24, (-97), dateTimeZone3);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b5 == true);

  }

  @Test
  public void test171() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test171"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    java.lang.String str2 = localDate1.toString();
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = new org.joda.time.Period((long)(byte)1, (long)24, periodType5);
    org.joda.time.LocalDate localDate8 = localDate1.withPeriodAdded((org.joda.time.ReadablePeriod)period6, 345);
    org.joda.time.LocalDate localDate10 = localDate8.minusWeeks(6);
    org.joda.time.ReadableInstant readableInstant12 = null;
    org.joda.time.ReadableDuration readableDuration13 = null;
    org.joda.time.MutablePeriod mutablePeriod14 = new org.joda.time.MutablePeriod(readableInstant12, readableDuration13);
    org.joda.time.ReadableDuration readableDuration15 = null;
    org.joda.time.Chronology chronology16 = null;
    org.joda.time.MutableDateTime mutableDateTime17 = new org.joda.time.MutableDateTime(chronology16);
    org.joda.time.PeriodType periodType18 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology19 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod((java.lang.Object)chronology16, periodType18, (org.joda.time.Chronology)gregorianChronology19);
    mutablePeriod14.setPeriod(readableDuration15, chronology16);
    org.joda.time.DateTimeZone dateTimeZone23 = null;
    org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
    org.joda.time.DurationField durationField25 = copticChronology24.days();
    org.joda.time.MutableDateTime mutableDateTime26 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology24);
    org.joda.time.DateTimeField dateTimeField27 = copticChronology24.millisOfSecond();
    mutablePeriod14.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology24);
    org.joda.time.LocalTime localTime29 = new org.joda.time.LocalTime((long)330, (org.joda.time.Chronology)copticChronology24);
    int i30 = localTime29.getMillisOfSecond();
    org.joda.time.LocalTime.Property property31 = localTime29.secondOfMinute();
    org.joda.time.LocalTime localTime33 = localTime29.minusSeconds((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone34 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime35 = localDate8.toDateTime(localTime33, dateTimeZone34);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1970-01-01"+ "'", str2.equals("1970-01-01"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime33);

  }

  @Test
  public void test172() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test172"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MonthDay monthDay12 = monthDay10.withDayOfMonth((int)(byte)0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);

  }

  @Test
  public void test173() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test173"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setMonths(100);
    org.joda.time.Period period9 = mutablePeriod2.toPeriod();
    int i10 = period9.getYears();
    org.joda.time.Period period12 = period9.plusWeeks((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Days days13 = period12.toStandardDays();
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period12);

  }

  @Test
  public void test174() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test174"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfYear();
    org.joda.time.DateMidnight.Property property4 = dateMidnight1.yearOfCentury();
    java.util.Locale locale5 = null;
    java.lang.String str6 = property4.getAsText(locale5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "17"+ "'", str6.equals("17"));

  }

  @Test
  public void test175() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test175"); }

    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
    java.lang.String str7 = copticChronology6.toString();
    org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology9 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone8);
    org.joda.time.TimeOfDay timeOfDay10 = new org.joda.time.TimeOfDay(dateTimeZone8);
    org.joda.time.Chronology chronology11 = copticChronology6.withZone(dateTimeZone8);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(24, 535, (int)(byte)10, 26, 10, dateTimeZone8);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CopticChronology[UTC]"+ "'", str7.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology11);

  }

  @Test
  public void test176() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test176"); }

    org.joda.time.ReadableInstant readableInstant4 = null;
    org.joda.time.ReadableDuration readableDuration5 = null;
    org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod(readableInstant4, readableDuration5);
    org.joda.time.chrono.GregorianChronology gregorianChronology8 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod6.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology8);
    org.joda.time.DateTimeZone dateTimeZone10 = null;
    org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
    int i12 = dateMidnight11.getDayOfWeek();
    org.joda.time.Chronology chronology13 = null;
    org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
    java.util.GregorianCalendar gregorianCalendar15 = mutableDateTime14.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology16 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology8, (org.joda.time.ReadableDateTime)dateMidnight11, (org.joda.time.ReadableDateTime)mutableDateTime14);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(0, 33, 298, 535, (org.joda.time.Chronology)limitChronology16);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(limitChronology16);

  }

  @Test
  public void test177() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test177"); }

    int i0 = org.joda.time.DateTimeConstants.JULY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test178() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test178"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    java.lang.String str5 = property4.toString();
    java.util.Locale locale6 = null;
    java.lang.String str7 = property4.getAsShortText(locale6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Property[secondOfMinute]"+ "'", str5.equals("Property[secondOfMinute]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "32"+ "'", str7.equals("32"));

  }

  @Test
  public void test179() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test179"); }

    int i2 = org.joda.time.field.FieldUtils.safeMultiplyToInt(1L, (long)999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 999);

  }

  @Test
  public void test180() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test180"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property5 = localDateTime4.hourOfDay();
    org.joda.time.LocalDateTime localDateTime6 = property5.roundFloorCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime6);

  }

  @Test
  public void test181() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test181"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight dateMidnight4 = property2.addWrapFieldToCopy((int)(short)100);
    org.joda.time.Interval interval5 = property2.toInterval();
    long long6 = interval5.toDurationMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long6 == 3155760000000L);

  }

  @Test
  public void test182() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test182"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test183() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test183"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    java.lang.Object obj2 = mutableDateTime1.clone();
    java.lang.String str3 = mutableDateTime1.toString();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime4 = new org.joda.time.LocalTime((java.lang.Object)str3);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "2017-06-06T03:56:32.986Z"+ "'", str3.equals("2017-06-06T03:56:32.986Z"));

  }

  @Test
  public void test184() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test184"); }

    org.joda.time.Seconds seconds1 = org.joda.time.Seconds.seconds((int)(short)-1);
    org.joda.time.Days days2 = seconds1.toStandardDays();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(days2);

  }

  @Test
  public void test185() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test185"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(7, 10, (int)(short)10, 8, (int)(short)-1, (int)(byte)1);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test186() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test186"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.ReadableDuration readableDuration3 = null;
    org.joda.time.Chronology chronology4 = null;
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
    org.joda.time.PeriodType periodType6 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object)chronology4, periodType6, (org.joda.time.Chronology)gregorianChronology7);
    mutablePeriod2.setPeriod(readableDuration3, chronology4);
    int i10 = mutablePeriod2.getDays();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test187() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test187"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((org.joda.time.Chronology)iSOChronology1);
    org.joda.time.Chronology chronology3 = iSOChronology1.withUTC();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology3);

  }

  @Test
  public void test188() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test188"); }

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
    org.joda.time.DateTimeZone dateTimeZone23 = null;
    org.joda.time.chrono.CopticChronology copticChronology24 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone23);
    java.lang.String str25 = copticChronology24.toString();
    org.joda.time.DateTimeZone dateTimeZone26 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology27 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone26);
    org.joda.time.TimeOfDay timeOfDay28 = new org.joda.time.TimeOfDay(dateTimeZone26);
    org.joda.time.Chronology chronology29 = copticChronology24.withZone(dateTimeZone26);
    org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime((long)'a', chronology29);
    org.joda.time.DateTimeField dateTimeField31 = org.joda.time.field.LenientDateTimeField.getInstance(dateTimeField21, chronology29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str25 + "' != '" + "CopticChronology[UTC]"+ "'", str25.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField31);

  }

  @Test
  public void test189() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test189"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime.Property property3 = localDateTime2.era();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);

  }

  @Test
  public void test190() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test190"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int i3 = timeOfDay1.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusSeconds((int)(byte)1);
    int i6 = timeOfDay5.getSecondOfMinute();
    org.joda.time.Chronology chronology7 = null;
    org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
    java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime8.toGregorianCalendar();
    org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar9);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
    java.lang.String str12 = localTime10.toString(dateTimeFormatter11);
    boolean b13 = timeOfDay5.isBefore((org.joda.time.ReadablePartial)localTime10);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay15 = timeOfDay5.withSecondOfMinute(100);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 219);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "T03:56:34"+ "'", str12.equals("T03:56:34"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);

  }

  @Test
  public void test191() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test191"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    long long2 = dateMidnight1.getMillis();
    org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.plusDays(24);
    org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long)10);
    org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withFields((org.joda.time.ReadablePartial)localDate6);
    long long8 = dateMidnight4.getMillis();
    org.joda.time.DateMidnight.Property property9 = dateMidnight4.dayOfWeek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long8 == 1498780800000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property9);

  }

  @Test
  public void test192() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test192"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeZone.setDefault(dateTimeZone0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test193() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test193"); }

    int i0 = org.joda.time.TimeOfDay.MINUTE_OF_HOUR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test194() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test194"); }

    int i2 = org.joda.time.field.FieldUtils.safeMultiply(5, 47);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 235);

  }

  @Test
  public void test195() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test195"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    boolean b7 = mutableDateTime5.isEqual((long)429);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test196() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test196"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Years years5 = org.joda.time.Years.years(0);
    org.joda.time.Years years7 = years5.minus((int)(byte)-1);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)years7);
    org.joda.time.Years years10 = years7.dividedBy((int)(byte)100);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDate localDate11 = new org.joda.time.LocalDate((java.lang.Object)years7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years10);

  }

  @Test
  public void test197() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test197"); }

    int i0 = org.joda.time.DateTimeConstants.MILLIS_PER_SECOND;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1000);

  }

  @Test
  public void test198() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test198"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.forID("26");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test199() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test199"); }

    org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType0);

  }

  @Test
  public void test200() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test200"); }

    org.joda.time.Hours hours1 = org.joda.time.Hours.hours(7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours1);

  }

  @Test
  public void test201() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test201"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
    int i8 = dateMidnight7.getDayOfWeek();
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology12 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology4, (org.joda.time.ReadableDateTime)dateMidnight7, (org.joda.time.ReadableDateTime)mutableDateTime10);
    // The following exception was thrown during execution in test generation
    try {
    long long17 = limitChronology12.getDateTimeMillis((int)' ', (int)(short)-1, (int)'4', 1000);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(limitChronology12);

  }

  @Test
  public void test202() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test202"); }

    org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(10L);
    org.joda.time.ReadableInterval readableInterval2 = null;
    org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
    org.joda.time.Duration duration4 = hours3.toStandardDuration();
    org.joda.time.MonthDay monthDay6 = monthDay1.withPeriodAdded((org.joda.time.ReadablePeriod)hours3, 298);
    org.joda.time.Hours hours8 = hours3.minus(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(monthDay6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours8);

  }

  @Test
  public void test203() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test203"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    int i7 = period6.getMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 0);

  }

  @Test
  public void test204() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test204"); }

    org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstanceUTC();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology0);

  }

  @Test
  public void test205() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test205"); }

    org.joda.time.Months months0 = org.joda.time.Months.FOUR;
    org.joda.time.Months months1 = org.joda.time.Months.FIVE;
    org.joda.time.Months months3 = months1.plus(330);
    org.joda.time.Months months4 = months0.plus(months1);
    org.joda.time.Months months6 = months1.multipliedBy((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months6);

  }

  @Test
  public void test206() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test206"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.Duration duration4 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
    org.joda.time.DateMidnight.Property property7 = dateMidnight6.centuryOfEra();
    org.joda.time.DateMidnight.Property property8 = dateMidnight6.dayOfYear();
    org.joda.time.DateMidnight dateMidnight9 = property8.roundHalfFloorCopy();
    org.joda.time.PeriodType periodType10 = null;
    org.joda.time.Period period11 = duration4.toPeriodFrom((org.joda.time.ReadableInstant)dateMidnight9, periodType10);
    org.joda.time.DateMidnight dateMidnight13 = dateMidnight1.withPeriodAdded((org.joda.time.ReadablePeriod)period11, 100);
    org.joda.time.DateMidnight.Property property14 = dateMidnight13.centuryOfEra();
    java.util.Locale locale16 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight dateMidnight17 = property14.setCopy("2017-06-05", locale16);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property14);

  }

  @Test
  public void test207() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test207"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHour();
    java.io.Writer writer1 = null;
    org.joda.time.DateTimeZone dateTimeZone2 = null;
    org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
    org.joda.time.DurationField durationField4 = copticChronology3.days();
    org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology3);
    org.joda.time.DateTimeField dateTimeField6 = copticChronology3.millisOfSecond();
    org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((org.joda.time.Chronology)copticChronology3);
    // The following exception was thrown during execution in test generation
    try {
    dateTimeFormatter0.printTo(writer1, (org.joda.time.ReadableInstant)dateTime7);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);

  }

  @Test
  public void test208() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test208"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDateTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test209() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test209"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
    java.lang.Appendable appendable1 = null;
    org.joda.time.DateTimeZone dateTimeZone2 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology3 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone2);
    int i5 = dateTimeZone2.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone2);
    org.joda.time.DateTime dateTime8 = dateTime6.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property9 = dateTime6.millisOfDay();
    boolean b10 = dateTime6.isBeforeNow();
    // The following exception was thrown during execution in test generation
    try {
    dateTimeFormatter0.printTo(appendable1, (org.joda.time.ReadableInstant)dateTime6);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test210() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test210"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeFieldType dateTimeFieldType5 = timeOfDay3.getFieldType((int)(short)100);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);

  }

  @Test
  public void test211() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test211"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.ReadableDuration readableDuration3 = null;
    org.joda.time.Chronology chronology4 = null;
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
    org.joda.time.PeriodType periodType6 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object)chronology4, periodType6, (org.joda.time.Chronology)gregorianChronology7);
    mutablePeriod2.setPeriod(readableDuration3, chronology4);
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.chrono.CopticChronology copticChronology12 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone11);
    org.joda.time.DurationField durationField13 = copticChronology12.days();
    org.joda.time.MutableDateTime mutableDateTime14 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology12);
    org.joda.time.DateTimeField dateTimeField15 = copticChronology12.millisOfSecond();
    mutablePeriod2.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology12);
    // The following exception was thrown during execution in test generation
    try {
    long long21 = copticChronology12.getDateTimeMillis((int)(byte)-1, 0, (-97), 33);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField15);

  }

  @Test
  public void test212() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test212"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.shortTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test213() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test213"); }

    org.joda.time.field.RemainderDateTimeField remainderDateTimeField0 = null;
    org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
    int i4 = dateTimeZone1.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now(dateTimeZone1);
    org.joda.time.DateTime dateTime7 = dateTime5.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property8 = dateTime5.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType9 = property8.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
    int i13 = dateTimeZone10.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime14 = org.joda.time.DateTime.now(dateTimeZone10);
    org.joda.time.DateTime dateTime16 = dateTime14.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property17 = dateTime14.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType18 = property17.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator19 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType9, dateTimeFieldType18);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.DividedDateTimeField dividedDateTimeField20 = new org.joda.time.field.DividedDateTimeField(remainderDateTimeField0, dateTimeFieldType9);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator19);

  }

  @Test
  public void test214() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test214"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int i3 = timeOfDay1.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusSeconds((int)(byte)1);
    int i6 = timeOfDay5.getSecondOfMinute();
    org.joda.time.Chronology chronology7 = null;
    org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
    java.util.GregorianCalendar gregorianCalendar9 = mutableDateTime8.toGregorianCalendar();
    org.joda.time.LocalTime localTime10 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar9);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter11 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
    java.lang.String str12 = localTime10.toString(dateTimeFormatter11);
    boolean b13 = timeOfDay5.isBefore((org.joda.time.ReadablePartial)localTime10);
    org.joda.time.DateTimeZone dateTimeZone15 = null;
    org.joda.time.LocalDateTime localDateTime16 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone15);
    org.joda.time.LocalDateTime.Property property17 = localDateTime16.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone19 = null;
    org.joda.time.LocalDateTime localDateTime20 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone19);
    boolean b21 = localDateTime16.isAfter((org.joda.time.ReadablePartial)localDateTime20);
    org.joda.time.LocalDateTime localDateTime23 = localDateTime16.withDayOfMonth((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Years years24 = org.joda.time.Years.yearsBetween((org.joda.time.ReadablePartial)timeOfDay5, (org.joda.time.ReadablePartial)localDateTime23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 829);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "T03:56:35"+ "'", str12.equals("T03:56:35"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b13 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime23);

  }

  @Test
  public void test215() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test215"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.date();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test216() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test216"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    org.joda.time.Period period11 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType12 = null;
    org.joda.time.Period period13 = period11.withPeriodType(periodType12);
    mutablePeriod2.add((org.joda.time.ReadablePeriod)period13);
    int i15 = mutablePeriod2.getSeconds();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 1);

  }

  @Test
  public void test217() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test217"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfSecond();
    org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime7 = new org.joda.time.DateTime((java.lang.Object)copticChronology1, dateTimeZone6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);

  }

  @Test
  public void test218() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test218"); }

    org.joda.time.Weeks weeks0 = org.joda.time.Weeks.ZERO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks0);

  }

  @Test
  public void test219() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test219"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight.Property property3 = dateMidnight1.dayOfYear();
    org.joda.time.Interval interval4 = dateMidnight1.toInterval();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Interval interval5 = new org.joda.time.Interval((java.lang.Object)dateMidnight1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval4);

  }

  @Test
  public void test220() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test220"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime1 = org.joda.time.DateTime.parse("1967254T000000Z");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test221() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test221"); }

    long long2 = org.joda.time.field.FieldUtils.safeMultiply((long)10, (long)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 20L);

  }

  @Test
  public void test222() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test222"); }

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
    org.joda.time.LocalDateTime localDateTime17 = localDateTime12.minusMonths((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime17);

  }

  @Test
  public void test223() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test223"); }

    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_INDIAN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType0);

  }

  @Test
  public void test224() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test224"); }

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
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
    java.lang.String str18 = copticChronology17.toString();
    mutablePeriod2.setPeriod(0L, (org.joda.time.Chronology)copticChronology17);
    org.joda.time.DurationField durationField20 = copticChronology17.hours();
    java.lang.String str21 = copticChronology17.toString();
    org.joda.time.Chronology chronology22 = copticChronology17.withUTC();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "CopticChronology[UTC]"+ "'", str18.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "CopticChronology[UTC]"+ "'", str21.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology22);

  }

  @Test
  public void test225() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test225"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = null;
    org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
    java.lang.String str6 = copticChronology5.toString();
    org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
    org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(dateTimeZone7);
    org.joda.time.Chronology chronology10 = copticChronology5.withZone(dateTimeZone7);
    org.joda.time.DateTime dateTime11 = mutableDateTime3.toDateTime(dateTimeZone7);
    java.lang.String str12 = dateTimeFormatter1.print((org.joda.time.ReadableInstant)mutableDateTime3);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime13 = org.joda.time.MutableDateTime.parse("CopticChronology[America/Los_Angeles]", dateTimeFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "CopticChronology[UTC]"+ "'", str6.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str12 + "' != '" + "2017-06-06T03:56:38.215"+ "'", str12.equals("2017-06-06T03:56:38.215"));

  }

  @Test
  public void test226() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test226"); }

    org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
    org.joda.time.DateTimeZone dateTimeZone2 = null;
    org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
    java.lang.String str4 = copticChronology3.toString();
    org.joda.time.DateTimeField dateTimeField5 = copticChronology3.clockhourOfDay();
    org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long)33, periodType1, (org.joda.time.Chronology)copticChronology3);
    // The following exception was thrown during execution in test generation
    try {
    mutablePeriod6.setPeriod(365, (int)(short)0, 28, 330, 429, 5, 235, 235);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CopticChronology[UTC]"+ "'", str4.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);

  }

  @Test
  public void test227() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test227"); }

    org.joda.time.MonthDay monthDay0 = org.joda.time.MonthDay.now();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MonthDay monthDay2 = monthDay0.withMonthOfYear((int)'a');
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(monthDay0);

  }

  @Test
  public void test228() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test228"); }

    org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.millis();
    org.joda.time.DateTimeZone dateTimeZone2 = null;
    org.joda.time.chrono.CopticChronology copticChronology3 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone2);
    java.lang.String str4 = copticChronology3.toString();
    org.joda.time.DateTimeField dateTimeField5 = copticChronology3.clockhourOfDay();
    org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((long)33, periodType1, (org.joda.time.Chronology)copticChronology3);
    org.joda.time.DateTimeField dateTimeField7 = copticChronology3.secondOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CopticChronology[UTC]"+ "'", str4.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField7);

  }

  @Test
  public void test229() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test229"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int i3 = timeOfDay1.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusSeconds((int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeFieldType dateTimeFieldType7 = timeOfDay5.getFieldType(784);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 329);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay5);

  }

  @Test
  public void test230() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test230"); }

    org.joda.time.tz.FixedDateTimeZone fixedDateTimeZone4 = new org.joda.time.tz.FixedDateTimeZone("hi!", "2017-W23-2T03:56:37Z", 26, 1034);
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long)6);
    org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.withCenturyOfEra(1);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.GJChronology gJChronology10 = org.joda.time.chrono.GJChronology.getInstance((org.joda.time.DateTimeZone)fixedDateTimeZone4, (org.joda.time.ReadableInstant)dateMidnight8, 47);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight8);

  }

  @Test
  public void test231() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test231"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime9 = property7.setCopy("T03:56:32");
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);

  }

  @Test
  public void test232() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test232"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    java.lang.String str2 = localDate1.toString();
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = new org.joda.time.Period((long)(byte)1, (long)24, periodType5);
    org.joda.time.LocalDate localDate8 = localDate1.withPeriodAdded((org.joda.time.ReadablePeriod)period6, 345);
    org.joda.time.DurationFieldType durationFieldType9 = null;
    boolean b10 = localDate8.isSupported(durationFieldType9);
    org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
    int i14 = dateTimeZone11.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone11);
    org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property18 = dateTime15.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
    int i23 = dateTimeZone20.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone20);
    org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property27 = dateTime24.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator29 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType19, dateTimeFieldType28);
    org.joda.time.Partial partial31 = new org.joda.time.Partial(dateTimeFieldType19, (int)(byte)1);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDate.Property property32 = localDate8.property(dateTimeFieldType19);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "1970-01-01"+ "'", str2.equals("1970-01-01"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator29);

  }

  @Test
  public void test233() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test233"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
    // The following exception was thrown during execution in test generation
    try {
    int i4 = localDate1.getValue((int)'#');
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);

  }

  @Test
  public void test234() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test234"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.TimeOfDay timeOfDay4 = new org.joda.time.TimeOfDay(dateTimeZone3);
    org.joda.time.TimeOfDay timeOfDay6 = timeOfDay4.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property7 = timeOfDay4.secondOfMinute();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(dateTimeZone8);
    boolean b10 = timeOfDay4.isBefore((org.joda.time.ReadablePartial)timeOfDay9);
    org.joda.time.DateTimeZone dateTimeZone11 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology12 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone11);
    int i14 = dateTimeZone11.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime15 = org.joda.time.DateTime.now(dateTimeZone11);
    org.joda.time.DateTime dateTime17 = dateTime15.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property18 = dateTime15.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType19 = property18.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology21 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone20);
    int i23 = dateTimeZone20.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime24 = org.joda.time.DateTime.now(dateTimeZone20);
    org.joda.time.DateTime dateTime26 = dateTime24.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property27 = dateTime24.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType28 = property27.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator29 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType19, dateTimeFieldType28);
    org.joda.time.DateTimeZone dateTimeZone30 = null;
    org.joda.time.TimeOfDay timeOfDay31 = new org.joda.time.TimeOfDay(dateTimeZone30);
    org.joda.time.TimeOfDay timeOfDay33 = timeOfDay31.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property34 = timeOfDay31.secondOfMinute();
    org.joda.time.TimeOfDay.Property property35 = timeOfDay31.millisOfSecond();
    java.util.Locale locale36 = null;
    int i37 = property35.getMaximumTextLength(locale36);
    org.joda.time.DateTimeFieldType dateTimeFieldType38 = property35.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator39 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType28, dateTimeFieldType38);
    org.joda.time.TimeOfDay.Property property40 = timeOfDay9.property(dateTimeFieldType38);
    // The following exception was thrown during execution in test generation
    try {
    int i41 = yearMonth2.get(dateTimeFieldType38);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b10 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i37 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property40);

  }

  @Test
  public void test235() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test235"); }

    org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.PeriodFormat.getDefault();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutablePeriod mutablePeriod2 = periodFormatter0.parseMutablePeriod("secondOfMinute");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter0);

  }

  @Test
  public void test236() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test236"); }

    org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime9 = new org.joda.time.MutableDateTime((int)'4', 365, (int)(byte)-1, 0, 2017, 770, (int)(short)10, dateTimeZone7);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology8);

  }

  @Test
  public void test237() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test237"); }

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
    org.joda.time.LocalTime localTime10 = new org.joda.time.LocalTime(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CopticChronology[UTC]"+ "'", str4.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);

  }

  @Test
  public void test238() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test238"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime8 = dateTime6.withYearOfCentury(784);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);

  }

  @Test
  public void test239() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test239"); }

    org.joda.time.tz.DefaultNameProvider defaultNameProvider0 = new org.joda.time.tz.DefaultNameProvider();
    java.util.Locale locale1 = null;
    java.lang.String str4 = defaultNameProvider0.getName(locale1, "1970-01-01", "2017-06-05");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(str4);

  }

  @Test
  public void test240() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test240"); }

    org.joda.time.Days days0 = org.joda.time.Days.ONE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(days0);

  }

  @Test
  public void test241() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test241"); }

    org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology2 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone1);
    org.joda.time.YearMonth yearMonth3 = new org.joda.time.YearMonth((long)(byte)0, (org.joda.time.Chronology)iSOChronology2);
    org.joda.time.DateTimeField dateTimeField4 = iSOChronology2.secondOfDay();
    org.joda.time.DateTime dateTime5 = org.joda.time.DateTime.now((org.joda.time.Chronology)iSOChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);

  }

  @Test
  public void test242() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test242"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfSecond();
    org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds((int)' ');
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
    org.joda.time.DateMidnight dateMidnight10 = yearMonthDay9.toDateMidnight();
    org.joda.time.YearMonthDay.Property property11 = yearMonthDay9.dayOfMonth();
    org.joda.time.DateTimeFieldType dateTimeFieldType12 = property11.getFieldType();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime14 = dateTime5.withField(dateTimeFieldType12, 0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType12);

  }

  @Test
  public void test243() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test243"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeField dateTimeField6 = timeOfDay1.getField(1034);
      org.junit.Assert.fail("Expected exception of type java.lang.IndexOutOfBoundsException");
    } catch (java.lang.IndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);

  }

  @Test
  public void test244() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test244"); }

    int i0 = org.joda.time.YearMonthDay.YEAR;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test245() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test245"); }

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
    int i16 = localDateTime12.getHourOfDay();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);

  }

  @Test
  public void test246() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test246"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    java.lang.String str5 = copticChronology4.toString();
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
    org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone6);
    org.joda.time.Chronology chronology9 = copticChronology4.withZone(dateTimeZone6);
    org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime(dateTimeZone6);
    java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant)mutableDateTime2);
    java.lang.Object obj12 = mutableDateTime2.clone();
    org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfYear();
    org.joda.time.DateTimeZone dateTimeZone14 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology15 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone14);
    org.joda.time.DateTimeField dateTimeField16 = iSOChronology15.minuteOfDay();
    int i17 = mutableDateTime2.get(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CopticChronology[UTC]"+ "'", str5.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2017-06-06T03:56:40.817"+ "'", str11.equals("2017-06-06T03:56:40.817"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 236);

  }

  @Test
  public void test247() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test247"); }

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
    int i34 = period33.getDays();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long22 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str29 + "' != '" + "CopticChronology[UTC]"+ "'", str29.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "CopticChronology[UTC]"+ "'", str32.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);

  }

  @Test
  public void test248() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test248"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Years years5 = org.joda.time.Years.years(0);
    org.joda.time.Years years7 = years5.minus((int)(byte)-1);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)years7);
    org.joda.time.PeriodType periodType9 = org.joda.time.PeriodType.millis();
    org.joda.time.PeriodType periodType10 = periodType9.withYearsRemoved();
    org.joda.time.PeriodType periodType11 = periodType9.withSecondsRemoved();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Period period12 = mutableInterval3.toPeriod(periodType9);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType11);

  }

  @Test
  public void test249() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test249"); }

    org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("1969-12-31");
    int i2 = yearMonth1.size();
    org.joda.time.YearMonth yearMonth4 = yearMonth1.minusYears((int)'a');
    int i5 = yearMonth1.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 1969);

  }

  @Test
  public void test250() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test250"); }

    org.joda.time.ReadableInstant readableInstant6 = null;
    org.joda.time.ReadableDuration readableDuration7 = null;
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod(readableInstant6, readableDuration7);
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod8.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology10);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(24, 6, 4, (int)' ', 0, 5, (org.joda.time.Chronology)gregorianChronology10);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology10);

  }

  @Test
  public void test251() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test251"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusDays((-1));
    int i3 = localDateTime2.getSecondOfMinute();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 41);

  }

  @Test
  public void test252() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test252"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setMonths(100);
    org.joda.time.Period period9 = mutablePeriod2.toPeriod();
    mutablePeriod2.setMillis((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period9);

  }

  @Test
  public void test253() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test253"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    org.joda.time.DateTime dateTime2 = new org.joda.time.DateTime((org.joda.time.Chronology)iSOChronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    org.joda.time.Chronology chronology5 = copticChronology4.withUTC();
    org.joda.time.DateTime dateTime6 = dateTime2.withChronology(chronology5);
    org.joda.time.DateTime dateTime8 = dateTime2.minus((long)12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime8);

  }

  @Test
  public void test254() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test254"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
    org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar2);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
    java.lang.String str5 = localTime3.toString(dateTimeFormatter4);
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
    org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone6);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter9 = dateTimeFormatter4.withZone(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "T03:56:41"+ "'", str5.equals("T03:56:41"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter9);

  }

  @Test
  public void test255() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test255"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
    org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.dayOfYear();
    org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int)(byte)10);
    org.joda.time.MutableDateTime.Property property6 = mutableDateTime5.yearOfEra();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);

  }

  @Test
  public void test256() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test256"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.LocalDateTime localDateTime5 = localDateTime0.minusDays(535);
    org.joda.time.LocalDateTime localDateTime7 = localDateTime5.minusWeeks(1);
    int i8 = localDateTime7.getEra();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 1);

  }

  @Test
  public void test257() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test257"); }

    org.joda.time.Duration duration2 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.DateMidnight dateMidnight4 = new org.joda.time.DateMidnight(dateTimeZone3);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.centuryOfEra();
    org.joda.time.DateMidnight.Property property6 = dateMidnight4.dayOfYear();
    org.joda.time.DateMidnight dateMidnight7 = property6.roundHalfFloorCopy();
    org.joda.time.PeriodType periodType8 = null;
    org.joda.time.Period period9 = duration2.toPeriodFrom((org.joda.time.ReadableInstant)dateMidnight7, periodType8);
    org.joda.time.DateMidnight.Property property10 = dateMidnight7.year();
    org.joda.time.DateMidnight dateMidnight11 = property10.withMaximumValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight11);

  }

  @Test
  public void test258() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test258"); }

    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
    org.joda.time.DurationField durationField9 = copticChronology8.days();
    org.joda.time.MutableDateTime mutableDateTime10 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology8);
    org.joda.time.DateTimeField dateTimeField11 = copticChronology8.millisOfSecond();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime12 = new org.joda.time.DateTime(1000, 4, 24, (-97), 37, (int)'a', 236, (org.joda.time.Chronology)copticChronology8);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField11);

  }

  @Test
  public void test259() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test259"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone5);
    boolean b7 = localDateTime2.isAfter((org.joda.time.ReadablePartial)localDateTime6);
    org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withDayOfMonth((int)(short)10);
    org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
    org.joda.time.Seconds seconds12 = org.joda.time.Seconds.seconds((int)(short)-1);
    org.joda.time.LocalDateTime localDateTime13 = localDateTime9.plus((org.joda.time.ReadablePeriod)seconds12);
    org.joda.time.LocalDateTime localDateTime15 = localDateTime13.withWeekyear(1034);
    java.util.Locale locale17 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str18 = localDateTime13.toString("Property[secondOfMinute]", locale17);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime15);

  }

  @Test
  public void test260() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test260"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Instant instant5 = new org.joda.time.Instant((java.lang.Object)property4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);

  }

  @Test
  public void test261() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test261"); }

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
    int i15 = yearMonthDay1.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 3);

  }

  @Test
  public void test262() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test262"); }

    org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.days();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType0);

  }

  @Test
  public void test263() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test263"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    java.lang.String str3 = copticChronology2.toString();
    org.joda.time.TimeOfDay timeOfDay4 = org.joda.time.TimeOfDay.fromMillisOfDay(0L, (org.joda.time.Chronology)copticChronology2);
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
    int i24 = timeOfDay4.indexOf(dateTimeFieldType22);
    org.joda.time.ReadableInstant readableInstant25 = null;
    org.joda.time.ReadableDuration readableDuration26 = null;
    org.joda.time.MutablePeriod mutablePeriod27 = new org.joda.time.MutablePeriod(readableInstant25, readableDuration26);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter28 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology29 = null;
    org.joda.time.MutableDateTime mutableDateTime30 = new org.joda.time.MutableDateTime(chronology29);
    int i33 = dateTimeFormatter28.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime30, "secondOfMinute", 100);
    org.joda.time.DateTimeZone dateTimeZone34 = null;
    org.joda.time.DateMidnight dateMidnight35 = new org.joda.time.DateMidnight(dateTimeZone34);
    long long36 = dateMidnight35.getMillis();
    org.joda.time.DateMidnight dateMidnight38 = dateMidnight35.plusDays(24);
    mutablePeriod27.setPeriod((org.joda.time.ReadableInstant)mutableDateTime30, (org.joda.time.ReadableInstant)dateMidnight38);
    org.joda.time.DateTimeZone dateTimeZone41 = null;
    org.joda.time.chrono.CopticChronology copticChronology42 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone41);
    java.lang.String str43 = copticChronology42.toString();
    mutablePeriod27.setPeriod(0L, (org.joda.time.Chronology)copticChronology42);
    org.joda.time.DurationField durationField45 = copticChronology42.hours();
    org.joda.time.TimeOfDay timeOfDay46 = timeOfDay4.withChronologyRetainFields((org.joda.time.Chronology)copticChronology42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str3 + "' != '" + "CopticChronology[UTC]"+ "'", str3.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i17 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i33 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str43 + "' != '" + "CopticChronology[UTC]"+ "'", str43.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay46);

  }

  @Test
  public void test264() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test264"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Minutes minutes1 = org.joda.time.Minutes.parseMinutes("26");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test265() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test265"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDateTimeNoMillis();
    java.lang.Integer i2 = dateTimeFormatter1.getPivotYear();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.parse("32", dateTimeFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i2);

  }

  @Test
  public void test266() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test266"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Hours hours7 = period4.toStandardHours();
    int i8 = period4.getHours();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test267() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test267"); }

    org.joda.time.YearMonth yearMonth0 = org.joda.time.YearMonth.now();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth0);

  }

  @Test
  public void test268() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test268"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
    int i8 = dateMidnight7.getDayOfWeek();
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology12 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology4, (org.joda.time.ReadableDateTime)dateMidnight7, (org.joda.time.ReadableDateTime)mutableDateTime10);
    // The following exception was thrown during execution in test generation
    try {
    long long18 = limitChronology12.getDateTimeMillis(1496646000000L, 12, 33, (int)(short)0, 1969);
      org.junit.Assert.fail("Expected exception of type org.joda.time.chrono.LimitChronology.LimitException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(limitChronology12);

  }

  @Test
  public void test269() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test269"); }

    int i0 = org.joda.time.DateTimeConstants.TUESDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 2);

  }

  @Test
  public void test270() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test270"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    mutablePeriod2.addHours(32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);

  }

  @Test
  public void test271() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test271"); }

    org.joda.time.Months months1 = org.joda.time.Months.months(1969);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months1);

  }

  @Test
  public void test272() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test272"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    org.joda.time.Period period11 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType12 = null;
    org.joda.time.Period period13 = period11.withPeriodType(periodType12);
    mutablePeriod2.add((org.joda.time.ReadablePeriod)period13);
    mutablePeriod2.setMinutes(330);
    mutablePeriod2.add((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period13);

  }

  @Test
  public void test273() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test273"); }

    int i0 = org.joda.time.DateTimeConstants.AM;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test274() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test274"); }

    org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
    org.joda.time.Weeks weeks2 = weeks0.minus((-1));
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Hours hours3 = org.joda.time.Hours.standardHoursIn((org.joda.time.ReadablePeriod)weeks0);
      org.junit.Assert.fail("Expected exception of type java.lang.ArithmeticException");
    } catch (java.lang.ArithmeticException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks2);

  }

  @Test
  public void test275() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test275"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setYears(345);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test276() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test276"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.minusYears(345);
    org.joda.time.LocalDateTime localDateTime6 = localDateTime2.withDayOfYear(2);
    int i7 = localDateTime6.getYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);

  }

  @Test
  public void test277() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test277"); }

    int i1 = org.joda.time.format.FormatUtils.calculateDigitCount((long)(short)0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 1);

  }

  @Test
  public void test278() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test278"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfSecond();
    org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTime dateTime7 = dateTime5.minusSeconds((int)' ');
    org.joda.time.DateTime.Property property8 = dateTime7.secondOfDay();
    org.joda.time.DateTime dateTime9 = property8.roundCeilingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);

  }

  @Test
  public void test279() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test279"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    org.joda.time.DateTime dateTime9 = property7.addToCopy(0);
    boolean b11 = dateTime9.isEqual((long)2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);

  }

  @Test
  public void test280() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test280"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
    java.util.Locale locale8 = null;
    org.joda.time.DateTime dateTime9 = property6.setCopy("26", locale8);
    org.joda.time.DateTime dateTime11 = dateTime9.withWeekyear(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime11);

  }

  @Test
  public void test281() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test281"); }

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
    org.joda.time.DateTimeZone dateTimeZone13 = null;
    org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone13);
    org.joda.time.Duration duration17 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight18 = dateMidnight14.minus((org.joda.time.ReadableDuration)duration17);
    org.joda.time.DateTime dateTime19 = dateTime9.plus((org.joda.time.ReadableDuration)duration17);
    org.joda.time.DateTime dateTime21 = dateTime19.withMillisOfSecond(3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime21);

  }

  @Test
  public void test282() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test282"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
    mutableDateTime1.addMinutes((int)(byte)1);
    org.joda.time.ReadableInstant readableInstant5 = null;
    org.joda.time.ReadableDuration readableDuration6 = null;
    org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
    org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod7.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology9);
    mutableDateTime1.setChronology((org.joda.time.Chronology)gregorianChronology9);
    // The following exception was thrown during execution in test generation
    try {
    long long16 = gregorianChronology9.getDateTimeMillis(330, (int)(short)1, (-101), 1034);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology9);

  }

  @Test
  public void test283() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test283"); }

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
    org.joda.time.DateTimeZone dateTimeZone18 = null;
    org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(dateTimeZone18);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array20 = timeOfDay19.getFieldTypes();
    boolean b21 = period4.equals((java.lang.Object)dateTimeFieldType_array20);
    int i22 = period4.getMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 0);

  }

  @Test
  public void test284() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test284"); }

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
    org.joda.time.DateTimeZone dateTimeZone13 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology14 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone13);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime15 = new org.joda.time.LocalDateTime((java.lang.Object)interval4, (org.joda.time.Chronology)iSOChronology14);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertNotNull(seconds12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology14);

  }

  @Test
  public void test285() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test285"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecond();
    java.lang.Appendable appendable1 = null;
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
    org.joda.time.ReadableInstant readableInstant5 = null;
    boolean b6 = mutableDateTime3.isEqual(readableInstant5);
    // The following exception was thrown during execution in test generation
    try {
    dateTimeFormatter0.printTo(appendable1, readableInstant5);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);

  }

  @Test
  public void test286() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test286"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.LocalDateTime localDateTime5 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime7 = localDateTime5.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property8 = localDateTime5.dayOfMonth();
    org.joda.time.Interval interval9 = property8.toInterval();
    boolean b10 = interval4.isAfter((org.joda.time.ReadableInterval)interval9);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Duration duration11 = new org.joda.time.Duration((java.lang.Object)b10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
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
    org.junit.Assert.assertTrue(b10 == false);

  }

  @Test
  public void test287() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test287"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    int i6 = mutablePeriod2.getWeeks();
    mutablePeriod2.setMonths(100);
    org.joda.time.Period period9 = mutablePeriod2.toPeriod();
    int i10 = period9.getYears();
    org.joda.time.Period period12 = period9.plusSeconds(33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period12);

  }

  @Test
  public void test288() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test288"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((java.lang.Object)(-97), dateTimeZone4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);

  }

  @Test
  public void test289() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test289"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    java.lang.String str5 = copticChronology4.toString();
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
    org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone6);
    org.joda.time.Chronology chronology9 = copticChronology4.withZone(dateTimeZone6);
    org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime(dateTimeZone6);
    java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant)mutableDateTime2);
    long long13 = dateTimeFormatter0.parseMillis("2017-06-06T03:56:40.817");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CopticChronology[UTC]"+ "'", str5.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2017-06-06T03:56:46.030"+ "'", str11.equals("2017-06-06T03:56:46.030"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long13 == 1496721400817L);

  }

  @Test
  public void test290() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test290"); }

    org.joda.time.Months months0 = org.joda.time.Months.FOUR;
    org.joda.time.PeriodType periodType1 = months0.getPeriodType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType1);

  }

  @Test
  public void test291() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test291"); }

    int i0 = org.joda.time.DateTimeConstants.MARCH;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test292() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test292"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.Duration duration7 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.Duration duration10 = duration7.withDurationAdded((long)28, (int)' ');
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
    org.joda.time.DateMidnight.Property property13 = dateMidnight12.centuryOfEra();
    org.joda.time.PeriodType periodType14 = null;
    org.joda.time.MutablePeriod mutablePeriod15 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration10, (org.joda.time.ReadableInstant)dateMidnight12, periodType14);
    org.joda.time.DateTime dateTime17 = dateTime4.withDurationAdded((org.joda.time.ReadableDuration)duration10, 5);
    org.joda.time.DateTime dateTime19 = dateTime4.withCenturyOfEra(784);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime21 = dateTime19.withEra((int)' ');
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime19);

  }

  @Test
  public void test293() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test293"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime3 = new org.joda.time.LocalTime(1970, 7, 4);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test294() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test294"); }

    org.joda.time.Minutes minutes0 = org.joda.time.Minutes.ONE;
    org.joda.time.format.DateTimeFormatter dateTimeFormatter2 = org.joda.time.format.ISODateTimeFormat.hourMinuteSecond();
    org.joda.time.ReadableInstant readableInstant3 = null;
    org.joda.time.ReadableDuration readableDuration4 = null;
    org.joda.time.MutablePeriod mutablePeriod5 = new org.joda.time.MutablePeriod(readableInstant3, readableDuration4);
    org.joda.time.ReadableDuration readableDuration6 = null;
    org.joda.time.Chronology chronology7 = null;
    org.joda.time.MutableDateTime mutableDateTime8 = new org.joda.time.MutableDateTime(chronology7);
    org.joda.time.PeriodType periodType9 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod11 = new org.joda.time.MutablePeriod((java.lang.Object)chronology7, periodType9, (org.joda.time.Chronology)gregorianChronology10);
    mutablePeriod5.setPeriod(readableDuration6, chronology7);
    org.joda.time.DateTimeZone dateTimeZone14 = null;
    org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
    org.joda.time.DurationField durationField16 = copticChronology15.days();
    org.joda.time.MutableDateTime mutableDateTime17 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology15);
    org.joda.time.DateTimeField dateTimeField18 = copticChronology15.millisOfSecond();
    mutablePeriod5.setPeriod((long)(short)1, (org.joda.time.Chronology)copticChronology15);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter20 = dateTimeFormatter2.withChronology((org.joda.time.Chronology)copticChronology15);
    org.joda.time.LocalTime localTime21 = new org.joda.time.LocalTime((long)(short)-1, (org.joda.time.Chronology)copticChronology15);
    org.joda.time.MutablePeriod mutablePeriod22 = new org.joda.time.MutablePeriod((java.lang.Object)minutes0, (org.joda.time.Chronology)copticChronology15);
    int i23 = minutes0.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i23 == 1);

  }

  @Test
  public void test295() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test295"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(dateTimeZone5);
    boolean b7 = timeOfDay1.isBefore((org.joda.time.ReadablePartial)timeOfDay6);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter8 = org.joda.time.format.ISODateTimeFormat.dateElementParser();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = timeOfDay6.toString(dateTimeFormatter8);
      org.junit.Assert.fail("Expected exception of type java.lang.UnsupportedOperationException");
    } catch (java.lang.UnsupportedOperationException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter8);

  }

  @Test
  public void test296() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test296"); }

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
    org.joda.time.Seconds seconds21 = org.joda.time.Seconds.TWO;
    org.joda.time.Partial partial22 = partial20.plus((org.joda.time.ReadablePeriod)seconds21);
    org.joda.time.Seconds seconds24 = seconds21.minus(6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(partial22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds24);

  }

  @Test
  public void test297() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test297"); }

    org.joda.time.DateMidnight dateMidnight0 = new org.joda.time.DateMidnight();

  }

  @Test
  public void test298() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test298"); }

    org.joda.time.tz.Provider provider0 = org.joda.time.DateTimeZone.getProvider();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(provider0);

  }

  @Test
  public void test299() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test299"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfSecond();
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.forOffsetHours(1);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((java.lang.Object)copticChronology1, dateTimeZone6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);

  }

  @Test
  public void test300() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test300"); }

    org.joda.time.Weeks weeks0 = org.joda.time.Weeks.MIN_VALUE;
    org.joda.time.Weeks weeks2 = weeks0.plus(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks2);

  }

  @Test
  public void test301() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test301"); }

    int i0 = org.joda.time.chrono.BuddhistChronology.BE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 1);

  }

  @Test
  public void test302() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test302"); }

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
    org.joda.time.LocalTime localTime20 = new org.joda.time.LocalTime((long)(short)-1, (org.joda.time.Chronology)copticChronology14);
    java.util.Locale locale22 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str23 = localTime20.toString("T03:56:36", locale22);
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
  public void test303() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test303"); }

    int i0 = org.joda.time.DateTimeConstants.SUNDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 7);

  }

  @Test
  public void test304() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test304"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    int i4 = mutableDateTime3.getEra();
    org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.weekOfWeekyear();
    org.joda.time.MutableDateTime.Property property6 = mutableDateTime3.weekyear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);

  }

  @Test
  public void test305() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test305"); }

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
    mutablePeriod2.addDays(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval13);

  }

  @Test
  public void test306() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test306"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    org.joda.time.TimeOfDay.Property property5 = timeOfDay1.millisOfSecond();
    org.joda.time.ReadablePeriod readablePeriod6 = null;
    org.joda.time.TimeOfDay timeOfDay8 = timeOfDay1.withPeriodAdded(readablePeriod6, 330);
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period11 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology10);
    org.joda.time.DateTimeZone dateTimeZone12 = gregorianChronology10.getZone();
    org.joda.time.DateTime dateTime13 = timeOfDay1.toDateTimeToday(dateTimeZone12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);

  }

  @Test
  public void test307() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test307"); }

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
    org.joda.time.chrono.EthiopicChronology ethiopicChronology11 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5, (int)(byte)1);
    org.joda.time.Chronology chronology12 = ethiopicChronology11.withUTC();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CopticChronology[UTC]"+ "'", str4.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ethiopicChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology12);

  }

  @Test
  public void test308() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test308"); }

    org.joda.time.YearMonth yearMonth1 = org.joda.time.YearMonth.parse("1969-12-31");
    int i2 = yearMonth1.size();
    org.joda.time.YearMonth yearMonth4 = yearMonth1.minusYears((int)'a');
    int i5 = yearMonth4.getMonthOfYear();
    java.util.Locale locale7 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str8 = yearMonth4.toString("T03:56:41", locale7);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 12);

  }

  @Test
  public void test309() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test309"); }

    int i0 = org.joda.time.DateTimeConstants.DECEMBER;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 12);

  }

  @Test
  public void test310() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test310"); }

    org.joda.time.PeriodType periodType0 = org.joda.time.PeriodType.yearMonthDayTime();
    org.joda.time.PeriodType periodType1 = periodType0.withMillisRemoved();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType1);

  }

  @Test
  public void test311() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test311"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
    int i1 = dateTimeFormatter0.getDefaultYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2000);

  }

  @Test
  public void test312() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test312"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.EthiopicChronology ethiopicChronology13 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone5, 298);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CopticChronology[UTC]"+ "'", str4.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "UTC"+ "'", str11.equals("UTC"));

  }

  @Test
  public void test313() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test313"); }

    long long0 = org.joda.time.DateTimeUtils.currentTimeMillis();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long0 == 1496721408649L);

  }

  @Test
  public void test314() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test314"); }

    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.chrono.CopticChronology copticChronology6 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone5);
    org.joda.time.DurationField durationField7 = copticChronology6.days();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((int)(byte)100, (int)'#', 535, 7, 0, (org.joda.time.Chronology)copticChronology6);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField7);

  }

  @Test
  public void test315() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test315"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekyear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test316() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test316"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
    org.joda.time.DateTimeZone dateTimeZone8 = cachedDateTimeZone7.getUncachedZone();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.GregorianChronology gregorianChronology10 = org.joda.time.chrono.GregorianChronology.getInstance((org.joda.time.DateTimeZone)cachedDateTimeZone7, 0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedDateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);

  }

  @Test
  public void test317() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test317"); }

    org.joda.time.DateTimeZone dateTimeZone1 = org.joda.time.DateTimeZone.UTC;
    boolean b3 = dateTimeZone1.isStandardOffset((long)843);
    org.joda.time.LocalDate localDate4 = new org.joda.time.LocalDate(0L, dateTimeZone1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b3 == true);

  }

  @Test
  public void test318() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test318"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.year();
    org.joda.time.YearMonthDay yearMonthDay4 = property2.addWrapFieldToCopy(0);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonthDay yearMonthDay6 = yearMonthDay4.withMonthOfYear(0);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay4);

  }

  @Test
  public void test319() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test319"); }

    org.joda.time.Days days0 = org.joda.time.Days.SEVEN;
    org.joda.time.Days days2 = days0.multipliedBy((int)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(days0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(days2);

  }

  @Test
  public void test320() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test320"); }

    org.joda.time.DateTime dateTime1 = new org.joda.time.DateTime((long)'#');
    org.joda.time.ReadableInstant readableInstant2 = null;
    org.joda.time.ReadableDuration readableDuration3 = null;
    org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(readableInstant2, readableDuration3);
    org.joda.time.chrono.GregorianChronology gregorianChronology6 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod4.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology6);
    mutablePeriod4.addMillis((int)(byte)1);
    int i10 = mutablePeriod4.getMonths();
    org.joda.time.DurationFieldType[] durationFieldType_array11 = mutablePeriod4.getFieldTypes();
    org.joda.time.DateTime dateTime12 = dateTime1.plus((org.joda.time.ReadablePeriod)mutablePeriod4);
    org.joda.time.DateTime dateTime14 = dateTime12.withMinuteOfHour(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationFieldType_array11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime14);

  }

  @Test
  public void test321() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test321"); }

    org.joda.time.MutableDateTime mutableDateTime0 = org.joda.time.MutableDateTime.now();
    int i1 = mutableDateTime0.getWeekyear();
    java.lang.Object obj2 = mutableDateTime0.clone();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 2017);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj2);

  }

  @Test
  public void test322() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test322"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
    int i9 = cachedDateTimeZone7.getOffset((long)(byte)100);
    org.joda.time.DateTimeZone dateTimeZone10 = cachedDateTimeZone7.getUncachedZone();
    java.util.Locale locale12 = null;
    java.lang.String str13 = dateTimeZone10.getShortName((long)42, locale12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedDateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str13 + "' != '" + "UTC"+ "'", str13.equals("UTC"));

  }

  @Test
  public void test323() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test323"); }

    org.joda.time.Months months0 = org.joda.time.Months.SIX;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);

  }

  @Test
  public void test324() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test324"); }

    org.joda.time.chrono.JulianChronology julianChronology0 = org.joda.time.chrono.JulianChronology.getInstance();
    org.joda.time.DateTimeZone dateTimeZone1 = julianChronology0.getZone();
    java.util.Locale locale3 = null;
    java.lang.String str4 = dateTimeZone1.getName((-1L), locale3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(julianChronology0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "Coordinated Universal Time"+ "'", str4.equals("Coordinated Universal Time"));

  }

  @Test
  public void test325() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test325"); }

    java.util.Date date0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.fromDateFields(date0);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test326() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test326"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    java.util.GregorianCalendar gregorianCalendar2 = mutableDateTime1.toGregorianCalendar();
    org.joda.time.LocalTime localTime3 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar2);
    org.joda.time.DateTimeFieldType dateTimeFieldType4 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime.Property property5 = localTime3.property(dateTimeFieldType4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime3);

  }

  @Test
  public void test327() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test327"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.DateTime.Property property7 = dateTime6.yearOfCentury();
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str9 = dateTime6.toString("hi!");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);

  }

  @Test
  public void test328() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test328"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    org.joda.time.DurationField durationField5 = copticChronology4.days();
    boolean b6 = org.joda.time.field.FieldUtils.equals((java.lang.Object)localDateTime2, (java.lang.Object)durationField5);
    int i7 = localDateTime2.getWeekyear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 1970);

  }

  @Test
  public void test329() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test329"); }

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
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.TimeOfDay timeOfDay17 = new org.joda.time.TimeOfDay(dateTimeZone16);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array18 = timeOfDay17.getFieldTypes();
    int i19 = timeOfDay17.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay21 = timeOfDay17.plusSeconds((int)(byte)1);
    int i22 = timeOfDay21.getSecondOfMinute();
    org.joda.time.Chronology chronology23 = null;
    org.joda.time.MutableDateTime mutableDateTime24 = new org.joda.time.MutableDateTime(chronology23);
    java.util.GregorianCalendar gregorianCalendar25 = mutableDateTime24.toGregorianCalendar();
    org.joda.time.LocalTime localTime26 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar25);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter27 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
    java.lang.String str28 = localTime26.toString(dateTimeFormatter27);
    boolean b29 = timeOfDay21.isBefore((org.joda.time.ReadablePartial)localTime26);
    // The following exception was thrown during execution in test generation
    try {
    boolean b30 = localDateTime12.isEqual((org.joda.time.ReadablePartial)localTime26);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 577);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i22 == 51);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str28 + "' != '" + "T03:56:50"+ "'", str28.equals("T03:56:50"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == false);

  }

  @Test
  public void test330() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test330"); }

    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((int)(short)0, 7);

  }

  @Test
  public void test331() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test331"); }

    org.joda.time.Duration duration1 = org.joda.time.Duration.standardDays((long)'#');
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration1);

  }

  @Test
  public void test332() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test332"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    java.util.Locale locale4 = null;
    java.lang.String str5 = property3.getAsText(locale4);
    org.joda.time.LocalDateTime localDateTime6 = property3.roundHalfFloorCopy();
    java.lang.String str7 = localDateTime6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "6"+ "'", str5.equals("6"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "2017-06-06T00:00:00.000"+ "'", str7.equals("2017-06-06T00:00:00.000"));

  }

  @Test
  public void test333() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test333"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.Partial partial1 = new org.joda.time.Partial(chronology0);
    org.joda.time.Duration duration4 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateTimeZone dateTimeZone5 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology6 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone5);
    int i8 = dateTimeZone5.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime9 = org.joda.time.DateTime.now(dateTimeZone5);
    org.joda.time.MutablePeriod mutablePeriod10 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration4, (org.joda.time.ReadableInstant)dateTime9);
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.YearMonthDay yearMonthDay12 = new org.joda.time.YearMonthDay(dateTimeZone11);
    org.joda.time.DateMidnight dateMidnight13 = yearMonthDay12.toDateMidnight();
    org.joda.time.YearMonthDay.Property property14 = yearMonthDay12.dayOfMonth();
    org.joda.time.DateTimeFieldType dateTimeFieldType15 = property14.getFieldType();
    org.joda.time.DateTime.Property property16 = dateTime9.property(dateTimeFieldType15);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Partial.Property property17 = partial1.property(dateTimeFieldType15);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property16);

  }

  @Test
  public void test334() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test334"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.fullDate();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    int i5 = dateTimeFormatter0.parseInto((org.joda.time.ReadWritableInstant)mutableDateTime2, "secondOfMinute", 100);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDate localDate7 = dateTimeFormatter0.parseLocalDate("26");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == (-101));

  }

  @Test
  public void test335() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test335"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period5 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = gregorianChronology4.getZone();
    org.joda.time.YearMonthDay yearMonthDay7 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeField dateTimeField8 = gregorianChronology4.dayOfWeek();
    org.joda.time.DateTimeField dateTimeField9 = org.joda.time.field.StrictDateTimeField.getInstance(dateTimeField8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField9);

  }

  @Test
  public void test336() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test336"); }

    org.joda.time.Duration duration2 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateTimeZone dateTimeZone3 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology4 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone3);
    int i6 = dateTimeZone3.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime7 = org.joda.time.DateTime.now(dateTimeZone3);
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((org.joda.time.ReadableDuration)duration2, (org.joda.time.ReadableInstant)dateTime7);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.YearMonthDay yearMonthDay10 = new org.joda.time.YearMonthDay(dateTimeZone9);
    org.joda.time.DateMidnight dateMidnight11 = yearMonthDay10.toDateMidnight();
    org.joda.time.YearMonthDay.Property property12 = yearMonthDay10.dayOfMonth();
    org.joda.time.DateTimeFieldType dateTimeFieldType13 = property12.getFieldType();
    org.joda.time.DateTime.Property property14 = dateTime7.property(dateTimeFieldType13);
    org.joda.time.Chronology chronology15 = null;
    org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
    org.joda.time.PeriodType periodType17 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology18 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod19 = new org.joda.time.MutablePeriod((java.lang.Object)chronology15, periodType17, (org.joda.time.Chronology)gregorianChronology18);
    org.joda.time.DateTimeField dateTimeField20 = gregorianChronology18.hourOfDay();
    org.joda.time.DurationField durationField21 = gregorianChronology18.minutes();
    org.joda.time.chrono.GregorianChronology gregorianChronology22 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.DurationField durationField23 = gregorianChronology22.centuries();
    long long26 = durationField23.subtract((long)1970, 235);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.PreciseDateTimeField preciseDateTimeField27 = new org.joda.time.field.PreciseDateTimeField(dateTimeFieldType13, durationField21, durationField23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long26 == (-741588307198030L));

  }

  @Test
  public void test337() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test337"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Period period6 = interval4.toPeriod();
    org.joda.time.Duration duration9 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateTimeZone dateTimeZone10 = null;
    org.joda.time.DateMidnight dateMidnight11 = new org.joda.time.DateMidnight(dateTimeZone10);
    org.joda.time.DateMidnight.Property property12 = dateMidnight11.centuryOfEra();
    org.joda.time.DateMidnight.Property property13 = dateMidnight11.dayOfYear();
    org.joda.time.DateMidnight dateMidnight14 = property13.roundHalfFloorCopy();
    org.joda.time.PeriodType periodType15 = null;
    org.joda.time.Period period16 = duration9.toPeriodFrom((org.joda.time.ReadableInstant)dateMidnight14, periodType15);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Interval interval17 = interval4.withDurationAfterStart((org.joda.time.ReadableDuration)duration9);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period16);

  }

  @Test
  public void test338() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test338"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    org.joda.time.DateTimeField dateTimeField4 = copticChronology1.millisOfSecond();
    org.joda.time.DateTime dateTime5 = new org.joda.time.DateTime((org.joda.time.Chronology)copticChronology1);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime7 = dateTime5.withDayOfMonth(1000);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField4);

  }

  @Test
  public void test339() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test339"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    java.lang.String str5 = property4.getName();
    org.joda.time.TimeOfDay timeOfDay7 = property4.addWrapFieldToCopy(429);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeFieldType dateTimeFieldType9 = timeOfDay7.getFieldType((int)(short)10);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "secondOfMinute"+ "'", str5.equals("secondOfMinute"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay7);

  }

  @Test
  public void test340() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test340"); }

    org.joda.time.chrono.ISOChronology iSOChronology0 = org.joda.time.chrono.ISOChronology.getInstance();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology0);

  }

  @Test
  public void test341() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test341"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period2 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology1);
    org.joda.time.Weeks weeks3 = org.joda.time.Weeks.standardWeeksIn((org.joda.time.ReadablePeriod)period2);
    org.joda.time.Period period5 = period2.plusHours(32);
    int i6 = period2.getMinutes();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);

  }

  @Test
  public void test342() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test342"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    java.lang.String str2 = copticChronology1.toString();
    // The following exception was thrown during execution in test generation
    try {
    long long10 = copticChronology1.getDateTimeMillis(365, 1, 8, 42, 3, 345, 6);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "CopticChronology[UTC]"+ "'", str2.equals("CopticChronology[UTC]"));

  }

  @Test
  public void test343() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test343"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight dateMidnight4 = property2.addWrapFieldToCopy((int)(short)100);
    org.joda.time.DateMidnight dateMidnight5 = property2.withMinimumValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight5);

  }

  @Test
  public void test344() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test344"); }

    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_16_BASED;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType0);

  }

  @Test
  public void test345() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test345"); }

    org.joda.time.chrono.EthiopicChronology ethiopicChronology1 = org.joda.time.chrono.EthiopicChronology.getInstance();
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((long)1034, (org.joda.time.Chronology)ethiopicChronology1);
    org.joda.time.YearMonth yearMonth4 = yearMonth2.minusMonths(37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ethiopicChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth4);

  }

  @Test
  public void test346() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test346"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int[] i_array8 = new int[] { 42, 26, 47, 298, 41 };
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Partial partial9 = new org.joda.time.Partial(dateTimeFieldType_array2, i_array8);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(i_array8);

  }

  @Test
  public void test347() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test347"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.longDateTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test348() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test348"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.basicTimeNoMillis();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime2 = org.joda.time.MutableDateTime.parse("2017-06-06T00:00:00.000", dateTimeFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);

  }

  @Test
  public void test349() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test349"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.DateMidnight dateMidnight2 = yearMonthDay1.toDateMidnight();
    org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
    org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays(429);
    org.joda.time.YearMonthDay.Property property6 = yearMonthDay1.monthOfYear();
    int i7 = property6.get();
    java.util.Locale locale9 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.YearMonthDay yearMonthDay10 = property6.setCopy("2017-06-06T03:56:30.090", locale9);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 6);

  }

  @Test
  public void test350() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test350"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)999, dateTimeZone1);
    int i3 = localDateTime2.getMillisOfSecond();
    org.joda.time.LocalDateTime.Property property4 = localDateTime2.yearOfCentury();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 999);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);

  }

  @Test
  public void test351() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test351"); }

    org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateWithWeeks();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone3);
    org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone7);
    boolean b9 = localDateTime4.isAfter((org.joda.time.ReadablePartial)localDateTime8);
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone11);
    org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
    org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime4, (org.joda.time.ReadablePartial)localDateTime14, periodType16);
    org.joda.time.PeriodType periodType18 = periodType16.withSecondsRemoved();
    org.joda.time.PeriodType periodType19 = org.joda.time.DateTimeUtils.getPeriodType(periodType18);
    org.joda.time.Chronology chronology20 = null;
    org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
    org.joda.time.PeriodType periodType22 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object)chronology20, periodType22, (org.joda.time.Chronology)gregorianChronology23);
    org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.hourOfDay();
    org.joda.time.DurationField durationField26 = gregorianChronology23.minutes();
    org.joda.time.Period period27 = new org.joda.time.Period((long)37, periodType18, (org.joda.time.Chronology)gregorianChronology23);
    org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter0.withParseType(periodType18);
    boolean b29 = periodFormatter28.isPrinter();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b29 == true);

  }

  @Test
  public void test352() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test352"); }

    int i0 = org.joda.time.DateTimeConstants.BC;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 0);

  }

  @Test
  public void test353() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test353"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Years years5 = org.joda.time.Years.years(0);
    org.joda.time.Years years7 = years5.minus((int)(byte)-1);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)years7);
    org.joda.time.Years years10 = years7.dividedBy((int)(byte)100);
    org.joda.time.DurationFieldType durationFieldType11 = years10.getFieldType();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((java.lang.Object)years10);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationFieldType11);

  }

  @Test
  public void test354() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test354"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Years years5 = org.joda.time.Years.years(0);
    org.joda.time.Years years7 = years5.minus((int)(byte)-1);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)years7);
    org.joda.time.LocalDateTime localDateTime10 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime12 = localDateTime10.plusDays((-1));
    org.joda.time.Chronology chronology13 = localDateTime12.getChronology();
    java.util.Locale locale14 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket15 = new org.joda.time.format.DateTimeParserBucket((long)345, chronology13, locale14);
    mutableInterval3.setChronology(chronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology13);

  }

  @Test
  public void test355() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test355"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight dateMidnight4 = property2.addWrapFieldToCopy((int)(short)100);
    org.joda.time.DateMidnight.Property property5 = dateMidnight4.dayOfYear();
    org.joda.time.DateMidnight dateMidnight6 = property5.withMaximumValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight6);

  }

  @Test
  public void test356() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test356"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.PeriodType periodType2 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object)chronology0, periodType2, (org.joda.time.Chronology)gregorianChronology3);
    mutablePeriod4.setYears((int)(byte)1);
    mutablePeriod4.clear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology3);

  }

  @Test
  public void test357() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test357"); }

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
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
    java.lang.String str18 = copticChronology17.toString();
    mutablePeriod2.setPeriod(0L, (org.joda.time.Chronology)copticChronology17);
    org.joda.time.Period period20 = mutablePeriod2.toPeriod();
    org.joda.time.Period period21 = period20.toPeriod();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "CopticChronology[UTC]"+ "'", str18.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period21);

  }

  @Test
  public void test358() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test358"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(dateTimeZone5);
    boolean b7 = timeOfDay1.isBefore((org.joda.time.ReadablePartial)timeOfDay6);
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(dateTimeZone8);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array10 = timeOfDay9.getFieldTypes();
    int i11 = timeOfDay9.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay13 = timeOfDay9.plusSeconds((int)(byte)1);
    int i14 = timeOfDay13.getSecondOfMinute();
    org.joda.time.Chronology chronology15 = null;
    org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
    java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
    org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar17);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
    java.lang.String str20 = localTime18.toString(dateTimeFormatter19);
    boolean b21 = timeOfDay13.isBefore((org.joda.time.ReadablePartial)localTime18);
    org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
    int i25 = dateTimeZone22.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone22);
    org.joda.time.DateTime dateTime28 = dateTime26.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property29 = dateTime26.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone31);
    int i34 = dateTimeZone31.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone31);
    org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property38 = dateTime35.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator40 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType30, dateTimeFieldType39);
    org.joda.time.DateTimeZone dateTimeZone41 = null;
    org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(dateTimeZone41);
    org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property45 = timeOfDay42.secondOfMinute();
    org.joda.time.TimeOfDay.Property property46 = timeOfDay42.millisOfSecond();
    java.util.Locale locale47 = null;
    int i48 = property46.getMaximumTextLength(locale47);
    org.joda.time.DateTimeFieldType dateTimeFieldType49 = property46.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator50 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType39, dateTimeFieldType49);
    boolean b51 = localTime18.isSupported(dateTimeFieldType39);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay53 = timeOfDay6.withField(dateTimeFieldType39, 33);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 566);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 52);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "T03:56:51"+ "'", str20.equals("T03:56:51"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test359() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test359"); }

    org.joda.time.MutableInterval mutableInterval2 = new org.joda.time.MutableInterval((long)1, 1L);

  }

  @Test
  public void test360() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test360"); }

    org.joda.time.Months months0 = org.joda.time.Months.ELEVEN;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);

  }

  @Test
  public void test361() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test361"); }

    org.joda.time.Period period4 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType5 = null;
    org.joda.time.Period period6 = period4.withPeriodType(periodType5);
    org.joda.time.Hours hours7 = period4.toStandardHours();
    org.joda.time.Duration duration8 = hours7.toStandardDuration();
    org.joda.time.ReadableInterval readableInterval9 = null;
    org.joda.time.Hours hours10 = org.joda.time.Hours.hoursIn(readableInterval9);
    org.joda.time.Hours hours12 = hours10.minus(32);
    org.joda.time.Hours hours13 = hours7.plus(hours12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours13);

  }

  @Test
  public void test362() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test362"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight dateMidnight4 = property2.addWrapFieldToCopy((int)(short)100);
    org.joda.time.Interval interval5 = property2.toInterval();
    org.joda.time.DateTimeField dateTimeField6 = property2.getField();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField6);

  }

  @Test
  public void test363() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test363"); }

    org.joda.time.Chronology chronology1 = null;
    java.util.Locale locale2 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology1, locale2, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket5.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket5.setZone(dateTimeZone8);
    long long12 = dateTimeZone8.adjustOffset(3600000L, true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 3600000L);

  }

  @Test
  public void test364() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test364"); }

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
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
    java.lang.String str18 = copticChronology17.toString();
    mutablePeriod2.setPeriod(0L, (org.joda.time.Chronology)copticChronology17);
    org.joda.time.Period period20 = mutablePeriod2.toPeriod();
    int i21 = mutablePeriod2.getMonths();
    mutablePeriod2.addHours(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "CopticChronology[UTC]"+ "'", str18.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);

  }

  @Test
  public void test365() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test365"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.ReadableDuration readableDuration3 = null;
    org.joda.time.Chronology chronology4 = null;
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime(chronology4);
    org.joda.time.PeriodType periodType6 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((java.lang.Object)chronology4, periodType6, (org.joda.time.Chronology)gregorianChronology7);
    mutablePeriod2.setPeriod(readableDuration3, chronology4);
    mutablePeriod2.setDays(70);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology7);

  }

  @Test
  public void test366() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test366"); }

    org.joda.time.chrono.IslamicChronology.LeapYearPatternType leapYearPatternType0 = org.joda.time.chrono.IslamicChronology.LEAP_YEAR_HABASH_AL_HASIB;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(leapYearPatternType0);

  }

  @Test
  public void test367() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test367"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime24 = property20.setCopy("1970-01-01");
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime22);

  }

  @Test
  public void test368() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test368"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay3 = new org.joda.time.TimeOfDay((java.lang.Object)mutablePeriod2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test369() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test369"); }

    org.joda.time.field.FieldUtils.verifyValueBounds("1970-01-01", 32, 32, 2000);

  }

  @Test
  public void test370() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test370"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(784, 24);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test371() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test371"); }

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
    mutablePeriod2.setMonths(5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(days15);

  }

  @Test
  public void test372() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test372"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.DateMidnight.Property property2 = dateMidnight1.centuryOfEra();
    org.joda.time.DateMidnight dateMidnight4 = property2.addWrapFieldToCopy((int)(short)100);
    org.joda.time.DateMidnight dateMidnight6 = dateMidnight4.withDayOfYear(28);
    int i7 = dateMidnight4.getDayOfYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 157);

  }

  @Test
  public void test373() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test373"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
    org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.dayOfYear();
    org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int)(byte)10);
    java.util.Locale locale7 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime8 = property3.set("T03:56:36", locale7);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime5);

  }

  @Test
  public void test374() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test374"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    java.lang.String str5 = property4.getName();
    org.joda.time.TimeOfDay timeOfDay7 = property4.addWrapFieldToCopy(429);
    org.joda.time.TimeOfDay timeOfDay9 = property4.addToCopy(298);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "secondOfMinute"+ "'", str5.equals("secondOfMinute"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay9);

  }

  @Test
  public void test375() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test375"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.PeriodType periodType2 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object)chronology0, periodType2, (org.joda.time.Chronology)gregorianChronology3);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableDateTime mutableDateTime5 = org.joda.time.MutableDateTime.now(chronology0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology3);

  }

  @Test
  public void test376() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test376"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.weekDate();
    // The following exception was thrown during execution in test generation
    try {
    long long2 = dateTimeFormatter0.parseMillis("2017-06-06T03:56:40.817");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test377() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test377"); }

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
    org.joda.time.DateTimeZone dateTimeZone15 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology16 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone15);
    org.joda.time.YearMonth yearMonth17 = new org.joda.time.YearMonth((long)(byte)0, (org.joda.time.Chronology)iSOChronology16);
    org.joda.time.DateTimeField dateTimeField18 = iSOChronology16.secondOfDay();
    mutablePeriod2.add((long)3, (org.joda.time.Chronology)iSOChronology16);
    org.joda.time.Chronology chronology20 = iSOChronology16.withUTC();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology20);

  }

  @Test
  public void test378() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test378"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTime();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test379() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test379"); }

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
    org.joda.time.LocalTime localTime20 = localTime18.plusSeconds((int)(byte)-1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime20);

  }

  @Test
  public void test380() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test380"); }

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
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
    java.lang.String str18 = copticChronology17.toString();
    mutablePeriod2.setPeriod(0L, (org.joda.time.Chronology)copticChronology17);
    org.joda.time.Period period20 = mutablePeriod2.toPeriod();
    org.joda.time.Period period22 = period20.minusWeeks(770);
    org.joda.time.Period period24 = period22.withHours((int)(short)-1);
    org.joda.time.Period period26 = period24.withMonths((int)(byte)0);
    java.lang.String str27 = period24.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "CopticChronology[UTC]"+ "'", str18.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str27 + "' != '" + "P-770WT-1H"+ "'", str27.equals("P-770WT-1H"));

  }

  @Test
  public void test381() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test381"); }

    org.joda.time.Years years0 = org.joda.time.Years.TWO;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years0);

  }

  @Test
  public void test382() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test382"); }

    org.joda.time.Hours hours1 = org.joda.time.Hours.hours(0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours1);

  }

  @Test
  public void test383() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test383"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int i3 = timeOfDay1.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusSeconds((int)(byte)1);
    int i6 = timeOfDay5.getSecondOfMinute();
    org.joda.time.DateTime dateTime7 = timeOfDay5.toDateTimeToday();
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.TimeOfDay timeOfDay9 = new org.joda.time.TimeOfDay(dateTimeZone8);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array10 = timeOfDay9.getFieldTypes();
    int i11 = timeOfDay9.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay13 = timeOfDay9.plusSeconds((int)(byte)1);
    int i14 = timeOfDay13.getSecondOfMinute();
    org.joda.time.Chronology chronology15 = null;
    org.joda.time.MutableDateTime mutableDateTime16 = new org.joda.time.MutableDateTime(chronology15);
    java.util.GregorianCalendar gregorianCalendar17 = mutableDateTime16.toGregorianCalendar();
    org.joda.time.LocalTime localTime18 = org.joda.time.LocalTime.fromCalendarFields((java.util.Calendar)gregorianCalendar17);
    org.joda.time.format.DateTimeFormatter dateTimeFormatter19 = org.joda.time.format.ISODateTimeFormat.tTimeNoMillis();
    java.lang.String str20 = localTime18.toString(dateTimeFormatter19);
    boolean b21 = timeOfDay13.isBefore((org.joda.time.ReadablePartial)localTime18);
    org.joda.time.DateTimeZone dateTimeZone22 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology23 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone22);
    int i25 = dateTimeZone22.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime26 = org.joda.time.DateTime.now(dateTimeZone22);
    org.joda.time.DateTime dateTime28 = dateTime26.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property29 = dateTime26.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType30 = property29.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone31 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology32 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone31);
    int i34 = dateTimeZone31.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime35 = org.joda.time.DateTime.now(dateTimeZone31);
    org.joda.time.DateTime dateTime37 = dateTime35.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property38 = dateTime35.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType39 = property38.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator40 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType30, dateTimeFieldType39);
    org.joda.time.DateTimeZone dateTimeZone41 = null;
    org.joda.time.TimeOfDay timeOfDay42 = new org.joda.time.TimeOfDay(dateTimeZone41);
    org.joda.time.TimeOfDay timeOfDay44 = timeOfDay42.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property45 = timeOfDay42.secondOfMinute();
    org.joda.time.TimeOfDay.Property property46 = timeOfDay42.millisOfSecond();
    java.util.Locale locale47 = null;
    int i48 = property46.getMaximumTextLength(locale47);
    org.joda.time.DateTimeFieldType dateTimeFieldType49 = property46.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator50 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType39, dateTimeFieldType49);
    boolean b51 = localTime18.isSupported(dateTimeFieldType39);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay53 = timeOfDay5.withField(dateTimeFieldType39, 4);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 471);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 473);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i14 == 54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str20 + "' != '" + "T03:56:53"+ "'", str20.equals("T03:56:53"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b21 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i25 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime37);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay44);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property46);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i48 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType49);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator50);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b51 == true);

  }

  @Test
  public void test384() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test384"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period2 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = gregorianChronology1.getZone();
    org.joda.time.format.DateTimeFormatter dateTimeFormatter4 = org.joda.time.format.ISODateTimeFormat.weekDateTimeNoMillis();
    org.joda.time.format.DateTimeFormatter dateTimeFormatter6 = dateTimeFormatter4.withPivotYear((int)'#');
    org.joda.time.DateTimeZone dateTimeZone7 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology8 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone7);
    int i10 = dateTimeZone7.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime11 = org.joda.time.DateTime.now(dateTimeZone7);
    org.joda.time.DateTime dateTime13 = dateTime11.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property14 = dateTime11.millisOfDay();
    java.lang.String str15 = dateTimeFormatter4.print((org.joda.time.ReadableInstant)dateTime11);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.GJChronology gJChronology17 = org.joda.time.chrono.GJChronology.getInstance(dateTimeZone3, (org.joda.time.ReadableInstant)dateTime11, 42);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str15 + "' != '" + "2017-W23-2T03:56:53Z"+ "'", str15.equals("2017-W23-2T03:56:53Z"));

  }

  @Test
  public void test385() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test385"); }

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
    int i16 = years12.getYears();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 1);

  }

  @Test
  public void test386() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test386"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
    org.joda.time.LocalDate localDate3 = property2.withMinimumValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate3);

  }

  @Test
  public void test387() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test387"); }

    org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateWithWeeks();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone3);
    org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone7);
    boolean b9 = localDateTime4.isAfter((org.joda.time.ReadablePartial)localDateTime8);
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone11);
    org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
    org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime4, (org.joda.time.ReadablePartial)localDateTime14, periodType16);
    org.joda.time.PeriodType periodType18 = periodType16.withSecondsRemoved();
    org.joda.time.PeriodType periodType19 = org.joda.time.DateTimeUtils.getPeriodType(periodType18);
    org.joda.time.Chronology chronology20 = null;
    org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
    org.joda.time.PeriodType periodType22 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object)chronology20, periodType22, (org.joda.time.Chronology)gregorianChronology23);
    org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.hourOfDay();
    org.joda.time.DurationField durationField26 = gregorianChronology23.minutes();
    org.joda.time.Period period27 = new org.joda.time.Period((long)37, periodType18, (org.joda.time.Chronology)gregorianChronology23);
    org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter0.withParseType(periodType18);
    java.util.Locale locale29 = null;
    org.joda.time.format.PeriodFormatter periodFormatter30 = periodFormatter28.withLocale(locale29);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Period period32 = periodFormatter28.parsePeriod("2017-06-06T00:00:00.000");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter30);

  }

  @Test
  public void test388() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test388"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay yearMonthDay3 = yearMonthDay1.plusDays((int)(short)100);
    java.lang.String str4 = yearMonthDay1.toString();
    org.joda.time.YearMonthDay.Property property5 = yearMonthDay1.monthOfYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "2017-06-06"+ "'", str4.equals("2017-06-06"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);

  }

  @Test
  public void test389() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test389"); }

    org.joda.time.format.PeriodFormatter periodFormatter0 = org.joda.time.format.ISOPeriodFormat.alternateWithWeeks();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.LocalDateTime localDateTime4 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone3);
    org.joda.time.LocalDateTime.Property property5 = localDateTime4.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.LocalDateTime localDateTime8 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone7);
    boolean b9 = localDateTime4.isAfter((org.joda.time.ReadablePartial)localDateTime8);
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.LocalDateTime localDateTime12 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone11);
    org.joda.time.LocalDateTime localDateTime14 = localDateTime12.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property15 = localDateTime14.dayOfYear();
    org.joda.time.PeriodType periodType16 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period17 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime4, (org.joda.time.ReadablePartial)localDateTime14, periodType16);
    org.joda.time.PeriodType periodType18 = periodType16.withSecondsRemoved();
    org.joda.time.PeriodType periodType19 = org.joda.time.DateTimeUtils.getPeriodType(periodType18);
    org.joda.time.Chronology chronology20 = null;
    org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
    org.joda.time.PeriodType periodType22 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology23 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod24 = new org.joda.time.MutablePeriod((java.lang.Object)chronology20, periodType22, (org.joda.time.Chronology)gregorianChronology23);
    org.joda.time.DateTimeField dateTimeField25 = gregorianChronology23.hourOfDay();
    org.joda.time.DurationField durationField26 = gregorianChronology23.minutes();
    org.joda.time.Period period27 = new org.joda.time.Period((long)37, periodType18, (org.joda.time.Chronology)gregorianChronology23);
    org.joda.time.format.PeriodFormatter periodFormatter28 = periodFormatter0.withParseType(periodType18);
    java.util.Locale locale29 = periodFormatter0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale29);

  }

  @Test
  public void test390() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test390"); }

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
    org.joda.time.DateTimeField dateTimeField19 = copticChronology13.hourOfHalfday();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField19);

  }

  @Test
  public void test391() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test391"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.LocalTime localTime1 = new org.joda.time.LocalTime((org.joda.time.Chronology)gregorianChronology0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology0);

  }

  @Test
  public void test392() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test392"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology1);
    org.joda.time.YearMonth yearMonth4 = yearMonth2.minusYears((int)'a');
    org.joda.time.YearMonth yearMonth6 = yearMonth2.minusYears((-1));
    org.joda.time.YearMonth yearMonth8 = yearMonth6.withYear((int)' ');
    org.joda.time.YearMonth yearMonth10 = yearMonth8.minusYears(345);
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str12 = yearMonth8.toString("");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth10);

  }

  @Test
  public void test393() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test393"); }

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
    org.joda.time.LocalTime localTime21 = property20.withMaximumValue();
    org.joda.time.Seconds seconds22 = org.joda.time.Seconds.TWO;
    org.joda.time.DurationFieldType durationFieldType23 = seconds22.getFieldType();
    org.joda.time.LocalTime localTime25 = localTime21.withFieldAdded(durationFieldType23, 365);
    int i26 = localTime21.getMinuteOfHour();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationFieldType23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i26 == 0);

  }

  @Test
  public void test394() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test394"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.DateMidnight dateMidnight2 = yearMonthDay1.toDateMidnight();
    org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
    org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.minusDays(429);
    org.joda.time.YearMonthDay.Property property6 = yearMonthDay1.monthOfYear();
    org.joda.time.YearMonthDay yearMonthDay8 = yearMonthDay1.minusYears((int)(short)10);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeFieldType dateTimeFieldType10 = yearMonthDay1.getFieldType(1034);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay8);

  }

  @Test
  public void test395() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test395"); }

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
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.chrono.CopticChronology copticChronology17 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone16);
    java.lang.String str18 = copticChronology17.toString();
    mutablePeriod2.setPeriod(0L, (org.joda.time.Chronology)copticChronology17);
    org.joda.time.Period period20 = mutablePeriod2.toPeriod();
    org.joda.time.Period period22 = period20.minusWeeks(770);
    org.joda.time.Period period24 = period22.withHours((int)(short)-1);
    org.joda.time.Period period26 = period22.plusMinutes(1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str18 + "' != '" + "CopticChronology[UTC]"+ "'", str18.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period26);

  }

  @Test
  public void test396() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test396"); }

    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
    org.joda.time.ReadableInstant readableInstant5 = null;
    boolean b6 = mutableDateTime3.isEqual(readableInstant5);
    org.joda.time.ReadableInstant readableInstant7 = null;
    org.joda.time.ReadableDuration readableDuration8 = null;
    org.joda.time.MutablePeriod mutablePeriod9 = new org.joda.time.MutablePeriod(readableInstant7, readableDuration8);
    org.joda.time.chrono.GregorianChronology gregorianChronology11 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod9.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology11);
    int i13 = mutablePeriod9.getWeeks();
    boolean b14 = org.joda.time.field.FieldUtils.equals((java.lang.Object)mutableDateTime3, (java.lang.Object)i13);
    org.joda.time.chrono.GregorianChronology gregorianChronology16 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period17 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology16);
    org.joda.time.DateTimeZone dateTimeZone18 = gregorianChronology16.getZone();
    org.joda.time.MutableDateTime mutableDateTime19 = mutableDateTime3.toMutableDateTime(dateTimeZone18);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Interval interval20 = new org.joda.time.Interval((long)10, 0L, dateTimeZone18);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime19);

  }

  @Test
  public void test397() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test397"); }

    org.joda.time.LocalDateTime localDateTime0 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime2 = localDateTime0.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property3 = localDateTime0.dayOfMonth();
    org.joda.time.Interval interval4 = property3.toInterval();
    org.joda.time.Minutes minutes5 = org.joda.time.Minutes.minutesIn((org.joda.time.ReadableInterval)interval4);
    org.joda.time.Duration duration6 = minutes5.toStandardDuration();
    org.joda.time.Duration duration8 = duration6.minus((long)(short)10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration8);

  }

  @Test
  public void test398() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test398"); }

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
    org.joda.time.format.DateTimePrinter dateTimePrinter20 = dateTimeFormatter19.getPrinter();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateMidnight dateMidnight21 = org.joda.time.DateMidnight.parse("1967254T000000Z", dateTimeFormatter19);
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
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimePrinter20);

  }

  @Test
  public void test399() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test399"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicDate();
    java.io.Writer writer1 = null;
    // The following exception was thrown during execution in test generation
    try {
    dateTimeFormatter0.printTo(writer1, 20L);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test400() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test400"); }

    java.util.Locale locale1 = null;
    // The following exception was thrown during execution in test generation
    try {
    java.lang.String str2 = org.joda.time.format.DateTimeFormat.patternForStyle("1970-01-01", locale1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test401() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test401"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Days days1 = org.joda.time.Days.parseDays("32");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test402() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test402"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.year();
    org.joda.time.YearMonthDay yearMonthDay4 = property2.setCopy((int)(byte)-1);
    org.joda.time.ReadableInstant readableInstant5 = null;
    org.joda.time.ReadableDuration readableDuration6 = null;
    org.joda.time.MutablePeriod mutablePeriod7 = new org.joda.time.MutablePeriod(readableInstant5, readableDuration6);
    org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod7.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology9);
    org.joda.time.DateTimeZone dateTimeZone11 = null;
    org.joda.time.DateMidnight dateMidnight12 = new org.joda.time.DateMidnight(dateTimeZone11);
    int i13 = dateMidnight12.getDayOfWeek();
    org.joda.time.Chronology chronology14 = null;
    org.joda.time.MutableDateTime mutableDateTime15 = new org.joda.time.MutableDateTime(chronology14);
    java.util.GregorianCalendar gregorianCalendar16 = mutableDateTime15.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology17 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology9, (org.joda.time.ReadableDateTime)dateMidnight12, (org.joda.time.ReadableDateTime)mutableDateTime15);
    org.joda.time.YearMonthDay yearMonthDay18 = yearMonthDay4.withChronologyRetainFields((org.joda.time.Chronology)limitChronology17);
    // The following exception was thrown during execution in test generation
    try {
    long long23 = limitChronology17.getDateTimeMillis((int)(short)0, 1, 784, 2);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i13 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(limitChronology17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay18);

  }

  @Test
  public void test403() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test403"); }

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
    java.util.Locale locale28 = null;
    int i29 = offsetDateTimeField27.getMaximumTextLength(locale28);
    java.util.Locale locale31 = null;
    java.lang.String str32 = offsetDateTimeField27.getAsText(24, locale31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i29 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str32 + "' != '" + "24"+ "'", str32.equals("24"));

  }

  @Test
  public void test404() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test404"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.PeriodType periodType2 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology3 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod((java.lang.Object)chronology0, periodType2, (org.joda.time.Chronology)gregorianChronology3);
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight((long)6);
    org.joda.time.DateMidnight dateMidnight8 = dateMidnight6.withCenturyOfEra(1);
    org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight((java.lang.Object)10L);
    mutablePeriod4.setPeriod((org.joda.time.ReadableInstant)dateMidnight6, (org.joda.time.ReadableInstant)dateMidnight10);
    int i12 = dateMidnight6.getWeekOfWeekyear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 1);

  }

  @Test
  public void test405() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test405"); }

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
    org.joda.time.LocalDateTime.Property property18 = localDateTime4.minuteOfHour();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property18);

  }

  @Test
  public void test406() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test406"); }

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
    org.joda.time.LocalTime localTime21 = localTime18.plusSeconds(298);
    org.joda.time.DateTimeZone dateTimeZone23 = null;
    org.joda.time.LocalDateTime localDateTime24 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone23);
    org.joda.time.LocalDateTime localDateTime26 = localDateTime24.minusYears(345);
    org.joda.time.LocalDateTime localDateTime28 = localDateTime26.minusYears(1034);
    org.joda.time.LocalDateTime localDateTime30 = localDateTime28.plusMillis(2);
    // The following exception was thrown during execution in test generation
    try {
    int i31 = localTime18.compareTo((org.joda.time.ReadablePartial)localDateTime28);
      org.junit.Assert.fail("Expected exception of type java.lang.ClassCastException");
    } catch (java.lang.ClassCastException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime30);

  }

  @Test
  public void test407() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test407"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property7 = dateTime4.millisOfDay();
    boolean b8 = dateTime4.isBeforeNow();
    org.joda.time.DateTime dateTime10 = dateTime4.plusHours((int)(byte)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b8 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);

  }

  @Test
  public void test408() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test408"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.TimeOfDay timeOfDay2 = org.joda.time.TimeOfDay.fromMillisOfDay(1496721400817L, (org.joda.time.Chronology)gregorianChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay2);

  }

  @Test
  public void test409() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test409"); }

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
    org.joda.time.field.OffsetDateTimeField offsetDateTimeField34 = new org.joda.time.field.OffsetDateTimeField((org.joda.time.DateTimeField)offsetDateTimeField32, 1000);
    long long37 = offsetDateTimeField32.getDifferenceAsLong((long)6, 1496721385602L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "CopticChronology[UTC]"+ "'", str2.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CopticChronology[UTC]"+ "'", str7.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long37 == 0L);

  }

  @Test
  public void test410() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test410"); }

    org.joda.time.LocalDateTime localDateTime1 = new org.joda.time.LocalDateTime((long)(short)10);
    org.joda.time.LocalDateTime.Property property2 = localDateTime1.hourOfDay();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime4 = property2.setCopy("PT-10H52M1S");
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);

  }

  @Test
  public void test411() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test411"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    mutablePeriod2.addMillis((int)(byte)1);
    int i8 = mutablePeriod2.getMonths();
    mutablePeriod2.setWeeks(3);
    org.joda.time.Period period15 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType16 = null;
    org.joda.time.Period period17 = period15.withPeriodType(periodType16);
    org.joda.time.ReadableInstant readableInstant18 = null;
    org.joda.time.ReadableDuration readableDuration19 = null;
    org.joda.time.MutablePeriod mutablePeriod20 = new org.joda.time.MutablePeriod(readableInstant18, readableDuration19);
    org.joda.time.ReadableDuration readableDuration21 = null;
    org.joda.time.Chronology chronology22 = null;
    org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
    org.joda.time.PeriodType periodType24 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object)chronology22, periodType24, (org.joda.time.Chronology)gregorianChronology25);
    mutablePeriod20.setPeriod(readableDuration21, chronology22);
    org.joda.time.Period period28 = period15.plus((org.joda.time.ReadablePeriod)mutablePeriod20);
    mutablePeriod2.add((org.joda.time.ReadablePeriod)period28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period28);

  }

  @Test
  public void test412() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test412"); }

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
    mutableDateTime11.addWeeks(24);
    mutableDateTime11.setMinuteOfDay(365);
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime11.setMonthOfYear(41);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks15);

  }

  @Test
  public void test413() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test413"); }

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
    org.joda.time.LocalTime localTime22 = property20.roundHalfCeilingCopy();
    org.joda.time.LocalTime localTime23 = property20.roundCeilingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime23);

  }

  @Test
  public void test414() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test414"); }

    org.joda.time.Chronology chronology3 = null;
    java.util.Locale locale4 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology3, locale4, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket7.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket7.setZone(dateTimeZone10);
    org.joda.time.Chronology chronology12 = null;
    org.joda.time.MutableDateTime mutableDateTime13 = new org.joda.time.MutableDateTime(chronology12);
    org.joda.time.DateTimeZone dateTimeZone14 = null;
    org.joda.time.chrono.CopticChronology copticChronology15 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone14);
    java.lang.String str16 = copticChronology15.toString();
    org.joda.time.DateTimeZone dateTimeZone17 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology18 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone17);
    org.joda.time.TimeOfDay timeOfDay19 = new org.joda.time.TimeOfDay(dateTimeZone17);
    org.joda.time.Chronology chronology20 = copticChronology15.withZone(dateTimeZone17);
    org.joda.time.DateTime dateTime21 = mutableDateTime13.toDateTime(dateTimeZone17);
    org.joda.time.chrono.EthiopicChronology ethiopicChronology23 = org.joda.time.chrono.EthiopicChronology.getInstance(dateTimeZone17, (int)(byte)1);
    boolean b24 = dateTimeParserBucket7.restoreState((java.lang.Object)ethiopicChronology23);
    org.joda.time.DateTimeField dateTimeField25 = ethiopicChronology23.minuteOfHour();
    org.joda.time.DateMidnight dateMidnight26 = org.joda.time.DateMidnight.now((org.joda.time.Chronology)ethiopicChronology23);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutableInterval mutableInterval27 = new org.joda.time.MutableInterval((long)10, (-72835200000L), (org.joda.time.Chronology)ethiopicChronology23);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "CopticChronology[UTC]"+ "'", str16.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(ethiopicChronology23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b24 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight26);

  }

  @Test
  public void test415() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test415"); }

    org.joda.time.Months months0 = org.joda.time.Months.ZERO;
    org.joda.time.PeriodType periodType1 = months0.getPeriodType();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType1);

  }

  @Test
  public void test416() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test416"); }

    org.joda.time.DateTimeFieldType dateTimeFieldType0 = null;
    org.joda.time.DateTimeZone dateTimeZone2 = null;
    org.joda.time.LocalDateTime localDateTime3 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone2);
    org.joda.time.DateTimeZone dateTimeZone4 = null;
    org.joda.time.chrono.CopticChronology copticChronology5 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone4);
    org.joda.time.DurationField durationField6 = copticChronology5.days();
    boolean b7 = org.joda.time.field.FieldUtils.equals((java.lang.Object)localDateTime3, (java.lang.Object)durationField6);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.field.UnsupportedDateTimeField unsupportedDateTimeField8 = org.joda.time.field.UnsupportedDateTimeField.getInstance(dateTimeFieldType0, durationField6);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test417() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test417"); }

    org.joda.time.DateTimeUtils.setCurrentMillisOffset((long)' ');

  }

  @Test
  public void test418() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test418"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    long long2 = dateMidnight1.getMillis();
    org.joda.time.DateMidnight dateMidnight4 = dateMidnight1.plusDays(24);
    org.joda.time.LocalDate localDate6 = new org.joda.time.LocalDate((long)10);
    org.joda.time.DateMidnight dateMidnight7 = dateMidnight4.withFields((org.joda.time.ReadablePartial)localDate6);
    org.joda.time.DateMidnight dateMidnight9 = dateMidnight7.minusDays((-101));
    org.joda.time.DateMidnight.Property property10 = dateMidnight7.year();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long2 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property10);

  }

  @Test
  public void test419() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test419"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
    org.joda.time.chrono.IslamicChronology islamicChronology8 = org.joda.time.chrono.IslamicChronology.getInstance((org.joda.time.DateTimeZone)cachedDateTimeZone7);
    int i10 = cachedDateTimeZone7.getOffset(0L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedDateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i10 == 0);

  }

  @Test
  public void test420() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test420"); }

    org.joda.time.Days days0 = org.joda.time.Days.FIVE;
    org.joda.time.Days days2 = days0.plus(330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(days0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(days2);

  }

  @Test
  public void test421() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test421"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(1970, 0, (int)(short)-1, 1034, 14, (int)(byte)100);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test422() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test422"); }

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
    mutableDateTime5.setHourOfDay((int)(short)1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == (-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight13);

  }

  @Test
  public void test423() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test423"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.DateTimeZone dateTimeZone6 = null;
    org.joda.time.DateMidnight dateMidnight7 = new org.joda.time.DateMidnight(dateTimeZone6);
    int i8 = dateMidnight7.getDayOfWeek();
    org.joda.time.Chronology chronology9 = null;
    org.joda.time.MutableDateTime mutableDateTime10 = new org.joda.time.MutableDateTime(chronology9);
    java.util.GregorianCalendar gregorianCalendar11 = mutableDateTime10.toGregorianCalendar();
    org.joda.time.chrono.LimitChronology limitChronology12 = org.joda.time.chrono.LimitChronology.getInstance((org.joda.time.Chronology)gregorianChronology4, (org.joda.time.ReadableDateTime)dateMidnight7, (org.joda.time.ReadableDateTime)mutableDateTime10);
    org.joda.time.DateTime dateTime13 = limitChronology12.getUpperLimit();
    org.joda.time.DateTimeZone dateTimeZone16 = null;
    org.joda.time.LocalDateTime localDateTime17 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone16);
    org.joda.time.LocalDateTime.Property property18 = localDateTime17.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone20 = null;
    org.joda.time.LocalDateTime localDateTime21 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone20);
    boolean b22 = localDateTime17.isAfter((org.joda.time.ReadablePartial)localDateTime21);
    org.joda.time.DateTimeZone dateTimeZone24 = null;
    org.joda.time.LocalDateTime localDateTime25 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone24);
    org.joda.time.LocalDateTime localDateTime27 = localDateTime25.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property28 = localDateTime27.dayOfYear();
    org.joda.time.PeriodType periodType29 = org.joda.time.PeriodType.dayTime();
    org.joda.time.Period period30 = new org.joda.time.Period((org.joda.time.ReadablePartial)localDateTime17, (org.joda.time.ReadablePartial)localDateTime27, periodType29);
    org.joda.time.PeriodType periodType31 = periodType29.withSecondsRemoved();
    org.joda.time.PeriodType periodType32 = org.joda.time.DateTimeUtils.getPeriodType(periodType31);
    org.joda.time.Chronology chronology33 = null;
    org.joda.time.MutableDateTime mutableDateTime34 = new org.joda.time.MutableDateTime(chronology33);
    org.joda.time.PeriodType periodType35 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology36 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod37 = new org.joda.time.MutablePeriod((java.lang.Object)chronology33, periodType35, (org.joda.time.Chronology)gregorianChronology36);
    org.joda.time.DateTimeField dateTimeField38 = gregorianChronology36.hourOfDay();
    org.joda.time.DurationField durationField39 = gregorianChronology36.minutes();
    org.joda.time.Period period40 = new org.joda.time.Period((long)37, periodType31, (org.joda.time.Chronology)gregorianChronology36);
    boolean b41 = limitChronology12.equals((java.lang.Object)gregorianChronology36);
    java.lang.String str42 = limitChronology12.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianCalendar11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(limitChronology12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b22 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType32);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField38);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b41 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str42 + "' != '" + "LimitChronology[GregorianChronology[UTC], 2017-06-06T00:00:00.000Z, 2017-06-06T03:56:59.212Z]"+ "'", str42.equals("LimitChronology[GregorianChronology[UTC], 2017-06-06T00:00:00.000Z, 2017-06-06T03:56:59.212Z]"));

  }

  @Test
  public void test424() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test424"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.timeNoMillis();
    java.lang.StringBuffer stringBuffer1 = null;
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    org.joda.time.Instant instant4 = mutableDateTime3.toInstant();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
    org.joda.time.DateMidnight.Property property7 = dateMidnight6.centuryOfEra();
    org.joda.time.DateMidnight.Property property8 = dateMidnight6.dayOfYear();
    org.joda.time.Minutes minutes9 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)instant4, (org.joda.time.ReadableInstant)dateMidnight6);
    org.joda.time.ReadableInstant readableInstant10 = null;
    org.joda.time.ReadableDuration readableDuration11 = null;
    org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant10, readableDuration11);
    org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod12.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology14);
    org.joda.time.DateMidnight dateMidnight16 = dateMidnight6.plus((org.joda.time.ReadablePeriod)mutablePeriod12);
    // The following exception was thrown during execution in test generation
    try {
    dateTimeFormatter0.printTo(stringBuffer1, (org.joda.time.ReadableInstant)dateMidnight16);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight16);

  }

  @Test
  public void test425() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test425"); }

    int i1 = org.joda.time.field.FieldUtils.safeToInt((long)42);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 42);

  }

  @Test
  public void test426() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test426"); }

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
    org.joda.time.LocalTime localTime21 = localTime18.plusSeconds(298);
    org.joda.time.LocalTime localTime23 = localTime18.minusSeconds(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime23);

  }

  @Test
  public void test427() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test427"); }

    org.joda.time.format.PeriodFormatter periodFormatter1 = org.joda.time.format.ISOPeriodFormat.alternateExtended();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutablePeriod mutablePeriod2 = org.joda.time.MutablePeriod.parse("T03:56:29", periodFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodFormatter1);

  }

  @Test
  public void test428() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test428"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay2 = new org.joda.time.TimeOfDay(dateTimeZone0);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTimeFieldType dateTimeFieldType4 = timeOfDay2.getFieldType(535);
      org.junit.Assert.fail("Expected exception of type java.lang.ArrayIndexOutOfBoundsException");
    } catch (java.lang.ArrayIndexOutOfBoundsException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);

  }

  @Test
  public void test429() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test429"); }

    org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.yearMonthDayTime();
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    org.joda.time.DurationField durationField5 = copticChronology4.days();
    java.util.Locale locale6 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket7 = new org.joda.time.format.DateTimeParserBucket((long)8, (org.joda.time.Chronology)copticChronology4, locale6);
    org.joda.time.chrono.GregorianChronology gregorianChronology12 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period13 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology12);
    org.joda.time.DateTimeZone dateTimeZone14 = gregorianChronology12.getZone();
    org.joda.time.YearMonthDay yearMonthDay15 = new org.joda.time.YearMonthDay((int)(byte)1, 6, 8, (org.joda.time.Chronology)gregorianChronology12);
    org.joda.time.DateTimeField dateTimeField16 = gregorianChronology12.dayOfWeek();
    org.joda.time.field.SkipDateTimeField skipDateTimeField17 = new org.joda.time.field.SkipDateTimeField((org.joda.time.Chronology)copticChronology4, dateTimeField16);
    org.joda.time.Period period18 = new org.joda.time.Period((long)37, periodType1, (org.joda.time.Chronology)copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);

  }

  @Test
  public void test430() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test430"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    org.joda.time.LocalDateTime localDateTime8 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime10 = localDateTime8.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property11 = localDateTime8.dayOfMonth();
    org.joda.time.Interval interval12 = property11.toInterval();
    org.joda.time.LocalDateTime localDateTime13 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime15 = localDateTime13.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property16 = localDateTime13.dayOfMonth();
    org.joda.time.Interval interval17 = property16.toInterval();
    boolean b18 = interval17.containsNow();
    boolean b19 = interval12.abuts((org.joda.time.ReadableInterval)interval17);
    org.joda.time.Chronology chronology20 = interval17.getChronology();
    mutablePeriod2.setPeriod((long)(byte)0, 100L, chronology20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b18 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b19 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology20);

  }

  @Test
  public void test431() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test431"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime1.setDayOfWeek(1969);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);

  }

  @Test
  public void test432() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test432"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.basicOrdinalDate();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);

  }

  @Test
  public void test433() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test433"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    java.lang.String str5 = copticChronology4.toString();
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
    org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone6);
    org.joda.time.Chronology chronology9 = copticChronology4.withZone(dateTimeZone6);
    org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime(dateTimeZone6);
    java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant)mutableDateTime2);
    java.lang.Object obj12 = mutableDateTime2.clone();
    org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfYear();
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime2.setDate(1969, 2017, 5);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CopticChronology[UTC]"+ "'", str5.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2017-06-06T03:57:01.147"+ "'", str11.equals("2017-06-06T03:57:01.147"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);

  }

  @Test
  public void test434() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test434"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Months months1 = org.joda.time.Months.parseMonths("--01-01");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test435() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test435"); }

    org.joda.time.Period period1 = org.joda.time.Period.days(8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period1);

  }

  @Test
  public void test436() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test436"); }

    org.joda.time.ReadableInstant readableInstant0 = null;
    org.joda.time.ReadableDuration readableDuration1 = null;
    org.joda.time.MutablePeriod mutablePeriod2 = new org.joda.time.MutablePeriod(readableInstant0, readableDuration1);
    org.joda.time.chrono.GregorianChronology gregorianChronology4 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod2.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology4);
    mutablePeriod2.addMillis((int)(byte)1);
    int i8 = mutablePeriod2.getMonths();
    mutablePeriod2.addHours(4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);

  }

  @Test
  public void test437() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test437"); }

    org.joda.time.Period period13 = new org.joda.time.Period((int)(short)0, (int)'4', 1, 0);
    org.joda.time.PeriodType periodType14 = null;
    org.joda.time.Period period15 = period13.withPeriodType(periodType14);
    org.joda.time.Period period17 = period15.minusHours(10);
    org.joda.time.Period period18 = period17.toPeriod();
    org.joda.time.Duration duration19 = period18.toStandardDuration();
    org.joda.time.Chronology chronology20 = null;
    org.joda.time.MutableDateTime mutableDateTime21 = new org.joda.time.MutableDateTime(chronology20);
    org.joda.time.Instant instant22 = mutableDateTime21.toInstant();
    org.joda.time.PeriodType periodType23 = org.joda.time.PeriodType.millis();
    org.joda.time.PeriodType periodType24 = periodType23.withYearsRemoved();
    org.joda.time.Period period25 = duration19.toPeriodTo((org.joda.time.ReadableInstant)instant22, periodType23);
    org.joda.time.DateTimeZone dateTimeZone26 = null;
    org.joda.time.chrono.CopticChronology copticChronology27 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone26);
    org.joda.time.DurationField durationField28 = copticChronology27.days();
    org.joda.time.MutableDateTime mutableDateTime29 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology27);
    int i30 = copticChronology27.getMinimumDaysInFirstWeek();
    org.joda.time.Period period31 = new org.joda.time.Period(0L, (long)100, periodType23, (org.joda.time.Chronology)copticChronology27);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime32 = new org.joda.time.LocalDateTime((int)(short)10, (int)(byte)-1, 70, (int)(short)-1, 0, 37, 1969, (org.joda.time.Chronology)copticChronology27);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i30 == 4);

  }

  @Test
  public void test438() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test438"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.YearMonth yearMonth2 = new org.joda.time.YearMonth((org.joda.time.Chronology)copticChronology1);
    org.joda.time.YearMonth yearMonth4 = yearMonth2.minusYears((int)'a');
    org.joda.time.YearMonth yearMonth6 = yearMonth2.minusYears((-1));
    int i7 = yearMonth2.getMonthOfYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonth6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i7 == 9);

  }

  @Test
  public void test439() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test439"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime.Property property3 = localDateTime2.monthOfYear();
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone5);
    boolean b7 = localDateTime2.isAfter((org.joda.time.ReadablePartial)localDateTime6);
    org.joda.time.LocalDateTime localDateTime9 = localDateTime2.withDayOfMonth((int)(short)10);
    org.joda.time.LocalDateTime.Property property10 = localDateTime9.weekyear();
    org.joda.time.LocalDateTime.Property property11 = localDateTime9.dayOfWeek();
    org.joda.time.LocalDateTime.Property property12 = localDateTime9.dayOfYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property12);

  }

  @Test
  public void test440() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test440"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.MutableDateTime mutableDateTime3 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology1);
    int i4 = mutableDateTime3.getEra();
    org.joda.time.MutableDateTime.Property property5 = mutableDateTime3.yearOfCentury();
    org.joda.time.MutableDateTime mutableDateTime6 = property5.roundCeiling();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i4 == 1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime6);

  }

  @Test
  public void test441() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test441"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateTime dateTime6 = org.joda.time.DateTime.now(dateTimeZone4);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone7 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone4);
    java.lang.String str9 = cachedDateTimeZone7.getNameKey((long)'a');
    long long11 = cachedDateTimeZone7.previousTransition(463708800000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedDateTimeZone7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "UTC"+ "'", str9.equals("UTC"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long11 == 463708800000L);

  }

  @Test
  public void test442() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test442"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    org.joda.time.ReadableInstant readableInstant3 = null;
    boolean b4 = mutableDateTime1.isEqual(readableInstant3);
    org.joda.time.DateTime dateTime5 = mutableDateTime1.toDateTime();
    org.joda.time.DateTime.Property property6 = dateTime5.yearOfCentury();
    org.joda.time.DateTime dateTime7 = property6.roundHalfCeilingCopy();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);

  }

  @Test
  public void test443() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test443"); }

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
    java.lang.String str16 = periodType14.getName();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str16 + "' != '" + "DayTime"+ "'", str16.equals("DayTime"));

  }

  @Test
  public void test444() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test444"); }

    // The following exception was thrown during execution in test generation
    try {
    int i4 = org.joda.time.field.FieldUtils.getWrappedValue(5, 999, 1970, (int)'4');
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test445() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test445"); }

    int i0 = org.joda.time.DateTimeConstants.WEDNESDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 3);

  }

  @Test
  public void test446() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test446"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology0 = org.joda.time.chrono.GregorianChronology.getInstance();
    int i1 = gregorianChronology0.getMinimumDaysInFirstWeek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i1 == 4);

  }

  @Test
  public void test447() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test447"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.DateTimeFormat.mediumDate();
    java.util.Locale locale1 = dateTimeFormatter0.getLocale();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(locale1);

  }

  @Test
  public void test448() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test448"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
    org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.dayOfYear();
    org.joda.time.MutableDateTime mutableDateTime5 = property3.add((int)(byte)10);
    java.lang.String str6 = property3.getAsShortText();
    boolean b7 = property3.isLeap();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str6 + "' != '" + "167"+ "'", str6.equals("167"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b7 == false);

  }

  @Test
  public void test449() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test449"); }

    org.joda.time.Years years1 = org.joda.time.Years.years(0);
    org.joda.time.Years years3 = org.joda.time.Years.years(0);
    org.joda.time.Years years5 = years3.minus((int)(byte)-1);
    org.joda.time.Years years6 = years1.minus(years3);
    org.joda.time.Years years8 = org.joda.time.Years.years(0);
    org.joda.time.Years years10 = org.joda.time.Years.years(0);
    org.joda.time.Years years12 = years10.minus((int)(byte)-1);
    org.joda.time.Years years13 = years8.minus(years10);
    boolean b14 = years6.isLessThan(years13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b14 == false);

  }

  @Test
  public void test450() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test450"); }

    int i2 = org.joda.time.field.FieldUtils.safeAdd(784, (int)(short)100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i2 == 884);

  }

  @Test
  public void test451() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test451"); }

    org.joda.time.Period period2 = new org.joda.time.Period(0L, (long)14);

  }

  @Test
  public void test452() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test452"); }

    org.joda.time.TimeOfDay timeOfDay1 = org.joda.time.TimeOfDay.fromMillisOfDay((long)10080);
    org.joda.time.DateTime dateTime2 = timeOfDay1.toDateTimeToday();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime2);

  }

  @Test
  public void test453() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test453"); }

    org.joda.time.DurationFieldType durationFieldType0 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.IllegalFieldValueException illegalFieldValueException4 = new org.joda.time.IllegalFieldValueException(durationFieldType0, (java.lang.Number)(-1L), (java.lang.Number)6, (java.lang.Number)(short)0);
      org.junit.Assert.fail("Expected exception of type java.lang.NullPointerException");
    } catch (java.lang.NullPointerException e) {
      // Expected exception.
    }

  }

  @Test
  public void test454() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test454"); }

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
    org.joda.time.LocalTime.Property property22 = localTime21.hourOfDay();
    org.joda.time.LocalTime localTime23 = property22.roundHalfEvenCopy();
    org.joda.time.LocalTime localTime24 = property22.withMinimumValue();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime24);

  }

  @Test
  public void test455() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test455"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
    org.joda.time.LocalDate localDate3 = property2.roundHalfCeilingCopy();
    org.joda.time.LocalDate localDate5 = localDate3.withYearOfEra(1034);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDate5);

  }

  @Test
  public void test456() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test456"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    java.lang.String str5 = copticChronology4.toString();
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
    org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone6);
    org.joda.time.Chronology chronology9 = copticChronology4.withZone(dateTimeZone6);
    org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime(dateTimeZone6);
    java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant)mutableDateTime2);
    java.lang.Object obj12 = mutableDateTime2.clone();
    org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfYear();
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime2.setMinuteOfHour(365);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CopticChronology[UTC]"+ "'", str5.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2017-06-06T03:57:03.932"+ "'", str11.equals("2017-06-06T03:57:03.932"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);

  }

  @Test
  public void test457() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test457"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.MutableDateTime.Property property2 = mutableDateTime1.hourOfDay();
    org.joda.time.MutableDateTime.Property property3 = mutableDateTime1.year();
    // The following exception was thrown during execution in test generation
    try {
    mutableDateTime1.setDate((int)(byte)-1, 330, 298);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);

  }

  @Test
  public void test458() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test458"); }

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
    mutablePeriod2.add((long)(-101));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval13);

  }

  @Test
  public void test459() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test459"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.TimeOfDay timeOfDay3 = timeOfDay1.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property4 = timeOfDay1.secondOfMinute();
    java.lang.String str5 = property4.toString();
    java.util.Locale locale6 = null;
    java.lang.String str7 = property4.getAsText(locale6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "Property[secondOfMinute]"+ "'", str5.equals("Property[secondOfMinute]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "4"+ "'", str7.equals("4"));

  }

  @Test
  public void test460() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test460"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.DateMidnight dateMidnight1 = new org.joda.time.DateMidnight(dateTimeZone0);
    org.joda.time.ReadableDuration readableDuration2 = null;
    org.joda.time.MutableInterval mutableInterval3 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight1, readableDuration2);
    org.joda.time.Years years5 = org.joda.time.Years.years(0);
    org.joda.time.Years years7 = years5.minus((int)(byte)-1);
    mutableInterval3.setPeriodAfterStart((org.joda.time.ReadablePeriod)years7);
    org.joda.time.DateTimeZone dateTimeZone9 = null;
    org.joda.time.DateMidnight dateMidnight10 = new org.joda.time.DateMidnight(dateTimeZone9);
    org.joda.time.ReadableDuration readableDuration11 = null;
    org.joda.time.MutableInterval mutableInterval12 = new org.joda.time.MutableInterval((org.joda.time.ReadableInstant)dateMidnight10, readableDuration11);
    org.joda.time.Years years14 = org.joda.time.Years.years(0);
    org.joda.time.Years years16 = years14.minus((int)(byte)-1);
    mutableInterval12.setPeriodAfterStart((org.joda.time.ReadablePeriod)years16);
    org.joda.time.Years years19 = years16.dividedBy((int)(byte)100);
    boolean b20 = years7.isLessThan(years16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(years19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b20 == false);

  }

  @Test
  public void test461() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test461"); }

    org.joda.time.LocalDate localDate1 = new org.joda.time.LocalDate((long)10);
    org.joda.time.LocalDate.Property property2 = localDate1.weekyear();
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
    org.joda.time.PeriodType periodType20 = periodType18.withSecondsRemoved();
    org.joda.time.PeriodType periodType21 = org.joda.time.DateTimeUtils.getPeriodType(periodType20);
    org.joda.time.Chronology chronology22 = null;
    org.joda.time.MutableDateTime mutableDateTime23 = new org.joda.time.MutableDateTime(chronology22);
    org.joda.time.PeriodType periodType24 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology25 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod26 = new org.joda.time.MutablePeriod((java.lang.Object)chronology22, periodType24, (org.joda.time.Chronology)gregorianChronology25);
    org.joda.time.DateTimeField dateTimeField27 = gregorianChronology25.hourOfDay();
    org.joda.time.DurationField durationField28 = gregorianChronology25.minutes();
    org.joda.time.Period period29 = new org.joda.time.Period((long)37, periodType20, (org.joda.time.Chronology)gregorianChronology25);
    org.joda.time.PeriodType periodType30 = period29.getPeriodType();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MutablePeriod mutablePeriod31 = new org.joda.time.MutablePeriod((java.lang.Object)property2, periodType30);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType30);

  }

  @Test
  public void test462() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test462"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology9 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period10 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology9);
    org.joda.time.DateTimeZone dateTimeZone11 = gregorianChronology9.getZone();
    org.joda.time.MutableDateTime mutableDateTime12 = new org.joda.time.MutableDateTime((long)1, dateTimeZone11);
    org.joda.time.DateTime dateTime13 = org.joda.time.DateTime.now(dateTimeZone11);
    org.joda.time.tz.CachedDateTimeZone cachedDateTimeZone14 = org.joda.time.tz.CachedDateTimeZone.forZone(dateTimeZone11);
    org.joda.time.DateTimeZone dateTimeZone15 = cachedDateTimeZone14.getUncachedZone();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime16 = new org.joda.time.DateTime((int)(byte)10, 0, 0, 784, 0, 78, 26, dateTimeZone15);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(cachedDateTimeZone14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone15);

  }

  @Test
  public void test463() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test463"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateTimeParser();
    java.lang.Integer i1 = dateTimeFormatter0.getPivotYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNull(i1);

  }

  @Test
  public void test464() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test464"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalDateTime localDateTime6 = new org.joda.time.LocalDateTime(5, 26, 242, 27, 1034, 2000);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }

  }

  @Test
  public void test465() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test465"); }

    org.joda.time.Months months1 = org.joda.time.Months.months(10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months1);

  }

  @Test
  public void test466() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test466"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.chrono.CopticChronology copticChronology1 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone0);
    org.joda.time.DurationField durationField2 = copticChronology1.days();
    org.joda.time.DateTimeField dateTimeField3 = copticChronology1.dayOfWeek();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);

  }

  @Test
  public void test467() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test467"); }

    java.lang.ClassLoader classLoader1 = null;
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.tz.ZoneInfoProvider zoneInfoProvider2 = new org.joda.time.tz.ZoneInfoProvider("32", classLoader1);
      org.junit.Assert.fail("Expected exception of type java.io.IOException");
    } catch (java.io.IOException e) {
      // Expected exception.
    }

  }

  @Test
  public void test468() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test468"); }

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
    int i24 = localDate6.size();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 3);

  }

  @Test
  public void test469() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test469"); }

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
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime23 = property20.setCopy(157);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str21 + "' != '" + "0"+ "'", str21.equals("0"));

  }

  @Test
  public void test470() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test470"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.MutableDateTime mutableDateTime1 = new org.joda.time.MutableDateTime(chronology0);
    org.joda.time.Instant instant2 = mutableDateTime1.toInstant();
    mutableDateTime1.addWeekyears((int)(short)-1);
    org.joda.time.DateTimeZone dateTimeZone5 = null;
    org.joda.time.DateMidnight dateMidnight6 = new org.joda.time.DateMidnight(dateTimeZone5);
    long long7 = dateMidnight6.getMillis();
    org.joda.time.DateMidnight dateMidnight9 = dateMidnight6.plusDays(24);
    org.joda.time.Minutes minutes10 = org.joda.time.Minutes.minutesBetween((org.joda.time.ReadableInstant)mutableDateTime1, (org.joda.time.ReadableInstant)dateMidnight9);
    boolean b11 = mutableDateTime1.isBeforeNow();
    org.joda.time.DateTimeZone dateTimeZone12 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology13 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone12);
    int i15 = dateTimeZone12.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime16 = org.joda.time.DateTime.now(dateTimeZone12);
    org.joda.time.DateTime dateTime18 = dateTime16.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property19 = dateTime16.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType20 = property19.getFieldType();
    org.joda.time.DateTimeZone dateTimeZone21 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology22 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone21);
    int i24 = dateTimeZone21.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime25 = org.joda.time.DateTime.now(dateTimeZone21);
    org.joda.time.DateTime dateTime27 = dateTime25.minusWeeks((int)'4');
    org.joda.time.DateTime.Property property28 = dateTime25.millisOfDay();
    org.joda.time.DateTimeFieldType dateTimeFieldType29 = property28.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator30 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType20, dateTimeFieldType29);
    org.joda.time.DateTimeZone dateTimeZone31 = null;
    org.joda.time.TimeOfDay timeOfDay32 = new org.joda.time.TimeOfDay(dateTimeZone31);
    org.joda.time.TimeOfDay timeOfDay34 = timeOfDay32.minusSeconds((int)(short)0);
    org.joda.time.TimeOfDay.Property property35 = timeOfDay32.secondOfMinute();
    org.joda.time.TimeOfDay.Property property36 = timeOfDay32.millisOfSecond();
    java.util.Locale locale37 = null;
    int i38 = property36.getMaximumTextLength(locale37);
    org.joda.time.DateTimeFieldType dateTimeFieldType39 = property36.getFieldType();
    org.joda.time.DateTimeComparator dateTimeComparator40 = org.joda.time.DateTimeComparator.getInstance(dateTimeFieldType29, dateTimeFieldType39);
    org.joda.time.MutableDateTime.Property property41 = mutableDateTime1.property(dateTimeFieldType39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long7 == 1496707200000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(minutes10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b11 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i15 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i24 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType29);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i38 == 3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType39);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator40);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property41);

  }

  @Test
  public void test471() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test471"); }

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
    long long34 = offsetDateTimeField32.roundHalfEven(1496721385602L);
    long long36 = offsetDateTimeField32.roundHalfFloor((long)628);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "CopticChronology[UTC]"+ "'", str2.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CopticChronology[UTC]"+ "'", str7.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long34 == 463708800000L);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long36 == 463708800000L);

  }

  @Test
  public void test472() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test472"); }

    org.joda.time.MutablePeriod mutablePeriod4 = new org.joda.time.MutablePeriod(0, 6, 999, (int)'#');
    org.joda.time.Chronology chronology5 = null;
    org.joda.time.MutableDateTime mutableDateTime6 = new org.joda.time.MutableDateTime(chronology5);
    org.joda.time.DateTimeZone dateTimeZone7 = null;
    org.joda.time.chrono.CopticChronology copticChronology8 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone7);
    java.lang.String str9 = copticChronology8.toString();
    org.joda.time.DateTimeZone dateTimeZone10 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology11 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone10);
    org.joda.time.TimeOfDay timeOfDay12 = new org.joda.time.TimeOfDay(dateTimeZone10);
    org.joda.time.Chronology chronology13 = copticChronology8.withZone(dateTimeZone10);
    org.joda.time.DateTime dateTime14 = mutableDateTime6.toDateTime(dateTimeZone10);
    org.joda.time.DateTimeZone dateTimeZone15 = null;
    org.joda.time.DateMidnight dateMidnight16 = new org.joda.time.DateMidnight(dateTimeZone15);
    org.joda.time.Duration duration19 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight20 = dateMidnight16.minus((org.joda.time.ReadableDuration)duration19);
    org.joda.time.Duration duration22 = org.joda.time.Duration.standardHours((long)1);
    org.joda.time.Period period23 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateMidnight20, (org.joda.time.ReadableDuration)duration22);
    org.joda.time.DateTime dateTime24 = dateTime14.plus((org.joda.time.ReadableDuration)duration22);
    mutablePeriod4.setPeriod((org.joda.time.ReadableDuration)duration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str9 + "' != '" + "CopticChronology[UTC]"+ "'", str9.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime24);

  }

  @Test
  public void test473() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test473"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Weeks weeks1 = org.joda.time.Weeks.parseWeeks("2017-06-06T03:56:46.030");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test474() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test474"); }

    org.joda.time.Weeks weeks0 = org.joda.time.Weeks.THREE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(weeks0);

  }

  @Test
  public void test475() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test475"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.YearMonthDay.Property property2 = yearMonthDay1.year();
    int i3 = property2.get();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 2017);

  }

  @Test
  public void test476() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test476"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology2 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period3 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology2);
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology2.getZone();
    org.joda.time.MutableDateTime mutableDateTime5 = new org.joda.time.MutableDateTime((long)1, dateTimeZone4);
    org.joda.time.DateMidnight dateMidnight6 = org.joda.time.DateMidnight.now(dateTimeZone4);
    org.joda.time.LocalDate localDate7 = org.joda.time.LocalDate.now(dateTimeZone4);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime8 = new org.joda.time.DateTime((java.lang.Object)localDate7);
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

  }

  @Test
  public void test477() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test477"); }

    org.joda.time.Chronology chronology0 = null;
    org.joda.time.Chronology chronology2 = null;
    org.joda.time.MutableDateTime mutableDateTime3 = new org.joda.time.MutableDateTime(chronology2);
    org.joda.time.PeriodType periodType4 = null;
    org.joda.time.chrono.GregorianChronology gregorianChronology5 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.MutablePeriod mutablePeriod6 = new org.joda.time.MutablePeriod((java.lang.Object)chronology2, periodType4, (org.joda.time.Chronology)gregorianChronology5);
    org.joda.time.LocalDate localDate7 = new org.joda.time.LocalDate((long)345, chronology2);
    org.joda.time.DateTimeZone dateTimeZone8 = null;
    org.joda.time.YearMonthDay yearMonthDay9 = new org.joda.time.YearMonthDay(dateTimeZone8);
    org.joda.time.YearMonthDay yearMonthDay11 = yearMonthDay9.minusMonths(0);
    org.joda.time.Chronology chronology13 = null;
    java.util.Locale locale14 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology13, locale14, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket17.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket17.setZone(dateTimeZone20);
    org.joda.time.DateMidnight dateMidnight22 = yearMonthDay9.toDateMidnight(dateTimeZone20);
    org.joda.time.DateMidnight dateMidnight23 = localDate7.toDateMidnight(dateTimeZone20);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.chrono.ZonedChronology zonedChronology24 = org.joda.time.chrono.ZonedChronology.getInstance(chronology0, dateTimeZone20);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay11);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight23);

  }

  @Test
  public void test478() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test478"); }

    int i0 = org.joda.time.DateTimeConstants.SATURDAY;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i0 == 6);

  }

  @Test
  public void test479() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test479"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter0 = org.joda.time.format.ISODateTimeFormat.dateHourMinuteSecondFraction();
    org.joda.time.Chronology chronology1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime(chronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    java.lang.String str5 = copticChronology4.toString();
    org.joda.time.DateTimeZone dateTimeZone6 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology7 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone6);
    org.joda.time.TimeOfDay timeOfDay8 = new org.joda.time.TimeOfDay(dateTimeZone6);
    org.joda.time.Chronology chronology9 = copticChronology4.withZone(dateTimeZone6);
    org.joda.time.DateTime dateTime10 = mutableDateTime2.toDateTime(dateTimeZone6);
    java.lang.String str11 = dateTimeFormatter0.print((org.joda.time.ReadableInstant)mutableDateTime2);
    java.lang.Object obj12 = mutableDateTime2.clone();
    org.joda.time.MutableDateTime.Property property13 = mutableDateTime2.dayOfYear();
    mutableDateTime2.add((long)10080);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "CopticChronology[UTC]"+ "'", str5.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str11 + "' != '" + "2017-06-06T03:57:05.949"+ "'", str11.equals("2017-06-06T03:57:05.949"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(obj12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property13);

  }

  @Test
  public void test480() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test480"); }

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
    org.joda.time.LocalTime localTime20 = localTime18.minusMillis(1);
    org.joda.time.DateTimeZone dateTimeZone22 = null;
    org.joda.time.LocalDateTime localDateTime23 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone22);
    org.joda.time.LocalDateTime localDateTime25 = localDateTime23.minusYears(345);
    org.joda.time.LocalDateTime localDateTime27 = localDateTime25.minusYears(1034);
    org.joda.time.LocalDateTime localDateTime29 = localDateTime27.plusMillis(2);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.Hours hours30 = org.joda.time.Hours.hoursBetween((org.joda.time.ReadablePartial)localTime20, (org.joda.time.ReadablePartial)localDateTime29);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime29);

  }

  @Test
  public void test481() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test481"); }

    org.joda.time.PeriodType periodType1 = org.joda.time.PeriodType.years();
    org.joda.time.Period period2 = new org.joda.time.Period((long)810, periodType1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(periodType1);

  }

  @Test
  public void test482() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test482"); }

    org.joda.time.DateTimeZone dateTimeZone0 = org.joda.time.DateTimeZone.UTC;
    org.joda.time.chrono.ISOChronology iSOChronology1 = org.joda.time.chrono.ISOChronology.getInstance(dateTimeZone0);
    int i3 = dateTimeZone0.getOffsetFromLocal((long)100);
    org.joda.time.DateTime dateTime4 = org.joda.time.DateTime.now(dateTimeZone0);
    org.joda.time.DateTime dateTime6 = dateTime4.minusWeeks((int)'4');
    org.joda.time.ReadableDuration readableDuration7 = null;
    org.joda.time.MutablePeriod mutablePeriod8 = new org.joda.time.MutablePeriod((org.joda.time.ReadableInstant)dateTime6, readableDuration7);
    org.joda.time.DateTime dateTime10 = dateTime6.withMillisOfSecond((int)(byte)10);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.DateTime dateTime12 = dateTime10.withMonthOfYear(810);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime10);

  }

  @Test
  public void test483() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test483"); }

    org.joda.time.Chronology chronology1 = null;
    java.util.Locale locale2 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket5 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology1, locale2, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket5.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone8 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket5.setZone(dateTimeZone8);
    long long12 = dateTimeParserBucket5.computeMillis(true, "P0Y");
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(long12 == 53L);

  }

  @Test
  public void test484() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test484"); }

    org.joda.time.Months months0 = org.joda.time.Months.THREE;
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(months0);

  }

  @Test
  public void test485() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test485"); }

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
    mutableDateTime1.setMillisOfDay(999);
    org.joda.time.Chronology chronology13 = null;
    java.util.Locale locale14 = null;
    org.joda.time.format.DateTimeParserBucket dateTimeParserBucket17 = new org.joda.time.format.DateTimeParserBucket((long)'4', chronology13, locale14, (java.lang.Integer)1, (int)'a');
    dateTimeParserBucket17.setOffset((java.lang.Integer)(-1));
    org.joda.time.DateTimeZone dateTimeZone20 = org.joda.time.DateTimeZone.UTC;
    dateTimeParserBucket17.setZone(dateTimeZone20);
    org.joda.time.LocalDateTime localDateTime22 = null;
    boolean b23 = dateTimeZone20.isLocalDateTimeGap(localDateTime22);
    org.joda.time.chrono.IslamicChronology islamicChronology24 = org.joda.time.chrono.IslamicChronology.getInstance(dateTimeZone20);
    org.joda.time.MutableDateTime mutableDateTime25 = mutableDateTime1.toMutableDateTime(dateTimeZone20);
    org.joda.time.MutableDateTime.Property property26 = mutableDateTime25.era();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str4 + "' != '" + "CopticChronology[UTC]"+ "'", str4.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b23 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(islamicChronology24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property26);

  }

  @Test
  public void test486() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test486"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.MutableDateTime mutableDateTime2 = new org.joda.time.MutableDateTime((long)345, dateTimeZone1);

  }

  @Test
  public void test487() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test487"); }

    org.joda.time.DateTimeZone dateTimeZone3 = null;
    org.joda.time.chrono.CopticChronology copticChronology4 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone3);
    org.joda.time.Chronology chronology5 = copticChronology4.withUTC();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.TimeOfDay timeOfDay6 = new org.joda.time.TimeOfDay(0, 628, 78, (org.joda.time.Chronology)copticChronology4);
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology5);

  }

  @Test
  public void test488() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test488"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay(dateTimeZone0);
    org.joda.time.DateTimeFieldType[] dateTimeFieldType_array2 = timeOfDay1.getFieldTypes();
    int i3 = timeOfDay1.getMillisOfSecond();
    org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.plusSeconds((int)(byte)1);
    int i6 = timeOfDay5.getSecondOfMinute();
    org.joda.time.DateTime dateTime7 = timeOfDay5.toDateTimeToday();
    int i8 = timeOfDay5.size();
    int i9 = timeOfDay5.getMillisOfSecond();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType_array2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i3 == 692);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i8 == 4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i9 == 692);

  }

  @Test
  public void test489() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test489"); }

    org.joda.time.DateTimeZone dateTimeZone0 = null;
    org.joda.time.YearMonthDay yearMonthDay1 = new org.joda.time.YearMonthDay(dateTimeZone0);
    org.joda.time.DateMidnight dateMidnight2 = yearMonthDay1.toDateMidnight();
    org.joda.time.YearMonthDay.Property property3 = yearMonthDay1.dayOfMonth();
    org.joda.time.YearMonthDay yearMonthDay5 = yearMonthDay1.plusMonths(9);
    org.joda.time.YearMonthDay.Property property6 = yearMonthDay5.monthOfYear();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(yearMonthDay5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);

  }

  @Test
  public void test490() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test490"); }

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
    org.joda.time.LocalTime localTime22 = property20.roundHalfCeilingCopy();
    org.joda.time.LocalTime localTime24 = localTime22.withSecondOfMinute(54);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i19 == 330);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localTime24);

  }

  @Test
  public void test491() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test491"); }

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
    int i34 = offsetDateTimeField32.get((long)(short)-1);
    // The following exception was thrown during execution in test generation
    try {
    long long37 = offsetDateTimeField32.add((long)14, (int)'a');
      org.junit.Assert.fail("Expected exception of type org.joda.time.IllegalFieldValueException");
    } catch (org.joda.time.IllegalFieldValueException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str2 + "' != '" + "CopticChronology[UTC]"+ "'", str2.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "CopticChronology[UTC]"+ "'", str7.equals("CopticChronology[UTC]"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime13);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property16);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType17);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(iSOChronology19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i21 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property25);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFieldType26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeComparator27);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i28 == (-1));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i34 == 27);

  }

  @Test
  public void test492() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test492"); }

    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime1 = org.joda.time.LocalTime.parse("2017-06-06T03:57:05.949");
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }

  }

  @Test
  public void test493() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test493"); }

    org.joda.time.format.DateTimeFormatter dateTimeFormatter1 = org.joda.time.format.ISODateTimeFormat.weekyearWeekDay();
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.LocalTime localTime2 = org.joda.time.LocalTime.parse("--01-01", dateTimeFormatter1);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeFormatter1);

  }

  @Test
  public void test494() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test494"); }

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
    org.joda.time.Chronology chronology13 = null;
    org.joda.time.MutableDateTime mutableDateTime14 = new org.joda.time.MutableDateTime(chronology13);
    org.joda.time.Instant instant15 = mutableDateTime14.toInstant();
    org.joda.time.ReadableInstant readableInstant16 = null;
    boolean b17 = mutableDateTime14.isEqual(readableInstant16);
    org.joda.time.DateTime dateTime18 = mutableDateTime14.toDateTime();
    org.joda.time.DateTime.Property property19 = dateTime18.yearOfCentury();
    org.joda.time.DateTime dateTime21 = property19.addToCopy((long)365);
    org.joda.time.DateTime dateTime22 = property19.withMinimumValue();
    org.joda.time.DateTimeZone dateTimeZone23 = null;
    org.joda.time.DateMidnight dateMidnight24 = new org.joda.time.DateMidnight(dateTimeZone23);
    org.joda.time.Duration duration27 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight28 = dateMidnight24.minus((org.joda.time.ReadableDuration)duration27);
    org.joda.time.Duration duration30 = org.joda.time.Duration.standardHours((long)1);
    org.joda.time.Period period31 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateMidnight28, (org.joda.time.ReadableDuration)duration30);
    org.joda.time.Period period32 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateTime22, (org.joda.time.ReadableDuration)duration30);
    org.joda.time.DateTimeZone dateTimeZone33 = null;
    org.joda.time.chrono.CopticChronology copticChronology34 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone33);
    org.joda.time.DurationField durationField35 = copticChronology34.days();
    org.joda.time.MutableDateTime mutableDateTime36 = org.joda.time.MutableDateTime.now((org.joda.time.Chronology)copticChronology34);
    org.joda.time.DateTimeField dateTimeField37 = copticChronology34.millisOfSecond();
    mutablePeriod2.setPeriod((org.joda.time.ReadableDuration)duration30, (org.joda.time.Chronology)copticChronology34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i6 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i11 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i12 == 100);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant15);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b17 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime21);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight28);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration30);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology34);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationField35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(mutableDateTime36);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField37);

  }

  @Test
  public void test495() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test495"); }

    org.joda.time.TimeOfDay timeOfDay1 = new org.joda.time.TimeOfDay((long)14);
    org.joda.time.ReadableInterval readableInterval2 = null;
    org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
    org.joda.time.TimeOfDay timeOfDay5 = timeOfDay1.withPeriodAdded((org.joda.time.ReadablePeriod)hours3, 2000);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay5);

  }

  @Test
  public void test496() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test496"); }

    org.joda.time.MonthDay monthDay1 = new org.joda.time.MonthDay(10L);
    org.joda.time.ReadableInterval readableInterval2 = null;
    org.joda.time.Hours hours3 = org.joda.time.Hours.hoursIn(readableInterval2);
    org.joda.time.Duration duration4 = hours3.toStandardDuration();
    org.joda.time.MonthDay monthDay6 = monthDay1.withPeriodAdded((org.joda.time.ReadablePeriod)hours3, 298);
    java.lang.String str7 = monthDay6.toString();
    java.lang.String str8 = monthDay6.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(hours3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(monthDay6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str7 + "' != '" + "--01-01"+ "'", str7.equals("--01-01"));
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str8 + "' != '" + "--01-01"+ "'", str8.equals("--01-01"));

  }

  @Test
  public void test497() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test497"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.chrono.CopticChronology copticChronology2 = org.joda.time.chrono.CopticChronology.getInstance(dateTimeZone1);
    org.joda.time.Chronology chronology3 = copticChronology2.withUTC();
    org.joda.time.MonthDay monthDay4 = new org.joda.time.MonthDay((long)'a', (org.joda.time.Chronology)copticChronology2);
    int i5 = monthDay4.size();
    org.joda.time.chrono.GregorianChronology gregorianChronology7 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period8 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology7);
    boolean b9 = monthDay4.equals((java.lang.Object)100);
    org.joda.time.ReadableInstant readableInstant10 = null;
    org.joda.time.ReadableDuration readableDuration11 = null;
    org.joda.time.MutablePeriod mutablePeriod12 = new org.joda.time.MutablePeriod(readableInstant10, readableDuration11);
    org.joda.time.chrono.GregorianChronology gregorianChronology14 = org.joda.time.chrono.GregorianChronology.getInstance();
    mutablePeriod12.setPeriod((long)100, (org.joda.time.Chronology)gregorianChronology14);
    int i16 = mutablePeriod12.getWeeks();
    mutablePeriod12.setMonths(100);
    org.joda.time.Period period19 = mutablePeriod12.toPeriod();
    int i20 = period19.getYears();
    org.joda.time.DateTimeZone dateTimeZone21 = null;
    org.joda.time.TimeOfDay timeOfDay22 = new org.joda.time.TimeOfDay(dateTimeZone21);
    org.joda.time.Seconds seconds23 = org.joda.time.Seconds.TWO;
    org.joda.time.DurationFieldType durationFieldType24 = seconds23.getFieldType();
    org.joda.time.TimeOfDay timeOfDay26 = timeOfDay22.withFieldAdded(durationFieldType24, 1000);
    int i27 = period19.indexOf(durationFieldType24);
    // The following exception was thrown during execution in test generation
    try {
    org.joda.time.MonthDay monthDay29 = monthDay4.withFieldAdded(durationFieldType24, 2);
      org.junit.Assert.fail("Expected exception of type java.lang.IllegalArgumentException");
    } catch (java.lang.IllegalArgumentException e) {
      // Expected exception.
    }
    
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(copticChronology2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(chronology3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i5 == 2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology7);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b9 == false);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology14);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i16 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(period19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i20 == 0);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(durationFieldType24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(timeOfDay26);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(i27 == 6);

  }

  @Test
  public void test498() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test498"); }

    org.joda.time.DateTimeZone dateTimeZone1 = null;
    org.joda.time.LocalDateTime localDateTime2 = new org.joda.time.LocalDateTime((long)(short)100, dateTimeZone1);
    org.joda.time.LocalDateTime localDateTime4 = localDateTime2.withMillisOfDay((int)(short)0);
    org.joda.time.LocalDateTime.Property property5 = localDateTime4.dayOfYear();
    boolean b6 = org.joda.time.DateTimeUtils.isContiguous((org.joda.time.ReadablePartial)localDateTime4);
    org.joda.time.LocalDateTime localDateTime8 = localDateTime4.minusHours(843);
    org.joda.time.DateTimeField[] dateTimeField_array9 = localDateTime4.getFields();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b6 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime8);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeField_array9);

  }

  @Test
  public void test499() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test499"); }

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
    org.joda.time.DateTimeZone dateTimeZone13 = null;
    org.joda.time.DateMidnight dateMidnight14 = new org.joda.time.DateMidnight(dateTimeZone13);
    org.joda.time.Duration duration17 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight18 = dateMidnight14.minus((org.joda.time.ReadableDuration)duration17);
    org.joda.time.DateTime dateTime19 = dateTime9.plus((org.joda.time.ReadableDuration)duration17);
    org.joda.time.LocalDateTime localDateTime20 = org.joda.time.LocalDateTime.now();
    org.joda.time.LocalDateTime localDateTime22 = localDateTime20.plusSeconds(0);
    org.joda.time.LocalDateTime.Property property23 = localDateTime20.dayOfMonth();
    org.joda.time.Interval interval24 = property23.toInterval();
    boolean b25 = interval24.containsNow();
    org.joda.time.DateTimeZone dateTimeZone26 = null;
    org.joda.time.DateMidnight dateMidnight27 = new org.joda.time.DateMidnight(dateTimeZone26);
    org.joda.time.Duration duration30 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight31 = dateMidnight27.minus((org.joda.time.ReadableDuration)duration30);
    org.joda.time.Duration duration33 = org.joda.time.Duration.standardHours((long)1);
    org.joda.time.Period period34 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateMidnight31, (org.joda.time.ReadableDuration)duration33);
    org.joda.time.Interval interval35 = interval24.withDurationAfterStart((org.joda.time.ReadableDuration)duration33);
    org.joda.time.DateTimeZone dateTimeZone36 = null;
    org.joda.time.DateMidnight dateMidnight37 = new org.joda.time.DateMidnight(dateTimeZone36);
    org.joda.time.Duration duration40 = new org.joda.time.Duration((long)(short)10, (long)(short)0);
    org.joda.time.DateMidnight dateMidnight41 = dateMidnight37.minus((org.joda.time.ReadableDuration)duration40);
    org.joda.time.Duration duration43 = org.joda.time.Duration.standardHours((long)1);
    org.joda.time.Period period44 = new org.joda.time.Period((org.joda.time.ReadableInstant)dateMidnight41, (org.joda.time.ReadableDuration)duration43);
    org.joda.time.Duration duration45 = duration33.minus((org.joda.time.ReadableDuration)duration43);
    org.joda.time.Duration duration46 = duration17.minus((org.joda.time.ReadableDuration)duration33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(instant2);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b4 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime5);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property6);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime9);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(seconds10);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime12);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight18);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTime19);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime20);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(localDateTime22);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(property23);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval24);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue(b25 == true);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight31);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration33);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(interval35);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateMidnight41);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration43);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration45);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(duration46);

  }

  @Test
  public void test500() throws Throwable {

    if (debug) { System.out.format("%n%s%n","RegressionTest0.test500"); }

    org.joda.time.chrono.GregorianChronology gregorianChronology1 = org.joda.time.chrono.GregorianChronology.getInstance();
    org.joda.time.Period period2 = new org.joda.time.Period((long)100, (org.joda.time.Chronology)gregorianChronology1);
    org.joda.time.DateTimeZone dateTimeZone3 = gregorianChronology1.getZone();
    org.joda.time.DateTimeZone dateTimeZone4 = gregorianChronology1.getZone();
    java.lang.String str5 = gregorianChronology1.toString();
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(gregorianChronology1);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone3);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertNotNull(dateTimeZone4);
    
    // Regression assertion (captures the current behavior of the code)
    org.junit.Assert.assertTrue("'" + str5 + "' != '" + "GregorianChronology[UTC]"+ "'", str5.equals("GregorianChronology[UTC]"));

  }

}
