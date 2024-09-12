package com.niru.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.niru.dto.Employee;

public class RemoveDuplicatesNameOfEmployee {
	
	public static void main(String[] args) {
		
		Employee hr = new Employee(1, "HR");
		Employee hrDuplicate = new Employee(1, "HR");       // Duplicate Object
		Employee teamLeader = new Employee(2, "Team Leader");
		
		List<Employee> list= new ArrayList<>();
		list.add(hr);
		list.add(teamLeader);
		list.add(hrDuplicate);
		
		
		System.out.println("Employee List(Duplicate)");
		for (Employee employee : list) {
			System.out.println(employee.getName());
		}
		
		System.out.println("------------------------------------------");
		List<Employee> uniqueEmployee = list.stream()
				.distinct()               // it will remove duplicate object, It will check duplicate using equals method
				.collect(Collectors.toList());
		System.out.println("Employee List(Unique)");
		for (Employee employee : uniqueEmployee) {
			System.out.println(employee.getName());
		}
	}
	

}
