package com.java.java8;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * @author : Surya
 * Filter() Method Example
 */
public class Java806 {
	public static void main(String[] args) {
		/*
		 * Take List of names and write the code for below cases 
		        1. Filter the names start with "r" print the data.
		        2. Filter the names start with "r" and Length ==4 take as List Format
		        3. Filter the names start with "r" and Length ==4 take as Set Format
		        4. Filter the names start with "r" and count the data.
		        5. Filter the names start with "d" find the First element.
		        6. Filter  the names starts with "r" print the 3rd element.
		 */
		List<String> names = List.of("ravi", "raju", "rani", "radha", "devi", "krishna", "raju", "rani", "king",
				"Queen", "dekshith");

		System.out.println("**** Filter the names start with  print the data. ****");
		names.stream().filter(name -> name.startsWith("r")).forEach(name -> System.out.print(name+" "));
		System.out.println();

		System.out.println("*****  Filter the names start with r and Length ==4 take as List Format  ****");
		List<String> NamesListFormat = names.stream().filter(name -> name.startsWith("r") && name.length() == 4)
				.collect(Collectors.toList());
		System.out.println(NamesListFormat);
		

		System.out.println("*****  Filter the names Starts With r and Length == 4 take as Set Format  ****");
		Set<String> NamesSetFormat = names.stream().filter(name -> name.startsWith("r") && name.length() == 4 ).collect(Collectors.toSet());
        System.out.println(NamesSetFormat);
        
        
        System.out.println("**** Filter the names start with r and count the data. *****");
         long count = names.stream().filter(name -> name.startsWith("r")).count();
         System.out.println(count);
         
         System.out.println("**** Filter the names start with d find the First element. ****");
         String firstnamewithd = names.stream().filter(name -> name.startsWith("d")).findFirst().get();
         System.out.println(firstnamewithd);
         
         System.out.println("**** Filter  the names starts with r print the 3rd element.");
         String thirdelementwithr = names.stream().filter(name -> name.startsWith("r")).skip(2).findFirst().get();
         System.out.println(thirdelementwithr);
         
        
	}
}
