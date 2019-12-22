package workbook;

public class p047_05_Account {
	private String account;
	private int balance;
	private double interestRate;
	
	public p047_05_Account() {
		
	}

	public p047_05_Account(String account, int balance, double interestRate) {
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

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
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
	
	public void deposit(int money) {
		int result = this.balance+money;
		setBalance(result);
	}
	
	public void withdraw(int money) {
		int result = this.balance-money;
		setBalance(result);
	} 
	
	public void print() {
		System.out.println("°èÁÂÁ¤º¸: "+getAccount()+" ÇöÀçÀÜ¾×: "+getBalance());
	}
}
