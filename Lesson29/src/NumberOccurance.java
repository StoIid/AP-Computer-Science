import java.util.Random;
public class NumberOccurance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int[] occurrence = new int[10];
		int highest = 0, lowest = 0; // used to get the range
		int iterations = 10000; // how many times it will pick a number
		
		for (int i = iterations; i > 0; i--){ // increments value of occurrence corresponding to the array
			occurrence[rand.nextInt(10)]++;
		}
		for (int i = 0; i < occurrence.length; i++){ // prints out the occurrence amount of each number 1-9 inclusive 
			System.out.println((i) + " : " + occurrence[i]);
			if(occurrence[i] > occurrence[highest] ){
				highest = i;
			}else if(occurrence[i] < occurrence[lowest]){
				lowest = i;
			}
		}
		System.out.println("Highest: " + highest + "\nLeast: " + lowest);
		System.out.println("Range: " + (occurrence[highest] - occurrence[lowest]));
	}

}
