package com.jl.design.builder;

public class PersonBuilder {

	private int no;
	private String name;
	private int age;
	private String addr;
	private String born;
	private String sex;
	
	public PersonBuilder no(int no) {
		this.no = no;
		return this;
	}
	public PersonBuilder name(String name) {
		this.name = name;
		return this;
	}
	public PersonBuilder age(int age) {
		this.age = age;
		return this;
	}
	public PersonBuilder addr(String addr) {
		this.addr = addr;
		return this;
	}
	public PersonBuilder sex(String sex) {
		this.sex = sex;
		return this;
	}
	
	public PersonBuilder born(String born) {
		this.born = born;
		return this;
	}
	
	public Person build() {
		return new Person(no,name,age,addr,born,sex);
	}
}
