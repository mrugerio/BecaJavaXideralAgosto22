package com.curso;

import static java.util.Arrays.asList;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Principal1 {
	
	private static Employee[] arrayOfEmps = {
		    new Employee(0, "aPatrobas", 100.0), 
		    new Employee(1, "aTercio", 200.0), 
		    new Employee(2, "aZx", 300.0),
		    new Employee(3, "bEpeneto", 400.0),
		    new Employee(4, "bFilologox", 500.0),
		    new Employee(5, "bPatrobas", 100.0), 
		    new Employee(6, "cTercio", 200.0), 
		    new Employee(7, "cAndronicox", 300.0),
		    new Employee(8, "cEpeneto", 400.0),
		    new Employee(9, "dFilologox", 500.0)
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
		
		//-------------
		System.out.println("*************");
		listEmp = empList.stream()
					.peek(e -> e.incrementoSalario(10.0))
					.collect(Collectors.toList());
		
		//-------------
		System.out.println("*************");
		
		Employee empleado = Stream.of(empIds)
				//.map(Principal1::getEmpleado)
				//.map(x -> Principal.getEmpleado(x))
				.map((Integer x) -> {
					Employee em = Principal1.getEmpleado(x);
					System.out.println(em);
					return em;
				})
				.filter( e -> {
					System.out.println(e.getClass().getName());
					return e.getNombre().endsWith("o");
				})
				.filter(e -> e.getSalary()>400)
				.findFirst()
				.orElse(null);
		
		Employee empleado1 = Stream.of(empIds) //1er Parte: Generar el Stream (Obligatorio)
				.map(Principal1::getEmpleado) //2da Parte: Operadores Intermedios
				.filter(e -> e.getNombre().endsWith("o"))
				.filter(e -> e.getSalary()>400)
				.findAny() //REGRESA UN OPTIONAL
				.orElse(null); //3er Parte: Cierra el Stream (Obligatorio)
		
		//System.out.println(empleado1);
		
		Integer[] empIds2 = {0,1,2,3,4};
		
		List<Employee> listaEmpleados2 = Stream.of(empIds2)
				.map(i -> Principal1.getEmpleado(i))
				//.map(Principal1::getEmpleado)
				.collect(Collectors.toList());
		System.out.println("Ordenar por nombre");
		listaEmpleados2 = listaEmpleados2.stream()
					.sorted((a,b) -> a.getNombre().compareTo(b.getNombre()))
					.collect(Collectors.toList());
		
		listaEmpleados2.forEach(System.out::println);;		
		
		System.out.println("Ordenar por Id");
		listaEmpleados2 = listaEmpleados2.stream()
					.sorted((a,b) -> a.getId() - b.getId())
					.collect(Collectors.toList());
		
		listaEmpleados2.forEach(System.out::println);;
			
		
		System.out.println("Ordenar por Salario");
		listaEmpleados2 = listaEmpleados2.stream()
					.sorted((a,b) -> (int)(b.getSalary() - a.getSalary()))
					.collect(Collectors.toList());
		
		listaEmpleados2.forEach(System.out::println);
		
		Stream<Employee> se = listaEmpleados2.stream();
		Employee minEmp = se
				.min((e1,e2)-> (int)(e1.getSalary() - e2.getSalary()))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Empleado que gana menos: "+minEmp);

		Stream<Employee> se1 = listaEmpleados2.stream();
		Employee maxEmp = se1
				.max((e1,e2)-> (int)(e1.getSalary() - e2.getSalary()))
				.orElseThrow(NoSuchElementException::new);
		System.out.println("Empleado que gana mas: "+maxEmp);

		List<Integer> intList = Arrays.asList(2, 5, 3, 2, 4, 3);
	    List<Integer> distinctIntList = intList.stream()
	    					.distinct()
	    					.collect(Collectors.toList());
	    
	    System.out.println(distinctIntList);
		
	    intList = Arrays.asList(2, 4, 5, 8,6);

	    boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
	    System.out.println(allEven); //false
	    boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
	    System.out.println(oneEven); //true
	    
	    boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
	    System.out.println(noneMultipleOfThree); //false
	    
	    //OBTIENE EL PROMEDIO DE SALARIOS DE LOS EMPLEADOS
	    Double avgSal = empList.stream()
	    	      .mapToDouble(Employee::getSalary)
	    	      .average()
	    	      .orElseThrow(NoSuchElementException::new);
	    
	    System.out.println("Salario Promedio:"+avgSal);
	    
	    Double sumSal = empList.stream()
	    	      .map(Employee::getSalary)
	    	      .reduce(0.0, Double::sum);
	    
	    System.out.println("Salario Suma:"+sumSal);
	    
	    Double sumSal2 = empList.stream()
	    	      .mapToDouble(Employee::getSalary)
	    	      .reduce(0.0, Double::sum);
	    
	    System.out.println("Salario Suma:"+sumSal2);
	    
	    //Concatenar Nombres
	    String empNames = empList.stream()
	    	      .map(Employee::getNombre)
	    	      .collect(Collectors.joining(", "))
	    	      .toString();
	    
	    System.out.println(empNames);
	    
	    Set<String> empNamesSet = empList.stream()
	            .map(Employee::getNombre)
	            .collect(Collectors.toSet());
	    
	    System.out.println(empNamesSet);
	    
	    List<Integer> intLista = Arrays.asList(2, 4, 5,  7, 6, 8);
	    
	    Map<Boolean, List<Integer>> isEven = intLista.stream()
	    	.collect(
	    		Collectors.partitioningBy(i -> i % 2 == 0)
	    	);
	    isEven.forEach((c,v)->System.out.println(c+", lista números: "+v ));
	    //System.out.println(isEven);
	    
	    Map<Character, List<Employee>> groupByAlphabet = empList.stream()
	    	.collect(
	    	    //Collectors.groupingBy(e -> new Character(e.getNombre().toUpperCase().charAt(0)))
	    		Collectors.groupingBy(e -> Character.valueOf(e.getNombre().toUpperCase().charAt(0)))
	    	 );
	    
	    //groupByAlphabet.forEach((x,y)->  System.out.println(x+ ": "+ y));
	    System.out.println("************");
	    Map<Character, List<Double>> groupedByAlphabetListDouble = 
	      empList.stream().collect(
	    	 Collectors.groupingBy(e -> Character.valueOf(e.getNombre().charAt(0)),
	    	 Collectors.mapping(Employee::getSalary, Collectors.toList()))
	      );
	    
	    groupedByAlphabetListDouble.forEach((x,y)->  System.out.println(x+ ": "+ y));

	    Map<Character, List<Double>> groupedByAlphabetListDouble2 = empList.stream().collect(Collectors.groupingBy(e -> Character.valueOf(e.getNombre().charAt(0)),Collectors.mapping(Employee::getSalary, Collectors.toList())));
	  	System.out.println("##############");
	    
	    Comparator<Employee> byNameLength = Comparator.comparing(Employee::getNombre);
	    
	    Map<Character, Optional<Employee>> longestNameByAlphabet = empList.stream().collect(
	    	  Collectors.groupingBy(e -> Character.valueOf(e.getNombre().charAt(0)),
	    	  Collectors.reducing(BinaryOperator.maxBy(byNameLength))));
	    
	    longestNameByAlphabet.forEach((x,y)->  System.out.println(x+ ": "+ y));
	    
	  	System.out.println("***********");
	  	
	  	System.out.println(empList);
	  	empList.stream().parallel().forEach(e -> e.incrementoSalario(1000.0));
	  	System.out.println(empList);


	}

}











