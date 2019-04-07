/**
 * 
 */
package com.krishna.java8.model;

import java.io.Serializable;

/**
 * @author arunangsu.sahu
 *
 */
public class Employee implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -4205485692265917906L;
	private String name;

	/**
	 * 
	 */
	public Employee() {
		// No argument Constructor
	}

	/**
	 * @param name
	 */
	public Employee(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + "]";
	}
	
	/**
	 * @param a1
	 * @param a2
	 * @return static integer
	 */
	public static int nameCompare(Employee a1, Employee a2) {
	    return a1.name.compareTo(a2.name);
	  }
	

}
