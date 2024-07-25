package com.tnsif.daythirteen;
class ThreadDemo extends Thread
{
	public void run()
	{
		System.out.println("Thread Name:"+ThreadDemo.currentThread().getName());
		System.out.println("Thread Name:"+ThreadDemo.currentThread().getPriority());
	}
}

public class ThreadFour 
{
	public static void main(String[] args)
	{
		System.out.println("current thread details:"+Thread.currentThread());
		ThreadDemo td=new ThreadDemo();
		td.start();
		td.setPriority(3);
		td.setName("JP");

	}

}
