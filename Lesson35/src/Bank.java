
public class Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankAccount a = new BankAccount(500);
		SavingsAccount b = new SavingsAccount(1000, 5);
		CheckingsAccount c = new CheckingsAccount(500, 5);
		BankAccount hybrid = new SavingsAccount(1000,5);
		double balance;
		
		System.out.println(b.getBalance2());
		System.out.println(c.getBalance2());
		b.deposit2(500);
		c.deposit2(500);
		System.out.println(b.getBalance2());
		System.out.println(c.getBalance2());
		b.addInterest();
		c.addInterest();
		//System.out.println(b.);
		System.out.println(hybrid.getClass());
		
	}
}
