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

	}

}
