package com.curso.v2;

public class Principal {

	public static void main(String[] args) {
				
		Estacion e = Estacion.OTOÑO;
		
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
	
		e.mostrarVisitantes();

	}

}
