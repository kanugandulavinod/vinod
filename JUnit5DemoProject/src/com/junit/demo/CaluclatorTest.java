package com.junit.demo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.junit.test.Caluclator;

 public class CaluclatorTest {

	@Test
	@DisplayName("adding two positive two numbers")
	public void testMethod() {
		Caluclator clc = new Caluclator();
										
		int sum = clc.add(10,100);
		assertEquals(10, sum);
		System.out.println("the total is " + sum);
	}
	
	@Test
	@DisplayName("substracting two positive two numbers")
	public void testsubMethod() {
		Caluclator clc = new Caluclator();				
		int total = clc.sub(10,300);
		assertEquals(90, total);				

		System.out.println("the total is " + total);
}
	@Test
	@DisplayName("multiplication two positive two numbers")
	public void productMethod() {
		Caluclator clc = new Caluclator();
		int total = clc.product(500,100);
		assertEquals(5, 100);					
		System.out.println("the total is " + total);
	}
 }
