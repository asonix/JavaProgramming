//Riley Trautman
//2.17.14
public class Recipe {
	public Recipe(String theName) {
		name = theName;
	}
	public void setServings(int x) {
		//unused
	}
	public double getRetailCost() {
		int x = 13;
		double tempCost = pricePerCalorie(x) * calories + cost;
		return tempCost;
	}
	
	private double pricePerCalorie(int z) {
		return 0.0; //unused
	}
	
	public int calories;
	public int carbs;
	public int fat;
	public String name;
	
	private double cost;
}
