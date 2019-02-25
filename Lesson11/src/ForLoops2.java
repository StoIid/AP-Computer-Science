import java.util.Scanner;

public class ForLoops2 {
	
	public static boolean IsAVowel(char c){
		//System.out.println("is " + c + " a vowel?");
		if (c == 'a' ||c == 'e' || c == 'i' || c == 'o' || c == 'u' ){
			//System.out.println(c + " is a vowel");
			return true;
		}else{
			//System.out.println(c + " is NOT a vowel");
			return false;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// QUESTION 2
		Scanner scan = new Scanner(System.in);
		System.out.println("Please enter a sentence");
		String sent = scan.nextLine();
		sent = sent.toLowerCase();
		String newSent = "";
		
		for(int x = 0; x < sent.length(); x++ ){
			if (x+1 < sent.length() && IsAVowel(sent.charAt(x+1))){
				newSent = newSent + " "+ sent.charAt(x+1);
				x++;
			}else if (x+1 <= sent.length()){
				newSent = newSent + sent.charAt(x);
			}
		}
		System.out.println(newSent);
		
		// QUESTION 3
		for (int x = 7; x <=187; x++){
			if (x%7 == 0){
				System.out.println(x);
			}
		}
	}
}
