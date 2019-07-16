package com.learnJava.numericStreams;

import java.util.List;
import java.util.stream.*;

public class IntStreamMapExample {

	public static void main(String[] args) {
		System.out.println("map to object : "+mapToObject());
		System.out.println("map to long : "+mapToLong());
		System.out.println("map to double : "+mapToDouble());
	}
	public static List<Integer> mapToObject() {
		return IntStream.rangeClosed(1, 5)
			.mapToObj(Integer::new)
			.collect(Collectors.toList());
	}
	public static long mapToLong() {
		return IntStream.rangeClosed(1, 5)
				//i value passed from the intstream
			.mapToLong(i->i) //convert intstream to long stream
			.sum();
	}
	public static double mapToDouble() {
		return IntStream.rangeClosed(1, 5)
				//i value passed from the intstream
			.mapToDouble(i->i) //convert intstream to long stream
			.sum();
	}
}
