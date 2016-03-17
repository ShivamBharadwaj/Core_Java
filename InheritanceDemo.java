package com.my.sample;
class A{
	A(int i){
	
		System.out.println("A call "+i);
	}
	
}
class B extends A{
	B(int i){
		super(i);
		System.out.println("B call "+i);
	}
}
class C extends B{
	C(int i){
		super(i);
		System.out.println("C call "+i);
	}
}
public class InheritanceDemo {

	public static void main(String[] args) {
		
@SuppressWarnings("unused")
C obj =new C (8);

	}

}
