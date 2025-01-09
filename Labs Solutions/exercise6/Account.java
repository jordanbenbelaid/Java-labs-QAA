package exercise6;

public class Account {
	private int id;
	private String owner;
	private double balance;

	public Account(int id, String owner, double balance) {
		this.id = id;
		this.owner = owner;
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		if (amount < 0) {
			System.out.println("Cannot make negative deposite of " + amount);
			return;
		}
		balance += amount;
	}

	public void withdraw(double amount) {
		if (amount > balance) {
			throw new IllegalArgumentException("Not enough money in the account. You can withdraw £" + balance);
		}
		balance -= amount;
	}
	public String getDetails() {
		return "ID:" + id + ", Owner:" + owner + ", balance:" + balance;
	}
	
	public void close() {
		System.out.println("Closing account " + getDetails());
	}
	

}
