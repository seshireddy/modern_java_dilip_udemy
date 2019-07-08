package com.learnJava.lambdas;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.learnJava.models.Employee;

public class ComparatorLambdaExample {
	public static void main (String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Dibyajyoti", 28, "Behera", 52398.56),
				new Employee("Swati", 25, "Samantray", 23985.56),
				new Employee("Lipika", 26, "Nayak", 42398.56),
				new Employee("Sudesna", 30, "Kundu", 38398.56),
				new Employee("Swagatika", 28, "Singh", 22398.56)
			);
		list.stream().forEach(System.out :: println);
		Collections.sort(list,(o1,o2)-> o1.getAge() - o2.getAge());
		System.out.println("After sorting by age.");
		list.stream().forEach(System.out :: println);
	}
}
