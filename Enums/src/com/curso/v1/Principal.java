package com.curso.v1;

public class Principal {

	public static void main(String[] args) {
		
		Estacion e = Estacion.INVIERNO;
		System.out.println(e);
		
//		boolean res = (e == Estacion.INVIERNO);
//		System.out.println(res);
//		
//		for (Estacion est:Estacion.values()) {
//			System.out.println(est.name() +" " + est.ordinal());
//		}
		
		switch(e) {
		case PRIMAVERA:
			System.out.println("EstacionPrimavera");
			break;
		case VERANO:
			System.out.println("EstacionVerano");
			break;
		case OTOÑO:
			System.out.println("EstacionOtoño");
			break;
		default:
			System.out.println("EstacionInvierno");
		}
	

	}

}
