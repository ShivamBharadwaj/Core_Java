package com.my.sample;

//can not have two class with public modifier
 public class Hari {

public void show(){
	System.out.println("show call");
}


	public static void main(String[] args) {

		System.out.println("hi");
Hari H =new Hari() ;
//H=new Hari();
H.show();
	}
}
