package edu.washington.cs.dt.impact.ExampleDT;

import org.junit.Assert;
import org.junit.Test;

import edu.washington.cs.dt.impact.ExampleDT.Calculator;

public class CalculatorTestCase2 {
	/* ALL BASED ON PRIORITIZATION STATEMENT ABSOLUTE
	 * This test class represents case 2: where getSumTest is the dependent test and depends on only isEvenTest to come after it
	 * 
	 * 
	 * Orig list: getSubTest, getExpTest, (getSumTest), (isEvenTest), isNegativeTest ; PASS
	 * 
	 * New list: (isEvenTest), getExpTest, (getSumTest), isNegativeTest, getSubTest ; FAIL
	 * 
	 * Prime list: (isEvenTest), getSubTest, getExpTest, (getSumTest), isNegativeTest ; FAIL
	 * 
	 * getSumTest Independently: PASS
	 * 
	 * */
	
	 //initial values that are set in Calculator class
	 //first = 3
	 //second = 3 
	 Calculator calcObj = new Calculator();
	 
	
	//not dependent on any other tests
	//test always passes
	@Test
	public void getSubTest(){
		
		Assert.assertNotNull(calcObj.getSub());
	}
	
	//not dependent on any other tests
	//test always passes
	@Test
	public void getExpTest(){
		
		Assert.assertNotNull(calcObj.getExp());
	}
	
	//dependent on isEvenTest
	//test passes when ran in original order and independently, fails if isEvenTest comes before
	//this test checks if the sum of 'first' and 'second' equals 6
	@Test
	public void getSumTest() {
		Assert.assertEquals(6, calcObj.getSum());
		
	}
	
	//not dependent on any other tests
	//test always passes, but sets calculator.second
	@Test
	public void isEvenTest(){
		
		Calculator.second = 1;
		
		Assert.assertEquals(true, calcObj.isEven(2));
	}
	
	//not dependent on any other tests
	//test always passes
	@Test
	public void isNegativeTest(){
		Assert.assertEquals(true, calcObj.isNegative(-4));
	}

}
