//Riley Trautman
//2.17.14
public class Automobile {
	public double mpg;
	public double gallons;
	
	public Automobile(double _mpg) {
		mpg = _mpg;
		gallons = 0;
	}
	public void fillUp(double _gallons) {
		gallons = _gallons;
	}
	public void takeTrip(double _miles) {
		if(gallons - _miles/mpg < 0) {
			gallons = 0;
			System.out.println("You can't drive that far");
		}
		else {
			gallons -= _miles/mpg;
		}
	}
	public double reportFuel() {
		return gallons;
	}
}
