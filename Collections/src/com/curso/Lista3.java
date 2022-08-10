package com.curso;

import java.util.*;

public class Lista3 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		
		List<String> nombres = new ArrayList<>();
		nombres.add("Tercio");
		nombres.add("Patrobas");
		nombres.add("Andronico");
		
		Iterator<Integer> iteratorNum = numbers.iterator();
		Iterator<String> iteratorString = nombres.iterator();
		
		while(iteratorNum.hasNext()) {
			  System.out.println(iteratorNum.next());
		}
		
		while(iteratorString.hasNext()) {
			  System.out.println(iteratorString.next());
		}
	}

}
