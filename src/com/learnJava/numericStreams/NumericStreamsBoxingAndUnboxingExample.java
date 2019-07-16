package com.learnJava.numericStreams;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamsBoxingAndUnboxingExample {

	public static void main(String[] args) {
		System.out.println("Boxing : "+ boxing());
		List<Integer> list = boxing();
		System.out.println("Unboxing : "+unBoxing(list));
	}
	
	public static List<Integer> boxing(){
		return IntStream.rangeClosed(1, 50)
				//int
				.boxed()
				//Integer
				.collect(Collectors.toList());
	}
	public static int unBoxing(List<Integer> list) {
		return list
				.stream()
				//Integers
				.mapToInt(Integer::intValue)
				//int unboxing
				.sum();
	}

}
