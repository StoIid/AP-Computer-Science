
public class PublicEmployee extends Employee {

	public PublicEmployee(){
		super();
	}
	
	public PublicEmployee(String name){
		super(name);
	}
	
	public String changeName(String c) {
		this.name = c;
		return this.name;
	}

	public double setSalary(double amt) {
		this.Salary = amt;
		return this.Salary;
	}
	
	public void printName(){
		System.out.println(this.name);
	}

	public void getPaid(){
		System.out.println("You made money");
	}
}
