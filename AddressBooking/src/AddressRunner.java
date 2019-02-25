import java.util.Scanner;

public class AddressRunner {
	Scanner scan = new Scanner(System.in);
	AddressBook entry1 = new AddressBook();
	AddressBook entry2 = new AddressBook();
	AddressBook entry3 = new AddressBook();
	
	public static void main(String[] args) {
		AddressRunner Run = new AddressRunner();
		Run.Menu(); 	
	}
	
	public void Add(){
		
	}
	
	public void Delete(){
		
	}
	
	public void View(){
		
	}
	
	public void Exit(){
		
	}
	
	public void Menu(){
		System.out.println("Welcome to your address book - Choose an option\n1. Add\n2. Delete\n3. View\n4. Exit");
		int cho = scan.nextInt();
		if (cho == 1){
			Add();
		}else if (cho == 2){
			Delete();
		}else if (cho == 3){
			View();
		}else if (cho == 4){
			Exit();
		}
		//System.out.println(entry1);
	}
	

	
}
