package chapter_02_class.practice_02_03;

/*
 * <2장. class> - 연습문제 3
 * Account 클래스 설계하기
 * 
 * 속성	-accountNumber	: String (계좌번호)
 * 		-balance 		: int (잔액)
 * 
 * 메소드	+deposit(money : int) : int
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
