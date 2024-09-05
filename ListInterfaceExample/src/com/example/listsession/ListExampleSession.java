package com.example.listsession;

import java.util.List;

public class ListExampleSession {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Banana","Strawberries");
		System.out.println(words);

		//System.out.println(words.lenght()); 
		// Length is used on an array. Using it on List will throw a compilation error with Exception in thread and
		// as 'The method lenght() is undefined for the type List<String>'
		
		System.out.println(words.size());
		System.out.println(words.isEmpty());// Returns boolean value(true) if list is empty(default: True)
		System.out.println(words.contains("Orange")); // Returns boolean value(true) if list contains specified element
		System.out.println(words.indexOf("Strawberries"));
		
		
		
	}	

}
