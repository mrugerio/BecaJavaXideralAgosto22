package com.curso;

public class Principal2 {

	public static void main(String[] args) {

		//String : InMutable
		//StringBuilder : Mutable
		//int : Primitivo
		
		String s = "Hello";
		StringBuilder sb = new StringBuilder("Hola");
		int i = 100;
		
		asignar(s, sb, i);
		
		System.out.println("Method main()");
		System.out.println("String: "+s); //Hello
		System.out.println("StringBuilder: "+sb); //Hola Mundo
		System.out.println("int: "+i); //100
		
		
	}

	private static void asignar(String s, StringBuilder sb, int i) {
		s = s.concat(" World");
		sb.append(" Mundo");
		i = 99999999;
		
		System.out.println("String: "+s); //Hello
		System.out.println("StringBuilder: "+sb); 
		System.out.println("int: "+i);
	}

}
