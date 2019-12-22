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
		String result = "������ : "+super.getShopName()+"\n"+"��ǰ�� : "+super.productName+"\n"+"��ǰ���� : "+super.productPrice+"\n"+"�ſ�ī���ȣ : "+this.cardNumber+"\n"+"�Һΰ��� : "+this.monthlyInstallment;
		return result;
	}
	public void pay() throws PayException{
		if(super.productPrice<=0 | this.monthlyInstallment<0) {
			throw new PayException("�����̳� �Һΰ������� �߸��Ǿ����ϴ�.");
		}else {
			System.out.println("�ſ�ī�尡 ���������� ���ҵǾ����ϴ�.");
			toString();
		}
	}
}
