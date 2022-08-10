package com.curso;

import java.util.*;

public class DemoIterator {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
	    numbers.add(12); 
	    numbers.add(8);
	    numbers.add(2);
	    numbers.add(23);
	    numbers.add(29);//<= Iterator
	    
	    Iterator<Integer> it = numbers.iterator();
	    
	    while(it.hasNext()) {
	      Integer i = it.next();
	      System.out.println("Iterator: "+it.next()); //Danger!!!
	      if(i < 10) {
	        it.remove();
	      }
	    }
	    
	    //System.out.println(numbers);
	}

}
