import java.util.Scanner;
public class StudentTester {

	public static void main(String[] args) {
//		Student student1 = new Student("Johnny Johns A Lot", 15);
//		System.out.println(student1);
//		
//		Student classroom[] = new Student[5];
		// Default Population
//		for(int i = 0; i < classroom.length; i++){
//			classroom[i] = new Student();
//		}
		// Detailed Population
		Scanner scan = new Scanner(System.in);
//		Student classroom2[] = new Student[5];
//		for (int i = 0; i < classroom2.length; i++){
//			String name = "";
//			System.out.println("What is the students name?");
//			name = scan.nextLine();
//			System.out.println("What is the age of " + name);
//			classroom2[i] = new Student(name, scan.nextInt());
//			scan.nextLine();
//		}
		
		// Printout of Detailed array
//		for(int i = 0; i < classroom2.length; i++){
//			System.out.println((i+1) + ". Name: " + classroom2[i].getName() + " Age: " + classroom2[i].getAge());
//		}
//		
		// Prints the third index
//		System.out.println(classroom2[2]);
	
		Bank OfAmerica = new Bank("Bank Of America");
		OfAmerica.openBank();
		scan.close();
	}

}
