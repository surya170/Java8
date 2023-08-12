package com.java.java8;

@FunctionalInterface
interface Service {
	String login(String username, String Password);
}

/*
 * @author : Surya
 *  LAMBDA EXPRESSION WITH RETURN TYPE 
 *  Here These Example is written Lambda Expression with return type
 */
public class Java803 {
	public static void main(String[] args) {
		Service s1 = (username, password) -> {
			return username.equalsIgnoreCase("surya") && password.equalsIgnoreCase("surya@123") ? "Login Success"
					: "Login Failure";
		};
		String status1 = s1.login("Surya", "Surya@123");
		System.out.println("Your Login Status...." + status1);
	}
}
