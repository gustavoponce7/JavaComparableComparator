package com.gpch;

import java.util.Collections;
import java.util.List;

import com.gpch.model.EmployeeComparable;
import com.gpch.utility.EmployeeUtility;

public class TestEmployeeSortComparable {
	
	public static void main(String[] args) {
		System.out.println("Original Employees");
		List<EmployeeComparable> employees = EmployeeUtility.getEmployeesComparable();
		EmployeeUtility.printEmployeeComparableList(employees);
		System.out.println("Sorted by Age using Comparable");
		Collections.sort(employees); 
		EmployeeUtility.printEmployeeComparableList(employees);
		
	}

}
