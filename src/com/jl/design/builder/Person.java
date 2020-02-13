package com.jl.design.builder;

public class Person {

	private int no;
	private String name;
	private int age;
	private String addr;
	private String born;
	private String sex;
	
	
	public Person(int no, String name, int age, String addr, String born, String sex) {
		super();
		this.no = no;
		this.name = name;
		this.age = age;
		this.addr = addr;
		this.born = born;
		this.sex = sex;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public int getNo() {
		return no;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	public String getBorn() {
		return born;
	}
	public void setBorn(String born) {
		this.born = born;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Person [no=" + no + ", name=" + name + ", age=" + age + ", addr=" + addr + ", born=" + born + ", sex="
				+ sex + "]";
	}

}
