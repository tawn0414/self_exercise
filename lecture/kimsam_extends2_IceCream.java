package lecture;

public class kimsam_extends2_IceCream extends kimsam_extends2_Dessert{
	private int calorie;//칼로리
	
	public kimsam_extends2_IceCream() {
		
	}

	public kimsam_extends2_IceCream(String productName, int price, int count, int calorie) {
		super(productName, price, count);
		this.calorie = calorie;
	}

	public int getCalorie() {
		return calorie;
	}

	public void setCalorie(int calorie) {
		this.calorie = calorie;
	}
	public void print() {
		System.out.println("==============================");
		System.out.println("주문항목"+"\t"+"가격"+"\t"+"수량"+"\t"+"칼로리");
		System.out.println("==============================");
	}
	public void printProductInfo() {
		System.out.println(super.getProductName()+"\t"+super.getPrice()+"\t"+super.getCount()+"\t"+this.calorie+"kcal");
	}
}
