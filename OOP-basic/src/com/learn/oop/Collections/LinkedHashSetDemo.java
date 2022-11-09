package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	public static void main(String[] args) {
		
		LinkedHashSet<String> laptops = new LinkedHashSet<>();
		
		laptops.add("HP");
		laptops.add("DELL");
		laptops.add("ASUS");
		laptops.add("HP");
		laptops.add("HP");
		
		Iterator<String> its =  laptops.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}	
	}
}
