
public abstract class Empleado {

	private String nombre;
	public Number clave;
	
	public Empleado(String nombre) {
		this.nombre = nombre;
	}

	public Number getClave() { //Covariant Returns
		return clave;
	}

	public void setClave(Number clave) {
		this.clave = clave;
	}
}
