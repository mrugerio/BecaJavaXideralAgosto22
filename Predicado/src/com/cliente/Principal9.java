package com.cliente;

import java.util.*;

import java.util.function.Predicate;
import com.pojo.Empleado;

public class Principal9 {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,60.03));
		
		Predicate<Empleado> p01 = x -> x.getEdad()>30;
		boolean res = p01.test(new Empleado("Patrobas",28,45.67));
		System.out.println(res);
		
		Predicate<String> p02 = z -> z.equals("Pato");
		res = p02.test("Pato");
		System.out.println(res);
		
		Predicate<Integer> p03 = entero -> entero > 50;
		res = p03.test(49);
		System.out.println(res);
		
		Predicate<List<Empleado>> p04 = l -> l.isEmpty();
		System.out.println("Lista vacia: "+
								p04.test(listaEmpleados));
		
		System.out.println("p05: ");
		Predicate<List<Empleado>> p05 = l -> {
								for (Empleado e: l)
									System.out.println(e.getNombre());
								return l.isEmpty();
							};
		System.out.println("Lista vacia: "+
								p05.test(listaEmpleados));

	}
	
	
	
	
	
}
