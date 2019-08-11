package chapter_05_information_hiding.practice_05_04;

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
	
	public boolean checkInfo(String userId, String pw) {
		
		return true;
	}
}
