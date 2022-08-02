package com.curso.v0;

public interface Conexion {
	
	String getConexion();
	//public abstract String getConexion();

	boolean closeConexion(String usuario);
}
