package lecture;

public class kimsam_polyex2_Tea extends kimsam_polyex2_Beverage{
	static int amount;
	
	public kimsam_polyex2_Tea() {
		
	}
	public kimsam_polyex2_Tea(String name) {
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
		if (super.getName().equals("lemonTea")) {
			super.setPrice(1500);
		}else if(super.getName().equals("ginsengTea")) {
			super.setPrice(2000);
		}else if(super.getName().equals("redginsengTea")) {
			super.setPrice(2500);
		}
	}
}

