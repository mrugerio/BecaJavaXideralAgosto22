package com.curso.v3;

import java.time.LocalDateTime;

public class ConexionWebservice extends Conexion {

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
