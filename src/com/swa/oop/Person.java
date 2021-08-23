package com.swa.oop;

public class Person {
	private String titel;
	private String name;
	private int age;
	public Person(String titel, String name, int age) {
		this.titel = titel;
		this.name = name;
		this.age = age;
	}
	public void showDetail() {
		System.out.println(" "+titel+" "+name+" "+age);
	}
}
