import java.util.Scanner;
public class Bank {
	Scanner scan = new Scanner(System.in);
	private BankAccount[] clients = new BankAccount[5];
	private String name = "No Name";
	public int numBankAccounts = 0;
	
	public Bank(){
		
	}
	
	/**
	 * <i><b>Bank</b></i>
	 * <p>
	 * <code>public Bank({@linkplain String} name)</code>
	 * <p>
	 * Creates a new bank object that is to be used to host client {@linkplain BankAccount} objects. 
	 * @param String name - Name of the bank
	 */
	public Bank(String name){
		this.name = name;
	}
	
	public void openBank(){
		while(true){
			System.out.println("Welcome to " + this.name + ", currently serving " + this.numBankAccounts + " clients.");
			menu();
			int choice = scan.nextInt();
			scan.nextLine();
			if (choice == 1){ // Login
				login();	
			}else if(choice == 2){ // Create
				create();
			}else if (choice == 3){ // List Clients
				System.out.println("Goodbye!");
				listClients();
				break;
			}else if (choice == 4){ // Display Accounts
				displayAllAccounts();
			}else{
				System.out.println("Invalid Option");
			}
		}
	}
	
	private void menu(){
		System.out.println("1. Login\n" + "2. Create Account\n" + "3. Exit\n" + "4. Display Accounts");
	}
	
	private void loginMenu(int id){
		System.out.println("Account options for account: " + this.clients[id].getName() + " - $" + this.clients[id].getBalance());
		System.out.println("1. Deposit\n" + "2. Withdraw\n" + "3. Close Account\n" + "4. Log Out");
	}
	
	private void login(){
		System.out.print("Enter the name of the account you wish to log into: ");
		String accountName = scan.nextLine();
		for(int i = 0; i < this.numBankAccounts; i++){
			if (clients[i] != null && this.clients[i].getName().equals(accountName)){
				System.out.print("Enter password for account " + accountName + ": ");
				if(!this.clients[i].checkPass(scan.nextLine())){
					System.out.println("Invalid Password.");
					return;
				}
				while(true){
					loginMenu(i); // Display after-login options
					int choice = scan.nextInt();
					scan.nextLine();
					if (choice == 1) { // Deposit
						System.out.print("Enter the amount you would like to deposit: ");
						deposit(scan.nextDouble(),i);
						scan.nextLine();
					}else if(choice == 2) { // Withdraw
						System.out.print("Enter the amount you would like to Withdraw: ");
						withdraw(scan.nextDouble(),i);
						scan.nextLine();
					}else if(choice == 3){ // Close Account
						logOut(i);
						closeAccount(i);
						return;
					}else if (choice == 4) { // Log out
						logOut(i); 
						return;
					}else {
						System.out.println("Invalid Option.");
					}
				}
			}
		}
		System.out.println("Account does not exist.");
		return;
	}
	
	private Boolean nameExists(String name, BankAccount[] x){
		for(int i = 0; i < x.length; i++){
			if(x[i] != null && x[i].getName().toLowerCase().equals(name)){
				System.out.println("Error: Account with this name already exists.\n");
				return true;
			}
		}
		return false;
	}
	
	private void displayAllAccounts(){
		String list = "Accounts: ";
		for(BankAccount x: this.clients){
			if (x != null){
				list = list + x.getName() + " | ";
			}
		}
		System.out.println(list);
	}
	private void create(){
		if (this.numBankAccounts != 5) {
			System.out.print("Enter the name of this new account: ");
			String name = scan.nextLine();
			if (nameExists(name, this.clients)) return;
			System.out.print("Enter a password for account " + name + ": ");
			this.clients[this.numBankAccounts] = new BankAccount(name,scan.nextLine(),0);
			this.numBankAccounts++;
			System.out.println("Account Created: " + name + "\n");
		}else {
			System.out.println("Max accounts reached at this bank: " + this.name + "\n");
		}
	}
	
	private void closeAccount(int id){
		System.out.println("Closing Account: " + this.clients[id].getName());
		BankAccount[] temp = new BankAccount[this.clients.length];
		for(int i = 0; i < this.clients.length; i++) {
			if (this.clients[i] != null && !this.clients[i].equals(this.clients[id])) {
				temp[i] = this.clients[i];
			}
		}
		this.clients = temp;
		this.numBankAccounts--;
	}
	
	private void deposit(double dep, int index){
		this.clients[index].deposit(dep);
		System.out.println("Deposit Successful!");
	}
	
	private void withdraw(double wit, int index){
		this.clients[index].withdraw(wit);
		System.out.println("Withdrawl Successful!");
	}
	
	private void logOut(int index){
		System.out.println("Logging out of Account: " + this.clients[index].getName() + "\n");
	}
	
	private void listClients() {
		for(int i = 0; i < this.clients.length; i++) {
			if (this.clients[i] != null) {
				System.out.println(this.clients[i].getName());
			}
		}
	}
}