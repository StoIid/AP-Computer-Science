
public class WhileLoops {

	public static void main(String[] args) {
		int num = 5;
		while (num > 5 && num < 700){
			num = num + num;
			if (num > 700){
				System.out.println("broke");
				break;
			}
		}
		System.out.println(num); 
	}

}
