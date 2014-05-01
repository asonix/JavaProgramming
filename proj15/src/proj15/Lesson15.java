//Riley Trautman
//02.12.14

package proj15;

public class Lesson15 {
	public static void main(String args[]) { //main is a method, public allows other methods to reference it, void indicates nothing is returned
		Circle cir1 = new Circle(5.1); //these statements set initial radiuses
		Circle cir2 = new Circle(20.6);
		
		cir1.setRadius(30); //overwrites previous radius

		double xx = cir1.radius; //stores radius of circle 1 in variable xx
		System.out.println(cir2.area()); //prints area of circle 2
		System.out.println(Math.pow(5, 2));
	}
	//1. class = Rectangle, object = myRect, parameters passed are double and int respectively
	//2. public Rectangle(double x, int y)
	//3. Lunch yummy5 = new Lunch(True, 900);
	//4. class = BankAccount, object = account39, parameter passed is a double
	//5. a class is like a cookie cutter, an object is like a cookie
	//6. VOID is not specified in constructors, the signature should be the same as the name of the class (uppercase)
	//7. a
	//8. a
	//9. the constructor must have a signature that is the same as the name of the class
	//10. a. int, b. int, c. double
	//11. public BibleStory()
	//12. var1, var2, sss
	//13. public void Samson(double zorro), public String getDelilah(), public BibleStory(String x, int y, double z)
	//14. BibleStory philistine = new BibleStory("Ralph", 19, 24.18);
	//15. gravy.var2 = 106.9;
	//16. System.out.println(bart.sss);
	//17. String
	//18. public class Trail {
	//18. 	public int x;
	//18. 	public int y;
	//18. 	public String s;
	//18. 	
	//18. 	public Trail(String loopzoop) {
	//18. 		s = loopzoop;
	//18. 		x = 10;
	//18. 		y = 10;
	//18. 	}
	//18. 	public String met() {
	//18. 		int z = Integer.toString((x*y), 16);
	//18. 		return z;
	//18. 	}
	//18. }
	//19. zippo.peachyDandy(10);
	//20. 127.31 will be chopped down to 127 because the parameter is an int and not a double

}
