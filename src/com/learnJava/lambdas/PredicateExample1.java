package com.learnJava.lambdas;

import java.util.function.Predicate;

public class PredicateExample1 {
	static Predicate<Integer> p1 = (i)->{return i%2==0;};
	static Predicate<Integer> p2 = i->i%2==0;
	static Predicate<Integer> p3 = i->i%5==0;
	
	public static void predicateAnd() {
		System.out.println(p1.and(p2).test(10));
		System.out.println(p1.and(p2).test(9));
	}
	public static void predicateOr() {
		System.out.println(p2.or(p3).test(10));
		System.out.println(p2.or(p3).test(8));
	}
	public static void predicateNegate() {
		System.out.println(p2.or(p3).negate().test(10));
		System.out.println(p2.or(p3).negate().test(8));
	}
	public static void main(String[] args) {
		predicateAnd();
		predicateOr();
		predicateNegate();
	}

}
