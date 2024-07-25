package com.tnsif.lambdaexpression;

public class AdditionTwoNumber 
{

	public static void main(String[] args) 
	{
		Addition a1=(a,b)->{
			System.out.println("Addition Number"+(a+b));
			
		};
		a1.add(10,32);

	}

}
