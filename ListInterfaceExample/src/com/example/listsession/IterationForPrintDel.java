package com.example.listsession;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Section: Collection 
 * Step:8
 * List & ArrayList:Iteration approach for Printing and Delete
 * 
 * @author 2099643
 *
 */
public class IterationForPrintDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * In class IteratingAroundElements.java, we have performed 3 kinds of iterations around the list. 
		 * Why we have performed 3 types of iteration? Why do we need them?
		 * In certain operations we want to use specific kind of looping.
		 */

		List<String> words = List.of("Apple","Bat","Cat");
		
		List<String> wordsArrayList = new ArrayList<>(words);	
		
		// Printing words ending with "at"
//		for(String wordsAL:wordsArrayList) {
//			if(wordsAL.endsWith("at")) {
//				System.out.println(wordsAL);
//			}
//		}
		
		// Removing words which start with "at"
//		for(String wordsAL:wordsArrayList) {
//			//System.out.println(wordsAL);
//			if(wordsAL.endsWith("at")) {
//				wordsArrayList.remove(wordsAL);
//				System.out.println(wordsArrayList);
//			}
//		
//		}
		
		/**
		 *  The result from above for-loop prints result as [Apple, Cat].
		 *  We can notice that value "Cat" also gets printed even though we implemented
		 *  the logic to remove it.
		 *  This is because in a Enhanced For Loop, it is not recommended to perform modification
		 *  specially deletion from the list. We are removing the word from the list and it might change the
		 *  way iterations happen. 
		 *  		
		 *  In such situation it is advised to use "Iterator"
		 */
	
		Iterator<String> iterator = wordsArrayList.iterator();
		
		while(iterator.hasNext()) {
			if(iterator.next().endsWith("at")) {
				iterator.remove();
			}
		}System.out.println(wordsArrayList);
	
	
	
	
	
	}
	
	
	
	

}
