package com.tnsif.lambdaexpression;

public class LambdaExpWithParameter 
{

	public static void main(String[] args) 
	{
		Message m1=(name)->{
			System.out.println("Hello"+name);
			};
			m1.greet("Murugeshwari");
			
	}

}
