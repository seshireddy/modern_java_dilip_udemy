package com.learnJava.defualts;

public interface Interface1 {
	default void foo() {
		System.out.println("Foo msg..in interface1");
	}
}
