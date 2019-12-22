package lecture;

public class CashPayment extends Payment{
	private String cashReceiptNumber;
	
	public CashPayment() {
		
	}

	public CashPayment(String shopName, String productName, long productPrice,String cashReceiptNumber) {
		super(shopName,productName,productPrice);
		this.cashReceiptNumber = cashReceiptNumber;
	}
	public String toString() {
		String result = "상점명 : "+super.getShopName()+"\n"+"상품명 : "+super.productName+"\n"+"상품가격 : "+super.productPrice+"\n"+"현금영수증번호 : "+this.cashReceiptNumber;
		return result;
	}
	public void pay() throws PayException{
		if(super.productPrice<=0) {
			throw new PayException("가격이 잘못되었습니다.");
		}else {
			System.out.println("현금이 정상적으로 지불되었습니다.");
			toString();
		}
	}
}