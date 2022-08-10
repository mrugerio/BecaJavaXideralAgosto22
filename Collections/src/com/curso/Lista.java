package com.curso;

import java.util.*;

public class Lista {

	public static void main(String[] args) {
		List list = new ArrayList(); 
		list.add("hawk"); // [hawk] 
		list.add(true); // [hawk, true] 
		list.add(new StringBuilder("Hello"));
		//System.out.println(list);
		
		List<String> birds = new ArrayList<>();
		birds.add("hawk"); //hawk
		//System.out.println(birds);
		birds.add(1,"robin"); //hawk,robin
		System.out.println(birds.remove("cardinal"));
		System.out.println(birds.remove("hawk")); //robin
		//System.out.println(birds);
		birds.add(0, "blue jay"); //AGUAS!!!//blue jay, robin
		//System.out.println(birds);
		birds.add(1, "cardinal");  //blue jay,cardinal,robin
		System.out.println(birds.remove(0)); //cardinal,robin
		//System.out.println(birds.remove(2)); //Genera Exception
		System.out.println(birds); 

		

		

	}

}
