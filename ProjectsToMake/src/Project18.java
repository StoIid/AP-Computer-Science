import java.util.Scanner;
public class Project18 {

	public static void main(String[] args) {
		
		System.out.println();
		int[] numArray;
		numArray = new int[100];
		
		Scanner numScan = new Scanner(System.in);
		while (true){
			int trial = 0;
			trial++;
			System.out.println("Entry: " + trial);
			double number = numScan.nextDouble();
			if (number == 0){
				System.out.println("Broke!");
				break;
			}
			
		} 
		System.out.println(numArray);
		PrintArray(numArray);
		
	}
	
	public static void PrintArray(int[] array){
		for(int x = 0; x <= array.length; x++){
			System.out.println("Key: " + x + "\tElement: "  + array[x]);
		}
	}
}
