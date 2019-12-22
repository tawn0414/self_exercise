package workbook;

public class p047_05_AccountTest {
	public static void main(String[] args) {
		p047_05_Account obj = new p047_05_Account("441-0290-1203",500000,0.073);
		obj.print();
		obj.deposit(20000);
		obj.print();
		System.out.println("¿Ã¿⁄: "+obj.calculateInterest());

	}

}
