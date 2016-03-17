package com.my.sample;

import java.util.Scanner;

public class LeapYear {
 public void isleapYear(){
	 int year = 0;
	 if(year%4==0&&year%100!=0||(year%400==0)){
		System.out.println("leap year"); 
	 }
	 else{
		 System.out.println("not a leap year");
	 }
 }
	public static void main(String[] args) {
	//	ConstructorDemo p=new ConstructorDemo(7,81);
		LeapYear l=new LeapYear();
		@SuppressWarnings("resource")
		Scanner scan= new Scanner(System.in);
		System.out.println("enter the year");
		@SuppressWarnings("unused")
		int year=scan.nextInt();
		l.isleapYear();
	}

}
