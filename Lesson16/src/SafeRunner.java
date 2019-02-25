
public class SafeRunner {

	public static void main(String[] args) {
		
//		Safe MySafe = new Safe(123456);
//		
//		MySafe.openLock(123456); // is correct
//		MySafe.closeLock(); // is wrong
//		MySafe.setCombo(1234); // sets new combo
//		MySafe.openLock(123456); // is now wrong
//		MySafe.openLock(1234); // is correct
//		MySafe.openLock(1234); // is correct but already opened
		
		
//		Safe safe1 = new Safe(12345, "Black", "Nike");
//		safe1.setCombo(12345);
//		System.out.println(safe1.Color);
//		System.out.println(safe1.Brand);
//		safe1.setCombo(5);
//		System.out.println(safe1.getCombo());
		
		Safe momSafe = new Safe(123, "Black", "Nike");
		Safe dadSafe = new Safe(123, "Black", "Nike");
		Safe mySafe = new Safe(12345, "Black", "Nike");
		Safe sisSafe = mySafe;

		System.out.println(momSafe == dadSafe);
		System.out.println(dadSafe == mySafe);
		System.out.println(mySafe == sisSafe);
		
		dadSafe.setCombo(5);
		momSafe.setCombo(4);
		mySafe.setCombo(1);
		System.out.println(sisSafe.getCombo());
		
		System.out.println(mySafe);
		mySafe.printName();
		Safe.printName();
		System.out.println(Safe.number);
		System.out.println(momSafe.number);
		System.out.println(dadSafe.number);
		System.out.println(sisSafe.number);
		dadSafe.number = 5;
		System.out.println(sisSafe.number);
		System.out.println(momSafe.Equals(momSafe));
	}

}
