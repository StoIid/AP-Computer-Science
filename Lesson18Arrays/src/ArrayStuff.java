
public class ArrayStuff {
	
	public static double addemUp(double[] x){
		double sum = 0;
		for(int i = 0; i < x.length; i++){
			sum += x[i];
		}
		return sum;
	}
	public static double highest(double[] x){
		double highest = 0;
		for(int i = 0; i < x.length; i++){
			if(x[i] > highest)
				highest = x[i];
		}
		return highest;
	}
	
	public static double lowest(double[] x){
		double lowest = 0;
		for(int i = 0; i < x.length; i++){
			if(lowest == 0){
				lowest = x[i];
			}else if(x[i] < lowest){
				lowest = x[i];
			}
		}
		return lowest;
	}
	
	public static String[] append(String[] a, String b){
		String[] newString = new String[a.length+1];
		for(int i = 0; i < a.length; i++){
			newString[i] = a[i];
		}
		newString[newString.length-1] = b;
		return newString;
	}
	
	public static int indexOf(String[] a, String b){
		for(int i = 0; i < a.length; i++){
			if(a[i].equalsIgnoreCase(b)){
				return i;
			}
		}
		return -1;
	}
	
	public static int indexOf(double[] a, double b){
		for(int i = 0; i < a.length; i++){
			if(a[i] == b){
				return i;
			}
		}
		return -1;
	}
	
	public static int multsOf(double[] a, double b){
		int mults = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] % b == 0){
				mults++;
			}
		}
		return mults;
	}
	
	public static double[] deleteThree(double[] a){
		double[] x = new double[a.length];
		int newlen = 0;
		for(int i = 0; i < a.length; i++){
			if(a[i] % 3 != 0){
				x[i] = a[i];
				newlen++;
			}
		}
		double[] y = new double[newlen];
		for(int i = 0; i < y.length; i++){
			y[i] = x[i];
		}
		return y;
	}
	
	public static int totalLength(String[] a){
		int sum = 0;
		for(int i = 0; i < a.length; i++){
			sum += a[i].length();
		}
		return sum;
	}
	
	public static int lengthCompare(String[] a, String[] b){
		return ArrayStuff.totalLength(a) - ArrayStuff.totalLength(b);
	}
	
	public static double[] sumArray(double[] a, double[] b){
		double[] x = new double[a.length];
		for(int i = 0; i < a.length; i++){
			x[i] = a[i] + b[i];
		}
		return x;
	}
	
	public static int swapVals(double[] a, double b, double c){
		if(ArrayStuff.indexOf(a, b) != -1 && ArrayStuff.indexOf(a, c) > -1){
			double[] temp = a.clone();
			a[ArrayStuff.indexOf(temp, b)] = c;
			a[ArrayStuff.indexOf(temp, c)] = b;
			return 1;
		}else{
			return -1;
		}
	}
	
	public static void printA(int[] a){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static void printA(String[] a){
		for(int i = 0; i < a.length; i++){
			System.out.println(a[i]);
		}
	}
	
	public static String[] equalTo(String[] a, int b){
		String[] x = new String[b];
		for(int i = 0; i < x.length; i++){
			x[i] = a[i];
		}
		return x;
	}
	
	public static int equalElements(String[] a, String[] b){
		int numSame = 0;
		String[] shorter = null, longer = null;
		if (a.length > b.length){
			shorter = b;
		}else{
			shorter = a;
		}
		for(int i = 0; i < shorter.length; i++){
			if(a[i] == b[i]){
				numSame++;
			}
		}
		return numSame;
	}
	
	public static int[] deleteDupes(int[] a){
		String[] x = null;
		for(int i = 0; i < a.length; i++){
			int occurence = 0;
			int dupe;
			for(int z = 0; z < a.length; z++){
				if(a[i] == a[z] && occurence == 0){
					occurence++;
					dupe = a[i];
				}else{
					
				}
			}
		}
		return a;
	}
}
