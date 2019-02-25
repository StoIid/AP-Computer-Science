import java.util.Scanner;

public class ScannerProgram {

	public static void main(String[] args) {
		
		Scanner StringInput = new Scanner(System.in);
		Scanner IntInput = new Scanner(System.in);
		
		System.out.println("Please enter your name");
		String name = StringInput.nextLine();
		
		System.out.println("Please enter your age");
		double age = IntInput.nextInt();
		
		//IfPlural(age);
		System.out.println(name + " is " + age + " years old");
		
		StringInput.close();
		IntInput.close();
		
		System.out.println(150 * 5 * 6);
	}
	
}
