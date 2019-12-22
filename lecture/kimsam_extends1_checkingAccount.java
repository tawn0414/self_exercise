package lecture;

public class kimsam_extends1_checkingAccount extends kimsam_extends1_account{
	private String cardNo;
	
	public kimsam_extends1_checkingAccount() {
		
	}
	public kimsam_extends1_checkingAccount(String accid, String ownerName,long balance, String cardNo) {
		super(accid,balance,ownerName);
		this.cardNo = cardNo;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public void pay(String cardNo,long amount) {
		if (this.getCardNo().equals(cardNo) & amount<super.getBalance()) {
			long result = super.getBalance()-amount;
			setBalance(result);
		}else {
			System.out.println("지불이 불가능 합니다.");
		}
	}
}
