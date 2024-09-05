package com.example.mapinterface;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.TreeMap;

/**
 * Section:Collection
 * Map Interface - Comparison - HashMap vs LinkedHashMap vs TreeMap
 * @author 2099643
 *
 */
public class MapInterfaceComparison {

	public static void main(String[] args) {
		HashMap<String, Integer> hashMap = new HashMap<>();
		
		hashMap.put("Z", 5);
		hashMap.put("A", 15);
		hashMap.put("F", 25);
		hashMap.put("L", 250);
		// returns hashmap which is neither in insertion order nor in sorted order, since hashmap does not
		// care about order
		System.out.println("HashMap: "+hashMap);
												
		LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<String, Integer>();
		linkedHashMap.put("F", 25);
		linkedHashMap.put("A", 15);
		linkedHashMap.put("Z", 5);
		linkedHashMap.put("L", 250);
		// returns LinkedHashMap which is in order of insertion
		System.out.println("LinkedHashMap: "+ linkedHashMap);
		
		
		TreeMap<String, Integer> treeMap = new TreeMap<>();
		treeMap.put("F", 25);
		treeMap.put("A", 15);
		treeMap.put("Z", 5);
		treeMap.put("L", 250);
		// returns TreeMap in sorted order
		System.out.println("TreeMap:" + treeMap);
		
		
	}

}
