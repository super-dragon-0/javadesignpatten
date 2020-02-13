package com.jl.design.builder;

public class Main {

	public static void main(String[] args) {
		Person person = new PersonBuilder().no(10)
		.name("name")
		.age(15)
		.sex("man")
		.addr("xian")
		.born("gaoling")
		.build();
		System.out.println(person);
	}
}
