import java.util.Scanner;
public class AnotherOne {

	public static void main(String[] args) {
		int[] g = {7,6,4,2,8,9};
		int[] g2 = new int[g.length];
		
		// Mirrored array 
		System.out.println("G1 Array:");
		for(int i = g.length-1; i >= 0; i--){
			g2[i] = g[(g.length-1)-i];
		}
		for(int i = 0; i < g.length; i++){
			System.out.println(i + " : " + g[i]);
		}
		System.out.println("\nG2 Array:");
		for(int i = 0; i<g2.length; i++){
			System.out.println(i + " : " + g2[i]);
		}
		/////
		Scanner scan = new Scanner(System.in);
		int[] array = new int[7];
		int high = 0;
		int hindex = 0;
		int low = 0;
		int lindex = 0;
		low = array.length;
		System.out.println("Enter 7 numbers");
		for (int i = 0; i < array.length; i++){
			int num = scan.nextInt();
			array[i] = num;
			if (num < low){
				low = num;
				lindex = i;
			}
			if(num > high){
				high = num;
				hindex = i;
			}
		}
		System.out.println("Lowest: " + low);
		System.out.println("Highest: " + high);
		for (int i = 0; i < array.length; i++){
			System.out.println(i + " : " + array[i]);
		}
		System.out.println("\n");
		array[lindex] = high;
		array[hindex] = low;
		for (int i = 0; i < array.length; i++){
			System.out.println(i + " : " + array[i]);
		}
	}
}
