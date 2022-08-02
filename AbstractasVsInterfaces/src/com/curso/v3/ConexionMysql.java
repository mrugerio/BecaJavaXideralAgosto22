package com.curso.v3;

import java.time.LocalDateTime;

public class ConexionMysql extends Conexion {

	@Override
	public String getConexion() {
		//Logica conexión
		return "Conexion exitosa Mysql";
	}

	@Override
	public boolean closeConexion(String usuario) {
		System.out.println("Guarda Logs "+usuario+
				" cerro conexion Mysql, "+LocalDateTime.now());
		//Lógica cerrar conexión
		return true;
	}

}
