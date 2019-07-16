package com.learnJava.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamsExample {
	
	public static int sumOfNumbers(List<Integer> integerList) {
		return integerList.stream()
				.reduce(0, (x,y)-> x+y); //unboxing to convert int to Integer (it's a problem)
	}
	
	public static int sumOfNNumbersIntStrem() {
		return IntStream.rangeClosed(1, 6).sum(); //1,2,3,4,5,6
	}
	
	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(sumOfNumbers(integerList));
	}

}
