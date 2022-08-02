package com.curso.v2;

import java.time.LocalDateTime;

public class ConexionWebservice implements Conexion {

	@Override
	public String getConexion() {
		//Logica conexión
		return "Conexion exitosa Webservice";
	}

	@Override
	public boolean closeConexion(String usuario) {
		System.out.println("Guarda Logs "+usuario+
				" cerro conexion Webservice, "+LocalDateTime.now());
		//Lógica cerrar conexión
		return true;
	}

}
