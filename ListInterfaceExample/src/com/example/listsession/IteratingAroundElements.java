package com.example.listsession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Section: Collection 
 * Step:7
 * List and ArrayList Iterating Around Elements
 * @author 2099643
 *
 */
public class IteratingAroundElements {

	/**
	 * Concept is to Iterate through elements of list
	 * @param args
	 */
	public static void main(String[] args) {
		List<String> list = List.of("Apples","Bat","Cat");
		 
		// Using basic for-loop
		System.out.println("Basic For-Loop: ");
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));// will fetch elements in sequence based on their index values.
		}
		
		// Using enhanced for-loop
		System.out.println("Enhanced For-Loop: ");
		for(String newList : list) {
			System.out.println(newList);
		}
		
		System.out.println("Iterator: "+list.iterator()); 
		
		// Iterating using Iterator:
		Iterator<String> wordsIterator = list.iterator(); 
		System.out.println("Using Iterator-hasNext() & next():");
			while(wordsIterator.hasNext()) {
				
				System.out.println(wordsIterator.next());
			}
			
		/*
		 * Exercise: Create ArrayList of Integers and iterate through them
		 */
			List<Integer> numbers = List.of(1,2,3,4,5);
			System.out.println(numbers);
			
			// Using Basic For Loop
			System.out.println("Basic For-lopp Integers: ");
			for(int i=0;i<numbers.size();i++) {
				System.out.println(numbers.get(i));
			}
			
			// Using Enhanced For Loop
			System.out.println("Enhanced For Loop:");
			for(int numberList : numbers) {
				System.out.println(numberList);
			}
			
			// Iterating using Iterator:
			System.out.println("Using Iterator Object:");
			Iterator<Integer> numberIterator = numbers.iterator();
			while(numberIterator.hasNext()) {
				System.out.println(numberIterator.next());
			}
			
	
	}

}
