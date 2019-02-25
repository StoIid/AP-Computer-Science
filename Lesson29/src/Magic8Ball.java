import java.util.Random;
import java.util.Scanner;
public class Magic8Ball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		Random rand = new Random();
		while(true){
			System.out.println("8 Ball: Ask me a question!");
			System.out.print("Response: ");
			String response = scan.nextLine();
			if (response.toLowerCase().equals("goodbye"))
					break;
			int answer = rand.nextInt(11);
			if(answer == 1){
				System.out.println("8 Ball: Yes.");
			}else if(answer == 2){
				System.out.println("8 Ball: No.");
			}else if(answer == 3){
				System.out.println("8 Ball: Certainly!");
			}else if(answer == 4){
				System.out.println("8 Ball: I don't think so, no.");
			}else if(answer == 5){
				System.out.println("8 Ball: Yessir!");
			}else if(answer == 6){
				System.out.println("8 Ball: Naaaaaaaaahhh..");
			}else if(answer == 7){
				System.out.println("8 Ball: Without a doubt.");
			}else if(answer == 8){
				System.out.println("8 Ball: Yea.");
			}
		}
	}
}
