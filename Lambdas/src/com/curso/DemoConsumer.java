package com.curso;

import java.util.*;
import java.util.function.Consumer;

public class DemoConsumer {

	public static void main(String[] args) {

		Consumer<String> c1 = s -> System.out.println(s);
		c1.accept("Hola");
		
		Consumer<Integer> c2 = i -> System.out.println(i+100);
		c2.accept(9);
		
		Consumer<Empleado> c3 = emp -> System.out.println(emp);
		c3.accept(new Empleado("Andronico",19,40.50));

		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		listaEmpleados.forEach(x -> System.out.println(
				x.getNombre()+" "+x.getEdad()));
		
		List<String> listaString = new ArrayList<>();
		listaString.add("Aguila");
		listaString.add("Pinguino");
		listaString.add("Pato");
		listaString.forEach(w -> System.out.println(w.length()));
		
		
	}

}
