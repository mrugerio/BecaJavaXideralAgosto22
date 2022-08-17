package com.curso;

import java.util.function.*;

public class Principal {
	
public static void main(String[] args) {
		
		BiPredicate<Empleado, Empleado> mayorEdad = (a, b) ->  a.getEdad() > b.getEdad();
		System.out.println(mayorEdad.test(new Empleado("Andronico",19,40.50), new Empleado("Rolas",17,60.03)));
		
		BiPredicate<Empleado, Integer> mayorEdadInt = (a, b) ->  a.getEdad() > b;
		System.out.println(mayorEdadInt.test(new Empleado("Andronico",19,40.50), 18));
		
		BiConsumer <String, Integer> concatStringInt = (s, i) -> System.out.println(s + " " + i);
		concatStringInt.accept("Mi edad:", 24);
		
		BiFunction <Empleado, String, Empleado> cambiarNombre = (e, s) -> {
			e.setNombre(s);
			return e;
		};
		
		Empleado emp = new Empleado("Andronico",19,40.50);
		Empleado emp2 = cambiarNombre.apply(emp, "Pedro");
		System.out.println(emp2);
		
		BinaryOperator<String> concat = (s1, s2) -> s1.concat(" ").concat(s2);
		System.out.println(concat.apply("Hello", "World"));

		BinaryOperator<Integer> suma = (i, j) -> i + j;
		System.out.println(suma.apply(1, 2));
		
	}

}
