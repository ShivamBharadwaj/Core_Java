package com.my.sample;

public  class ClassDemo {
	{System.out.println("hhhhhhh");
	 }
	ClassDemo(){
		System.out.println("cons. call");
	}
	{
		System.out.println("hari");
	}
public static class HU{
	
	 static void show(){
		System.out.println("show call");
	}
	 
	 }

	public static void main(String[] args) {
		ClassDemo h=new ClassDemo();
		ClassDemo.HU.show();
		//System.out.println("hi");

	}

	
}