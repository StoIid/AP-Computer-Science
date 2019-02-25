
public class Student {
	private String name = "No Name";
	private int age = 0;
	
	public Student(){
		
	}
	
	public Student(String name, int age){
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return("Name: " + this.name + "\nAge: " + this.age);
	}
	
	public String getName(){
		return this.name;
	}
	
	public int getAge(){
		return this.age;
	}
}
