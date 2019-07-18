package com.learnJava.optional_interface;

import java.util.Optional;

public class IsPresnt_IfPresentExample {

	public static void main(String[] args) {
		Optional<String> optional = Optional.ofNullable(null);
		System.out.println(optional.isPresent()?optional.get():optional);
		optional.ifPresent(System.out::println);
	}

}
