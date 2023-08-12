package com.java.java8;

@FunctionalInterface
interface Operations {
	void add(int num1, int num2);
}

/*
 * @author : Surya
 * LAMBDA EXPRESSION WITH ARGUMENTS 
 * Here These Example is written Lambda Expression with arguments
 */
public class Java802 {
	public static void main(String[] args) {
		Operations op1 = (int num1, int num2) -> System.out.println("Addition of two numbers.." + (num1 + num2));
		op1.add(10, 20);
		
		Operations op2 = (num1,num2) -> System.out.println("Addition of two numbers..."+(num1+num2));
		op2.add(100,200);
	}
}
