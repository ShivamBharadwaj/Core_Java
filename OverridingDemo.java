
package com.my.sample;

class BC  {
	public BC() {
		System.out.println("BC cons call...............");
	}

	int show(int c, int n) {
		int sum = c + n;
		System.out.println("B call......" + sum);
		return sum;
	}

}

public class OverridingDemo {

	public static void main(String[] args) {
		BC b = new BC();
		b.show(89, 9);
		System.out.println("seee...................");
	}

}
