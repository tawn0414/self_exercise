package lecture;

public class kimsam_polyex2_Coffe extends kimsam_polyex2_Beverage{
	static int amount;
	
	public kimsam_polyex2_Coffe() {
		
	}
	public kimsam_polyex2_Coffe(String name) {
		super(name);
		amount++;
		calcPrice();
	}
	
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public void calcPrice() {
		int price = 0;
		if (super.getName().equals("Americano")) {
			setPrice(1500);
		}else if(super.getName().equals("CafeLatte")) {
			setPrice(2500);
		}else if(super.getName().equals("Cappuccino")) {
			setPrice(3000);
		}
	}
}
