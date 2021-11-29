package com.telusko.SpringDemo;

public class Laptop implements Computer{
	
	public Laptop() {
		
		System.out.println("Laptop object created !!");
	}
	
	public void code() {
		
		System.out.println("Code successfully compiled with LAPTOP !");
	}
	
	public void compile() {
		
		System.out.println("Code compiled in Laptop");
	}
}
