package com.my.sample;

public class ConstructorDemo {
	ConstructorDemo(int n,int y){
		System.out.println("This is constructor call..."+n+" "+y);
	}
	/*ConstructorDemo(){
		System.out.println("This is constructor call...");
	}*/

	public static void main(String[] args) {
		ConstructorDemo p=new ConstructorDemo(7,81);
		LeapYear l=new LeapYear();
		l.main(null);
		
	}

}
