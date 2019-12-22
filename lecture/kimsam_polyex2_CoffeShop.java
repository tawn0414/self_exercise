package lecture;

public class kimsam_polyex2_CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop��������****");
		kimsam_polyex2_Beverage[] beverage = new kimsam_polyex2_Beverage[5];
		beverage[0] = new kimsam_polyex2_Coffe("Cappuccino");
		beverage[1] = new kimsam_polyex2_Coffe("CafeLatte");
		beverage[2] = new kimsam_polyex2_Tea("ginsengTea");
		beverage[3] = new kimsam_polyex2_Coffe("CafeLatte");
		beverage[4] = new kimsam_polyex2_Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("�� �Ǹ� �ݾ�==>"+getTotalPrice(beverage));
		System.out.println("Coffe�� �Ǹ� ����=>"+kimsam_polyex2_Coffe.amount+"��");
		System.out.println("Tea�� �Ǹ� ����=>"+kimsam_polyex2_Tea.amount+"��");
	}
	//����� ���� ������ ���ϰ� �Ǹ������� ����� �� �ֵ��� getSalesInfo�޼ҵ带 �ۼ��ϼ���
		public static void getSalesInfo(kimsam_polyex2_Beverage[] beverage) {
			for(int i = 0; i<beverage.length;i++) {
				System.out.println((i+1)+" ��°");
				beverage[i].print();
			}
				
		}
		public static int getTotalPrice(kimsam_polyex2_Beverage[] beverage) {
			int total = 0;
			for(int i = 0 ;i<beverage.length;i++) {
				total = total + beverage[i].getPrice();
			}
			
			return total;
		}
	
	//����� ���� �� �Ǹűݾ��� ���� �� �ֵ��� getTotalPrice�޼ҵ带 �ۼ��ϼ���.
}
