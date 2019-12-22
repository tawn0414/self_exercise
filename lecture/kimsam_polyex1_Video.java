package lecture;

public class kimsam_polyex1_Video extends kimsam_polyex1_Content{
	private String genre;
	
	public kimsam_polyex1_Video() {
		
	}
	public kimsam_polyex1_Video(String title, String genre) {
		super(title);
		this.genre = genre;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public void totalPrice() {
		int price = 0;
		if (this.getGenre().equals("new")) {
			price = 2000;
			super.setPrice(price);
		}else if(this.getGenre().equals("comic")) {
			price = 1500;
			super.setPrice(price);
		}else if(this.getGenre().equals("child")) {
			price = 1000;
			super.setPrice(price);
		}else {
			price = 500;
			super.setPrice(price);
		}
	}
	
}
