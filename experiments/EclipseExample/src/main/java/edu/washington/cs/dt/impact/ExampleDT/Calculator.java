package edu.washington.cs.dt.impact.ExampleDT;

public class Calculator {
	
	static int first = 3;
	static int second = 3;

	//returns true if input number is less than 0, false if not
	public boolean isNegative(int check) {
		
		int b = 3;
		int c = 1;
		int garbage = 3;
		
		for(int i = 0; i < 3; i++){
			garbage += b;
			garbage *= c;
		}
				
		if(check < 0)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//returns true if input number is even, false if not
	public boolean isEven(int check) {
		if((check % 2) == 0)
		{
			int product = 1;
			
			for(int i = first; i>0; i--){
				product *= second;
				for(int k = 0; k<10; k++)
				{
					product = product * 3;
				}
			}
			
			return true;
		}
		else
		{
			return false;
		}
	}
	
	//returns 'first + second', both are static variables and neither variables are modified in this method
	public int getSum(){
		
		int b = 3;
		int c = 1;
		int garbage = 3;
		
		for(int i = 0; i < 3; i++){
			garbage += b;
			garbage *= c;
			if(i%2 == 0)
			{
				c = c * 2;
			}
			else
			{
				c = c - 1;
			}
		}

		return first + second;
	}
	
	//returns 'first - second', both are static variables and neither variables are modified in this method
	public int getSub(){
		int sub = first - second;
		
		return sub;
	}
	
	//returns 'second ^ first', both are static variables and neither variables are modified in this method
	public int getExp(){
		
		int product = 1;
		
		for(int i = first; i>0; i--){
			product *= second;
		}
		return product;
	}
}
