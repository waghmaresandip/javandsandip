package com.predicate;

public class Student {
	int id;
	String name;
	String city;
	int age;
	public Student(int id, String name, String city, int age) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + "]";
	}
	

}
