
public class Principal {

	public static void main(String[] args) {

		String name = "Andronico";
		String nameTwo = "andronico";
		String otherName = "Tercio";
		
		//int res = nameTwo.compareTo(otherName); //+
		int res = nameTwo.compareToIgnoreCase(otherName); //-
		System.out.println(res);
		
		char r = name.charAt(5);
		System.out.println(r);
				
		res = name.indexOf('n');
		System.out.println(res);
		
		res = name.indexOf('n',2);
		System.out.println(res);
		
		res = name.indexOf("dr");
		System.out.println(res);

		res = name.indexOf("dr",5);
		System.out.println(res);


	}

}
