package com.my.sample;

import java.util.Scanner;

public class AB {
  
	public static void main(String[] args) {
		//int x =Integer.parseInt("9");
	     // double c = Double.parseDouble("5");
	      @SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
	      //2-for binary conversion
	      System.out.println("enter the no in binary format");
	      String s=scan.nextLine();
	      int b = Integer.parseInt(s,2);
	      //("to be converted",to the base)
	     // int l = Integer.parseInt("444",10);

	     // System.out.println(x);
	      //System.out.println(c);
	      //System.out.println(b);
	      System.out.println(b);

	}

}
