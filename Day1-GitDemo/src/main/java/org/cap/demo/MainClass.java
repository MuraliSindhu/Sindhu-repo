package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		greet();

	}
	
	public static void greet() {
		System.out.println("Hello");
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
	}

}
