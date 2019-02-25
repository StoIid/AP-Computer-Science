import java.util.Scanner;

public class EasyProject {

	public static void main(String[] args) {
		Scanner stringScan = new Scanner(System.in);
		
		//////////////// SPACING PROJECT /////////////////////
		
		System.out.println("~Space Printing~ V1\n");
		System.out.println("Input a sentence...");
		String sen = stringScan.nextLine();
		String rebuild = "";
		for (int i = 0; sen.length() > i; i++){
			//System.out.println(i + rebuild);
			rebuild = rebuild + sen.charAt(i) + " ";			
		}
		System.out.println(rebuild);
		
		//////////////////////////////////////////////////////

		stringScan.close();
	}

}
