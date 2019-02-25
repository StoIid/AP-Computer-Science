
/**
 * {@code public Class Bank()}
 *<p>
 *Class used to store monetary value as well as a name. 
 */
public class BankAccount {
	private String name = "Untitled";
	private String pass = "1234";
	private double balance = 0.00;
	
	public BankAccount(){
		
	}
	
	public BankAccount(String name, String pass, double balance){
		this.name = name;
		this.pass = pass;
		this.balance = balance;
	}
	
	public double deposit(double x){
		this.balance += x;
		return this.balance;
	}
	
	public double withdraw(double x){
		this.balance -= x;
		return this.balance;
	}
	
	public String toString(){
		return ("Account Name: " + this.name + "\nBalance: " + this.balance);
	}
	
	public String getName(){
		return this.name;
	}
	
	public double getBalance(){
		return this.balance;
	}
	
	public Boolean checkPass(String x){
		return x.equals(this.pass);
	}
}
