package com.learnJava.defualts;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class DefaultMethodExample {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Dibyajyoti","Arpita","Swati","Sudesna","Lipika","Sandra");
		list.sort(Comparator.naturalOrder());
		System.out.println(list);
		list.sort(Comparator.reverseOrder());
		System.out.println(list);
	}

}
