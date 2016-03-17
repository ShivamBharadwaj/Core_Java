package com.my.sample;

public class Sample {
	int y = 5;
	int month = 14;
	void show() {
		System.out.println("hi ");
		if (month >= 12) {
			//y += month / 12;
			y =y + month / 12;
			System.out.println(y);
		}
	}

	public static void main(String[] args) {
		Sample s = new Sample();
		s.show();

	}

}
