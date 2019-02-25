
public class ClassroomRunner {

	public static void main(String[] args) {
		Classroom myClass = new Classroom("A Day");
		
		myClass.addStudent("Addisson");
		myClass.addStudent("Abby");
		myClass.addStudent("Drew");
		myClass.classPopulation();
		myClass.listNames();
	}

}
