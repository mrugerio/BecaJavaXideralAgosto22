package com.curso.v7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class LeerArchivo {

	public static void main(String[] args)  {

		File file = new File("/archivo.txt");
		
		try {
			leerArchivo(file);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

//	private static void leerArchivo(File file) {
//		try {
//			FileReader fr = new FileReader(file);
//		} catch (FileNotFoundException e) {
//			//Manejamos el error
//			e.printStackTrace();
//		}
//	}
	
	private static void leerArchivo(File file) 
			throws FileNotFoundException {
		FileReader fr = new FileReader(file);
	}

}
