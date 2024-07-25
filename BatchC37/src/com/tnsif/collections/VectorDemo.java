package com.tnsif.collections;

import java.util.Vector;
import java.util.Iterator;

public class VectorDemo
{

	public static void main(String[] args)
	{
		Vector<String> animals=new Vector<>();
		animals.add("Dog");
		animals.add("Horse");
		animals.add("Cat");
		
		System.out.println("Initial Vector:"+animals);
		String element=animals.get(2);
		System.out.println("Element at index 2:"+element);
		Iterator<String> iterate=animals.iterator();
		while(iterate.hasNext())
		{
			System.out.println(iterate.next());
			System.out.println("");
			
		}
		element=animals.remove(1);
		System.out.println("Removed Element:"+element);
		System.out.println("New Vector:"+animals);

	}
}
