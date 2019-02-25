public class SavingsAccount extends BankAccount {
	private double balance;
	private double interestRate;
	
	public SavingsAccount(double amount, double rate) // Constructor
	
	{
		super(amount); // Calls the constructor in
		interestRate = rate; // BankAccount and sets balance
	}

	public void addInterest() {
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
	}
	public double getBalance() {
		return balance;
	}
	
	public double getBalance2() {
		return super.getBalance();
	}

	public void deposit(double d) { 
		balance += d;
		getBalance();
	}
	
	public void deposit2(double d) { 
		super.deposit(d);
	}

	public void withdraw(double d) {
		balance -= d;
		getBalance();
	}
	
	public void withdraw2(double d) {
		super.withdraw(d);
	}
}