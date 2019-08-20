package chapter_02_class.practice_02_03;

/*
 * <2장. class> - 연습문제 3
 * User 클래스 설계하기
 * 
 * 속성	-userId : String (사용자 ID)
 * 		-pw		: String (비밀번호)
 * 		-name	: String (이름)
 * 		-tel	: String (연락처)
 * 		-addr	: String (주소)
 * 
 * 메소드	+regist(userId : String, pw : String, name : String,
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
