package com.curso.v3;

public class Cliente {

	public static void main(String[] args) {
		Conexion conexion = Properties.obtenerConexion(2);
		ejecuta(conexion);
	}

	private static void ejecuta(Conexion conexion) {
		String resCon = conexion.getConexion();
		System.out.println(resCon);
		System.out.println("Realiza Operaciones...");
		conexion.closeConexion("Patrobas");		
	}

}
