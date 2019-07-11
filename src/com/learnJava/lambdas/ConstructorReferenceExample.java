package com.learnJava.lambdas;

import java.util.function.Supplier;

import com.learnJava.models.DummyClass;

public class ConstructorReferenceExample {
	static Supplier<DummyClass> s = DummyClass::new;
	public static void main(String [] args) {
		DummyClass d = s.get();
	}
}
