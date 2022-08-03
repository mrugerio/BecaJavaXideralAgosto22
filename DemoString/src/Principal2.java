
public class Principal2 {
	
	public static void main(String[] args) {
		String x = "Hello";
		String y = new String("Hello").intern();
		
		System.out.println(x.equals(y)); //true
		System.out.println(x==y); //true
	}

}
