package chapter_02_class.practice_02_03;

/*
 * <2��. class> - �������� 3
 * Account Ŭ���� �����ϱ�
 * 
 * �Ӽ�	-accountNumber	: String (���¹�ȣ)
 * 		-balance 		: int (�ܾ�)
 * 
 * �޼ҵ�	+deposit(money : int) : int
 * 		+withdraw(money : int) : int
 * 		+transfer(accountNumber : String, money : int) : boolean
 * 		+checkBalance() : int 
 */

public class Account {
	private String accountNumber;
	private int balance;
	
	public int deposit(int money) {
		
		return 1;
	}
	
	public int withdraw(int money) {
		
		return 0;
	}
	
	public boolean transfer(String accountNumber, int money) {
		
		return true;
	}
	
	public int checkBalance() {
		
		return 1;
	}
}
