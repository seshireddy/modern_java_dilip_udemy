package com.learnJava.lambdas;

import java.util.function.BiConsumer;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> multiply = (a,b)-> System.out.println("Mul : "+a*b);
		BiConsumer<Integer, Integer> divide = (a,b)-> System.out.println("Div : "+a/b);
		multiply.andThen(divide).accept(10, 5);
	}

}
