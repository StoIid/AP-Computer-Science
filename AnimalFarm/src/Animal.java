
public class Animal {
	boolean isMale = false;
	int numLegs = 4;
	String furColor = "Brown";
	double Size = 10.6;
	
	public Animal(){
		
	}
	
	public Animal(boolean isMale, int numLegs, String furColor, double Size){
		this.isMale = isMale;
		this.numLegs = numLegs;
		this.furColor = furColor;
		this.Size = Size;
		System.out.println("Woof Woof!");
	}
	
	public double Eat(double amt){
		//System.out.println("nom nom..");
		this.Size = this.Size + amt;
		return this.Size;
	}
	
	public boolean SexChange(boolean x){
		this.isMale = x;
		if(x){
			System.out.println("I am now a girl!");
		}else{
			System.out.println("I am now a male!");
		}
		return x;
	}
	
	public String dyeFur(String color){
		String originalColor = this.furColor;
		this.furColor = color;
		System.out.println("Changed fur color from: " + originalColor + " -> " + color);
		return originalColor;
	}
}