package workbook;

public class p060_05_MobileTest {
	public static void main(String[] args) {
		p060_05_Ltab obj1 = new p060_05_Ltab("Ltab",500,"AP-01");
		p060_05_Otab obj2 = new p060_05_Otab("Otab",1000,"AND-20");
		System.out.println("Mobile\tbattery\tOs");
		System.out.println("--------------------");
		obj1.print();
		obj2.print();
		System.out.println();
		System.out.println("10분 충전");
		System.out.println("Mobile\tbattery\tOs");
		System.out.println("--------------------");
		obj1.charge(10);
		obj2.charge(10);
		obj1.print();
		obj2.print();
		System.out.println();
		System.out.println("5분 통화");
		System.out.println("Mobile\tbattery\tOs");
		System.out.println("--------------------");
		obj1.operate(5);
		obj2.operate(5);
		obj1.print();
		obj2.print();
	}

}
