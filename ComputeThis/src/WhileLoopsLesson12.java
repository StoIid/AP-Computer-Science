import java.util.Scanner;
public class WhileLoopsLesson12 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("input a sentence!");
		int pos = 0;
		String input = scan.nextLine();
		
		while(true){
			System.out.println(input.charAt(pos));
			if(input.charAt(pos) == 'p'){
				System.out.println("STOPPED AT A \"P\"");
				pos = 0;
				break;
			}else{
				
				pos++;
			}
		}
		int i = 5;
		int sum = 0;
		while(true){
			if (i >=5 && i <= 700 && i%2 != 0){
				sum++;
			}else if (i > 700){
				break;
			}
		}
		System.out.println(sum);
		
		
	}

}
