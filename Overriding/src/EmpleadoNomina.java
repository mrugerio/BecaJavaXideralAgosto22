
public class EmpleadoNomina extends Empleado {

	public EmpleadoNomina(String nombre){
		super(nombre);
	}
	
	@Override
	public Integer getClave() { //Covariant Returns
		return (Integer)clave;
	}
	
//	public EmpleadoNomina(){
//		super("Patrobas");
//	}
	
//	public EmpleadoNomina(){
//		this("Patrobas");
//	}
}
