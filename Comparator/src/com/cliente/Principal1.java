package com.cliente;

import java.util.*;

import com.pojo.Empleado;

public class Principal1 {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		System.out.println("Principal1");
		System.out.println("Comparar por Nombre");

		//ORDENAR POR NOMBRE
		Comparator<Empleado> comparatorNombre = 
				(o1,o2) -> o1.getNombre().compareTo(o2.getNombre());

		Collections.sort(listaEmpleados,comparatorNombre);
		
		for (Empleado e:listaEmpleados)
			System.out.println(e);
		
		System.out.println("Comparar por edad");
		
		Collections.sort(listaEmpleados, (x1,x2) -> x2.getEdad() - x1.getEdad() );
		
		for (Empleado e:listaEmpleados)
			System.out.println(e);
		
	}

}
