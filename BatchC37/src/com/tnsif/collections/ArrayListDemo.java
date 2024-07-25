package com.tnsif.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ArrayListDemo
{

	public static void main(String[] args) 
	{
		ArrayList list1=new ArrayList();
		System.out.println("size:"+list1.size());
		System.out.println("Is list empty?"+list1.isEmpty());
        
		list1.add(10);
		list1.add(20);
		list1.add(true);
		list1.add(false);
		list1.add(20);
		list1.add("Hello");
		list1.add(56.78);
		list1.add(20);
		list1.add('M');
		list1.add(5,"Hi");
		list1.add(20);
		
		System.out.println("List is" +list1);
		System.out.println("Is list contain 20?" +list1.contains(20));
		
		list1.remove(false);
		System.out.println("List is" +list1);
		
		
	}

}
