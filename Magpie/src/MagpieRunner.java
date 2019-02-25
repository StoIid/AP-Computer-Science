
import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Laurie White
 * @version April 2012
 */
public class MagpieRunner
{

	private static String findKeyword(String statement, String goal, int startPos) { 
		String phrase = statement.trim(); 
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos); 
		while (psn >= 0) { 
			String before = " ", after = " "; 
			if (psn > 0) { 
				before = phrase.substring (psn - 1, psn).toLowerCase(); 
			}
			if (psn + goal.length() < phrase.length()) { 
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase(); 
			}
			/* determine the values of psn, before, and after at this point in the method. */ 
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0)) && ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0))) { 
				return psn + " b:" + before + " a:" + after;
			} 
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
		}
		return "-1";
	}
	/**
	 * Create a Magpie, give it user input, and print its replies.
	 */
	public static void main(String[] args)
	{
		System.out.println(findKeyword("She's my sister mister sister", "sister", 0));
		System.out.println(findKeyword("Brother Tom is helpful", "brother", 0));
		Magpie maggie = new Magpie();
		
		System.out.println (maggie.getGreeting());
		Scanner in = new Scanner (System.in);
		String statement = in.nextLine();

		while (!statement.equals("Bye"))
		{
			System.out.println (maggie.getResponse(statement));
			statement = in.nextLine();
		}
	}

}
