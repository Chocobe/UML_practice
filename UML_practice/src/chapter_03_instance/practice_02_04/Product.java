package chapter_03_instance.practice_02_04;

@SuppressWarnings("unused")
class TV_test {
	public static void main(String[] args) {
		Product TV = new Product("TV2008005", "LCDTV", "º¸¸£µµ");
		
	}
}

@SuppressWarnings("unused")
public class Product {
	private String productId;
	private String productName;
	private String brandName;
	
	public Product(
					String productId, String productName, String brandName) {
		this.productId = productId;
		this.productName = productName;
		this.brandName = brandName;
	}
}
