package com.tnsif.streamAPI;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;
public class JavaStreamDemo 
{
	
	public static void main(String[] args) 
	{
		filterExample();
		mapExample();
        flatmapExample();
	}
	public static void filterExample()
	{
		List<Integer> list=Arrays.asList(3,4,7,21,20,25);
		list.stream()
		    .filter(num -> num %5 == 0)	
		    .forEach(System.out::println);
	}
	public static void mapExample()
	{
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<Integer>result=list
				.stream()
				.map(x->x*2)
				.collect(Collectors.toList());
		System.out.println(result);
		}
	public static void flatmapExample()
	{
		List<Integer>list=new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		List<Integer>result=list
				.stream()
				.flatMap(x->Stream.of(x,x*x))
				.collect(Collectors.toList());
		System.out.println(result);
	}

}
