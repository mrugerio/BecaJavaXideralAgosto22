
public class Pato extends Ave {
	
	final int numEspecie;
	final StringBuilder nombre = 
			new StringBuilder("Donald");
	
	Pato(){
		numEspecie=8;
		nombre.append(" Lucas");
	}
	
//	@Override
//	void volar() {
//		System.out.println("soy Pato");
//	}

	//Esto no es Sobreescritura Override
	public void comer() {
		System.out.println("soy Pato");
	}

}
