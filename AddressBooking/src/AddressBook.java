
public class AddressBook {
	String Name = "";
	String Address = "";
	int Number = 0;
	
	public AddressBook(){
		
	}
	
	public AddressBook(String name, String address, int number){
		this.Name = name;
		this.Address = address;
		this.Number = number;
	}
	
	public void DeleteInfo(){
		this.Name = "";
		this.Address = "";
		this.Number = 0;
	}

}
