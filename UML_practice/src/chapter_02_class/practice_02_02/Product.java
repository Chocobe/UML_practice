package chapter_02_class.practice_02_02;

/*
 * <2장. class> - 연습문제 2
 * Product 클래스 설계하기
 * 
 * 속성	-productId	:	String	(제품번호)
 * 		-price		:	int		(가격)
 * 
 * 메소드	+addProduct(productId : String) : boolean
 * 		+deleteProduct(productId : String) : boolean
 * 		-checkProduct(productId : String) : boolean
 */

public class Product {
	private String productId;
	private int price = 0;
	
	public boolean addProduct(String productId) {
		
		return true;
	}
	
	public boolean deleteProduct(String productId) {
		
		return true;
	}
	
	private boolean checkProduct(String productId) {
		
		return true;
	}
}
