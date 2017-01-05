package com.gpch.comparator;

import java.util.Comparator;

import com.gpch.model.Employee;

public class ComparatorSortByAge implements Comparator<Employee> {
	
	public int compare(Employee employee1, Employee employee2) {
		return employee1.getAge() - employee2.getAge();
	}
	

}
