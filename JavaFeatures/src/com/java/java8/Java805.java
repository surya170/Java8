package com.java.java8;

import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * @author : Surya
 * filter() method : It is used to filter the data based on the condition.
 *  Syntax: Stream<T> filter(Predicate<? super T> predicate);
 *  Predicate is a functional Interface 
 *  @FunctionalInterface
     public  interface Predicate<T> { 
        boolean test(T t);
     }
   
 */
public class Java805 {
	public static void main(String[] args) {
		List<Integer> numbers = List.of(5, 6, 8, 3, 6, 9, 2, 8);

		System.out.println("**** Filter the even data and  Printing");
		numbers.stream().filter(i -> i % 2 == 0).forEach(number -> System.out.println(number));

		System.out.println("**** Filter the even data and Collect as list format");
		List<Integer> even = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(even);

		System.out.println("***** Filter the even data and Collect as Set Format");
		Set<Integer> evennoduplicates = numbers.stream().filter(i -> i % 2 == 0).collect(Collectors.toSet());
		System.out.println(evennoduplicates);

		System.out.println("***** Filter the even data and Count number of evens");
		long count = numbers.stream().filter(i -> i % 2 == 0).count();
		System.out.println(count);
		
		System.out.println("***** Filter the even data and Find First Element");
		int num = numbers.stream().filter(i -> i % 2 == 0).findFirst().get();
		System.out.println(num);
    
		System.out.println("***** Filter the even data and Find Specific Element");
		// 6 8 6 2 8
		int specnum = numbers.stream().filter(i -> i%2 == 0).skip(2).findFirst().get();
		System.out.println(specnum);

	}
}
