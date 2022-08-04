package com.curso.v1;

public class Principal {

	public static void main(String[] args) {

		//Para atributos prevalece la Referencia
		//Para metodos prevalece el objeto
		AguilaReal ave1 = new AguilaReal();
		System.out.println(ave1.tipo);
		ave1.volar();
		ave1.volarAve();
		
		Aguila ave2 = new AguilaReal();
		System.out.println(ave2.tipo);
		ave2.volar();
		ave2.volarAve();

		Ave ave3 = new AguilaReal();
		System.out.println(ave3.tipo);
		ave3.volar();
		ave3.volarAve();
		
		Aguila ave4 = (Aguila)ave1;
		Ave ave5 = (Ave)ave1;
		Object ave6 = (Object)ave4;
		//String ave7 = ave1; //no se puede
		

		
	}

}
