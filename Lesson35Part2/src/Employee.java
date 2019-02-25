
public abstract class Employee {
	String name;
	public double Salary;
	
	public Employee(){
		
	}
	
	public Employee(String name){
		this.name = name;
	}
	
	public abstract String changeName(String c);
	
	public abstract double setSalary(double amt);
	
}
