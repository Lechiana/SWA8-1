package com.swa.oop;

public class Employee {
	private int salary;
	private Person person;
	public Employee(Person p, int salary) {
		this.person = p;
		this.salary = salary;
	}
	public void showDetail() {
		person.showDetail();
	}
}
