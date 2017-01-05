package com.gpch.model;

public class EmployeeComparable implements Comparable<EmployeeComparable> {
	
	private int id;
	private String name;
	private int age;
	
	public EmployeeComparable(int id, String name, int age) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	//Descending Order by Age
	public int compareTo(EmployeeComparable employee) {
		return employee.getAge() - this.age;
	}

}
