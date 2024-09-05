package com.example.exercise;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

/**
 * Section:Collection
 * Step:18 Set Interface - Exercise - Find Unique Characters in a List
 * @author 2099643
 *
 */
public class SetRunner {
	
	public static void main(String[] args) {
		
		List<Character> characters = List.of('A','Z','A','B','Z','F');
		
		/**
		 * To check unique characters in sorted order
		 * Unique Set:
		 * 1.Tree Set --> to store elements in sorted order. 
		 * 2.Hash Set --> if you do not care about the order in which elements are stored **(more efficient)
		 * 3.Linked Hash Set --> to store elements in insertion order
		 */
		System.out.println(characters);
		 
		Set<Character> characterTreeSet = new TreeSet<>(characters);
		System.out.println("characterTreeSet: "+characterTreeSet); 
		// Returns value in sorted order
		
		Set<Character> characterLinkedHashSet= new LinkedHashSet<>(characters);
		System.out.println("characterLinkedHashSet: "+characterLinkedHashSet);
		
		Set<Character> characterHashSet= new HashSet<>(characters);
		System.out.println("characterHashSet: "+characterHashSet);
		
	} 

}
