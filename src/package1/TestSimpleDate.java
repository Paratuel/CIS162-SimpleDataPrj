package package1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSimpleDate {
	
	//Testing SimpleDate(int, int, int)  
	
//	@Test (expected = IllegalArgumentException.class)
//    public void testFeb29(){
//    	new SimpleDate(29, 2, 2000); 			
//    }
		
	@Test (expected = IllegalArgumentException.class)
    public void testIncorrectDay(){
    	new SimpleDate(-3, 1, 2013); 			
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectYear() {
        new SimpleDate(3, 1, 1700);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectMonth() {
        new SimpleDate(3, -1, 2000);
    }
    
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectMonthMax() {
		new SimpleDate(1, 13, 2000);
	}
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayJan(){
    	new SimpleDate(32, 1, 2033);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayFebNotLeap(){
    	new SimpleDate(29, 2, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayFebLeap(){
    	new SimpleDate(30, 2, 2000);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayMarch(){
    	new SimpleDate(32, 3, 2001);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayApril(){
    	new SimpleDate(31, 4, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayMay(){
    	new SimpleDate(32, 5, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayJune(){
    	new SimpleDate(31, 6, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayJuly(){
    	new SimpleDate(32, 7, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayAug(){
    	new SimpleDate(32, 8, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDaySept(){
    	new SimpleDate(31, 9, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayOct(){
    	new SimpleDate(32, 10, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayNov(){
    	new SimpleDate(31, 11, 2001);
    }
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectDayDec(){
    	new SimpleDate(32, 12, 2001);
    }
    
    //Test SimpleDate(other)
    
//	@Test (expected = IllegalArgumentException.class)
//  public void testFeb29(){
//  	new SimpleDate(29, 2, 2000); 			
//  }
//		
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectOtherDay(){
		SimpleDate d1 = new SimpleDate(-3, 1, 2013);
		new SimpleDate(d1);
	}
  
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectOtherYear() {
		SimpleDate d1 = new SimpleDate(3, 1, 1700);
		new SimpleDate(d1);
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectOtherMonth() {
		SimpleDate d1 = new SimpleDate(3, -1, 2000);
		new SimpleDate(d1);
	}
    
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectOtherMonthMax() {
		SimpleDate d1 = new SimpleDate(1, 13, 2000);
		new SimpleDate(d1);
	}
  
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectOtherDayJan(){
		SimpleDate d1 = new SimpleDate(32, 1, 2033);
		new SimpleDate(d1);
	}
  
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectOtherDayFebNotLeap(){
		SimpleDate d1 = new SimpleDate(29, 2, 2001);
		new SimpleDate(d1);
	}
    
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayFebLeap(){
    	SimpleDate d1 = new SimpleDate(30, 2, 2000);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayMarch(){
    	SimpleDate d1 = new SimpleDate(32, 3, 2001);
    	new SimpleDate(d1);
    }

    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayApril(){
    	SimpleDate d1 = new SimpleDate(31, 4, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayMay(){
    	SimpleDate d1 = new SimpleDate(32, 5, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayJune(){
    	SimpleDate d1 = new SimpleDate(31, 6, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayJuly(){
    	SimpleDate d1 = new SimpleDate(32, 7, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayAug(){
    	SimpleDate d1 = new SimpleDate(32, 8, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDaySept(){
    	SimpleDate d1 = new SimpleDate(31, 9, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayOct(){
    	SimpleDate d1 = new SimpleDate(32, 10, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayNov(){
    	SimpleDate d1 = new SimpleDate(31, 11, 2001);
    	new SimpleDate(d1);
    }
  
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectOtherDayDec(){
    	SimpleDate d1 = new SimpleDate(32, 12, 2001);
    	new SimpleDate(d1);
    }    
   
    //Test SimpleDate(String)

//	@Test (expected = IllegalArgumentException.class)
//	public void testFeb29(){
//		new SimpleDate(29, 2, 2000); 			
//	}
		
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDay(){
		new SimpleDate("3/-1/2013"); 			
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringYear() {
		new SimpleDate("3/1/1700");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringMonth() {
		new SimpleDate("-3/1/2000");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringMonthMax() {
		new SimpleDate("13/1/2000");
	}


	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayJan(){
		new SimpleDate("1/32/2033");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayFebNotLeap(){
		new SimpleDate("2/29/2001");
	}
	
    @Test (expected = IllegalArgumentException.class)
    public void testIncorrectStringDayFebLeap(){
    	new SimpleDate("2/30/2000");
    }

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayMarch(){
		new SimpleDate("3/32/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayApril(){
		new SimpleDate("4/31/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayMay(){
		new SimpleDate("5/32/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayJune(){
		new SimpleDate("6/31/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayJuly(){
		new SimpleDate("7/32/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayAug(){
		new SimpleDate("8/32/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDaySept(){
		new SimpleDate("9/31/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayOct(){
		new SimpleDate("10/32/2001");
	}

	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayNov(){
		new SimpleDate("11/31/2001");
	}
	
	@Test (expected = IllegalArgumentException.class)
	public void testIncorrectStringDayDec(){
		new SimpleDate("12/32/2001");
	}    

    //Test equals
    @Test
    public void testEqualsFalse() {
        SimpleDate d1 = new SimpleDate("3/1/2013");
        SimpleDate d2 = new SimpleDate("8/21/2000");
        assertFalse(d1.equals(d2));
    }
    
    @Test
    public void testEqualsTrue() {
    	SimpleDate d1 = new SimpleDate("8/11/1994");
    	SimpleDate d2 = new SimpleDate("8/11/1994");
    	assertTrue(d1.equals(d2));
    }
    
    @Test
    public void testEqualsFalseInt(){
    	SimpleDate d1 = new SimpleDate(1, 3, 2013);
    	SimpleDate d2 = new SimpleDate(5, 7, 1988);
    	assertFalse(d1.equals(d2));
    }
    
    @Test
    public void testEqualsTrueInt(){
    	SimpleDate d1 = new SimpleDate(18, 11, 1995);
    	SimpleDate d2 = new SimpleDate(18, 11, 1995);
    	assertTrue(d1.equals(d2));
    }

    //Test compareTo
    @Test
    public void testCompareToGreaterTrue()  {
        SimpleDate d1 = new SimpleDate("3/1/2013");
        SimpleDate d2 = new SimpleDate("8/21/2000");
        assertTrue(d1.compareTo(d2) > 0);
    }
    
    @Test
    public void testCompareToGreaterFalse()  {
        SimpleDate d1 = new SimpleDate("3/1/2013");
        SimpleDate d2 = new SimpleDate("8/21/2000");
        assertFalse(d1.compareTo(d2) < 0);
    }
    
    
    @Test
    public void testCompareToLessTrue()  {
        SimpleDate d1 = new SimpleDate("8/21/2000");
        SimpleDate d2 = new SimpleDate("3/1/2013");
        assertTrue(d1.compareTo(d2) < 0);
    }	
    
    //Test isLeapYear
    @Test
    public void testIsNotLeapYear()  {
        SimpleDate d = new SimpleDate("3/1/2013");
        assertFalse(d.isLeapYear());
    }

    @Test
    public void testIsLeapYear() {
        SimpleDate d  =  new SimpleDate("3/1/2000");
        assertTrue(d.isLeapYear());
    }
    
    //Test ordinalDate
    @Test
    public void testOrdinalJan() {
    	SimpleDate d = new SimpleDate(10, 1, 2012);
    	int temp = 10;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalFeb() {
    	SimpleDate d = new SimpleDate(10, 2, 2012);
    	int temp = 41;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalFeb29() {
    	SimpleDate d = new SimpleDate(29, 2, 2012);
    	int temp = 60;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalMar() {
    	SimpleDate d = new SimpleDate(10, 3, 2011);
    	int temp = 69;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalMarLeap() {
    	SimpleDate d = new SimpleDate(10, 3, 2012);
    	int temp = 70;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalApril() {
    	SimpleDate d = new SimpleDate(10, 4, 2013);
    	int temp = 100;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalAprilLeap() {
    	SimpleDate d = new SimpleDate(10, 4, 2012);
    	int temp = 101;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalMay() {
    	SimpleDate d = new SimpleDate(10, 5, 2013);
    	int temp = 130;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalMayLeap() {
    	SimpleDate d = new SimpleDate(10, 5, 2012);
    	int temp = 131;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalJune() {
    	SimpleDate d = new SimpleDate(10, 6, 2013);
    	int temp = 161;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalJuneLeap() {
    	SimpleDate d = new SimpleDate(10, 6, 2012);
    	int temp = 162;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalJuly() {
    	SimpleDate d = new SimpleDate(10, 7, 2013);
    	int temp = 191;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalJulyLeap() {
    	SimpleDate d = new SimpleDate(10, 7, 2012);
    	int temp = 192;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalAug() {
    	SimpleDate d = new SimpleDate(10, 8, 2013);
    	int temp = 222;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalAugLeap() {
    	SimpleDate d = new SimpleDate(10, 8, 2012);
    	int temp = 223;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalSept() {
    	SimpleDate d = new SimpleDate(10, 9, 2013);
    	int temp = 253;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalSeptLeap() {
    	SimpleDate d = new SimpleDate(10, 9, 2012);
    	int temp = 254;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalOct() {
    	SimpleDate d = new SimpleDate(10, 10, 2013);
    	int temp = 283;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalOctLeap() {
    	SimpleDate d = new SimpleDate(10, 10, 2012);
    	int temp = 284;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalNov() {
    	SimpleDate d = new SimpleDate(10, 11, 2013);
    	int temp = 314;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalNovLeap() {
    	SimpleDate d = new SimpleDate(10, 11, 2012);
    	int temp = 315;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalDec() {
    	SimpleDate d = new SimpleDate(10, 12, 2013);
    	int temp = 344;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    @Test
    public void testOrdinalDecLeap() {
    	SimpleDate d = new SimpleDate(10, 12, 2012);
    	int temp = 345;
    	assertEquals(d.ordinalDate(),temp);
    }
    
    
    //Test increment 
    @Test
    public void testIncrement(){
    	SimpleDate d1 = new SimpleDate(1, 1, 2000);
    	SimpleDate d2 = new SimpleDate(2, 1, 2000);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementJan(){
    	SimpleDate d1 = new SimpleDate(31, 1, 2000);
    	SimpleDate d2 = new SimpleDate(1, 2, 2000);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementFeb(){
    	SimpleDate d1 = new SimpleDate(28, 2, 2001);
    	SimpleDate d2 = new SimpleDate(1, 3, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementFeb29(){
    	SimpleDate d1 = new SimpleDate(28, 2, 2000);
    	SimpleDate d2 = new SimpleDate(29, 2, 2000);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementFebLeap(){
    	SimpleDate d1 = new SimpleDate(29, 2, 2000);
    	SimpleDate d2 = new SimpleDate(1, 3, 2000);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementMar(){
    	SimpleDate d1 = new SimpleDate(31, 3, 2001);
    	SimpleDate d2 = new SimpleDate(1, 4, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementApril(){
    	SimpleDate d1 = new SimpleDate(30, 4, 2001);
    	SimpleDate d2 = new SimpleDate(1, 5, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementMay(){
    	SimpleDate d1 = new SimpleDate(31, 5, 2001);
    	SimpleDate d2 = new SimpleDate(1, 6, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementJune(){
    	SimpleDate d1 = new SimpleDate(30, 6, 2001);
    	SimpleDate d2 = new SimpleDate(1, 7, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementJuly(){
    	SimpleDate d1 = new SimpleDate(31, 7, 2001);
    	SimpleDate d2 = new SimpleDate(1, 8, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementAug(){
    	SimpleDate d1 = new SimpleDate(31, 8, 2001);
    	SimpleDate d2 = new SimpleDate(1, 9, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementSept(){
    	SimpleDate d1 = new SimpleDate(30, 9, 2001);
    	SimpleDate d2 = new SimpleDate(1, 10, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementOct(){
    	SimpleDate d1 = new SimpleDate(31, 10, 2001);
    	SimpleDate d2 = new SimpleDate(1, 11, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementNov(){
    	SimpleDate d1 = new SimpleDate(30, 11, 2001);
    	SimpleDate d2 = new SimpleDate(1, 12, 2001);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testIncrementDec(){
    	SimpleDate d1 = new SimpleDate(31, 12, 2001);
    	SimpleDate d2 = new SimpleDate(1, 1, 2002);
    	d1.increment();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    
    //Test toString
    
    @Test
    public void testToStringInt()  {
        SimpleDate d = new SimpleDate(12, 3, 2013);
        assertEquals("12 March 2013",d.toString());
    }
    
    @Test
    public void testToStringTestingZero(){
        SimpleDate d =  new SimpleDate("1/3/2013");
        assertEquals("03 January 2013",d.toString());
    }
    
    //Test getNumberofSimpleDates

    @Test
    public void testgetNumberofSimpleDatesInt() {
    	SimpleDate.reset();
    	new SimpleDate(18, 11, 1995);
    	new SimpleDate(11, 8, 1994);
    	new SimpleDate(4, 9, 1994);
    	assertEquals(SimpleDate.getNumberOfSimpleDates(), 3);
    }
    
    @Test
    public void testgetNumbersofSimpleDatesString() {
    	SimpleDate.reset();
    	new SimpleDate("11/18/1995");
    	new SimpleDate("8/11/1994");
    	assertEquals(SimpleDate.getNumberOfSimpleDates(), 2);
    }
    
    @Test
    public void testgetNumberofSimpleDates() {
    	SimpleDate.reset();
    	new SimpleDate();
    	new SimpleDate();
    	new SimpleDate();
    	new SimpleDate();
    	assertEquals(SimpleDate.getNumberOfSimpleDates(), 4);
    }

    //Test Save and Load
    
    @Test
    public void testSaveAndLoad(){
    	SimpleDate s1 = new SimpleDate(11, 8, 1994);
    	s1.save("sltest");
    	s1 = new SimpleDate(18, 11, 1995);
    	s1.load("sltest");
    	SimpleDate s2 = new SimpleDate(11 ,8, 1994);
    	assertTrue(s1 == s2);
    }
    
    //Test decrement
    @Test
    public void testDecrement(){
    	SimpleDate d1 = new SimpleDate(2, 1, 2000);
    	SimpleDate d2 = new SimpleDate(1, 1, 2000);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementJan(){
    	SimpleDate d1 = new SimpleDate(1, 2, 2000);
    	SimpleDate d2 = new SimpleDate(31, 1, 2000);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementFeb(){
    	SimpleDate d1 = new SimpleDate(1, 3, 2001);
    	SimpleDate d2 = new SimpleDate(28, 2, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementFeb29(){
    	SimpleDate d1 = new SimpleDate(29, 2, 2000);
    	SimpleDate d2 = new SimpleDate(28, 2, 2000);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementFebLeap(){
    	SimpleDate d1 = new SimpleDate(1, 3, 2000);
    	SimpleDate d2 = new SimpleDate(29, 2, 2000);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementMar(){
    	SimpleDate d1 = new SimpleDate(1, 4, 2001);
    	SimpleDate d2 = new SimpleDate(31, 3, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementApril(){
    	SimpleDate d1 = new SimpleDate(1, 5, 2001);
    	SimpleDate d2 = new SimpleDate(30, 4, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementMay(){
    	SimpleDate d1 = new SimpleDate(1, 6, 2001);
    	SimpleDate d2 = new SimpleDate(31, 5, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementJune(){
    	SimpleDate d1 = new SimpleDate(1, 7, 2001);
    	SimpleDate d2 = new SimpleDate(30, 6, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementJuly(){
    	SimpleDate d1 = new SimpleDate(1, 8, 2001);
    	SimpleDate d2 = new SimpleDate(31, 7, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementAug(){
    	SimpleDate d1 = new SimpleDate(1, 9, 2001);
    	SimpleDate d2 = new SimpleDate(31, 8, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementSept(){
    	SimpleDate d1 = new SimpleDate(1, 10, 2001);
    	SimpleDate d2 = new SimpleDate(30, 9, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementOct(){
    	SimpleDate d1 = new SimpleDate(1, 11, 2001);
    	SimpleDate d2 = new SimpleDate(31, 10, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementNov(){
    	SimpleDate d1 = new SimpleDate(1, 12, 2001);
    	SimpleDate d2 = new SimpleDate(30, 11, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    @Test
    public void testDecrementDec(){
    	SimpleDate d1 = new SimpleDate(1, 1, 2002);
    	SimpleDate d2 = new SimpleDate(31, 12, 2001);
    	d1.decrement();
    	assertEquals(d1.toString(),d2.toString());
    }
    
    //Test daysFromNow
    @Test
    public void testdaysFromNow(){
    	SimpleDate s1 = new SimpleDate("8/11/1994");
    	SimpleDate s2 = new SimpleDate("8/13/1994");
    	SimpleDate temp = s1.daysFromNow(2);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowJan(){
    	SimpleDate s1 = new SimpleDate("1/31/1994");
    	SimpleDate s2 = new SimpleDate("2/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowFeb(){
    	SimpleDate s1 = new SimpleDate("2/28/1994");
    	SimpleDate s2 = new SimpleDate("3/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowFebLeap(){
    	SimpleDate s1 = new SimpleDate("2/28/2000");
    	SimpleDate s2 = new SimpleDate("3/1/2000");
    	SimpleDate temp = s1.daysFromNow(2);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowMar(){
    	SimpleDate s1 = new SimpleDate("3/31/1994");
    	SimpleDate s2 = new SimpleDate("4/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowApril(){
    	SimpleDate s1 = new SimpleDate("4/30/1994");
    	SimpleDate s2 = new SimpleDate("5/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowMay(){
    	SimpleDate s1 = new SimpleDate("5/31/1994");
    	SimpleDate s2 = new SimpleDate("6/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowJune(){
    	SimpleDate s1 = new SimpleDate("6/30/1994");
    	SimpleDate s2 = new SimpleDate("7/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowJuly(){
    	SimpleDate s1 = new SimpleDate("7/31/1994");
    	SimpleDate s2 = new SimpleDate("8/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowAug(){
    	SimpleDate s1 = new SimpleDate("8/31/1994");
    	SimpleDate s2 = new SimpleDate("9/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowSept(){
    	SimpleDate s1 = new SimpleDate("9/30/1994");
    	SimpleDate s2 = new SimpleDate("10/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowOct(){
    	SimpleDate s1 = new SimpleDate("10/31/1994");
    	SimpleDate s2 = new SimpleDate("11/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowNov(){
    	SimpleDate s1 = new SimpleDate("11/30/1994");
    	SimpleDate s2 = new SimpleDate("12/1/1994");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowDec(){
    	SimpleDate s1 = new SimpleDate("12/31/1994");
    	SimpleDate s2 = new SimpleDate("1/1/1995");
    	SimpleDate temp = s1.daysFromNow(1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowJanNeg(){
    	SimpleDate s1 = new SimpleDate("2/1/1994");
    	SimpleDate s2 = new SimpleDate("1/31/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowFebNeg(){
    	SimpleDate s1 = new SimpleDate("3/1/1994");
    	SimpleDate s2 = new SimpleDate("2/28/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowFebLeapNeg(){
    	SimpleDate s1 = new SimpleDate("3/1/2000");
    	SimpleDate s2 = new SimpleDate("2/29/2000");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowMarNeg(){
    	SimpleDate s1 = new SimpleDate("4/1/1994");
    	SimpleDate s2 = new SimpleDate("3/31/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowAprilNeg(){
    	SimpleDate s1 = new SimpleDate("5/1/1994");
    	SimpleDate s2 = new SimpleDate("4/30/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowMayNeg(){
    	SimpleDate s1 = new SimpleDate("6/1/1994");
    	SimpleDate s2 = new SimpleDate("5/31/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowJuneNeg(){
    	SimpleDate s1 = new SimpleDate("7/1/1994");
    	SimpleDate s2 = new SimpleDate("6/30/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowJulyNeg(){
    	SimpleDate s1 = new SimpleDate("8/1/1994");
    	SimpleDate s2 = new SimpleDate("7/31/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowAugNeg(){
    	SimpleDate s1 = new SimpleDate("9/1/1994");
    	SimpleDate s2 = new SimpleDate("8/31/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowSeptNeg(){
    	SimpleDate s1 = new SimpleDate("10/1/1994");
    	SimpleDate s2 = new SimpleDate("9/30/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowOctNeg(){
    	SimpleDate s1 = new SimpleDate("11/1/1994");
    	SimpleDate s2 = new SimpleDate("10/31/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowNovNeg(){
    	SimpleDate s1 = new SimpleDate("10/1/1994");
    	SimpleDate s2 = new SimpleDate("11/30/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowDecNeg(){
    	SimpleDate s1 = new SimpleDate("1/1/1995");
    	SimpleDate s2 = new SimpleDate("12/31/1994");
    	SimpleDate temp = s1.daysFromNow(-1);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowYear(){
    	SimpleDate s1 = new SimpleDate("8/11/1994");
    	SimpleDate s2 = new SimpleDate("8/11/1995");
    	SimpleDate temp = s1.daysFromNow(365);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowYearNeg(){
    	SimpleDate s1 = new SimpleDate("8/11/1995");
    	SimpleDate s2 = new SimpleDate("8/11/1994");
    	SimpleDate temp = s1.daysFromNow(-365);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowYearLeap(){
    	SimpleDate s1 = new SimpleDate("8/11/2000");
    	SimpleDate s2 = new SimpleDate("8/11/2001");
    	SimpleDate temp = s1.daysFromNow(366);
    	assertEquals(temp, s2);
    }
    
    @Test
    public void testdaysFromNowYearLeapNeg(){
    	SimpleDate s1 = new SimpleDate("8/11/2001");
    	SimpleDate s2 = new SimpleDate("8/11/2000");
    	SimpleDate temp = s1.daysFromNow(-366);
    	assertEquals(temp, s2);
    }
    
    
    //Test daysSince
    @Test
    public void testdaysSince(){
    	SimpleDate s = new SimpleDate("1/2/1994");
    	SimpleDate d1 = new SimpleDate("1/4/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 2);
    }
    
    @Test
    public void testdaysSinceJan(){
    	SimpleDate s = new SimpleDate("1/31/1994");
    	SimpleDate d1 = new SimpleDate("2/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceFebLeap(){
    	SimpleDate s = new SimpleDate("2/28/2000");
    	SimpleDate d1 = new SimpleDate("3/1/2000");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 2);
    }
    
    @Test
    public void testdaysSinceFeb(){
    	SimpleDate s = new SimpleDate("2/28/1994");
    	SimpleDate d1 = new SimpleDate("3/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceMar(){
    	SimpleDate s = new SimpleDate("3/31/1994");
    	SimpleDate d1 = new SimpleDate("4/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceApril(){
    	SimpleDate s = new SimpleDate("4/30/1994");
    	SimpleDate d1 = new SimpleDate("5/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceMay(){
    	SimpleDate s = new SimpleDate("5/31/1994");
    	SimpleDate d1 = new SimpleDate("6/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceJune(){
    	SimpleDate s = new SimpleDate("6/30/1994");
    	SimpleDate d1 = new SimpleDate("7/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceJuly(){
    	SimpleDate s = new SimpleDate("7/31/1994");
    	SimpleDate d1 = new SimpleDate("8/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceAug(){
    	SimpleDate s = new SimpleDate("8/31/1994");
    	SimpleDate d1 = new SimpleDate("9/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceSept(){
    	SimpleDate s = new SimpleDate("9/30/1994");
    	SimpleDate d1 = new SimpleDate("10/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceOct(){
    	SimpleDate s = new SimpleDate("10/31/1994");
    	SimpleDate d1 = new SimpleDate("11/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceNov(){
    	SimpleDate s = new SimpleDate("11/30/1994");
    	SimpleDate d1 = new SimpleDate("12/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceDec(){
    	SimpleDate s = new SimpleDate("12/31/1994");
    	SimpleDate d1 = new SimpleDate("1/1/1995");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 1);
    }
    
    @Test
    public void testdaysSinceNeg(){
    	SimpleDate s = new SimpleDate("1/2/1994");
    	SimpleDate d1 = new SimpleDate("1/1/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegJan(){
    	SimpleDate s = new SimpleDate("2/1/1994");
    	SimpleDate d1 = new SimpleDate("1/31/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegFeb(){
    	SimpleDate s = new SimpleDate("3/1/1994");
    	SimpleDate d1 = new SimpleDate("2/28/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegFebLeap(){
    	SimpleDate s = new SimpleDate("3/1/2000");
    	SimpleDate d1 = new SimpleDate("2/29/2000");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegMar(){
    	SimpleDate s = new SimpleDate("4/1/1994");
    	SimpleDate d1 = new SimpleDate("3/31/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegApril(){
    	SimpleDate s = new SimpleDate("5/1/1994");
    	SimpleDate d1 = new SimpleDate("4/30/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegMay(){
    	SimpleDate s = new SimpleDate("6/1/1994");
    	SimpleDate d1 = new SimpleDate("5/31/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegJune(){
    	SimpleDate s = new SimpleDate("7/1/1994");
    	SimpleDate d1 = new SimpleDate("6/30/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegJuly(){
    	SimpleDate s = new SimpleDate("8/1/1994");
    	SimpleDate d1 = new SimpleDate("7/31/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegAug(){
    	SimpleDate s = new SimpleDate("9/1/1994");
    	SimpleDate d1 = new SimpleDate("8/31/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegSept(){
    	SimpleDate s = new SimpleDate("10/1/1994");
    	SimpleDate d1 = new SimpleDate("9/30/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegOct(){
    	SimpleDate s = new SimpleDate("11/1/1994");
    	SimpleDate d1 = new SimpleDate("10/31/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegNov(){
    	SimpleDate s = new SimpleDate("12/1/1994");
    	SimpleDate d1 = new SimpleDate("11/30/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    @Test
    public void testdaysSinceNegDec(){
    	SimpleDate s = new SimpleDate("1/1/1995");
    	SimpleDate d1 = new SimpleDate("12/31/1994");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -1);
    }
    
    public void testdaysSinceYear(){
    	SimpleDate s = new SimpleDate("1/1/1995");
    	SimpleDate d1 = new SimpleDate("1/1/1996");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 365);
    }
    
    public void testdaysSinceLeapYear(){
    	SimpleDate s = new SimpleDate("1/1/2000");
    	SimpleDate d1 = new SimpleDate("1/1/2001");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, 366);
    }
    
    public void testdaysSinceYearNeg(){
    	SimpleDate s = new SimpleDate("1/1/1996");
    	SimpleDate d1 = new SimpleDate("1/1/1995");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -365);
    }
    
    public void testdaysSinceYearLeapNeg(){
    	SimpleDate s = new SimpleDate("1/1/2001");
    	SimpleDate d1 = new SimpleDate("1/1/2000");
    	SimpleDate d2 = new SimpleDate(d1);
    	int t = s.daysSince(d2);
    	assertEquals(t, -366);
    }
}