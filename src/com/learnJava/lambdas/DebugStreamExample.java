package com.learnJava.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class DebugStreamExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abc","Def","Adf","Ghi","Jkl","Drf");
		Stream<String> stream = list.stream();
		stream
			.peek((s)->System.out.println(s))
			.filter(s->!s.startsWith("A"))
			.peek((s)->System.out.println(s))
			.filter(s->!s.startsWith("D"))
			.forEach(System.out::println);
	}

}
