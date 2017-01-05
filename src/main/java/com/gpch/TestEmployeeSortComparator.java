package com.gpch;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.gpch.comparator.ComparatorSortByAge;
import com.gpch.comparator.ComparatorSortByName;
import com.gpch.model.Employee;
import com.gpch.utility.EmployeeUtility;

public class TestEmployeeSortComparator {
	
	public static void main(String[] args) {
		
		System.out.println("List - Original Employees");
		List<Employee> employeesList = EmployeeUtility.getEmployees();
		EmployeeUtility.printEmployeeList(employeesList);
		
		System.out.println("List Sorted by Name using Comparator");
		Collections.sort(employeesList, new ComparatorSortByName()); 
		EmployeeUtility.printEmployeeList(employeesList);
		
		System.out.println("List Sorted by Age using Comparator");
		Collections.sort(employeesList, new ComparatorSortByAge()); 
		EmployeeUtility.printEmployeeList(employeesList);
		
		System.out.println("Array Original Employees");
		Employee[] employeesArray = EmployeeUtility.getEmployeesArray();
		EmployeeUtility.printEmployeeArray(employeesArray);
		
		System.out.println("Array Sorted by Name using Comparator");
		Arrays.sort(employeesArray, new ComparatorSortByName()); 
		EmployeeUtility.printEmployeeArray(employeesArray);
		
		System.out.println("Array Sorted by Age using Comparator");
		Arrays.sort(employeesArray, new ComparatorSortByAge()); 
		EmployeeUtility.printEmployeeArray(employeesArray);
		
	}

}
