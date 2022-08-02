package com.curso.v3;

import java.util.Random;

public class Principal {

	//Variable de referencia puede ser de cualquier supertipo
	//del objeto.
	
	public static void main(String[] args) {
		Animal animal = getAnimal();
		animal.animalSound();
	}
	
	public static Animal getAnimal() {
		
//		Array son de tamaño fijo
//		Animal[] animals = { new Animal(),
//		new Dog(),new Pig(),new Dog()};
		
		Animal[] animals = new Animal[4];
		animals[0] = new Animal();
		animals[1] = new Dog();
		animals[2] = new Pig();
		animals[3] = new Eagle();
		
		int random = new Random().nextInt(animals.length);
		//System.out.println("aleatorio: "+random);
		
		Animal animalResult = animals[random];
		
		return animalResult;
		
	}

}
