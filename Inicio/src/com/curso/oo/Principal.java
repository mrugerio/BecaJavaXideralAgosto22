package com.curso.oo;

public class Principal {

	public static void main(String[] args) {
		
		Pato pato1 = new Pato();
		System.out.println("Pato0: "+pato1.nombre); //null
		System.out.println("Pato0: "+pato1.edad); //0
		System.out.println("Pato0: "+pato1.vuela); //false

		Pato pato2 = new Pato("Donald");
		
		System.out.println("Pato2: "+pato2.nombre);
		
		Pato pato3 = new Pato("Lucas",5);
		Pato pato5 = new Pato("Lucas",5);
		
		System.out.println(pato3.equals(pato5)); //false
		System.out.println(pato3==pato5); //false
		
		System.out.println("Pato3: "+pato3.nombre+", "+pato3.edad);
		
		Pato pato4 = pato2;
		
		pato4.nombre = "Otro";
		
		System.out.println("Pato2: "+pato2.nombre); //Otro

		
		
	}

}
