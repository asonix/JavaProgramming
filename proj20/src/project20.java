//Riley Trautman
import java.util.*;
public class project20 {
	public static void main(String args[]) {
		System.out.print("Enter the A value for the line: ");
		Scanner A = new Scanner(System.in);
		DistToLine.A = A.nextDouble();
		System.out.print("\n");
		
		System.out.print("Enter the B value for the line: ");
		Scanner B = new Scanner(System.in);
		DistToLine.B = B.nextDouble();
		System.out.print("\n");
		
		System.out.print("Enter the C value for the line: ");
		Scanner C = new Scanner(System.in);
		DistToLine.C = C.nextDouble();
		System.out.print("\n");
		
		System.out.print("Enter the x value for the line: ");
		Scanner x = new Scanner(System.in);
		double xx = x.nextDouble();
		System.out.print("\n");
		
		System.out.print("Enter the y value for the line: ");
		Scanner y = new Scanner(System.in);
		double yy = y.nextDouble();
		System.out.print("\n");
		
		double z = DistToLine.getDistance(xx,yy);
		
		System.out.println(z);
	}
}
