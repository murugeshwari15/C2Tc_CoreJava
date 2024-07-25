package com.tnsif.daythirteen;
class MyThread extends Thread
{
	public void run()
	{
		System.out.println("Inside the run method:"+this.isAlive());
		for(int i=0;i<=4;i++)
		{
			System.out.println(i);
			System.out.println("Inside the run method:"+this.isAlive());
			try
			{
				sleep(400);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
	}
}

public class ThreadThree
{

	public static void main(String[] args)
	{
		MyThread to=new MyThread();
		System.out.println("Inside the run method:"+to.isAlive());
		to.start();
		try
		{
			Thread.sleep(5000);
		}
		catch(InterruptedException e)
		{
			System.out.println(e);
		}
		
		System.out.println("After execution:"+to.isAlive());
	}

}
