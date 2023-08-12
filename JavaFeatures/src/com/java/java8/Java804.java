package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/*
 * @author : Surya
 * forEach() : It is Used to  print the data collection Data.
 * Syntax for forEach() is : default void forEach(Consumer< ? super T > action) 
 * 
 * @FunctionalInterFace
 * public interface Consumer<T> {
        void accept(T t);   
    }
 */
public class Java804 {
	public static void main(String[] args) {
		 
	   // Using List
		List<String> names = Arrays.asList("Surya", "Ashok", "Varun");
		names.forEach((String name) -> System.out.println(name));

		List<Integer> numbers = Arrays.asList(10, 4, 5, 67, 34);
		numbers.forEach((Integer number) -> System.out.println(number));

		List<Employee> emps = Arrays.asList(new Employee(101, "Surya", 10000.34), new Employee(102, "ashok", 2000.34),
				                                                      new Employee(103, "amar", 3000.45));
		
		emps.forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		
		// Using Set 
		Set<String> colors = Set.of("red","orange","pink","violet");
		colors.forEach(color ->System.out.print(color+" "));
		System.out.println();	
		
		// Using Map
		// Here Surya occurs 5 times is occurs 10 times and Not Great occurs 100 times
		//Here forEach(BiConsumer <? super K, ? super V> action)  here forEach takes the BiConsumer has argument in map.
		Map<String,Integer>  wordCount = Map.of("Surya",5,"is",10,"Not Great", 100);
		wordCount.forEach((K,V) -> System.out.println("Key ..."+K+" Value..."+V));
		
		Map<Integer,Employee> employees =  Map.of(1, new Employee(201, "Akash", 100.45),
			                                                                 2, new Employee(202,"Swetha",200.25),
			                                                                 3, new Employee(203,"Himanshu",300.45)
				);
	      	employees.forEach((K,V) -> System.out.println(K +"  "+V.eid+" "+V.ename+" "+V.esal));
	}
}
