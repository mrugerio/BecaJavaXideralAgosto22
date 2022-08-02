package com.curso.v1;

import java.time.LocalDateTime;

public class ConexionOracle implements Conexion {

	@Override
	public String getConexion() {
		//Logica conexión
		return "Conexion exitosa Oracle";
	}

	@Override
	public boolean closeConexion(String usuario) {
		System.out.println("Guarda Logs "+usuario+
				" cerro conexion Oracle, "+LocalDateTime.now());
		//Lógica cerrar conexión
		return true;
	}

}
