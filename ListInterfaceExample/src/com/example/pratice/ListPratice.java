package com.example.pratice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListPratice {

	public static void main(String[] args) {
		
		List<Double> price = new ArrayList<>(List.of(3.56,1.99,2.35)); 
		List<String> fruits = new ArrayList<>(List.of("Apple","Banana","Pears"));
			
		if(price.size() != fruits.size()) {
			System.out.println("List size miss match issue, please check list size");
		}else {
			System.out.println("Fruits List Size: " + fruits.size());
			System.out.println("Price List Size: " + price.size());
			System.out.println("List size are matching!!!");
		}
		
		Map<String, Double> fruitMap = new HashMap<>();
		
		for(int i=0;i<fruits.size();i++) {
			fruitMap.put(fruits.get(i), price.get(i));
			//System.out.println(fruitMap);
		}
		for(Map.Entry<String, Double> entry:fruitMap.entrySet()) {
			System.out.println("Fruits: " + entry.getKey() + " ,Price: " + entry.getValue() );
		}
			
				
		
	}

}
