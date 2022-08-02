package com.curso.v3;

public abstract class Conexion {
	
	abstract String getConexion();

	abstract boolean closeConexion(String usuario);
}
