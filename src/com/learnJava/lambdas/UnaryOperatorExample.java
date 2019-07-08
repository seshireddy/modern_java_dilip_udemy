package com.learnJava.lambdas;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
	static UnaryOperator<String> operator = (s)->s.concat("default");
	public static void main(String[] args) {
		System.out.println(operator.apply("Java_"));
	}

}
