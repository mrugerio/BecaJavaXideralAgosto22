
public class Principal {

	public static void main(String[] args) {

		Pato pato = new Pato();
		pato.nombre.append(" Otro Lucas");
		System.out.println(pato.nombre);
		
		final StringBuilder apodo = new StringBuilder("Rolas");
		//apodo.append("Pericles");
		//apodo.reverse();
		apodo.delete(0, 3);
		System.out.println(apodo);
		
		//NO SE PUEDE
		//apodo = new StringBuilder("Tercio");
		
		final String cadena = "Hello";
		//cadena = cadena.concat(" World");
		
	}

}
