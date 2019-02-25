import java.util.Scanner;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter the A value for the line: ");
		DistToLine.A = scan.nextDouble();
		System.out.print("Enter the B value for the line: ");
		DistToLine.B = scan.nextDouble();
		System.out.print("Enter the C value for the line: ");
		DistToLine.C = scan.nextDouble();
		System.out.print("Enter the X cord: ");
		double x = scan.nextDouble();
		System.out.print("Enter the Y cord: ");
		double y = scan.nextDouble();
		System.out.println("Distance from point to our line: " + DistToLine.getDist(x,y));
		
		double[] rub = {1,2,3};
		double[] dub = {6,7,8};
	}
}
