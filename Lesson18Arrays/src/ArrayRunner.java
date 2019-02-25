
public class ArrayRunner {

	public static void main(String[] args) {
		double[] c = {1,2,3,4};
		String[] x = {"Hello", "There"};
		String[] a = ArrayStuff.append(x, "World");
		
		System.out.println(a[0]); // Hello
		System.out.println(a[1]); // World
		
		System.out.println(ArrayStuff.indexOf(a, "hello")); // 0
		
		System.out.println(ArrayStuff.indexOf(c, 4)); // 3
		System.out.println(ArrayStuff.multsOf(c, 2)); // 2
		System.out.println(c.length); // 4
		System.out.println(ArrayStuff.deleteThree(c).length); // 3
		System.out.println(ArrayStuff.totalLength(a)); // 10 "Hello" : 5 || "World" : 5
		System.out.println(ArrayStuff.lengthCompare(a, a)); // 0
		System.out.println(c[1]); // 2
		System.out.println(c[2]); // 3
		ArrayStuff.swapVals(c, 2, 3);
		System.out.println(c[1]); // 3
		System.out.println(c[2]); // 2
		System.out.println(ArrayStuff.equalElements(x, x));
		
	}
}
