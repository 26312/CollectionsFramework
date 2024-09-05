package com.example.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {

	public static void main(String[] args) {
		String str = "This is an awesome ocassion. "
				+ "This has never happened before";
		
		Map<Character,Integer> occurance = new HashMap<>();
		
		char[] characters = str.toCharArray();// Converting String to Array of Characters
		
		for(char character:characters) { // Using enhance loop to iterate through contents of Array
			
			Integer integer = occurance.get(character);
			
			if(integer == null) { // initialization step, in case character is being repeated, add +1 to its count
				occurance.put(character, 1);
			}else {
				occurance.put(character, integer + 1);
			}
		}
		
		Map<String,Integer> stringOccurance = new HashMap<>();
		String[] words = str.split(" ");
		
		for(String word:words) {
			Integer integer = stringOccurance.get(word);
			if(integer==null) {
				stringOccurance.put(word, 1);
			}else {
				stringOccurance.put(word, integer + 1);
			}
		}
		
		
		System.out.println(characters);
		System.out.println(occurance);
		System.out.println(stringOccurance);   
	}

}
