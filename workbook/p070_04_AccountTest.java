package workbook;

public class p070_04_AccountTest {
	public static void main(String[] args) {
		p070_04_Account obj = new p070_04_Account("441-0290-1203",500000,0.073);
		obj.print();
		try {
			obj.deposit(-10);
		}catch(Exception e) {
			System.out.println("�Ա� �ݾ��� 0���� �����ϴ�.");
		}
		
		try {
			obj.withdraw(600000);
		}catch(Exception e) {
			System.out.println("�ݾ��� 0���� ���ų� ���� �ܾ׺��� �����ϴ�.");
		}finally {
			System.out.println("����: "+obj.calculateInterest());
		}
	}

}
