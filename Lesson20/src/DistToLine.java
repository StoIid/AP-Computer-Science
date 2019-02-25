
public class DistToLine {
	public static double A = 2.45, B = 4, C = -8;
	
	public static double getDist(double x, double y){
		
		return Math.abs((A*x)+(B*y)+C)/(Math.sqrt(Math.pow(A, 2) + Math.pow(B, 2)));
	}
}
