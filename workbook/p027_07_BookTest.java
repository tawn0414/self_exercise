package workbook;

public class p027_07_BookTest {
	public static void main(String[] args) {
		p027_07_Book[] arr = new p027_07_Book[3];
		arr[0] = new p027_07_Book("SQL Plus",50000,0.05);
		arr[1] = new p027_07_Book("Java 2.0",40000,0.03);
		arr[2] = new p027_07_Book("JSP Servlet",60000,0.06);
		
		for(int i=0; i<arr.length;i++) {
			arr[i].print();
			System.out.println();
		}
		System.out.println();
		int sum1 = arr[0].getBookPrice()+arr[1].getBookPrice()+arr[2].getBookPrice();
		double sum2 = arr[0].getDiscountBookPrice()+arr[1].getDiscountBookPrice()+arr[2].getDiscountBookPrice();
		System.out.println("책 가격의 합: "+sum1);
		System.out.println("할인된 책 가격의 합: "+sum2);
	}

}
