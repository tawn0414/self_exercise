package workbook;

public class p070_04_AccountTest {
	public static void main(String[] args) {
		p070_04_Account obj = new p070_04_Account("441-0290-1203",500000,0.073);
		obj.print();
		try {
			obj.deposit(-10);
		}catch(Exception e) {
			System.out.println("입금 금액이 0보다 적습니다.");
		}
		
		try {
			obj.withdraw(600000);
		}catch(Exception e) {
			System.out.println("금액이 0보다 적거나 현재 잔액보다 많습니다.");
		}finally {
			System.out.println("이자: "+obj.calculateInterest());
		}
	}

}
