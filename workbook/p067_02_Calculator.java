package workbook;

public class p067_02_Calculator {
	public double divide(int a, int b) {
		double result =0.0;
		try {
			result = a/b;
		}catch(ArithmeticException e) {
			System.out.println("Exception�� �߻� �Ͽ����ϴ�. �ٽ� �Է��� �ּ���");
		}
		return result;
	}
}
