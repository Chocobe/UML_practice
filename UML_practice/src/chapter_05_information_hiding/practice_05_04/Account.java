package chapter_05_information_hiding.practice_05_04;

public class Account {
	private String accountNumber;
	private int balance;
	
	public boolean deposit(int money) {
		this.balance += money;
		
		return true;
	}
	
	public boolean withdraw(int money) {
		balance -= money;
		return true;
	}
	
	public int checkBalance() {
		return this.balance;
	}
}
