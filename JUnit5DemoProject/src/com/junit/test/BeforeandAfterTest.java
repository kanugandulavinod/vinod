package com.junit.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BeforeandAfterTest {
	Caluclator calc;
	@BeforeEach
	public void init() {
		calc = new Caluclator();
		System.out.println("the before each method is being called right now");
	}
	@BeforeAll
	public void after() {
		System.out.println("before all");
	}
	@AfterEach
	public void AfterAll() {
		System.out.println("After each test case");
	}
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
		assertEquals(500, total);					
		System.out.println("the total is " + total);
	}
 }



