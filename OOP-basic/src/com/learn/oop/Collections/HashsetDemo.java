package com.learn.oop.Collections;

import java.util.HashSet;
import java.util.Iterator;

public class HashsetDemo {
	public static void main(String[] args) {
		
		HashSet<String> members = new HashSet<String>();
		
		members.add("Vinod");
		members.add("Raju");
		members.add("Sudheer");
		
		Iterator<String> its = members.iterator();
		while(its.hasNext())	{
			System.out.println(its.next());
		}
	}
}
