package com.example.queue;

import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Section:Collection
 * Step: 21 - Introduction to PriorityQueue - Basic Methods and Customized Priority
 * @author 2099643
 *
 */
public class QueueBasicMethodsAndCustomized {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		System.out.println(queue);
		System.out.println("Method to get element out of queue: "+queue.poll());
		/*
		 * To add elements in queue
		 */
		queue.offer("Apple"); // adds single element
		System.out.println(queue);
		
		queue.addAll(List.of("Banana","Mango","Orange"));// add multiple elements as collection
		System.out.println(queue);
		
		/*
		 * Pulls out elements from the queue one after another in its natural order
		 * i.e, first element until last element in queue.
		 * However, we can set priority for the element to be polled
		 */
		System.out.println(queue.poll());
		System.out.println(queue); 
		System.out.println(queue.poll());
		System.out.println(queue); 
		
		
	}

}
