package com.learnJava.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.models.Employee;

public class StreamMapExample {

	public static void main(String[] args) {
		System.out.println(namesList());
	}
	public static List<String> namesList() {
		List<Employee> list = Arrays.asList(
				new Employee("Dibyajyoti", 28, "Behera", 52398.56),
				new Employee("Swati", 25, "Samantray", 23985.56),
				new Employee("Lipika", 26, "Nayak", 42398.56),
				new Employee("Sudesna", 30, "Kundu", 38398.56),
				new Employee("Swagatika", 28, "Singh", 22398.56)
			);
		return list.stream()
			.map(Employee::getFirstName)
			.map(String::toUpperCase)
			.collect(Collectors.toList());
	}

}
