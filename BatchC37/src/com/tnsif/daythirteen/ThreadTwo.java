package com.tnsif.daythirteen;
class Num implements Runnable
{
	public void run()
	{
		System.out.println("Inside the run method");
		for(int i=1;i<=5;i++)
			System.out.println(i);
	}
}

public class ThreadTwo
{

	public static void main(String[] args)
	{
		System.out.println("Main thread is running");
		Num n=new Num();
		Thread tt=new Thread(n);
		tt.start();
		System.out.println("Ending..");
		

	}

}
