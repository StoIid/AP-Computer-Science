import java.util.Scanner;

public class IfStatements {

	public static void main(String[] args) {
		System.out.println(Math.floor(157));
		if (true) {
			System.out.println("The if statement is true");
		}
		if (false) {
			System.out.println("The if statement is false");
		}

		Scanner numFind = new Scanner(System.in);
		System.out.println("How old are you?");
		int age = numFind.nextInt();
		if (age >= 18) {
			System.out.println("Awesome you can drive alone!!");
		} else {
			System.out.println("You need to wait " + (18 - age) + " more years!!");
		}
		
		String s1 = "school BUS";
		if (s1.equals("school bus")){
			System.out.println("Equal");		
		} else {
			System.out.println("Not Equal");
		}
		System.out.println(11.5/13*100);
	}

}
