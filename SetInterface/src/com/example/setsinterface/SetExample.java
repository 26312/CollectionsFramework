package com.example.setsinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> set = Set.of("Apple","Cat","Bat");
		
		System.out.println("Set: "+set);
		
		/**
		 * Below add() method will throw a compiler error:UnsupportedOperationException.
		 * Like List, Set is also immutable, i.e., the contents of Set cannot be modified once defined.
		 */
		//set.add("Bull");
		
		/**
		 * To overcome above drawback we will use HashSet,TreeSet which are implementations of Set Interface.
		 * Like we use ArrayList for List Interface. We can use HashSet for Set Interface to modify
		 * the contents.
		 */
		
		HashSet<String> hashSet = new HashSet<>(set);
		//hashSet.add("Apple");
		//System.out.println("HashSet: "+hashSet);
		System.out.println("HashSet: Adding another Apple in Set: "+hashSet.add("Apple"));
		/**
		 * The above add() method will return "False" because the element "Apple"
		 * already exists in the Set, the compiler will not add another duplicate item in the Set
		 * if the item is already present in Set. However, add() method will add element which does 
		 * not already exists in Set.
		 */
		
		
		TreeSet<String> treeSet = new TreeSet<>(set);
		System.out.println("TreeSet: "+treeSet);
	
	
	}

}
