import java.util.Scanner;

public class CircleFinder {

	public static void main(String[] args) {
		//GetRadius();
		
		Scanner input = new Scanner(System.in);
		Scanner in = new Scanner(System.in);
		Scanner input2 = new Scanner(System.in);
		
		double Area;
		//Scanner x = new Scanner(System.in);
		System.out.println("Input an area");
		Area = in.nextDouble();
		double radius = Math.sqrt((Area/Math.PI));
		System.out.println("Area:\t" + Area + "\nRadius:\t" + radius);
		
	//	x.close();
		
		int test1; 
		int test2;
		int test3;
		double average;
		
		System.out.println("\nTest 1 grade?");
		test1 = in.nextInt();
		System.out.println("Test 2 grade?");
		test2 = in.nextInt();
		System.out.println("Test 3 grade?");
		test3 = in.nextInt();
		
		average = ((test1+test2+test3)/3.0);
				
		System.out.println("Test1 grade : "+ test1 + "\n" + "Test2 grade : " + test2 + "\n" + "Test3 grade : " + test3);
		System.out.println("average : " + average);
		
		
		String first;
		String last; 
		
		System.out.println("\nWhat is your first name?");
		first = input2.nextLine();
		System.out.println("What is your last name?");
		last = input2.nextLine();
		System.out.println("Your full name is " + first + " " + last + ".");
		
		input.close();
	}
	
	
	public static void GetRadius(){
//		int Area;
//		Scanner x = new Scanner(System.in);
//		System.out.println("Input an area");
//		Area = x.nextInt();
//		double radius = Math.sqrt((Area/Math.PI));
//		System.out.println("Area:\t" + Area + "\nRadius:\t" + radius);
//		
//		x.close();
	}

}
