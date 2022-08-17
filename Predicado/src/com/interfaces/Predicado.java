package com.interfaces;

@FunctionalInterface
public interface Predicado<T>{
	
	boolean probar(T t);
	
}
