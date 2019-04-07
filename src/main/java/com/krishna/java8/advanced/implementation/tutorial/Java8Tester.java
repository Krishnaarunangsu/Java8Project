/**
 * 
 */
package com.krishna.java8.advanced.implementation.tutorial;

import java.util.function.Function;

import com.krishna.java8.advanced.tutorial.Foo;
import com.krishna.java8.advanced.tutorial.GreetingService;
import com.krishna.java8.advanced.tutorial.MathOperation;
import com.krishna.java8.advanced.tutorial.MyInterface;

/**
 * @author arunangsu.sahu
 *
 */
//public class Java8Tester implements MathOperation {
public class Java8Tester{


	/**
	 * 
	 */
	public Java8Tester() {
		// No argument Constructor
	}
	/*
	public int operation(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}
	*/
	/**
	 * @param a
	 * @param b
	 * @param mathOperation
	 * @return
	 */
	private int operate(int a, int b, MathOperation mathOperation) {
	      return mathOperation.operation(a, b);
	   }
	
	/**
	 * passing interface as parameter
	 * Foo foo needs implementation when called
	 * @param string
	 * @param foo 
	 * @return String
	 */
	public static String add(String string, Foo foo) { 
		return foo.method(string);
	}
	
	/**
	 * Java 8 already provides such an interface in Function<T,R> 
	 * from the java.util.function package.
	 * @param string
	 * @param fn
	 * @return String
	 */
	public static String addWithoutActualInterface(String string, Function<String, String> fn) { 
		return fn.apply(string);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Java8Tester java8Tester = new Java8Tester();
		
		/*
		 * Defining the MathOperation interface method with type declaration
		 */
		MathOperation addition = (int a, int b)-> a+b; //operation in the interface
		int a = 5, b = 10;
		int sum = java8Tester.operate(a, b, addition);
		
		System.out.println("Sum of two integeers(a+b) is:"+sum);
		
		System.out.println("*************************************************************");
		/*
		 * Defining the MathOperation interface method with type declaration
		 */

		MathOperation subtraction = (x, y)-> x-y; //operation in the interface
		int subtract = java8Tester.operate(10, 5, subtraction); //Understand the type from the value actually passed
		
		System.out.println("Subtraction of two integeers(x-y) is:"+subtract);
		
		System.out.println("*************************************************************");
		/*
		 * Defining the MathOperation interface method with return statement & curly braces
		 */

		MathOperation multiplication = (x, y)-> {return x*y;}; //operation in the interface
		int product = java8Tester.operate(10, 5, multiplication); //Understand the type from the value actually passed
		
		System.out.println("Product of two integeers(x*y) is:"+product);
		
		System.out.println("*************************************************************");
		/*
		 * Defining the MathOperation interface method without return statement & curly braces
		 */

		MathOperation division = (x, y)-> x/y; //operation in the interface
		int quotient = java8Tester.operate(10, 5, division); //Understand the type from the value actually passed
		
		System.out.println("Division of two integeers(x/y) is:"+quotient);
		
		GreetingService greetingService1 = message -> System.out.println("Hello " + message);
		greetingService1.sayMessage("Krishna");
		
		GreetingService greetingService2 = message -> System.out.println("Hello " + message);
		greetingService2.sayMessage("Yogmaya");
		
		Foo foo = message ->message+"Krishna";
		String fooMessage = add("Hi ", foo);
		System.out.println("Foo Message:"+ fooMessage);
		
		Function<String, String> fn = message ->message+"Krishna";
		String fooSameMessage = addWithoutActualInterface("Hi ", fn);
		System.out.println("Function Message:"+ fooSameMessage);
		
		MyInterface myInterface = (String text) -> {
		    System.out.print(text);
		};
		
		myInterface.printIt("Jagannath");
		
	}

}
