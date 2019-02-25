
public class Safe {
	private String Brand;
	private String Color; 
	private boolean isOpen = false;
	private int combination;
	public static int number = 555;
	
	public Safe(){
		
	}
	
	public Safe(int combo, String Color, String Brand){
		this.combination = combo;
		this.Color = Color;
		this.Brand = Brand;
		//this.isOpen = isOpen;
	}
	
	public String setCombo(int combo){
		this.combination = combo;
		System.out.println("Combination changed");
		return "Combination Changed";
	}
	
	public void openLock(int pass){
		if (pass == this.combination && !this.isOpen){
			this.isOpen = true;
			System.out.println("Unlocked.");
		}else{
			System.out.println("Wrong combination or already open");
		}
	}
	
	public void closeLock(){
		this.isOpen = false;
		System.out.println("Closed the safe");
	}
	// Returns Combo
	public int getCombo(){
		return this.combination;
	}
	public String toString(){
		return "Color: " + this.Color + "\nCombo: " + this.combination;
	}
	public static void printName(){
		System.out.println("Addisson");
	}
	// Determines Equality
	public boolean Equals(Safe x){
		return (this == x);
	}
	// Change brand
	public void changeBrand(String brand){
		this.Brand = brand;
	}
	// Change Color
	public void changeColor(String color){
		this.Color = color;
	}
	
}