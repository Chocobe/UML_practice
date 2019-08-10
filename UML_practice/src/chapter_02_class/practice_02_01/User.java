package chapter_02_class.practice_02_01;

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
