package com.curso.v3;

public class Properties {

public static Conexion obtenerConexion(int i) {
		
		if (i==0)
			return new ConexionOracle();
		else if (i==1)
			return new ConexionMysql();
		else if (i==2)
			return new ConexionCloud();
		else 
			return new ConexionWebservice();
	}


}
