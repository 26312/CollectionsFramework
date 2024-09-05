package com.example.listsession;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Section:Collections
 * Step 10 - List and ArrayList - Sorting - Introduction to Collections sort static
 * @author 2099643
 *
 */
public class CollectionSort {

	public static void main(String[] args) {
		List<Integer> numbers = List.of(123,12,3,45);
		
		List<Integer> numberAL = new ArrayList<>(numbers);
		System.out.println("Before Sort :"+numberAL);
		/**
		 * Here we are trying to perform Sort operation using sort() method from List
		 * However, below we can see that sort() method is throwing a compiler error:
		 * The method sort(Comparator<? super Integer>) in the type List<Integer> is not
		 *  applicable for the arguments (List<Integer>)
		 */
		//numberAL.sort(numbers);
		
		/*
		 * Lets use another sort() method from Collections
		 */
		Collections.sort(numberAL); 
		
		System.out.println("Sort using Collection.sort(): "+numberAL);
	}

}
