//Riley Trautman
public class DistToLine {
	public static double A,B,C;
	public static double getDistance(double a, double b) {
		double x = Math.abs(A*a+B*b+C)/Math.sqrt(Math.pow(A,2)+Math.pow(B,2));
		return x;
	}
}
