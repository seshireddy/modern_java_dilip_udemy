package com.learnJava.streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abc","Def","Ghi","Jkl");
		Stream<String> stream = list.stream();
		stream.forEach(System.out :: println);
		stream.forEach(System.out :: println);//will throw exception,coz stream already has started /opened.
		Stream<String> stream2 = list.stream();
		stream2.forEach(System.out :: println);//works fine, coz stream takes place in a different stream object
	}

}
