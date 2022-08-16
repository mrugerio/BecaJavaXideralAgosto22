package com.cliente;

import java.util.*;

import com.pojo.Empleado;

public class Principal {

	public static void main(String[] args) {

		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		//ORDENAR POR NOMBRE
		Comparator<Empleado> comparatorNombre = new Comparator<Empleado>() {
			@Override
			public int compare(Empleado o1, Empleado o2) {
				return o1.getNombre().compareTo(o2.getNombre());
			}
		};
 		
		Collections.sort(listaEmpleados,comparatorNombre);
		
		for (Empleado e:listaEmpleados)
			System.out.println(e);
	}

}
