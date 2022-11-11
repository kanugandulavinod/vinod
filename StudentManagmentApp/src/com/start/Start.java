package com.start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Start {
public static void main(String[] args) throws IOException{
	System.out.println("Hello java");
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	while(true) {
		System.out.println("press 1 to add a student ");
		System.out.println("press 2 to Delete a student");
		System.out.println("press 3 to  diapaly a student");
		System.out.println("press 4 to  exit the app");
		int choice = Integer.parseInt(br.readLine());
		//Student st = new Student(name,phone,city);
	
   if (choice == 1){ 
   // add student
	   System.out.println("Enter Student full name");
	   String name = br.readLine();
	   
	   System.out.println("Enter Student phone number");
	   String phone = br.readLine();
	   
	   System.out.println("Enter Student city");
			 
	   
   }
   else if (choice == 2) { 
		   // delete student
	   }
   else if (choice == 3) { 
			                      // display student	
		   }
   else if (choice == 4) {  // exit student
		   }else {
			   
		   } 
   System.out.println("Thanks for using studentmanagement system");
	   }

	   }
   }

	
