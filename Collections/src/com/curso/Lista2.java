package com.curso;

import java.util.*;

public class Lista2 {

	public static void main(String[] args) {
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(99);
		numbers.add(5);
		numbers.add(81);
		Collections.sort(numbers);
		System.out.println(numbers);
		
		List<String> nombres = new ArrayList<>();
		nombres.add("Tercio");
		nombres.add("Patrobas");
		nombres.add("Andronico");
		Collections.sort(nombres);
		System.out.println(nombres);

	}

}
