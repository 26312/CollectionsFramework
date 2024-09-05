package com.example.mapinterface;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

/**
 * Section: Collection
 * Step 27 - TreeMap - Methods from NavigableMap - floorKey, higherKey, firstEntry,
 * @author 2099643
 *
 */
public class TreeMapWithNavigableMap {

	public static void main(String[] args) {
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("F", 25);
		treeMap.put("A", 15);
		treeMap.put("Z", 5);
		treeMap.put("L", 250);
		System.out.println("TreeMap: "+treeMap);
		
		System.out.println("Higher Key: "+treeMap.higherKey("F")); // returns Key whose value is greater than passed Keys
		System.out.println("Ceiling Key: "+treeMap.ceilingKey("F")); // returns Key whose value is greate than equal to passed Key
		System.out.println("Lower Key: "+treeMap.lowerKey("A")); // returns Key whose value is lower than passed Key
		System.out.println("Floor Key: "+treeMap.floorKey("A"));
		
		System.out.println(treeMap.firstEntry()); // returns the first Key-value entered in TreeMap
		System.out.println(treeMap.lastEntry());// returns the last Key-value entered in TreeMap
		
		System.out.println(treeMap.subMap("F", "Z"));
		
	
	}

}
