package com.curso;

public class Principal {

	public static void main(String[] args) {
		
		//3 Componentes
		//Variable de Referencia
		//Referencia
		//Objeto

		String x = "Hola Mundo";
		String y = "Hola Mundo"; 
		String z = "Hola Mundo"; //1 Objeto en memoria
		
		z = "Hello World"; //String es INMUTABLE
		
		String w = new String("Hola Mundo"); //2 Objetos

		boolean resultado = x.equals(w); //true
		System.out.println(resultado);

		
		boolean resultado2 = x == z; // true
		
		//3 variables referencia
		
		StringBuilder s1 = new StringBuilder("Hello");
		StringBuilder s2 = new StringBuilder("Hello");
		StringBuilder s3 = new StringBuilder("Hello");
		
		s3 = s2;

		resultado = s1.equals(s2); //false
		System.out.println(resultado);

		
		resultado2 = s1 == s2; // false
		
		s2 = null; //Variable de referencia no tiene referencia
		//es decir no apunta a ningún objeto
		
		int i = 1;
		int e = 01;
		
		System.out.println(i+e);
		
		/*
		9 - 11 
		11- 11:30 receso
		11:30 - 12:45
		12:45 - 13:00 receso
		13 -14
		14-15 Comida
		15 - 16:40 
		16:40- 17 receso 
		17:00 - 18:00*/
		
		
	}

}
