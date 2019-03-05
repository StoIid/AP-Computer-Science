// But Better
import java.util.*;

public class Bank {

	Scanner scan = new Scanner(System.in);
	ArrayList<BankAccount> clients = new ArrayList<BankAccount>();
	public String name = "Untitled";
	
	public Bank(){
		
	}
	
	public Bank(String name){
		this.name = name;
	}
	
	public void openBank(){
		while(true){
			System.out.println("Welcome to " + this.name + ", currently serving " + clients.size() + " clients.");
			
		}
	}
	
	private void menu() {
		System.out.println("1. Login\n" + "2. Create Account\n" + "3. Exit\n" + "4. Display Accounts");
	}

	private void loginMenu(int id) {
		System.out.println(
				"Account options for account: " + this.clients.get(id).getName() + " - $" + this.clients.get(id).getBalance());
		System.out.println("1. Deposit\n" + "2. Withdraw\n" + "3. Close Account\n" + "4. Log Out");
	}
}
