package org.cap.demo;

public class MainClass {

	public static void main(String[] args) {
		System.out.println("Hello World!!");
		greet();
		
		SalesClass salesClass = new SalesClass();
		salesClass.show();
		
		MoneyClass moneyClass = new MoneyClass();
		moneyClass.display();
		
		PurchaseClass purchaseClass = new PurchaseClass();
		purchaseClass.display();

	}
	
	public static void greet() {
		System.out.println("Hello");
		for(int i = 0; i< 15; i++) {
			System.out.println(i+2);
			System.out.println(2*i);
		}
	}

}
