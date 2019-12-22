package lecture;

public abstract class kimsam_polyex2_Beverage {
	private String name;
	int price;
	
	public kimsam_polyex2_Beverage() {
		
	}
	public kimsam_polyex2_Beverage(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public abstract void calcPrice();
	
	public void print() {
		System.out.println(" 음료는"+getName()+"이며,가격은"+getPrice());
	}
}
