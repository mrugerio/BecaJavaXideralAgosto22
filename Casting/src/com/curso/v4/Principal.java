package com.curso.v4;

public class Principal {

	public static void main(String[] args) {

		Ave ave5 = new AguilaReal();
		System.out.println(ave5.tipo);
		ave5.volar();
		ave5.volarAve(); 
		//ave5.volarAguilaReal(); //NO SE PUEDE
		AguilaReal ave = (AguilaReal)ave5;
		ave.volarAguilaReal();
		System.out.println("********");
		
		Aguila ave4 = new AguilaReal();
		System.out.println(ave4.tipo);
		ave4.volar();
		ave4.volarAve();
		//ave4.volarAguilaReal();
		((AguilaReal)ave4).volarAguilaReal();
		//System.out.println(((AguilaReal)ave4).tipo);
		System.out.println(ave4.tipo);
		
		Object aveObject = new AguilaReal();
		((AguilaReal)aveObject).volar();
		System.out.println(((AguilaReal)aveObject).tipo);
		

	}

}
