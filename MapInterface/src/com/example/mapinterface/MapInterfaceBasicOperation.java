package com.example.mapinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * Section:Collection
 * Step 24 - Map Interface - Basic Operations
 * @author 2099643
 *
 */
public class MapInterfaceBasicOperation {

	public static void main(String[] args) {
		Map<String, Integer> mapNumber = Map.of("A",3,"C",3,"B",4,"D",6,"E",3);
		System.out.println(mapNumber);
		/**
		 * Since, we are using .of() method. The Map generated is immutable
		 * thus elements cannot be inserted in the Map
		 */
		//mapNumber.put("F", 10);
		//System.out.println(mapNumber);
		
		System.out.println(mapNumber.get("D")); // returns number value of the Key from Map 
		System.out.println(mapNumber.get("F"));// returns null since "F" is not present in Map
		
		System.out.println(mapNumber.size());// returns number of Key-value combination from Map
		System.out.println(mapNumber.isEmpty()); // returns null in case Map is not empty
		System.out.println(mapNumber.containsKey("G")); // returns null if passed Key is not present in Map
		System.out.println(mapNumber.containsValue(10));// returns null if passed Value is not present in Map
		System.out.println("KeySet:"+mapNumber.keySet());// returns keys in ascending order
		System.out.println(mapNumber.values());// returns values in order of insertion
		System.out.println(mapNumber);
		
		// Using TreeMap to sort the Map
		TreeMap<String, Integer> sortedMap = new TreeMap<>(mapNumber);
		for(Map.Entry<String, Integer> entry : sortedMap.entrySet()) {
			System.out.println("Sorted Map:"+entry.getKey()+ ":" + entry.getValue());
		}
	
	
	
	
	}

}
