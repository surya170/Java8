package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * @author : Surya
 * map() method is used to perform or apply the operation on every element in sequence.
    marks = [45,67,34,90,89]
    every person need to add +2 marks. the we choose map().
    Syntax : 
       public final <R> Stream<R> map(Function<? super P_OUT, ? extends R> mapper)
 */
public class Java808 {
	public static void main(String[] args) {
		List<Integer> marks =  Arrays.asList(78,45,34,80,69);
		
		 marks.stream()
		           .map(mark ->  mark+2)
		           .forEach(mark -> System.out.println(mark));
		 
		 List<String> names = Arrays.asList("Surya","Varun","Himanshu","Swetha");
		 names.stream()
		            .map(name -> name = name +"it")
		            .forEach(name -> System.out.println(name));
		 
		 // Take these numbers 2 3 4 5 8 9 7 filter the even numbers and every element  *10
		 List<Integer> numbers =  Arrays.asList(2,3,4,2,4,5,8,9,7);
		 List<Integer> evenlist = numbers.stream()
		                                                       .filter(i -> i%2 == 0) 
		                                                       .map(num -> num * 10)
		                                                       .collect(Collectors.toList());
		 System.out.println(evenlist);
		 
		 Set<Integer> evenSet = numbers.stream()
                                                               .filter(i -> i%2 == 0) 
                                                               .map(num -> num * 10)
                                                               .collect(Collectors.toSet());
		 System.out.println(evenSet);
	}
}
