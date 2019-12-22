package lecture;

public abstract class kimsam_polyex1_Content {
	private String title;
	private int price;
	
	public kimsam_polyex1_Content() {
		
	}
	public kimsam_polyex1_Content(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public abstract void totalPrice();
	
	public void show() {
		System.out.println(this.title+" 비디오의 가격은 "+this.price+" 원 입니다.");
	}
}
