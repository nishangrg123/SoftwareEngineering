package com.example;

import java.util.Scanner;

//
//@FunctionalInterface
//interface A{
//	public void  show(int a);
//	
//}//end of A
//
//public class Count implements A {
////
////	@Override
////	public void show() {
////		System.out.println("Hi");
////	}
//	public static void main(String[] args) {
//		
//		A ai = (int a ) -> System.out.println(2 * a);
//		ai.show(5);
//
//	}
//
//}

public class Count {
	
		
		
	
	
	public static  void main(String args[]) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the value of a");
		double a = scanner.nextDouble();
		System.out.println("Enter the value of b");
		double b = scanner.nextDouble();
		MyInterface myInterface = (a1, b1) -> a + b;
		System.out.println(myInterface.sayHello(a, b));
		
		
		
		
		
		
		
		
		
	}//end of main
	
}//end of Count 
