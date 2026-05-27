package com.stream;

public class Book {

	int id;
	String name;
	double prize;
	public Book(int id, String name, double prize) {
		super();
		this.id = id;
		this.name = name;
		this.prize = prize;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", prize=" + prize + "]";
	}
	
}
