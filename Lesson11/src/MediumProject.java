import java.util.Scanner;

public class MediumProject {

	public static void main(String[] args) {
		
		Scanner stringScan = new Scanner(System.in);
		
		//////////////// VOWELS PROJECT //////////////////////
		System.out.println("\n~Vowels Project V1~\n");
		System.out.println("\nEmter a sentence...\n");
		String sen = stringScan.nextLine();
		String rebuild = "";
		//System.out.println("String Length: " + sen.length());
		for (int i = 0; i < sen.length(); i+=1){
			//System.out.println("Index: " + (i+1) + " CharAt: " + sen.charAt(i));
			//System.out.println(rebuild);
			if (sen.charAt(i) == 'a' || sen.charAt(i) == 'e' || sen.charAt(i) == 'i' 
			|| sen.charAt(i) == 'u' || sen.charAt(i) == 'o'){
				rebuild = rebuild + " ";
			}else{
				rebuild = rebuild + sen.charAt(i);
			}
		}	
		
		System.out.println(rebuild);
		//////////////////////////////////////////////////////
		
		stringScan.close();

	}

}