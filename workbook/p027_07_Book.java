package workbook;

public class p027_07_Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	
	public p027_07_Book() {
		
	}

	public p027_07_Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public double getBookDiscountRate() {
		return bookDiscountRate;
	}

	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getDiscountBookPrice() { 
		return this.bookPrice-this.bookPrice*this.bookDiscountRate;
	}
	
	public void print() {
		System.out.print(this.bookName+","+this.bookPrice+"¿ø,"+this.bookDiscountRate+"%"+getDiscountBookPrice());
	}
}
