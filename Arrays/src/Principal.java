import java.util.Arrays;

public class Principal {

	public static void main(String[] args) {

		int[] numbers = { 6, 9, 1 };
		Arrays.sort(numbers);

		for (int x : numbers) {
			System.out.println(x);
		}

//		String cadena = "Hola";
//		for (char c:cadena) {
//			System.out.println(c);
//		}

		for (int i = 0; i < numbers.length; i++)
			System.out.print(numbers[i] + " ");

		String[] strings = { "10", "9", "100" };
		Arrays.sort(strings);
		for (String string : strings)
			System.out.print(string + " ");
		
		System.out.println("************");
		int numeros[]  = {9,6,4,1};
		Arrays.sort(numeros); 
		System.out.println(Arrays.binarySearch(numeros, 5));
	}

}
