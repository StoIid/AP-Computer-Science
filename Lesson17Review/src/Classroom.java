
public class Classroom {
	private int students;
	private String roster = "";
	private String className = "Untitled";
	
	public Classroom(){
		
	}
	
	public Classroom(String ClassName){
		this.className = ClassName;
	}
	
	public void addStudent(String name){
		this.roster = this.roster + name + ", ";
		this.students++;
	}
	
	public boolean findStudent(String name){
		return(roster.toLowerCase().contains(name.toLowerCase()));
	}
	
	public void classPopulation(){
		System.out.println(students);
	}
	
	public void listNames(){
		String list = "";
		String temp = this.roster;
		int it = 0;
		//System.out.println(temp);
		while (true){
			//System.out.println(temp.indexOf(","));
			if (it != students){
				list = list + temp.substring(0, temp.indexOf(","));
				temp = temp.substring(roster.indexOf(","), temp.length());
			}else{
				break;
			}
			System.out.println("Temp Roster: " + temp);
			System.out.println("List: " + list + "\n");
			it++;
		}
		System.out.println(list);
	}
}
