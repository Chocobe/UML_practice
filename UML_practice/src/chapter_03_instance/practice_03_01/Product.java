package chapter_03_instance.practice_03_01;

@SuppressWarnings("unused")
class TV_test {
	public static void main(String[] args) {
		Product TV = new Product("TV2008005", "LCDTV", "보르도");
		
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
