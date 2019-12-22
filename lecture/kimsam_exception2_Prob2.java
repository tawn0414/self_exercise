package lecture;
public class kimsam_exception2_Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("홍길동", 100);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("현재 잔액 : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
class BankCustomer{
	String name;//고객이름
	int currentMoney;//현재 잔액
	
public BankCustomer() {
		
	}

	public BankCustomer(String name, int currentMoney) {
		super();
		this.name = name;
		this.currentMoney = currentMoney;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCurrentMoney() {
		return currentMoney;
	}

	public void setCurrentMoney(int currentMoney) {
		this.currentMoney = currentMoney;
	}
	public void withdraw(int money) {
		if(this.currentMoney<money) {
			throw new IllegalArgumentException("잔액이 부족하여 인출할 수 없습니다.");
		}else {
			this.currentMoney = this.currentMoney-money;
		}
	}
}

