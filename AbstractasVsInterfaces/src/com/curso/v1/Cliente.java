package com.curso.v1;

public class Cliente {

	public static void main(String[] args) {
		Conexion conexion = Properties.obtenerConexion();
		ejecuta(conexion);
	}

	private static void ejecuta(Conexion conexion) {
		String resCon = conexion.getConexion();
		System.out.println(resCon);
		System.out.println("Realiza Operaciones...");
		conexion.closeConexion("Patrobas");		
	}

}
