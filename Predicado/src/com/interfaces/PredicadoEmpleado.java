package com.interfaces;

import com.pojo.Empleado;

@FunctionalInterface
public interface PredicadoEmpleado {
	
	boolean probar(Empleado e);
	
}
