package edu.washington.cs.dt.impact.ExampleDT;

import org.junit.Assert;
import org.junit.Test;

import edu.washington.cs.dt.impact.ExampleDT.Calculator;

public class CalculatorTestCase1 {
	/* ALL BASED ON PRIORITIZATION STATEMENT ABSOLUTE
	 * This test class represents case 1: where getSumTest is the dependent test and depends on only getSubTest to come before it
	 * 
	 * 
	 * Orig list: (getSubTest), getExpTest, (getSumTest), isEvenTest, isNegativeTest ; PASS
	 * 
	 * New list: isEvenTest, getExpTest, (getSumTest), isNegativeTest, (getSubTest) ; FAIL
	 * 
	 * Prime list: isEvenTest, (getSubTest), getExpTest, (getSumTest), isNegativeTest ; PASS
	 * 
	 * getSumTest Independently: FAIL - result of running independently does not matter in this case
	 * 
	 * */
	
	 //initial values that are set
	 //first = 3
	 //second = 3 
	 Calculator calcObj = new Calculator();
	 
	
	//not dependent on any other tests
	//test always passes, but sets calculator.second
	@Test
	public void getSubTest(){
		Calculator.second = 1;
		
		Assert.assertEquals(0, 0);
	}
	
	//not dependent on any other tests
	//test always passes
	@Test
	public void getExpTest(){
		
		Assert.assertNotNull(calcObj.getExp());
	}
	
	//dependent on getSubTest
	//test passes when ran after getSubTest, fails otherwise
	//this test checks if the sum of 'first' and 'second' equals 4
	@Test
	public void getSumTest() {
		Assert.assertEquals(4, calcObj.getSum());
		
	}
	
	//not dependent on any other tests
	//test always passes
	@Test
	public void isEvenTest(){
		Assert.assertEquals(true, calcObj.isEven(2));
	}
	
	//not dependent on any other tests
	//test always passes
	@Test
	public void isNegativeTest(){
		Assert.assertEquals(true, calcObj.isNegative(-4));
	}

}
