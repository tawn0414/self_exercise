package lecture;


public class kimsam_extends2_DessertTest {
	public static void main(String[] args){
		kimsam_extends2_Dessert coffee = new kimsam_extends2_Dessert("아메리카노",4500,5);
		kimsam_extends2_Dessert tea = new kimsam_extends2_Dessert("허브티",3800,1);
		kimsam_extends2_IceCream ice = new kimsam_extends2_IceCream("나뚜르", 5000, 2, 310);
		
		System.out.println("*****매 출 전 표 ***** ");
		ice.print();
		coffee.printProductInfo();
		tea.printProductInfo();
		System.out.println();
		
		ice.print();
		ice.printProductInfo();
		
		int sum = coffee.getTotalPrice()
				  + tea.getTotalPrice()
				  + ice.getTotalPrice();
		
		System.out.println();
		System.out.println("*** 총금액 " + sum + "원 ***");
		
	}
}
