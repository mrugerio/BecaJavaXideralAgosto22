package com.curso;

import static java.util.Arrays.asList;
import java.util.List;
import java.util.stream.Stream;

public class Principal {
	
	private static Employee[] arrayOfEmps = {
		    new Employee(0, "Patrobas", 100.0), 
		    new Employee(1, "Tercio", 200.0), 
		    new Employee(2, "Andronico", 300.0),
		    new Employee(3, "Epeneto", 400.0),
		    new Employee(4, "Filologo", 500.0)
		};
	
	
	
	public static void main(String[] args) {
		
		//*** INICIO DEMOS DE COMO CONSTRUIR STREAMS ***
		Stream<Employee> streamEmp;
		
		//Stream se construyó a partir de un Array
		streamEmp = Stream.of(arrayOfEmps);
				
		List<Employee> empList = asList(arrayOfEmps);
		
		//Stream se construyó a partir de un List 
		streamEmp = empList.stream();
		
		streamEmp = Stream.of(arrayOfEmps[0],
							arrayOfEmps[1],
							arrayOfEmps[2]);
		//*** FIN DEMOS DE COMO CONSTRUIR STREAMS ***
		
		
	}


	

}
