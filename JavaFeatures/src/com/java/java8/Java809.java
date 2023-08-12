package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
 * @author : Surya
 * map() method is used to perform or apply the operation on every element in sequence.
    marks = [45,67,34,90,89]
    every person need to add +2 marks. the we choose map().
    Syntax : 
       public final <R> Stream<R> map(Function<? super P_OUT, ? extends R> mapper)
 */
public class Java809 {
	public static void main(String[] args) {
		List<Employee> emps = Arrays.asList(new Employee(101,"surya",10000.45),
				                                                      new Employee(102,"anu",20000.45),
				                                                      new Employee(103,"sravya",30000.45),
				                                                      new Employee(104,"chandu",40000.45)
				                                                     );
		emps.stream()
		         .map(emp -> emp.getEname()+" CSE")
		         .forEach(name -> System.out.println(name));
		
		// Filter te people having salary greather than 25000 and add every emp esal + 1000 and print the emp
		emps.stream()
		         .filter(emp -> emp.getEsal() >  25000)
		         .map(emp -> {
		        	 emp.setEsal(emp.getEsal()+1000);
		        	 return emp; })
		         .forEach(emp -> System.out.println(emp)) ;
		
		System.out.println("============================");
		
		List<Employee> emplist = emps.stream()
		                                                     .filter(emp -> emp.getEsal() < 25000)
		                                                     .map(emp -> { emp.setEname(emp.getEname()+"CSE");return emp;})
		                                                     .collect(Collectors.toList());
		emplist.forEach(emp -> System.out.println(emp));
	}
}
