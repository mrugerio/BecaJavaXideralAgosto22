package com.curso.v3;

public class Animal {
	public void animalSound() {
		System.out.println("The animal makes a sound");
	}
}

class Eagle extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The Eagle says: puras fallas!!");
	}
}

class Pig extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The pig says: wee wee");
	}
}

class Dog extends Animal {
	@Override
	public void animalSound() {
		System.out.println("The dog says: bow wow");
	}
}
