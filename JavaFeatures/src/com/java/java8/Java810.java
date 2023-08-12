package com.java.java8;

import java.util.Arrays;
import java.util.List;

/*
 * @author : Surya
 *  reduce() : These Method performs the operations on all elements and  return one value.
 *   prices = [ 56,34,56,78,23,200,12]
 *                   56 + 34 = X 
 *                       X + 56 = Y 
 *                         Y + 78 =
 *   reduce Methods take two aguments at a time 
 *   synatx: 
 *      Optional<T> reduce(BinaryOperator<T> accumulator)
 *      
 *      @FunctionalInterface
 *      public interface BinaryOperator<T> {
               R apply(T t, U u);
         }
         Note:: 
             forEach(Consumer)   :: accept()
             forEach(Biconsumer) :: accept (T1,T2)
             
             filter(Predicate) ::  test(T)
             
             map(Function)   ::: apply(T)
             
             reduce(BinaryOperator) :: apply()
             
         Note :: 
         forEach() : used to print the data.
         filter() : based on the condition it will filter the data.
         map() : Perform the operation on all elements
         reduce() :: used to perform the operations on all data and return only one value.
 */
public class Java810 {
	public static void main(String[] args) {
		 List<Integer> prices = List.of(56,34,56,78,23,200,12);
		 
		 // sum of all elements 
		  int res = prices.stream()
		                          .reduce((i,j)-> i+j)
		                          .get();
		  System.out.println(res);
		  
		  System.out.println();
		  // Takes the names : filter the names with "r" and "p" adn length =4 : and every name add + "it" and  Combine all the elements 
		  List<String> names = Arrays.asList("raju","raju","dhoni","devi","Farioz");
		  String result = names.stream()
		             .filter(name -> name.startsWith("r") || name.startsWith("d") && name.length() == 4)
		             .map(name -> name+"it")
		             .reduce((name1,name2)-> name1+name2)
		             .get();
		  System.out.println(result);
		  
		  System.out.println();
		  // Takes the names :: Filter the numbers < 10 every element * 10 :: print the addition of element.
		  List<Integer> numbers = Arrays.asList(2,67,4,9,10,23,44);
		
		   Integer rs = numbers.stream()
		                  .filter(number -> number < 10)
		                  .map(num -> num * 10)
		                  .reduce((num1,num2) -> num1+num2)
		                  .get();
		   System.out.println(rs);
	}
}
