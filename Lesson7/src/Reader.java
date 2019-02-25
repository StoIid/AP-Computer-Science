import java.util.Scanner;

public class Reader {
	
		public static void main(String[] args){
			
			Scanner inputscan; 
			inputscan = new Scanner(System.in);
			System.out.println("What is your age?");
			double age = inputscan.nextDouble();
			System.out.println("Your age " + age + " years old!");
			System.out.println("Next year you will be " +(++age)+ " years old!");
			inputscan.close();
			
		}

		
		public static void newScan(String[] args){
			
		}
}
