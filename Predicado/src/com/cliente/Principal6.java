package com.cliente;

import java.util.*;

import com.interfaces.Predicado;
import com.pojo.Empleado;

public class Principal6 {

	public static void main(String[] args) {
		
		System.out.println("Principal6");

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,60.03));
		
		System.out.println("Empleados con edad mayor a 20 años");
		ejecuta(listaEmpleados,x -> x.getEdad() >20);
		
		System.out.println("Empleados ganan mas de 45");
		ejecuta(listaEmpleados,z -> z.getSueldo()>45);

		System.out.println("Empleados cuyo nombre es mayor a 6");
		ejecuta(listaEmpleados,emp -> emp.getNombre().length() > 6);
		
		System.out.println("Empleados cuyo nombre es mayor a 6 y"
				+ " ganan mas de 45 dlls");
		ejecuta(listaEmpleados,w -> w.getNombre().length() > 6 &&
				w.getSueldo()>45);
		
		System.out.println("Sin sentido prueba");
		ejecuta(listaEmpleados,pato -> false);
	}
	
	private static void ejecuta(List<Empleado> listaEmpleados, 
			Predicado<Empleado> pe ) {	
		for (Empleado e:listaEmpleados) 
			if (pe.probar(e))
				System.out.println(e);
		
	}

}
