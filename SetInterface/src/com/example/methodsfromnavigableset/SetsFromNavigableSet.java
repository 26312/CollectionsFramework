package com.example.methodsfromnavigableset;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Section:Collection
 * Step 19 - TreeSet - Methods from NavigableSet - floor,lower,upper, subSet, head
 * @author 2099643
 *
 */
public class SetsFromNavigableSet  {

	public static void main(String[] args) {
		
		TreeSet<Integer> treeSetNumbers = new TreeSet<>(Set.of(65,54,34,12,99,199));
		System.out.println(treeSetNumbers);
		/*
		 * All elements are printed in sorted order
		 * TreeSet also implements NavigableSet interface which provides few extra operations
		 * which are traditionally  not present in Collection interface.
		 * These operations are only present on trees on places where data is sorted 
		 */
		System.out.println("Numbers Greater than : "+treeSetNumbers.floor(99));
		System.out.println("Numbers lower and equal to given number: "+treeSetNumbers.lower(32));
		System.out.println("Numbers: "+treeSetNumbers.ceiling(99));
	    System.out.println("Number greater than the given number: "+treeSetNumbers.higher(99));
		System.out.println("Nunmbers between provided numbers: "+treeSetNumbers.subSet(20, 80));
		System.out.println("Numbers Upto given number: "+treeSetNumbers.headSet(65));
		System.out.println("Numbers After given number: "+treeSetNumbers.tailSet(55));
		
	}

}
