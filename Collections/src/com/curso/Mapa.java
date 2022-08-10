package com.curso;

import java.util.*;

public class Mapa {

	public static void main(String[] args) {

		Map<String, String> mapAnimals = new HashMap<>();

		mapAnimals.put("koala", "bamboo");
		mapAnimals.put("leon", "carne");
		mapAnimals.put("koala", "carne");
		mapAnimals.put("pato", "pan");
		
		System.out.println(mapAnimals);
		
		Set<String> animals = mapAnimals.keySet();
		System.out.println(animals);
		
		Collection<String> comidas = mapAnimals.values();
		System.out.println(comidas);
		
		String food = mapAnimals.get("koala"); 
		System.out.println(food);
		
		for (String key : animals)
			System.out.println(key + " comida: " + mapAnimals.get(key));
		
		
		
		
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
		
		List<String> lista5 = mapDeListas.get(5);
		
		System.out.println(lista5);
		
		System.out.println("****");
		
		for (Integer key : mapDeListas.keySet()) {
			System.out.println(key);
		}
		
		System.out.println("****");
		for (List<String> listaStrings : mapDeListas.values()) {
			System.out.println("Otra Lista");
			for (String letra :listaStrings) {
				System.out.println(letra);
			}
		}
		System.out.println("****");
		for (Integer key : mapDeListas.keySet()) {
			System.out.println("Elementos de la lista número: "+key);
			List<String> lista = mapDeListas.get(key);
			for (String letra :lista) {
				letra = letra.concat(": "+ key);
				System.out.println(letra);
			}
		}
		
//		Map<Empleado, List<Puesto>> mapEmpleado;
//		Map<Cliente, Set<Bancos>> mapCliente;
//		Map<Empresa, Queue<Socios>> mapCliente;
		

	}

}
