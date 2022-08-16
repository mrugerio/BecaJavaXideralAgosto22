package com.cliente;

import java.util.*;

import com.interfaces.PredicadoEmpleado;
import com.pojo.Empleado;

public class Principal5 {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,60.03));
		
		PredicadoEmpleado pe01 = e -> e.getEdad()>20;
		PredicadoEmpleado pe02 = e -> e.getSueldo()>45;
		PredicadoEmpleado pe03 = e -> e.getNombre().length() > 6;
		
		System.out.println("Empleados con edad mayor a 20 años");
		for (Empleado e:listaEmpleados) 
			if (pe01.probar(e))
				System.out.println(e);
		
		
		System.out.println("Empleados ganan mas de 45");
		for (Empleado e:listaEmpleados) 
			if (pe02.probar(e))
				System.out.println(e);
		
		System.out.println("Empleados cuyo nombre es mayor a 6");
		for (Empleado e:listaEmpleados) 
			if (pe03.probar(e))
				System.out.println(e);
		
		
		
	}

}
