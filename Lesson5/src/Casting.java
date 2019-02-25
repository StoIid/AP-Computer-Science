
public class Casting {

	public static void main(String[] args) {
		int x = 5;
			System.out.println(++x);
			
		String batch[] = {"a", "b", "c", "d"};
		
			//System.out.println(batch[1]);
			
			//for (int z = 0; z < batch.length; z = z + 1 ){
			//	System.out.println(batch[z]+"\t"+":"+"\t"+z);
			//}
			Iterate(batch);
			
		final double Area;
		Area = 9;
		System.out.println(Area);
	}

	public static void Iterate(String[] table){ 
		//System.out.println("fired");
		for (int z = 0; z < table.length; z = z + 1 ){
			System.out.println(table[z]+"\t"+":"+"\t"+z);
		}
		for (String item : table){
			System.out.println("Element: " + item);
		}
	};

}
