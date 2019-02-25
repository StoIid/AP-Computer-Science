import java.util.Scanner;
public class WhileDoLoopsHW {

	public static void main(String[] args) {
		// Question 16
		final int SENTINAL = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a positive value!");
		while(true){
			int num = scan.nextInt();
			if (num > 0){
				System.out.println("Thank you!");
				break;
			}else{
				System.out.println("Nope. Try again!");
			}
		}
		System.out.println("Enter an even value please!");
		while(true){
			int num = scan.nextInt();
			if (num%2 == 0){
				System.out.println("Thanks B!");
				break;
			}else{
				System.out.println("Try again..");
			}
		}
		System.out.println("Enter a number!");
		int total = 0;
		while(true){
			int num = scan.nextInt();
			if (num == SENTINAL){
				System.out.println("Heh..you win");
				System.out.println("Total: " + total);
				break;
			}else{
				System.out.println("Try again..");
				total+=num;
			}
		}
		int it = 1;
		while(true){
			if (it%2 != 0 && it < 100){
				System.out.println(it);
			}else if (it == 100){
				break;
			}
			it++;
		}
		int its = 300;
		while(true){
			if (its%3 == 0 && its >3){
				System.out.println(its);
			}else if (its == 3){
				System.out.println(its);
				break;
			}
			its--;
		}
		int Highest;
		int Lowest;
		System.out.println("Enter a number");
		int num = scan.nextInt();
		System.out.println("Enter another number please");
		int num2 = scan.nextInt();
		if (num > num2){
			Highest = num;
			Lowest = num2;
		}else{
			Highest = num2;
			Lowest = num;
		}
		while(true){
			if (Lowest != Highest && Lowest%4 == 0 && Lowest%5 != 0){
				System.out.println(Lowest);
			}else if(Lowest == Highest){
				break;
			}
			Lowest++;
		}
	}
}
