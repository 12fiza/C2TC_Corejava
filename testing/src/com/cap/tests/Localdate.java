package com.cap.tests;
import java.time.LocalDate;
public class Localdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocalDate date =LocalDate.parse("2021-08-13");
		System.out.println("current date is"+date);
		
		LocalDate currdate = LocalDate.now();
		System.out.println("Current date is"+currdate);
		
		LocalDate date1 = LocalDate.of(2021, 8, 17);
		System.out.println("current date is"+ date1);
		

	}

}
