package com.curso;

import java.util.*;

public class Mapa2 {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("A");
		l1.add("B");
		l1.add("C");
		
		List<String> l2 = new ArrayList<>();
		l2.add("D");
		l2.add("E");
		l2.add("F");
		
		List<String> l3 = new ArrayList<>();
		l3.add("G");
		l3.add("H");
		l3.add("I");
		
		List<String> l4 = new ArrayList<>();
		l4.add("J");
		l4.add("K");
		l4.add("L");
		
		List<String> l5 = new ArrayList<>();
		l5.add("M");
		l5.add("N");
		l5.add("Ñ");

		Map<Integer, List<String>> mapDeListas = new HashMap<>();
		
		mapDeListas.put(1, l1);
		mapDeListas.put(2, l2);
		mapDeListas.put(3, l3);
		mapDeListas.put(4, l4);
		mapDeListas.put(5, l5);
		
		Iterator<Integer> iteratorInt = mapDeListas.keySet().iterator();
		
		while(iteratorInt.hasNext()) {
			  System.out.println(iteratorInt.next());
		}
		
		Iterator<List<String>> iteratorListString = mapDeListas.values().iterator();
		
		while(iteratorListString.hasNext()) {
			  System.out.println(iteratorListString.next());
		}
		
	
	}

}
