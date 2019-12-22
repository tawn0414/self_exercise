package lecture;

public class kimsam_polyex2_CoffeShop {
	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		kimsam_polyex2_Beverage[] beverage = new kimsam_polyex2_Beverage[5];
		beverage[0] = new kimsam_polyex2_Coffe("Cappuccino");
		beverage[1] = new kimsam_polyex2_Coffe("CafeLatte");
		beverage[2] = new kimsam_polyex2_Tea("ginsengTea");
		beverage[3] = new kimsam_polyex2_Coffe("CafeLatte");
		beverage[4] = new kimsam_polyex2_Tea("redginsengTea");
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>"+getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>"+kimsam_polyex2_Coffe.amount+"잔");
		System.out.println("Tea의 판매 개수=>"+kimsam_polyex2_Tea.amount+"잔");
	}
	//결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
		public static void getSalesInfo(kimsam_polyex2_Beverage[] beverage) {
			for(int i = 0; i<beverage.length;i++) {
				System.out.println((i+1)+" 번째");
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
	
	//결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
}
