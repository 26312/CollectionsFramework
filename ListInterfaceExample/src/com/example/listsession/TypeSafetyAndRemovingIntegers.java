package com.example.listsession;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;


/**
 * Section:Collections
 * Step:9
 * List & ArrayList:Puzzles - Type Safety and Removing Integers
 * @author 2099643
 *
 */
public class TypeSafetyAndRemovingIntegers {

	public static void main(String[] args) {
		List value = List.of("A",'A',1,1.0); // List of variety of value
		
		// Checking instances of values which are passed in the list
		if(value.get(0) instanceof String) {
			System.out.println("True");
		}
		if(value.get(1) instanceof Character) {
			System.out.println("True");
		}
		if(value.get(2) instanceof Integer) {
			System.out.println("True");
		}
		if(value.get(3) instanceof Double) {
			System.out.println("True");
		}
		
		/**
		 * From above operations we can notice that List has variety of values.
		 * If we don't want to allow our List to have values of multiple instances.
		 * We must introduce concept of "Generalization" (Generics)
		 * 
		 */
		
//		List<String> value2 = List.of("A",'A',1,1.0);
//		System.out.println(value2);

		List<Integer> numbers = List.of(1,2,3,4,5);
		System.out.println(numbers.indexOf(3)); 
		
		List<Integer> newNumber = new ArrayList<>(numbers);
		System.out.println("newNumber:" +newNumber);
		System.out.println(newNumber.indexOf(3));
		
		/** Below remove() method is calling remove(int index) method while we are
		 * trying to pass remove(Object o) method to remove the number '3' from the list above.
		 * The compiler by default passes remove(int index). To pass later we must pass a wrapper
		 * so that Compiler can understand that we are actually passing a number and not an index value.
		 * Thus, Integer.valueOf() is being used.
		 */
		
		//newNumber.remove(3);
				
		newNumber.remove(Integer.valueOf(3));
		System.out.println(newNumber); 
	}

}
