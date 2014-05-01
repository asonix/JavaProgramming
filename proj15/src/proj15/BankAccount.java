//Riley Trautman
//02.12.14

package proj15;

public class BankAccount {
	public double balance;
	public String name;

	public BankAccount(double _balance, String _name) {
		balance = _balance;
		name = _name;
	}

	public void deposit(double amount) {
		balance += amount;
	}
	
	public void withdraw(double amount) {
		balance -= amount;
	}
}
