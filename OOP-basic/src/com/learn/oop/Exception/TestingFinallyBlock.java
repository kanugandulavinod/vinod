package com.learn.oop.Exception;

public class TestingFinallyBlock {
public static void main(String[] args) {
	try {
		System.out.println("Inside the try block");
		int num = 100/0;
		System.out.println(num);
	}catch(NullPointerException e) {
	System.out.println(e);
}
	finally {
		System.out.println("this bit is excuted regards less of the");
	}
}
}
