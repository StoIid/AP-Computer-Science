import java.util.Scanner;

public class HardProject {

	public static void main(String[] args) {
		Scanner stringScan = new Scanner(System.in);
		
		//////////////// REVERSE PROJECT /////////////////////
		
		System.out.println("~Printing Backwords V1~\n");
		System.out.println("Input a Sentence...");
		String sen = stringScan.nextLine();
		String revSen = "";
		
		for (int i = sen.length(); i > 0; i--){
			revSen = revSen + sen.charAt(i-1);
			//System.out.println(revSen);// -- For Debugging
		}
		System.out.println(revSen);
		stringScan.close();
		//////////////////////////////////////////////////////
		
	}

}
