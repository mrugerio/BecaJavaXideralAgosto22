package com.curso;

import java.util.*;

public class SetCollection {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();

		System.out.println(set.add(66)); //true 
		System.out.println(set.add(66)); //false  
		System.out.println(set.size()); //1 
		set.remove(66); 
		System.out.println(set.isEmpty()); //true
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("Seis");
		set2.add("Uno");
		set2.add("Dos");
		set2.add("Tres");
		set2.add("Cuatro");
		set2.add("Uno");
		
		System.out.println(set2);



	}

}
