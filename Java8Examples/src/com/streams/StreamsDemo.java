package com.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	
	
	public static void main(String[] args) {
		
		ArrayList<Integer> al = new ArrayList<>(Arrays.asList(10,20,30,40,50));
		System.out.println(al);
		
		
		//Code for print greater than 20
		List<Integer> collect = al.stream().filter(i->i>20).collect(Collectors.toList());
		System.out.println(collect);
		
		//Add 5 value to each object and print
		List<Integer> collect2 = al.stream().map(i->i+5).collect(Collectors.toList());
		System.out.println(collect2);
		
		
		//making stream of object
		Stream<Integer> s = Stream.of(1,2,3,4,5);
		Object[] array = s.toArray();
		for(Object b:array)
			System.out.print(b + " ");
		
		System.out.println("");
		
		//count method
		Stream<Integer> s1 = Stream.of(1,2,3,4,5);
		System.err.println(s1.count());
		
		//forEach()
		Stream<Integer> s2=Stream.of(1,2,3,4,5,6);
		s2.forEach(i-> System.err.print(i+ " "));
		
		System.out.println("");
		
		//min & max methods
		Stream<Integer> s3=Stream.of(1,2,3,4,5,6);
		Stream<Integer> s4=Stream.of(1,2,3,4,5,6);
		//Integer min = s3.min((o1,o2)->o1.compareTo(o2)).get();
		Integer max = s4.max((o1,o2)->o1.compareTo(o2)).get();
		
		//Printing min value..
		s3.min((o1,o2)->o1.compareTo(o2)).ifPresent(System.out::println);
		System.out.println(max);
		
		System.out.println("");
		
		//anyMatch() method
		List<Integer> asList = Arrays.asList(11,22,33,44,55);
		boolean anyMatch = asList.stream().anyMatch(i->i==21);
		System.out.println(anyMatch);
		
		
	}
}
