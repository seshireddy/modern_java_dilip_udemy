package com.learnJava.lambdas;

import java.util.function.Function;

public class FunctionExample {
	static Function<String, String> function = (name) -> name.toUpperCase();
	static Function<String, String> addSomeString = (name) -> name.toUpperCase().concat("default");
	public static void main(String[] args) {
		System.out.println("Result is : "+function.apply("java"));
		System.out.println("Result of AndThen is : "+function.andThen(addSomeString).apply("java"));
		System.out.println("Result of compose is : "+function.compose(addSomeString).apply("java"));
	}

}
