package chapter_03_instance.practice_03_02;

import java.util.ArrayList;

@SuppressWarnings("unused")
public class User {
	private String userId;
	private String pw;
	private String name;
	private String tel;
	private String addr;
	
	private Account account;
	
	public User(String userId, String pw, String name, 
					String tel, String addr, Account account) {
		this.userId = userId;
		this.pw = pw;
		this.name = name;
		this.tel = tel;
		this.addr = addr;
		this.account = account;
	}
	
	public boolean regist(String userId, String pw, String name, 
					String tel, String addr, Account account) {
		
		return true;
	}
	
	public boolean update(String userId, String pw, String name, 
					String tel, String addr, Account account) {
		
		return true;
	}
	
	public boolean delete(String userId, String pw) {
		
		return true;
	}
	
	public void checkInfo(String userId, String pw) {
				
	}
}
