package com.oop;

public class Employe {
	Integer BaseSalary = 50000;
void TotalSalary (Integer BS, Integer Bonus) {
Integer total = BS + Bonus;
System.out.println(total);
}
 void TotalSalary(Integer BS, Integer Bonus, Integer insentive) {
	 Integer total = BS + Bonus + insentive;
	 System.out.println(total);
 }
 void working() {
	 System.out.println("Employe is working");
 }
}
