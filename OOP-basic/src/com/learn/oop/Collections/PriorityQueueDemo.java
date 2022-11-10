package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueueDemo {
public static void main(String[] args) {
	PriorityQueue<String> cq = new PriorityQueue<>();
	
	cq.add("Chinna");
	cq.add("Ranjith");
	cq.add("Ramesh");

	System.out.println(" Lead is   "  +cq.peek());
	Iterator<String > its = cq.iterator();
	while(its.hasNext());
	System.out.println(its.next());
}
}
