package com.example.queue;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

class QueueStringCustomizedComparator implements Comparator<String>{

	@Override
	public int compare(String value1, String value2) {
		// TODO Auto-generated method stub
		return Integer.compare(value2.length(),value1.length());
	}
	
}


public class QueueCustomized {

	public static void main(String[] args) {
		Queue<String> queue = new PriorityQueue<>();
		queue.addAll(List.of("Banana","Mango","Orange"));
		System.out.println(queue);
		/*
		 * Natural order in which the elements in the queue are being processed
		 */
		System.out.println("Natural Order:");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue);
		
		/*
		 * Customized Version after introducing Comparator
		 */
		Queue<String> queueComparator = new PriorityQueue<String>(new QueueStringCustomizedComparator());
		System.out.println("After Introducing Comparator");
		queueComparator.addAll(List.of("Bag","Ball","Cat","Lion","Hynea","Elephant","Mango","Banana"));
		System.out.println(queueComparator);

	}

}
