package com.curso.v0;

public class Cliente {

	public static void main(String[] args) {
		Conexion conexion = new ConexionMysql();
		ejecuta(conexion);
	}

	private static void ejecuta(Conexion conexion) {
		String resCon = conexion.getConexion();
		System.out.println(resCon);
		System.out.println("Realiza Operaciones...");
		conexion.closeConexion("Patrobas");		
	}

}
