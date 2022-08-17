package com.curso;
import java.util.function.UnaryOperator;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class DemoFunction {

	public static void main(String[] args) {

		Function<String,Integer> fun1 = s -> s.length();
		int res = fun1.apply("Hello World");
		System.out.println(res);
		
		Function<Empleado,String> fun2 = e -> e.getNombre();
		Empleado emp = new Empleado("Patrobas",28,56.79);
		System.out.println(fun2.apply(emp));
		
		Function<String,String> fun3 = s -> s.substring(5);
		System.out.println(fun3.apply("CursoJava"));
		
		UnaryOperator<String> fun4 = s -> s.substring(5);
		System.out.println(fun3.apply("CursoSpring"));

		System.out.println("-------------");
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(new Empleado("Patrobas",28,45.67));
		listaEmpleados.add(new Empleado("Tercio",35,56.67));
		listaEmpleados.add(new Empleado("Andronico",19,40.50));
		listaEmpleados.add(new Empleado("Rolas",17,10.03));
		
		UnaryOperator<Empleado> uo = e -> {
			e.setSueldo(e.getSueldo()*1.15);
			return e;
		};
		
		listaEmpleados.replaceAll(uo);
		listaEmpleados.forEach(x -> System.out.println(x.getSueldo()));
	}

}
