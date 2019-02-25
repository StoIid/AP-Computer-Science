import java.util.Scanner;
public class PopulationPrint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println("How many grades would you like to enter");
		Scanner scan = new Scanner(System.in);
//		double[]array = new double[scan.nextInt()];
//		double num = 0;
//		System.out.println("Array length: " + array.length);
//		for(int i = 0; i < array.length; i++){
//			System.out.println("Input Grade: " + (i+1) + " of " + array.length);
//			array[i] = scan.nextDouble();
//			num+= array[i];
//		}
//		System.out.println("Average: " + num/array.length);
		
		int[] one = {4,2,6,3,9};
		int[] temp = one.clone();
		System.out.println(one[0]);
		one[0] = temp[2];
		one[2] = temp[0];
		temp = null;
		System.out.println(one[0]);
	}
}
