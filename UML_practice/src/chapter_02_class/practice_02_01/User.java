package chapter_02_class.practice_02_01;

/*
 * <2장. class> - 연습문제 1
 * User 클래스 설계하기
 * 
 * 속성	-	id 		: String (사용자 ID)
 * 		-	pw 		: String (비밀번호)
 * 		-	name	: String (이름)
 * 
 * 메소드	-	add(id : String, pw : String, name : String) : boolnea
 * 		-	delete(id : String, pw : String) : boolean
 * 		-	update(id : String, pw : String, name : String) : boolean
 * 		-	list(id : String, pw : String, name : String) : Vector<String>
 */

import java.util.Vector;

public class User {
	public String id;
	public String pw;
	public String name;
	
	public void add(String id, String pw, String name) {
		
	}
	
	public Boolean delete(String id, String pw) {
		
		return true;
	}
	
	public Boolean update(String id, String pw, String name) {
		
		return true;
	}
	
	public Vector<String> list(String id, String pw, String name) {
		
		return new Vector<String>();
	}
}
