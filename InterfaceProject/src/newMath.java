
public class newMath implements interMath {

	// Modulus
	public int mod(double x, double y) {
		return (int) (x / y);
	}

	// Power
	public double pow(double x, int y) {
		int t = 0, num = 0;
		while (t != y) {
			num *= x;
			t++;
		}
		return num;
	}

	// Pythag
	public double pythag(double a, double b) {
		return Math.sqrt(pow(a, 2) + pow(b, 2));
	}

	// Distance To Line from Point
	public double distToLine(double x, double y, double A, double B, double C) {
		return Math.abs((A * x) + (B * y) + C) / (Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));
	}

	// Average / Mean
	public double avg(double... x) {
		double sum = 0;
		for (double a : x) {
			sum += a;
		}
		return sum / x.length;
	}

}
