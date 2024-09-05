package com.example.listsession;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListMutableImmutableExample {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Banana","Strawberries");
		System.out.println(words.size());
		//System.out.println(words.add("Mango"));
		/**
		 *  the above opertion will throw a compilation error "UnsupportedOperationException" because
		 *  List.of() function is immutable which means once the contents are added it cannot be changed
		 *  or no further contents can be added in the list.
		 *  To create a mutable list we can use:
		 *  1. ArrayList
		 *  2. LinkedList
		 *  3. Vector
		*/
		
		/** Below ArrayList is used to create a list of mutable contents within object 'wordsArrayList'
		 * We can notice that object 'words' is encapsulated within 'ArrayList' which allows us to make
		 * a list of mutable objects
		 */
		List<String> wordsArrayList = new ArrayList(words);
		wordsArrayList.add("Mango");
		System.out.println(wordsArrayList.size());
		System.out.println("wordsArrayList: "+wordsArrayList);
		
		List<String> wordsLinkedList = new LinkedList<>(words);
		System.out.println("wordsLinkedList: "+wordsLinkedList);
		System.out.println(wordsLinkedList.containsAll(wordsArrayList));
		
		List<String> wordsVector = new Vector<>(words);
		System.out.println("wordsVector: "+wordsVector);
		wordsVector.add("Pears");
		System.out.println(wordsVector);
		
		System.out.println("Iterator: "+wordsLinkedList.iterator());
		
	}

}
