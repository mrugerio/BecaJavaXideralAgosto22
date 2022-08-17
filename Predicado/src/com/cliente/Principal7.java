package com.cliente;

import java.util.*;

import com.interfaces.Predicado;
import com.pojo.Empleado;

public class Principal7 {

	public static void main(String[] args) {
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",15,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,60.03));
		
		Predicado<Empleado> p01 = x -> x.getEdad()>30;
		boolean res = p01.probar(new Empleado("Patrobas",28,45.67));
		System.out.println(res);
		
		Predicado<String> p02 = z -> z.equals("Pato");
		res = p02.probar("Pato");
		System.out.println(res);
		
		Predicado<Integer> p03 = entero -> entero > 50;
		res = p03.probar(49);
		System.out.println(res);
		
		Predicado<List<Empleado>> p04 = l -> l.isEmpty();
		System.out.println("Lista vacia: "+
								p04.probar(listaEmpleados));
		
		System.out.println("p05: ");
		Predicado<List<Empleado>> p05 = l -> {
								for (Empleado e: l)
									System.out.println(e.getNombre());
								return l.isEmpty();
							};
		System.out.println("Lista vacia: "+
								p05.probar(listaEmpleados));

	}
	
	
	
	
	
}
