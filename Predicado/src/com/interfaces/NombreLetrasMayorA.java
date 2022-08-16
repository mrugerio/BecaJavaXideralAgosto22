package com.interfaces;

import com.pojo.Empleado;

public class NombreLetrasMayorA implements PredicadoEmpleado {

	@Override
	public boolean probar(Empleado e) {
		return e.getNombre().length() > 6;
	}

}
