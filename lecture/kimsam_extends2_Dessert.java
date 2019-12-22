package lecture;

public class kimsam_extends2_Dessert {
	private String productName;//상품명
	private int price;//금액
	private int count;//수량
	
	public kimsam_extends2_Dessert() {
		
	}

	public kimsam_extends2_Dessert(String productName, int price, int count) {
		super();
		this.productName = productName;
		this.price = price;
		this.count = count;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCount() {
		return count;
	}

	public void setCount(int count) {
		this.count = count;
	}
	public int getTotalPrice() {
		int result = this.count * this.price;
		return result;
	}
	public void print() {
		System.out.println("==============================");
		System.out.println("주문항목"+"\t"+"가격"+"\t"+"수량");
		System.out.println("==============================");
	}
	public void printProductInfo() {
		System.out.println(this.productName+"\t"+this.price+"\t"+this.count);
	}
}
