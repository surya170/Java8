package com.java.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 
 * @author surya
 *     ******************* Data Sorting Opertions ***************************
         The data must follow the rule 
         1. Data must be homogenous.
         2. implements Comparable interface 
      Note::  In Java only String, All Wrapper classess are implements Comparable. The sorting is done using  comapreTo() method.
          There are three ways 
             a. Collections.sort()
             b. list.sort()
                 * It is expecting these  default void sort(Comparator<? super E> c)
             c. stream.sort()
             
             Note: 
              compareTo() will comapre the two objects return int value.
               ravi      ravi = 0   :: no change 
               ravi    anu =   1   :: Change required (Sorting is  required)
               anu    ravi  = -1  ::  no change
             
            Note::  
             sort(Comaprator) 
             here sort method use comaprator , but comaprator is a functional interface it contains Compare method 
             and in that Comapre  compareTo() is used two comapre the objects.
             
 */


public class Java811 {

	public static void main(String[] args) {
       List<String> names = Arrays.asList("chilaka","molaka","pilaka","gilaka");
       
       System.out.println("********* Approach-1 Collections.sort() method ***********");
       Collections.sort(names);
       System.out.println(names);
       
       
       System.out.println("********* Approach-1 Collections.sort() method by descebding order ***********");
       Collections.sort(names,Comparator.reverseOrder());
       System.out.println(names);
       
       System.out.println("********* Approach-2  list.sort() method ***********");
       names.sort((name1,name2) -> name1.compareTo(name2));
       System.out.println(names);

       
       
	}

}
