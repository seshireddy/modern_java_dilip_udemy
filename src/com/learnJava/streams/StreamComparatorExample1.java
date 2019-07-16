package com.learnJava.streams;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learnJava.models.Employee;

public class StreamComparatorExample1 {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee("Dibyajyoti", 28, "Behera", 52398.56),
				new Employee("Swati", 25, "Samantray", 23985.56),
				new Employee("Lipika", 26, "Nayak", 42398.56),
				new Employee("Sudesna", 30, "Kundu", 38398.56),
				new Employee("Lipika", 26, "Nayak", 42398.56),
				new Employee("Sudesna", 30, "Kundu", 38398.56),
				new Employee("Swagatika", 28, "Singh", 22398.56)
			);
		System.out.println(list
				.stream()
				.sorted(Comparator.comparing(Employee::getAge))
				.collect(Collectors.toList())
				);
	}

}
