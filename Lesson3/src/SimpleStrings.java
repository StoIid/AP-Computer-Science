
public class SimpleStrings {

	public static void main(String[] args) {
		//Concatenation
		
		String name = "Addisson", last = "Saint-Hubert";
		String fullName = "Addisson" + " Saint-Hubert";
		System.out.println(name + " " +  last);
		System.out.println(fullName);
		System.out.println();
		
		System.out.println(name.length() + " # of characters conatained");
		
		//	.substring(int,x) - one argument (int,x)
		System.out.println("he said \"heh\"\t\"why tho\"");
		String word = "Tony Chicken Patty";
		System.out.println(word.substring(5));
		String word2 = "Snowdays";
		System.out.println(word2.substring(0, word2.length()/2)); // First half
		System.out.println(word2.substring(word2.length()/2)); // Last half
		System.out.println(word2.substring(0, word2.length()/2).toUpperCase() + word2.substring(word2.length()/2));
		
	///////////////////////////////////////////////////////////
		String s = "The number of rabbits is";
		int argh = 129;
		String report = s + " " + argh;
		System.out.println(report);
		
		String p = "Groovy Dude";
		System.out.println(p.toUpperCase());
		
		String g = "Computer Science is for nerds";
		System.out.println(p.toLowerCase());
		
		String m = "Four score and seven years ago";
		System.out.println(m.substring(7,12));
	////////////////////////////////////////////////////////////
		
		String pq = "Eddie Haskel";
		int hm = pq.length();
		String ed = pq.substring(hm-4);
		System.out.println(ed);
		
	}

}
