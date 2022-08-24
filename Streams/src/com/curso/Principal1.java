package com.curso;

import static java.util.Arrays.asList;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal1 {
	
	private static Employee[] arrayOfEmps = {
		    new Employee(0, "Patrobas", 100.0), 
		    new Employee(1, "Tercio", 200.0), 
		    new Employee(2, "Andronico", 300.0),
		    new Employee(3, "Epeneto", 400.0),
		    new Employee(4, "Filologo", 500.0),
		    new Employee(5, "Patrobas", 100.0), 
		    new Employee(6, "Tercio", 200.0), 
		    new Employee(7, "Andronico", 300.0),
		    new Employee(8, "Epeneto", 400.0),
		    new Employee(9, "Filologo", 500.0)
		};
	
	public static Employee getEmpleado(int id) {
		return arrayOfEmps[id];
	}
	
	public static void main(String[] args) {
		
		List<Employee> empList = asList(arrayOfEmps);
				
		empList.stream().forEach(e -> e.incrementoSalario(20.0));
		empList.forEach(e -> System.out.println(e));
		
		//-------------
		System.out.println("*******");
		//TRANSFORMA UN ARREGLO DE ENTEROS
		//EN UNA LISTA DE EMPLEADOS
		Integer[] empIds = {0,1,2,3,4,5,6,7,8,9};
		Stream<Integer> streamInt = Stream.of(empIds);
		
		List<Employee> listEmp =streamInt
				.map(i -> Principal1.getEmpleado(i))
				.collect(Collectors.toList());
		
		listEmp.forEach(System.out::println);
		
		//-------------
		System.out.println("*******");
		
		listEmp = Stream.of(empIds)
				.map(Principal1::getEmpleado) //EQUIVALE A LINEA 37
				.filter(e -> e.getNombre().endsWith("o"))
				.filter(e -> e.getSalary() > 350.0)
				.collect(Collectors.toList());
		
		listEmp.forEach(System.out::println);
		
		//-------------
		System.out.println("*******Lazy******");
		
		Employee emp = Stream.of(empIds)
				//peek Ayuda a comprender la funcionalidad Lazy
				//.peek(System.out::println) 
				.map(Principal1::getEmpleado)
				//.peek(System.out::println)
				.filter(e -> e.getNombre().endsWith("o"))
				//.peek(System.out::println)
				.filter(e -> e.getSalary() >350)
				//.peek(System.out::println)
				.findFirst() //Return Optional<Empleado>
				.orElse(null);
		
		System.out.println("**Empleado**: "+ emp);
		
		//-------------
		System.out.println("*******Lista De Nombres******");
		
		List<List<String>> listaDeListas = asList(
				asList("Patroba","Tercio"),
				asList("Andronico","Epeneto"),
				asList("Filologo","Trifosa"));
		
		List<String> listaResultado = listaDeListas.stream()
							.flatMap(Collection::stream)
							.collect(Collectors.toList());
		
		listaResultado.forEach(System.out::println);
		
		
	}

}
