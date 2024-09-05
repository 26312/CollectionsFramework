package com.example.listsession;

import java.util.ArrayList;
import java.util.List;

/**
 * Section: Collection 
 * Step:6
 * List Inteface - Methods to add, remove and change elements and lists
 * @author 2099643
 *
 */
public class ListInterfaceWorkingWithMethods {

	public static void main(String[] args) {
		
		List<String> words = List.of("Apple","Bat","Cat","Dog");
		List<String> arrayListWords = new ArrayList<>(words);
			System.out.println("arrayListWords: "+arrayListWords);
			
			/*
			 * add() method will add an element in the list but in the last
			 */
			System.out.println(arrayListWords.add("Elephant"));
			System.out.println("arrayListWords2 : "+arrayListWords);
			
			/*
			 * add(index_no.,element) method will add an element in the specified index value of the list 
			 */
			arrayListWords.add(3, "Penuts");
			System.out.println("arrayListWords3 : "+arrayListWords);
			
			/**
			 * ArrayList allows duplicate elements
			 */
			arrayListWords.add(5, "Penuts");
			System.out.println("arrayListWords4 : "+arrayListWords);
			
			/*
			 * addAll() method will allow to add another list as a Collection in another list
			 */
			List<String> newList = List.of("Zebra","Lion","Monkey","Rhino");
			
//			arrayListWords.addAll(newList);
//			System.out.println("arrayListWords5 : "+arrayListWords);
//			
			/*
			 * addAll(index_no. element) method will add Collection of elements from
			 * the location specified in the index value
			 */
			arrayListWords.addAll(1, newList);
			System.out.println("arrayListWords5 : "+arrayListWords);
			
			
			arrayListWords.add(7, "Fish");
			System.out.println("arrayListWords6 : "+arrayListWords);
			
			/*
			 * remove() method will remove the element from the List
			 * If it is a duplicate element, then the first element of the duplicate will be removed
			 * e.g: (Fish,Penuts,Dogs,Elephant,Penuts)->Fish,Dogs,Elephant,Penuts)
			 */
			arrayListWords.remove("Penuts");
			System.out.println("arrayListWords7 : "+arrayListWords);
			arrayListWords.remove("Penuts");
			System.out.println("arrayListWords7 : "+arrayListWords);
			
			/*
			 * get() returns the element at the specified position in the list
			 */
			System.out.println("Get: "+arrayListWords.get(1));
			/*
			 * clear() method, will clear of the list, 
			 * in-short will remove all the elements from the list
			 */
			arrayListWords.clear();
			System.out.println("arrayListWords8 : "+arrayListWords);
			
			/*
			 * Exercise
			 */
			
			List<String> list = List.of("Pen","Pencil","Rubber","Sharpner");
			List<String> list2 = List.of("Pan","Boiler","Plates","Bowls");
			List<String> list3 = List.of("TV","Music System","Computer","Laptops");
			
			List<String> mergeAll = new ArrayList<>();
			
			mergeAll.addAll(list);
			mergeAll.addAll(list2);
			mergeAll.addAll(list3);
			
			System.out.println("MergeAll: "+mergeAll);
			
			
			
	}

}
