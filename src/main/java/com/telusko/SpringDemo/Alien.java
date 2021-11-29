package com.telusko.SpringDemo;

public class Alien {
	
	int age;
	
	public Alien() {
		
		System.out.println("ALien object created !!");
	}
	
	public void code() {
		
		System.out.println("I m coding biotch !!!");
	}
	
	public void setAge(int age) {		
		System.out.println("Age has been assigned !!");
		this.age = age;
	}
}
