public class StapleTester {

	public static void main(String[] args) {
		
		Stapler mine = new Stapler();
		Stapler swing = new Stapler("Hot Pink", 9, "wood", 300);

		swing.reload();
		swing.reload();
		swing.reload();
		for(int i = 210; i >= 0; --i)
			swing.staple();
	//	System.out.println(swing.numStaples);
		
		
	}

}