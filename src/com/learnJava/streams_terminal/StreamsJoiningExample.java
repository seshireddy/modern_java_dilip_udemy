package com.learnJava.streams_terminal;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsJoiningExample {

	public static void main(String[] args) {
		System.out.println("Joining_1 : "+joining_1());
		System.out.println("Joining_2 : "+joining_2());
		System.out.println("Joining_3 : "+joining_3());
	}
	public static String joining_1() {
		List<String> list = Arrays.asList("Ravi", "Shankar", "Subhashree", "Rafiq","DJ");
		return list
			 .stream()
			 .collect(Collectors.joining());
		
	}
	public static String joining_2() {
		List<String> list = Arrays.asList("Ravi", "Shankar", "Subhashree", "Rafiq","DJ");
		return list
			 .stream()
			 .collect(Collectors.joining("_"));
		
	}
	public static String joining_3() {
		List<String> list = Arrays.asList("Ravi", "Shankar", "Subhashree", "Rafiq","DJ");
		return list
			 .stream()
			 .collect(Collectors.joining("_","(",")"));
		
	}
}
