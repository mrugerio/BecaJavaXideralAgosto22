package com.interfaces;

import com.pojo.Empleado;

public class SueldoMayorA implements PredicadoEmpleado {

	@Override
	public boolean probar(Empleado e) {
		return e.getSueldo()>45;
	}

}
