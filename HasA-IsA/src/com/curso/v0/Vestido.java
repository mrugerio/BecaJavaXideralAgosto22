package com.curso.v0;

//IS-A //Vestido ES UNA Ropa
//IS-A //Vestido ES AccionesRopa //False
public class Vestido implements Ropa{  
						 
	private AccionRopa accionRopa; //HAS-A //Vestido tiene AccionesRopa
	
	public Vestido(AccionRopa accionRopa) {
		this.accionRopa = accionRopa;
	}

	@Override
	public void fabricar() {
		System.out.println("Fabricar Vestido");
	}

	@Override
	public void desechar() {	
		System.out.println("Desechar Vestido");

	}

	@Override
	public void vender() {	
		System.out.println("Vender Vestido");

	}

	public AccionRopa getAccionRopa() {
		return accionRopa;
	}

	public void setAccionRopa(AccionRopa accionRopa) {
		this.accionRopa = accionRopa;
	}


	
}
