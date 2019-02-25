
public class Crypto {

	public static String Encrypt(String sent){
		String encryptedSent = "";
		for(int i = 0; i < sent.length(); i++){	
			if(sent.toLowerCase().charAt(i) == 'v'){
				System.out.println(sent.charAt(i) + " - bing!");
				encryptedSent = sent.substring(0,i) + "ag’,r" + sent.substring(i+1,sent.length());
			}else if (sent.toLowerCase().charAt(i) == 'm'){
				System.out.println(sent.charAt(i) + " - bing!");
				encryptedSent = sent.substring(0,i) + "ssad" + sent.substring(i+1,sent.length());
			}else if (sent.toLowerCase().charAt(i) == 'g'){
				System.out.println(sent.charAt(i) + " - bing!");
				encryptedSent = sent.substring(0,i) + "jeb..w" + sent.substring(i+1,sent.length());
			}else if (sent.toLowerCase().charAt(i) == 'b'){
				System.out.println(sent.charAt(i) + " - bing!");
				encryptedSent = sent.substring(0,i) + "dug>?/" + sent.substring(i+1,sent.length());
			}else{
				System.out.println(sent.substring(0,i)+ " - EH?");
				encryptedSent = encryptedSent + sent.substring(0,i);
			}
			System.out.println(encryptedSent);
		}
		return encryptedSent;
	}
	
	public static String Decrypt(String sent){
		for(int i = 0; i < sent.length(); i++){
			
		}
		return sent;
		
	}
}
