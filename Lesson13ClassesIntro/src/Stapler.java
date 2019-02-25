public class Stapler {
	
	String color = "black";
	int cap = 220;//staple capacity
	int numStaples = 210;
	String material = "domascus steel";
	int uses = 0;
	boolean isOpen = false;
	double size = 7.25;//length in inches
	
	/*
	 * Default Constructor
	 * NO RETURN TYPE
	 */
	public Stapler(){
		
	}
	
	/*
	 * Constructor
	 * 
	 */
	public Stapler(String color, double size, String material, int cap){
		this.color = color;
		this.size = size;
		this.material = material;
		this.cap = cap;
		
	}
	
	
	
	/*
	 * Check for open/close stapler
	 * check num staples
	 */
	public int staple(){
		if(!isOpen){
			if(numStaples > 0){
				numStaples--;
				uses++;
			}else{
				System.out.println("Out of staples");
			}
		}else{
			System.out.println("CLOSE THE STAPLER?!..");
		}
		System.out.println("Staples left: " + numStaples);
		return numStaples;
	}
	
	
	/*
	 *check numStaples with capacity
	 *check isOpen
	 * done
	 */
	public void reload(){
		if (isOpen){
			numStaples = 210;
			uses = 0;
			System.out.println("Reloaded!");
			System.out.println("Staples left: " + numStaples);
		}else{
			System.out.println("Open the stapler first...");
		}
	}
	
	public void open(){
		System.out.println("You open the stapler and see you have " + numStaples + " staples left");
		isOpen = true;
	}
	
	public void close(){
		isOpen = false;
	}
	
	

}