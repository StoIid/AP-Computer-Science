import java.util.Scanner;

public class SwitchStatements {

	public static void main(String[] args) {
		char yz = 'z';
		char x = 'Z';
		System.out.println(x > yz);

		Scanner numScan = new Scanner(System.in);
		Scanner stringScan = new Scanner(System.in);
		System.out.println("\nEnter a number");

		int iSwitch = numScan.nextInt();
		switch (iSwitch) {

		case 0:
			// System.out.println("ZERO");
			// break;

		case 1:
			// System.out.println("ONE");
			// break;

		case 2:
			// System.out.println("TWO");
			// break;

		case 3:
			// System.out.println("THREE");

		case 4:
			// System.out.println("FOUR");

		case 5:
			System.out.println("Low");
			break;

		case 6:
			// System.out.println("SIX");
			// break;

		case 7:
			// System.out.println("SEVEN");
			// break;

		case 8:
			// System.out.println("EIGHT");
			// break;

		case 9:
			// System.out.println("NINE");
			// break;

		case 10:
			// System.out.println("TEN");
			// break;

		default:
			// System.out.println("Not in the list");
			System.out.println("High");
			break;
		}
		////////////////////////////////////////////

		int z = 2;
		int p = 3;
		System.out.println(z += (--p));

		/////////////////////////////////////////////

		System.out.println("\nEnter a character...");
		String myChar = stringScan.nextLine();
		int y = 100;

		switch (myChar) {

		case "g":

		case "G":
			y = ++y;
			break;
		case "m":

		case "M":
			y = --y;
			break;
		default:
			y = y + 100;
			break;
		}
		System.out.println(y);

		System.out.println("The sum is " + (z + p));
		System.out.println(System.in);
		System.out.println("Input your weight");
		double Weight = numScan.nextDouble();
		System.out.println("Choose a planet");
		System.out.println("\n1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos");
		int Choice = numScan.nextInt();

		switch (Choice) {
		case 1:
			System.out.println(Weight * .071);
			break;
		case 2:
			System.out.println(Weight * .720);
			break;
		case 3:
			System.out.println(Weight * .865);
			break;
		case 4:
			System.out.println(Weight * 4.612);
			break;
		default:
			System.out.println("Where did we go wrong?...");
			break;
		}

	}

}
