package com.curso.v1;

public class Zoologico {
	
	int contratarPersonal(Estacion e) {
		int cantidadPersonal = 0;
		switch(e) {
		case PRIMAVERA:
			return cantidadPersonal = 500;
		case VERANO:
			return cantidadPersonal = 500;
		case OTOÑO:
			return cantidadPersonal = 200;
		default:
			return cantidadPersonal = 50;
		}
	}

}
