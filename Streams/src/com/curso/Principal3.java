package com.curso;

import static java.util.Arrays.asList;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal3 {
	
	private static Employee[] arrayOfEmps = {
		    new Employee(0, "Patrobas", 100.0), 
		    new Employee(1, "Tercio", 200.0), 
		    new Employee(5, "Marcos", 600.0),
		    new Employee(2, "Andronico", 300.0),
		    new Employee(3, "Epeneto", 400.0),
		    new Employee(4, "Filologo", 500.0)
		    };
	
	public static Employee getEmpleado(int id) {
		return arrayOfEmps[id];
	}
	
	public static void main(String[] args) {
		//List<Employee> empList = asList(arrayOfEmps);
		
		//empList.stream().forEach(e -> e.incrementoSalario(20.0));
		//empList.forEach(System.out::println);
		

		Integer[] empIds = {0,1,2,3,4,5};
		
//		List<Employee> listEmp = Stream.of(empIds)
//				.map(Principal3::getEmpleado) 
//				.filter(e -> e.getNombre().endsWith("o"))
//				.filter(e -> e.getSalary() > 350.0)
//				.collect(Collectors.toList());
//		
//		listEmp.forEach(System.out::println);
//		
//		System.out.println("********");
		
		
		Employee emp = Stream.of(empIds)
				.map(Principal3::getEmpleado)
				.filter(e -> e.getNombre().equals("Marcos"))
				.findFirst() 
				.orElse(null);
		
		System.out.println(emp);
		System.out.println(emp.getSalary());
		
	}
}
