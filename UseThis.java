package com.my.sample;

public class UseThis {
String name;
int salary;
	public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
	public static void main(String[] args) {
		UseThis S=new UseThis();
		S.setName("Harivans");
		System.out.println(S.getName());
		S.setName("Har");
		System.out.println(S.getName());
		S.setSalary(789);
		System.out.println(S.getSalary());
	
	}

}
