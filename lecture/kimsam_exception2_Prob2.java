package lecture;
public class kimsam_exception2_Prob2 {
	public static void main(String[] args) {
		try {
			BankCustomer customer = new BankCustomer("ȫ�浿", 100);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(70);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());			
			customer.withdraw(50);
			System.out.println("���� �ܾ� : " + customer.getCurrentMoney());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
class BankCustomer{
	String name;//���̸�
	int currentMoney;//���� �ܾ�
	
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
			throw new IllegalArgumentException("�ܾ��� �����Ͽ� ������ �� �����ϴ�.");
		}else {
			this.currentMoney = this.currentMoney-money;
		}
	}
}

