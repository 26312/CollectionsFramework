package com.example.listsession;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class ArrayListVsVector {

	public static void main(String[] args) {
		/**
		 * Differece between ArrayList and Vecotr
		 */
		List<String> words = List.of("Apple","Banana","Strawberries");
		
		
		
		List<String> wordsArrayList = new ArrayList(words);
		/**
		 * ArrayList was introduced since Java version 1.2
		 * All methods defined within ArraList are non-synchronized.
		 * Not thread safe.
		 * Thread safety does not comes free, it impacts performance.
		 */
		
		
		List<String> wordsVectorList = new Vector<>(words);

		/**
		 * Vector was introduced in Java version 1.0 	
		 * All the methods defined within Vector are "synchronized". All methods are thread safe.
		 * If instance of Vector class is shared between multiple threads,
		 *  then only one of those threads can be executing one of these methods at a time.
		 *  This is done to ensure that our program is Thread Safe. Behaviour of our program should not change
		 *  when it is being accessed from one thread or 15 threads.
		 * Can be used in situations where we are sharing data between multiple threads. 
		 * 
		 */
	}

}
