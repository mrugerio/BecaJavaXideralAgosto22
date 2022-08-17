package com.curso;
import java.util.function.Supplier;

public class DemoSupplier {

	public static void main(String[] args) {

		Supplier<String> s1 = () -> new String("Hello");
		String cadena = s1.get();
		System.out.println(cadena);
		
		Supplier<Empleado> s2 = () -> new Empleado("Rolas",17,10.03);
		Empleado emp = s2.get();
		System.out.println(emp);
		
		Supplier<Double> random = () -> Math.random();
		System.out.println(random.get());
	
	}

}
