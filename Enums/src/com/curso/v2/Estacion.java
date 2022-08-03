package com.curso.v2;

enum Estacion {
	
	INVIERNO("baja"),
	PRIMAVERA("alto"),
	OTOÑO("medio"),
	VERANO("alto");
	
	private String visitantes;
	
	private Estacion(String visitantes){
		this.visitantes = visitantes;
	}
	
	public void  mostrarVisitantes() {
		System.out.println(visitantes);
	}

}
