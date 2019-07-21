package com.learnJava.defualts;

public interface Interface2 {
	default void foo() {
		System.out.println("Foo msg..in interface2");
	}
}
