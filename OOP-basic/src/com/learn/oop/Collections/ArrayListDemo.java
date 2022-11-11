package com.learn.oop.Collections;

import java.util.ArrayList;
import java.util.Iterator;



public class ArrayListDemo {
public static void main(String[] args) {
	ArrayList<String> ParticipantList = new ArrayList();
	ParticipantList.add("Vinod");
	ParticipantList.add("Rajesh");
	ParticipantList.add("Srinivas");
	ParticipantList.add("Sudheer");
	
   Iterator itr = ParticipantList.iterator();
   while(itr.hasNext());
	System.out.println(ParticipantList);

}
}
