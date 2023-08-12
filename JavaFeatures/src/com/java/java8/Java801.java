package com.java.java8;

@FunctionalInterface
interface Greeting {
	void greet();
}

/*
 * @author : Surya
 * LAMBDA EXPRESSION WITHOUT  ARGUMENTS 
 * Here These Example is written Lambda Expression with out arguments
 */
public class Java801 {
	public static void main(String[] args) {
		Greeting g1 = () -> System.out.println("Hu Hu Hu ");
		g1.greet();
		
		Greeting g2 = () -> {  
			                  System.out.println("Lambda sleeping .......");
			                  System.out.println("Lambda Eating ..........");
		};
		g2.greet();
	}
}
