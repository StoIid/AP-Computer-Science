public class MultiD {
	
	public static void print1D(int[] x){
		for(int i = 0; i < x.length; i++){
			System.out.print(x[i] + " ");
		}
	}
	
	public static void print2D(int[][] x){
		for(int i = 0; i < x.length; i++){
			for(int a = 0; a < x[i].length; a++){
				System.out.print(x[i][a] + " ");
			}
			System.out.println("");
		}	
	}
	
	public static void print2D(String[][] x){
		for(int i = 0; i < x.length; i++){
			for(int a = 0; a < x[i].length; a++){
				System.out.print(x[i][a] + " ");
			}
			System.out.println("");
		}
	}
	
	public static int[][] compileArrays(int[] x, int[] y, int[] z){
		int[][] array = new int[3][];
		array[0] = x;
		array[1] = y;
		array[2] = z;
		return array;
	}
	
	public static String[][] evenArray(String[][] words){
		int shortestRow = words[0].length; // Number of  
		for(int i = 0; i < words.length; i++){
			if(shortestRow > words[i].length){
				shortestRow = words[i].length;
			}
		}
		System.out.println("Shortest row is: " + shortestRow);
		String[][] newWords = new String[words.length][shortestRow];
		for(int i = 0; i < newWords.length; i++){
			for(int a = 0; a < newWords[i].length; a++){
				newWords[i][a] = words[i][a];
			}
		}
		return newWords;
	}
	
	public static boolean stringLength(int[] lens, String[][] words){
		boolean even = true;
		for(int i = 0; i < words.length; i++){
			for(int a = 0; a < words[i].length; a++){
				if(words[a][i].length() != lens[i]){
					even = false;
					return even;
				}
			}
		}
		return even;
	}
	
	public static int[] thirdCol(int[][] nums){
		int[] newNums = new int[nums.length];
		for(int i = 0; i < nums.length; i++){
			for(int a = 0; a < 1; a++){
				newNums[i] = nums[i][2];
			}
		}
		return newNums;
	}
	
	public static boolean dupes(String[] words){
		for(int i = 0; i < words.length; i++){ // holds reference to word we are comparing
			for(int a = 0; a < words.length; a++) { // holds reference to words we iterate thru to compare
				if(a == i) continue;
				if(words[a].equals(words[i]))
					return true;
			}
		}
		return false;
	}
	
	public static boolean multiDupes(String[][] words){
		for(int i = 0; i < words.length; i++) {
			for(int a = 0; a < words[i].length; a++) {
				for(int b = 0; b < words.length; b++) {
					for(int c = 0; c < words[b].length; c++) {
						if (a == c && i == b) continue;
						if(words[i][a].equals(words[b][c]))
							return true;
					}
				}
			}
		}
		
		return false;
	}
	
	public static int[][] noEvens(int[][] nums){
		int[][] newNums = nums.clone();
		for(int i = 0; i < nums.length; i++) {
			for(int a = 0; a < nums[i].length; a++) {
				if(nums[i][a] % 2 != 0) {
					newNums[i][a] = 5; 
				}
			}
		}
		return nums;
	}
}