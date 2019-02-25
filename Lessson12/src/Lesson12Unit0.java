import java.util.Scanner;
public class Lesson12Unit0 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		for(int i = 1; i <= num; i++){
			if( (i%3 ==0) && (i % 5 == 0) ){
				System.out.println("Fizz Buzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
			

		int num2 = scan.nextInt();
		int i = 0;
		while(i <= num2){
		if( (i%3 ==0) && (i % 5 == 0) ){
				System.out.println("Fizz Buzz");
			}else if(i % 3 == 0){
				System.out.println("Fizz");
			}else if(i % 5 == 0){
				System.out.println("Buzz");
			}else{
				System.out.println(i);
			}
		}
		i++;
		
		
		String word = scan.nextLine();
		int num1 = 0;
		while( num1 < word.length()){
			System.out.println(word.substring(num1, num1 + 1));
			num1 += 2;
		}

		String word1 = scan.nextLine();
		for(int i1 = 0; i1 < word1.length(); i1+=2){
			System.out.println(word1.substring(i1, i1 + 1));
		}

		String word11 = null, sentence = "" ;
		while(word11.equalsIgnoreCase("exit") == false){
			sentence = sentence + word11 + " ";
			System.out.println("Please enter another word");
			word11 = scan.nextLine();
		}
		System.out.println(sentence);
		
		
	}

		

}
