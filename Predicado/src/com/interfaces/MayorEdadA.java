package com.interfaces;

import com.pojo.Empleado;

public class MayorEdadA implements PredicadoEmpleado {

	@Override
	public boolean probar(Empleado e) {
		return e.getEdad()>20;
	}

}
