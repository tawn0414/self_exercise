package 인터페이스;
/*
 * 인터페이스 연습
 * <<인터페이스>>
 * => 추상메소드(상수포함)만 정의하는 특별한 클래스
 * 
 * 1. 인터페이스는 interface키워드를 이용해서 정의
 * 2. 인터페이스는 추상메소드만 정의하는 특별한 클래스
 *		- public abstract을 생략가능. 어차피 전부 추상메소드 들이니까
 * 		- 상속을 받으면 자동으로 추가된다.
 * 3. 인터페이스가 인터페이스를 상속할 수 있다. (extends를 이용)
 * 		- 하위인터페이스가 상위인터페이스의 추상메소드를 상속받는다.
 * 
 * 4. 클래스가 인터페이스를 상속할 수 있다. (implements 이용)
 * 		- 인터페이스를 상속받는 클래스가 이미 다른 클래스를 상속하는 경우에
 * 		  extends를 먼저 정의하고!!!!, implements를 정의해야 한다.
 * 5. 인터페이스를 여러 개 상속할 수 있다. 즉, 다중 상속이 가능하다.
 * 		implements 뒤에 인터페이스를 정의할 때 ","로 구분해서 나열
 * 
 * 6. 클래스와 인터페이스들을 상속받는 하위클래스는 모든 클래스와 인터페이스의 하위로 인식된다.
 * 		(상속받는 모든 클래스, 인터페이스의 하위 타입이 된다.)
 * 
 */
interface InterA{
	public abstract void test(); 
	void display(int num);
}

interface InterB extends InterA{
	void show();
} // InterB가 갖고있는 추상메소드는 총 3개 (InterA에서 2개, InterB에서 1개)

interface InterC {
	
}

class SuperA{
	
}

//SubA는 SuperA, InterA, InterB, InterC의 하위
class SubA extends SuperA implements InterB, InterC{
	// InterB가 갖고있는 추상메소드는 총 3개이므로 오버라이딩 전부 추가해서 해줘야한다. 
	
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
