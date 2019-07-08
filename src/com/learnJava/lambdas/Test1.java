package com.learnJava.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Test1 {

	public static void main(String[] args) {
		List<String> list = Arrays.asList("Name1","Name2","Name3");
		Consumer<String> c1 = (obj)-> System.out.println(obj); //task1
		Consumer<String> c2 = (obj)-> System.out.println(obj.length()); //task2
		/*list.forEach((obj)->{
			c1.andThen(c2).accept(obj);;
		});*/
		
	}

}
