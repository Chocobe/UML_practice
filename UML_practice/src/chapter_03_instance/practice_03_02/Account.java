package chapter_03_instance.practice_03_02;

@SuppressWarnings("unused")
public class Account {
	private String accountNumber;
	private int balance;
	
	public Account(String accountNumber) {
		this(accountNumber, 0);
	}
	
	public Account(String accountNumber, int balance) {
		this.accountNumber = accountNumber;
		this.balance = balance;
	}
	
	public boolean deposit(int money) {
		int beforeBalance = this.balance;
		this.balance += money;
		
		if(this.balance == beforeBalance + money) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean withdraw(int money) {
		int beforeBalance = this.balance;
		this.balance -= money;
		
		if(this.balance == beforeBalance - money) {
			return true;
			
		} else {
			return false;
		}
	}
	
	public boolean transfer(String accountNumber, int money) {
		this.balance -= money;
		
		return true;
	}
	
	public int checkBalance() {
		return this.balance;
	}
}
