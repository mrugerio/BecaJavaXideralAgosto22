package com.curso.v4;

public class Pato extends Ave{
	
	Pato(){
		//super("Donald",true,5);
		super(null,false,0);
	}
	
	void setValores(String name, boolean flight, int age){
		nombre = name;
		vuelo = flight;
		edad = age;
	}
	
	
}
