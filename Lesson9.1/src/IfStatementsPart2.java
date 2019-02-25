import java.util.Scanner;
public class IfStatementsPart2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner numScan = new Scanner(System.in);
		Scanner stringScan = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int num1 = numScan.nextInt();
		int num2 = numScan.nextInt();
		if (num1*2 > num2){
			System.out.println("Your face smells like peppermint!");
		}
		if (num1 == num2/2){
			System.out.println("That's so fetch!");
		}
		
		System.out.println("\nPlease enter two words");
		String word1 = stringScan.nextLine();
		String word2 = stringScan.nextLine();
		if (word1.equals(word2)){
			System.out.println("Equal - case sensitive");
		}else if (word1.equalsIgnoreCase(word2)){
				System.out.println("Equal - not case sensitive");
		}
		else {
				System.out.println("Words do not match");
			}
		
		String[] messages = {"The dude abides", "The road to success is always under construction",
							 "Has Anyone Really Been Far Even as Decided to Use Even Go Want to do Look More Like?",
							 "I can lick my elbows", "Shreck is love, Shrek is life"};
		
		System.out.println("\nPlease enter a number between 1-5 (inclusive)");
		int num = numScan.nextInt();
		//System.out.println((int) Math.floor(num%5)); 
		if (Math.floor(num%5) < 5 && Math.floor(num%5) > -1){
			System.out.println(messages[(int) Math.floor(num%5)]);
		}
		
		System.out.println("\nPlease type in a word");
		String word3 = stringScan.nextLine();
		if (word3.toLowerCase() == "yes"){
			System.out.println("of course");
		}else if (word3.toLowerCase() == "no"){
				System.out.println("indubidably");
		}else{
			System.out.println("hhhhhwhaaatttt?!?!");
		}
		
		numScan.close();
		stringScan.close();
//		System.out.println((double) 2);
//		
//		int x = (int) 2.0;
//		System.out.println(x);
	}

}
