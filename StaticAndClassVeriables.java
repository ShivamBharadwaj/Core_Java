package com.my.sample;
 class Am{
	int b;
	static int v;
	Am(int b,int v){
		
		b++;
		v++;
		int s=b+v;
		System.out.println("i m constructor b is "+b+"v is"+v+"and sum is="+s);
	}
	static{
		System.out.println("i m call when class is loaded ");
		//you cannot access non static variables in static block
		//System.out.println(b);
	}
	{
		b++;
		v++;
		System.out.println("i m init block"+b+" "+v);
	}
	private class E{
		E(){
			System.out.println("E conc call");
		}
	}
	
}

public class StaticAndClassVeriables {

	public static void main(String[] args) {
Am a=new Am(5,6);



}
}