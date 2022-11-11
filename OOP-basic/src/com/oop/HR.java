package com.oop;

public class HR extends Employe {
	Integer Bouns =  20000;
	//Integer total = Bouns + BaseSalary;
public static void main(String[] args) {
	HR Anisha = new HR();
	Anisha.TotalSalary(Anisha.BaseSalary,Anisha.Bouns);
}

}
