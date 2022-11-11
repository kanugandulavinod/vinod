package com.oop;

public class TV {
String Brand;
String ModelName;
Integer screenSize;
Integer price;
String colour;
String DisplayType;

public static void main(String[] args) {
	 TV lgOled = new TV();
	 TV SamsungFrame = new TV();
	 lgOled.Brand = "LG";
	 lgOled.ModelName = "4k oled 75 tv";
	 lgOled.screenSize = 75;
	 lgOled.price = 100000;
	 lgOled.colour = "black";
	 lgOled.DisplayType = "OLED";
	 System.out.println(lgOled.Brand + " " + lgOled.ModelName );
			 
}

}
