package com.learn.oop.Exception;

public class Eligibility {

public static void Eligible(Integer Exp) {
	if ( Exp < 10 ) {
		throw new ArithmeticException("This person is not eligible to be a senior System architect");
		
	}else{
		System.out.println("This person is eligible");
	}
}
public static void main(String[] args) {
	Eligible(9);
}
}
