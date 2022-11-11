package com.junit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

public class ParameterizedTestedDemo {
	//@ValueSource
	//@EnumSource
	//@MethodSource
	//@CsvSource
	//@CsvFileSource
	//@ArgumentsSource
	
@ParameterizedTest(name = "{index} -Run with the args = {0}")
@ValueSource( ints={1,5,3,7})
public void valueSourceTest(int args) {
	System.out.println(args);

}
//.....Enum Source...
 enum TV{
	 LG,SONI,SAMSUNG;
 }
 @ParameterizedTest
 @EnumSource(TV.class)
 public void enumSourceTest (TV tv) {
	 System.out.println(tv);
 }
// ------method source----------
 private static String[] cars() {
	 return new String[] {"Maruthi,Honda,Kia"};
 }
 @ParameterizedTest
 @MethodSource("cars")
 public void methodSourceTest(String cars) {
	 System.out.println(cars);
 }
 //................csv source....
 @ParameterizedTest
 @CsvSource({"rakesh","vinod","chinna"})
 public void csvSourcetest(String name) {
	 System.out.println(name);
 }
 
}





