
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PublicEmployee Sam = new PublicEmployee("Sam");
		Sam.printName();
		System.out.println(Sam.getClass());
		System.out.println(Sam.Salary);
		
		Employee Bob = new PublicEmployee("Bob");
		System.out.println(Bob.getClass());
		
	}

}
