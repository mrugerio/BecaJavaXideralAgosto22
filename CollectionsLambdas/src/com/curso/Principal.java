package com.curso;

import java.util.*;
import java.util.function.*;

public class Principal {
	
	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Epeneto",17,90.03));
		
		//Consumer<Empleado> c = x -> System.out.println(x);
		//Consumer<Empleado> c = System.out::println;
		
		//listaEmpleados.removeIf(x -> x.getEdad()<20);
		
		/*
		listaEmpleados.replaceAll(e -> {
				e.setSueldo(e.getSueldo()+10);
				return e;
				});*/
		
		listaEmpleados.replaceAll(e -> e.addSueldo(10));
				
		listaEmpleados.sort((e1,e2)-> e1.getEdad()-e2.getEdad());
		
		listaEmpleados.forEach(System.out::println);
		
		System.out.println("** List -> Array **");
		
		//Empleado[] arrayEmpleado = 
				//listaEmpleados.toArray(Empleado[]::new);
		
		Empleado[] arrayEmpleado = 
				listaEmpleados.toArray(x -> new Empleado[x]);
		
		System.out.println(Arrays.toString(arrayEmpleado));

		
	}

}
