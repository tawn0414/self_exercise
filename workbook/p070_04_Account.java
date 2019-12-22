package workbook;

public class p070_04_Account {
	private String account;
	private double balance;
	private double interestRate;
	
	public p070_04_Account() {
		
	}

	public p070_04_Account(String account, double balance, double interestRate) {
		super();
		this.account = account;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	public double calculateInterest() {
		double result = this.balance*this.interestRate;
		return result;
	}
	public void deposit(double money) throws Exception{
		if(money<0) {
			throw new Exception();
		}
	}
	public void withdraw(double money) throws Exception{
		if(money<0 | money>this.balance) {
			throw new Exception();
		}
	}
	public void print() {
		System.out.println("∞Ë¡¬¡§∫∏: "+this.account+" "+this.balance+" "+this.interestRate);
	}
}
