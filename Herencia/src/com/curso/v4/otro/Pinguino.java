package com.curso.v4.otro;

import com.curso.v4.Ave;

public class Pinguino extends Ave{
	
	public Pinguino(){
		//super("Donald",true,5);
		super(null,false,0);
	}
	
	public void setValores(String name, boolean flight, int age){
		nombre = name;
		vuelo = flight;
		edad = age;
	}
	
	
}
