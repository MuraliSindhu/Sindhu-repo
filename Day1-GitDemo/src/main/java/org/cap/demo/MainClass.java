package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		greet();
		
		SalesClass salesClass = new SalesClass();
		salesClass.show();
		
		MoneyClass moneyClass = new MoneyClass();
		moneyClass.display();

	}
	
	public static void greet() {
		System.out.println("Hello");
		for(int i = 0; i< 10; i++) {
			System.out.println(i);
		}
	}

}
