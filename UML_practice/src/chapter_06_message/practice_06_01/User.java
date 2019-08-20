package chapter_06_message.practice_06_01;

// Sequence Diagrame을 코드로 구현

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
