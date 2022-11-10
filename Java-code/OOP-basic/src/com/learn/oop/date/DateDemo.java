package com.learn.oop.date;
import java.time.LocalDate;
import java.time.LocalDateTime;



public class DateDemo {
public static void main(String[] args) {
	LocalDate LocalDate = LocalDate.now();
	LocalDate yesterday = Date.minusDays(1);
	LocalDate tomrrow = Date.plusDays(1);
	LocalDateTime time = LocalDateTime.now();
}
}