package chapter_02_class.practice_02_01;

/*
 * <2��. class> - �������� 1
 * User Ŭ���� �����ϱ�
 * 
 * �Ӽ�	-	id 		: String (����� ID)
 * 		-	pw 		: String (��й�ȣ)
 * 		-	name	: String (�̸�)
 * 
 * �޼ҵ�	-	add(id : String, pw : String, name : String) : boolnea
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
