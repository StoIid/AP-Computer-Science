import java.util.Scanner;

public class ListOfNames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("How many names would you like to enter");
		String[] array = new String[scan.nextInt()];
		scan.nextLine();
		System.out.println("Array length: " + array.length);
		for(int i = 0; i < array.length; i++){
			System.out.println("Input Name: " + (i+1) + " of " + array.length);
			array[i] = scan.nextLine();
		}
		System.out.println("Names: ");
		for(int i = 0; i < array.length; i++){
			System.out.println((i+1) + ". " + array[i]);
		}
	}

}
