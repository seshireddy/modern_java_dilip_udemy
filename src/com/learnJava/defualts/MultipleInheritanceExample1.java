package com.learnJava.defualts;

public class MultipleInheritanceExample1 {

	public static void main(String[] args) {
		new TestClass1().foo();
	}

}

class TestClass1 implements Interface1,Interface2 {
	public void foo() {
		System.out.println("Implemented Here..");
	}
}