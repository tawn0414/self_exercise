package �������̽�;
/*
 * �������̽� ����
 * <<�������̽�>>
 * => �߻�޼ҵ�(�������)�� �����ϴ� Ư���� Ŭ����
 * 
 * 1. �������̽��� interfaceŰ���带 �̿��ؼ� ����
 * 2. �������̽��� �߻�޼ҵ常 �����ϴ� Ư���� Ŭ����
 *		- public abstract�� ��������. ������ ���� �߻�޼ҵ� ���̴ϱ�
 * 		- ����� ������ �ڵ����� �߰��ȴ�.
 * 3. �������̽��� �������̽��� ����� �� �ִ�. (extends�� �̿�)
 * 		- �����������̽��� �����������̽��� �߻�޼ҵ带 ��ӹ޴´�.
 * 
 * 4. Ŭ������ �������̽��� ����� �� �ִ�. (implements �̿�)
 * 		- �������̽��� ��ӹ޴� Ŭ������ �̹� �ٸ� Ŭ������ ����ϴ� ��쿡
 * 		  extends�� ���� �����ϰ�!!!!, implements�� �����ؾ� �Ѵ�.
 * 5. �������̽��� ���� �� ����� �� �ִ�. ��, ���� ����� �����ϴ�.
 * 		implements �ڿ� �������̽��� ������ �� ","�� �����ؼ� ����
 * 
 * 6. Ŭ������ �������̽����� ��ӹ޴� ����Ŭ������ ��� Ŭ������ �������̽��� ������ �νĵȴ�.
 * 		(��ӹ޴� ��� Ŭ����, �������̽��� ���� Ÿ���� �ȴ�.)
 * 
 */
interface InterA{
	public abstract void test(); 
	void display(int num);
}

interface InterB extends InterA{
	void show();
} // InterB�� �����ִ� �߻�޼ҵ�� �� 3�� (InterA���� 2��, InterB���� 1��)

interface InterC {
	
}

class SuperA{
	
}

//SubA�� SuperA, InterA, InterB, InterC�� ����
class SubA extends SuperA implements InterB, InterC{
	// InterB�� �����ִ� �߻�޼ҵ�� �� 3���̹Ƿ� �������̵� ���� �߰��ؼ� ������Ѵ�. 
	
	@Override
	public void test() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void display(int num) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void show() {
		// TODO Auto-generated method stub
		
	} 
	
	
}
public class interfaceTest01 {
	public static void main(String[] args) {
		SuperA obj1 = new SubA();
		InterA obj2 = new SubA();
		InterB obj3 = new SubA();
		InterC obj4 = new SubA();

	}
}
