package chapter_03_instance.practice_03_02;

@SuppressWarnings("unused")
public class Practice_03_02_tester {
	public static void main(String[] args) {	
		Account onlineUserAccount = new Account("1234-56-789", 100000);
		
		User onlineBankUser = new User("hong", "123", 
						"È«±æµ¿", "123-1234", "¼­¿ï", onlineUserAccount);
	}
}
