package com.gpch.utility;

import java.util.ArrayList;
import java.util.List;

import com.gpch.model.Employee;
import com.gpch.model.EmployeeComparable;

public class EmployeeUtility {

	public static List<EmployeeComparable> getEmployeesComparable() {
		List<EmployeeComparable> employees = new ArrayList<EmployeeComparable>();
		employees.add(new EmployeeComparable(1, "Peter", 67));
		employees.add(new EmployeeComparable(2, "Bob", 32));
		employees.add(new EmployeeComparable(3, "Gustavo", 38));
		employees.add(new EmployeeComparable(4, "Mike", 46));
		employees.add(new EmployeeComparable(5, "Paul", 34));
		employees.add(new EmployeeComparable(6, "David", 87));
		return employees;
	}

	public static void printEmployeeComparableList(List<EmployeeComparable> list) {
		System.out.println("Id\tName\tAge");
		for (EmployeeComparable employee : list) {
			System.out.println(employee.getId() + "\t" + employee.getName() + "\t" + employee.getAge());
		}
	}
	
	public static List<Employee> getEmployees() {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(1, "Peter", 67));
		employees.add(new Employee(2, "Bob", 32));
		employees.add(new Employee(3, "Gustavo", 38));
		employees.add(new Employee(4, "Mike", 46));
		employees.add(new Employee(5, "Paul", 34));
		employees.add(new Employee(6, "David", 87));
		return employees;
	}

	public static void printEmployeeList(List<Employee> list) {
		System.out.println("Id\tName\tAge");
		for (Employee employee : list) {
			System.out.println(employee.getId() + "\t" + employee.getName() + "\t" + employee.getAge());
		}
	}
	
	public static Employee[] getEmployeesArray() {
		Employee[] employees = new Employee[6];
		employees[0] = new Employee(1, "Peter", 67);
		employees[1] = new Employee(2, "Bob", 32);
		employees[2] = new Employee(3, "Gustavo", 38);
		employees[3] = new Employee(4, "Mike", 46);
		employees[4] = new Employee(5, "Paul", 34);
		employees[5] = new Employee(6, "David", 87);
		return employees;
	}
	
	public static void printEmployeeArray(Employee[] array) {
		System.out.println("Id\tName\tAge");
		for (Employee employee : array) {
			System.out.println(employee.getId() + "\t" + employee.getName() + "\t" + employee.getAge());
		}
	}
	
}
