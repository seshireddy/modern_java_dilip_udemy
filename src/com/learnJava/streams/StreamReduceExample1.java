package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;

public class StreamReduceExample1 {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1,4,5,11,8);
		System.out.println(performMultiplication(numbers));
		
	}
	public static int performMultiplication(List<Integer> integerList) {
		return integerList
			.stream()
			.reduce(1, (a,b)->a*b);
	}
}
