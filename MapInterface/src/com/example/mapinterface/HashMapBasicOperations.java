package com.example.mapinterface;

import java.awt.RenderingHints.Key;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class HashMapBasicOperations  {
	
	public static void main(String[] args) {
		Map<String, Integer> mapNumber = Map.of("A",3,"C",3,"B",4,"D",6,"E",3);
		
		/**
		 * By using instance of HashMap we can insert (put()) new Key-values in our Map.
		 */
		Map<String, Integer> hashMap = new HashMap<>(mapNumber);
		
		System.out.println("Printing HashMap:"+ hashMap);
		hashMap.put("F", 6); // adds a new Key-Value pair in the hashmap
		System.out.println(hashMap);
		
		System.out.println("HashMap Size: "+hashMap.size());
		
		System.out.println(hashMap.remove("F", 6));
		
		System.out.println(hashMap.put("K", null));
		System.out.println(hashMap.put("null", 7));
		System.out.println("HashMap Size: "+hashMap.size());
		System.out.println(hashMap);
		
//		for(String key:hashMap.keySet()) {
//			hashMap.compute(key, (k,v)->(v == null ? 0: v)+10);
//		}
//		System.out.println("New hashMap:"+hashMap);
		
		for(String key: hashMap.keySet()) {
			hashMap.compute(key , (Key,value)->(value==null ? 0 :value)+10);
		}
		System.out.println(hashMap);
		
	}

}
