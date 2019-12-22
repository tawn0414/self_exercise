package lecture;

public class CardPayment extends Payment{
	private String cardNumber;
	private String cardPassword;
	private int monthlyInstallment;
	
	public CardPayment() {
		
	}

	public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
		super(shopName,productName,productPrice);
		this.cardNumber = cardNumber;
		this.cardPassword = cardPassword;
		this.monthlyInstallment = monthlyInstallment;
	}

	public String getCardNumber() {
		return cardNumber;
	}

	public void setCardNumber(String cardNumber) {
		this.cardNumber = cardNumber;
	}

	public String getCardPassword() {
		return cardPassword;
	}

	public void setCardPassword(String cardPassword) {
		this.cardPassword = cardPassword;
	}

	public int getMonthlyInstallment() {
		return monthlyInstallment;
	}

	public void setMonthlyInstallment(int monthlyInstallment) {
		this.monthlyInstallment = monthlyInstallment;
	}
	public String toString() {
		String result = "상점명 : "+super.getShopName()+"\n"+"상품명 : "+super.productName+"\n"+"상품가격 : "+super.productPrice+"\n"+"신용카드번호 : "+this.cardNumber+"\n"+"할부개월 : "+this.monthlyInstallment;
		return result;
	}
	public void pay() throws PayException{
		if(super.productPrice<=0 | this.monthlyInstallment<0) {
			throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
		}else {
			System.out.println("신용카드가 정상적으로 지불되었습니다.");
			toString();
		}
	}
}
