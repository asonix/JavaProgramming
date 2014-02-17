//Riley Trautman
//02.12.14

package proj15;

public class Tester {
	public static void main(String args[]) {
		System.out.println("Circle Project"); //This is the code for the circle project
		
		Circle cir1 = new Circle(35.5);
		System.out.println(cir1.diameter());
		
		System.out.println("Bank Project"); //This is the code for the bank account project
		
		//set values
		BankAccount myAccount = new BankAccount(1000, "Sally Jone");
		myAccount.deposit(505.22);
		
		System.out.println(myAccount.balance);
		
		myAccount.withdraw(100);
		System.out.print("The ");
		System.out.print(myAccount.name);
		System.out.print(" account balance is, $");
		System.out.print(myAccount.balance);
	}
}
