package com.curso.v2;

public class Properties {

public static Conexion obtenerConexion(int i) {
		
		if (i==0)
			return new ConexionOracle();
		else if (i==1)
			return new ConexionMysql();
		else 
			return new ConexionWebservice();
	}


}
