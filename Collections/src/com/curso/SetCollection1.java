package com.curso;

import java.util.*;

public class SetCollection1 {

	public static void main(String[] args) {
		
		Set<String> set2 = new HashSet<>();
		
		set2.add("Seis");
		set2.add("Uno");
		set2.add("Dos");
		set2.add("Tres");
		set2.add("Cuatro");
		set2.add("Uno");
		
		Iterator<String> iteratorString = set2.iterator();

		while(iteratorString.hasNext()) {
			  System.out.println(iteratorString.next());
		}

	}

}
