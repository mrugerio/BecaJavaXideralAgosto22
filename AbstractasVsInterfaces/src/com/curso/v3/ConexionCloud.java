package com.curso.v3;

import java.time.LocalDateTime;

public class ConexionCloud extends Conexion {

	@Override
	public String getConexion() {
		//Logica conexión
		return "Conexion exitosa Cloud";
	}

	@Override
	public boolean closeConexion(String usuario) {
		System.out.println("Guarda Logs "+usuario+
				" cerro conexion Cloud, "+LocalDateTime.now());
		//Lógica cerrar conexión
		return true;
	}

}
