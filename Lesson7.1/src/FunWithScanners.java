import java.util.Scanner;
public class FunWithScanners {

	public static void main(String[] args) {
		System.out.println("Please enter your whole name.");
		Scanner nScan = new Scanner(System.in);
		Scanner numScan = new Scanner(System.in);
		
		String name = nScan.nextLine();
		System.out.println("Your name has " + name.length() + " characters in it, how many would you like me to print?");
		
		
		int req = numScan.nextInt();
		System.out.println(name.substring(0,req));
		
		//nScan.close();
		//numScan.close();
		
		///////////////////////////////
		double j = 62/3;
		System.out.println(j);
		
		Scanner numScan2 = new Scanner(System.in);
		
		System.out.println("\nPlease enter your A value");
		int A = numScan2.nextInt();
		System.out.println("Please enter your B value");
		int B = numScan2.nextInt();
		System.out.println("Square root of " + (double)A + " squared + " + (double)B + " squared = " + Math.sqrt((Math.pow(A,2) + Math.pow(B,2))));
		
		
		System.out.println("Please enter your A value");
		int A2 = numScan2.nextInt();
		System.out.println("Please enter your B value");
		int B2 = numScan2.nextInt();
		System.out.println("Please enter your C value");
		int C = numScan2.nextInt();
		
		double ans1 = (-B2 + Math.sqrt(Math.sqrt(Math.pow(B2,2)- 4*A2*C))) / (2*A2);
		double ans2 = (-B2 - Math.sqrt(Math.sqrt(Math.pow(B2,2)- 4*A2*C))) / (2*A2);
		
		System.out.println(ans1);
		System.out.println(ans2);
		
		
		
		/////////////////////////////////
		
		Scanner finder = new Scanner(System.in);
		
		System.out.println("Please enter a sentence.");
		String sent = finder.nextLine();
		System.out.println("What letter shall I find?");
		
		String toFind = finder.nextLine();
		int foundIndex = sent.indexOf(toFind);
		
		System.out.println("Your letter occurs at index " + foundIndex);
		
		finder.close();
		nScan.close();
		numScan.close();
		numScan2.close();
	}

}
