import java.util.Scanner;
public class WhileLoops999 {

	public static void main(String[] args) {
		int num = 5;
		for (int i = 3; i <=15; i +=3){
			int y = 5;
			num -= y;
			y++;
		}
		System.out.println(num);
		
		
		
		int sum = 0;
		Scanner numScan = new Scanner(System.in);
		while (sum != 999) {
			System.out.println("Enter a number");
			int add = numScan.nextInt();
			sum = sum + add;
			System.out.println("Sum: " + sum + "\n" + "Key: 999");
		}
		System.out.println("Broke out of the loop!");
		
		while (true){
			System.out.println("heh");
		}
		
	}

}
