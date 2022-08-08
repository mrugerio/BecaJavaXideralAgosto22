
public class EmpleadoExterno extends Empleado {

	public EmpleadoExterno(String nombre){
		super(nombre);
	}
	
	@Override
	public Double getClave() { //Covariant Returns
		return (Double)clave;
	}
	

}
