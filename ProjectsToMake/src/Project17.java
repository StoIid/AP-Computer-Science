import java.util.Scanner;
public class Project17 {

	public static void main(String[] args) {
		Scanner numScan = new Scanner(System.in);
		while(true){
			System.out.println("Enter a number!");
			int num = numScan.nextInt();
			if (num %2 == 0){
				System.out.println("Even!");
				break;
			}
		}
	}

}
