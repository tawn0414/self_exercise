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
		String result = "������ : "+super.getShopName()+"\n"+"��ǰ�� : "+super.productName+"\n"+"��ǰ���� : "+super.productPrice+"\n"+"���ݿ�������ȣ : "+this.cashReceiptNumber;
		return result;
	}
	public void pay() throws PayException{
		if(super.productPrice<=0) {
			throw new PayException("������ �߸��Ǿ����ϴ�.");
		}else {
			System.out.println("������ ���������� ���ҵǾ����ϴ�.");
			toString();
		}
	}
}