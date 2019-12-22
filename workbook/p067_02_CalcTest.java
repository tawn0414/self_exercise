package workbook;

public class p067_02_CalcTest {
	public static void main(String[] args) {
		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[2]);
		
		p067_02_Calculator obj = new p067_02_Calculator();
		System.out.println("°á°ú: "+obj.divide(num1, num2));
	}

}
