package com.curso;

import java.util.*;

public class Lista1 {

	public static void main(String[] args)  {
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); 
		System.out.println(birds.size());
		try {
			birds.set(50, "robin");
		}
		catch(IndexOutOfBoundsException e) {
			System.out.println("Indice no encontrado");
		}finally {
			System.out.println("Pase lo que pase pasa por Finally");
		}
		System.out.println(birds.size()); //1
		System.out.println(birds);

		System.out.println("Programa continua");
		
		
		List<Integer> integers = new ArrayList<>();
		integers.add(5); //PRIMITIVO -> WRAPPER
		integers.add(200); //AUTOBOXING
		
		Integer entero = Integer.valueOf("1");
		int iEntero = entero; //WRAPPER -> PRIMITIVO
		//UNBOXING
		
		
		List<Character> chars = new ArrayList<>();
	}

}
