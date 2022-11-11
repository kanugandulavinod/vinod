package com.oop;

public class TV1 {
String Brand;
String ModelName;
Integer screenSize;
Integer price;
String colour;
String DisplayType;

void insertData(String B,String Mn,String c,Integer p,Integer ss,String dt) {
	Brand = B;
	ModelName = Mn;
	screenSize = ss;
	price = p;
	colour = c;
	DisplayType = dt;
}

public static void main(String[] args) {
	 TV1 lgOled = new TV1();
	 TV1 SamsungFrame = new TV1();
	 lgOled.Brand = "LG";
	 lgOled.ModelName = "4k oled 75 tv";
	 lgOled.screenSize = 75;
	 lgOled.price = 100000;
	 lgOled.colour = "black";
	 lgOled.DisplayType = "OLED";
	 System.out.println(lgOled.Brand + " " + lgOled.ModelName );
	 
	 SamsungFrame.insertData("Samusung", "65", "Frame tv", 65, 12000, "BEIGE");
	 System.out.println(SamsungFrame.Brand +"" + SamsungFrame.ModelName);

}
}
