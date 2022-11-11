package com.oop;

public class Sales extends Employe {
Integer Bonus = 10000;
Integer insentive;

void working() {
	System.out.println("Employe is a part of Sales team and they are working");
}
public static void main(String[] args) {
	 Sales Ashish = new Sales();
	 Ashish.insentive = 2000;
	 Ashish.TotalSalary(Ashish.BaseSalary, Ashish.Bonus, Ashish.insentive);
	 Ashish.working();
}
}
