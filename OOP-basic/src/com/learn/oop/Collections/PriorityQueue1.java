package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.PriorityQueue;

public class PriorityQueue1 {

	public static void main(String[] args) {
		
		PriorityQueue<String> Employee = new PriorityQueue<>();
		
		Employee.add("Vinod");
		Employee.add("Sudheer");
		Employee.add("Saikumar");
		Employee.add("mahesh");

		System.out.println(" Lead is   "  + Employee.peek());
		Iterator<String > its = Employee.iterator();
		while(its.hasNext());
		System.out.println(its.next());
	}
}
