package com.java.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/*
 * @author : Surya
 * Filter() Method Example
 */
public class Java807 {
	public static void main(String[] args) {
		/*
		  1. Filter the emp data print the data.
		  2. Filter the emp data collect the data in List Format.
		  3. Filter the emp data collect the data in Set Format.
		  4. Filter the emp data findFirst element.
		  5. Filter the emp data get the specefic element.
		  6. Filter the emp data find first or Else null.
		*/
		List<Employee> emps = Arrays.asList(new Employee(10,"Surya", 1000.023),
				                                                       new Employee(11,"anu",2002.234),
				                                                       new Employee(12,"aruna", 3000.023),
				                                                       new Employee(14,"sravya", 4000.023) 
				                                                     );
		
		System.out.println("**** Filter the emp data print the data  ****");
		emps.stream().filter(emp -> emp.ename.startsWith("a"))
		                        .forEach(emp -> System.out.println(emp.eid+" "+emp.ename+" "+emp.esal));
		
		System.out.println("**** Filter the emp data collect the data in List Format. ****");
		List<Employee> empList = emps.stream().filter(emp ->emp.ename.startsWith("a")).collect(Collectors.toList());
		System.out.println(empList);
		
		System.out.println("**** Filter the emp data collect the data in Set Format  ****");
		Set<Employee> empSet = emps.stream().filter(emp -> emp.esal> 2000).collect(Collectors.toSet());
		System.out.println(empSet);
		
		System.out.println("**** Filter the emp data findFirst element.  ****");
		Employee employee = emps.stream().filter(emp ->emp.esal > 2002).findFirst().get();
		System.out.println(employee.eid+" "+employee.ename+" "+employee.esal);
		
		System.out.println("**** Filter the emp data get the specefic element.  ****");
		Employee employee2 = emps.stream().filter(emp -> emp.esal > 100).skip(3).findFirst().get(); 
		System.out.println(employee2.eid+" "+employee2.ename+" "+employee2.esal);

		 System.out.println("**** Filter the emp data find first or Else null. ****");
		Employee empdata = emps.stream().filter(emp -> emp.esal > 10000).findFirst().orElse(null);
		if(empdata != null) 
			System.out.println(empdata.eid+" "+empdata.ename+" "+empdata.esal);
		else 
			System.out.println(empdata);

	} // Method 
}   // Class
