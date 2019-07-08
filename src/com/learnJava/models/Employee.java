package com.learnJava.models;

public class Employee {
	private String firstName;
	private int age;
	private String lastName;
	private double salary;
	public Employee(String firstName, int age, String lastName, double salary) {
		super();
		this.firstName = firstName;
		this.age = age;
		this.lastName = lastName;
		this.salary = salary;
	}
	@Override
	public String toString() {
		return firstName+" "+lastName+" , "+"age : "+age+" , "+"salary : "+salary;
	}

	public String getFirstName() {
		return firstName;
	}
	public int getAge() {
		return age;
	}
	public String getLastName() {
		return lastName;
	}
	public double getSalary() {
		return salary;
	}
}
