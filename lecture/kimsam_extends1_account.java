package lecture;

public class kimsam_extends1_account {
	private String accid;//°èÁÂ¹øÈ£
	private long balance;//ÀÜ¾×
	private String ownerName;
	
	public kimsam_extends1_account() {
		
	}

	public kimsam_extends1_account(String accid, long balance, String ownerName) {
		super();
		this.accid = accid;
		this.balance = balance;
		this.ownerName = ownerName;
	}

	public String getAccid() {
		return accid;
	}

	public void setAccid(String accid) {
		this.accid = accid;
	}

	public long getBalance() {
		return balance;
	}

	public void setBalance(long balance) {
		this.balance = balance;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	
	public void deposit(long amount) {
		this.balance = this.balance+amount;
	}
	
	public void withdraw(long amount) {
		this.balance = this.balance-amount;
	}

}
