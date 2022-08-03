
public class DemoSwitch {

	public static void main(String[] args) {

		int month = 5;

		switch (month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("Feb");
			break;
		case 3:
			System.out.println("Mar");
			break;
		case 4:
			System.out.println("Abr");
			break;
		default:
			System.out.println("Other");
		}

		month = 2;
		switch (month) {
		case 1: case 2: System.out.print("January");
		}

		// System.out.println("hola mundo");

	}

}
