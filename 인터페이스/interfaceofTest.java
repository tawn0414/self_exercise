package �������̽�;

/*
 * ��ü�� Ÿ���� �˻��ϰ� �۾��� �� �ִ�.
 * instanceof������ �̿�
 * 
 * 
 */

class A{

}
interface IA{
	
}


public class interfaceofTest {
	public static void main(String[] args) {
		SubA obj = new SubA();
		//����� �ϰ� �ִ� Ŭ������ Ÿ������ ����
		if(obj instanceof SuperA) { //SuperA Ÿ���̳�?
			System.out.println("SuperAŸ���̴�.");
		}else {
			System.out.println("SuperAŸ�� �ƴϴ�.");
		} 
		
		if(obj instanceof InterA) {
			System.out.println("InterAŸ���̴�.");
		}else {
			System.out.println("InterAŸ�� �ƴϴ�.");
		}
		
		if(obj instanceof InterB) {
			System.out.println("InterBŸ���̴�.");
		}else {
			System.out.println("InterBŸ�� �ƴϴ�.");
		}
		
		if(obj instanceof InterC) {
			System.out.println("InterCŸ���̴�.");
		}else {
			System.out.println("InterCŸ�� �ƴϴ�.");
		}
		
		if(obj instanceof IA) {
			System.out.println("IAŸ���̴�.");
		}else {
			System.out.println("IAŸ�� �ƴϴ�.");
		}
	
	
	

	}

}
