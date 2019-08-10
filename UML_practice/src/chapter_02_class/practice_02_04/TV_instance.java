package chapter_02_class.practice_02_04;

@SuppressWarnings("unused")
class TV_test {
	public static void main(String[] args) {
		TV_instance TV = new TV_instance("TV2008005", "LCDTV", "º¸¸£µµ");
		
	}
}

@SuppressWarnings("unused")
public class TV_instance {
	private String productId;
	private String productName;
	private String brandName;
	
	public TV_instance(
					String productId, String productName, String brandName) {
		this.productId = productId;
		this.productName = productName;
		this.brandName = brandName;
	}
}
