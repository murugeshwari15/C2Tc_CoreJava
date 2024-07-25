package com.tnsif.daythirteen;
public class ThreadOne extends Thread
{
	public void run()
	{
		for(int i=0;i<=5;i++)
		{
			System.out.println(i);
		}
	    	
	}
	
public static void main(String[] args) 
{
	ThreadOne tt=new ThreadOne();
	tt.run();
		

}

}
