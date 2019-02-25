import java.util.Scanner;

public class ForLoops {

	public static void main(String[] args) {
		Scanner stringScan = new Scanner(System.in);

		//////////////// SPACING PROJECT /////////////////////
		
		System.out.println("~Space Printing~ V1\n");
		System.out.println("Input a sentence...");
		String sen = stringScan.nextLine();
		String rebuild = "";
		for (int i = 0; sen.length() > i; i++) {
			// System.out.println(i + rebuild);
			rebuild = rebuild + sen.charAt(i) + " ";
		}
		System.out.println(rebuild);

		//////////////////////////////////////////////////////

		//////////////// REVERSE PROJECT /////////////////////
		
		System.out.println("~Printing Backwords V1~\n");
		System.out.println("Input a Sentence...");
		sen = stringScan.nextLine();
		String revSen = "";

		for (int i = sen.length(); i > 0; i -= 1) {
			revSen = revSen + sen.charAt(i - 1);
			// System.out.println(revSen);// -- For Debugging
		}
		System.out.println(revSen);

		//////////////////////////////////////////////////////

		//////////////// VOWELS PROJECT //////////////////////
		
		System.out.println("\n~Vowels Project V1~\n ");
		System.out.println("\nEmter another sentence");
		sen = stringScan.nextLine();
		rebuild = "";
		System.out.println("String Length: " + sen.length());
		for (int i = 0; i < sen.length(); i += 1) {
			// System.out.println("Index: " + (i+1) + " CharAt: " +
			// sen.charAt(i));
			// System.out.println(rebuild);
			if (sen.toLowerCase().charAt(i) == ('a') || sen.toLowerCase().charAt(i) == 'e' || sen.toLowerCase().charAt(i) == 'i' || sen.toLowerCase().charAt(i) == 'u'
					|| sen.toLowerCase().charAt(i) == 'o') {
				rebuild = rebuild + " ";
			} else {
				rebuild = rebuild + sen.charAt(i);
			}
		}

		System.out.println(rebuild);

		//////////////////////////////////////////////////////

		stringScan.close();
	}

}
