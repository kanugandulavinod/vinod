package com.learn.oop.abstraction;

public class CSK extends IPL {
	void play() {
		System.out.println("CSK is playing good in 2021 session");
	}
	public static void main(String[] args) {
		CSK obj = new CSK();
		obj.play();
	}

}
