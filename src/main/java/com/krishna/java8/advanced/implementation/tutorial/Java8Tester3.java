/**
 * 
 */
package com.krishna.java8.advanced.implementation.tutorial;

import java.util.Arrays;

import com.krishna.java8.model.Employee;

/**
 * @author arunangsu.sahu
 *
 */
public class Java8Tester3 {

	/**
	 * 
	 */
	public Java8Tester3() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Employee[] employees = { new Employee("David"), new Employee("Naveen"), new Employee("Alex"),
				new Employee("Richard") };

		System.out.println("Before Sorting Names: " + Arrays.toString(employees));
		Arrays.sort(employees, Employee::nameCompare);
		System.out.println("After Sorting Names "+Arrays.toString(employees));

	}

}
