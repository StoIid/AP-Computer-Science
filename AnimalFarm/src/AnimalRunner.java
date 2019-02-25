
public class AnimalRunner {

	public static void main(String[] args) {
		
//		Animal myPuppy = new Animal();
//		System.out.println(myPuppy.Size);
//		myPuppy.Eat(2);
//		System.out.println(myPuppy.Size);
//		myPuppy.SexChange(true);
//		System.out.println(myPuppy.furColor);
//		myPuppy.dyeFur("Red");
//		System.out.println(myPuppy.furColor);
		
		Animal dog = new Animal();
		Animal kang = new Animal(true, 2, "Tan", 230.4);
		
		kang.SexChange(false);
		System.out.println(kang.SexChange(true));//print true
		dog.Eat(50.3);
		System.out.println(dog.Eat(2));//print 62.9
		System.out.println(kang.dyeFur("Green"));//print Tan
		System.out.println(kang.dyeFur("blue"));//print Green
		System.out.println(dog.SexChange(false));//print false
	}

}
