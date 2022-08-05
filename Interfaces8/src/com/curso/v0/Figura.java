package com.curso.v0;

interface Figura {
	
	int area();
	
	//A PARTIR DE JAVA 8
	//modificador de acceso default
	default String getNameDefualt() {
		System.out.println("--Soy Figura Default--");
		getNameStaticPrivate();
		getNamePrivate();
		return "Soy Figura Default";
	}
	
	//A PARTIR DE JAVA 8
	//modificador de acceso default
	static String getNameStatic() {
		System.out.println("--Soy Figura Static--");
		getNameStaticPrivate();
		//getNamePrivate(); //NO SE PUEDE
		return "Soy Figura Static";
	}
	
	//A PARTIR DE JAVA 9
	static private String getNameStaticPrivate() {
		System.out.println("Soy Figura Static Private");
		return "Soy Figura Static Private";
	}

	//A PARTIR DE JAVA 9
	private String getNamePrivate() {
		System.out.println("Soy Figura Default Private");
		getNameStaticPrivate();
		return "Soy Figura Default Private";
	}
	

}
