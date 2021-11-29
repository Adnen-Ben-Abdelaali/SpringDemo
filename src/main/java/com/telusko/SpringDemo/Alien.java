package com.telusko.SpringDemo;

public class Alien {
	
	private int age;
	
	private Computer com;
	
//	public Alien() {
//		
//		System.out.println("ALien object created !!");
//	}
//	
	
	
	public Alien(int age) {
		
		this.age = age;

	}
	
	public Alien(int age, Computer com) {
		
		this.age = age;
		this.com = com;
	}
	
	
	public void code() {
		
		System.out.println("I m coding bitch !!!");
		com.code();
	}
	
	public void setAge(int age) {		
		System.out.println("Age has been assigned !!");
		this.age = age;
	}
	
	public int getAge() {
		
		return this.age;
	}
	
	public void setCom(Computer com) {
		
		this.com = com;
	}
	
	public Computer getCom() {
		
		return this.com;
	}
}
