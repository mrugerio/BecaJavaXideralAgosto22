package com.curso.v0;

//IS-A //Camisa ES UNA Ropa
public class Camisa implements Ropa{  
						 
	private AccionRopa accionRopa; //HAS-A //Camisa tiene AccionesRopa
	
	public Camisa(AccionRopa accionRopa) {
		this.setAccionRopa(accionRopa);
	}
	
	@Override
	public void fabricar() {
		System.out.println("Fabricar Camisa");
	}

	@Override
	public void desechar() {	
		System.out.println("Desechar Camisa");

	}

	@Override
	public void vender() {	
		System.out.println("Vender Camisa");

	}

	public AccionRopa getAccionRopa() {
		return accionRopa;
	}

	public void setAccionRopa(AccionRopa accionRopa) {
		this.accionRopa = accionRopa;
	}


	
}
