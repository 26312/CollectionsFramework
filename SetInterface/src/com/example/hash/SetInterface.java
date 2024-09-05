package com.example.hash;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Section:Collection
 * Step 17 - Set Interface - Hands on - HashSet, LinkedHashSet and TreeSet
 * @author 2099643
 *
 */
public class SetInterface {
	public static void main(String[] args) {
		
		// HASHSET
		Set<Integer> numbers = new HashSet<>();
		numbers.add(123);
		numbers.add(456);
		numbers.add(789);
		numbers.add(1122001);
		numbers.add(765432);
				
		System.out.println(numbers);
		/**
		 * The order of insertion and how the numbers are stored are also not sorted.
		 * In HashSet we don't care about insertion order and sort order. 
		 */
	
	// LINKEDHASHSET
	LinkedHashSet<Integer> numbers2 = new LinkedHashSet<>();
	numbers2.add(123);
	numbers2.add(456);
	numbers2.add(789);
	numbers2.add(765432);
	numbers2.add(1122001);
	System.out.println(numbers2);
	/*
	 * Numbers are not stored in sorted order but in order in which they are inserted
	 */
	
	
	// TREESET
	Set<Integer> number3 = new TreeSet<>();
	number3.add(123);
	number3.add(456);
	number3.add(789);
	number3.add(765432);
	number3.add(1122001);
	System.out.println(number3.add(123));
	System.out.println("TREESET: "+number3);
	/**
	 * Numbers are stored in sorted order.
	 * Will not store duplicate values
	 */
	}
	
	
	
	
}
