package chapter_02_class.practice_02_03;

/*
 * <2��. class> - �������� 3
 * User Ŭ���� �����ϱ�
 * 
 * �Ӽ�	-userId : String (����� ID)
 * 		-pw		: String (��й�ȣ)
 * 		-name	: String (�̸�)
 * 		-tel	: String (����ó)
 * 		-addr	: String (�ּ�)
 * 
 * �޼ҵ�	+regist(userId : String, pw : String, name : String,
 * 			    	name : String, tel : String, addr : String) : boolean
 * 		+update(userId : String, pw : String, name : String,
 * 					name : String, tel : String, addr : String) : boolean
 * 		+delete(userId : String, pw : String) : boolean
 * 		+check(userId : String, pw : String)
 */

public class User {
	private String userId;
	private String pw;
	private String name;
	private String tel;
	private String addr;
	
	public boolean regist(String userId, String pw, String name,
					String tel, String addr) {
		
		return true;
	}
	
	public boolean update(String userId, String pw, String name,
					String tel, String addr) {
		
		return true;
	}
	
	public boolean delete(String userId, String pw) {
		
		return true;
	}
	
	public void check(String userId, String pw) {
		
	}
}
