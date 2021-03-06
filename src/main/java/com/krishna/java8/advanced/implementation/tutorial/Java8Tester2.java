/**
 * 
 */
package com.krishna.java8.advanced.implementation.tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author arunangsu.sahu
 *
 */
public class Java8Tester2 {

	/**
	 * 
	 */
	public Java8Tester2() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> pointList = new ArrayList<>();
		pointList.add("1");
		pointList.add("2");
		 
		pointList.forEach(p ->  {
		                            System.out.println("Iterating:"+p);
		                            //Do more work
		                        }
		                 );
		
		//creating sample Collection
		List<Integer> myList = new ArrayList<Integer>();
		for(int i=0; i<10; i++) myList.add(i);
		
		//traversing using Iterator
		Iterator<Integer> it = myList.iterator();
		while(it.hasNext()){
			Integer i = it.next();
			System.out.println("Iterator Value::"+i);
		}
		
		//traversing through forEach method of Iterable with anonymous class
				myList.forEach(new Consumer<Integer>() {

					public void accept(Integer t) {
						System.out.println("forEach anonymous class Value::"+t);
					}

				});
				
				//traversing with Consumer interface implementation
				MyConsumer action = new MyConsumer();
				myList.forEach(action);
	}

}

//Consumer implementation that can be reused
class MyConsumer implements Consumer<Integer>{

	public void accept(Integer t) {
		System.out.println("Consumer impl Value::"+t);
	}


}
