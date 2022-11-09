package com.learn.oop.Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
public static void main(String[] args) {
	LinkedList<String> fru = new LinkedList<String>();
		fru.add("mango");
		fru.add("apple");
		fru.add("orange");
Iterator<String> itr = fru.iterator();
while(itr.hasNext()) {
	System.out.println((itr.next()));
}
}
}
