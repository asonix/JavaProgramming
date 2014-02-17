//Riley Trautman
//02.12.14

package proj15;

public class Circle {
	//constructor
	public Circle(double r) { //constructor's signature is class's name capitalized, constructors are always public, method is VOID because nothing is returned, however, VOID need not be specified
		radius = r;
	}
	
	//methods
	public double area() { //"public double area()" is the "Signature" of the method, methods typically have lowercase names
		double a = Math.PI*radius*radius;
		return a;
	}

	public double circumference() {
		double c = 2*Math.PI*radius;
		return c;
	}

	public void setRadius(double nr) { //void means no value is returned
		radius = nr;
	}


	public double diameter() {
		double d = radius*2;
		return d;
	}
	
	public double radius; //State Variable
}
