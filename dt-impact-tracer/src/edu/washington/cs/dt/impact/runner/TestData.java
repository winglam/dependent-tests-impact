package edu.washington.cs.dt.impact.runner;

/*
 * This class is used to store information about allDTList
 * The information includes: the dependentTest, the independentTest, intended behavior, and revealed behavior
 * 
 * A toString method is also provided to output the data in the same format as the printDependence method in 
 * the DependentTestFinder class
 */

public class TestData {

	String depTest;
	boolean intended;
	String indTest;
	boolean revealed;
	
	public TestData(String depTest, boolean intended, String indTest, boolean revealed)
	{
		this.depTest = depTest;
		this.intended = intended;
		this.indTest = indTest;
		this.revealed = revealed;
	}
	
	public String toString()
	{
		String intendedString;
		String revealedString;
		if(intended)
		{
			intendedString = "PASS";
		}
		else
		{
			intendedString = "FAILURE";
		}
		if(revealed)
		{
			revealedString = "PASS";
		}
		else
		{
			revealedString = "FAILURE";
		}
		String concatenatedOutput = "Test: "+depTest+"\n"+
									"Intended behavior: "+intendedString+"\n"+
									"when executed after: ["+indTest+"]"+"\n"+
									"The revealed different behavior: "+revealedString+"\n"+
									"when executed after: []\n";
		return concatenatedOutput;
	}
}
