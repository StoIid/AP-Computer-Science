public class Magpie {

/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */

	/**
	 * Get a default greeting 	
	 * @return a greeting
	 */

	public String getGreeting()
	{
		return "Hello, let's talk.";
	}
	
	/**
	 * Gives a response to a user statement
	 * 
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement)
	{
		statement = statement.toLowerCase();
		String response = "";
		if (statement.indexOf("no") >= 0)
		{
			response = "Why not?";
		}
		else if (statement.indexOf("mother") >= 0
				|| statement.indexOf("father") >= 0
				|| statement.indexOf("sister") >= 0)
		{
			response = "Tell me more about your family.";
		}else if (statement.indexOf("cat") >= 0
				|| statement.indexOf("dog") >= 0){
			response = "Tell me more about your pets";
		}else if (statement.indexOf("mr.") >= 0){
			response = "He sounds like a great teacher!";
		}else if(statement.indexOf("Mrs.") >= 0
				|| statement.indexOf("miss.") >= 0){
			response = "She sounds like a great teacher";
		}else if(statement.trim().length() == 0){
			response = "Say something, please.";
		}else if(statement.indexOf("brother") >= 0){
			response = "He sounds interesting";
		}else if(statement.indexOf("tasty") >= 0){
			response = "Can I have some?";
		}else if(statement.indexOf("fun") >= 0){
			response = "Sounds exciting.";
		}else if(statement.indexOf("gross") >= 0){
			response = "Blegh, sounds gross.";
		}else if(statement.indexOf("what do i like") >= 0){
			String list = "";
			for(int i = 0; i < likes.length; i++){
				if (likes[0] != "" && likes[i+1] == "" ||i == likes.length-1){
					list = list + "and " + likes[i];
					break;
				}else if(likes[0] == ""){
					response = "You like nothing";
					break;
				}else{
					list = list + likes[i] + ", ";
					response = "You like " + list;
				}
			}
		}else if(statement.indexOf("i like") >= 0){
			
			String b = likeWhat(statement.indexOf("i like"), statement);
			response = "So u like..." + b;
			likes[likecount-1] = b;
		}else{
			response = getRandomResponse();
		}
		findKeyword("She's my sister", "sister", 0);
		return response;
	}
	static int likecount = 0;
	static String[] likes = {"","","",""};
	public static String likeWhat(int at, String a){
		//System.out.println(at + " : " + a);
		likes[likecount++] = a.substring(at+7);
		return a.substring(at+7);
	}
	
	
	private int findKeyword(String statement, String goal, int startPos) { 
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
				return psn;
			} 
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
		}
		return -1;
	}


	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse()
	{
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";
		
		if (whichResponse == 0)
		{
			response = "Interesting, tell me more.";
		}
		else if (whichResponse == 1)
		{
			response = "Hmmm.";
		}
		else if (whichResponse == 2)
		{
			response = "Do you really think so?";
		}
		else if (whichResponse == 3)
		{
			response = "You don't say.";
		}
		else if (whichResponse == 4)
		{
			response = "Go on..";
		}
		else if (whichResponse == 5)
		{
			response = "Keep going.";
		}
		return response;
	}

}
