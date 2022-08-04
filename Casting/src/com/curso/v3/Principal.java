package com.curso.v3;

public class Principal {

	public static void main(String[] args) {

		Ave ave5 = new AguilaReal();
		System.out.println(ave5.tipo);
		ave5.volar();
		ave5.volarAve(); //Herencia
		//ave5.volarAguilaReal(); //NO SE PUEDE
		
		Aguila ave4 = new AguilaReal();
		System.out.println(ave4.tipo);
		ave4.volar();
		ave4.volarAve();//HERENCIA
		//ave4.volarAguilaReal(); //NO SE PUEDE
		
		AguilaReal ave1 = new AguilaReal();
		System.out.println(ave1.tipo);
		ave1.volar();
		ave1.volarAve();//HERENCIA
		ave1.volarAguilaReal();
		
	}

}
