import java.util.Scanner;
public class AdvancedArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] array = new String[5];
		
		for(int i = 0; i<array.length; i++){
			System.out.println("Enter a name");
			array[i] = scan.nextLine();
		}
		for(int i = 0; i<array.length; i++){
			System.out.println((i+1)  +". " + array[i]);
		}
		
		Student me = new Student("Addisson", 18);
		System.out.println(me);
	}
}
