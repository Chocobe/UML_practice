package chapter_06_message.practice_06_01;

// Sequence Diagrame�� �ڵ�� ����

public class User {
	public boolean add(String id, String pw, 
					String name, String nationNumb) {
		if(name.equals("inha")) {
			return true;
			
		} else {
			return false;
		}
	}
}
